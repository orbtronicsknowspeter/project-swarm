package j1;

import com.google.android.gms.internal.measurement.i4;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import k0.y;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6561a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i4 f6562b = new i4(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f6564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f6565e;
    public Exception f;

    public final void a(Executor executor, d dVar) {
        this.f6562b.e(new m(executor, dVar));
        p();
    }

    public final void b(Executor executor, e eVar) {
        this.f6562b.e(new m(executor, eVar));
        p();
    }

    public final void c(Executor executor, f fVar) {
        this.f6562b.e(new m(executor, fVar));
        p();
    }

    public final p d(Executor executor, a aVar) {
        p pVar = new p();
        this.f6562b.e(new l(executor, aVar, pVar, 0));
        p();
        return pVar;
    }

    public final p e(Executor executor, a aVar) {
        p pVar = new p();
        this.f6562b.e(new l(executor, aVar, pVar, 1));
        p();
        return pVar;
    }

    public final Exception f() {
        Exception exc;
        synchronized (this.f6561a) {
            exc = this.f;
        }
        return exc;
    }

    public final Object g() {
        Object obj;
        synchronized (this.f6561a) {
            try {
                y.i(this.f6563c, "Task is not yet complete");
                if (this.f6564d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f;
                if (exc != null) {
                    throw new g(exc);
                }
                obj = this.f6565e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final boolean h() {
        boolean z9;
        synchronized (this.f6561a) {
            z9 = this.f6563c;
        }
        return z9;
    }

    public final boolean i() {
        boolean z9;
        synchronized (this.f6561a) {
            try {
                z9 = false;
                if (this.f6563c && !this.f6564d && this.f == null) {
                    z9 = true;
                }
            } finally {
            }
        }
        return z9;
    }

    public final p j(Executor executor, h hVar) {
        p pVar = new p();
        this.f6562b.e(new m(executor, hVar, pVar));
        p();
        return pVar;
    }

    public final void k(Object obj) {
        synchronized (this.f6561a) {
            o();
            this.f6563c = true;
            this.f6565e = obj;
        }
        this.f6562b.g(this);
    }

    public final boolean l(Object obj) {
        synchronized (this.f6561a) {
            try {
                if (this.f6563c) {
                    return false;
                }
                this.f6563c = true;
                this.f6565e = obj;
                this.f6562b.g(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(Exception exc) {
        y.h(exc, "Exception must not be null");
        synchronized (this.f6561a) {
            o();
            this.f6563c = true;
            this.f = exc;
        }
        this.f6562b.g(this);
    }

    public final void n() {
        synchronized (this.f6561a) {
            try {
                if (this.f6563c) {
                    return;
                }
                this.f6563c = true;
                this.f6564d = true;
                this.f6562b.g(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o() {
        if (this.f6563c) {
            if (!h()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excF = f();
        }
    }

    public final void p() {
        synchronized (this.f6561a) {
            try {
                if (this.f6563c) {
                    this.f6562b.g(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
