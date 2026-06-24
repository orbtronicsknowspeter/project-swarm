package j$.util.stream;

import androidx.core.location.LocationRequestCompat;

/* JADX INFO: loaded from: classes2.dex */
public final class r5 extends h5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f6339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f6340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s5 f6341d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(s5 s5Var, m5 m5Var) {
        super(m5Var);
        this.f6341d = s5Var;
        this.f6339b = s5Var.f6354l;
        long j = s5Var.f6355m;
        this.f6340c = j < 0 ? LocationRequestCompat.PASSIVE_INTERVAL : j;
    }

    @Override // j$.util.stream.h5, j$.util.stream.m5
    public final void c(long j) {
        this.f6215a.c(w3.x(j, this.f6341d.f6354l, this.f6340c));
    }

    @Override // j$.util.stream.l5, j$.util.stream.m5
    public final void accept(long j) {
        long j6 = this.f6339b;
        if (j6 == 0) {
            long j10 = this.f6340c;
            if (j10 > 0) {
                this.f6340c = j10 - 1;
                this.f6215a.accept(j);
                return;
            }
            return;
        }
        this.f6339b = j6 - 1;
    }

    @Override // j$.util.stream.h5, j$.util.stream.m5
    public final boolean e() {
        return this.f6340c == 0 || this.f6215a.e();
    }
}
