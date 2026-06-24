package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d extends CountedCompleter {
    public static final int g = ForkJoinPool.getCommonPoolParallelism() << 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f6168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Spliterator f6169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f6170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f6171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f6172e;
    public Object f;

    public abstract Object a();

    public abstract d c(Spliterator spliterator);

    public d(a aVar, Spliterator spliterator) {
        super(null);
        this.f6168a = aVar;
        this.f6169b = spliterator;
        this.f6170c = 0L;
    }

    public d(d dVar, Spliterator spliterator) {
        super(dVar);
        this.f6169b = spliterator;
        this.f6168a = dVar.f6168a;
        this.f6170c = dVar.f6170c;
    }

    public static long e(long j) {
        long j6 = j / ((long) g);
        if (j6 > 0) {
            return j6;
        }
        return 1L;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }

    public void d(Object obj) {
        this.f = obj;
    }

    public final boolean b() {
        return ((d) getCompleter()) == null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f6169b;
        long jEstimateSize = spliterator.estimateSize();
        long jE = this.f6170c;
        if (jE == 0) {
            jE = e(jEstimateSize);
            this.f6170c = jE;
        }
        boolean z9 = false;
        d dVar = this;
        while (jEstimateSize > jE && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            d dVarC = dVar.c(spliteratorTrySplit);
            dVar.f6171d = dVarC;
            d dVarC2 = dVar.c(spliterator);
            dVar.f6172e = dVarC2;
            dVar.setPendingCount(1);
            if (z9) {
                spliterator = spliteratorTrySplit;
                dVar = dVarC;
                dVarC = dVarC2;
            } else {
                dVar = dVarC2;
            }
            z9 = !z9;
            dVarC.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        dVar.d(dVar.a());
        dVar.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.f6169b = null;
        this.f6172e = null;
        this.f6171d = null;
    }
}
