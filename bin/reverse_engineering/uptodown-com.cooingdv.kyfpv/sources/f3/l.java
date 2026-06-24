package f3;

import d7.p;
import o7.a0;
import p6.x;
import r7.k0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends v6.i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4862b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n f4863l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(n nVar, t6.c cVar, int i) {
        super(2, cVar);
        this.f4861a = i;
        this.f4863l = nVar;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f4861a) {
            case 0:
                return new l(this.f4863l, cVar, 0);
            default:
                return new l(this.f4863l, cVar, 1);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        a0 a0Var = (a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f4861a) {
        }
        return ((l) create(a0Var, cVar)).invokeSuspend(x.f8464a);
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f4861a) {
            case 0:
                int i = this.f4862b;
                if (i == 0) {
                    p6.a.e(obj);
                    n nVar = this.f4863l;
                    r7.h data = nVar.f4868b.getData();
                    k kVar = new k(nVar.f4869c);
                    this.f4862b = 1;
                    Object objCollect = data.collect(kVar, this);
                    u6.a aVar = u6.a.f10763a;
                    if (objCollect == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p6.a.e(obj);
                }
                return x.f8464a;
            default:
                int i6 = this.f4862b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        p6.a.e(obj);
                        return obj;
                    }
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p6.a.e(obj);
                r7.h data2 = this.f4863l.f4868b.getData();
                this.f4862b = 1;
                Object objJ = k0.j(data2, this);
                u6.a aVar2 = u6.a.f10763a;
                return objJ == aVar2 ? aVar2 : objJ;
        }
    }
}
