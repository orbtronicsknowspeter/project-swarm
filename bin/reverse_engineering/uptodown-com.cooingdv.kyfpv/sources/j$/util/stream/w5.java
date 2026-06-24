package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class w5 extends b {
    public final a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final IntFunction f6413k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f6414l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f6415m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f6416n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile boolean f6417o;

    @Override // j$.util.stream.b
    public final void f() {
        this.i = true;
        if (this.f6417o) {
            d(w3.H(this.j.H()));
        }
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        w5 w5Var;
        h2 h2VarH;
        d dVar = this.f6172d;
        if (dVar != null) {
            this.f6416n = ((w5) dVar).f6416n + ((w5) this.f6173e).f6416n;
            if (this.i) {
                this.f6416n = 0L;
                h2VarH = w3.H(this.j.H());
            } else {
                h2VarH = this.f6416n == 0 ? w3.H(this.j.H()) : ((w5) this.f6172d).f6416n == 0 ? (h2) ((w5) this.f6173e).i() : w3.F(this.j.H(), (h2) ((w5) this.f6172d).i(), (h2) ((w5) this.f6173e).i());
            }
            h2 h2VarJ = h2VarH;
            if (b()) {
                h2VarJ = h2VarJ.j(this.f6414l, this.f6415m >= 0 ? Math.min(h2VarJ.count(), this.f6414l + this.f6415m) : this.f6416n, this.f6413k);
            }
            d(h2VarJ);
            this.f6417o = true;
        }
        if (this.f6415m >= 0 && !b()) {
            long j = this.f6414l + this.f6415m;
            long j6 = this.f6417o ? this.f6416n : j(j);
            if (j6 >= j) {
                g();
            } else {
                w5 w5Var2 = (w5) ((d) getCompleter());
                Object obj = this;
                while (true) {
                    if (w5Var2 == null) {
                        if (j6 >= j) {
                            break;
                        }
                    } else {
                        if (obj == w5Var2.f6173e && (w5Var = (w5) w5Var2.f6172d) != null) {
                            long j10 = w5Var.j(j) + j6;
                            if (j10 >= j) {
                                break;
                            } else {
                                j6 = j10;
                            }
                        }
                        obj = w5Var2;
                        w5Var2 = (w5) ((d) w5Var2.getCompleter());
                    }
                }
                g();
            }
        }
        super.onCompletion(countedCompleter);
    }

    public w5(a aVar, a aVar2, Spliterator spliterator, IntFunction intFunction, long j, long j6) {
        super(aVar2, spliterator);
        this.j = aVar;
        this.f6413k = intFunction;
        this.f6414l = j;
        this.f6415m = j6;
    }

    public w5(w5 w5Var, Spliterator spliterator) {
        super(w5Var, spliterator);
        this.j = w5Var.j;
        this.f6413k = w5Var.f6413k;
        this.f6414l = w5Var.f6414l;
        this.f6415m = w5Var.f6415m;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new w5(this, spliterator);
    }

    @Override // j$.util.stream.b
    public final Object h() {
        return w3.H(this.j.H());
    }

    @Override // j$.util.stream.d
    public final Object a() {
        if (b()) {
            z6 z6Var = z6.SIZED;
            a aVar = this.j;
            int i = aVar.f6128c;
            int i6 = z6Var.f6458e;
            z1 z1VarI = this.j.I((i & i6) == i6 ? aVar.F(this.f6170b) : -1L, this.f6413k);
            m5 m5VarM = this.j.M(this.f6169a.f, z1VarI);
            a aVar2 = this.f6169a;
            aVar2.A(this.f6170b, aVar2.R(m5VarM));
            return z1VarI.build();
        }
        z1 z1VarI2 = this.j.I(-1L, this.f6413k);
        if (this.f6414l == 0) {
            m5 m5VarM2 = this.j.M(this.f6169a.f, z1VarI2);
            a aVar3 = this.f6169a;
            aVar3.A(this.f6170b, aVar3.R(m5VarM2));
        } else {
            this.f6169a.Q(this.f6170b, z1VarI2);
        }
        h2 h2VarBuild = z1VarI2.build();
        this.f6416n = h2VarBuild.count();
        this.f6417o = true;
        this.f6170b = null;
        return h2VarBuild;
    }

    public final long j(long j) {
        if (this.f6417o) {
            return this.f6416n;
        }
        w5 w5Var = (w5) this.f6172d;
        w5 w5Var2 = (w5) this.f6173e;
        if (w5Var == null || w5Var2 == null) {
            return this.f6416n;
        }
        long j6 = w5Var.j(j);
        return j6 >= j ? j6 : w5Var2.j(j) + j6;
    }
}
