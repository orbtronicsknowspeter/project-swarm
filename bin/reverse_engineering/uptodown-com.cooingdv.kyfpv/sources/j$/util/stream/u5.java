package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class u5 extends z {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f6381l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f6382m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(b0 b0Var, int i, long j, long j6) {
        super(b0Var, i);
        this.f6381l = j;
        this.f6382m = j6;
    }

    @Override // j$.util.stream.a
    public final Spliterator K(a aVar, Spliterator spliterator) {
        long jF = aVar.F(spliterator);
        if (jF > 0 && spliterator.hasCharacteristics(16384)) {
            j$.util.v0 v0Var = (j$.util.v0) aVar.S(spliterator);
            long j = this.f6381l;
            return new p7(v0Var, j, w3.A(j, this.f6382m));
        }
        if (z6.ORDERED.j(aVar.f)) {
            return ((h2) new w5(this, aVar, spliterator, new d1(20), this.f6381l, this.f6382m).invoke()).spliterator();
        }
        j$.util.v0 v0Var2 = (j$.util.v0) aVar.S(spliterator);
        long j6 = this.f6381l;
        long j10 = this.f6382m;
        if (j6 <= jF) {
            long jMin = jF - j6;
            if (j10 >= 0) {
                jMin = Math.min(j10, jMin);
            }
            j10 = jMin;
            j6 = 0;
        }
        return new v7(v0Var2, j6, j10);
    }

    @Override // j$.util.stream.a
    public final h2 J(a aVar, Spliterator spliterator, IntFunction intFunction) {
        long jMin;
        long j;
        long jF = aVar.F(spliterator);
        if (jF > 0 && spliterator.hasCharacteristics(16384)) {
            a aVar2 = aVar;
            while (aVar2.f6130e > 0) {
                aVar2 = aVar2.f6127b;
            }
            return w3.C(aVar, w3.y(aVar2.H(), spliterator, this.f6381l, this.f6382m), true);
        }
        if (!z6.ORDERED.j(aVar.f)) {
            j$.util.v0 v0Var = (j$.util.v0) aVar.S(spliterator);
            long j6 = this.f6381l;
            long j10 = this.f6382m;
            if (j6 <= jF) {
                long j11 = jF - j6;
                jMin = j10 >= 0 ? Math.min(j10, j11) : j11;
                j = 0;
            } else {
                jMin = j10;
                j = j6;
            }
            return w3.C(this, new v7(v0Var, j, jMin), true);
        }
        return (h2) new w5(this, aVar, spliterator, intFunction, this.f6381l, this.f6382m).invoke();
    }

    @Override // j$.util.stream.a
    public final m5 M(int i, m5 m5Var) {
        return new t5(this, m5Var);
    }
}
