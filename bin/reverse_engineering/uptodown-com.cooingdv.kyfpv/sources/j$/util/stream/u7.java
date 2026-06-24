package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Spliterator f6390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f6391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f6392e;

    public abstract Spliterator a(Spliterator spliterator, long j, long j6, long j10, long j11);

    public u7(Spliterator spliterator, long j, long j6, long j10, long j11) {
        this.f6390c = spliterator;
        this.f6388a = j;
        this.f6389b = j6;
        this.f6391d = j10;
        this.f6392e = j11;
    }

    public final Spliterator trySplit() {
        long j = this.f6392e;
        if (this.f6388a >= j || this.f6391d >= j) {
            return null;
        }
        while (true) {
            Spliterator spliteratorTrySplit = this.f6390c.trySplit();
            if (spliteratorTrySplit == null) {
                return null;
            }
            long jEstimateSize = spliteratorTrySplit.estimateSize() + this.f6391d;
            long jMin = Math.min(jEstimateSize, this.f6389b);
            long j6 = this.f6388a;
            if (j6 >= jMin) {
                this.f6391d = jMin;
            } else {
                long j10 = this.f6389b;
                if (jMin >= j10) {
                    this.f6390c = spliteratorTrySplit;
                    this.f6392e = jMin;
                } else {
                    long j11 = this.f6391d;
                    if (j11 >= j6 && jEstimateSize <= j10) {
                        this.f6391d = jMin;
                        return spliteratorTrySplit;
                    }
                    this.f6391d = jMin;
                    return a(spliteratorTrySplit, j6, j10, j11, jMin);
                }
            }
        }
    }

    public final long estimateSize() {
        long j = this.f6392e;
        long j6 = this.f6388a;
        if (j6 < j) {
            return j - Math.max(j6, this.f6391d);
        }
        return 0L;
    }

    public final int characteristics() {
        return this.f6390c.characteristics();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.e1 m241trySplit() {
        return (j$.util.e1) trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.y0 m243trySplit() {
        return (j$.util.y0) trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.b1 m240trySplit() {
        return (j$.util.b1) trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.v0 m242trySplit() {
        return (j$.util.v0) trySplit();
    }
}
