package com.uptodown.workers;

import android.app.Activity;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import f4.c;
import t0.f;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class AppInstalledWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3469b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppInstalledWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f3468a = context;
        String string = workerParameters.getInputData().getString("packagename");
        string.getClass();
        this.f3469b = string;
        Activity activity = c.f4876o;
        this.f3468a = f.e(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(t6.c r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof o5.a
            if (r0 == 0) goto L13
            r0 = r5
            o5.a r0 = (o5.a) r0
            int r1 = r0.f8170l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8170l = r1
            goto L18
        L13:
            o5.a r0 = new o5.a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f8168a
            int r1 = r0.f8170l
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            p6.a.e(r5)
            goto L43
        L26:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            androidx.privacysandbox.ads.adservices.customaudience.a.i(r5)
            return r2
        L2c:
            p6.a.e(r5)
            v7.e r5 = o7.m0.f8289a
            v7.d r5 = v7.d.f10885a
            o5.b r1 = new o5.b
            r1.<init>(r4, r2)
            r0.f8170l = r3
            java.lang.Object r5 = o7.c0.C(r1, r5, r0)
            u6.a r0 = u6.a.f10763a
            if (r5 != r0) goto L43
            return r0
        L43:
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.workers.AppInstalledWorker.doWork(t6.c):java.lang.Object");
    }
}
