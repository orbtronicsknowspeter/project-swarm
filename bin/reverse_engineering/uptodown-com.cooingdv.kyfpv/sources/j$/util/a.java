package j$.util;

import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f5968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5970c;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
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
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public a(java.util.List list) {
        this.f5968a = list;
        this.f5969b = 0;
        this.f5970c = -1;
    }

    public a(a aVar, int i, int i6) {
        this.f5968a = aVar.f5968a;
        this.f5969b = i;
        this.f5970c = i6;
    }

    public final int a() {
        java.util.List list = this.f5968a;
        int i = this.f5970c;
        if (i >= 0) {
            return i;
        }
        int size = list.size();
        this.f5970c = size;
        return size;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int iA = a();
        int i = this.f5969b;
        int i6 = (iA + i) >>> 1;
        if (i >= i6) {
            return null;
        }
        this.f5969b = i6;
        return new a(this, i, i6);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int iA = a();
        int i = this.f5969b;
        if (i >= iA) {
            return false;
        }
        this.f5969b = i + 1;
        try {
            consumer.accept(this.f5968a.get(i));
            return true;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        java.util.List list = this.f5968a;
        int iA = a();
        this.f5969b = iA;
        for (int i = this.f5969b; i < iA; i++) {
            try {
                consumer.accept(list.get(i));
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return a() - this.f5969b;
    }
}
