package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: loaded from: classes2.dex */
public final class t0 extends CountedCompleter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Spliterator f6359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m5 f6360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f6361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f6362d;

    public t0(a aVar, Spliterator spliterator, m5 m5Var) {
        super(null);
        this.f6360b = m5Var;
        this.f6361c = aVar;
        this.f6359a = spliterator;
        this.f6362d = 0L;
    }

    public t0(t0 t0Var, Spliterator spliterator) {
        super(t0Var);
        this.f6359a = spliterator;
        this.f6360b = t0Var.f6360b;
        this.f6362d = t0Var.f6362d;
        this.f6361c = t0Var.f6361c;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f6359a;
        long jEstimateSize = spliterator.estimateSize();
        long jE = this.f6362d;
        if (jE == 0) {
            jE = d.e(jEstimateSize);
            this.f6362d = jE;
        }
        boolean zJ = z6.SHORT_CIRCUIT.j(this.f6361c.f);
        m5 m5Var = this.f6360b;
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
        t0Var.f6361c.z(spliterator, m5Var);
        t0Var.f6359a = null;
        t0Var.propagateCompletion();
    }
}
