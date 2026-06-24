package com.uptodown.workers;

import a5.c;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.g;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.l;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.measurement.z3;
import j5.o;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import javax.net.ssl.HttpsURLConnection;
import k0.k;
import l7.m;
import r7.o0;
import x4.j0;
import x4.q2;
import x4.r;
import x4.r0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public class DownloadWorker extends Worker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f3474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f3475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f3476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r f3477d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f3474a = context;
    }

    public static void g(InputStream inputStream, FileOutputStream fileOutputStream, HttpsURLConnection httpsURLConnection) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
        if (fileOutputStream != null) {
            try {
                fileOutputStream.flush();
            } catch (IOException e11) {
                e11.printStackTrace();
            }
        }
        if (l.D(fileOutputStream)) {
            fileOutputStream.getFD().sync();
        }
        if (fileOutputStream != null) {
            fileOutputStream.close();
        }
        httpsURLConnection.disconnect();
    }

    public static long m(HttpsURLConnection httpsURLConnection) {
        return Build.VERSION.SDK_INT >= 24 ? httpsURLConnection.getContentLengthLong() : httpsURLConnection.getContentLength();
    }

    public static String n(String str) {
        int iA0 = m.A0("/", str, 6);
        int iA02 = m.A0(".", str, 6);
        if (iA02 > iA0) {
            String strSubstring = str.substring(iA02);
            if (strSubstring.length() != 0) {
                return strSubstring;
            }
        }
        return ".apk";
    }

    public static HttpsURLConnection w(URL url) throws IOException {
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        uRLConnectionOpenConnection.getClass();
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
        httpsURLConnection.setRequestProperty("Identificador", "Uptodown_Android");
        httpsURLConnection.setRequestProperty("Identificador-Version", "728");
        httpsURLConnection.setConnectTimeout(60000);
        httpsURLConnection.setReadTimeout(90000);
        return httpsURLConnection;
    }

    public void B(r rVar) {
        rVar.getClass();
    }

    public void C(int i, r rVar) {
        rVar.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.os.Bundle d(android.os.Bundle r11, x4.j0 r12) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.workers.DownloadWorker.d(android.os.Bundle, x4.j0):android.os.Bundle");
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        ListenableWorker.Result resultFailure = ListenableWorker.Result.failure();
        resultFailure.getClass();
        return resultFailure;
    }

    public final boolean e() {
        return o() != null ? z3.h(this.f3474a) : z3.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle f(long r21, long r23, java.io.File r25, x4.j0 r26) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.workers.DownloadWorker.f(long, long, java.io.File, x4.j0):android.os.Bundle");
    }

    public final void h(long j, j0 j0Var, int i) {
        r rVar = this.f3477d;
        if (rVar != null) {
            rVar.t(this.f3474a);
            j5.g gVarL = j5.g.D.l(this.f3474a);
            gVarL.b();
            r rVar2 = this.f3477d;
            rVar2.getClass();
            boolean zP = rVar2.p();
            r rVar3 = this.f3477d;
            if (zP) {
                gVarL.j(rVar3);
            } else {
                rVar3.getClass();
                Iterator it = rVar3.F.iterator();
                it.getClass();
                while (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    j0 j0Var2 = (j0) next;
                    j0Var2.f11238o = 0L;
                    j0Var2.f11241r = 0;
                    gVarL.r0(j0Var2);
                }
            }
            gVarL.c();
            if (q()) {
                A();
            }
            Context context = this.f3474a;
            context.getClass();
            Object systemService = context.getSystemService("notification");
            systemService.getClass();
            ((NotificationManager) systemService).cancel(261);
            Bundle bundle = new Bundle();
            bundle.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "cancelled");
            if (j > 0) {
                bundle.putLong(TypedValues.TransitionType.S_DURATION, (System.currentTimeMillis() - j) / ((long) 1000));
            }
            r(bundle, null, j0Var);
            r rVar4 = this.f3477d;
            rVar4.getClass();
            C(i, rVar4);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:458:0x064c
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public final long k(javax.net.ssl.HttpsURLConnection r42, java.io.File r43, x4.r r44, x4.j0 r45, java.lang.String r46, long r47, o5.e r49) throws java.lang.InterruptedException {
        /*
            Method dump skipped, instruction units count: 1892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.workers.DownloadWorker.k(javax.net.ssl.HttpsURLConnection, java.io.File, x4.r, x4.j0, java.lang.String, long, o5.e):long");
    }

    public final void l(j0 j0Var) {
        r(k.e(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "first_data"), this.f3476c, j0Var);
    }

    public q2 o() {
        return null;
    }

    public boolean p() {
        return false;
    }

    public boolean q() {
        return false;
    }

    public final void r(Bundle bundle, String str, j0 j0Var) {
        this.f3476c = str;
        Bundle bundleD = d(bundle, j0Var);
        g gVar = this.f3475b;
        if (gVar != null) {
            gVar.E(bundleD, "download");
        }
    }

    public final void s(long j, long j6, long j10, long j11, j0 j0Var) {
        Bundle bundleE = k.e(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "completed");
        if (j == 0) {
            long jCurrentTimeMillis = (System.currentTimeMillis() - j10) / ((long) 1000);
            if (jCurrentTimeMillis > 0) {
                j = j11 / jCurrentTimeMillis;
            }
        }
        bundleE.putLong("speed", j);
        bundleE.putLong(TypedValues.TransitionType.S_DURATION, (System.currentTimeMillis() - j6) / ((long) 1000));
        r(bundleE, this.f3476c, j0Var);
    }

    public void t(q2 q2Var, r rVar, j0 j0Var, Bundle bundle, String str, long j) {
        rVar.getClass();
    }

    public final void u(int i) {
        if (this.f3477d != null) {
            Data.Builder builder = new Data.Builder();
            builder.putInt("downloadProgress", i);
            setProgressAsync(builder.build());
            if (o() == null) {
                o.c(this.f3474a);
            }
            r rVar = this.f3477d;
            rVar.getClass();
            C(201, rVar);
        }
    }

    public final boolean v(HttpsURLConnection httpsURLConnection, long j) throws IOException {
        httpsURLConnection.connect();
        int responseCode = httpsURLConnection.getResponseCode();
        if (responseCode >= 200 && responseCode < 300) {
            return true;
        }
        Bundle bundleF = k.f(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "fail", "error", NotificationCompat.CATEGORY_STATUS);
        bundleF.putString("responseCode", String.valueOf(responseCode));
        bundleF.putString("url", httpsURLConnection.getURL().toString());
        if (o() != null) {
            bundleF.putInt("update", 1);
        } else {
            bundleF.putInt("update", 0);
        }
        j(bundleF, " (105)", j);
        return false;
    }

    public final void x(r rVar, j0 j0Var, String str, String str2, long j, String str3) {
        q2 q2VarO = o();
        if (q2VarO == null) {
            Bundle bundleF = k.f("exception", str, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "fail");
            bundleF.putString("url", str3);
            j(bundleF, " (109)", j);
            return;
        }
        o0 o0Var = c.f197a;
        c.f199c.n(new r0(q2VarO.f11352s));
        Bundle bundle = new Bundle();
        bundle.putString("exception", str);
        bundle.putString("url", str3);
        t(q2VarO, rVar, j0Var, bundle, str2, j);
    }

    public final void y(String str, Bundle bundle, long j, r rVar) {
        if (rVar != null) {
            rVar.l(this.f3474a);
            B(rVar);
            if (rVar.p()) {
                o.i(this.f3474a, rVar, str);
            }
        }
        if (j > 0) {
            bundle.putLong(TypedValues.TransitionType.S_DURATION, (System.currentTimeMillis() - j) / ((long) 1000));
        }
        Bundle bundleD = d(bundle, null);
        g gVar = this.f3475b;
        if (gVar != null) {
            gVar.E(bundleD, "download");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final javax.net.ssl.HttpsURLConnection z(java.lang.String r19, long r20, x4.j0 r22) {
        /*
            Method dump skipped, instruction units count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.workers.DownloadWorker.z(java.lang.String, long, x4.j0):javax.net.ssl.HttpsURLConnection");
    }

    public void A() {
    }

    public void j(Bundle bundle, String str, long j) {
    }
}
