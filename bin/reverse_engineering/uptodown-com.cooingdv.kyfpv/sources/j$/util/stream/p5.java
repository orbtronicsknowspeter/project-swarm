package j$.util.stream;

import androidx.core.location.LocationRequestCompat;

/* JADX INFO: loaded from: classes2.dex */
public final class p5 extends g5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f6326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f6327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q5 f6328d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(q5 q5Var, m5 m5Var) {
        super(m5Var);
        this.f6328d = q5Var;
        this.f6326b = q5Var.f6334l;
        long j = q5Var.f6335m;
        this.f6327c = j < 0 ? LocationRequestCompat.PASSIVE_INTERVAL : j;
    }

    @Override // j$.util.stream.g5, j$.util.stream.m5
    public final void c(long j) {
        this.f6206a.c(w3.x(j, this.f6328d.f6334l, this.f6327c));
    }

    @Override // j$.util.stream.k5, j$.util.stream.m5
    public final void accept(int i) {
        long j = this.f6326b;
        if (j == 0) {
            long j6 = this.f6327c;
            if (j6 > 0) {
                this.f6327c = j6 - 1;
                this.f6206a.accept(i);
                return;
            }
            return;
        }
        this.f6326b = j - 1;
    }

    @Override // j$.util.stream.g5, j$.util.stream.m5
    public final boolean e() {
        return this.f6327c == 0 || this.f6206a.e();
    }
}
