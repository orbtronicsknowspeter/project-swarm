package w8;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10938b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f10939l;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.f10937a = i;
        this.f10938b = obj;
        this.f10939l = obj2;
    }

    @Override // w8.e0
    public final i0 a() {
        switch (this.f10937a) {
            case 0:
                return (f0) this.f10938b;
            default:
                return (i0) this.f10939l;
        }
    }

    @Override // w8.e0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f10937a) {
            case 0:
                f0 f0Var = (f0) this.f10938b;
                b bVar = (b) this.f10939l;
                f0Var.h();
                try {
                    bVar.close();
                    if (f0Var.i()) {
                        throw f0Var.k(null);
                    }
                    return;
                } catch (IOException e10) {
                    if (!f0Var.i()) {
                        throw e10;
                    }
                    throw f0Var.k(e10);
                } finally {
                    f0Var.i();
                }
            default:
                ((OutputStream) this.f10938b).close();
                return;
        }
    }

    @Override // w8.e0, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f10937a) {
            case 0:
                f0 f0Var = (f0) this.f10938b;
                b bVar = (b) this.f10939l;
                f0Var.h();
                try {
                    bVar.flush();
                    if (f0Var.i()) {
                        throw f0Var.k(null);
                    }
                    return;
                } catch (IOException e10) {
                    if (!f0Var.i()) {
                        throw e10;
                    }
                    throw f0Var.k(e10);
                } finally {
                    f0Var.i();
                }
            default:
                ((OutputStream) this.f10938b).flush();
                return;
        }
    }

    @Override // w8.e0
    public final void l(h hVar, long j) throws IOException {
        switch (this.f10937a) {
            case 0:
                a.a.o(hVar.f10962b, 0L, j);
                long j6 = j;
                while (true) {
                    long j10 = 0;
                    if (j6 <= 0) {
                        return;
                    }
                    b0 b0Var = hVar.f10961a;
                    b0Var.getClass();
                    while (true) {
                        if (j10 < 65536) {
                            j10 += (long) (b0Var.f10942c - b0Var.f10941b);
                            if (j10 >= j6) {
                                j10 = j6;
                            } else {
                                b0Var = b0Var.f;
                                b0Var.getClass();
                            }
                        }
                    }
                    f0 f0Var = (f0) this.f10938b;
                    b bVar = (b) this.f10939l;
                    f0Var.h();
                    try {
                        try {
                            bVar.l(hVar, j10);
                            if (f0Var.i()) {
                                throw f0Var.k(null);
                            }
                            j6 -= j10;
                        } catch (IOException e10) {
                            if (!f0Var.i()) {
                                throw e10;
                            }
                            throw f0Var.k(e10);
                        }
                    } catch (Throwable th) {
                        f0Var.i();
                        throw th;
                    }
                }
                break;
            default:
                a.a.o(hVar.f10962b, 0L, j);
                while (j > 0) {
                    ((i0) this.f10939l).f();
                    b0 b0Var2 = hVar.f10961a;
                    b0Var2.getClass();
                    int iMin = (int) Math.min(j, b0Var2.f10942c - b0Var2.f10941b);
                    ((OutputStream) this.f10938b).write(b0Var2.f10940a, b0Var2.f10941b, iMin);
                    int i = b0Var2.f10941b + iMin;
                    b0Var2.f10941b = i;
                    long j11 = iMin;
                    j -= j11;
                    hVar.f10962b -= j11;
                    if (i == b0Var2.f10942c) {
                        hVar.f10961a = b0Var2.a();
                        c0.a(b0Var2);
                    }
                }
                return;
        }
    }

    public final String toString() {
        switch (this.f10937a) {
            case 0:
                return "AsyncTimeout.sink(" + ((b) this.f10939l) + ')';
            default:
                return "sink(" + ((OutputStream) this.f10938b) + ')';
        }
    }
}
