package d8;

import com.google.android.gms.internal.measurement.z3;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class u0 implements b8.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b8.d f3715b;

    public u0(String str, b8.d dVar) {
        dVar.getClass();
        this.f3714a = str;
        this.f3715b = dVar;
    }

    @Override // b8.e
    public final String a() {
        return this.f3714a;
    }

    @Override // b8.e
    public final boolean c() {
        return false;
    }

    @Override // b8.e
    public final int d(String str) {
        str.getClass();
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // b8.e
    public final int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return this.f3714a.equals(u0Var.f3714a) && kotlin.jvm.internal.l.a(this.f3715b, u0Var.f3715b);
    }

    @Override // b8.e
    public final String f(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // b8.e
    public final List g(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // b8.e
    public final List getAnnotations() {
        return q6.t.f8725a;
    }

    @Override // b8.e
    public final z3 getKind() {
        return this.f3715b;
    }

    @Override // b8.e
    public final b8.e h(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode() {
        return (this.f3715b.hashCode() * 31) + this.f3714a.hashCode();
    }

    @Override // b8.e
    public final boolean i(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // b8.e
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return a4.x.m(new StringBuilder("PrimitiveDescriptor("), this.f3714a, ')');
    }
}
