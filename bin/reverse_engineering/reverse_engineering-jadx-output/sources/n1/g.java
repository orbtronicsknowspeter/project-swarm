package n1;

import a4.d0;
import java.util.concurrent.Executor;
import o7.c0;
import s1.r;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements s1.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f7913b = new g(0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final g f7914l = new g(1);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final g f7915m = new g(2);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final g f7916n = new g(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7917a;

    public /* synthetic */ g(int i) {
        this.f7917a = i;
    }

    @Override // s1.d
    public final Object c(d0 d0Var) {
        switch (this.f7917a) {
            case 0:
                Object objE = d0Var.e(new r(r1.a.class, Executor.class));
                objE.getClass();
                return c0.m((Executor) objE);
            case 1:
                Object objE2 = d0Var.e(new r(r1.c.class, Executor.class));
                objE2.getClass();
                return c0.m((Executor) objE2);
            case 2:
                Object objE3 = d0Var.e(new r(r1.b.class, Executor.class));
                objE3.getClass();
                return c0.m((Executor) objE3);
            default:
                Object objE4 = d0Var.e(new r(r1.d.class, Executor.class));
                objE4.getClass();
                return c0.m((Executor) objE4);
        }
    }
}
