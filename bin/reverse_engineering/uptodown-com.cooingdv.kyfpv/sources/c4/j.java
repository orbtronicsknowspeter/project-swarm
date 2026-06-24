package c4;

import android.content.Context;
import com.uptodown.R;
import com.uptodown.activities.AppInstalledDetailsActivity;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1743b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AppInstalledDetailsActivity f1744l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(AppInstalledDetailsActivity appInstalledDetailsActivity, t6.c cVar, int i) {
        super(2, cVar);
        this.f1742a = i;
        this.f1744l = appInstalledDetailsActivity;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f1742a) {
            case 0:
                return new j(this.f1744l, cVar, 0);
            case 1:
                return new j(this.f1744l, cVar, 1);
            case 2:
                return new j(this.f1744l, cVar, 2);
            case 3:
                return new j(this.f1744l, cVar, 3);
            default:
                return new j(this.f1744l, cVar, 4);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f1742a) {
        }
        return ((j) create(a0Var, cVar)).invokeSuspend(p6.x.f8464a);
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        x4.r rVarA;
        Object objA;
        x4.j jVar;
        int i = this.f1742a;
        int i6 = 0;
        AppInstalledDetailsActivity appInstalledDetailsActivity = this.f1744l;
        u6.a aVar = u6.a.f10763a;
        p6.x xVar = p6.x.f8464a;
        t6.c cVar = null;
        switch (i) {
            case 0:
                int i10 = this.f1743b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        p6.a.e(obj);
                    }
                    break;
                } else {
                    p6.a.e(obj);
                    e1.c0 c0Var = j5.g.D;
                    AppInstalledDetailsActivity appInstalledDetailsActivity2 = this.f1744l;
                    Context applicationContext = appInstalledDetailsActivity2.getApplicationContext();
                    applicationContext.getClass();
                    j5.g gVarL = c0Var.l(applicationContext);
                    gVarL.b();
                    x4.e eVar = appInstalledDetailsActivity2.f3302b0;
                    eVar.getClass();
                    String str = eVar.f11124l;
                    str.getClass();
                    x4.q2 q2VarY = gVarL.Y(str);
                    t6.c cVar2 = null;
                    if (q2VarY != null) {
                        Context applicationContext2 = appInstalledDetailsActivity2.getApplicationContext();
                        applicationContext2.getClass();
                        rVarA = q2VarY.a(applicationContext2);
                    } else {
                        rVarA = null;
                    }
                    gVarL.c();
                    if (q2VarY != null && !q2VarY.c()) {
                        v7.e eVar2 = o7.m0.f8289a;
                        p7.c cVar3 = t7.n.f10349a;
                        b5.l lVar = new b5.l(appInstalledDetailsActivity2, q2VarY, rVarA, cVar2, 1);
                        this.f1743b = 1;
                        if (o7.c0.C(lVar, cVar3, this) == aVar) {
                        }
                    }
                }
                break;
            case 1:
                int i11 = this.f1743b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        p6.a.e(obj);
                        objA = ((p6.k) obj).f8445a;
                    }
                    break;
                } else {
                    p6.a.e(obj);
                    x4.e eVar3 = appInstalledDetailsActivity.f3302b0;
                    eVar3.getClass();
                    e1.s0 s0Var = new e1.s0(appInstalledDetailsActivity, eVar3.F);
                    this.f1743b = 1;
                    objA = s0Var.a(this);
                    if (objA == aVar) {
                    }
                }
                if (!(objA instanceof p6.j)) {
                    x4.g gVar = (x4.g) objA;
                    appInstalledDetailsActivity.f3303c0 = gVar;
                    if (!appInstalledDetailsActivity.isFinishing() && (jVar = gVar.G) != null && jVar.f11231p == 1) {
                        appInstalledDetailsActivity.R0().Q.setText(appInstalledDetailsActivity.getString(R.string.app_detail_play_button));
                    }
                }
                Throwable thA = p6.k.a(objA);
                if (thA != null) {
                    int i12 = s4.y0.f9324l;
                    if (d0.b.J(thA)) {
                        appInstalledDetailsActivity.J();
                    }
                }
                break;
            case 2:
                int i13 = this.f1743b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        p6.a.e(obj);
                    }
                    break;
                } else {
                    p6.a.e(obj);
                    this.f1743b = 1;
                    if (AppInstalledDetailsActivity.N0(appInstalledDetailsActivity, this) == aVar) {
                    }
                }
                break;
            case 3:
                int i14 = this.f1743b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        p6.a.e(obj);
                    }
                    break;
                } else {
                    p6.a.e(obj);
                    this.f1743b = 1;
                    int i15 = AppInstalledDetailsActivity.f3301e0;
                    v7.e eVar4 = o7.m0.f8289a;
                    Object objC = o7.c0.C(new j(appInstalledDetailsActivity, cVar, i6), v7.d.f10885a, this);
                    if (objC != aVar) {
                        objC = xVar;
                    }
                    if (objC == aVar) {
                    }
                }
                break;
            default:
                int i16 = this.f1743b;
                if (i16 != 0) {
                    if (i16 != 1) {
                        androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        p6.a.e(obj);
                    }
                    break;
                } else {
                    p6.a.e(obj);
                    this.f1743b = 1;
                    int i17 = AppInstalledDetailsActivity.f3301e0;
                    v7.e eVar5 = o7.m0.f8289a;
                    Object objC2 = o7.c0.C(new j(appInstalledDetailsActivity, cVar, i6), v7.d.f10885a, this);
                    if (objC2 != aVar) {
                        objC2 = xVar;
                    }
                    if (objC2 == aVar) {
                    }
                }
                break;
        }
        return xVar;
    }
}
