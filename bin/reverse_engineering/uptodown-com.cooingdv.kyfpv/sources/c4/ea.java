package c4;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.uptodown.UptodownApp;
import com.uptodown.activities.SecurityActivity;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class ea extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1564b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SecurityActivity f1565l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ea(SecurityActivity securityActivity, t6.c cVar, int i) {
        super(2, cVar);
        this.f1563a = i;
        this.f1565l = securityActivity;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f1563a) {
            case 0:
                return new ea(this.f1565l, cVar, 0);
            default:
                return new ea(this.f1565l, cVar, 1);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f1563a) {
            case 0:
                return ((ea) create(a0Var, cVar)).invokeSuspend(p6.x.f8464a);
            default:
                ((ea) create(a0Var, cVar)).invokeSuspend(p6.x.f8464a);
                return u6.a.f10763a;
        }
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objC;
        int i = this.f1563a;
        u6.a aVar = u6.a.f10763a;
        SecurityActivity securityActivity = this.f1565l;
        t6.c cVar = null;
        switch (i) {
            case 0:
                int i6 = this.f1564b;
                if (i6 == 0) {
                    p6.a.e(obj);
                    r.k kVar = new r.k();
                    kVar.f8835a = securityActivity;
                    this.f1564b = 1;
                    objC = kVar.c(this);
                    if (objC == aVar) {
                        return aVar;
                    }
                } else {
                    if (i6 != 1) {
                        androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p6.a.e(obj);
                    objC = ((p6.k) obj).f8445a;
                }
                int i10 = 0;
                if (!(objC instanceof p6.j)) {
                    UptodownApp.f3298k0 = (ArrayList) objC;
                    securityActivity.P0();
                    LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(securityActivity);
                    v7.e eVar = o7.m0.f8289a;
                    o7.c0.s(lifecycleScope, t7.n.f10349a, null, new ga(securityActivity, cVar, i10), 2);
                    securityActivity.f3353d0 = false;
                }
                if (p6.k.a(objC) != null) {
                    float f = UptodownApp.I;
                    UptodownApp.f3298k0 = new ArrayList();
                    securityActivity.P0();
                    LifecycleCoroutineScope lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(securityActivity);
                    v7.e eVar2 = o7.m0.f8289a;
                    o7.c0.s(lifecycleScope2, t7.n.f10349a, null, new ga(securityActivity, cVar, i10), 2);
                    securityActivity.f3353d0 = false;
                }
                return p6.x.f8464a;
            default:
                int i11 = this.f1564b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        throw androidx.lifecycle.l.q(obj);
                    }
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p6.a.e(obj);
                int i12 = SecurityActivity.f3350g0;
                r7.o0 o0Var = ((ja) securityActivity.f3351b0.getValue()).f1768b;
                c3.y0 y0Var = new c3.y0(securityActivity, 12);
                this.f1564b = 1;
                o0Var.collect(y0Var, this);
                return aVar;
        }
    }
}
