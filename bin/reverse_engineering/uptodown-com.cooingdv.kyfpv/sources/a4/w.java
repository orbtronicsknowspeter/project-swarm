package a4;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class w extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f183b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f184l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f185m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f186n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f187o = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f188p;

    public w(w8.f fVar) {
        this.f188p = -1;
        this.f182a = fVar.markSupported() ? fVar : new BufferedInputStream(fVar, 4096);
        this.f188p = 1024;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f182a.available();
    }

    public final void b(long j) throws IOException {
        if (this.f183b > this.f185m || j < this.f184l) {
            com.google.gson.internal.a.n("Cannot reset");
            return;
        }
        this.f182a.reset();
        d(this.f184l, j);
        this.f183b = j;
    }

    public final void c(long j) {
        try {
            long j6 = this.f184l;
            long j10 = this.f183b;
            InputStream inputStream = this.f182a;
            if (j6 >= j10 || j10 > this.f185m) {
                this.f184l = j10;
                inputStream.mark((int) (j - j10));
            } else {
                inputStream.reset();
                inputStream.mark((int) (j - this.f184l));
                d(this.f184l, this.f183b);
            }
            this.f185m = j;
        } catch (IOException e10) {
            a3.b.l(e10, "Unable to mark: ");
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f182a.close();
    }

    public final void d(long j, long j6) throws IOException {
        while (j < j6) {
            long jSkip = this.f182a.skip(j6 - j);
            if (jSkip == 0) {
                if (read() == -1) {
                    return;
                } else {
                    jSkip = 1;
                }
            }
            j += jSkip;
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        long j = this.f183b + ((long) i);
        if (this.f185m < j) {
            c(j);
        }
        this.f186n = this.f183b;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f182a.markSupported();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        if (!this.f187o) {
            long j = this.f183b;
            if (((long) bArr.length) + j > this.f185m) {
                c(j + ((long) bArr.length) + ((long) this.f188p));
            }
        }
        int i = this.f182a.read(bArr);
        if (i != -1) {
            this.f183b += (long) i;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        b(this.f186n);
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        if (!this.f187o) {
            long j6 = this.f183b + j;
            if (j6 > this.f185m) {
                c(j6 + ((long) this.f188p));
            }
        }
        long jSkip = this.f182a.skip(j);
        this.f183b += jSkip;
        return jSkip;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (!this.f187o) {
            long j = this.f183b + 1;
            long j6 = this.f185m;
            if (j > j6) {
                c(j6 + ((long) this.f188p));
            }
        }
        int i = this.f182a.read();
        if (i != -1) {
            this.f183b++;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i6) throws IOException {
        if (!this.f187o) {
            long j = this.f183b + ((long) i6);
            if (j > this.f185m) {
                c(j + ((long) this.f188p));
            }
        }
        int i10 = this.f182a.read(bArr, i, i6);
        if (i10 != -1) {
            this.f183b += (long) i10;
        }
        return i10;
    }
}
