package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class q4 implements r4, l5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f6331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f6332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LongBinaryOperator f6333c;

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

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.f(this, longConsumer);
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void l(Long l10) {
        w3.i(this, l10);
    }

    public q4(LongBinaryOperator longBinaryOperator) {
        this.f6333c = longBinaryOperator;
    }

    @Override // j$.util.stream.r4
    public final void i(r4 r4Var) {
        q4 q4Var = (q4) r4Var;
        if (q4Var.f6331a) {
            return;
        }
        accept(q4Var.f6332b);
    }

    @Override // j$.util.stream.m5
    public final void c(long j) {
        this.f6331a = true;
        this.f6332b = 0L;
    }

    @Override // j$.util.stream.m5
    public final void accept(long j) {
        if (this.f6331a) {
            this.f6331a = false;
            this.f6332b = j;
        } else {
            this.f6332b = this.f6333c.applyAsLong(this.f6332b, j);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f6331a ? j$.util.e0.f6040c : new j$.util.e0(this.f6332b);
    }
}
