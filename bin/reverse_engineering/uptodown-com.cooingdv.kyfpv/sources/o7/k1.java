package o7;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class k1 extends i1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m1 f8274n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l1 f8275o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p f8276p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f8277q;

    public k1(m1 m1Var, l1 l1Var, p pVar, Object obj) {
        this.f8274n = m1Var;
        this.f8275o = l1Var;
        this.f8276p = pVar;
        this.f8277q = obj;
    }

    @Override // o7.i1
    public final boolean j() {
        return false;
    }

    @Override // o7.i1
    public final void k(Throwable th) {
        p pVar = this.f8276p;
        p pVarT = m1.T(pVar);
        m1 m1Var = this.f8274n;
        l1 l1Var = this.f8275o;
        Object obj = this.f8277q;
        if (pVarT == null || !m1Var.c0(l1Var, pVarT, obj)) {
            l1Var.f8287a.d(new t7.h(2), 2);
            p pVarT2 = m1.T(pVar);
            if (pVarT2 == null || !m1Var.c0(l1Var, pVarT2, obj)) {
                m1Var.t(m1Var.E(l1Var, obj));
            }
        }
    }
}
