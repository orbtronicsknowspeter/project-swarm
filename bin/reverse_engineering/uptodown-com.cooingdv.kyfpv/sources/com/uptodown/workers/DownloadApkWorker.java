package com.uptodown.workers;

import a5.b;
import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.media.g;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import b4.d;
import c4.c1;
import com.google.android.gms.internal.measurement.z3;
import com.uptodown.UptodownApp;
import f4.c;
import h4.a;
import j5.o;
import java.io.File;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import l7.m;
import o7.m0;
import r7.o0;
import t0.f;
import v7.e;
import x4.a0;
import x4.b0;
import x4.c0;
import x4.e0;
import x4.f0;
import x4.g0;
import x4.g2;
import x4.h0;
import x4.j0;
import x4.k;
import x4.k0;
import x4.r;
import x4.s;
import x4.t;
import x4.u;
import x4.v;
import x4.w;
import x4.x;
import x4.y;
import x4.z;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class DownloadApkWorker extends DownloadWorker {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f3473e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadApkWorker(Context context, WorkerParameters workerParameters) {
        Cursor cursorQuery;
        int i;
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        Activity activity = c.f4876o;
        Context contextE = f.e(this.f3475a);
        this.f3475a = contextE;
        this.f3476b = new g(contextE, 20);
        int i6 = workerParameters.getInputData().getInt("downloadId", -1);
        if (i6 >= 0) {
            j5.g gVarL = j5.g.D.l(this.f3475a);
            gVarL.b();
            r rVar = null;
            try {
                String[] strArr = {String.valueOf(i6)};
                SQLiteDatabase sQLiteDatabase = gVarL.f6674a;
                sQLiteDatabase.getClass();
                cursorQuery = sQLiteDatabase.query("downloads", gVarL.f6678n, "id=?", strArr, null, null, null);
            } catch (Exception e10) {
                e = e10;
                cursorQuery = null;
            }
            try {
                r rVarI0 = cursorQuery.moveToFirst() ? j5.g.i0(cursorQuery) : null;
                cursorQuery.close();
                if (rVarI0 != null && (i = rVarI0.f11355a) >= 0) {
                    rVarI0.F = gVarL.N(i);
                }
                rVar = rVarI0;
            } catch (Exception e11) {
                e = e11;
                e.printStackTrace();
                if (cursorQuery != null && !cursorQuery.isClosed()) {
                    cursorQuery.close();
                }
            }
            this.f3478d = rVar;
            gVarL.c();
        }
        this.f3473e = workerParameters.getInputData().getString("url");
    }

    @Override // com.uptodown.workers.DownloadWorker
    public final void A() {
        b.h();
    }

    @Override // com.uptodown.workers.DownloadWorker
    public final void B(r rVar) {
        rVar.getClass();
        o0 o0Var = b.f193a;
        b.i(g0.f11199a);
        b.f195c.n(new w(rVar));
    }

    @Override // com.uptodown.workers.DownloadWorker
    public final void C(int i, r rVar) {
        rVar.getClass();
        g0 g0Var = g0.f11199a;
        switch (i) {
            case 199:
                o0 o0Var = b.f193a;
                b.f195c.n(new y(rVar));
                break;
            case 200:
                o0 o0Var2 = b.f193a;
                b.i(new f0(rVar));
                b.f195c.n(new c0(rVar));
                break;
            case 201:
                o0 o0Var3 = b.f193a;
                b.i(new f0(rVar));
                b.f195c.n(new b0(rVar));
                break;
            case 202:
                b.i(g0Var);
                b.f195c.n(new x(rVar));
                break;
            case 205:
                o0 o0Var4 = b.f193a;
                b.f195c.n(new v(rVar));
                break;
            case 206:
                o0 o0Var5 = b.f193a;
                b.f195c.n(new u(rVar));
                break;
            case 207:
                o0 o0Var6 = b.f193a;
                b.f195c.n(new t(rVar));
                break;
            case 208:
                b.i(g0Var);
                b.f195c.n(a0.f11042a);
                break;
            case 211:
                o0 o0Var7 = b.f193a;
                b.i(new h0(rVar));
                break;
        }
    }

    public final void D() {
        k kVar = UptodownApp.f3294g0;
        if (kVar == null || this.f3478d == null || kVar.f11252e <= -1) {
            return;
        }
        kVar.getClass();
        int i = kVar.f11251d;
        r rVar = this.f3478d;
        rVar.getClass();
        if (i == rVar.f11355a) {
            j5.v vVar = new j5.v(this.f3475a);
            k kVar2 = UptodownApp.f3294g0;
            kVar2.getClass();
            String strH = a4.x.h(kVar2.f11252e, "/eapi/deep-link-hash/");
            g2 g2VarK = vVar.k("https://www.uptodown.app:443".concat(strH), null, "DELETE", false);
            g2VarK.f11207d = vVar.i(g2VarK, strH);
            k kVar3 = UptodownApp.f3294g0;
            if (kVar3 != null) {
                kVar3.f11252e = -1L;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:212:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0749  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ba  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r2v11, types: [j5.v] */
    /* JADX WARN: Type inference failed for: r2v115 */
    /* JADX WARN: Type inference failed for: r2v116 */
    /* JADX WARN: Type inference failed for: r2v117 */
    /* JADX WARN: Type inference failed for: r2v118 */
    /* JADX WARN: Type inference failed for: r2v119 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(x4.r r31) throws java.lang.InterruptedException {
        /*
            Method dump skipped, instruction units count: 2005
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.workers.DownloadApkWorker.E(x4.r):void");
    }

    public final void F(r rVar, String str) {
        if (rVar != null) {
            rVar.l(this.f3475a);
            B(rVar);
        }
        o.i(this.f3475a, rVar, str);
    }

    @Override // com.uptodown.workers.DownloadWorker, androidx.work.Worker
    public final ListenableWorker.Result doWork() throws InterruptedException {
        long j;
        File externalFilesDir;
        r rVar;
        File externalFilesDir2;
        File externalFilesDir3;
        b.a();
        boolean z9 = false;
        String str = this.f3473e;
        if (str != null) {
            this.f3477c = null;
            b.a();
            if (z3.f2928c) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                r(k0.k.e(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "start"), new URL(str).getHost(), null);
                HttpsURLConnection httpsURLConnectionZ = z(str, jCurrentTimeMillis, null);
                if (httpsURLConnectionZ != null) {
                    this.f3477c = httpsURLConnectionZ.getURL().getHost();
                    String string = httpsURLConnectionZ.getURL().toString();
                    string.getClass();
                    String strSubstring = string.substring(m.A0("/", string, 6) + 1);
                    if (m.y0(strSubstring, ".", 0, false, 6) < 0) {
                        String string2 = httpsURLConnectionZ.getURL().toString();
                        string2.getClass();
                        strSubstring = strSubstring.concat(DownloadWorker.n(string2));
                    }
                    if (strSubstring.length() <= 0 || (rVar = this.f3478d) == null) {
                        j = 0;
                    } else if (rVar.F.isEmpty()) {
                        Context context = this.f3475a;
                        context.getClass();
                        a aVar = new a(context);
                        if (aVar.d()) {
                            j = 0;
                            File[] externalFilesDirs = context.getExternalFilesDirs(null);
                            if (externalFilesDirs.length > 1) {
                                externalFilesDir3 = externalFilesDirs[1];
                            } else {
                                externalFilesDir3 = context.getExternalFilesDir(null);
                                aVar.g();
                                aVar.f();
                            }
                        } else {
                            j = 0;
                            externalFilesDir3 = context.getExternalFilesDir(null);
                        }
                        File file = new File(externalFilesDir3, "Apps");
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        File file2 = new File(file, strSubstring);
                        j0 j0Var = new j0();
                        j0Var.f11241q = file2.getAbsolutePath();
                        j0Var.f11238n = DownloadWorker.m(httpsURLConnectionZ);
                        j5.g gVarL = j5.g.D.l(this.f3475a);
                        gVarL.b();
                        this.f3478d.getClass();
                        gVarL.c0(j0Var, r8.f11355a);
                        gVarL.c();
                        r rVar2 = this.f3478d;
                        rVar2.getClass();
                        rVar2.F.add(j0Var);
                    } else {
                        j = 0;
                        r rVar3 = this.f3478d;
                        rVar3.getClass();
                        if (((j0) rVar3.F.get(0)).f11241q == null) {
                            Context context2 = this.f3475a;
                            context2.getClass();
                            a aVar2 = new a(context2);
                            if (aVar2.d()) {
                                File[] externalFilesDirs2 = context2.getExternalFilesDirs(null);
                                if (externalFilesDirs2.length > 1) {
                                    externalFilesDir2 = externalFilesDirs2[1];
                                } else {
                                    externalFilesDir2 = context2.getExternalFilesDir(null);
                                    aVar2.g();
                                    aVar2.f();
                                }
                            } else {
                                externalFilesDir2 = context2.getExternalFilesDir(null);
                            }
                            File file3 = new File(externalFilesDir2, "Apps");
                            if (!file3.exists()) {
                                file3.mkdirs();
                            }
                            File file4 = new File(file3, strSubstring);
                            r rVar4 = this.f3478d;
                            rVar4.getClass();
                            ((j0) rVar4.F.get(0)).f11241q = file4.getAbsolutePath();
                            j5.g gVarL2 = j5.g.D.l(this.f3475a);
                            gVarL2.b();
                            r rVar5 = this.f3478d;
                            rVar5.getClass();
                            Object obj = rVar5.F.get(0);
                            obj.getClass();
                            gVarL2.r0((j0) obj);
                            gVarL2.c();
                        }
                    }
                    Context context3 = this.f3475a;
                    context3.getClass();
                    a aVar3 = new a(context3);
                    if (aVar3.d()) {
                        File[] externalFilesDirs3 = context3.getExternalFilesDirs(null);
                        if (externalFilesDirs3.length > 1) {
                            externalFilesDir = externalFilesDirs3[1];
                        } else {
                            externalFilesDir = context3.getExternalFilesDir(null);
                            aVar3.g();
                            aVar3.f();
                        }
                    } else {
                        externalFilesDir = context3.getExternalFilesDir(null);
                    }
                    File file5 = new File(externalFilesDir, "Apps");
                    if (!file5.exists()) {
                        file5.mkdirs();
                    }
                    if (file5.exists() || file5.mkdirs()) {
                        r rVar6 = this.f3478d;
                        rVar6.getClass();
                        String str2 = ((j0) rVar6.F.get(0)).f11241q;
                        str2.getClass();
                        File file6 = new File(str2);
                        if (p()) {
                            r rVar7 = this.f3478d;
                            rVar7.getClass();
                            h(jCurrentTimeMillis, (j0) rVar7.F.get(0), 207);
                        } else if (v(httpsURLConnectionZ, jCurrentTimeMillis)) {
                            r rVar8 = this.f3478d;
                            rVar8.getClass();
                            long length = ((j0) rVar8.F.get(0)).f11238n - file6.length();
                            if (length >= j) {
                                if (a.a.F(this.f3475a, file5) < length * 2.25d) {
                                    httpsURLConnectionZ.disconnect();
                                    r rVar9 = this.f3478d;
                                    if (rVar9 != null) {
                                        rVar9.t(this.f3475a);
                                    }
                                    j(k0.k.f(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "fail", "error", "no_enough_space"), " (112)", jCurrentTimeMillis);
                                } else {
                                    r rVar10 = this.f3478d;
                                    rVar10.getClass();
                                    C(200, rVar10);
                                    D();
                                    r rVar11 = this.f3478d;
                                    rVar11.getClass();
                                    if (rVar11.f11362q > j) {
                                        j5.g gVarL3 = j5.g.D.l(this.f3475a);
                                        gVarL3.b();
                                        r rVar12 = this.f3478d;
                                        rVar12.getClass();
                                        k0 k0VarO = gVarL3.O(rVar12.f11362q);
                                        if (k0VarO != null) {
                                            k0VarO.a(this.f3475a, "downloadStarted");
                                        }
                                        gVarL3.c();
                                    }
                                    kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
                                    kotlin.jvm.internal.w wVar2 = new kotlin.jvm.internal.w();
                                    b5.m mVar = new b5.m(wVar, wVar2, this, 18);
                                    r rVar13 = this.f3478d;
                                    rVar13.getClass();
                                    r rVar14 = this.f3478d;
                                    rVar14.getClass();
                                    Object obj2 = rVar14.F.get(0);
                                    obj2.getClass();
                                    String str3 = this.f3477c;
                                    str3.getClass();
                                    long jK = k(httpsURLConnectionZ, file6, rVar13, (j0) obj2, str3, jCurrentTimeMillis, mVar);
                                    if (jK >= j && !isStopped()) {
                                        boolean zP = p();
                                        r rVar15 = this.f3478d;
                                        if (zP) {
                                            rVar15.getClass();
                                            h(jCurrentTimeMillis, (j0) rVar15.F.get(0), 207);
                                        } else {
                                            if (rVar15 != null) {
                                                rVar15.f11358m = 0;
                                                j5.g gVarL4 = j5.g.D.l(this.f3475a);
                                                gVarL4.b();
                                                r rVar16 = this.f3478d;
                                                rVar16.getClass();
                                                gVarL4.q0(rVar16);
                                                gVarL4.c();
                                            }
                                            r rVar17 = this.f3478d;
                                            if (rVar17 != null && rVar17.f11362q > j) {
                                                j5.g gVarL5 = j5.g.D.l(this.f3475a);
                                                gVarL5.b();
                                                r rVar18 = this.f3478d;
                                                rVar18.getClass();
                                                k0 k0VarO2 = gVarL5.O(rVar18.f11362q);
                                                if (k0VarO2 != null) {
                                                    k0VarO2.a(this.f3475a, "downloadFinished");
                                                }
                                                gVarL5.c();
                                            }
                                            s(wVar.f7024a, jCurrentTimeMillis, wVar2.f7024a, jK, null);
                                            Context context4 = this.f3475a;
                                            context4.getClass();
                                            try {
                                                SharedPreferences sharedPreferences = context4.getSharedPreferences("CoreSettings", 0);
                                                if (sharedPreferences.contains("install_apk_as_root_system")) {
                                                    z9 = sharedPreferences.getBoolean("install_apk_as_root_system", false);
                                                }
                                            } catch (Exception unused) {
                                            }
                                            if (z9) {
                                                float f = UptodownApp.I;
                                                d.r(this.f3475a, file6);
                                            }
                                            r rVar19 = this.f3478d;
                                            if (rVar19 != null) {
                                                if (rVar19.B == 1) {
                                                    Context context5 = this.f3475a;
                                                    String str4 = rVar19.f11356b;
                                                    rVar19.getClass();
                                                    long j6 = rVar19.f11359n;
                                                    context5.getClass();
                                                    if (str4 != null && str4.length() != 0) {
                                                        e eVar = m0.f8289a;
                                                        o7.c0.s(o7.c0.b(v7.d.f10885a), null, null, new c1(context5, str4, j6, null, 3), 3);
                                                    }
                                                }
                                                r rVar20 = this.f3478d;
                                                rVar20.getClass();
                                                C(202, rVar20);
                                            }
                                            Context context6 = this.f3475a;
                                            context6.getClass();
                                            Object systemService = context6.getSystemService("notification");
                                            systemService.getClass();
                                            ((NotificationManager) systemService).cancel(261);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        j(k0.k.f(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "fail", "error", "cant_mkdir"), " (106)", jCurrentTimeMillis);
                    }
                }
            } else {
                b.f195c.n(z.f11478a);
            }
        } else {
            r rVar21 = this.f3478d;
            if (rVar21 == null) {
                F(null, " (100)");
            } else {
                boolean zIsEmpty = rVar21.F.isEmpty();
                r rVar22 = this.f3478d;
                if (zIsEmpty) {
                    F(rVar22, " (114)");
                } else {
                    rVar22.getClass();
                    long j10 = ((j0) rVar22.F.get(0)).f11236l;
                    r rVar23 = this.f3478d;
                    if (j10 < 0) {
                        F(rVar23, " (103)");
                    } else {
                        rVar23.getClass();
                        long j11 = rVar23.f11362q;
                        r rVar24 = this.f3478d;
                        if (j11 == -1) {
                            F(rVar24, " (113)");
                        } else {
                            rVar24.getClass();
                            E(rVar24);
                        }
                    }
                }
            }
        }
        o0 o0Var = b.f193a;
        b.i(g0.f11199a);
        b.f195c.n(s.f11383a);
        ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
        resultSuccess.getClass();
        return resultSuccess;
    }

    @Override // com.uptodown.workers.DownloadWorker
    public final void j(Bundle bundle, String str, long j) {
        F(this.f3478d, str);
        if (j > 0) {
            bundle.putLong(TypedValues.TransitionType.S_DURATION, (System.currentTimeMillis() - j) / ((long) 1000));
        }
        d(bundle, null);
        g gVar = this.f3476b;
        if (gVar != null) {
            gVar.E(bundle, "download");
        }
    }

    @Override // com.uptodown.workers.DownloadWorker
    public final boolean p() {
        return b.f194b.f8973a.getValue() instanceof e0;
    }

    @Override // com.uptodown.workers.DownloadWorker
    public final boolean q() {
        return b.f194b.f8973a.getValue() instanceof h0;
    }
}
