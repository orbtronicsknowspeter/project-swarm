package r8;

import java.io.IOException;
import m8.u;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final u f9090n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f9091o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f9092p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ g f9093q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, u uVar) {
        super(gVar);
        this.f9093q = gVar;
        this.f9091o = -1L;
        this.f9092p = true;
        this.f9090n = uVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zP;
        if (this.f9084b) {
            return;
        }
        if (this.f9092p) {
            try {
                zP = n8.c.p(this, 100);
            } catch (IOException unused) {
                zP = false;
            }
            if (!zP) {
                b(false, null);
            }
        }
        this.f9084b = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0097, code lost:
    
        if (r16.f9092p == false) goto L34;
     */
    @Override // r8.a, w8.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long p(w8.h r17, long r18) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r8.c.p(w8.h, long):long");
    }
}
