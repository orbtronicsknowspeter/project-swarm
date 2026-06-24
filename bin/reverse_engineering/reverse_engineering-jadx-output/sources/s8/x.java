package s8;

import a4.k0;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class x implements Closeable {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Logger f9471p = Logger.getLogger(e.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w8.i f9472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9473b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w8.h f9474l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f9475m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f9476n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final k0 f9477o;

    public x(w8.z zVar, boolean z9) {
        this.f9472a = zVar;
        this.f9473b = z9;
        w8.h hVar = new w8.h();
        this.f9474l = hVar;
        this.f9477o = new k0(hVar);
        this.f9475m = 16384;
    }

    public final synchronized void b(f8.q qVar) {
        try {
            if (this.f9476n) {
                throw new IOException("closed");
            }
            int i = this.f9475m;
            int i6 = qVar.f4964b;
            if ((i6 & 32) != 0) {
                i = ((int[]) qVar.f4965c)[5];
            }
            this.f9475m = i;
            if (((i6 & 2) != 0 ? ((int[]) qVar.f4965c)[1] : -1) != -1) {
                k0 k0Var = this.f9477o;
                int iMin = Math.min((i6 & 2) != 0 ? ((int[]) qVar.f4965c)[1] : -1, 16384);
                int i10 = k0Var.f129d;
                if (i10 != iMin) {
                    if (iMin < i10) {
                        k0Var.f128c = Math.min(k0Var.f128c, iMin);
                    }
                    k0Var.f = true;
                    k0Var.f129d = iMin;
                    int i11 = k0Var.h;
                    if (iMin < i11) {
                        if (iMin == 0) {
                            Arrays.fill((b[]) k0Var.i, (Object) null);
                            k0Var.f130e = ((b[]) k0Var.i).length - 1;
                            k0Var.g = 0;
                            k0Var.h = 0;
                        } else {
                            k0Var.a(i11 - iMin);
                        }
                    }
                }
            }
            d(0, 0, (byte) 4, (byte) 1);
            this.f9472a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(boolean z9, int i, w8.h hVar, int i6) {
        if (this.f9476n) {
            throw new IOException("closed");
        }
        d(i, i6, (byte) 0, z9 ? (byte) 1 : (byte) 0);
        if (i6 > 0) {
            this.f9472a.l(hVar, i6);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f9476n = true;
        this.f9472a.close();
    }

    public final void d(int i, int i6, byte b7, byte b10) {
        Level level = Level.FINE;
        Logger logger = f9471p;
        if (logger.isLoggable(level)) {
            logger.fine(e.a(false, i, i6, b7, b10));
        }
        int i10 = this.f9475m;
        if (i6 > i10) {
            e.b("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i10), Integer.valueOf(i6));
            throw null;
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            e.b("reserved bit set: %s", Integer.valueOf(i));
            throw null;
        }
        w8.i iVar = this.f9472a;
        iVar.writeByte((i6 >>> 16) & 255);
        iVar.writeByte((i6 >>> 8) & 255);
        iVar.writeByte(i6 & 255);
        iVar.writeByte(b7 & 255);
        iVar.writeByte(b10 & 255);
        iVar.writeInt(i & Integer.MAX_VALUE);
    }

    public final synchronized void e(int i, int i6, byte[] bArr) {
        try {
            if (this.f9476n) {
                throw new IOException("closed");
            }
            if (k0.k.c(i6) == -1) {
                e.b("errorCode.httpCode == -1", new Object[0]);
                throw null;
            }
            d(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f9472a.writeInt(i);
            this.f9472a.writeInt(k0.k.c(i6));
            if (bArr.length > 0) {
                this.f9472a.write(bArr);
            }
            this.f9472a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.util.ArrayList r18, int r19, boolean r20) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s8.x.f(java.util.ArrayList, int, boolean):void");
    }

    public final synchronized void flush() {
        if (this.f9476n) {
            throw new IOException("closed");
        }
        this.f9472a.flush();
    }

    public final synchronized void h(int i, int i6, boolean z9) {
        if (this.f9476n) {
            throw new IOException("closed");
        }
        d(0, 8, (byte) 6, z9 ? (byte) 1 : (byte) 0);
        this.f9472a.writeInt(i);
        this.f9472a.writeInt(i6);
        this.f9472a.flush();
    }

    public final synchronized void i(int i, int i6) {
        if (this.f9476n) {
            throw new IOException("closed");
        }
        if (k0.k.c(i6) == -1) {
            throw new IllegalArgumentException();
        }
        d(i, 4, (byte) 3, (byte) 0);
        this.f9472a.writeInt(k0.k.c(i6));
        this.f9472a.flush();
    }

    public final synchronized void j(f8.q qVar) {
        try {
            if (this.f9476n) {
                throw new IOException("closed");
            }
            d(0, Integer.bitCount(qVar.f4964b) * 6, (byte) 4, (byte) 0);
            int i = 0;
            while (i < 10) {
                boolean z9 = true;
                if (((1 << i) & qVar.f4964b) == 0) {
                    z9 = false;
                }
                if (z9) {
                    this.f9472a.writeShort(i == 4 ? 3 : i == 7 ? 4 : i);
                    this.f9472a.writeInt(((int[]) qVar.f4965c)[i]);
                }
                i++;
            }
            this.f9472a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void n(ArrayList arrayList, int i, boolean z9) {
        if (this.f9476n) {
            throw new IOException("closed");
        }
        f(arrayList, i, z9);
    }

    public final synchronized void r(int i, long j) {
        if (this.f9476n) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            e.b("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
            throw null;
        }
        d(i, 4, (byte) 8, (byte) 0);
        this.f9472a.writeInt((int) j);
        this.f9472a.flush();
    }
}
