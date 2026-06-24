package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class q1 implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f6106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6109d;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        c.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return c.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return c.e(this, i);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return c.g(this, consumer);
    }

    public q1(int[] iArr, int i, int i6, int i10) {
        this.f6106a = iArr;
        this.f6107b = i;
        this.f6108c = i6;
        this.f6109d = i10 | 16448;
    }

    @Override // j$.util.e1, j$.util.Spliterator
    public final y0 trySplit() {
        int i = this.f6107b;
        int i6 = (this.f6108c + i) >>> 1;
        if (i >= i6) {
            return null;
        }
        this.f6107b = i6;
        return new q1(this.f6106a, i, i6, this.f6109d);
    }

    @Override // j$.util.e1
    public final void forEachRemaining(IntConsumer intConsumer) {
        int i;
        intConsumer.getClass();
        int[] iArr = this.f6106a;
        int length = iArr.length;
        int i6 = this.f6108c;
        if (length < i6 || (i = this.f6107b) < 0) {
            return;
        }
        this.f6107b = i6;
        if (i < i6) {
            do {
                intConsumer.accept(iArr[i]);
                i++;
            } while (i < i6);
        }
    }

    @Override // j$.util.e1
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        int i = this.f6107b;
        if (i < 0 || i >= this.f6108c) {
            return false;
        }
        this.f6107b = i + 1;
        intConsumer.accept(this.f6106a[i]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f6108c - this.f6107b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f6109d;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (c.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
