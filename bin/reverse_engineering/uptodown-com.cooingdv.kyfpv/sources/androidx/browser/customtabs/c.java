package androidx.browser.customtabs;

import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsSession;

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
                CustomTabsSession.AnonymousClass1.lambda$onGreatestScrollPercentageIncreased$1(this.f320b, this.f321l, this.f322m);
                break;
            default:
                CustomTabsSession.AnonymousClass2.lambda$onGreatestScrollPercentageIncreased$1(this.f320b, this.f321l, this.f322m);
                break;
        }
    }
}
