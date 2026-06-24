package j$.util.stream;

import j$.util.Objects;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s7 extends u7 implements j$.util.e1 {
    public abstract Object b();

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

    public s7(j$.util.e1 e1Var, long j, long j6) {
        super(e1Var, j, j6, 0L, Math.min(e1Var.estimateSize(), j6));
    }

    @Override // j$.util.e1
    public final boolean tryAdvance(Object obj) {
        long j;
        Objects.requireNonNull(obj);
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
            ((j$.util.e1) this.f6390c).tryAdvance(b());
            this.f6391d++;
        }
        if (j >= this.f6392e) {
            return false;
        }
        this.f6391d = j + 1;
        return ((j$.util.e1) this.f6390c).tryAdvance(obj);
    }

    @Override // j$.util.e1
    public final void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
        long j = this.f6392e;
        long j6 = this.f6388a;
        if (j6 >= j) {
            return;
        }
        long j10 = this.f6391d;
        if (j10 >= j) {
            return;
        }
        if (j10 >= j6 && ((j$.util.e1) this.f6390c).estimateSize() + j10 <= this.f6389b) {
            ((j$.util.e1) this.f6390c).forEachRemaining(obj);
            this.f6391d = this.f6392e;
            return;
        }
        while (j6 > this.f6391d) {
            ((j$.util.e1) this.f6390c).tryAdvance(b());
            this.f6391d++;
        }
        while (this.f6391d < this.f6392e) {
            ((j$.util.e1) this.f6390c).tryAdvance(obj);
            this.f6391d++;
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }
}
