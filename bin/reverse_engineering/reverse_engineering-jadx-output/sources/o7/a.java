package o7;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends m1 implements t6.c, a0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t6.h f8229l;

    public a(t6.h hVar, boolean z9) {
        super(z9);
        M((e1) hVar.get(x.f8327b));
        this.f8229l = hVar.plus(this);
    }

    @Override // o7.m1
    public final String A() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // o7.m1
    public final void L(a1.b bVar) {
        c0.q(bVar, this.f8229l);
    }

    @Override // o7.m1
    public final void V(Object obj) {
        if (!(obj instanceof u)) {
            e0(obj);
            return;
        }
        u uVar = (u) obj;
        d0(u.f8314b.get(uVar) != 0, uVar.f8315a);
    }

    public final void f0(b0 b0Var, a aVar, d7.p pVar) {
        int iOrdinal = b0Var.ordinal();
        p6.x xVar = p6.x.f8463a;
        if (iOrdinal == 0) {
            try {
                t7.a.h(xVar, d0.b.I(d0.b.B(pVar, aVar, this)));
                return;
            } finally {
                resumeWith(new p6.j(th));
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                d0.b.I(d0.b.B(pVar, aVar, this)).resumeWith(xVar);
                return;
            }
            if (iOrdinal != 3) {
                com.google.gson.internal.a.b();
                return;
            }
            try {
                t6.h hVar = this.f8229l;
                Object objL = t7.a.l(hVar, null);
                try {
                    kotlin.jvm.internal.a0.b(2, pVar);
                    Object objInvoke = pVar.invoke(aVar, this);
                    if (objInvoke != u6.a.f10762a) {
                        resumeWith(objInvoke);
                    }
                } finally {
                    t7.a.g(hVar, objL);
                }
            } catch (Throwable th) {
            }
        }
    }

    @Override // t6.c
    public final t6.h getContext() {
        return this.f8229l;
    }

    @Override // o7.a0
    public final t6.h getCoroutineContext() {
        return this.f8229l;
    }

    @Override // t6.c
    public final void resumeWith(Object obj) {
        Throwable thA = p6.k.a(obj);
        if (thA != null) {
            obj = new u(false, thA);
        }
        Object objR = R(obj);
        if (objR == c0.f8247e) {
            return;
        }
        v(objR);
    }

    public void e0(Object obj) {
    }

    public void d0(boolean z9, Throwable th) {
    }
}
