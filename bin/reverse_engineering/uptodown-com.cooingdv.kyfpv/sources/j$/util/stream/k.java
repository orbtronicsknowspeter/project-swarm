package j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements Collector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Supplier f6250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BiConsumer f6251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BinaryOperator f6252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function f6253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f6254e;

    public k(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, Function function, Set set) {
        this.f6250a = supplier;
        this.f6251b = biConsumer;
        this.f6252c = binaryOperator;
        this.f6253d = function;
        this.f6254e = set;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, Set set) {
        this(supplier, biConsumer, binaryOperator, new j$.time.format.a(16), set);
        Set set2 = Collectors.f6121a;
    }

    @Override // j$.util.stream.Collector
    public final BiConsumer accumulator() {
        return this.f6251b;
    }

    @Override // j$.util.stream.Collector
    public final Supplier supplier() {
        return this.f6250a;
    }

    @Override // j$.util.stream.Collector
    public final BinaryOperator combiner() {
        return this.f6252c;
    }

    @Override // j$.util.stream.Collector
    public final Function finisher() {
        return this.f6253d;
    }

    @Override // j$.util.stream.Collector
    public final Set characteristics() {
        return this.f6254e;
    }
}
