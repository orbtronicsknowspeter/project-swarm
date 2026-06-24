package com.uptodown.workers;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.l;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import b4.d;
import com.uptodown.UptodownApp;
import f4.c;
import j5.a;
import j5.g;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import l7.u;
import q6.q;
import t0.f;
import x4.e;
import x4.j0;
import x4.q2;
import x4.r;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class GenerateQueueWorker extends Worker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3482d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateQueueWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f3479a = context;
        this.f3480b = workerParameters.getInputData().getBoolean("downloadAnyway", false);
        this.f3481c = workerParameters.getInputData().getBoolean("downloadUptodown", false);
        this.f3482d = workerParameters.getInputData().getString("packagename");
        Activity activity = c.f4876o;
        this.f3479a = f.e(context);
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.Result doWork() {
        File fileG;
        float f = UptodownApp.I;
        Context context = this.f3479a;
        context.getClass();
        if (!d.p(context, "DownloadUpdatesWorker")) {
            String str = this.f3482d;
            boolean z9 = this.f3481c;
            Context context2 = this.f3479a;
            ArrayList arrayList = new ArrayList();
            g gVarL = g.D.l(context2);
            gVarL.b();
            ArrayList arrayList2 = new ArrayList();
            String packageName = context2.getPackageName();
            if (z9) {
                packageName.getClass();
                q2 q2VarY = gVarL.Y(packageName);
                if (q2VarY != null) {
                    arrayList2.add(q2VarY);
                }
            } else if (str != null) {
                q2 q2VarY2 = gVarL.Y(str);
                if (q2VarY2 != null) {
                    arrayList2.add(q2VarY2);
                }
            } else {
                arrayList2 = gVarL.a0();
            }
            boolean zF = a.f(context2);
            Iterator it = arrayList2.iterator();
            it.getClass();
            while (true) {
                int i = 0;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                next.getClass();
                q2 q2Var = (q2) next;
                e eVarH = a.h(context2, q2Var.f11345b);
                if (eVarH != null) {
                    if (!u.m0(packageName, eVarH.f11124l, true) && str == null) {
                        if (!zF) {
                            Context context3 = this.f3479a;
                            if (eVarH.F > 0 && eVarH.v == 0 && eVarH.b(context3)) {
                                String str2 = eVarH.f11124l;
                                String strB = str2 != null ? a.b(context3, str2) : null;
                                if (strB == null || !strB.equalsIgnoreCase(context3.getPackageName())) {
                                }
                            }
                        }
                    }
                    if (str == null) {
                        if (!q2Var.c()) {
                            String str3 = q2Var.f11345b;
                            str3.getClass();
                            try {
                                int applicationEnabledSetting = context2.getPackageManager().getApplicationEnabledSetting(str3);
                                if (applicationEnabledSetting == 2 || applicationEnabledSetting == 3 || applicationEnabledSetting == 4) {
                                }
                            } catch (Error e10) {
                                e10.printStackTrace();
                            } catch (Exception e11) {
                                e11.printStackTrace();
                            }
                        }
                    }
                    r rVarA = q2Var.a(context2);
                    if (rVarA == null || !rVarA.c() || (fileG = rVarA.g()) == null || !fileG.exists()) {
                        if (str == null && rVarA != null) {
                            if (!rVarA.F.isEmpty()) {
                                ArrayList arrayList3 = rVarA.F;
                                if (arrayList3 == null || !arrayList3.isEmpty()) {
                                    int size = arrayList3.size();
                                    while (i < size) {
                                        Object obj = arrayList3.get(i);
                                        i++;
                                        j0 j0Var = (j0) obj;
                                        int i6 = (j0Var.f11242r < i6 && System.currentTimeMillis() > j0Var.f11243s) ? 4 : 4;
                                    }
                                }
                            }
                        }
                        arrayList.add(eVarH);
                    }
                }
            }
            gVarL.c();
            q.j0(arrayList, new androidx.constraintlayout.core.utils.a(11));
            int size2 = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size2) {
                    if (u.m0(packageName, ((e) arrayList.get(i10)).f11124l, true) && ((e) arrayList.get(i10)).f11128p == x4.d.f11088a) {
                        Object obj2 = arrayList.get(i10);
                        obj2.getClass();
                        arrayList.remove(i10);
                        arrayList.add(0, (e) obj2);
                        break;
                    }
                    i10++;
                } else {
                    break;
                }
            }
            if (str == null) {
                Iterator it2 = arrayList.iterator();
                it2.getClass();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    next2.getClass();
                    String str4 = ((e) next2).f11124l;
                    if (str4 != null) {
                        a5.e.b(str4, "actualizacion_automatica");
                    }
                }
            }
            synchronized (UptodownApp.f3295h0) {
                UptodownApp.f3296i0 = arrayList;
            }
            float f10 = UptodownApp.I;
            ArrayList arrayListI = d.i();
            if (arrayListI == null || arrayListI.isEmpty()) {
                Context context4 = this.f3479a;
                context4.getClass();
                if (!d.p(context4, "InstallUpdatesWorker")) {
                    WorkManager.Companion.getInstance(context4).enqueue(((OneTimeWorkRequest.Builder) l.t(InstallUpdatesWorker.class, "InstallUpdatesWorker")).build());
                }
            } else {
                Context context5 = this.f3479a;
                boolean z10 = this.f3480b;
                context5.getClass();
                if (!d.p(context5, "DownloadUpdatesWorker")) {
                    WorkManager.Companion.getInstance(context5).enqueue(((OneTimeWorkRequest.Builder) l.t(DownloadUpdatesWorker.class, "DownloadUpdatesWorker")).setInputData(new Data.Builder().putBoolean("downloadAnyway", z10).build()).build());
                }
            }
        }
        ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
        resultSuccess.getClass();
        return resultSuccess;
    }
}
