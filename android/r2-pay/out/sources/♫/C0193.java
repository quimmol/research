package ♫;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;

/* renamed from: ♫.ᐧ  reason: contains not printable characters */
public class C0193 extends C0093 {
    /* renamed from: θ  reason: contains not printable characters */
    public final File m916(ParcelFileDescriptor fd) {
        try {
            String path = Os.readlink("/proc/self/fd/" + fd.getFd());
            if (OsConstants.S_ISREG(Os.stat(path).st_mode)) {
                return new File(path);
            }
            return null;
        } catch (ErrnoException e) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0047, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004d, code lost:
        r6.addSuppressed(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0050, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0053, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0054, code lost:
        if (r3 != null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x005a, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x005b, code lost:
        r4.addSuppressed(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x005e, code lost:
        throw r5;
     */
    @Override // ♫.C0093
    /* renamed from: θ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface m915(android.content.Context r10, android.os.CancellationSignal r11, ♫.C0599.C0600[] r12, int r13) {
        /*
            r9 = this;
            int r0 = r12.length
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L_0x0006
            return r1
        L_0x0006:
            ♫.ｰ$µ r0 = r9.m518(r12, r13)
            android.content.ContentResolver r2 = r10.getContentResolver()
            android.net.Uri r3 = r0.m2915()     // Catch:{ IOException -> 0x005f }
            java.lang.String r4 = "r"
            android.os.ParcelFileDescriptor r3 = r2.openFileDescriptor(r3, r4, r11)     // Catch:{ IOException -> 0x005f }
            java.io.File r4 = r9.m916(r3)     // Catch:{ all -> 0x0051 }
            if (r4 == 0) goto L_0x0031
            boolean r5 = r4.canRead()     // Catch:{ all -> 0x0051 }
            if (r5 != 0) goto L_0x0027
            goto L_0x0031
        L_0x0027:
            android.graphics.Typeface r5 = android.graphics.Typeface.createFromFile(r4)     // Catch:{ all -> 0x0051 }
            if (r3 == 0) goto L_0x0030
            r3.close()
        L_0x0030:
            return r5
        L_0x0031:
            java.io.FileInputStream r5 = new java.io.FileInputStream
            java.io.FileDescriptor r6 = r3.getFileDescriptor()
            r5.<init>(r6)
            android.graphics.Typeface r6 = super.m515(r10, r5)     // Catch:{ all -> 0x0045 }
            r5.close()
            r3.close()
            return r6
        L_0x0045:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r7 = move-exception
            r5.close()     // Catch:{ all -> 0x004c }
            goto L_0x0050
        L_0x004c:
            r8 = move-exception
            r6.addSuppressed(r8)
        L_0x0050:
            throw r7
        L_0x0051:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r5 = move-exception
            if (r3 == 0) goto L_0x005e
            r3.close()     // Catch:{ all -> 0x005a }
            goto L_0x005e
        L_0x005a:
            r6 = move-exception
            r4.addSuppressed(r6)
        L_0x005e:
            throw r5
        L_0x005f:
            r3 = move-exception
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ♫.C0193.m915(android.content.Context, android.os.CancellationSignal, ♫.ｰ$µ[], int):android.graphics.Typeface");
    }
}
