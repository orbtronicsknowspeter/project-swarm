package w8;

import com.google.android.gms.internal.measurement.i5;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10944a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10945b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f10946l;

    public c(InputStream inputStream, i0 i0Var) {
        inputStream.getClass();
        this.f10945b = inputStream;
        this.f10946l = i0Var;
    }

    @Override // w8.g0
    public final i0 a() {
        switch (this.f10944a) {
            case 0:
                return (f0) this.f10945b;
            default:
                return (i0) this.f10946l;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f10944a) {
            case 0:
                f0 f0Var = (f0) this.f10945b;
                c cVar = (c) this.f10946l;
                f0Var.h();
                try {
                    cVar.close();
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
                ((InputStream) this.f10945b).close();
                return;
        }
    }

    @Override // w8.g0
    public final long p(h hVar, long j) throws IOException {
        int i = this.f10944a;
        hVar.getClass();
        switch (i) {
            case 0:
                f0 f0Var = (f0) this.f10945b;
                c cVar = (c) this.f10946l;
                f0Var.h();
                try {
                    long jP = cVar.p(hVar, j);
                    if (f0Var.i()) {
                        throw f0Var.k(null);
                    }
                    return jP;
                } catch (IOException e10) {
                    if (f0Var.i()) {
                        throw f0Var.k(e10);
                    }
                    throw e10;
                } finally {
                    f0Var.i();
                }
            default:
                if (j == 0) {
                    return 0L;
                }
                if (j < 0) {
                    s1.o.o(a4.x.h(j, "byteCount < 0: "));
                    return 0L;
                }
                try {
                    ((i0) this.f10946l).f();
                    b0 b0VarU = hVar.u(1);
                    int i6 = ((InputStream) this.f10945b).read(b0VarU.f10939a, b0VarU.f10941c, (int) Math.min(j, 8192 - b0VarU.f10941c));
                    if (i6 == -1) {
                        if (b0VarU.f10940b == b0VarU.f10941c) {
                            hVar.f10960a = b0VarU.a();
                            c0.a(b0VarU);
                        }
                        return -1L;
                    }
                    b0VarU.f10941c += i6;
                    long j6 = i6;
                    hVar.f10961b += j6;
                    return j6;
                } catch (AssertionError e11) {
                    if (i5.y(e11)) {
                        throw new IOException(e11);
                    }
                    throw e11;
                }
        }
    }

    public final String toString() {
        switch (this.f10944a) {
            case 0:
                return "AsyncTimeout.source(" + ((c) this.f10946l) + ')';
            default:
                return "source(" + ((InputStream) this.f10945b) + ')';
        }
    }

    public c(f0 f0Var, c cVar) {
        this.f10945b = f0Var;
        this.f10946l = cVar;
    }
}
