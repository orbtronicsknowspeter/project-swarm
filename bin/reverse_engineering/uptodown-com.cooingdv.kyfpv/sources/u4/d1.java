package u4;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d1 extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10457b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f1 f10458l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(f1 f1Var, t6.c cVar, int i) {
        super(2, cVar);
        this.f10456a = i;
        this.f10458l = f1Var;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f10456a) {
            case 0:
                return new d1(this.f10458l, cVar, 0);
            case 1:
                return new d1(this.f10458l, cVar, 1);
            default:
                return new d1(this.f10458l, cVar, 2);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f10456a) {
            case 0:
                break;
            case 1:
                ((d1) create(a0Var, cVar)).invokeSuspend(p6.x.f8464a);
                break;
            default:
                ((d1) create(a0Var, cVar)).invokeSuspend(p6.x.f8464a);
                break;
        }
        return u6.a.f10763a;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.f10456a;
        u6.a aVar = u6.a.f10763a;
        f1 f1Var = this.f10458l;
        t6.c cVar = null;
        switch (i) {
            case 0:
                int i6 = this.f10457b;
                p6.x xVar = p6.x.f8464a;
                if (i6 == 0) {
                    p6.a.e(obj);
                    Context contextRequireContext = f1Var.requireContext();
                    contextRequireContext.getClass();
                    r.k kVar = new r.k(contextRequireContext);
                    this.f10457b = 1;
                    v7.e eVar = o7.m0.f8289a;
                    Object objC = o7.c0.C(new c4.g(kVar, cVar, 23), v7.d.f10885a, this);
                    if (objC != aVar) {
                        objC = xVar;
                    }
                    if (objC == aVar) {
                        return aVar;
                    }
                } else {
                    if (i6 != 1) {
                        androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p6.a.e(obj);
                }
                return xVar;
            case 1:
                int i10 = this.f10457b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        throw androidx.lifecycle.l.q(obj);
                    }
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p6.a.e(obj);
                r7.o0 o0Var = f1Var.b().f2106b;
                e1 e1Var = new e1(f1Var);
                this.f10457b = 1;
                o0Var.collect(e1Var, this);
                return aVar;
            default:
                int i11 = this.f10457b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        throw androidx.lifecycle.l.q(obj);
                    }
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p6.a.e(obj);
                r7.o0 o0Var2 = f1Var.b().f2108d;
                c3.y0 y0Var = new c3.y0(f1Var, 20);
                this.f10457b = 1;
                o0Var2.collect(y0Var, this);
                return aVar;
        }
    }
}
