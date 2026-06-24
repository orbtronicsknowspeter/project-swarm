package w8;

import androidx.core.location.LocationRequestCompat;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f10934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f10935b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f10936l;

    public a0(g0 g0Var) {
        g0Var.getClass();
        this.f10934a = g0Var;
        this.f10935b = new h();
    }

    @Override // w8.g0
    public final i0 a() {
        return this.f10934a.a();
    }

    public final boolean b() {
        if (this.f10936l) {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("closed");
            return false;
        }
        h hVar = this.f10935b;
        return hVar.c() && this.f10934a.p(hVar, 8192L) == -1;
    }

    public final long c(byte b7, long j, long j6) {
        if (this.f10936l) {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("closed");
            return 0L;
        }
        if (0 > j6) {
            s1.o.o(a4.x.h(j6, "fromIndex=0 toIndex="));
            return 0L;
        }
        long jMax = 0;
        while (jMax < j6) {
            h hVar = this.f10935b;
            byte b10 = b7;
            long j10 = j6;
            long jE = hVar.e(b10, jMax, j10);
            if (jE != -1) {
                return jE;
            }
            long j11 = hVar.f10962b;
            if (j11 >= j10 || this.f10934a.p(hVar, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j11);
            b7 = b10;
            j6 = j10;
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f10936l) {
            return;
        }
        this.f10936l = true;
        this.f10934a.close();
        h hVar = this.f10935b;
        hVar.skip(hVar.f10962b);
    }

    public final boolean d(long j, k kVar) {
        kVar.getClass();
        int iF = kVar.f();
        if (this.f10936l) {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("closed");
            return false;
        }
        if (j >= 0 && iF >= 0 && kVar.f() >= iF) {
            for (int i = 0; i < iF; i++) {
                long j6 = ((long) i) + j;
                if (n(1 + j6) && this.f10935b.d(j6) == kVar.k(i)) {
                }
            }
            return true;
        }
        return false;
    }

    public final void e(byte[] bArr) throws EOFException {
        h hVar = this.f10935b;
        int i = 0;
        try {
            t(bArr.length);
            while (i < bArr.length) {
                int i6 = hVar.read(bArr, i, bArr.length - i);
                if (i6 == -1) {
                    s1.o.d();
                    return;
                }
                i += i6;
            }
        } catch (EOFException e10) {
            while (true) {
                long j = hVar.f10962b;
                if (j <= 0) {
                    throw e10;
                }
                int i10 = hVar.read(bArr, i, (int) j);
                if (i10 == -1) {
                    throw new AssertionError();
                }
                i += i10;
            }
        }
    }

    public final int f() {
        t(4L);
        int i = this.f10935b.readInt();
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    @Override // w8.j
    public final k g(long j) {
        t(j);
        return this.f10935b.g(j);
    }

    public final long h() throws EOFException {
        char c9;
        char c10;
        char c11;
        char c12;
        long j;
        t(8L);
        h hVar = this.f10935b;
        if (hVar.f10962b < 8) {
            s1.o.d();
            return 0L;
        }
        b0 b0Var = hVar.f10961a;
        b0Var.getClass();
        int i = b0Var.f10941b;
        int i6 = b0Var.f10942c;
        if (i6 - i < 8) {
            j = ((((long) hVar.readInt()) & 4294967295L) << 32) | (4294967295L & ((long) hVar.readInt()));
            c11 = '8';
            c12 = '\b';
            c9 = 24;
            c10 = '(';
        } else {
            byte[] bArr = b0Var.f10940a;
            c9 = 24;
            c10 = '(';
            c11 = '8';
            c12 = '\b';
            int i10 = i + 7;
            long j6 = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
            int i11 = i + 8;
            long j10 = j6 | (((long) bArr[i10]) & 255);
            hVar.f10962b -= 8;
            if (i11 == i6) {
                hVar.f10961a = b0Var.a();
                c0.a(b0Var);
            } else {
                b0Var.f10941b = i11;
            }
            j = j10;
        }
        return ((j & 255) << c11) | (((-72057594037927936L) & j) >>> c11) | ((71776119061217280L & j) >>> c10) | ((280375465082880L & j) >>> c9) | ((1095216660480L & j) >>> c12) | ((4278190080L & j) << c12) | ((16711680 & j) << c9) | ((65280 & j) << c10);
    }

    public final short i() {
        t(2L);
        return this.f10935b.n();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f10936l;
    }

    public final String j(long j) {
        t(j);
        return this.f10935b.r(j, l7.a.f7152a);
    }

    @Override // w8.j
    public final String k(long j) {
        if (j < 0) {
            s1.o.o(a4.x.h(j, "limit < 0: "));
            return null;
        }
        long j6 = j == LocationRequestCompat.PASSIVE_INTERVAL ? Long.MAX_VALUE : j + 1;
        long jC = c((byte) 10, 0L, j6);
        h hVar = this.f10935b;
        if (jC != -1) {
            return x8.a.a(hVar, jC);
        }
        if (j6 < LocationRequestCompat.PASSIVE_INTERVAL && n(j6) && hVar.d(j6 - 1) == 13 && n(j6 + 1) && hVar.d(j6) == 10) {
            return x8.a.a(hVar, j6);
        }
        h hVar2 = new h();
        hVar.b(hVar2, 0L, Math.min(32, hVar.f10962b));
        throw new EOFException("\\n not found: limit=" + Math.min(hVar.f10962b, j) + " content=" + hVar2.g(hVar2.f10962b).g() + (char) 8230);
    }

    public final boolean n(long j) {
        h hVar;
        if (j < 0) {
            s1.o.o(a4.x.h(j, "byteCount < 0: "));
            return false;
        }
        if (this.f10936l) {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("closed");
            return false;
        }
        do {
            hVar = this.f10935b;
            if (hVar.f10962b >= j) {
                return true;
            }
        } while (this.f10934a.p(hVar, 8192L) != -1);
        return false;
    }

    @Override // w8.g0
    public final long p(h hVar, long j) {
        hVar.getClass();
        if (j < 0) {
            s1.o.o(a4.x.h(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.f10936l) {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("closed");
            return 0L;
        }
        h hVar2 = this.f10935b;
        if (hVar2.f10962b == 0 && this.f10934a.p(hVar2, 8192L) == -1) {
            return -1L;
        }
        return hVar2.p(hVar, Math.min(j, hVar2.f10962b));
    }

    @Override // w8.j
    public final String q() {
        return k(LocationRequestCompat.PASSIVE_INTERVAL);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        h hVar = this.f10935b;
        if (hVar.f10962b == 0 && this.f10934a.p(hVar, 8192L) == -1) {
            return -1;
        }
        return hVar.read(byteBuffer);
    }

    @Override // w8.j
    public final byte readByte() {
        t(1L);
        return this.f10935b.readByte();
    }

    @Override // w8.j
    public final int readInt() {
        t(4L);
        return this.f10935b.readInt();
    }

    @Override // w8.j
    public final short readShort() {
        t(2L);
        return this.f10935b.readShort();
    }

    @Override // w8.j
    public final void skip(long j) {
        if (this.f10936l) {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("closed");
            return;
        }
        while (j > 0) {
            h hVar = this.f10935b;
            if (hVar.f10962b == 0 && this.f10934a.p(hVar, 8192L) == -1) {
                s1.o.d();
                return;
            } else {
                long jMin = Math.min(j, hVar.f10962b);
                hVar.skip(jMin);
                j -= jMin;
            }
        }
    }

    @Override // w8.j
    public final void t(long j) {
        if (n(j)) {
            return;
        }
        s1.o.d();
    }

    public final String toString() {
        return "buffer(" + this.f10934a + ')';
    }

    @Override // w8.j
    public final long w() {
        h hVar;
        byte bD;
        t(1L);
        int i = 0;
        while (true) {
            int i6 = i + 1;
            boolean zN = n(i6);
            hVar = this.f10935b;
            if (!zN) {
                break;
            }
            bD = hVar.d(i);
            if ((bD < 48 || bD > 57) && ((bD < 97 || bD > 102) && (bD < 65 || bD > 70))) {
                break;
            }
            i = i6;
        }
        if (i == 0) {
            d0.b.v(16);
            d0.b.v(16);
            String string = Integer.toString(bD, 16);
            string.getClass();
            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
        }
        return hVar.w();
    }

    @Override // w8.j
    public final InputStream x() {
        return new f(this, 1);
    }
}
