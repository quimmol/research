package ♫;

import android.util.Log;
import java.io.Writer;

/* renamed from: ♫.ˇ  reason: contains not printable characters */
public class C0113 extends Writer {

    /* renamed from: θ  reason: contains not printable characters */
    public final String f652;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public StringBuilder f653 = new StringBuilder(128);

    public C0113(String tag) {
        this.f652 = tag;
    }

    @Override // java.io.Closeable, java.io.Writer, java.lang.AutoCloseable
    public void close() {
        m603();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m603();
    }

    @Override // java.io.Writer
    public void write(char[] buf, int offset, int count) {
        for (int i = 0; i < count; i++) {
            char c = buf[offset + i];
            if (c == '\n') {
                m603();
            } else {
                this.f653.append(c);
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m603() {
        if (this.f653.length() > 0) {
            Log.d(this.f652, this.f653.toString());
            StringBuilder sb = this.f653;
            sb.delete(0, sb.length());
        }
    }
}
