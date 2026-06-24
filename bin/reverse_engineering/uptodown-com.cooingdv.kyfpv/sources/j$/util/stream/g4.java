package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class g4 extends s4 implements r4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BiFunction f6204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BinaryOperator f6205d;

    @Override // j$.util.stream.m5, j$.util.stream.j5, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d10) {
        w3.c();
        throw null;
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ void accept(int i) {
        w3.k();
        throw null;
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ void accept(long j) {
        w3.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.r4
    public final void i(r4 r4Var) {
        this.f6353a = this.f6205d.apply(this.f6353a, ((g4) r4Var).f6353a);
    }

    @Override // j$.util.stream.m5
    public final void c(long j) {
        this.f6353a = this.f6203b;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        this.f6353a = this.f6204c.apply(this.f6353a, obj);
    }

    public g4(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        this.f6203b = obj;
        this.f6204c = biFunction;
        this.f6205d = binaryOperator;
    }
}
