package f2;

import a4.d0;
import android.os.SystemClock;
import android.util.Log;
import g2.d;
import j1.i;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m8.q;
import o.g;
import y1.z;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f4827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f4828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4831e;
    public final ArrayBlockingQueue f;
    public final ThreadPoolExecutor g;
    public final d0 h;
    public final q i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f4832k;

    public c(d0 d0Var, d dVar, q qVar) {
        double d10 = dVar.f5116d;
        double d11 = dVar.f5117e;
        long j = ((long) dVar.f) * 1000;
        this.f4827a = d10;
        this.f4828b = d11;
        this.f4829c = j;
        this.h = d0Var;
        this.i = qVar;
        this.f4830d = SystemClock.elapsedRealtime();
        int i = (int) d10;
        this.f4831e = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f = arrayBlockingQueue;
        this.g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.j = 0;
        this.f4832k = 0L;
    }

    public final int a() {
        if (this.f4832k == 0) {
            this.f4832k = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.f4832k) / this.f4829c);
        int size = this.f.size();
        int i = this.j;
        int iMin = size == this.f4831e ? Math.min(100, i + iCurrentTimeMillis) : Math.max(0, i - iCurrentTimeMillis);
        if (this.j != iMin) {
            this.j = iMin;
            this.f4832k = System.currentTimeMillis();
        }
        return iMin;
    }

    public final void b(final y1.b bVar, final i iVar) {
        String str = "Sending report through Google DataTransport: " + bVar.f11606b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        final boolean z9 = SystemClock.elapsedRealtime() - this.f4830d < 2000;
        this.h.o(new o.a(bVar.f11605a, o.d.f8129l, null), new g() { // from class: f2.b
            @Override // o.g
            public final void a(Exception exc) throws Throwable {
                i iVar2 = iVar;
                if (exc != null) {
                    iVar2.b(exc);
                    return;
                }
                if (z9) {
                    boolean z10 = true;
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    new Thread(new androidx.browser.trusted.c(12, this.f4823a, countDownLatch)).start();
                    ExecutorService executorService = z.f11699a;
                    boolean z11 = false;
                    try {
                        long jNanoTime = 2000000000;
                        long jNanoTime2 = System.nanoTime() + 2000000000;
                        while (true) {
                            try {
                                try {
                                    countDownLatch.await(jNanoTime, TimeUnit.NANOSECONDS);
                                    break;
                                } catch (InterruptedException unused) {
                                    jNanoTime = jNanoTime2 - System.nanoTime();
                                    z11 = true;
                                }
                            } catch (Throwable th) {
                                th = th;
                                if (z10) {
                                    Thread.currentThread().interrupt();
                                }
                                throw th;
                            }
                        }
                        if (z11) {
                            Thread.currentThread().interrupt();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z10 = z11;
                    }
                }
                iVar2.c(bVar);
            }
        });
    }
}
