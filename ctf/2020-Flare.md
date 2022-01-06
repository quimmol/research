# 1 - Fidler


For the first task the sample is a executable built with python, we can see some code .py, opening the file it checks for a password:

![d650aa20e8fc6f7a67b8fd48e498c38e.png](:/7b5796fd2b6747c3aa356d2bf14a82cd)

So we check the code to see if there is some checks:

```
def password_check(input):
    altered_key = 'hiptu'
    key = ''.join([chr(ord(x) - 1) for x in altered_key])
    return input == key
```

Simply check the decimal character from "hiptu" and substract 1 then we got the password, "ghost".

![84cbbcfc582ba5714b757827542e84ba.png](:/f500de7185304f8d9bfd5b2818c1b490)

Now, it seems that is a counter 1 coin - 1 second, you can buy more couns per second, so i just keep adding 10, 100, 1000, 10000, 100000 and wait to reach 100 Billion coins so i went to the beach :)

![a6618419f3e75230436d85fb3a434fd4.png](:/f84fb0f108d14badb1c4eaa1b5d6b5a5)

**FLAG**: idle_with_kitty@flare-on.com


# 2 - Garbage

We got a malformed executable that we cant run, also is packed with upx. If we check the header we can see that the relocation table 

![5d61115565edfa0cdccac0b905367cbe.png](:/52fced9b2f494f868fca22614c399c90)
*View with PE-Bear*

Also if you check it with Exeinfope, it detect an overlay:

![2741297abd76677e6ca07a156dddabf0.png](:/5bb9883a1b594e7f8372b64431ab4c54)

We can do 2 things simply add 0s to the file to complete it or trunk it with Exeinfope:

![b9d75242eb7c36798cd5f27b9e03d598.png](:/eca784172dfc4ef8b003bf88d802be57)
*Original garbage.exe, view with BinaryNinja*

![e6da77fd4db323530585cca10d893c80.png](:/b6f80c46653247f3b949c7d023bf7e54)
*New file trunkated with Exeinfope, view with BinaryNinja*

Now we can simply use upx -d garbage_noOVL.exe to unpack the file.

If we open the file on IDA, there are some calls that fail so if we check it with radare2 (is smarter and always wins)we can see the calls. Thanks to @arnaugramez for pointing out the use of radare2+ESIL on this tweet (https://twitter.com/arnaugamez/status/1304810171059798016, with ESIL we can emulate the memory movements and operations to get the swag.

![f2d4105a451841262c0dbc48062349b0.png](:/8c0bdbabb8cc488ba08ad7ba4fd86b1f)

```python
"""
Solution to level 2 Garbage from 2020.flare-on.com

r2commands:
s 0x0040106B
aeim
aesu 0x00401160
afvd

s 0x0040116c
aeip
aesu 0x004011ad
.afvd lpFileName
"""

import sys
import r2pipe

# Open the radare2 pipe
r = r2pipe.open()
r.cmd('aaa')
# Setting up the environment for ESIL 
r.cmd('e asm.emu=true')
r.cmd('e asm.esil=true')

# Seek to the first instruction on the main function
r.cmd('s 0x0040106B')
# Setup the emulator registers and memory space, EIP point by default to the actual address
r.cmd('aeim')
# Step until the instruction before the CreateFile to emulate all the variables
r.cmd('aesu 0x00401160')
# Seek the next instruction from CreateFile (ESIL cant emulate Windows functions)
r.cmd('s 0x0040116c')
# Set the new EIP
r.cmd('aeip')
# Step until the instruction before the WriteFile 
r.cmd('aesu 0x004011ad')
# Obtain the lpFileName with the swag
r.cmd('.afvd lpFileName')
```

 To resolve the problem basically what we do is seek to the first instruction on the main function, run it until the instruction before the first api call (EMULATE != DEBUG) seek to the instruction next to the api call and repeat until the WriteFile call.

 Checking the variable lpFileName will give you the swag.

**FLAG**: C0rruptGarbag3@flare-on.com

Res: 
https://blog.xpnsec.com/radare2-using-emulation-to-unpack-metasploit-encoders/
https://blog.superponible.com/2017/04/15/emulating-assembly-in-radare2/
https://www.youtube.com/watch?v=MaFafykTASw


# 3 - wednesday

This one is a game were you need to be the wednesday (middle) through boxes with the initial letters from the days.

Sunday5
Monday
Tuesday
**Dude**
Thursday
Friday
Saturday

You can go UP or DOWN but always being in the middle.

![6756d6ddc544c19dbad9809b87f17bd4.png](:/5da9977a14334879a8330d7a7da53953)
*This case the box is Monday so we must press Down*

In order to crack the game im gonna use Frida to script the press Down/Up depending wich box is in front.

First of all i use the PIN Tracer tool to trace all the functions and store it on a txt file for further inspection.

![318fc68ccf6ddde6f80e61612fd7b67b.png](:/19bfe05660d542f99fa52e03ff27a86e)

After that we can check this script from frida.

```
from __future__ import print_function
import frida
import sys

def on_message(message, data):
    print("[%s] => %s" % (message, data))

def main(target_process):
    session = frida.attach(target_process)

    script = session.create_script("""

    // Find base address from sdl2.dll 
    var baseAddr = Module.findBaseAddress('SDL2.dll');
    console.log('sdl2.dll baseAddr: ' + baseAddr);

    var GetKeyboardState = Module.findExportByName("SDL2.dll","SDL_GetKeyboardState");
	
    Interceptor.attach(GetKeyboardState, { // Intercept calls to our SetAesDecrypt function

        // When function is called, print out its parameters
        onEnter: function (args) {
            console.log('');
            console.log('[+] Called SDL_GetKeyboardState' + GetKeyboardState);
            console.log('[+] Ctx: ' + args[0]);
            console.log('[+] Input: ' + args[1]); // Plaintext
            console.log('[+] Output: ' + args[2]); // This pointer will store the de/encrypted data
            console.log('[+] Len: ' + args[3]); // Length of data to en/decrypt
            dumpAddr('Input', args[1], args[3].toInt32());
            this.outptr = args[2]; // Store arg2 and arg3 in order to see when we leave the function
            this.outsize = args[3].toInt32();
        },

        // When function is finished
        onLeave: function (retval) {
            dumpAddr('Output', this.outptr, this.outsize); // Print out data array, which will contain de/encrypted data as output
            console.log('[+] Returned from sdl2.GetKeyboardState: ' + retval);
        }
    });

    function dumpAddr(info, addr, size) {
        if (addr.isNull())
            return;

        console.log('Data dump ' + info + ' :');
        var buf = addr.readByteArray(size);

        // If you want color magic, set ansi to true
        console.log(hexdump(buf, { offset: 0, length: size, header: true, ansi: false }));
    }
""")
    script.on('message', on_message)
    script.load()
    print("[!] Ctrl+D on UNIX, Ctrl+Z on Windows/cmd.exe to detach from instrumented program.\n\n")
    sys.stdin.read()
    session.detach()

if __name__ == '__main__':
    main("mydude.exe")
```

Thanks to @sanguinavawer to help me dont loose my mind

Find the obstacle matrix and decode it

0043EB40

![9a4edb0656b2e8debda74502e420e859.png](:/8de3b45769dc4397a78c35fe5ae7233b)
*The first 100(10@ bytes are not part from the flag*

After that we can grab the binary and parse it to cyberchef to get the flag: 

https://gchq.github.io/CyberChef/#recipe=From_Binary('Space')&input=MDAxMTAwMDEwMTExMDEwMDAxMDExMTExMDExMDEwMDEwMDExMDEwMTAxMDExMTExMDExMTAxMTEwMTAwMDEwMTAxMTAwMTAwMDExMDExMTAwMDExMDAxMTAxMTEwMDExMDExMDAxMDAwMDExMDEwMDAxMTExMDAxMDEwMTExMTEwMTEwMTEwMTAxMDExMDAxMDEwMTExMTEwMTAwMDEwMDAxMTEwMTAxMDExMDAxMDAwMDExMDAxMTAxMTEwMDExMDEwMDAwMDAwMTEwMDExMDAxMTAxMTAwMDExMDAwMDEwMTExMDAxMDAxMTAwMTAxMDAxMDExMDEwMTEwMTExMTAxMTAxMTEwMDAxMDExMTAwMTEwMDAxMTAxMTAxMTExMDExMDExMDExMDAxMA


**FLAG**: 1t_i5_wEdn3sd4y_mY_Dud3s@flare-on.com

##NExt

This one seems is a vbs macro on a xls document, so we can grab the vba object with the officemalscanner to check the code: 

```

`Collection of strings: 
€9655B040B64667238524D15D6201.B95D4E01C55CC562C7557405A532D768C55FA12DD074DC697A06E172992CAF3F8A5C7306B7476B38.C555AC40A7469C234424.853FA85C470699477D3851249A4B9C4E.A855AF40B84695239D24895D2101D05CCA62BE5578055232D568C05F902DDC74D2697406D7724C2CA83FCF5C2606B547A73898246B4BC14E941F9121D464D263B947EB77D36E7F1B8254.853FA85C470699477D3851249A4B9C4E.9A55B240B84692239624.CC55A940B44690238B24CA5D7501CF5C9C62B15561056032C468D15F9C2DE374DD696206B572752C8C3FB25C3806.A8558540924668236724B15D2101AA5CC362C2556A055232AE68B15F7C2DC17489695D06DB729A2C723F8E5C65069747AA389324AE4BB34E921F9421.CB55A240B5469B23.AC559340A94695238D24CD5D75018A5CB062BA557905A932D768D15F982D.D074B6696F06D5729E2CAE3FCF5C7506AD47AC388024C14B7C4E8F1F8F21CB64
-------------------------------------------------------------------------------
VBA FORM STRING IN 'C:\\Users\\jack\\Desktop\\report.xls' - OLE stream: u'_VBA_PROJECT_CUR/F/o'
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
Tahoma
-------------------------------------------------------------------------------
VBA FORM STRING IN 'C:\\Users\\jack\\Desktop\\report.xls' - OLE stream: u'_VBA_PROJECT_CUR/F/o'
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
H€,„p
-------------------------------------------------------------------------------
VBA FORM STRING IN 'C:\\Users\\jack\\Desktop\\report.xls' - OLE stream: u'_VBA_PROJECT_CUR/F/o'
58c7661f00634702555f664b7756884c864edc4fef2d9c48881bac0911082214334e424f552f661d7752ce41d54deb70e9468949892db745545270fc333c44aa5525634f772d88699970983b8b18fe1eed3aba1d584c7632017....

Function rigmarole(es As String) As String
    Dim furphy As String
    Dim c As Integer
    Dim s As String
    Dim cc As Integer
    furphy = ""
    For i = 1 To Len(es) Step 4
        c = CDec("&H" & Mid(es, i, 2))
        s = CDec("&H" & Mid(es, i + 2, 2))
        cc = c - s
        furphy = furphy + Chr(cc)
    Next i
    rigmarole = furphy
End Function

Function folderol()
    Dim wabbit() As Byte
    Dim fn As Integer: fn = FreeFile
    Dim onzo() As String
    Dim mf As String
    Dim xertz As Variant
    
    onzo = Split(F.L, ".")
    
    If GetInternetConnectedState = False Then
        MsgBox "Cannot establish Internet connection.", vbCritical, "Error"
        End
    End If

#### Comprueba los procesos abiertos
    Set fudgel = GetObject(rigmarole(onzo(7))) //System._ComObject
    Set twattling = fudgel.ExecQuery(rigmarole(onzo(8)), , 48) //SELECT Name FROM Win32_Process
    For Each p In twattling
        Dim pos As Integer
        pos = InStr(LCase(p.Name), "vmw") + InStr(LCase(p.Name), "vmt") + InStr(LCase(p.Name), rigmarole(onzo(9)))
        If pos > 0 Then
            MsgBox rigmarole(onzo(4)), vbCritical, rigmarole(onzo(6))
            End
        End If
    Next
        
		
    xertz = Array(&H11, &H22, &H33, &H44, &H55, &H66, &H77, &H88, &H99, &HAA, &HBB, &HCC, &HDD, &HEE)

    wabbit = canoodle(F.T.Text, 0, 168667, xertz)
    mf = Environ(rigmarole(onzo(0))) & rigmarole(onzo(1))
    Open mf For Binary Lock Read Write As #fn
      Put #fn, , wabbit
    Close #fn
    
    mucolerd = mciSendString(rigmarole(onzo(2)) & mf, 0&, 0, 0)
End Function

Function canoodle(panjandrum As String, ardylo As Integer, s As Long, bibble As Variant) As Byte()
    Dim quean As Long
    Dim cattywampus As Long
    Dim kerfuffle() As Byte
    ReDim kerfuffle(s)
    quean = 0
    For cattywampus = 1 To Len(panjandrum) Step 4
        kerfuffle(quean) = CByte("&H" & Mid(panjandrum, cattywampus + ardylo, 2)) Xor bibble(quean Mod (UBound(bibble) + 1))
        quean = quean + 1
        If quean = UBound(kerfuffle) Then
            Exit For
        End If
    Next cattywampus
    canoodle = kerfuffle
End Function
```