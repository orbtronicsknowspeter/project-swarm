package j$.util.stream;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y8 implements Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Spliterator f6434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f6435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6437d;

    public abstract Spliterator b(Spliterator spliterator);

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.util.c.e(this, i);
    }

    @Override // j$.util.Spliterator
    public void forEachRemaining(Consumer consumer) {
        while (tryAdvance(consumer)) {
        }
    }

    public y8(Spliterator spliterator) {
        this.f6436c = true;
        this.f6434a = spliterator;
        this.f6435b = new AtomicBoolean();
    }

    public y8(Spliterator spliterator, y8 y8Var) {
        this.f6436c = true;
        this.f6434a = spliterator;
        y8Var.getClass();
        this.f6435b = y8Var.f6435b;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f6434a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f6434a.characteristics() & (-16449);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f6434a.getComparator();
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        Spliterator spliteratorTrySplit = this.f6434a.trySplit();
        if (spliteratorTrySplit != null) {
            return b(spliteratorTrySplit);
        }
        return null;
    }

    public final boolean a() {
        return (this.f6437d == 0 && this.f6435b.get()) ? false : true;
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.y0 trySplit() {
        return (j$.util.y0) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.b1 trySplit() {
        return (j$.util.b1) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.e1 trySplit() {
        return (j$.util.e1) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.v0 trySplit() {
        return (j$.util.v0) trySplit();
    }
}
