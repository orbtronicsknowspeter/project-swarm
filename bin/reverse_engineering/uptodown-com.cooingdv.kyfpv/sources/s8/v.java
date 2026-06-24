package s8;

import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class v extends w8.d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w f9465m;

    public v(w wVar) {
        this.f9465m = wVar;
    }

    @Override // w8.d
    public final void j() {
        w wVar = this.f9465m;
        if (wVar.d(6)) {
            wVar.f9469d.j(wVar.f9468c, 6);
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
