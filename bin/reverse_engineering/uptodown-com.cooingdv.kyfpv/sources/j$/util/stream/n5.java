package j$.util.stream;

import androidx.core.location.LocationRequestCompat;

/* JADX INFO: loaded from: classes2.dex */
public final class n5 extends i5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f6297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f6298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o5 f6299d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(o5 o5Var, m5 m5Var) {
        super(m5Var);
        this.f6299d = o5Var;
        this.f6297b = o5Var.f6315l;
        long j = o5Var.f6316m;
        this.f6298c = j < 0 ? LocationRequestCompat.PASSIVE_INTERVAL : j;
    }

    @Override // j$.util.stream.i5, j$.util.stream.m5
    public final void c(long j) {
        this.f6225a.c(w3.x(j, this.f6299d.f6315l, this.f6298c));
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        long j = this.f6297b;
        if (j == 0) {
            long j6 = this.f6298c;
            if (j6 > 0) {
                this.f6298c = j6 - 1;
                this.f6225a.n(obj);
                return;
            }
            return;
        }
        this.f6297b = j - 1;
    }

    @Override // j$.util.stream.i5, j$.util.stream.m5
    public final boolean e() {
        return this.f6298c == 0 || this.f6225a.e();
    }
}
