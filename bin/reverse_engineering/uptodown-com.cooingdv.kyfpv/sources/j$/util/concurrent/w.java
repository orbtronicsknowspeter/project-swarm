package j$.util.concurrent;

import j$.util.y0;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f6023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6026d;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.c.b(this, consumer);
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
        return j$.util.c.g(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public w(long j, long j6, int i, int i6) {
        this.f6023a = j;
        this.f6024b = j6;
        this.f6025c = i;
        this.f6026d = i6;
    }

    @Override // j$.util.y0, j$.util.e1, j$.util.Spliterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final w trySplit() {
        long j = this.f6023a;
        long j6 = (this.f6024b + j) >>> 1;
        if (j6 <= j) {
            return null;
        }
        this.f6023a = j6;
        return new w(j, j6, this.f6025c, this.f6026d);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f6024b - this.f6023a;
    }

    @Override // j$.util.e1
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j = this.f6023a;
        if (j >= this.f6024b) {
            return false;
        }
        intConsumer.accept(ThreadLocalRandom.current().b(this.f6025c, this.f6026d));
        this.f6023a = j + 1;
        return true;
    }

    @Override // j$.util.e1
    public final void forEachRemaining(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j = this.f6023a;
        long j6 = this.f6024b;
        if (j < j6) {
            this.f6023a = j6;
            ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
            do {
                intConsumer.accept(threadLocalRandomCurrent.b(this.f6025c, this.f6026d));
                j++;
            } while (j < j6);
        }
    }
}
