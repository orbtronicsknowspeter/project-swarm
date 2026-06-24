package androidx.work.impl.utils;

import androidx.work.impl.WorkManagerImpl;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements d7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f631a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f632b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ WorkManagerImpl f633l;

    public /* synthetic */ b(WorkManagerImpl workManagerImpl, String str) {
        this.f633l = workManagerImpl;
        this.f632b = str;
    }

    @Override // d7.a
    public final Object invoke() {
        switch (this.f631a) {
            case 0:
                return CancelWorkRunnable.forTag$lambda$3(this.f633l, this.f632b);
            default:
                return CancelWorkRunnable.forName$lambda$4(this.f632b, this.f633l);
        }
    }

    public /* synthetic */ b(String str, WorkManagerImpl workManagerImpl) {
        this.f632b = str;
        this.f633l = workManagerImpl;
    }
}
