package x8;

import java.io.IOException;
import w8.g0;
import w8.q;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11555b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f11556l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f11557m;

    public e(g0 g0Var, long j, boolean z9) {
        super(g0Var);
        this.f11555b = j;
        this.f11556l = z9;
    }

    @Override // w8.q, w8.g0
    public final long p(w8.h hVar, long j) throws IOException {
        hVar.getClass();
        long j6 = this.f11557m;
        long j10 = this.f11555b;
        if (j6 > j10) {
            j = 0;
        } else if (this.f11556l) {
            long j11 = j10 - j6;
            if (j11 == 0) {
                return -1L;
            }
            j = Math.min(j, j11);
        }
        long jP = this.f10988a.p(hVar, j);
        if (jP != -1) {
            this.f11557m += jP;
        }
        long j12 = this.f11557m;
        if ((j12 >= j10 || jP != -1) && j12 <= j10) {
            return jP;
        }
        if (jP > 0 && j12 > j10) {
            long j13 = hVar.f10962b - (j12 - j10);
            w8.h hVar2 = new w8.h();
            hVar2.z(hVar);
            hVar.l(hVar2, j13);
            hVar2.skip(hVar2.f10962b);
        }
        throw new IOException("expected " + j10 + " bytes but got " + this.f11557m);
    }
}
