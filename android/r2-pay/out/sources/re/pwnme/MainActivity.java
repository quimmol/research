package re.pwnme;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import ♫.ActivityC0299;
import ♫.C0282;

public class MainActivity extends ActivityC0299 {

    /* renamed from: Φ  reason: contains not printable characters */
    public String f507;

    /* renamed from: θ  reason: contains not printable characters */
    public byte f508;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public String f509;

    public native byte[] gXftm3iswpkVgBNDUp(byte[] bArr, byte b);

    static {
        System.loadLibrary("native-lib");
    }

    @Override // ♫.ActivityC0088, ♫.ActivityC0299, ♫.ActivityC0126
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(1);
        setContentView(2131296284);
        this.f508 = -16;
        C0282 rb = new C0282(getApplicationContext()); // Class with anti-root, anti-debug techniques
        if (rb.m1260() || (rb.m1253() && rb.m1248())) {
            int i = 1337 / 0;
            this.f508 = (byte) (this.f508 | 15);
        }
        m331();
    }

    /* renamed from: re.pwnme.MainActivity$θ  reason: contains not printable characters */
    public class View$OnClickListenerC0064 implements View.OnClickListener {

        /* renamed from: θ  reason: contains not printable characters */
        public final /* synthetic */ Button f510;

        public View$OnClickListenerC0064(Button button) {
            this.f510 = button;
        }

        public void onClick(View v) {
            if (this.f510 != null) {
                TextView r2coin_token = (TextView) MainActivity.this.findViewById(2131165285);
                if (MainActivity.this.m330()) {
                    try {
                        if (MainActivity.this.f509.length() != 4) {
                            Toast.makeText(MainActivity.this.getApplicationContext(), "PIN code must be 4 digits long...", 0).show();
                            return;
                        }
                        MainActivity.this.f509 = String.format("%08d", Integer.valueOf(Integer.parseInt(MainActivity.this.f509)));
                        if (MainActivity.this.f507.length() <= 8) {
                            MainActivity.this.f507 = String.format("%08d", Integer.valueOf(Integer.parseInt(MainActivity.this.f507)));
                            byte[] inBuff = (MainActivity.this.f509 + MainActivity.this.f507).getBytes();
                            C0282 rb = new C0282(MainActivity.this.getApplicationContext());
                            if (rb.m1260() || (rb.m1253() && rb.m1248())) {
                                MainActivity mainActivity = MainActivity.this;
                                mainActivity.f508 = (byte) (mainActivity.f508 | 15);
                                new NullPointerException().notify();
                            }
                            Toast.makeText(MainActivity.this.getApplicationContext(), "Tokenizing your r2coin...", 0).show();
                            MainActivity mainActivity2 = MainActivity.this;
                            byte[] out = mainActivity2.gXftm3iswpkVgBNDUp(inBuff, mainActivity2.f508);
                            if (out[0] == 81) {
                                r2coin_token.setTextColor(-65536);
                            } else {
                                r2coin_token.setTextColor(Color.parseColor("#10b010"));
                            }
                            r2coin_token.setText("r2c-" + MainActivity.m328(out, 1));
                            return;
                        }
                        Toast.makeText(MainActivity.this.getApplicationContext(), "Enormous amount to tokenize r2coins.\nRadare2 is a non-profit organization :)", 0).show();
                    } catch (Exception e) {
                        Toast.makeText(MainActivity.this.getApplicationContext(), "Enter PIN code/amount as numeric...", 0).show();
                    }
                } else {
                    String empty = String.format("%032d", 0);
                    r2coin_token.setTextColor(-65536);
                    r2coin_token.setText("r2c-" + empty);
                }
            }
        }
    }

    /* renamed from: ₩  reason: contains not printable characters */
    public final void m331() {
        Button pay = (Button) findViewById(2131165279);
        pay.setOnClickListener(new View$OnClickListenerC0064(pay));
    }

    @Override // ♫.ActivityC0088
    /* renamed from: Φ  reason: contains not printable characters */
    public final boolean m330() {
        this.f509 = ((TextView) findViewById(2131165281)).getText().toString();
        this.f507 = ((TextView) findViewById(2131165213)).getText().toString();
        if (!this.f509.equals("") && !this.f507.equals("")) {
            return true;
        }
        Toast.makeText(getApplicationContext(), "Enter PIN code/amount...", 0).show();
        return false;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static String m328(byte[] a, int offset) {
        StringBuilder sb = new StringBuilder(a.length * 2);
        for (int i = offset; i < a.length; i++) {
            sb.append(String.format("%02x", Byte.valueOf(a[i])));
        }
        return sb.toString();
    }
}
