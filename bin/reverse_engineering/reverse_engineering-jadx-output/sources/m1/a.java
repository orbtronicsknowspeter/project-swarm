package m1;

import a4.f;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.ComponentName;
import android.content.SharedPreferences;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.support.v4.media.g;
import android.util.Log;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.google.android.gms.internal.measurement.c0;
import com.google.android.gms.internal.measurement.m0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import e1.b3;
import e1.f0;
import e1.g1;
import e1.h1;
import e1.i0;
import e1.j2;
import e1.j3;
import e1.o;
import e1.r3;
import e1.t1;
import e1.u3;
import e1.u4;
import e1.v3;
import e1.w0;
import e1.w3;
import e1.z3;
import f0.i;
import g0.k;
import g0.l;
import g0.m;
import j$.util.Objects;
import j0.e;
import j0.t;
import j1.c;
import j1.d;
import j1.h;
import j1.j;
import j1.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import k0.l0;
import k0.s;
import k0.y;
import x4.r;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7269b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f7270l;

    public a(w3 w3Var, j3 j3Var) {
        this.f7268a = 12;
        this.f7269b = j3Var;
        Objects.requireNonNull(w3Var);
        this.f7270l = w3Var;
    }

    private final void a() {
        b3 b3Var = (b3) this.f7270l;
        t1 t1Var = b3Var.f3875a;
        g1 g1Var = t1Var.f4263n;
        w0 w0Var = t1Var.f4264o;
        t1.k(g1Var);
        g1Var.g();
        g1Var.g();
        o oVarB = o.b(g1Var.k().getString("dma_consent_settings", null));
        o oVar = (o) this.f7269b;
        int i = oVar.f4167a;
        if (!j2.l(i, oVarB.f4167a)) {
            t1.m(w0Var);
            w0Var.f4345u.c(Integer.valueOf(i), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor editorEdit = g1Var.k().edit();
        editorEdit.putString("dma_consent_settings", oVar.f4168b);
        editorEdit.apply();
        t1.m(w0Var);
        w0Var.f4346w.c(oVar, "Setting DMA consent(FE)");
        t1 t1Var2 = b3Var.f3875a;
        if (t1Var2.p().q()) {
            w3 w3VarP = t1Var2.p();
            w3VarP.g();
            w3VarP.h();
            w3VarP.u(new u3(w3VarP, 1));
            return;
        }
        w3 w3VarP2 = t1Var2.p();
        w3VarP2.g();
        w3VarP2.h();
        if (w3VarP2.p()) {
            w3VarP2.u(new r3(w3VarP2, w3VarP2.w(false)));
        }
    }

    private final void b() {
        b3 b3Var = ((AppMeasurementDynamiteService) this.f7270l).i.v;
        t1.l(b3Var);
        g gVar = (g) this.f7269b;
        b3Var.g();
        b3Var.h();
        g gVar2 = b3Var.f3810m;
        if (gVar != gVar2) {
            y.i(gVar2 == null, "EventInterceptor already set.");
        }
        b3Var.f3810m = gVar;
    }

    private final void c() {
        w3 w3Var = (w3) this.f7270l;
        i0 i0Var = w3Var.f4359m;
        t1 t1Var = w3Var.f3875a;
        if (i0Var == null) {
            w0 w0Var = t1Var.f4264o;
            t1.m(w0Var);
            w0Var.f4339o.b("Failed to send current screen to service");
            return;
        }
        try {
            j3 j3Var = (j3) this.f7269b;
            if (j3Var == null) {
                i0Var.j(0L, null, null, t1Var.f4259a.getPackageName());
            } else {
                i0Var.j(j3Var.f4059c, j3Var.f4057a, j3Var.f4058b, t1Var.f4259a.getPackageName());
            }
            w3Var.t();
        } catch (RemoteException e10) {
            w0 w0Var2 = t1Var.f4264o;
            t1.m(w0Var2);
            w0Var2.f4339o.c(e10, "Failed to send current screen to the service");
        }
    }

    private final void d() {
        ((v3) this.f7270l).f4330l.r((ComponentName) this.f7269b);
    }

    private final void e() {
        w3 w3Var = ((v3) this.f7270l).f4330l;
        w3Var.f4359m = null;
        if (((h0.b) this.f7269b).f5395b != 7777) {
            w3Var.v();
            return;
        }
        if (w3Var.f4362p == null) {
            w3Var.f4362p = Executors.newScheduledThreadPool(1);
        }
        w3Var.f4362p.schedule(new f(this, 6), ((Long) f0.a0.a(null)).longValue(), TimeUnit.MILLISECONDS);
    }

    private final void f() {
        u4 u4Var = (u4) this.f7269b;
        u4Var.B();
        Runnable runnable = (Runnable) this.f7270l;
        u4Var.b().g();
        if (u4Var.f4319y == null) {
            u4Var.f4319y = new ArrayList();
        }
        u4Var.f4319y.add(runnable);
        u4Var.q();
    }

    private final /* synthetic */ void g() {
        i iVar = (i) this.f7269b;
        JobParameters jobParameters = (JobParameters) this.f7270l;
        Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
        ((z3) ((Service) iVar.f4811b)).c(jobParameters);
    }

    private final void h() {
        f5.a aVar = (f5.a) this.f7270l;
        List<Fragment> fragments = aVar.getSupportFragmentManager().getFragments();
        fragments.getClass();
        if (fragments.isEmpty()) {
            return;
        }
        Fragment fragment = fragments.get(0);
        String string = aVar.getString(2131952683, ((r) this.f7269b).f11366w);
        string.getClass();
        Toast.makeText(fragment.getContext(), string, 1).show();
    }

    private final void i() {
        k kVar = (k) this.f7269b;
        IBinder iBinder = (IBinder) this.f7270l;
        synchronized (kVar) {
            if (iBinder == null) {
                kVar.a("Null service connection");
                return;
            }
            try {
                kVar.f5088l = new g(iBinder);
                kVar.f5086a = 2;
                kVar.f5091o.f5099b.execute(new g0.i(kVar, 0));
            } catch (RemoteException e10) {
                kVar.a(e10.getMessage());
            }
        }
    }

    private final void j() {
        k kVar = (k) this.f7269b;
        int i = ((l) this.f7270l).f5092a;
        synchronized (kVar) {
            l lVar = (l) kVar.f5090n.get(i);
            if (lVar != null) {
                Log.w("MessengerIpcClient", "Timing out request: " + i);
                kVar.f5090n.remove(i);
                lVar.b(new m("Timed out waiting for response", null));
                kVar.c();
            }
        }
    }

    private final void k() {
        k0.i iVar;
        h0.b bVar = (h0.b) this.f7269b;
        g8.g gVar = (g8.g) this.f7270l;
        i0.b bVar2 = (i0.b) gVar.f5382b;
        j0.m mVar = (j0.m) ((e) gVar.f5386o).f6499s.get((j0.a) gVar.f5383l);
        if (mVar == null) {
            return;
        }
        if (bVar.f5395b != 0) {
            mVar.o(bVar, null);
            return;
        }
        gVar.f5381a = true;
        if (bVar2.l()) {
            if (!gVar.f5381a || (iVar = (k0.i) gVar.f5384m) == null) {
                return;
            }
            bVar2.h(iVar, (Set) gVar.f5385n);
            return;
        }
        try {
            bVar2.h(null, bVar2.a());
        } catch (SecurityException e10) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
            bVar2.b("Failed to get service from broker.");
            mVar.o(new h0.b(null, null, 10), null);
        }
    }

    private final void l() {
        k0.i l0Var;
        t tVar = (t) this.f7270l;
        h1.e eVar = (h1.e) this.f7269b;
        h0.b bVar = eVar.f5454b;
        if (bVar.f5395b == 0) {
            s sVar = eVar.f5455l;
            y.g(sVar);
            h0.b bVar2 = sVar.f6928l;
            if (bVar2.f5395b != 0) {
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(bVar2)), new Exception());
                tVar.f6532p.l(bVar2);
                tVar.f6531o.o();
                return;
            }
            g8.g gVar = tVar.f6532p;
            IBinder iBinder = sVar.f6927b;
            if (iBinder == null) {
                l0Var = null;
            } else {
                int i = k0.a.j;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                l0Var = iInterfaceQueryLocalInterface instanceof k0.i ? (k0.i) iInterfaceQueryLocalInterface : new l0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 3);
            }
            Set set = tVar.f6529m;
            gVar.getClass();
            if (l0Var == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                gVar.l(new h0.b(null, null, 4));
            } else {
                gVar.f5384m = l0Var;
                gVar.f5385n = set;
                if (gVar.f5381a) {
                    ((i0.b) gVar.f5382b).h(l0Var, set);
                }
            }
        } else {
            tVar.f6532p.l(bVar);
        }
        tVar.f6531o.o();
    }

    private final void m() {
        p pVar = (p) this.f7269b;
        boolean z9 = pVar.f6563d;
        j1.l lVar = (j1.l) this.f7270l;
        if (z9) {
            lVar.f6553m.n();
            return;
        }
        try {
            ((j1.l) this.f7270l).f6553m.k(lVar.f6552l.g(pVar));
        } catch (j1.g e10) {
            boolean z10 = e10.getCause() instanceof Exception;
            j1.l lVar2 = (j1.l) this.f7270l;
            if (!z10) {
                lVar2.f6553m.m(e10);
            } else {
                lVar2.f6553m.m((Exception) e10.getCause());
            }
        } catch (Exception e11) {
            ((j1.l) this.f7270l).f6553m.m(e11);
        }
    }

    private final void n() {
        j1.l lVar = (j1.l) this.f7270l;
        try {
            p pVar = (p) lVar.f6552l.g((p) this.f7269b);
            if (pVar == null) {
                lVar.i(new NullPointerException("Continuation returned null"));
                return;
            }
            j1.o oVar = j.f6541b;
            pVar.c(oVar, lVar);
            pVar.b(oVar, lVar);
            pVar.f6561b.e(new j1.m((Executor) oVar, (c) lVar));
            pVar.p();
        } catch (j1.g e10) {
            if (!(e10.getCause() instanceof Exception)) {
                lVar.f6553m.m(e10);
            } else {
                lVar.f6553m.m((Exception) e10.getCause());
            }
        } catch (Exception e11) {
            lVar.f6553m.m(e11);
        }
    }

    private final void o() {
        j1.m mVar = (j1.m) this.f7270l;
        synchronized (mVar.f6556l) {
            ((d) mVar.f6557m).s((p) this.f7269b);
        }
    }

    private final void p() {
        j1.m mVar = (j1.m) this.f7270l;
        synchronized (mVar.f6556l) {
            try {
                j1.e eVar = (j1.e) mVar.f6557m;
                if (eVar != null) {
                    Exception excF = ((p) this.f7269b).f();
                    y.g(excF);
                    eVar.i(excF);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void q() {
        j1.m mVar = (j1.m) this.f7270l;
        synchronized (mVar.f6556l) {
            try {
                j1.f fVar = (j1.f) mVar.f6557m;
                if (fVar != null) {
                    fVar.c(((p) this.f7269b).g());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void r() {
        j1.m mVar = (j1.m) this.f7270l;
        try {
            p pVarQ = ((h) mVar.f6556l).q(((p) this.f7269b).g());
            j1.o oVar = j.f6541b;
            pVarQ.c(oVar, mVar);
            pVarQ.b(oVar, mVar);
            pVarQ.f6561b.e(new j1.m((Executor) oVar, (c) mVar));
            pVarQ.p();
        } catch (j1.g e10) {
            if (e10.getCause() instanceof Exception) {
                mVar.i((Exception) e10.getCause());
            } else {
                ((p) mVar.f6557m).m(e10);
            }
        } catch (CancellationException unused) {
            mVar.f();
        } catch (Exception e11) {
            ((p) mVar.f6557m).m(e11);
        }
    }

    private final void s() {
        p pVar = (p) this.f7269b;
        try {
            pVar.k(((Callable) this.f7270l).call());
        } catch (Exception e10) {
            pVar.m(e10);
        } catch (Throwable th) {
            pVar.m(new RuntimeException(th));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:145|(1:147)(27:150|470|151|152|(1:155)(23:157|(1:159)|468|160|(7:162|(1:164)(1:166)|464|167|472|168|169)|149|173|(2:175|(2:177|(2:179|(2:181|(2:183|(2:185|(1:187)(1:188))(1:189))(1:190))(1:191))(1:192))(1:193))(1:194)|195|458|196|(1:198)(1:199)|200|(1:202)|203|206|(1:208)(7:210|(0)(1:213)|(3:456|215|(1:217)(1:218))(0)|(2:224|(1:226)(4:227|(3:230|(1:485)(1:486)|228)|484|233))(1:233)|(1:235)(1:236)|237|(31:239|(1:241)(1:242)|243|(1:245)|246|(1:248)(1:249)|250|(2:252|(2:257|(1:259))(1:(3:256|257|(0))(1:261)))(0)|260|262|(20:265|267|(1:269)|(1:283)(1:284)|285|(1:287)|288|(2:293|(2:299|(2:306|(2:307|(1:481)(2:309|(2:482|311)(1:483)))))(1:298))(1:292)|312|(3:316|(1:318)|319)|320|(1:322)(1:323)|324|(1:328)|329|(3:331|(7:333|(1:335)(1:336)|337|(1:339)|340|(4:344|(1:346)|347|(1:349))|350)(1:352)|351)(10:353|(2:355|(2:368|369)(3:358|(5:360|(1:362)(1:363)|364|(1:366)|367)(0)|369))(1:370)|371|(1:373)|374|454|375|376|380|(5:382|(1:384)(1:385)|(1:389)|(1:391)|392))|393|(3:395|(1:397)(1:398)|(5:400|(1:402)|403|(1:405)|406))|407|496)(1:266)|270|(1:281)|280|(0)(0)|285|(0)|288|(3:290|293|(3:296|299|(4:302|304|306|(3:307|(0)(0)|483)))(0))(0)|312|(4:314|316|(0)|319)(0)|320|(0)(0)|324|(2:326|328)|329|(0)(0)|393|(0)|407|496)(2:408|497))|209|(0)(0)|(0)(0)|(0)(0)|237|(0)(0))|156|468|160|(0)(0)|149|173|(0)(0)|195|458|196|(0)(0)|200|(0)|203|206|(0)(0)|209|(0)(0)|(0)(0)|(0)(0)|237|(0)(0))|148|149|173|(0)(0)|195|458|196|(0)(0)|200|(0)|203|206|(0)(0)|209|(0)(0)|(0)(0)|(0)(0)|237|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(26:150|(2:470|151)|152|(1:155)(23:157|(1:159)|468|160|(7:162|(1:164)(1:166)|464|167|472|168|169)|149|173|(2:175|(2:177|(2:179|(2:181|(2:183|(2:185|(1:187)(1:188))(1:189))(1:190))(1:191))(1:192))(1:193))(1:194)|195|458|196|(1:198)(1:199)|200|(1:202)|203|206|(1:208)(7:210|(0)(1:213)|(3:456|215|(1:217)(1:218))(0)|(2:224|(1:226)(4:227|(3:230|(1:485)(1:486)|228)|484|233))(1:233)|(1:235)(1:236)|237|(31:239|(1:241)(1:242)|243|(1:245)|246|(1:248)(1:249)|250|(2:252|(2:257|(1:259))(1:(3:256|257|(0))(1:261)))(0)|260|262|(20:265|267|(1:269)|(1:283)(1:284)|285|(1:287)|288|(2:293|(2:299|(2:306|(2:307|(1:481)(2:309|(2:482|311)(1:483)))))(1:298))(1:292)|312|(3:316|(1:318)|319)|320|(1:322)(1:323)|324|(1:328)|329|(3:331|(7:333|(1:335)(1:336)|337|(1:339)|340|(4:344|(1:346)|347|(1:349))|350)(1:352)|351)(10:353|(2:355|(2:368|369)(3:358|(5:360|(1:362)(1:363)|364|(1:366)|367)(0)|369))(1:370)|371|(1:373)|374|454|375|376|380|(5:382|(1:384)(1:385)|(1:389)|(1:391)|392))|393|(3:395|(1:397)(1:398)|(5:400|(1:402)|403|(1:405)|406))|407|496)(1:266)|270|(1:281)|280|(0)(0)|285|(0)|288|(3:290|293|(3:296|299|(4:302|304|306|(3:307|(0)(0)|483)))(0))(0)|312|(4:314|316|(0)|319)(0)|320|(0)(0)|324|(2:326|328)|329|(0)(0)|393|(0)|407|496)(2:408|497))|209|(0)(0)|(0)(0)|(0)(0)|237|(0)(0))|156|468|160|(0)(0)|149|173|(0)(0)|195|458|196|(0)(0)|200|(0)|203|206|(0)(0)|209|(0)(0)|(0)(0)|(0)(0)|237|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x03cf, code lost:
    
        r7 = "Unknown";
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0493, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0494, code lost:
    
        e1.t1.m(r11);
        r11.f4339o.d(e1.w0.o(r12), "Fetching Google App Id failed with exception. appId", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03b2 A[Catch: NameNotFoundException -> 0x03cf, TryCatch #10 {NameNotFoundException -> 0x03cf, blocks: (B:160:0x03a7, B:162:0x03b2, B:164:0x03be), top: B:468:0x03a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0483 A[Catch: IllegalStateException -> 0x0493, TRY_LEAVE, TryCatch #3 {IllegalStateException -> 0x0493, blocks: (B:196:0x0471, B:200:0x047f, B:202:0x0483), top: B:458:0x0471 }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0772  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x07dd  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x080c  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x081e  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0844  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x08b2  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x095a  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x09cc  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0a20  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0a8b  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x04d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:481:0x07b1 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v74, types: [e1.a3] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 3108
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.a.run():void");
    }

    public String toString() {
        switch (this.f7268a) {
            case 0:
                b5.m mVar = new b5.m(a.class.getSimpleName());
                g gVar = (g) this.f7270l;
                g gVar2 = new g(26, false);
                ((g) mVar.f1063m).f248l = gVar2;
                mVar.f1063m = gVar2;
                gVar2.f247b = gVar;
                return mVar.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, int i, boolean z9) {
        this.f7268a = i;
        this.f7270l = obj;
        this.f7269b = obj2;
    }

    public a(h1 h1Var, c0 c0Var, h1 h1Var2) {
        this.f7268a = 4;
        this.f7269b = c0Var;
        this.f7270l = h1Var;
    }

    public a(b3 b3Var, m0 m0Var) {
        this.f7268a = 7;
        this.f7269b = m0Var;
        Objects.requireNonNull(b3Var);
        this.f7270l = b3Var;
    }

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.f7268a = i;
        this.f7269b = obj;
        this.f7270l = obj2;
    }

    public a(i iVar, u4 u4Var, Runnable runnable) {
        this.f7268a = 15;
        this.f7269b = u4Var;
        this.f7270l = runnable;
    }
}
