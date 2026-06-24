package w8;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f10974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f10975b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f10976l;

    public l(u uVar) {
        uVar.getClass();
        this.f10974a = uVar;
        this.f10975b = 0L;
    }

    @Override // w8.e0
    public final i0 a() {
        return i0.f10962d;
    }

    @Override // w8.e0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        u uVar = this.f10974a;
        if (this.f10976l) {
            return;
        }
        this.f10976l = true;
        ReentrantLock reentrantLock = uVar.f11001m;
        reentrantLock.lock();
        try {
            int i = uVar.f11000l - 1;
            uVar.f11000l = i;
            if (i == 0) {
                if (uVar.f10999b) {
                    synchronized (uVar) {
                        uVar.f11002n.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // w8.e0, java.io.Flushable
    public final void flush() {
        if (this.f10976l) {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("closed");
            return;
        }
        u uVar = this.f10974a;
        synchronized (uVar) {
            uVar.f11002n.getFD().sync();
        }
    }

    @Override // w8.e0
    public final void l(h hVar, long j) {
        if (this.f10976l) {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("closed");
            return;
        }
        u uVar = this.f10974a;
        long j6 = this.f10975b;
        uVar.getClass();
        a.a.o(hVar.f10961b, 0L, j);
        long j10 = j6 + j;
        while (j6 < j10) {
            b0 b0Var = hVar.f10960a;
            b0Var.getClass();
            int iMin = (int) Math.min(j10 - j6, b0Var.f10941c - b0Var.f10940b);
            byte[] bArr = b0Var.f10939a;
            int i = b0Var.f10940b;
            synchronized (uVar) {
                bArr.getClass();
                uVar.f11002n.seek(j6);
                uVar.f11002n.write(bArr, i, iMin);
            }
            int i6 = b0Var.f10940b + iMin;
            b0Var.f10940b = i6;
            long j11 = iMin;
            j6 += j11;
            hVar.f10961b -= j11;
            if (i6 == b0Var.f10941c) {
                hVar.f10960a = b0Var.a();
                c0.a(b0Var);
            }
        }
        this.f10975b += j;
    }
}
