package g0;

import android.os.Bundle;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1.i f5094b = new j1.i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f5096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5097e;

    public l(int i, int i6, Bundle bundle, int i10) {
        this.f5097e = i10;
        this.f5093a = i;
        this.f5095c = i6;
        this.f5096d = bundle;
    }

    public final boolean a() {
        switch (this.f5097e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void b(m mVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + mVar.toString());
        }
        this.f5094b.f6540a.m(mVar);
    }

    public final void c(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(bundle));
        }
        this.f5094b.a(bundle);
    }

    public final String toString() {
        return "Request { what=" + this.f5095c + " id=" + this.f5093a + " oneWay=" + a() + "}";
    }
}
