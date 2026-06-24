package w8;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public class i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h0 f10963d = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f10964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f10965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f10966c;

    public i0 a() {
        this.f10964a = false;
        return this;
    }

    public i0 b() {
        this.f10966c = 0L;
        return this;
    }

    public long c() {
        if (this.f10964a) {
            return this.f10965b;
        }
        androidx.privacysandbox.ads.adservices.customaudience.a.i("No deadline");
        return 0L;
    }

    public i0 d(long j) {
        this.f10964a = true;
        this.f10965b = j;
        return this;
    }

    public boolean e() {
        return this.f10964a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f10964a && this.f10965b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public i0 g(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        if (j >= 0) {
            this.f10966c = timeUnit.toNanos(j);
            return this;
        }
        s1.o.o(a4.x.h(j, "timeout < 0: "));
        return null;
    }
}
