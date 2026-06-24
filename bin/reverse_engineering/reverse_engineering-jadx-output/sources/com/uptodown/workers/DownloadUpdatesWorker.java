package com.uptodown.workers;

import a5.e;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.g;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import androidx.work.WorkerParameters;
import f4.c;
import kotlin.jvm.internal.l;
import r7.o0;
import t0.f;
import x4.j0;
import x4.m0;
import x4.q0;
import x4.q2;
import x4.r;
import x4.r0;
import x4.v0;
import x4.w0;
import x4.x0;
import x4.y0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class DownloadUpdatesWorker extends DownloadWorker {
    public static q2 f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f3473e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadUpdatesWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f3473e = workerParameters.getInputData().getBoolean("downloadAnyway", false);
        Activity activity = c.f4875o;
        Context contextE = f.e(this.f3474a);
        this.f3474a = contextE;
        this.f3475b = new g(contextE, 20);
    }

    @Override // com.uptodown.workers.DownloadWorker
    public final void A() {
        a5.c.f();
    }

    @Override // com.uptodown.workers.DownloadWorker
    public final void B(r rVar) {
        rVar.getClass();
        o0 o0Var = a5.c.f197a;
        a5.c.g(x0.f11447a);
        a5.c.f199c.n(new r0(rVar));
    }

    @Override // com.uptodown.workers.DownloadWorker
    public final void C(int i, r rVar) {
        rVar.getClass();
        if (i != 106) {
            if (i == 201) {
                a5.c.g(new w0(rVar));
                a5.c.f199c.n(new q0(rVar));
                return;
            } else if (i != 207) {
                return;
            }
        }
        a5.c.f199c.n(new m0(rVar));
    }

    @Override // com.uptodown.workers.DownloadWorker
    public final Bundle d(Bundle bundle, j0 j0Var) {
        super.d(bundle, j0Var);
        r rVar = this.f3477d;
        String str = rVar != null ? rVar.f11355b : null;
        if (str != null) {
            bundle.putString("updateOrigin", e.a(str));
            String string = bundle.getString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
            if (l.a(string, "fail") || l.a(string, "cancelled")) {
                e.f205a.remove(str);
            }
        }
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01fe  */
    @Override // com.uptodown.workers.DownloadWorker, androidx.work.Worker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.work.ListenableWorker.Result doWork() throws java.lang.InterruptedException {
        /*
            Method dump skipped, instruction units count: 1725
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.workers.DownloadUpdatesWorker.doWork():androidx.work.ListenableWorker$Result");
    }

    @Override // com.uptodown.workers.DownloadWorker
    public final q2 o() {
        return f;
    }

    @Override // com.uptodown.workers.DownloadWorker
    public final boolean p() {
        return a5.c.f198b.f8972a.getValue() instanceof v0;
    }

    @Override // com.uptodown.workers.DownloadWorker
    public final boolean q() {
        return a5.c.f198b.f8972a.getValue() instanceof y0;
    }

    @Override // com.uptodown.workers.DownloadWorker
    public final void t(q2 q2Var, r rVar, j0 j0Var, Bundle bundle, String str, long j) {
        q2Var.getClass();
        rVar.getClass();
        bundle.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "fail");
        if (j > 0) {
            bundle.putLong(TypedValues.TransitionType.S_DURATION, (System.currentTimeMillis() - j) / ((long) 1000));
        }
        r(bundle, str, j0Var);
    }
}
