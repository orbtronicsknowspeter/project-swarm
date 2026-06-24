package o5;

import androidx.work.ListenableWorker;
import com.uptodown.workers.MyAppUpdatedWorker;
import o7.a0;
import o7.c0;
import o7.m0;
import p6.x;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MyAppUpdatedWorker f8192b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(MyAppUpdatedWorker myAppUpdatedWorker, t6.c cVar) {
        super(2, cVar);
        this.f8192b = myAppUpdatedWorker;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        return new k(this.f8192b, cVar);
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((a0) obj, (t6.c) obj2)).invokeSuspend(x.f8464a);
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.f8191a;
        t6.c cVar = null;
        if (i == 0) {
            p6.a.e(obj);
            this.f8191a = 1;
            v7.e eVar = m0.f8289a;
            Object objC = c0.C(new c4.g(this.f8192b, cVar, 15), v7.d.f10885a, this);
            Object obj2 = u6.a.f10763a;
            if (objC != obj2) {
                objC = x.f8464a;
            }
            if (objC == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p6.a.e(obj);
        }
        return ListenableWorker.Result.success();
    }
}
