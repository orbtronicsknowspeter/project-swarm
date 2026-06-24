package j$.util.concurrent;

import j$.util.v0;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class v implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f6019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f6021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f6022d;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.c.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.c.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.util.c.e(this, i);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.c.f(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public v(long j, long j6, double d10, double d11) {
        this.f6019a = j;
        this.f6020b = j6;
        this.f6021c = d10;
        this.f6022d = d11;
    }

    @Override // j$.util.v0, j$.util.e1, j$.util.Spliterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final v trySplit() {
        long j = this.f6019a;
        long j6 = (this.f6020b + j) >>> 1;
        if (j6 <= j) {
            return null;
        }
        this.f6019a = j6;
        return new v(j, j6, this.f6021c, this.f6022d);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f6020b - this.f6019a;
    }

    @Override // j$.util.e1
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j = this.f6019a;
        if (j >= this.f6020b) {
            return false;
        }
        doubleConsumer.accept(ThreadLocalRandom.current().a(this.f6021c, this.f6022d));
        this.f6019a = j + 1;
        return true;
    }

    @Override // j$.util.e1
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j = this.f6019a;
        long j6 = this.f6020b;
        if (j < j6) {
            this.f6019a = j6;
            ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
            do {
                doubleConsumer.accept(threadLocalRandomCurrent.a(this.f6021c, this.f6022d));
                j++;
            } while (j < j6);
        }
    }
}
