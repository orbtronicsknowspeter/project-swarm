package c4;

import android.content.Intent;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AppDetailActivity;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class x extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2284b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k0 f2285l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f2286m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(k0 k0Var, long j, t6.c cVar, int i) {
        super(2, cVar);
        this.f2283a = i;
        this.f2285l = k0Var;
        this.f2286m = j;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f2283a) {
            case 0:
                return new x(this.f2285l, this.f2286m, cVar, 0);
            default:
                return new x(this.f2285l, this.f2286m, cVar, 1);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f2283a) {
        }
        return ((x) create(a0Var, cVar)).invokeSuspend(p6.x.f8464a);
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objA2;
        String message;
        int i = this.f2283a;
        p6.x xVar = p6.x.f8464a;
        long j = this.f2286m;
        u6.a aVar = u6.a.f10763a;
        k0 k0Var = this.f2285l;
        switch (i) {
            case 0:
                int i6 = this.f2284b;
                if (i6 == 0) {
                    p6.a.e(obj);
                    e1.s0 s0Var = new e1.s0(k0Var, j);
                    this.f2284b = 1;
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
                    k0Var.x0((x4.g) objA);
                }
                Throwable thA = p6.k.a(objA);
                if (thA != null) {
                    int i10 = s4.y0.f9324l;
                    if (!d0.b.J(thA)) {
                        String string = k0Var.getString(R.string.app_detail_not_found);
                        string.getClass();
                        k0Var.A(string);
                    } else {
                        k0Var.J();
                    }
                }
                break;
            default:
                int i11 = this.f2284b;
                if (i11 == 0) {
                    p6.a.e(obj);
                    e1.s0 s0Var2 = new e1.s0(k0Var, j);
                    this.f2284b = 1;
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
                    x4.g gVar = (x4.g) objA2;
                    if (!k0Var.isFinishing()) {
                        Intent intent = new Intent(k0Var, (Class<?>) AppDetailActivity.class);
                        intent.putExtra("appInfo", gVar);
                        float f = UptodownApp.I;
                        k0Var.startActivity(intent, b4.d.a(k0Var));
                    }
                }
                Throwable thA2 = p6.k.a(objA2);
                if (thA2 != null) {
                    int i12 = s4.y0.f9324l;
                    if (d0.b.J(thA2)) {
                        k0Var.J();
                        break;
                    } else if (k0Var.T() && (message = thA2.getMessage()) != null && message.length() != 0) {
                        String message2 = thA2.getMessage();
                        message2.getClass();
                        k0Var.A(message2);
                        break;
                    }
                }
                break;
        }
        return xVar;
    }
}
