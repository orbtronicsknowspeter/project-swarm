package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class k6 extends y5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f6267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6268d;

    @Override // j$.util.stream.g5, j$.util.stream.m5
    public final void c(long j) {
        if (j >= 2147483639) {
            j$.time.g.c("Stream size exceeds max array size");
        } else {
            this.f6267c = new int[(int) j];
        }
    }

    @Override // j$.util.stream.g5, j$.util.stream.m5
    public final void end() {
        int i = 0;
        Arrays.sort(this.f6267c, 0, this.f6268d);
        long j = this.f6268d;
        m5 m5Var = this.f6206a;
        m5Var.c(j);
        if (!this.f6432b) {
            while (i < this.f6268d) {
                m5Var.accept(this.f6267c[i]);
                i++;
            }
        } else {
            while (i < this.f6268d && !m5Var.e()) {
                m5Var.accept(this.f6267c[i]);
                i++;
            }
        }
        m5Var.end();
        this.f6267c = null;
    }

    @Override // j$.util.stream.k5, j$.util.stream.m5
    public final void accept(int i) {
        int[] iArr = this.f6267c;
        int i6 = this.f6268d;
        this.f6268d = i6 + 1;
        iArr[i6] = i;
    }
}
