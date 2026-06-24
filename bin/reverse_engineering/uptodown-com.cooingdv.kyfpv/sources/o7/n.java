package o7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends i1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f8292n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l f8293o;

    public /* synthetic */ n(l lVar, int i) {
        this.f8292n = i;
        this.f8293o = lVar;
    }

    @Override // o7.i1
    public final boolean j() {
        switch (this.f8292n) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // o7.i1
    public final void k(Throwable th) {
        switch (this.f8292n) {
            case 0:
                m1 m1VarI = i();
                l lVar = this.f8293o;
                Throwable thP = lVar.p(m1VarI);
                if (lVar.w()) {
                    t7.f fVar = (t7.f) lVar.f8281m;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = t7.f.f10326q;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(fVar);
                        f8.w wVar = t7.a.f10318c;
                        if (kotlin.jvm.internal.l.a(obj, wVar)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, wVar, thP)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != wVar) {
                                }
                                break;
                            }
                        } else if (!(obj instanceof Throwable)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                                }
                            }
                        }
                    }
                }
                lVar.o(thP);
                if (!lVar.w()) {
                    lVar.m();
                }
                break;
            default:
                this.f8293o.resumeWith(p6.x.f8464a);
                break;
        }
    }
}
