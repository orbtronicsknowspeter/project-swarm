package w8;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class m implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f10977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f10978b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f10979l;

    public m(u uVar, long j) {
        this.f10977a = uVar;
        this.f10978b = j;
    }

    @Override // w8.g0
    public final i0 a() {
        return i0.f10962d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        u uVar = this.f10977a;
        if (this.f10979l) {
            return;
        }
        this.f10979l = true;
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

    @Override // w8.g0
    public final long p(h hVar, long j) {
        long j6;
        long j10;
        int i;
        hVar.getClass();
        if (this.f10979l) {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("closed");
            return 0L;
        }
        u uVar = this.f10977a;
        long j11 = this.f10978b;
        if (j < 0) {
            s1.o.o(a4.x.h(j, "byteCount < 0: "));
            return 0L;
        }
        long j12 = j + j11;
        long j13 = j11;
        while (true) {
            if (j13 >= j12) {
                j6 = -1;
                break;
            }
            b0 b0VarU = hVar.u(1);
            byte[] bArr = b0VarU.f10939a;
            int i6 = b0VarU.f10941c;
            j6 = -1;
            int iMin = (int) Math.min(j12 - j13, 8192 - i6);
            synchronized (uVar) {
                bArr.getClass();
                uVar.f11002n.seek(j13);
                i = 0;
                while (true) {
                    if (i >= iMin) {
                        break;
                    }
                    int i10 = uVar.f11002n.read(bArr, i6, iMin - i);
                    if (i10 != -1) {
                        i += i10;
                    } else if (i == 0) {
                        i = -1;
                    }
                }
            }
            if (i == -1) {
                if (b0VarU.f10940b == b0VarU.f10941c) {
                    hVar.f10960a = b0VarU.a();
                    c0.a(b0VarU);
                }
                if (j11 == j13) {
                    j10 = -1;
                }
            } else {
                b0VarU.f10941c += i;
                long j14 = i;
                j13 += j14;
                hVar.f10961b += j14;
            }
        }
        j10 = j13 - j11;
        if (j10 != j6) {
            this.f10978b += j10;
        }
        return j10;
    }
}
