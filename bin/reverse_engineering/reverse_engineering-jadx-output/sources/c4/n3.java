package c4;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.uptodown.activities.MainActivity;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class n3 extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1893b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ MainActivity f1894l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f1895m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n3(MainActivity mainActivity, long j, t6.c cVar, int i) {
        super(2, cVar);
        this.f1892a = i;
        this.f1894l = mainActivity;
        this.f1895m = j;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f1892a) {
            case 0:
                return new n3(this.f1894l, this.f1895m, cVar, 0);
            default:
                return new n3(this.f1894l, this.f1895m, cVar, 1);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f1892a) {
        }
        return ((n3) create(a0Var, cVar)).invokeSuspend(p6.x.f8463a);
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objA2;
        int i = this.f1892a;
        p6.x xVar = p6.x.f8463a;
        long j = this.f1895m;
        u6.a aVar = u6.a.f10762a;
        MainActivity mainActivity = this.f1894l;
        PackageInfo packageInfoE = null;
        switch (i) {
            case 0:
                int i6 = this.f1893b;
                if (i6 == 0) {
                    p6.a.e(obj);
                    e1.s0 s0Var = new e1.s0(mainActivity, j);
                    this.f1893b = 1;
                    objA = s0Var.a(this);
                    if (objA == aVar) {
                    }
                } else if (i6 != 1) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                } else {
                    p6.a.e(obj);
                    objA = ((p6.k) obj).f8444a;
                }
                if (!(objA instanceof p6.j)) {
                    mainActivity.x0((x4.g) objA);
                    mainActivity.f3320s0 = -1L;
                }
                Throwable thA = p6.k.a(objA);
                if (thA != null) {
                    mainActivity.f3320s0 = -1L;
                    int i10 = s4.y0.f9323l;
                    if (d0.b.J(thA)) {
                        mainActivity.J();
                        break;
                    } else {
                        String message = thA.getMessage();
                        if (message != null && message.length() != 0) {
                            String message2 = thA.getMessage();
                            message2.getClass();
                            mainActivity.A(message2);
                            break;
                        }
                    }
                }
                break;
            default:
                int i11 = this.f1893b;
                if (i11 == 0) {
                    p6.a.e(obj);
                    e1.s0 s0Var2 = new e1.s0(mainActivity, j);
                    this.f1893b = 1;
                    objA2 = s0Var2.a(this);
                    if (objA2 == aVar) {
                    }
                } else if (i11 != 1) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                } else {
                    p6.a.e(obj);
                    objA2 = ((p6.k) obj).f8444a;
                }
                if (!(objA2 instanceof p6.j)) {
                    x4.g gVar = (x4.g) objA2;
                    String str = gVar.F;
                    if (str != null) {
                        try {
                            PackageManager packageManager = mainActivity.getPackageManager();
                            if (packageManager != null) {
                                packageInfoE = n4.i.e(packageManager, str, 0);
                            }
                            break;
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                    }
                    if (packageInfoE != null) {
                        MainActivity.N0(mainActivity);
                    } else {
                        MainActivity.M0(mainActivity, gVar);
                    }
                }
                Throwable thA2 = p6.k.a(objA2);
                if (thA2 != null) {
                    int i12 = s4.y0.f9323l;
                    if (!d0.b.J(thA2)) {
                        MainActivity.N0(mainActivity);
                    } else {
                        mainActivity.J();
                    }
                }
                break;
        }
        return xVar;
    }
}
