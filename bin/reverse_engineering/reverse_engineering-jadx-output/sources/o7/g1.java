package o7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public class g1 extends m1 implements s {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f8262l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(e1 e1Var) {
        super(true);
        boolean z9 = true;
        M(e1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m1.f8290b;
        o oVar = (o) atomicReferenceFieldUpdater.get(this);
        p pVar = oVar instanceof p ? (p) oVar : null;
        if (pVar == null) {
            z9 = false;
            break;
        }
        m1 m1VarI = pVar.i();
        while (!m1VarI.H()) {
            o oVar2 = (o) atomicReferenceFieldUpdater.get(m1VarI);
            p pVar2 = oVar2 instanceof p ? (p) oVar2 : null;
            if (pVar2 == null) {
                z9 = false;
                break;
            }
            m1VarI = pVar2.i();
        }
        this.f8262l = z9;
    }

    @Override // o7.m1
    public final boolean H() {
        return this.f8262l;
    }

    @Override // o7.m1
    public final boolean I() {
        return true;
    }
}
