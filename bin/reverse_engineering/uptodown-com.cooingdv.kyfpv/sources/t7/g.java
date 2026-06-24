package t7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import o7.e0;
import o7.h0;
import o7.o0;
import o7.x1;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends o7.w implements h0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f10331p = AtomicIntegerFieldUpdater.newUpdater(g.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h0 f10332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o7.w f10333b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f10334l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f10335m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k f10336n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f10337o;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public g(o7.w wVar, int i, String str) {
        h0 h0Var = wVar instanceof h0 ? (h0) wVar : null;
        this.f10332a = h0Var == null ? e0.f8258a : h0Var;
        this.f10333b = wVar;
        this.f10334l = i;
        this.f10335m = str;
        this.f10336n = new k();
        this.f10337o = new Object();
    }

    @Override // o7.w
    public final void dispatch(t6.h hVar, Runnable runnable) {
        Runnable runnableY;
        this.f10336n.a(runnable);
        if (f10331p.get(this) >= this.f10334l || !z() || (runnableY = y()) == null) {
            return;
        }
        this.f10333b.dispatch(this, new m4.a(5, this, runnableY));
    }

    @Override // o7.w
    public final void dispatchYield(t6.h hVar, Runnable runnable) {
        Runnable runnableY;
        this.f10336n.a(runnable);
        if (f10331p.get(this) >= this.f10334l || !z() || (runnableY = y()) == null) {
            return;
        }
        this.f10333b.dispatchYield(this, new m4.a(5, this, runnableY));
    }

    @Override // o7.h0
    public final o0 e(long j, x1 x1Var, t6.h hVar) {
        return this.f10332a.e(j, x1Var, hVar);
    }

    @Override // o7.h0
    public final void i(long j, o7.l lVar) {
        this.f10332a.i(j, lVar);
    }

    @Override // o7.w
    public final o7.w limitedParallelism(int i, String str) {
        a.a(i);
        return i >= this.f10334l ? str != null ? new o(this, str) : this : super.limitedParallelism(i, str);
    }

    @Override // o7.w
    public final String toString() {
        String str = this.f10335m;
        if (str != null) {
            return str;
        }
        return this.f10333b + ".limitedParallelism(" + this.f10334l + ')';
    }

    public final Runnable y() {
        while (true) {
            Runnable runnable = (Runnable) this.f10336n.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f10337o) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10331p;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f10336n.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean z() {
        synchronized (this.f10337o) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10331p;
            if (atomicIntegerFieldUpdater.get(this) >= this.f10334l) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }
}
