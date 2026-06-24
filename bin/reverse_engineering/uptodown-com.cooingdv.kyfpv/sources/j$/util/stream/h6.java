package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class h6 extends c5 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f6216l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Comparator f6217m;

    public h6(e5 e5Var) {
        super(e5Var, z6.f6449q | z6.f6447o);
        this.f6216l = true;
        this.f6217m = j$.util.f.INSTANCE;
    }

    public h6(e5 e5Var, Comparator comparator) {
        super(e5Var, z6.f6449q | z6.f6448p);
        this.f6216l = false;
        this.f6217m = (Comparator) Objects.requireNonNull(comparator);
    }

    @Override // j$.util.stream.a
    public final m5 M(int i, m5 m5Var) {
        Objects.requireNonNull(m5Var);
        if (z6.SORTED.j(i) && this.f6216l) {
            return m5Var;
        }
        boolean zJ = z6.SIZED.j(i);
        Comparator comparator = this.f6217m;
        if (zJ) {
            return new m6(m5Var, comparator);
        }
        return new i6(m5Var, comparator);
    }

    @Override // j$.util.stream.a
    public final h2 J(a aVar, Spliterator spliterator, IntFunction intFunction) {
        if (z6.SORTED.j(aVar.f) && this.f6216l) {
            return aVar.B(spliterator, false, intFunction);
        }
        Object[] objArrM = aVar.B(spliterator, true, intFunction).m(intFunction);
        Arrays.sort(objArrM, this.f6217m);
        return new k2(objArrM);
    }
}
