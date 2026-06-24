package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: loaded from: classes2.dex */
public final class s0 extends CountedCompleter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f6343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Spliterator f6344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap f6346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r0 f6347e;
    public final s0 f;
    public h2 g;

    public s0(a aVar, Spliterator spliterator, r0 r0Var) {
        super(null);
        this.f6343a = aVar;
        this.f6344b = spliterator;
        this.f6345c = d.e(spliterator.estimateSize());
        this.f6346d = new ConcurrentHashMap(Math.max(16, d.g << 1));
        this.f6347e = r0Var;
        this.f = null;
    }

    public s0(s0 s0Var, Spliterator spliterator, s0 s0Var2) {
        super(s0Var);
        this.f6343a = s0Var.f6343a;
        this.f6344b = spliterator;
        this.f6345c = s0Var.f6345c;
        this.f6346d = s0Var.f6346d;
        this.f6347e = s0Var.f6347e;
        this.f = s0Var2;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f6344b;
        long j = this.f6345c;
        boolean z9 = false;
        s0 s0Var = this;
        while (spliterator.estimateSize() > j && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            s0 s0Var2 = new s0(s0Var, spliteratorTrySplit, s0Var.f);
            s0 s0Var3 = new s0(s0Var, spliterator, s0Var2);
            s0Var.addToPendingCount(1);
            s0Var3.addToPendingCount(1);
            s0Var.f6346d.put(s0Var2, s0Var3);
            if (s0Var.f != null) {
                s0Var2.addToPendingCount(1);
                if (s0Var.f6346d.replace(s0Var.f, s0Var, s0Var2)) {
                    s0Var.addToPendingCount(-1);
                } else {
                    s0Var2.addToPendingCount(-1);
                }
            }
            if (z9) {
                spliterator = spliteratorTrySplit;
                s0Var = s0Var2;
                s0Var2 = s0Var3;
            } else {
                s0Var = s0Var3;
            }
            z9 = !z9;
            s0Var2.fork();
        }
        if (s0Var.getPendingCount() > 0) {
            q qVar = new q(15);
            a aVar = s0Var.f6343a;
            z1 z1VarI = aVar.I(aVar.F(spliterator), qVar);
            s0Var.f6343a.Q(spliterator, z1VarI);
            s0Var.g = z1VarI.build();
            s0Var.f6344b = null;
        }
        s0Var.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        h2 h2Var = this.g;
        if (h2Var != null) {
            h2Var.forEach(this.f6347e);
            this.g = null;
        } else {
            Spliterator spliterator = this.f6344b;
            if (spliterator != null) {
                this.f6343a.Q(spliterator, this.f6347e);
                this.f6344b = null;
            }
        }
        s0 s0Var = (s0) this.f6346d.remove(this);
        if (s0Var != null) {
            s0Var.tryComplete();
        }
    }
}
