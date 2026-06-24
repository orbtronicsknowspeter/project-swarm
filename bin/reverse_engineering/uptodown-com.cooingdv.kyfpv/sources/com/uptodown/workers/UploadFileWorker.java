package com.uptodown.workers;

import android.app.Activity;
import android.content.Context;
import android.support.v4.media.g;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import f4.c;
import t0.f;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class UploadFileWorker extends Worker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f3497b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadFileWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f3496a = context;
        this.f3497b = new g(context, 20);
        Activity activity = c.f4876o;
        this.f3496a = f.e(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0102  */
    @Override // androidx.work.Worker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.work.ListenableWorker.Result doWork() {
        /*
            Method dump skipped, instruction units count: 1019
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.workers.UploadFileWorker.doWork():androidx.work.ListenableWorker$Result");
    }
}
