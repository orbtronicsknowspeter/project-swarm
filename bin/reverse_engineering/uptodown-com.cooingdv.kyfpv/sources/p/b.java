package p;

import java.net.URL;
import java.util.regex.Pattern;
import t2.j;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f8396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f8398c;

    public b() {
        if (q1.a.f8635l == null) {
            Pattern pattern = j.f9555b;
            q1.a.f8635l = new q1.a(12);
        }
        q1.a aVar = q1.a.f8635l;
        if (j.f9556c == null) {
            j.f9556c = new j(aVar);
        }
        this.f8398c = j.f9556c;
    }

    public synchronized long a(int i) {
        if (!(i == 429 || (i >= 500 && i < 600))) {
            return 86400000L;
        }
        double dPow = Math.pow(2.0d, this.f8397b);
        ((j) this.f8398c).getClass();
        return (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), 1800000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean b() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.f8397b     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r4.f8398c     // Catch: java.lang.Throwable -> L1b
            t2.j r0 = (t2.j) r0     // Catch: java.lang.Throwable -> L1b
            q1.a r0 = r0.f9557a     // Catch: java.lang.Throwable -> L1b
            r0.getClass()     // Catch: java.lang.Throwable -> L1b
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1b
            long r2 = r4.f8396a     // Catch: java.lang.Throwable -> L1b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L19
            goto L1d
        L19:
            r0 = 0
            goto L1e
        L1b:
            r0 = move-exception
            goto L20
        L1d:
            r0 = 1
        L1e:
            monitor-exit(r4)
            return r0
        L20:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.b.b():boolean");
    }

    public synchronized void c() {
        this.f8397b = 0;
    }

    public synchronized void d(int i) {
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            c();
            return;
        }
        this.f8397b++;
        long jA = a(i);
        ((j) this.f8398c).f9557a.getClass();
        this.f8396a = System.currentTimeMillis() + jA;
    }

    public b(int i, URL url, long j) {
        this.f8397b = i;
        this.f8398c = url;
        this.f8396a = j;
    }
}
