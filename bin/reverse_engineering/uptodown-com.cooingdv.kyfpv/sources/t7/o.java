package t7;

import o7.e0;
import o7.h0;
import o7.o0;
import o7.x1;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends o7.w implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h0 f10350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o7.w f10351b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f10352l;

    /* JADX WARN: Multi-variable type inference failed */
    public o(o7.w wVar, String str) {
        h0 h0Var = wVar instanceof h0 ? (h0) wVar : null;
        this.f10350a = h0Var == null ? e0.f8258a : h0Var;
        this.f10351b = wVar;
        this.f10352l = str;
    }

    @Override // o7.w
    public final void dispatch(t6.h hVar, Runnable runnable) {
        this.f10351b.dispatch(hVar, runnable);
    }

    @Override // o7.w
    public final void dispatchYield(t6.h hVar, Runnable runnable) {
        this.f10351b.dispatchYield(hVar, runnable);
    }

    @Override // o7.h0
    public final o0 e(long j, x1 x1Var, t6.h hVar) {
        return this.f10350a.e(j, x1Var, hVar);
    }

    @Override // o7.h0
    public final void i(long j, o7.l lVar) {
        this.f10350a.i(j, lVar);
    }

    @Override // o7.w
    public final boolean isDispatchNeeded(t6.h hVar) {
        return this.f10351b.isDispatchNeeded(hVar);
    }

    @Override // o7.w
    public final String toString() {
        return this.f10352l;
    }
}
