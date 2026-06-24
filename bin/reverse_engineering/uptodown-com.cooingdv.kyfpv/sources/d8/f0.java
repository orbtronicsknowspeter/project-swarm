package d8;

import com.google.android.gms.internal.measurement.z3;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f0 implements b8.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b8.e f3642a;

    public f0(b8.e eVar) {
        this.f3642a = eVar;
    }

    @Override // b8.e
    public final boolean c() {
        return false;
    }

    @Override // b8.e
    public final int d(String str) {
        str.getClass();
        Integer numH0 = l7.t.h0(str);
        if (numH0 != null) {
            return numH0.intValue();
        }
        com.google.gson.internal.a.p(str.concat(" is not a valid list index"));
        return 0;
    }

    @Override // b8.e
    public final int e() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return kotlin.jvm.internal.l.a(this.f3642a, f0Var.f3642a) && kotlin.jvm.internal.l.a(a(), f0Var.a());
    }

    @Override // b8.e
    public final String f(int i) {
        return String.valueOf(i);
    }

    @Override // b8.e
    public final List g(int i) {
        if (i >= 0) {
            return q6.t.f8725a;
        }
        StringBuilder sbP = a4.x.p(i, "Illegal index ", ", ");
        sbP.append(a());
        sbP.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbP.toString().toString());
    }

    @Override // b8.e
    public final List getAnnotations() {
        return q6.t.f8725a;
    }

    @Override // b8.e
    public final z3 getKind() {
        return b8.i.i;
    }

    @Override // b8.e
    public final b8.e h(int i) {
        if (i >= 0) {
            return this.f3642a;
        }
        StringBuilder sbP = a4.x.p(i, "Illegal index ", ", ");
        sbP.append(a());
        sbP.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbP.toString().toString());
    }

    public final int hashCode() {
        return a().hashCode() + (this.f3642a.hashCode() * 31);
    }

    @Override // b8.e
    public final boolean i(int i) {
        if (i >= 0) {
            return false;
        }
        StringBuilder sbP = a4.x.p(i, "Illegal index ", ", ");
        sbP.append(a());
        sbP.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbP.toString().toString());
    }

    @Override // b8.e
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return a() + '(' + this.f3642a + ')';
    }
}
