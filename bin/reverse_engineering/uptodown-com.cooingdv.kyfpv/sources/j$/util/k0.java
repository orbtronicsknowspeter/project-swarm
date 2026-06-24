package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k0 implements m0, z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PrimitiveIterator.OfInt f6085a;

    public /* synthetic */ k0(PrimitiveIterator.OfInt ofInt) {
        this.f6085a = ofInt;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfInt ofInt = this.f6085a;
        if (obj instanceof k0) {
            obj = ((k0) obj).f6085a;
        }
        return ofInt.equals(obj);
    }

    @Override // j$.util.r0
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f6085a.forEachRemaining(obj);
    }

    @Override // j$.util.m0, java.util.Iterator, j$.util.z
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f6085a.forEachRemaining((Consumer<? super Integer>) consumer);
    }

    @Override // j$.util.m0
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f6085a.forEachRemaining(intConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f6085a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f6085a.hashCode();
    }

    @Override // j$.util.m0, java.util.Iterator
    public final /* synthetic */ Integer next() {
        return this.f6085a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f6085a.next();
    }

    @Override // j$.util.m0
    public final /* synthetic */ int nextInt() {
        return this.f6085a.nextInt();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f6085a.remove();
    }
}
