package m8;

import androidx.core.location.LocationRequestCompat;
import com.google.android.gms.internal.measurement.z3;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements Closeable, Flushable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g5.g f7721a = new g5.g(this, 7);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o8.f f7722b;

    public g(File file, long j) {
        Pattern pattern = o8.f.D;
        if (j <= 0) {
            com.google.gson.internal.a.p("maxSize <= 0");
            throw null;
        }
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        byte[] bArr = n8.c.f8114a;
        this.f7722b = new o8.f(file, j, new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, linkedBlockingQueue, new n8.b("OkHttp DiskLruCache", true)));
    }

    public static int b(w8.a0 a0Var) throws IOException {
        byte bD;
        try {
            w8.h hVar = a0Var.f10934b;
            a0Var.t(1L);
            long j = 0;
            while (true) {
                long j6 = j + 1;
                if (!a0Var.n(j6)) {
                    break;
                }
                bD = hVar.d(j);
                if ((bD < 48 || bD > 57) && (j != 0 || bD != 45)) {
                    break;
                }
                j = j6;
            }
            if (j == 0) {
                d0.b.v(16);
                d0.b.v(16);
                String string = Integer.toString(bD, 16);
                string.getClass();
                throw new NumberFormatException("Expected a digit or '-' but was 0x".concat(string));
            }
            long j10 = hVar.j();
            String strK = a0Var.k(LocationRequestCompat.PASSIVE_INTERVAL);
            if (j10 >= 0 && j10 <= 2147483647L && strK.isEmpty()) {
                return (int) j10;
            }
            throw new IOException("expected an int but was \"" + j10 + strK + "\"");
        } catch (NumberFormatException e10) {
            com.google.gson.internal.a.n(e10.getMessage());
            return 0;
        }
    }

    public final void c(a0 a0Var) {
        o8.f fVar = this.f7722b;
        String str = a0Var.f7673a.i;
        w8.k kVar = w8.k.f10970m;
        String strG = z3.m(str).e("MD5").g();
        synchronized (fVar) {
            fVar.f();
            fVar.b();
            o8.f.z(strG);
            o8.d dVar = (o8.d) fVar.f8365t.get(strG);
            if (dVar == null) {
                return;
            }
            fVar.u(dVar);
            if (fVar.f8363r <= fVar.f8361p) {
                fVar.f8369y = false;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7722b.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.f7722b.flush();
    }
}
