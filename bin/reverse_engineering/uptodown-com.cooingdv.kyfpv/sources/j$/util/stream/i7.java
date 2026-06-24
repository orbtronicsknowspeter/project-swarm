package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class i7 implements Spliterator, Consumer {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f6227d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Spliterator f6228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f6229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f6230c;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.c.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.util.c.e(this, i);
    }

    public i7(Spliterator spliterator, ConcurrentHashMap concurrentHashMap) {
        this.f6228a = spliterator;
        this.f6229b = concurrentHashMap;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        this.f6230c = obj;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        while (this.f6228a.tryAdvance(this)) {
            Object obj = this.f6230c;
            if (obj == null) {
                obj = f6227d;
            }
            if (this.f6229b.putIfAbsent(obj, Boolean.TRUE) == null) {
                consumer.n(this.f6230c);
                this.f6230c = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        this.f6228a.forEachRemaining(new j$.util.concurrent.t(8, this, consumer));
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator spliteratorTrySplit = this.f6228a.trySplit();
        if (spliteratorTrySplit != null) {
            return new i7(spliteratorTrySplit, this.f6229b);
        }
        return null;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f6228a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return (this.f6228a.characteristics() & (-16469)) | 1;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f6228a.getComparator();
    }
}
