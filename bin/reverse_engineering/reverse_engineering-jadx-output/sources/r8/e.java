package r8;

import a4.x;
import java.io.IOException;
import java.net.ProtocolException;
import w8.h;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f9097n;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zP;
        if (this.f9083b) {
            return;
        }
        if (this.f9097n != 0) {
            try {
                zP = n8.c.p(this, 100);
            } catch (IOException unused) {
                zP = false;
            }
            if (!zP) {
                b(false, null);
            }
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
        long j6 = this.f9097n;
        if (j6 == 0) {
            return -1L;
        }
        long jP = super.p(hVar, Math.min(j6, j));
        if (jP == -1) {
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b(false, protocolException);
            throw protocolException;
        }
        long j10 = this.f9097n - jP;
        this.f9097n = j10;
        if (j10 == 0) {
            b(true, null);
        }
        return jP;
    }
}
