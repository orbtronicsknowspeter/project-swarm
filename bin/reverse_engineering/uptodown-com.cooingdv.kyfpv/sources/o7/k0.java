package o7;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class k0 extends v7.h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8273l;

    public k0(int i) {
        super(0L, false);
        this.f8273l = i;
    }

    public abstract t6.c c();

    public Throwable d(Object obj) {
        u uVar = obj instanceof u ? (u) obj : null;
        if (uVar != null) {
            return uVar.f8316a;
        }
        return null;
    }

    public final void f(Throwable th) {
        c0.q(new c7.a("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), c().getContext());
    }

    public abstract Object h();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            t6.c cVarC = c();
            cVarC.getClass();
            t7.f fVar = (t7.f) cVarC;
            t6.c cVar = fVar.f10328n;
            Object obj = fVar.f10330p;
            t6.h context = cVar.getContext();
            Object objL = t7.a.l(context, obj);
            e1 e1Var = null;
            a2 a2VarB = objL != t7.a.f10319d ? c0.B(cVar, context, objL) : null;
            try {
                t6.h context2 = cVar.getContext();
                Object objH = h();
                Throwable thD = d(objH);
                if (thD == null) {
                    int i = this.f8273l;
                    boolean z9 = true;
                    if (i != 1 && i != 2) {
                        z9 = false;
                    }
                    if (z9) {
                        e1Var = (e1) context2.get(x.f8328b);
                    }
                }
                if (e1Var != null && !e1Var.b()) {
                    CancellationException cancellationExceptionJ = e1Var.j();
                    b(cancellationExceptionJ);
                    cVar.resumeWith(p6.a.b(cancellationExceptionJ));
                } else if (thD != null) {
                    cVar.resumeWith(new p6.j(thD));
                } else {
                    cVar.resumeWith(e(objH));
                }
                if (a2VarB != null && !a2VarB.g0()) {
                    return;
                }
                t7.a.g(context, objL);
            } catch (Throwable th) {
                if (a2VarB == null || a2VarB.g0()) {
                    t7.a.g(context, objL);
                }
                throw th;
            }
        } catch (Throwable th2) {
            f(th2);
        }
    }

    public void b(CancellationException cancellationException) {
    }

    public Object e(Object obj) {
        return obj;
    }
}
