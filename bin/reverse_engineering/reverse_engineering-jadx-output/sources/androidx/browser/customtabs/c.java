package androidx.browser.customtabs;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EngagementSignalsCallback f320b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f321l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Bundle f322m;

    public /* synthetic */ c(EngagementSignalsCallback engagementSignalsCallback, int i, Bundle bundle, int i6) {
        this.f319a = i6;
        this.f320b = engagementSignalsCallback;
        this.f321l = i;
        this.f322m = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f319a) {
            case 0:
                this.f320b.onGreatestScrollPercentageIncreased(this.f321l, this.f322m);
                break;
            default:
                this.f320b.onGreatestScrollPercentageIncreased(this.f321l, this.f322m);
                break;
        }
    }
}
