package k1;

import com.google.android.gms.internal.measurement.z5;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements d, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z5 f6943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile transient boolean f6944b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public transient Object f6945l;

    public e(z5 z5Var) {
        this.f6943a = z5Var;
    }

    @Override // k1.d
    public final Object get() {
        if (!this.f6944b) {
            synchronized (this) {
                try {
                    if (!this.f6944b) {
                        Object obj = this.f6943a.get();
                        this.f6945l = obj;
                        this.f6944b = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f6945l;
    }

    public final String toString() {
        Object string;
        if (this.f6944b) {
            String strValueOf = String.valueOf(this.f6945l);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(strValueOf);
            sb.append(">");
            string = sb.toString();
        } else {
            string = this.f6943a;
        }
        String strValueOf2 = String.valueOf(string);
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(strValueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
