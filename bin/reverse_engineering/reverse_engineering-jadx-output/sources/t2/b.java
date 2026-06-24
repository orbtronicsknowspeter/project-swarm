package t2;

import java.io.IOException;
import m8.q;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f9540b;

    public /* synthetic */ b(c cVar, int i) {
        this.f9539a = i;
        this.f9540b = cVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        u2.b bVarO;
        u2.b bVarI;
        switch (this.f9539a) {
            case 0:
                this.f9540b.b();
                return;
            case 1:
                this.f9540b.b();
                return;
            default:
                c cVar = this.f9540b;
                synchronized (c.f9541m) {
                    try {
                        n1.f fVar = cVar.f9542a;
                        fVar.a();
                        q qVarB = q.b(fVar.f7908a);
                        try {
                            bVarO = cVar.f9544c.o();
                            if (qVarB != null) {
                                qVarB.r();
                            }
                        } catch (Throwable th) {
                            if (qVarB != null) {
                                qVarB.r();
                            }
                            throw th;
                        }
                    } finally {
                    }
                }
                try {
                    int i = bVarO.f10405b;
                    if (i == 5) {
                        bVarI = cVar.i(bVarO);
                    } else {
                        if (i == 3) {
                            bVarI = cVar.i(bVarO);
                        } else if (!cVar.f9545d.a(bVarO)) {
                            return;
                        } else {
                            bVarI = cVar.c(bVarO);
                        }
                    }
                    cVar.f(bVarI);
                    cVar.m(bVarO, bVarI);
                    if (bVarI.f10405b == 4) {
                        cVar.l(bVarI.f10404a);
                    }
                    int i6 = bVarI.f10405b;
                    if (i6 == 5) {
                        cVar.j(new e());
                        return;
                    } else if (i6 == 2 || i6 == 1) {
                        cVar.j(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        cVar.k(bVarI);
                        return;
                    }
                } catch (e e10) {
                    cVar.j(e10);
                    return;
                }
        }
    }
}
