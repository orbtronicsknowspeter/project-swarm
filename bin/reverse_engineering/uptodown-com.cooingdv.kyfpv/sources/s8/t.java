package s8;

import java.io.InterruptedIOException;
import w8.e0;
import w8.i0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class t implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w8.h f9455a = new w8.h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9456b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f9457l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w f9458m;

    public t(w wVar) {
        this.f9458m = wVar;
    }

    @Override // w8.e0
    public final i0 a() {
        return this.f9458m.j;
    }

    public final void b(boolean z9) {
        w wVar;
        long jMin;
        w wVar2;
        synchronized (this.f9458m) {
            this.f9458m.j.h();
            while (true) {
                try {
                    wVar = this.f9458m;
                    if (wVar.f9467b > 0 || this.f9457l || this.f9456b || wVar.f9471k != 0) {
                        break;
                    }
                    try {
                        wVar.wait();
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                } finally {
                    this.f9458m.j.k();
                }
            }
            wVar.j.k();
            this.f9458m.b();
            jMin = Math.min(this.f9458m.f9467b, this.f9455a.f10962b);
            wVar2 = this.f9458m;
            wVar2.f9467b -= jMin;
        }
        wVar2.j.h();
        try {
            w wVar3 = this.f9458m;
            wVar3.f9469d.i(wVar3.f9468c, z9 && jMin == this.f9455a.f10962b, this.f9455a, jMin);
            this.f9458m.j.k();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // w8.e0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f9458m) {
            try {
                if (this.f9456b) {
                    return;
                }
                w wVar = this.f9458m;
                if (!wVar.h.f9457l) {
                    if (this.f9455a.f10962b > 0) {
                        while (this.f9455a.f10962b > 0) {
                            b(true);
                        }
                    } else {
                        wVar.f9469d.i(wVar.f9468c, true, null, 0L);
                    }
                }
                synchronized (this.f9458m) {
                    this.f9456b = true;
                }
                this.f9458m.f9469d.flush();
                this.f9458m.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // w8.e0, java.io.Flushable
    public final void flush() {
        synchronized (this.f9458m) {
            this.f9458m.b();
        }
        while (this.f9455a.f10962b > 0) {
            b(false);
            this.f9458m.f9469d.flush();
        }
    }

    @Override // w8.e0
    public final void l(w8.h hVar, long j) {
        w8.h hVar2 = this.f9455a;
        hVar2.l(hVar, j);
        while (hVar2.f10962b >= 16384) {
            b(false);
        }
    }
}
