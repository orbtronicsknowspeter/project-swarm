package j$.util.stream;

import j$.util.Objects;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class f1 extends h5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j$.util.n0 f6194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1 f6195d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(g1 g1Var, m5 m5Var) {
        super(m5Var);
        this.f6195d = g1Var;
        m5 m5Var2 = this.f6215a;
        Objects.requireNonNull(m5Var2);
        this.f6194c = new j$.util.n0(m5Var2, 1);
    }

    @Override // j$.util.stream.h5, j$.util.stream.m5
    public final void c(long j) {
        this.f6215a.c(-1L);
    }

    @Override // j$.util.stream.l5, j$.util.stream.m5
    public final void accept(long j) throws Exception {
        n1 n1Var = (n1) ((j$.util.q) this.f6195d.f6202m).apply(j);
        if (n1Var != null) {
            try {
                boolean z9 = this.f6193b;
                j$.util.n0 n0Var = this.f6194c;
                if (!z9) {
                    n1Var.sequential().forEach(n0Var);
                } else {
                    j$.util.b1 b1VarSpliterator = n1Var.sequential().spliterator();
                    while (!this.f6215a.e() && b1VarSpliterator.tryAdvance((LongConsumer) n0Var)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    n1Var.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (n1Var != null) {
            n1Var.close();
        }
    }

    @Override // j$.util.stream.h5, j$.util.stream.m5
    public final boolean e() {
        this.f6193b = true;
        return this.f6215a.e();
    }
}
