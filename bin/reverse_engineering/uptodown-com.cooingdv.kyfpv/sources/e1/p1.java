package e1;

import android.os.Process;
import androidx.work.WorkRequest;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class p1 extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BlockingQueue f4188b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f4189l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q1 f4190m;

    public p1(q1 q1Var, String str, BlockingQueue blockingQueue) {
        this.f4190m = q1Var;
        k0.y.g(blockingQueue);
        this.f4187a = new Object();
        this.f4188b = blockingQueue;
        setName(str);
    }

    public final void a() {
        Object obj = this.f4187a;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    public final void b() {
        q1 q1Var = this.f4190m;
        synchronized (q1Var.f4210r) {
            try {
                if (!this.f4189l) {
                    q1Var.f4211s.release();
                    q1Var.f4210r.notifyAll();
                    if (this == q1Var.f4204l) {
                        q1Var.f4204l = null;
                    } else if (this == q1Var.f4205m) {
                        q1Var.f4205m = null;
                    } else {
                        w0 w0Var = q1Var.f3876a.f4265o;
                        t1.m(w0Var);
                        w0Var.f4340o.b("Current scheduler thread is neither worker nor network");
                    }
                    this.f4189l = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z9 = false;
        while (!z9) {
            try {
                this.f4190m.f4211s.acquire();
                z9 = true;
            } catch (InterruptedException e10) {
                w0 w0Var = this.f4190m.f3876a.f4265o;
                t1.m(w0Var);
                w0Var.f4343r.c(e10, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.f4188b;
                o1 o1Var = (o1) blockingQueue.poll();
                if (o1Var != null) {
                    Process.setThreadPriority(true != o1Var.f4177b ? 10 : threadPriority);
                    o1Var.run();
                } else {
                    Object obj = this.f4187a;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.f4190m.getClass();
                            try {
                                obj.wait(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
                            } catch (InterruptedException e11) {
                                w0 w0Var2 = this.f4190m.f3876a.f4265o;
                                t1.m(w0Var2);
                                w0Var2.f4343r.c(e11, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.f4190m.f4210r) {
                        if (this.f4188b.peek() == null) {
                            b();
                            b();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            b();
            throw th;
        }
    }
}
