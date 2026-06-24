package a4;

import android.os.Process;
import b2.t1;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class r0 extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f176a = 0;

    public /* synthetic */ r0(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        switch (this.f176a) {
            case 0:
                Process.setThreadPriority(10);
                super.run();
                return;
            case 1:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
                break;
        }
        while (true) {
            try {
                reentrantLock = w8.d.h;
                reentrantLock.lock();
            } catch (InterruptedException unused2) {
            }
            try {
                w8.d dVarL = t1.l();
                if (dVarL == w8.d.f10952l) {
                    w8.d.f10952l = null;
                    reentrantLock.unlock();
                    return;
                } else {
                    reentrantLock.unlock();
                    if (dVarL != null) {
                        dVarL.j();
                    }
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public /* synthetic */ r0(String str) {
        super(str);
    }

    public /* synthetic */ r0(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
