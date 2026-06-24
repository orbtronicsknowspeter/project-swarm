package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c0 implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DoubleStream f6156a;

    public /* synthetic */ c0(DoubleStream doubleStream) {
        this.f6156a = doubleStream;
    }

    public static /* synthetic */ e0 g(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof d0 ? ((d0) doubleStream).f6174a : new c0(doubleStream);
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ e0 a() {
        return g(this.f6156a.takeWhile(null));
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ j$.util.c0 average() {
        return j$.util.c.j(this.f6156a.average());
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ Stream boxed() {
        return x6.g(this.f6156a.boxed());
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ e0 c() {
        return g(this.f6156a.filter(null));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f6156a.close();
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return this.f6156a.collect(supplier, objDoubleConsumer, biConsumer);
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ long count() {
        return this.f6156a.count();
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ e0 d() {
        return g(this.f6156a.dropWhile(null));
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ e0 distinct() {
        return g(this.f6156a.distinct());
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ e0 e() {
        return g(this.f6156a.map(null));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleStream doubleStream = this.f6156a;
        if (obj instanceof c0) {
            obj = ((c0) obj).f6156a;
        }
        return doubleStream.equals(obj);
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ j$.util.c0 findAny() {
        return j$.util.c.j(this.f6156a.findAny());
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ j$.util.c0 findFirst() {
        return j$.util.c.j(this.f6156a.findFirst());
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.f6156a.forEach(doubleConsumer);
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.f6156a.forEachOrdered(doubleConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f6156a.hashCode();
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ boolean isParallel() {
        return this.f6156a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfDouble] */
    @Override // j$.util.stream.e0, j$.util.stream.g
    public final /* synthetic */ j$.util.i0 iterator() {
        ?? it = this.f6156a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof j$.util.h0 ? ((j$.util.h0) it).f6067a : new j$.util.g0(it);
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ Iterator iterator() {
        return this.f6156a.iterator();
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ boolean k() {
        return this.f6156a.anyMatch(null);
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ e0 limit(long j) {
        return g(this.f6156a.limit(j));
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ Stream mapToObj(DoubleFunction doubleFunction) {
        return x6.g(this.f6156a.mapToObj(doubleFunction));
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ j$.util.c0 max() {
        return j$.util.c.j(this.f6156a.max());
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ j$.util.c0 min() {
        return j$.util.c.j(this.f6156a.min());
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g onClose(Runnable runnable) {
        return e.g(this.f6156a.onClose(runnable));
    }

    @Override // j$.util.stream.e0, j$.util.stream.g
    public final /* synthetic */ e0 parallel() {
        return g(this.f6156a.parallel());
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g parallel() {
        return e.g(this.f6156a.parallel());
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ e0 peek(DoubleConsumer doubleConsumer) {
        return g(this.f6156a.peek(doubleConsumer));
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ double reduce(double d10, DoubleBinaryOperator doubleBinaryOperator) {
        return this.f6156a.reduce(d10, doubleBinaryOperator);
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ j$.util.c0 reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return j$.util.c.j(this.f6156a.reduce(doubleBinaryOperator));
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ boolean s() {
        return this.f6156a.allMatch(null);
    }

    @Override // j$.util.stream.e0, j$.util.stream.g
    public final /* synthetic */ e0 sequential() {
        return g(this.f6156a.sequential());
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g sequential() {
        return e.g(this.f6156a.sequential());
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ e0 skip(long j) {
        return g(this.f6156a.skip(j));
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ e0 sorted() {
        return g(this.f6156a.sorted());
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.f1.a(this.f6156a.spliterator());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfDouble] */
    @Override // j$.util.stream.e0, j$.util.stream.g
    public final /* synthetic */ j$.util.v0 spliterator() {
        return j$.util.t0.a(this.f6156a.spliterator());
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ double sum() {
        return this.f6156a.sum();
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ n1 t() {
        return l1.g(this.f6156a.mapToLong(null));
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ double[] toArray() {
        return this.f6156a.toArray();
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g unordered() {
        return e.g(this.f6156a.unordered());
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ IntStream w() {
        return IntStream.VivifiedWrapper.convert(this.f6156a.mapToInt(null));
    }

    @Override // j$.util.stream.e0
    public final /* synthetic */ boolean y() {
        return this.f6156a.noneMatch(null);
    }

    @Override // j$.util.stream.e0
    public final j$.util.x summaryStatistics() {
        this.f6156a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    @Override // j$.util.stream.e0
    public final e0 b(j$.util.q qVar) {
        DoubleStream doubleStream = this.f6156a;
        j$.util.q qVar2 = new j$.util.q(5);
        qVar2.f6105b = qVar;
        return g(doubleStream.flatMap(qVar2));
    }
}
