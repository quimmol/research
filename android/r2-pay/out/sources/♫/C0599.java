package ♫;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.provider.FontsContractCompat;
import androidx.core.provider.SelfDestructiveThread;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import ♫.C0079;
import ♫.C0115;

/* renamed from: ♫.ｰ  reason: contains not printable characters */
public class C0599 {

    /* renamed from: θ  reason: contains not printable characters */
    public static final Object f2360 = new Object();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public static final Comparator<byte[]> f2361 = new C0601();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public static final C0079 f2362 = new C0079("fonts", 10, 10000);

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public static final C0520<String, Typeface> f2363 = new C0520<>(16);

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public static final C0527<String, ArrayList<C0079.AbstractC0080<C0606>>> f2364 = new C0527<>();

    /* renamed from: θ  reason: contains not printable characters */
    public static C0606 m2909(Context context, C0591 request, int style) {
        try {
            C0602 result = m2908(context, (CancellationSignal) null, request);
            int resultCode = -3;
            if (result.m2918() == 0) {
                Typeface typeface = C0173.m869(context, null, result.m2919(), style);
                if (typeface != null) {
                    resultCode = 0;
                }
                return new C0606(typeface, resultCode);
            }
            if (result.m2918() == 1) {
                resultCode = -2;
            }
            return new C0606(null, resultCode);
        } catch (PackageManager.NameNotFoundException e) {
            return new C0606(null, -1);
        }
    }

    /* renamed from: ♫.ｰ$₩  reason: contains not printable characters */
    public static final class C0606 {

        /* renamed from: θ  reason: contains not printable characters */
        public final int f2379;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final Typeface f2380;

        public C0606(Typeface typeface, int result) {
            this.f2380 = typeface;
            this.f2379 = result;
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static Typeface m2904(Context context, C0591 request, C0115.AbstractC0116 fontCallback, Handler handler, boolean isBlockingFetch, int timeout, int style) {
        String id = request.m2887() + "-" + style;
        Typeface cached = f2363.m2452(id);
        if (cached != null) {
            if (fontCallback != null) {
                fontCallback.m613(cached);
            }
            return cached;
        } else if (!isBlockingFetch || timeout != -1) {
            CallableC0605 r2 = new CallableC0605(context, request, style, id);
            if (isBlockingFetch) {
                try {
                    return ((C0606) f2362.m473(r2, timeout)).f2380;
                } catch (InterruptedException e) {
                    return null;
                }
            } else {
                SelfDestructiveThread.ReplyCallback<FontsContractCompat.TypefaceResult> reply = fontCallback == null ? null : new C0604(fontCallback, handler);
                synchronized (f2360) {
                    if (f2364.containsKey(id)) {
                        if (reply != null) {
                            f2364.get(id).add(reply);
                        }
                        return null;
                    }
                    if (reply != null) {
                        ArrayList<SelfDestructiveThread.ReplyCallback<FontsContractCompat.TypefaceResult>> pendingReplies = new ArrayList<>();
                        pendingReplies.add(reply);
                        f2364.put(id, pendingReplies);
                    }
                    f2362.m476(r2, new C0603(id));
                    return null;
                }
            }
        } else {
            C0606 typefaceResult = m2909(context, request, style);
            if (fontCallback != null) {
                int i = typefaceResult.f2379;
                if (i == 0) {
                    fontCallback.m614(typefaceResult.f2380, handler);
                } else {
                    fontCallback.m612(i, handler);
                }
            }
            return typefaceResult.f2380;
        }
    }

    /* renamed from: ♫.ｰ$θ  reason: contains not printable characters */
    public static class CallableC0605 implements Callable<C0606> {

        /* renamed from: θ  reason: contains not printable characters */
        public final /* synthetic */ int f2375;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final /* synthetic */ Context f2376;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final /* synthetic */ String f2377;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final /* synthetic */ C0591 f2378;

        public CallableC0605(Context context, C0591 r2, int i, String str) {
            this.f2376 = context;
            this.f2378 = r2;
            this.f2375 = i;
            this.f2377 = str;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public C0606 call() {
            C0606 typeface = C0599.m2909(this.f2376, this.f2378, this.f2375);
            Typeface typeface2 = typeface.f2380;
            if (typeface2 != null) {
                C0599.f2363.m2453(this.f2377, typeface2);
            }
            return typeface;
        }
    }

    /* renamed from: ♫.ｰ$Φ  reason: contains not printable characters */
    public static class C0604 implements C0079.AbstractC0080<C0606> {

        /* renamed from: θ  reason: contains not printable characters */
        public final /* synthetic */ Handler f2373;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final /* synthetic */ C0115.AbstractC0116 f2374;

        public C0604(C0115.AbstractC0116 r1, Handler handler) {
            this.f2374 = r1;
            this.f2373 = handler;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m2922(C0606 typeface) {
            if (typeface == null) {
                this.f2374.m612(1, this.f2373);
                return;
            }
            int i = typeface.f2379;
            if (i == 0) {
                this.f2374.m614(typeface.f2380, this.f2373);
            } else {
                this.f2374.m612(i, this.f2373);
            }
        }
    }

    /* renamed from: ♫.ｰ$ø  reason: contains not printable characters */
    public static class C0603 implements C0079.AbstractC0080<C0606> {

        /* renamed from: θ  reason: contains not printable characters */
        public final /* synthetic */ String f2372;

        public C0603(String str) {
            this.f2372 = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
            r0 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
            if (r0 >= r2.size()) goto L_0x002e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0022, code lost:
            ((♫.C0079.AbstractC0080) r2.get(r0)).m477(r5);
            r0 = r0 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
            return;
         */
        /* renamed from: θ  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void m2920(♫.C0599.C0606 r5) {
            /*
                r4 = this;
                java.lang.Object r0 = ♫.C0599.f2360
                monitor-enter(r0)
                r1 = 0
                ♫.者<java.lang.String, java.util.ArrayList<♫.ʳ$Ø<♫.ｰ$₩>>> r2 = ♫.C0599.f2364     // Catch:{ all -> 0x002f }
                java.lang.String r3 = r4.f2372     // Catch:{ all -> 0x002f }
                java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x002f }
                java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x002f }
                r1 = r2
                if (r1 != 0) goto L_0x0013
                monitor-exit(r0)     // Catch:{ all -> 0x0032 }
                return
            L_0x0013:
                ♫.者<java.lang.String, java.util.ArrayList<♫.ʳ$Ø<♫.ｰ$₩>>> r2 = ♫.C0599.f2364     // Catch:{ all -> 0x0032 }
                java.lang.String r3 = r4.f2372     // Catch:{ all -> 0x0032 }
                r2.remove(r3)     // Catch:{ all -> 0x0032 }
                monitor-exit(r0)     // Catch:{ all -> 0x0032 }
                r0 = 0
            L_0x001c:
                int r2 = r1.size()
                if (r0 >= r2) goto L_0x002e
                java.lang.Object r2 = r1.get(r0)
                ♫.ʳ$Ø r2 = (♫.C0079.AbstractC0080) r2
                r2.m477(r5)
                int r0 = r0 + 1
                goto L_0x001c
            L_0x002e:
                return
            L_0x002f:
                r2 = move-exception
            L_0x0030:
                monitor-exit(r0)
                throw r2
            L_0x0032:
                r2 = move-exception
                goto L_0x0030
            */
            throw new UnsupportedOperationException("Method not decompiled: ♫.C0599.C0603.m2920(♫.ｰ$₩):void");
        }
    }

    /* renamed from: ♫.ｰ$µ  reason: contains not printable characters */
    public static class C0600 {

        /* renamed from: ø  reason: contains not printable characters */
        public final int f2365;

        /* renamed from: Φ  reason: contains not printable characters */
        public final int f2366;

        /* renamed from: θ  reason: contains not printable characters */
        public final int f2367;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final Uri f2368;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final boolean f2369;

        public C0600(Uri uri, int ttcIndex, int weight, boolean italic, int resultCode) {
            C0154.m779(uri);
            this.f2368 = uri;
            this.f2367 = ttcIndex;
            this.f2366 = weight;
            this.f2369 = italic;
            this.f2365 = resultCode;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public Uri m2915() {
            return this.f2368;
        }

        /* renamed from: Φ  reason: contains not printable characters */
        public int m2913() {
            return this.f2367;
        }

        /* renamed from: ø  reason: contains not printable characters */
        public int m2912() {
            return this.f2366;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public boolean m2916() {
            return this.f2369;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public int m2914() {
            return this.f2365;
        }
    }

    /* renamed from: ♫.ｰ$ö  reason: contains not printable characters */
    public static class C0602 {

        /* renamed from: θ  reason: contains not printable characters */
        public final int f2370;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final C0600[] f2371;

        public C0602(int statusCode, C0600[] fonts) {
            this.f2370 = statusCode;
            this.f2371 = fonts;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public int m2918() {
            return this.f2370;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public C0600[] m2919() {
            return this.f2371;
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static Map<Uri, ByteBuffer> m2907(Context context, C0600[] fonts, CancellationSignal cancellationSignal) {
        HashMap<Uri, ByteBuffer> out = new HashMap<>();
        for (C0600 font : fonts) {
            if (font.m2914() == 0) {
                Uri uri = font.m2915();
                if (!out.containsKey(uri)) {
                    out.put(uri, C0167.m812(context, cancellationSignal, uri));
                }
            }
        }
        return Collections.unmodifiableMap(out);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static C0602 m2908(Context context, CancellationSignal cancellationSignal, C0591 request) {
        ProviderInfo providerInfo = m2903(context.getPackageManager(), request, context.getResources());
        if (providerInfo == null) {
            return new C0602(1, null);
        }
        return new C0602(0, m2911(context, request, providerInfo.authority, cancellationSignal));
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static ProviderInfo m2903(PackageManager packageManager, C0591 request, Resources resources) {
        String providerAuthority = request.m2885();
        ProviderInfo info = packageManager.resolveContentProvider(providerAuthority, 0);
        if (info == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + providerAuthority);
        } else if (info.packageName.equals(request.m2884())) {
            List<byte[]> signatures = m2906(packageManager.getPackageInfo(info.packageName, 64).signatures);
            Collections.sort(signatures, f2361);
            List<List<byte[]>> requestCertificatesList = m2905(request, resources);
            for (int i = 0; i < requestCertificatesList.size(); i++) {
                List<byte[]> requestSignatures = new ArrayList<>(requestCertificatesList.get(i));
                Collections.sort(requestSignatures, f2361);
                if (m2910(signatures, requestSignatures)) {
                    return info;
                }
            }
            return null;
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + providerAuthority + ", but package was not " + request.m2884());
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static List<List<byte[]>> m2905(C0591 request, Resources resources) {
        if (request.m2888() != null) {
            return request.m2888();
        }
        return C0103.m546(resources, request.m2886());
    }

    /* renamed from: ♫.ｰ$Ø  reason: contains not printable characters */
    public static class C0601 implements Comparator<byte[]> {
        /* renamed from: θ  reason: contains not printable characters */
        public int compare(byte[] l, byte[] r) {
            if (l.length != r.length) {
                return l.length - r.length;
            }
            for (int i = 0; i < l.length; i++) {
                if (l[i] != r[i]) {
                    return l[i] - r[i];
                }
            }
            return 0;
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m2910(List<byte[]> signatures, List<byte[]> requestSignatures) {
        if (signatures.size() != requestSignatures.size()) {
            return false;
        }
        for (int i = 0; i < signatures.size(); i++) {
            if (!Arrays.equals(signatures.get(i), requestSignatures.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static List<byte[]> m2906(Signature[] signatures) {
        List<byte[]> shas = new ArrayList<>();
        for (Signature signature : signatures) {
            shas.add(signature.toByteArray());
        }
        return shas;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static C0600[] m2911(Context context, C0591 request, String authority, CancellationSignal cancellationSignal) {
        Uri fileUri;
        ArrayList<FontsContractCompat.FontInfo> result = new ArrayList<>();
        Uri uri = new Uri.Builder().scheme("content").authority(authority).build();
        Uri fileBaseUri = new Uri.Builder().scheme("content").authority(authority).appendPath("file").build();
        Cursor cursor = null;
        try {
            int i = Build.VERSION.SDK_INT;
            cursor = context.getContentResolver().query(uri, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{request.m2883()}, null, cancellationSignal);
            if (cursor != null && cursor.getCount() > 0) {
                int resultCodeColumnIndex = cursor.getColumnIndex("result_code");
                result = new ArrayList<>();
                int idColumnIndex = cursor.getColumnIndex("_id");
                int fileIdColumnIndex = cursor.getColumnIndex("file_id");
                int ttcIndexColumnIndex = cursor.getColumnIndex("font_ttc_index");
                int weightColumnIndex = cursor.getColumnIndex("font_weight");
                int italicColumnIndex = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int resultCode = resultCodeColumnIndex != -1 ? cursor.getInt(resultCodeColumnIndex) : 0;
                    int ttcIndex = ttcIndexColumnIndex != -1 ? cursor.getInt(ttcIndexColumnIndex) : 0;
                    if (fileIdColumnIndex == -1) {
                        fileUri = ContentUris.withAppendedId(uri, cursor.getLong(idColumnIndex));
                    } else {
                        fileUri = ContentUris.withAppendedId(fileBaseUri, cursor.getLong(fileIdColumnIndex));
                    }
                    result.add(new C0600(fileUri, ttcIndex, weightColumnIndex != -1 ? cursor.getInt(weightColumnIndex) : 400, italicColumnIndex != -1 && cursor.getInt(italicColumnIndex) == 1, resultCode));
                }
            }
            return (C0600[]) result.toArray(new C0600[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}
