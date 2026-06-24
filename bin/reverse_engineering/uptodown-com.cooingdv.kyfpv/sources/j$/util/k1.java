package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class k1 implements Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f6086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6089d;

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return c.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return c.e(this, i);
    }

    public k1(Object[] objArr, int i, int i6, int i10) {
        this.f6086a = objArr;
        this.f6087b = i;
        this.f6088c = i6;
        this.f6089d = i10 | 16448;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i = this.f6087b;
        int i6 = (this.f6088c + i) >>> 1;
        if (i >= i6) {
            return null;
        }
        this.f6087b = i6;
        return new k1(this.f6086a, i, i6, this.f6089d);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        int i;
        consumer.getClass();
        Object[] objArr = this.f6086a;
        int length = objArr.length;
        int i6 = this.f6088c;
        if (length < i6 || (i = this.f6087b) < 0) {
            return;
        }
        this.f6087b = i6;
        if (i < i6) {
            do {
                consumer.accept(objArr[i]);
                i++;
            } while (i < i6);
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int i = this.f6087b;
        if (i < 0 || i >= this.f6088c) {
            return false;
        }
        this.f6087b = i + 1;
        consumer.accept(this.f6086a[i]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f6088c - this.f6087b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f6089d;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (c.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
