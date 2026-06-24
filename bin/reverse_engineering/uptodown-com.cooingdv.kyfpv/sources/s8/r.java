package s8;

import java.util.logging.Level;
import java.util.logging.Logger;
import w8.g0;
import w8.i0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class r implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w8.j f9444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9445b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte f9446l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f9447m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f9448n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public short f9449o;

    public r(w8.j jVar) {
        this.f9444a = jVar;
    }

    @Override // w8.g0
    public final i0 a() {
        return this.f9444a.a();
    }

    @Override // w8.g0
    public final long p(w8.h hVar, long j) {
        int i;
        int i6;
        do {
            int i10 = this.f9448n;
            w8.j jVar = this.f9444a;
            if (i10 == 0) {
                jVar.skip(this.f9449o);
                this.f9449o = (short) 0;
                if ((this.f9446l & 4) == 0) {
                    i = this.f9447m;
                    int iJ = s.j(jVar);
                    this.f9448n = iJ;
                    this.f9445b = iJ;
                    byte b7 = (byte) (jVar.readByte() & 255);
                    this.f9446l = (byte) (jVar.readByte() & 255);
                    Logger logger = s.f9450n;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(e.a(true, this.f9447m, this.f9445b, b7, this.f9446l));
                    }
                    i6 = jVar.readInt() & Integer.MAX_VALUE;
                    this.f9447m = i6;
                    if (b7 != 9) {
                        e.c("%s != TYPE_CONTINUATION", Byte.valueOf(b7));
                        throw null;
                    }
                }
            } else {
                long jP = jVar.p(hVar, Math.min(j, i10));
                if (jP != -1) {
                    this.f9448n = (int) (((long) this.f9448n) - jP);
                    return jP;
                }
            }
            return -1L;
        } while (i6 == i);
        e.c("TYPE_CONTINUATION streamId changed", new Object[0]);
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
