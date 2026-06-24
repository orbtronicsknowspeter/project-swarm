package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s3 extends CountedCompleter implements m5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Spliterator f6347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f6348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6351e;
    public int f;
    public int g;

    public abstract s3 a(Spliterator spliterator, long j, long j6);

    public /* synthetic */ void accept(double d10) {
        w3.c();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        w3.k();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        w3.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ void end() {
    }

    public s3(Spliterator spliterator, a aVar, int i) {
        this.f6347a = spliterator;
        this.f6348b = aVar;
        this.f6349c = d.e(spliterator.estimateSize());
        this.f6350d = 0L;
        this.f6351e = i;
    }

    public s3(s3 s3Var, Spliterator spliterator, long j, long j6, int i) {
        super(s3Var);
        this.f6347a = spliterator;
        this.f6348b = s3Var.f6348b;
        this.f6349c = s3Var.f6349c;
        this.f6350d = j;
        this.f6351e = j6;
        if (j < 0 || j6 < 0 || (j + j6) - 1 >= i) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j), Long.valueOf(j), Long.valueOf(j6), Integer.valueOf(i)));
        }
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f6347a;
        s3 s3VarA = this;
        while (spliterator.estimateSize() > s3VarA.f6349c && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            s3VarA.setPendingCount(1);
            long jEstimateSize = spliteratorTrySplit.estimateSize();
            s3 s3Var = s3VarA;
            s3Var.a(spliteratorTrySplit, s3VarA.f6350d, jEstimateSize).fork();
            s3VarA = s3Var.a(spliterator, s3Var.f6350d + jEstimateSize, s3Var.f6351e - jEstimateSize);
        }
        s3 s3Var2 = s3VarA;
        s3Var2.f6348b.Q(spliterator, s3Var2);
        s3Var2.propagateCompletion();
    }

    @Override // j$.util.stream.m5
    public final void c(long j) {
        long j6 = this.f6351e;
        if (j > j6) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i = (int) this.f6350d;
        this.f = i;
        this.g = i + ((int) j6);
    }
}
