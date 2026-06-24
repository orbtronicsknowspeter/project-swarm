package x7;

import d7.q;
import p6.x;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e extends kotlin.jvm.internal.k implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f11526a = new e(3, g.class, "onLockRegFunction", "onLockRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // d7.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int andDecrement;
        g gVar = (g) obj;
        d dVar = (d) obj2;
        x xVar = x.f8464a;
        if (obj3 == null) {
            gVar.getClass();
        } else if (gVar.holdsLock(obj3)) {
            dVar.b(h.f11530b);
            return xVar;
        }
        dVar.getClass();
        d dVar2 = new d(gVar, dVar, obj3);
        do {
            gVar.getClass();
            do {
                andDecrement = l.f11537p.getAndDecrement(gVar);
            } while (andDecrement > gVar.f11538a);
            if (andDecrement > 0) {
                dVar2.b(xVar);
                return xVar;
            }
        } while (!gVar.a(dVar2));
        return xVar;
    }
}
