package j$.util.stream;

import androidx.core.location.LocationRequestCompat;

/* JADX INFO: loaded from: classes2.dex */
public final class t5 extends f5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f6367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f6368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u5 f6369d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(u5 u5Var, m5 m5Var) {
        super(m5Var);
        this.f6369d = u5Var;
        this.f6367b = u5Var.f6381l;
        long j = u5Var.f6382m;
        this.f6368c = j < 0 ? LocationRequestCompat.PASSIVE_INTERVAL : j;
    }

    @Override // j$.util.stream.f5, j$.util.stream.m5
    public final void c(long j) {
        this.f6196a.c(w3.x(j, this.f6369d.f6381l, this.f6368c));
    }

    @Override // j$.util.stream.j5, java.util.function.DoubleConsumer
    public final void accept(double d10) {
        long j = this.f6367b;
        if (j == 0) {
            long j6 = this.f6368c;
            if (j6 > 0) {
                this.f6368c = j6 - 1;
                this.f6196a.accept(d10);
                return;
            }
            return;
        }
        this.f6367b = j - 1;
    }

    @Override // j$.util.stream.f5, j$.util.stream.m5
    public final boolean e() {
        return this.f6368c == 0 || this.f6196a.e();
    }
}
