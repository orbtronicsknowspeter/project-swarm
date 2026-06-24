package o5;

import com.uptodown.workers.PreRegisterWorker;
import o7.a0;
import o7.c0;
import o7.m0;
import p6.x;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PreRegisterWorker f8194b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(PreRegisterWorker preRegisterWorker, t6.c cVar) {
        super(2, cVar);
        this.f8194b = preRegisterWorker;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        return new l(this.f8194b, cVar);
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((a0) obj, (t6.c) obj2)).invokeSuspend(x.f8464a);
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.f8193a;
        t6.c cVar = null;
        x xVar = x.f8464a;
        if (i != 0) {
            if (i == 1) {
                p6.a.e(obj);
                return xVar;
            }
            androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p6.a.e(obj);
        this.f8193a = 1;
        v7.e eVar = m0.f8289a;
        Object objC = c0.C(new c4.g(this.f8194b, cVar, 16), v7.d.f10885a, this);
        u6.a aVar = u6.a.f10763a;
        if (objC != aVar) {
            objC = xVar;
        }
        return objC == aVar ? aVar : xVar;
    }
}
