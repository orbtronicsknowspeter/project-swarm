package w8;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f10975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f10976b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f10977l;

    public l(u uVar) {
        uVar.getClass();
        this.f10975a = uVar;
        this.f10976b = 0L;
    }

    @Override // w8.e0
    public final i0 a() {
        return i0.f10963d;
    }

    @Override // w8.e0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        u uVar = this.f10975a;
        if (this.f10977l) {
            return;
        }
        this.f10977l = true;
        ReentrantLock reentrantLock = uVar.f11002m;
        reentrantLock.lock();
        try {
            int i = uVar.f11001l - 1;
            uVar.f11001l = i;
            if (i == 0) {
                if (uVar.f11000b) {
                    synchronized (uVar) {
                        uVar.f11003n.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // w8.e0, java.io.Flushable
    public final void flush() {
        if (this.f10977l) {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("closed");
            return;
        }
        u uVar = this.f10975a;
        synchronized (uVar) {
            uVar.f11003n.getFD().sync();
        }
    }

    @Override // w8.e0
    public final void l(h hVar, long j) {
        if (this.f10977l) {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("closed");
            return;
        }
        u uVar = this.f10975a;
        long j6 = this.f10976b;
        uVar.getClass();
        a.a.o(hVar.f10962b, 0L, j);
        long j10 = j6 + j;
        while (j6 < j10) {
            b0 b0Var = hVar.f10961a;
            b0Var.getClass();
            int iMin = (int) Math.min(j10 - j6, b0Var.f10942c - b0Var.f10941b);
            byte[] bArr = b0Var.f10940a;
            int i = b0Var.f10941b;
            synchronized (uVar) {
                bArr.getClass();
                uVar.f11003n.seek(j6);
                uVar.f11003n.write(bArr, i, iMin);
            }
            int i6 = b0Var.f10941b + iMin;
            b0Var.f10941b = i6;
            long j11 = iMin;
            j6 += j11;
            hVar.f10962b -= j11;
            if (i6 == b0Var.f10942c) {
                hVar.f10961a = b0Var.a();
                c0.a(b0Var);
            }
        }
        this.f10976b += j;
    }
}
