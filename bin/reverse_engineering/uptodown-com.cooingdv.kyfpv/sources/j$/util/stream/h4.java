package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class h4 implements r4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f6212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f6213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BinaryOperator f6214c;

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

    public h4(BinaryOperator binaryOperator) {
        this.f6214c = binaryOperator;
    }

    @Override // j$.util.stream.r4
    public final void i(r4 r4Var) {
        h4 h4Var = (h4) r4Var;
        if (h4Var.f6212a) {
            return;
        }
        n(h4Var.f6213b);
    }

    @Override // j$.util.stream.m5
    public final void c(long j) {
        this.f6212a = true;
        this.f6213b = null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        if (this.f6212a) {
            this.f6212a = false;
            this.f6213b = obj;
        } else {
            this.f6213b = this.f6214c.apply(this.f6213b, obj);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f6212a ? j$.util.b0.f5972b : new j$.util.b0(this.f6213b);
    }
}
