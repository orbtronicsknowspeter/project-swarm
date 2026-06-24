package o7;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f8322a = new ThreadLocal();

    public static r0 a() {
        ThreadLocal threadLocal = f8322a;
        r0 r0Var = (r0) threadLocal.get();
        if (r0Var != null) {
            return r0Var;
        }
        g gVar = new g(Thread.currentThread());
        threadLocal.set(gVar);
        return gVar;
    }
}
