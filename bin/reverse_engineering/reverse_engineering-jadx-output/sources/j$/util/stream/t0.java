package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: loaded from: classes2.dex */
public final class t0 extends CountedCompleter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Spliterator f6358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m5 f6359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f6360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f6361d;

    public t0(a aVar, Spliterator spliterator, m5 m5Var) {
        super(null);
        this.f6359b = m5Var;
        this.f6360c = aVar;
        this.f6358a = spliterator;
        this.f6361d = 0L;
    }

    public t0(t0 t0Var, Spliterator spliterator) {
        super(t0Var);
        this.f6358a = spliterator;
        this.f6359b = t0Var.f6359b;
        this.f6361d = t0Var.f6361d;
        this.f6360c = t0Var.f6360c;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f6358a;
        long jEstimateSize = spliterator.estimateSize();
        long jE = this.f6361d;
        if (jE == 0) {
            jE = d.e(jEstimateSize);
            this.f6361d = jE;
        }
        boolean zJ = z6.SHORT_CIRCUIT.j(this.f6360c.f);
        m5 m5Var = this.f6359b;
        boolean z9 = false;
        t0 t0Var = this;
        while (true) {
            if (zJ && m5Var.e()) {
                break;
            }
            if (jEstimateSize <= jE || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                break;
            }
            t0 t0Var2 = new t0(t0Var, spliteratorTrySplit);
            t0Var.addToPendingCount(1);
            if (z9) {
                spliterator = spliteratorTrySplit;
            } else {
                t0 t0Var3 = t0Var;
                t0Var = t0Var2;
                t0Var2 = t0Var3;
            }
            z9 = !z9;
            t0Var.fork();
            t0Var = t0Var2;
            jEstimateSize = spliterator.estimateSize();
        }
        t0Var.f6360c.z(spliterator, m5Var);
        t0Var.f6358a = null;
        t0Var.propagateCompletion();
    }
}
