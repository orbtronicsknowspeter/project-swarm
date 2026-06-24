package q6;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8729b;

    public w(int i, Object obj) {
        this.f8728a = i;
        this.f8729b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f8728a == wVar.f8728a && kotlin.jvm.internal.l.a(this.f8729b, wVar.f8729b);
    }

    public final int hashCode() {
        int i = this.f8728a * 31;
        Object obj = this.f8729b;
        return i + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f8728a + ", value=" + this.f8729b + ')';
    }
}
