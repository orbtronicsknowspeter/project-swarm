package c4;

import com.uptodown.activities.MainActivity;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class h3 extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1671b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ MainActivity f1672l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x4.g f1673m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h3(MainActivity mainActivity, x4.g gVar, t6.c cVar, int i) {
        super(2, cVar);
        this.f1670a = i;
        this.f1672l = mainActivity;
        this.f1673m = gVar;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f1670a) {
            case 0:
                return new h3(this.f1672l, this.f1673m, cVar, 0);
            case 1:
                return new h3(this.f1672l, this.f1673m, cVar, 1);
            default:
                return new h3(this.f1672l, this.f1673m, cVar, 2);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f1670a) {
        }
        return ((h3) create(a0Var, cVar)).invokeSuspend(p6.x.f8464a);
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objA2;
        Object objA3;
        int i = this.f1670a;
        p6.x xVar = p6.x.f8464a;
        x4.g gVar = this.f1673m;
        u6.a aVar = u6.a.f10763a;
        MainActivity mainActivity = this.f1672l;
        switch (i) {
            case 0:
                int i6 = this.f1671b;
                if (i6 == 0) {
                    p6.a.e(obj);
                    e1.s0 s0Var = new e1.s0(mainActivity, gVar.f11159a);
                    this.f1671b = 1;
                    objA = s0Var.a(this);
                    if (objA == aVar) {
                    }
                } else if (i6 != 1) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                } else {
                    p6.a.e(obj);
                    objA = ((p6.k) obj).f8445a;
                }
                if (!(objA instanceof p6.j)) {
                    int i10 = MainActivity.G0;
                    mainActivity.w1((x4.g) objA);
                }
                break;
            case 1:
                int i11 = this.f1671b;
                if (i11 == 0) {
                    p6.a.e(obj);
                    e1.s0 s0Var2 = new e1.s0(mainActivity, gVar.f11159a);
                    this.f1671b = 1;
                    objA2 = s0Var2.a(this);
                    if (objA2 == aVar) {
                    }
                } else if (i11 != 1) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                } else {
                    p6.a.e(obj);
                    objA2 = ((p6.k) obj).f8445a;
                }
                if (!(objA2 instanceof p6.j)) {
                    int i12 = MainActivity.G0;
                    mainActivity.w1((x4.g) objA2);
                }
                break;
            default:
                int i13 = this.f1671b;
                if (i13 == 0) {
                    p6.a.e(obj);
                    e1.s0 s0Var3 = new e1.s0(mainActivity, gVar.f11159a);
                    this.f1671b = 1;
                    objA3 = s0Var3.a(this);
                    if (objA3 == aVar) {
                    }
                } else if (i13 != 1) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                } else {
                    p6.a.e(obj);
                    objA3 = ((p6.k) obj).f8445a;
                }
                if (!(objA3 instanceof p6.j)) {
                    int i14 = MainActivity.G0;
                    mainActivity.w1((x4.g) objA3);
                }
                break;
        }
        return xVar;
    }
}
