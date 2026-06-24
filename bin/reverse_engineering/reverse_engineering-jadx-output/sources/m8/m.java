package m8;

import java.lang.ref.Reference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class m {
    public static final ThreadPoolExecutor g;
    public boolean f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a4.f f7759c = new a4.f(this, 21);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f7760d = new ArrayDeque();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g5.f f7761e = new g5.f(12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7757a = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7758b = 300000000000L;

    static {
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = n8.c.f8114a;
        g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, synchronousQueue, new n8.b("OkHttp ConnectionPool", true));
    }

    public final long a(long j) {
        synchronized (this) {
            try {
                p8.a aVar = null;
                long j6 = Long.MIN_VALUE;
                int i = 0;
                int i6 = 0;
                for (p8.a aVar2 : this.f7760d) {
                    if (b(aVar2, j) > 0) {
                        i6++;
                    } else {
                        i++;
                        long j10 = j - aVar2.f8477o;
                        if (j10 > j6) {
                            aVar = aVar2;
                            j6 = j10;
                        }
                    }
                }
                long j11 = this.f7758b;
                if (j6 < j11 && i <= this.f7757a) {
                    if (i > 0) {
                        return j11 - j6;
                    }
                    if (i6 > 0) {
                        return j11;
                    }
                    this.f = false;
                    return -1L;
                }
                this.f7760d.remove(aVar);
                n8.c.d(aVar.f8472e);
                return 0L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int b(p8.a aVar, long j) {
        ArrayList arrayList = aVar.f8476n;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                u8.h.f10783a.l("A connection to " + aVar.f8470c.f7718a.f7668a + " was leaked. Did you forget to close a response body?", ((p8.d) reference).f8485a);
                arrayList.remove(i);
                aVar.f8473k = true;
                if (arrayList.isEmpty()) {
                    aVar.f8477o = j - this.f7758b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
