package androidx.lifecycle;

import o7.m0;
import o7.w;
import t7.n;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class PausingDispatcher extends w {
    public final DispatchQueue dispatchQueue = new DispatchQueue();

    @Override // o7.w
    public void dispatch(t6.h hVar, Runnable runnable) {
        hVar.getClass();
        runnable.getClass();
        this.dispatchQueue.dispatchAndEnqueue(hVar, runnable);
    }

    @Override // o7.w
    public boolean isDispatchNeeded(t6.h hVar) {
        hVar.getClass();
        v7.e eVar = m0.f8289a;
        if (n.f10349a.f8469l.isDispatchNeeded(hVar)) {
            return true;
        }
        return !this.dispatchQueue.canRun();
    }
}
