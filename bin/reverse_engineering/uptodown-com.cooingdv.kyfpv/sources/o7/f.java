package o7;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Thread f8259m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r0 f8260n;

    public f(t6.h hVar, Thread thread, r0 r0Var) {
        super(hVar, true);
        this.f8259m = thread;
        this.f8260n = r0Var;
    }

    @Override // o7.m1
    public final void t(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f8259m;
        if (kotlin.jvm.internal.l.a(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
