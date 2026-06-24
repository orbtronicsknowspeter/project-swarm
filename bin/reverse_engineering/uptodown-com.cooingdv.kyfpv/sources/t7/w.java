package t7;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class w implements t6.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadLocal f10362a;

    public w(ThreadLocal threadLocal) {
        this.f10362a = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && kotlin.jvm.internal.l.a(this.f10362a, ((w) obj).f10362a);
    }

    public final int hashCode() {
        return this.f10362a.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f10362a + ')';
    }
}
