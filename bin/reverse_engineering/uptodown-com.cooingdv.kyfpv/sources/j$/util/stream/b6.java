package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class b6 extends x5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p6 f6141c;

    @Override // j$.util.stream.f5, j$.util.stream.m5
    public final void c(long j) {
        p6 p6Var;
        if (j >= 2147483639) {
            j$.time.g.c("Stream size exceeds max array size");
            return;
        }
        if (j <= 0) {
            p6Var = new p6();
        } else {
            p6Var = new p6((int) j);
        }
        this.f6141c = p6Var;
    }

    @Override // j$.util.stream.f5, j$.util.stream.m5
    public final void end() {
        double[] dArr = (double[]) this.f6141c.b();
        Arrays.sort(dArr);
        long length = dArr.length;
        m5 m5Var = this.f6196a;
        m5Var.c(length);
        int i = 0;
        if (!this.f6426b) {
            int length2 = dArr.length;
            while (i < length2) {
                m5Var.accept(dArr[i]);
                i++;
            }
        } else {
            int length3 = dArr.length;
            while (i < length3) {
                double d10 = dArr[i];
                if (m5Var.e()) {
                    break;
                }
                m5Var.accept(d10);
                i++;
            }
        }
        m5Var.end();
    }

    @Override // j$.util.stream.j5, java.util.function.DoubleConsumer
    public final void accept(double d10) {
        this.f6141c.accept(d10);
    }
}
