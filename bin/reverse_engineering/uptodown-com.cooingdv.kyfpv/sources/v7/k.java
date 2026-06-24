package v7;

import o7.w;
import t7.o;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f10898a = new k();

    @Override // o7.w
    public final void dispatch(t6.h hVar, Runnable runnable) {
        e.f10887b.f10888a.c(runnable, true, false);
    }

    @Override // o7.w
    public final void dispatchYield(t6.h hVar, Runnable runnable) {
        e.f10887b.f10888a.c(runnable, true, true);
    }

    @Override // o7.w
    public final w limitedParallelism(int i, String str) {
        t7.a.a(i);
        return i >= j.f10896d ? str != null ? new o(this, str) : this : super.limitedParallelism(i, str);
    }

    @Override // o7.w
    public final String toString() {
        return "Dispatchers.IO";
    }
}
