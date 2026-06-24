package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class t8 extends b {
    public final a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final IntFunction f6370k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f6371l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f6372m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f6373n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile boolean f6374o;

    @Override // j$.util.stream.b
    public final void f() {
        this.i = true;
        if (this.f6371l && this.f6374o) {
            d(w3.H(this.j.H()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCompletion(java.util.concurrent.CountedCompleter r9) {
        /*
            r8 = this;
            j$.util.stream.d r0 = r8.f6172d
            if (r0 != 0) goto L6
            goto L8b
        L6:
            j$.util.stream.t8 r0 = (j$.util.stream.t8) r0
            boolean r0 = r0.f6373n
            j$.util.stream.d r1 = r8.f6173e
            j$.util.stream.t8 r1 = (j$.util.stream.t8) r1
            boolean r1 = r1.f6373n
            r0 = r0 | r1
            r8.f6373n = r0
            boolean r0 = r8.f6371l
            r1 = 0
            if (r0 == 0) goto L2a
            boolean r0 = r8.i
            if (r0 == 0) goto L2a
            r8.f6372m = r1
            j$.util.stream.a r0 = r8.j
            j$.util.stream.a7 r0 = r0.H()
            j$.util.stream.a3 r0 = j$.util.stream.w3.H(r0)
            goto L88
        L2a:
            boolean r0 = r8.f6371l
            if (r0 == 0) goto L41
            j$.util.stream.d r0 = r8.f6172d
            j$.util.stream.t8 r0 = (j$.util.stream.t8) r0
            boolean r3 = r0.f6373n
            if (r3 == 0) goto L41
            long r1 = r0.f6372m
            r8.f6372m = r1
            java.lang.Object r0 = r0.i()
            j$.util.stream.h2 r0 = (j$.util.stream.h2) r0
            goto L88
        L41:
            j$.util.stream.d r0 = r8.f6172d
            j$.util.stream.t8 r0 = (j$.util.stream.t8) r0
            long r3 = r0.f6372m
            j$.util.stream.d r5 = r8.f6173e
            j$.util.stream.t8 r5 = (j$.util.stream.t8) r5
            long r6 = r5.f6372m
            long r3 = r3 + r6
            r8.f6372m = r3
            long r3 = r0.f6372m
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 != 0) goto L5d
            java.lang.Object r0 = r5.i()
            j$.util.stream.h2 r0 = (j$.util.stream.h2) r0
            goto L88
        L5d:
            long r3 = r5.f6372m
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L6a
            java.lang.Object r0 = r0.i()
            j$.util.stream.h2 r0 = (j$.util.stream.h2) r0
            goto L88
        L6a:
            j$.util.stream.a r0 = r8.j
            j$.util.stream.a7 r0 = r0.H()
            j$.util.stream.d r1 = r8.f6172d
            j$.util.stream.t8 r1 = (j$.util.stream.t8) r1
            java.lang.Object r1 = r1.i()
            j$.util.stream.h2 r1 = (j$.util.stream.h2) r1
            j$.util.stream.d r2 = r8.f6173e
            j$.util.stream.t8 r2 = (j$.util.stream.t8) r2
            java.lang.Object r2 = r2.i()
            j$.util.stream.h2 r2 = (j$.util.stream.h2) r2
            j$.util.stream.j2 r0 = j$.util.stream.w3.F(r0, r1, r2)
        L88:
            r8.d(r0)
        L8b:
            r0 = 1
            r8.f6374o = r0
            super.onCompletion(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.t8.onCompletion(java.util.concurrent.CountedCompleter):void");
    }

    public t8(a aVar, a aVar2, Spliterator spliterator, IntFunction intFunction) {
        super(aVar2, spliterator);
        this.j = aVar;
        this.f6370k = intFunction;
        this.f6371l = z6.ORDERED.j(aVar2.f);
    }

    public t8(t8 t8Var, Spliterator spliterator) {
        super(t8Var, spliterator);
        this.j = t8Var.j;
        this.f6370k = t8Var.f6370k;
        this.f6371l = t8Var.f6371l;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new t8(this, spliterator);
    }

    @Override // j$.util.stream.b
    public final Object h() {
        return w3.H(this.j.H());
    }

    @Override // j$.util.stream.d
    public final Object a() {
        z1 z1VarI = this.f6169a.I(-1L, this.f6370k);
        m5 m5VarM = this.j.M(this.f6169a.f, z1VarI);
        a aVar = this.f6169a;
        boolean zA = aVar.A(this.f6170b, aVar.R(m5VarM));
        this.f6373n = zA;
        if (zA) {
            g();
        }
        h2 h2VarBuild = z1VarI.build();
        this.f6372m = h2VarBuild.count();
        return h2VarBuild;
    }
}
