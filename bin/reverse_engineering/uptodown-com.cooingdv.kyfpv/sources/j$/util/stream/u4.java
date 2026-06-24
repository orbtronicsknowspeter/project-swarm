package j$.util.stream;

import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class u4 extends x4 implements k5 {
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        d((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.e(this, intConsumer);
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ void d(Integer num) {
        w3.g(this, num);
    }

    @Override // j$.util.stream.s4, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f6425b);
    }

    @Override // j$.util.stream.r4
    public final void i(r4 r4Var) {
        this.f6425b += ((x4) r4Var).f6425b;
    }

    @Override // j$.util.stream.x4, j$.util.stream.m5
    public final void accept(int i) {
        this.f6425b++;
    }
}
