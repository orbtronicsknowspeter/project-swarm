package o7;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a2 extends t7.r {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ThreadLocal f8232n;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public a2(t6.c cVar, t6.h hVar) {
        b2 b2Var = b2.f8239a;
        super(cVar, hVar.get(b2Var) == null ? hVar.plus(b2Var) : hVar);
        this.f8232n = new ThreadLocal();
        if (cVar.getContext().get(t6.d.f10314a) instanceof w) {
            return;
        }
        Object objL = t7.a.l(hVar, null);
        t7.a.g(hVar, objL);
        h0(hVar, objL);
    }

    public final boolean g0() {
        boolean z9 = this.threadLocalIsSet && this.f8232n.get() == null;
        this.f8232n.remove();
        return !z9;
    }

    public final void h0(t6.h hVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f8232n.set(new p6.i(hVar, obj));
    }

    @Override // t7.r, o7.m1
    public final void v(Object obj) {
        if (this.threadLocalIsSet) {
            p6.i iVar = (p6.i) this.f8232n.get();
            if (iVar != null) {
                t7.a.g((t6.h) iVar.f8442a, iVar.f8443b);
            }
            this.f8232n.remove();
        }
        Object objU = c0.u(obj);
        t6.c cVar = this.f10354m;
        t6.h context = cVar.getContext();
        Object objL = t7.a.l(context, null);
        a2 a2VarB = objL != t7.a.f10319d ? c0.B(cVar, context, objL) : null;
        try {
            this.f10354m.resumeWith(objU);
            if (a2VarB == null || a2VarB.g0()) {
                t7.a.g(context, objL);
            }
        } catch (Throwable th) {
            if (a2VarB == null || a2VarB.g0()) {
                t7.a.g(context, objL);
            }
            throw th;
        }
    }
}
