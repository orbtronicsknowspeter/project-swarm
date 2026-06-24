package d8;

import com.google.android.gms.internal.measurement.z3;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class w0 implements b8.e, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b8.e f3720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f3722c;

    public w0(b8.e eVar) {
        eVar.getClass();
        this.f3720a = eVar;
        this.f3721b = eVar.a() + '?';
        this.f3722c = o0.b(eVar);
    }

    @Override // b8.e
    public final String a() {
        return this.f3721b;
    }

    @Override // d8.k
    public final Set b() {
        return this.f3722c;
    }

    @Override // b8.e
    public final boolean c() {
        return true;
    }

    @Override // b8.e
    public final int d(String str) {
        str.getClass();
        return this.f3720a.d(str);
    }

    @Override // b8.e
    public final int e() {
        return this.f3720a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w0) {
            return kotlin.jvm.internal.l.a(this.f3720a, ((w0) obj).f3720a);
        }
        return false;
    }

    @Override // b8.e
    public final String f(int i) {
        return this.f3720a.f(i);
    }

    @Override // b8.e
    public final List g(int i) {
        return this.f3720a.g(i);
    }

    @Override // b8.e
    public final List getAnnotations() {
        return this.f3720a.getAnnotations();
    }

    @Override // b8.e
    public final z3 getKind() {
        return this.f3720a.getKind();
    }

    @Override // b8.e
    public final b8.e h(int i) {
        return this.f3720a.h(i);
    }

    public final int hashCode() {
        return this.f3720a.hashCode() * 31;
    }

    @Override // b8.e
    public final boolean i(int i) {
        return this.f3720a.i(i);
    }

    @Override // b8.e
    public final boolean isInline() {
        return this.f3720a.isInline();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3720a);
        sb.append('?');
        return sb.toString();
    }
}
