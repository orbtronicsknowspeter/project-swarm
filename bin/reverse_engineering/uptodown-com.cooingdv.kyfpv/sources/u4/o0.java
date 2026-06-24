package u4;

import android.content.Context;
import x4.v2;
import x4.w2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class o0 extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10561b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f10562l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f10563m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v0 f10564n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(Context context, String str, v0 v0Var, t6.c cVar, int i) {
        super(2, cVar);
        this.f10560a = i;
        this.f10562l = context;
        this.f10563m = str;
        this.f10564n = v0Var;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f10560a) {
            case 0:
                return new o0(this.f10562l, this.f10563m, this.f10564n, cVar, 0);
            default:
                return new o0(this.f10562l, this.f10563m, this.f10564n, cVar, 1);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f10560a) {
        }
        return ((o0) create(a0Var, cVar)).invokeSuspend(p6.x.f8464a);
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f10560a) {
            case 0:
                int i = this.f10561b;
                if (i == 0) {
                    p6.a.e(obj);
                    this.f10561b = 1;
                    obj = w2.f11431z.d(this.f10562l, this.f10563m, this);
                    u6.a aVar = u6.a.f10763a;
                    if (obj == aVar) {
                    }
                } else if (i != 1) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                } else {
                    p6.a.e(obj);
                }
                r7.o0 o0Var = this.f10564n.A;
                j5.r rVar = new j5.r((v2) obj);
                o0Var.getClass();
                o0Var.g(null, rVar);
                break;
            default:
                int i6 = this.f10561b;
                if (i6 == 0) {
                    p6.a.e(obj);
                    this.f10561b = 1;
                    obj = w2.f11431z.j(this.f10562l, this.f10563m, this);
                    u6.a aVar2 = u6.a.f10763a;
                    if (obj == aVar2) {
                    }
                } else if (i6 != 1) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                } else {
                    p6.a.e(obj);
                }
                r7.o0 o0Var2 = this.f10564n.A;
                j5.r rVar2 = new j5.r((v2) obj);
                o0Var2.getClass();
                o0Var2.g(null, rVar2);
                break;
        }
        return p6.x.f8464a;
    }
}
