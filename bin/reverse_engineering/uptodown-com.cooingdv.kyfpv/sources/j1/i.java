package j1;

import k0.y;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f6540a = new p();

    public i(g5.f fVar) {
        g5.g gVar = new g5.g(this, 4);
        fVar.getClass();
        ((p) fVar.f5310b).c(j.f6541a, new g5.f(fVar, gVar));
    }

    public final void a(Object obj) {
        this.f6540a.k(obj);
    }

    public final boolean b(Exception exc) {
        p pVar = this.f6540a;
        pVar.getClass();
        y.h(exc, "Exception must not be null");
        synchronized (pVar.f6561a) {
            try {
                if (pVar.f6563c) {
                    return false;
                }
                pVar.f6563c = true;
                pVar.f = exc;
                pVar.f6562b.g(pVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Object obj) {
        this.f6540a.l(obj);
    }

    public i() {
    }
}
