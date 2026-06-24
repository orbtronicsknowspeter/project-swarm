package androidx.work.impl;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WorkerWrapper f591b;

    public /* synthetic */ k(WorkerWrapper workerWrapper, int i) {
        this.f590a = i;
        this.f591b = workerWrapper;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f590a) {
            case 0:
                return WorkerWrapper.runWorker$lambda$1(this.f591b);
            default:
                return WorkerWrapper.trySetRunning$lambda$13(this.f591b);
        }
    }
}
