package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class p implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f7021a;

    public p(Class cls) {
        cls.getClass();
        this.f7021a = cls;
    }

    @Override // kotlin.jvm.internal.e
    public final Class a() {
        return this.f7021a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return l.a(this.f7021a, ((p) obj).f7021a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7021a.hashCode();
    }

    public final String toString() {
        return this.f7021a + " (Kotlin reflection is not available)";
    }
}
