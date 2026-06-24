package androidx.work.impl;

import androidx.work.impl.utils.CancelWorkRunnable;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements d7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WorkManagerImpl f579b;

    public /* synthetic */ g(WorkManagerImpl workManagerImpl, int i) {
        this.f578a = i;
        this.f579b = workManagerImpl;
    }

    @Override // d7.a
    public final Object invoke() {
        switch (this.f578a) {
            case 0:
                return this.f579b.lambda$rescheduleEligibleWork$0();
            default:
                return CancelWorkRunnable.forAll$lambda$7(this.f579b);
        }
    }
}
