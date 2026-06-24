package q7;

import f8.w;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o7.c0;
import o7.c2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f8734a = g.f8764p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o7.l f8735b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f8736l;

    public b(e eVar) {
        this.f8736l = eVar;
    }

    @Override // o7.c2
    public final void a(t7.s sVar, int i) {
        o7.l lVar = this.f8735b;
        if (lVar != null) {
            lVar.a(sVar, i);
        }
    }

    public final Object b(v6.c cVar) throws Throwable {
        m mVar;
        m mVar2;
        Object obj = this.f8734a;
        boolean z9 = true;
        if (obj == g.f8764p || obj == g.f8760l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e.f8748p;
            e eVar = this.f8736l;
            m mVar3 = (m) atomicReferenceFieldUpdater.get(eVar);
            while (!eVar.w()) {
                long andIncrement = e.f8744l.getAndIncrement(eVar);
                long j = g.f8755b;
                long j6 = andIncrement / j;
                int i = (int) (andIncrement % j);
                if (mVar3.f10356c != j6) {
                    m mVarO = eVar.o(j6, mVar3);
                    if (mVarO == null) {
                        continue;
                    } else {
                        mVar = mVarO;
                    }
                } else {
                    mVar = mVar3;
                }
                Object objH = eVar.H(mVar, i, andIncrement, null);
                w wVar = g.f8761m;
                if (objH == wVar) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("unreachable");
                    return null;
                }
                w wVar2 = g.f8763o;
                if (objH == wVar2) {
                    if (andIncrement < eVar.t()) {
                        mVar.b();
                    }
                    mVar3 = mVar;
                } else if (objH == g.f8762n) {
                    o7.l lVarP = c0.p(d0.b.I(cVar));
                    try {
                        this.f8735b = lVarP;
                        try {
                            Object objH2 = eVar.H(mVar, i, andIncrement, this);
                            if (objH2 == wVar) {
                                a(mVar, i);
                            } else {
                                if (objH2 == wVar2) {
                                    if (andIncrement < eVar.t()) {
                                        mVar.b();
                                    }
                                    m mVar4 = (m) e.f8748p.get(eVar);
                                    while (true) {
                                        if (eVar.w()) {
                                            o7.l lVar = this.f8735b;
                                            lVar.getClass();
                                            this.f8735b = null;
                                            this.f8734a = g.f8760l;
                                            Throwable thQ = eVar.q();
                                            if (thQ == null) {
                                                lVar.resumeWith(Boolean.FALSE);
                                            } else {
                                                lVar.resumeWith(new p6.j(thQ));
                                            }
                                        } else {
                                            long andIncrement2 = e.f8744l.getAndIncrement(eVar);
                                            long j10 = g.f8755b;
                                            long j11 = andIncrement2 / j10;
                                            int i6 = (int) (andIncrement2 % j10);
                                            if (mVar4.f10356c != j11) {
                                                m mVarO2 = eVar.o(j11, mVar4);
                                                if (mVarO2 != null) {
                                                    mVar2 = mVarO2;
                                                }
                                            } else {
                                                mVar2 = mVar4;
                                            }
                                            Object objH3 = eVar.H(mVar2, i6, andIncrement2, this);
                                            m mVar5 = mVar2;
                                            if (objH3 == g.f8761m) {
                                                a(mVar5, i6);
                                                break;
                                            }
                                            if (objH3 == g.f8763o) {
                                                if (andIncrement2 < eVar.t()) {
                                                    mVar5.b();
                                                }
                                                mVar4 = mVar5;
                                            } else {
                                                if (objH3 == g.f8762n) {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                                mVar5.b();
                                                this.f8734a = objH3;
                                                this.f8735b = null;
                                            }
                                        }
                                    }
                                } else {
                                    mVar.b();
                                    this.f8734a = objH2;
                                    this.f8735b = null;
                                }
                                lVarP.g(Boolean.TRUE, null);
                            }
                            return lVarP.r();
                        } catch (Throwable th) {
                            th = th;
                            lVarP.z();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    mVar.b();
                    this.f8734a = objH;
                }
            }
            this.f8734a = g.f8760l;
            Throwable thQ2 = eVar.q();
            if (thQ2 != null) {
                int i10 = t7.t.f10357a;
                throw thQ2;
            }
            z9 = false;
        }
        return Boolean.valueOf(z9);
    }

    public final Object c() throws Throwable {
        Object obj = this.f8734a;
        w wVar = g.f8764p;
        if (obj == wVar) {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("`hasNext()` has not been invoked");
            return null;
        }
        this.f8734a = wVar;
        if (obj != g.f8760l) {
            return obj;
        }
        Throwable thR = this.f8736l.r();
        int i = t7.t.f10357a;
        throw thR;
    }
}
