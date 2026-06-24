package c4;

import android.os.Bundle;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import androidx.work.Data;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.MainActivity;
import com.uptodown.workers.DownloadApkWorker;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class o3 extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f1937b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f1938l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f1939m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f1940n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f1941o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f1942p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(MainActivity mainActivity, long j, long j6, long j10, String str, boolean z9, t6.c cVar) {
        super(2, cVar);
        this.f1937b = mainActivity;
        this.f1938l = j;
        this.f1939m = j6;
        this.f1940n = j10;
        this.f1941o = str;
        this.f1942p = z9;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        return new o3(this.f1937b, this.f1938l, this.f1939m, this.f1940n, this.f1941o, this.f1942p, cVar);
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((o3) create((o7.a0) obj, (t6.c) obj2)).invokeSuspend(p6.x.f8464a);
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        int i = this.f1936a;
        MainActivity mainActivity = this.f1937b;
        if (i == 0) {
            p6.a.e(obj);
            e1.s0 s0Var = new e1.s0(mainActivity, this.f1938l);
            this.f1936a = 1;
            objA = s0Var.a(this);
            u6.a aVar = u6.a.f10763a;
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p6.a.e(obj);
            objA = ((p6.k) obj).f8445a;
        }
        if (!(objA instanceof p6.j)) {
            x4.g gVar = (x4.g) objA;
            if (gVar.k() && gVar.j()) {
                x4.r rVar = new x4.r();
                rVar.f11362q = gVar.f11159a;
                rVar.f11367w = gVar.f11160b;
                long j = this.f1939m;
                gVar.J = j;
                rVar.f11359n = this.f1940n;
                String str = this.f1941o;
                gVar.P = str;
                rVar.f11356b = gVar.F;
                rVar.v = gVar.f11188u;
                x4.j0 j0Var = new x4.j0();
                j0Var.f11236l = j;
                j0Var.f11240p = str;
                j0Var.f11238n = 0L;
                rVar.F.add(j0Var);
                int iR = rVar.r(mainActivity);
                if (this.f1942p) {
                    x4.k kVar = new x4.k();
                    kVar.f11251d = iR;
                    kVar.f11250c = gVar.F;
                    UptodownApp.f3294g0 = kVar;
                    Bundle bundleF = k0.k.f(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "detected", "source", "captured_url");
                    bundleF.putString("appId", String.valueOf(gVar.f11159a));
                    bundleF.putString("fileId", String.valueOf(gVar.J));
                    new android.support.v4.media.g(mainActivity, 20).E(bundleF, "deeplink");
                }
                float f = UptodownApp.I;
                if (!b4.d.p(mainActivity, "downloadApkWorker")) {
                    WorkManager.Companion.getInstance(mainActivity).enqueue(((OneTimeWorkRequest.Builder) androidx.lifecycle.l.t(DownloadApkWorker.class, "downloadApkWorker")).setInputData(new Data.Builder().putInt("downloadId", iR).build()).build());
                }
            } else {
                String string = mainActivity.getString(R.string.app_detail_not_available);
                string.getClass();
                mainActivity.A(string);
            }
            mainActivity.x0(gVar);
            mainActivity.f3321s0 = -1L;
        }
        Throwable thA = p6.k.a(objA);
        if (thA != null) {
            mainActivity.f3321s0 = -1L;
            int i6 = s4.y0.f9324l;
            if (d0.b.J(thA)) {
                mainActivity.J();
            } else {
                String string2 = mainActivity.getString(R.string.app_detail_not_available);
                string2.getClass();
                mainActivity.A(string2);
            }
        }
        return p6.x.f8464a;
    }
}
