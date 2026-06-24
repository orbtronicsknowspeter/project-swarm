package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class j6 extends x5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double[] f6242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6243d;

    @Override // j$.util.stream.f5, j$.util.stream.m5
    public final void c(long j) {
        if (j >= 2147483639) {
            j$.time.g.c("Stream size exceeds max array size");
        } else {
            this.f6242c = new double[(int) j];
        }
    }

    @Override // j$.util.stream.f5, j$.util.stream.m5
    public final void end() {
        int i = 0;
        Arrays.sort(this.f6242c, 0, this.f6243d);
        long j = this.f6243d;
        m5 m5Var = this.f6196a;
        m5Var.c(j);
        if (!this.f6426b) {
            while (i < this.f6243d) {
                m5Var.accept(this.f6242c[i]);
                i++;
            }
        } else {
            while (i < this.f6243d && !m5Var.e()) {
                m5Var.accept(this.f6242c[i]);
                i++;
            }
        }
        m5Var.end();
        this.f6242c = null;
    }

    @Override // j$.util.stream.j5, java.util.function.DoubleConsumer
    public final void accept(double d10) {
        double[] dArr = this.f6242c;
        int i = this.f6243d;
        this.f6243d = i + 1;
        dArr[i] = d10;
    }
}
