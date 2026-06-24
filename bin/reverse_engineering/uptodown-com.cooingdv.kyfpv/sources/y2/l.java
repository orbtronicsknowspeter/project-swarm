package y2;

import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements j1.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f11744b;

    public /* synthetic */ l(FirebaseMessaging firebaseMessaging, int i) {
        this.f11743a = i;
        this.f11744b = firebaseMessaging;
    }

    @Override // j1.f
    public final void c(Object obj) {
        boolean z9;
        switch (this.f11743a) {
            case 0:
                x xVar = (x) obj;
                if (!this.f11744b.f3089e.i() || xVar.h.a() == null) {
                    return;
                }
                synchronized (xVar) {
                    z9 = xVar.g;
                }
                if (z9) {
                    return;
                }
                xVar.h(0L);
                return;
            default:
                FirebaseMessaging firebaseMessaging = this.f11744b;
                g0.a aVar = (g0.a) obj;
                if (aVar != null) {
                    a0.f(aVar.f5068a);
                    firebaseMessaging.e();
                    return;
                }
                return;
        }
    }
}
