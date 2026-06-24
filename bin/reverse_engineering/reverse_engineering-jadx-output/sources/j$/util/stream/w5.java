package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class w5 extends b {
    public final a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final IntFunction f6412k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f6413l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f6414m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f6415n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile boolean f6416o;

    @Override // j$.util.stream.b
    public final void f() {
        this.i = true;
        if (this.f6416o) {
            d(w3.H(this.j.H()));
        }
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        w5 w5Var;
        h2 h2VarH;
        d dVar = this.f6171d;
        if (dVar != null) {
            this.f6415n = ((w5) dVar).f6415n + ((w5) this.f6172e).f6415n;
            if (this.i) {
                this.f6415n = 0L;
                h2VarH = w3.H(this.j.H());
            } else {
                h2VarH = this.f6415n == 0 ? w3.H(this.j.H()) : ((w5) this.f6171d).f6415n == 0 ? (h2) ((w5) this.f6172e).i() : w3.F(this.j.H(), (h2) ((w5) this.f6171d).i(), (h2) ((w5) this.f6172e).i());
            }
            h2 h2VarJ = h2VarH;
            if (b()) {
                h2VarJ = h2VarJ.j(this.f6413l, this.f6414m >= 0 ? Math.min(h2VarJ.count(), this.f6413l + this.f6414m) : this.f6415n, this.f6412k);
            }
            d(h2VarJ);
            this.f6416o = true;
        }
        if (this.f6414m >= 0 && !b()) {
            long j = this.f6413l + this.f6414m;
            long j6 = this.f6416o ? this.f6415n : j(j);
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
                        if (obj == w5Var2.f6172e && (w5Var = (w5) w5Var2.f6171d) != null) {
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
        this.f6412k = intFunction;
        this.f6413l = j;
        this.f6414m = j6;
    }

    public w5(w5 w5Var, Spliterator spliterator) {
        super(w5Var, spliterator);
        this.j = w5Var.j;
        this.f6412k = w5Var.f6412k;
        this.f6413l = w5Var.f6413l;
        this.f6414m = w5Var.f6414m;
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
            int i = aVar.f6127c;
            int i6 = z6Var.f6457e;
            z1 z1VarI = this.j.I((i & i6) == i6 ? aVar.F(this.f6169b) : -1L, this.f6412k);
            m5 m5VarM = this.j.M(this.f6168a.f, z1VarI);
            a aVar2 = this.f6168a;
            aVar2.A(this.f6169b, aVar2.R(m5VarM));
            return z1VarI.build();
        }
        z1 z1VarI2 = this.j.I(-1L, this.f6412k);
        if (this.f6413l == 0) {
            m5 m5VarM2 = this.j.M(this.f6168a.f, z1VarI2);
            a aVar3 = this.f6168a;
            aVar3.A(this.f6169b, aVar3.R(m5VarM2));
        } else {
            this.f6168a.Q(this.f6169b, z1VarI2);
        }
        h2 h2VarBuild = z1VarI2.build();
        this.f6415n = h2VarBuild.count();
        this.f6416o = true;
        this.f6169b = null;
        return h2VarBuild;
    }

    public final long j(long j) {
        if (this.f6416o) {
            return this.f6415n;
        }
        w5 w5Var = (w5) this.f6171d;
        w5 w5Var2 = (w5) this.f6172e;
        if (w5Var == null || w5Var2 == null) {
            return this.f6415n;
        }
        long j6 = w5Var.j(j);
        return j6 >= j ? j6 : w5Var2.j(j) + j6;
    }
}
