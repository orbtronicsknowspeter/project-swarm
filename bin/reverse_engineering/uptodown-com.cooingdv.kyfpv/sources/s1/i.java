package s1;

import a4.x;
import com.google.android.gms.internal.measurement.i5;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f9135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9137c;

    public i(r rVar, int i, int i6) {
        i5.i(rVar, "Null dependency anInterface.");
        this.f9135a = rVar;
        this.f9136b = i;
        this.f9137c = i6;
    }

    public static i a(Class cls) {
        return new i(1, 0, cls);
    }

    public static i b(r rVar) {
        return new i(rVar, 1, 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f9135a.equals(iVar.f9135a) && this.f9136b == iVar.f9136b && this.f9137c == iVar.f9137c;
    }

    public final int hashCode() {
        return ((((this.f9135a.hashCode() ^ 1000003) * 1000003) ^ this.f9136b) * 1000003) ^ this.f9137c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f9135a);
        sb.append(", type=");
        int i = this.f9136b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i6 = this.f9137c;
        if (i6 == 0) {
            str = "direct";
        } else if (i6 == 1) {
            str = "provider";
        } else {
            if (i6 != 2) {
                o.j(androidx.lifecycle.l.u(i6, "Unsupported injection: "));
                return null;
            }
            str = "deferred";
        }
        return x.n(sb, str, "}");
    }

    public i(int i, int i6, Class cls) {
        this(r.a(cls), i, i6);
    }
}
