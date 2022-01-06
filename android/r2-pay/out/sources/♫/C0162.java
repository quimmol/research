package ♫;

import android.os.Bundle;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import ♫.C0097;

/* renamed from: ♫.ї  reason: contains not printable characters */
public class C0162 extends AbstractC0161 {

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean f731 = false;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final C0163 f732;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final AbstractC0577 f733;

    /* renamed from: ♫.ї$θ  reason: contains not printable characters */
    public static class C0165<D> extends C0592<D> implements AbstractC0166<D> {

        /* renamed from: ø  reason: contains not printable characters */
        public final int f736;

        /* renamed from: θ  reason: contains not printable characters */
        public final Bundle f737;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public AbstractC0577 f738;

        @Override // androidx.lifecycle.LiveData
        /* renamed from: θ  reason: contains not printable characters */
        public void m805() {
            if (C0162.f731) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        /* renamed from: Φ  reason: contains not printable characters */
        public void m804() {
            if (C0162.f731) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            throw null;
        }

        /* renamed from: ø  reason: contains not printable characters */
        public void m803() {
            if (this.f738 != null) {
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: ♫.ﹼ<? super D> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        /* renamed from: θ  reason: contains not printable characters */
        public void m808(AbstractC0593<? super D> r2) {
            super.m310((AbstractC0593) r2);
            this.f738 = null;
        }

        /* JADX WARN: Incorrect return type in method signature: (Z)Ljava/lang/Object<TD;>; */
        /* renamed from: θ  reason: contains not printable characters */
        public void m809(boolean reset) {
            if (C0162.f731) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            throw null;
        }

        @Override // androidx.lifecycle.LiveData, ♫.C0592
        /* renamed from: θ  reason: contains not printable characters */
        public void m806(D value) {
            super.m2889((Object) value);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f736);
            sb.append(" : ");
            C0112.m602(null, sb);
            sb.append("}}");
            return sb.toString();
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m807(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
            writer.print(prefix);
            writer.print("mId=");
            writer.print(this.f736);
            writer.print(" mArgs=");
            writer.println(this.f737);
            writer.print(prefix);
            writer.print("mLoader=");
            writer.println((Object) null);
            String str = prefix + "  ";
            throw null;
        }
    }

    /* renamed from: ♫.ї$Φ  reason: contains not printable characters */
    public static class C0163 extends AbstractC0598 {

        /* renamed from: θ  reason: contains not printable characters */
        public static final C0097.AbstractC0098 f734 = new C0164();

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public C0528<C0165> f735 = new C0528<>();

        /* renamed from: ♫.ї$Φ$θ  reason: contains not printable characters */
        public static class C0164 implements C0097.AbstractC0098 {
            /* renamed from: θ  reason: contains not printable characters */
            public <T extends AbstractC0598> T m802(Class<T> cls) {
                return new C0163();
            }
        }

        /* renamed from: θ  reason: contains not printable characters */
        public static C0163 m798(C0156 viewModelStore) {
            return (C0163) new C0097(viewModelStore, f734).m529(C0163.class);
        }

        /* renamed from: Φ  reason: contains not printable characters */
        public void m799() {
            int size = this.f735.m2492();
            for (int index = 0; index < size; index++) {
                this.f735.m2488(index).m803();
            }
        }

        @Override // ♫.AbstractC0598
        /* renamed from: θ  reason: contains not printable characters */
        public void m800() {
            super.m2902();
            if (0 >= this.f735.m2492()) {
                this.f735.m2497();
            } else {
                this.f735.m2488(0).m809(true);
                throw null;
            }
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m801(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
            if (this.f735.m2492() > 0) {
                writer.print(prefix);
                writer.println("Loaders:");
                String str = prefix + "    ";
                if (0 < this.f735.m2492()) {
                    C0165 info = this.f735.m2488(0);
                    writer.print(prefix);
                    writer.print("  #");
                    writer.print(this.f735.m2493(0));
                    writer.print(": ");
                    writer.println(info.toString());
                    info.m807(str, fd, writer, args);
                    throw null;
                }
            }
        }
    }

    public C0162(AbstractC0577 lifecycleOwner, C0156 viewModelStore) {
        this.f733 = lifecycleOwner;
        this.f732 = C0163.m798(viewModelStore);
    }

    @Override // ♫.AbstractC0161
    /* renamed from: θ  reason: contains not printable characters */
    public void m796() {
        this.f732.m799();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0112.m602(this.f733, sb);
        sb.append("}}");
        return sb.toString();
    }

    @Override // ♫.AbstractC0161
    @Deprecated
    /* renamed from: θ  reason: contains not printable characters */
    public void m797(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
        this.f732.m801(prefix, fd, writer, args);
    }
}
