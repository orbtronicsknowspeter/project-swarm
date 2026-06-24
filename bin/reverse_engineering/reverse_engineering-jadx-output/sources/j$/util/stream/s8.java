package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class s8 extends d {
    public final a h;
    public final IntFunction i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f6355k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f6356l;

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        d dVar = this.f6171d;
        if (dVar != null) {
            if (this.j) {
                s8 s8Var = (s8) dVar;
                long j = s8Var.f6356l;
                this.f6356l = j;
                if (j == s8Var.f6355k) {
                    this.f6356l = j + ((s8) this.f6172e).f6356l;
                }
            }
            s8 s8Var2 = (s8) dVar;
            long j6 = s8Var2.f6355k;
            s8 s8Var3 = (s8) this.f6172e;
            this.f6355k = j6 + s8Var3.f6355k;
            h2 h2VarF = s8Var2.f6355k == 0 ? (h2) s8Var3.f : s8Var3.f6355k == 0 ? (h2) s8Var2.f : w3.F(this.h.H(), (h2) ((s8) this.f6171d).f, (h2) ((s8) this.f6172e).f);
            if (b() && this.j) {
                h2VarF = h2VarF.j(this.f6356l, h2VarF.count(), this.i);
            }
            this.f = h2VarF;
        }
        super.onCompletion(countedCompleter);
    }

    public s8(a aVar, a aVar2, Spliterator spliterator, IntFunction intFunction) {
        super(aVar2, spliterator);
        this.h = aVar;
        this.i = intFunction;
        this.j = z6.ORDERED.j(aVar2.f);
    }

    public s8(s8 s8Var, Spliterator spliterator) {
        super(s8Var, spliterator);
        this.h = s8Var.h;
        this.i = s8Var.i;
        this.j = s8Var.j;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new s8(this, spliterator);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override // j$.util.stream.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a() {
        /*
            r5 = this;
            boolean r0 = r5.b()
            if (r0 != 0) goto L1c
            boolean r1 = r5.j
            if (r1 == 0) goto L1c
            j$.util.stream.z6 r1 = j$.util.stream.z6.SIZED
            j$.util.stream.a r2 = r5.h
            int r3 = r2.f6127c
            int r1 = r1.f6457e
            r3 = r3 & r1
            if (r3 != r1) goto L1c
            j$.util.Spliterator r1 = r5.f6169b
            long r1 = r2.F(r1)
            goto L1e
        L1c:
            r1 = -1
        L1e:
            j$.util.stream.a r3 = r5.f6168a
            java.util.function.IntFunction r4 = r5.i
            j$.util.stream.z1 r1 = r3.I(r1, r4)
            j$.util.stream.a r2 = r5.h
            j$.util.stream.q8 r2 = (j$.util.stream.q8) r2
            boolean r3 = r5.j
            if (r3 == 0) goto L32
            if (r0 != 0) goto L32
            r0 = 1
            goto L33
        L32:
            r0 = 0
        L33:
            j$.util.stream.r8 r0 = r2.g(r1, r0)
            j$.util.stream.a r2 = r5.f6168a
            j$.util.Spliterator r3 = r5.f6169b
            r2.Q(r3, r0)
            j$.util.stream.h2 r1 = r1.build()
            long r2 = r1.count()
            r5.f6355k = r2
            long r2 = r0.h()
            r5.f6356l = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.s8.a():java.lang.Object");
    }
}
