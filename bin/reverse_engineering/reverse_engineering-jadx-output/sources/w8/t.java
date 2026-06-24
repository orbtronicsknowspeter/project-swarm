package w8;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class t implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f10994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Inflater f10995b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10996l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f10997m;

    public t(a0 a0Var, Inflater inflater) {
        this.f10994a = a0Var;
        this.f10995b = inflater;
    }

    @Override // w8.g0
    public final i0 a() {
        return this.f10994a.f10933a.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f10997m) {
            return;
        }
        this.f10995b.end();
        this.f10997m = true;
        this.f10994a.close();
    }

    @Override // w8.g0
    public final long p(h hVar, long j) throws IOException {
        long j6;
        hVar.getClass();
        while (j >= 0) {
            if (this.f10997m) {
                androidx.privacysandbox.ads.adservices.customaudience.a.i("closed");
                return 0L;
            }
            a0 a0Var = this.f10994a;
            Inflater inflater = this.f10995b;
            if (j == 0) {
                j6 = 0;
            } else {
                try {
                    b0 b0VarU = hVar.u(1);
                    int iMin = (int) Math.min(j, 8192 - b0VarU.f10941c);
                    if (inflater.needsInput() && !a0Var.b()) {
                        b0 b0Var = a0Var.f10934b.f10960a;
                        b0Var.getClass();
                        int i = b0Var.f10941c;
                        int i6 = b0Var.f10940b;
                        int i10 = i - i6;
                        this.f10996l = i10;
                        inflater.setInput(b0Var.f10939a, i6, i10);
                    }
                    int iInflate = inflater.inflate(b0VarU.f10939a, b0VarU.f10941c, iMin);
                    int i11 = this.f10996l;
                    if (i11 != 0) {
                        int remaining = i11 - inflater.getRemaining();
                        this.f10996l -= remaining;
                        a0Var.skip(remaining);
                    }
                    if (iInflate > 0) {
                        b0VarU.f10941c += iInflate;
                        j6 = iInflate;
                        hVar.f10961b += j6;
                    } else {
                        if (b0VarU.f10940b == b0VarU.f10941c) {
                            hVar.f10960a = b0VarU.a();
                            c0.a(b0VarU);
                        }
                        j6 = 0;
                    }
                } catch (DataFormatException e10) {
                    throw new IOException(e10);
                }
            }
            if (j6 > 0) {
                return j6;
            }
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
            if (a0Var.b()) {
                throw new EOFException("source exhausted prematurely");
            }
        }
        s1.o.o(a4.x.h(j, "byteCount < 0: "));
        return 0L;
    }
}
