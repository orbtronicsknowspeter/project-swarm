package j$.util;

import androidx.core.location.LocationRequestCompat;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public class r1 implements Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.Collection f6111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f6112b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f6114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6115e;

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return c.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return c.e(this, i);
    }

    public r1(java.util.Collection collection, int i) {
        this.f6111a = collection;
        this.f6113c = (i & 4096) == 0 ? i | 16448 : i;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        long size;
        Iterator it = this.f6112b;
        if (it == null) {
            it = this.f6111a.iterator();
            this.f6112b = it;
            size = this.f6111a.size();
            this.f6114d = size;
        } else {
            size = this.f6114d;
        }
        if (size <= 1 || !it.hasNext()) {
            return null;
        }
        int i = this.f6115e + 1024;
        if (i > size) {
            i = (int) size;
        }
        if (i > 33554432) {
            i = 33554432;
        }
        Object[] objArr = new Object[i];
        int i6 = 0;
        do {
            objArr[i6] = it.next();
            i6++;
            if (i6 >= i) {
                break;
            }
        } while (it.hasNext());
        this.f6115e = i6;
        long j = this.f6114d;
        if (j != LocationRequestCompat.PASSIVE_INTERVAL) {
            this.f6114d = j - ((long) i6);
        }
        return new k1(objArr, 0, i6, this.f6113c);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        Iterator it = this.f6112b;
        if (it == null) {
            it = this.f6111a.iterator();
            this.f6112b = it;
            this.f6114d = this.f6111a.size();
        }
        c.r(it, consumer);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        if (this.f6112b == null) {
            this.f6112b = this.f6111a.iterator();
            this.f6114d = this.f6111a.size();
        }
        if (!this.f6112b.hasNext()) {
            return false;
        }
        consumer.accept(this.f6112b.next());
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        if (this.f6112b == null) {
            this.f6112b = this.f6111a.iterator();
            long size = this.f6111a.size();
            this.f6114d = size;
            return size;
        }
        return this.f6114d;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f6113c;
    }

    @Override // j$.util.Spliterator
    public Comparator getComparator() {
        if (c.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
