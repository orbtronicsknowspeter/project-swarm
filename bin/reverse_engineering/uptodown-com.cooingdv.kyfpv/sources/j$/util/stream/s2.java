package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class s2 extends j2 {
    @Override // j$.util.stream.h2
    public final h2 j(long j, long j6, IntFunction intFunction) {
        if (j == 0 && j6 == this.f6238c) {
            return this;
        }
        long jCount = this.f6236a.count();
        if (j >= jCount) {
            return this.f6237b.j(j - jCount, j6 - jCount, intFunction);
        }
        h2 h2Var = this.f6236a;
        if (j6 > jCount) {
            return w3.F(a7.REFERENCE, h2Var.j(j, jCount, intFunction), this.f6237b.j(0L, j6 - jCount, intFunction));
        }
        return h2Var.j(j, j6, intFunction);
    }

    @Override // j$.util.stream.h2
    public final Spliterator spliterator() {
        return new j3(this);
    }

    @Override // j$.util.stream.h2
    public final void k(Object[] objArr, int i) {
        Objects.requireNonNull(objArr);
        h2 h2Var = this.f6236a;
        h2Var.k(objArr, i);
        this.f6237b.k(objArr, i + ((int) h2Var.count()));
    }

    @Override // j$.util.stream.h2
    public final Object[] m(IntFunction intFunction) {
        long j = this.f6238c;
        if (j >= 2147483639) {
            j$.time.g.c("Stream size exceeds max array size");
            return null;
        }
        Object[] objArr = (Object[]) intFunction.apply((int) j);
        k(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.h2
    public final void forEach(Consumer consumer) {
        this.f6236a.forEach(consumer);
        this.f6237b.forEach(consumer);
    }

    public final String toString() {
        long j = this.f6238c;
        return j < 32 ? String.format("ConcNode[%s.%s]", this.f6236a, this.f6237b) : String.format("ConcNode[size=%d]", Long.valueOf(j));
    }
}
