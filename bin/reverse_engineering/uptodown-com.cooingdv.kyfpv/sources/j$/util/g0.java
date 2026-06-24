package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g0 implements i0, z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PrimitiveIterator.OfDouble f6061a;

    public /* synthetic */ g0(PrimitiveIterator.OfDouble ofDouble) {
        this.f6061a = ofDouble;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfDouble ofDouble = this.f6061a;
        if (obj instanceof g0) {
            obj = ((g0) obj).f6061a;
        }
        return ofDouble.equals(obj);
    }

    @Override // j$.util.r0
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f6061a.forEachRemaining(obj);
    }

    @Override // j$.util.i0, java.util.Iterator, j$.util.z
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f6061a.forEachRemaining((Consumer<? super Double>) consumer);
    }

    @Override // j$.util.i0
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f6061a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f6061a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f6061a.hashCode();
    }

    @Override // j$.util.i0, java.util.Iterator
    public final /* synthetic */ Double next() {
        return this.f6061a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f6061a.next();
    }

    @Override // j$.util.i0
    public final /* synthetic */ double nextDouble() {
        return this.f6061a.nextDouble();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f6061a.remove();
    }
}
