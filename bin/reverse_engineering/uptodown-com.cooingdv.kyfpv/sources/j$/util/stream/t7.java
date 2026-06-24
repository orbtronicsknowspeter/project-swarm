package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class t7 extends u7 implements Spliterator {
    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.c.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.util.c.e(this, i);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public t7(Spliterator spliterator, long j, long j6) {
        super(spliterator, j, j6, 0L, Math.min(spliterator.estimateSize(), j6));
    }

    @Override // j$.util.stream.u7
    public final Spliterator a(Spliterator spliterator, long j, long j6, long j10, long j11) {
        return new t7(spliterator, j, j6, j10, j11);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        long j;
        Objects.requireNonNull(consumer);
        long j6 = this.f6392e;
        long j10 = this.f6388a;
        if (j10 >= j6) {
            return false;
        }
        while (true) {
            j = this.f6391d;
            if (j10 <= j) {
                break;
            }
            this.f6390c.tryAdvance(new d1(21));
            this.f6391d++;
        }
        if (j >= this.f6392e) {
            return false;
        }
        this.f6391d = j + 1;
        return this.f6390c.tryAdvance(consumer);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        long j = this.f6392e;
        long j6 = this.f6388a;
        if (j6 >= j) {
            return;
        }
        long j10 = this.f6391d;
        if (j10 >= j) {
            return;
        }
        if (j10 >= j6 && this.f6390c.estimateSize() + j10 <= this.f6389b) {
            this.f6390c.forEachRemaining(consumer);
            this.f6391d = this.f6392e;
            return;
        }
        while (j6 > this.f6391d) {
            this.f6390c.tryAdvance(new d1(22));
            this.f6391d++;
        }
        while (this.f6391d < this.f6392e) {
            this.f6390c.tryAdvance(consumer);
            this.f6391d++;
        }
    }
}
