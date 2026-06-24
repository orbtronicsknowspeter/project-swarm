package w8;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class u implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11000b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11001l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ReentrantLock f11002m = new ReentrantLock();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final RandomAccessFile f11003n;

    public u(boolean z9, RandomAccessFile randomAccessFile) {
        this.f10999a = z9;
        this.f11003n = randomAccessFile;
    }

    public static l b(u uVar) {
        if (!uVar.f10999a) {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("file handle is read-only");
            return null;
        }
        ReentrantLock reentrantLock = uVar.f11002m;
        reentrantLock.lock();
        try {
            if (uVar.f11000b) {
                throw new IllegalStateException("closed");
            }
            uVar.f11001l++;
            reentrantLock.unlock();
            return new l(uVar);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final m c(long j) {
        ReentrantLock reentrantLock = this.f11002m;
        reentrantLock.lock();
        try {
            if (this.f11000b) {
                throw new IllegalStateException("closed");
            }
            this.f11001l++;
            reentrantLock.unlock();
            return new m(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f11002m;
        reentrantLock.lock();
        try {
            if (this.f11000b) {
                return;
            }
            this.f11000b = true;
            if (this.f11001l != 0) {
                return;
            }
            synchronized (this) {
                this.f11003n.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void flush() {
        if (!this.f10999a) {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("file handle is read-only");
            return;
        }
        ReentrantLock reentrantLock = this.f11002m;
        reentrantLock.lock();
        try {
            if (this.f11000b) {
                throw new IllegalStateException("closed");
            }
            synchronized (this) {
                this.f11003n.getFD().sync();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long size() {
        long length;
        ReentrantLock reentrantLock = this.f11002m;
        reentrantLock.lock();
        try {
            if (this.f11000b) {
                throw new IllegalStateException("closed");
            }
            synchronized (this) {
                length = this.f11003n.length();
            }
            return length;
        } finally {
            reentrantLock.unlock();
        }
    }
}
