package r8;

import a4.x;
import java.io.IOException;
import w8.h;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f9098n;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f9083b) {
            return;
        }
        if (!this.f9098n) {
            b(false, null);
        }
        this.f9083b = true;
    }

    @Override // r8.a, w8.g0
    public final long p(h hVar, long j) throws IOException {
        if (j < 0) {
            com.google.gson.internal.a.p(x.h(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.f9083b) {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("closed");
            return 0L;
        }
        if (this.f9098n) {
            return -1L;
        }
        long jP = super.p(hVar, j);
        if (jP != -1) {
            return jP;
        }
        this.f9098n = true;
        b(true, null);
        return -1L;
    }
}
