package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class j1 implements i0, DoubleConsumer, z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f6082a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f6083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v0 f6084c;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.d(this, doubleConsumer);
    }

    @Override // j$.util.r0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        while (hasNext()) {
            doubleConsumer.accept(nextDouble());
        }
    }

    @Override // java.util.Iterator
    public final Double next() {
        if (v1.f6473a) {
            v1.a(j1.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
            throw null;
        }
        return Double.valueOf(nextDouble());
    }

    @Override // j$.util.i0, java.util.Iterator, j$.util.z
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            forEachRemaining((DoubleConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (v1.f6473a) {
            v1.a(j1.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((DoubleConsumer) new f0(consumer, 0));
    }

    public j1(v0 v0Var) {
        this.f6084c = v0Var;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
        this.f6082a = true;
        this.f6083b = d10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f6082a) {
            this.f6084c.tryAdvance((DoubleConsumer) this);
        }
        return this.f6082a;
    }

    @Override // j$.util.i0
    public final double nextDouble() {
        if (!this.f6082a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f6082a = false;
        return this.f6083b;
    }
}
