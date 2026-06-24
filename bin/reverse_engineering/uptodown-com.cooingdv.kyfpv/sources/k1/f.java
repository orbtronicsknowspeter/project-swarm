package k1;

import com.google.android.gms.internal.measurement.z5;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile z5 f6946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f6947b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f6948l;

    @Override // k1.d
    public final Object get() {
        if (!this.f6947b) {
            synchronized (this) {
                try {
                    if (!this.f6947b) {
                        z5 z5Var = this.f6946a;
                        Objects.requireNonNull(z5Var);
                        Object obj = z5Var.get();
                        this.f6948l = obj;
                        this.f6947b = true;
                        this.f6946a = null;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f6948l;
    }

    public final String toString() {
        Object string = this.f6946a;
        if (string == null) {
            String strValueOf = String.valueOf(this.f6948l);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(strValueOf);
            sb.append(">");
            string = sb.toString();
        }
        String strValueOf2 = String.valueOf(string);
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(strValueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
