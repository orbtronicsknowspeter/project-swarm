package j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j implements java.util.stream.Collector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Collector f6233a;

    public /* synthetic */ j(Collector collector) {
        this.f6233a = collector;
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ BiConsumer accumulator() {
        return this.f6233a.accumulator();
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Set characteristics() {
        return w3.N(this.f6233a.characteristics());
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ BinaryOperator combiner() {
        return this.f6233a.combiner();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Collector collector = this.f6233a;
        if (obj instanceof j) {
            obj = ((j) obj).f6233a;
        }
        return collector.equals(obj);
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Function finisher() {
        return this.f6233a.finisher();
    }

    public final /* synthetic */ int hashCode() {
        return this.f6233a.hashCode();
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Supplier supplier() {
        return this.f6233a.supplier();
    }
}
