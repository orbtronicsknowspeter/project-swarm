package s8;

import java.io.IOException;
import java.io.InterruptedIOException;
import w8.g0;
import w8.i0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class u implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w8.h f9459a = new w8.h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w8.h f9460b = new w8.h();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f9461l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f9462m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f9463n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ w f9464o;

    public u(w wVar, long j) {
        this.f9464o = wVar;
        this.f9461l = j;
    }

    @Override // w8.g0
    public final i0 a() {
        return this.f9464o.i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f9464o) {
            this.f9462m = true;
            w8.h hVar = this.f9460b;
            hVar.skip(hVar.f10962b);
            this.f9464o.notifyAll();
        }
        this.f9464o.a();
    }

    @Override // w8.g0
    public final long p(w8.h hVar, long j) {
        if (j < 0) {
            com.google.gson.internal.a.p(a4.x.h(j, "byteCount < 0: "));
            return 0L;
        }
        synchronized (this.f9464o) {
            try {
                w wVar = this.f9464o;
                wVar.i.h();
                while (this.f9460b.f10962b == 0 && !this.f9463n && !this.f9462m && wVar.f9471k == 0) {
                    try {
                        try {
                            wVar.wait();
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        wVar.i.k();
                        throw th;
                    }
                }
                wVar.i.k();
                if (this.f9462m) {
                    throw new IOException("stream closed");
                }
                int i = this.f9464o.f9471k;
                if (i != 0) {
                    throw new a0(i);
                }
                w8.h hVar2 = this.f9460b;
                long j6 = hVar2.f10962b;
                if (j6 == 0) {
                    return -1L;
                }
                long jP = hVar2.p(hVar, Math.min(j, j6));
                w wVar2 = this.f9464o;
                long j10 = wVar2.f9466a + jP;
                wVar2.f9466a = j10;
                if (j10 >= wVar2.f9469d.f9440w.c() / 2) {
                    w wVar3 = this.f9464o;
                    wVar3.f9469d.n(wVar3.f9468c, wVar3.f9466a);
                    this.f9464o.f9466a = 0L;
                }
                synchronized (this.f9464o.f9469d) {
                    try {
                        q qVar = this.f9464o.f9469d;
                        long j11 = qVar.f9439u + jP;
                        qVar.f9439u = j11;
                        if (j11 >= qVar.f9440w.c() / 2) {
                            q qVar2 = this.f9464o.f9469d;
                            qVar2.n(0, qVar2.f9439u);
                            this.f9464o.f9469d.f9439u = 0L;
                        }
                    } finally {
                    }
                }
                return jP;
            } finally {
            }
        }
    }
}
