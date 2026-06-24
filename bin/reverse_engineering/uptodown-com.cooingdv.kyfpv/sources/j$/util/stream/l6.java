package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class l6 extends z5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f6281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6282d;

    @Override // j$.util.stream.h5, j$.util.stream.m5
    public final void c(long j) {
        if (j >= 2147483639) {
            j$.time.g.c("Stream size exceeds max array size");
        } else {
            this.f6281c = new long[(int) j];
        }
    }

    @Override // j$.util.stream.h5, j$.util.stream.m5
    public final void end() {
        int i = 0;
        Arrays.sort(this.f6281c, 0, this.f6282d);
        long j = this.f6282d;
        m5 m5Var = this.f6215a;
        m5Var.c(j);
        if (!this.f6442b) {
            while (i < this.f6282d) {
                m5Var.accept(this.f6281c[i]);
                i++;
            }
        } else {
            while (i < this.f6282d && !m5Var.e()) {
                m5Var.accept(this.f6281c[i]);
                i++;
            }
        }
        m5Var.end();
        this.f6281c = null;
    }

    @Override // j$.util.stream.l5, j$.util.stream.m5
    public final void accept(long j) {
        long[] jArr = this.f6281c;
        int i = this.f6282d;
        this.f6282d = i + 1;
        jArr[i] = j;
    }
}
