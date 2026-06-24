package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 implements f8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Predicate f6191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Supplier f6192d;

    public f0(boolean z9, a7 a7Var, Object obj, Predicate predicate, Supplier supplier) {
        this.f6189a = (z9 ? 0 : z6.f6450r) | z6.f6453u;
        this.f6190b = obj;
        this.f6191c = predicate;
        this.f6192d = supplier;
    }

    @Override // j$.util.stream.f8
    public final int f() {
        return this.f6189a;
    }

    @Override // j$.util.stream.f8
    public final Object a(a aVar, Spliterator spliterator) {
        g8 g8Var = (g8) this.f6192d.get();
        aVar.Q(spliterator, g8Var);
        Object obj = g8Var.get();
        return obj != null ? obj : this.f6190b;
    }

    @Override // j$.util.stream.f8
    public final Object b(a aVar, Spliterator spliterator) {
        return new l0(this, z6.ORDERED.j(aVar.f), aVar, spliterator).invoke();
    }
}
