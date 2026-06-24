package r8;

import java.net.ProtocolException;
import w8.e0;
import w8.h;
import w8.i0;
import w8.r;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f9094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9095b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f9096l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f9097m;

    public d(g gVar, long j) {
        this.f9097m = gVar;
        this.f9094a = new r(gVar.f9103d.a());
        this.f9096l = j;
    }

    @Override // w8.e0
    public final i0 a() {
        return this.f9094a;
    }

    @Override // w8.e0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws ProtocolException {
        if (this.f9095b) {
            return;
        }
        this.f9095b = true;
        if (this.f9096l > 0) {
            throw new ProtocolException("unexpected end of stream");
        }
        r rVar = this.f9094a;
        i0 i0Var = rVar.f10989e;
        rVar.f10989e = i0.f10963d;
        i0Var.a();
        i0Var.b();
        this.f9097m.f9104e = 3;
    }

    @Override // w8.e0, java.io.Flushable
    public final void flush() {
        if (this.f9095b) {
            return;
        }
        this.f9097m.f9103d.flush();
    }

    @Override // w8.e0
    public final void l(h hVar, long j) throws ProtocolException {
        if (this.f9095b) {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("closed");
            return;
        }
        long j6 = hVar.f10962b;
        byte[] bArr = n8.c.f8115a;
        if (j < 0 || 0 > j6 || j6 < j) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (j <= this.f9096l) {
            this.f9097m.f9103d.l(hVar, j);
            this.f9096l -= j;
            return;
        }
        throw new ProtocolException("expected " + this.f9096l + " bytes but received " + j);
    }
}
