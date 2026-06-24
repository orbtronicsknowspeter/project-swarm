package e1;

import android.os.Bundle;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class u2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f4302b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b3 f4303l;

    public u2(b3 b3Var, AtomicReference atomicReference, int i) {
        this.f4301a = i;
        switch (i) {
            case 1:
                this.f4302b = atomicReference;
                Objects.requireNonNull(b3Var);
                this.f4303l = b3Var;
                break;
            case 2:
                this.f4302b = atomicReference;
                Objects.requireNonNull(b3Var);
                this.f4303l = b3Var;
                break;
            case 3:
                this.f4302b = atomicReference;
                Objects.requireNonNull(b3Var);
                this.f4303l = b3Var;
                break;
            case 4:
                this.f4302b = atomicReference;
                Objects.requireNonNull(b3Var);
                this.f4303l = b3Var;
                break;
            default:
                this.f4302b = atomicReference;
                Objects.requireNonNull(b3Var);
                this.f4303l = b3Var;
                break;
        }
    }

    private final void a() {
        AtomicReference atomicReference = this.f4302b;
        synchronized (atomicReference) {
            try {
                try {
                    t1 t1Var = this.f4303l.f3876a;
                    atomicReference.set(t1Var.f4263m.m(t1Var.r().m(), f0.f3919c0));
                } finally {
                    this.f4302b.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        AtomicReference atomicReference = this.f4302b;
        synchronized (atomicReference) {
            try {
                try {
                    t1 t1Var = this.f4303l.f3876a;
                    atomicReference.set(Long.valueOf(t1Var.f4263m.n(t1Var.r().m(), f0.f3922d0)));
                } finally {
                    this.f4302b.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c() {
        AtomicReference atomicReference = this.f4302b;
        synchronized (atomicReference) {
            try {
                try {
                    t1 t1Var = this.f4303l.f3876a;
                    atomicReference.set(Integer.valueOf(t1Var.f4263m.o(t1Var.r().m(), f0.f3924e0)));
                } finally {
                    this.f4302b.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void d() {
        AtomicReference atomicReference = this.f4302b;
        synchronized (atomicReference) {
            try {
                try {
                    t1 t1Var = this.f4303l.f3876a;
                    atomicReference.set(Double.valueOf(t1Var.f4263m.p(t1Var.r().m(), f0.f3926f0)));
                } finally {
                    this.f4302b.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4301a) {
            case 0:
                AtomicReference atomicReference = this.f4302b;
                synchronized (atomicReference) {
                    try {
                        try {
                            t1 t1Var = this.f4303l.f3876a;
                            atomicReference.set(Boolean.valueOf(t1Var.f4263m.q(t1Var.r().m(), f0.f3917b0)));
                        } finally {
                            this.f4302b.notify();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                a();
                return;
            case 2:
                b();
                return;
            case 3:
                c();
                return;
            case 4:
                d();
                return;
            case 5:
                b3 b3Var = this.f4303l;
                g1 g1Var = b3Var.f3876a.f4264n;
                t1.k(g1Var);
                Bundle bundleG = g1Var.f3992w.G();
                w3 w3VarP = b3Var.f3876a.p();
                AtomicReference atomicReference2 = this.f4302b;
                w3VarP.g();
                w3VarP.h();
                w3VarP.u(new b2(w3VarP, atomicReference2, w3VarP.w(false), bundleG, 6));
                return;
            default:
                w3 w3VarP2 = this.f4303l.f3876a.p();
                n4 n4VarC = n4.c(i3.SGTM_CLIENT);
                AtomicReference atomicReference3 = this.f4302b;
                w3VarP2.g();
                w3VarP2.h();
                w3VarP2.u(new b2(w3VarP2, atomicReference3, w3VarP2.w(false), n4VarC));
                return;
        }
    }

    public /* synthetic */ u2(b3 b3Var, AtomicReference atomicReference, int i, boolean z9) {
        this.f4301a = i;
        this.f4303l = b3Var;
        this.f4302b = atomicReference;
    }
}
