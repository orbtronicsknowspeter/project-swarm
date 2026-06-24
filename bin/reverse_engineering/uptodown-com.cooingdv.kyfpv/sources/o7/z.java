package o7;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class z extends t6.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f8334b = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8335a;

    public z() {
        super(f8334b);
        this.f8335a = "Room Invalidation Tracker Refresh";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && kotlin.jvm.internal.l.a(this.f8335a, ((z) obj).f8335a);
    }

    public final int hashCode() {
        return this.f8335a.hashCode();
    }

    public final String toString() {
        return a4.x.m(new StringBuilder("CoroutineName("), this.f8335a, ')');
    }
}
