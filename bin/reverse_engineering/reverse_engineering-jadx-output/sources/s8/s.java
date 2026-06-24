package s8;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class s implements Closeable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Logger f9449n = Logger.getLogger(e.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w8.j f9450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f9451b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f9452l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c f9453m;

    public s(w8.a0 a0Var, boolean z9) {
        this.f9450a = a0Var;
        this.f9452l = z9;
        r rVar = new r(a0Var);
        this.f9451b = rVar;
        this.f9453m = new c(rVar);
    }

    public static int b(int i, byte b7, short s6) {
        if ((b7 & 8) != 0) {
            i--;
        }
        if (s6 <= i) {
            return (short) (i - s6);
        }
        e.c("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s6), Integer.valueOf(i));
        throw null;
    }

    public static int j(w8.j jVar) {
        return (jVar.readByte() & 255) | ((jVar.readByte() & 255) << 16) | ((jVar.readByte() & 255) << 8);
    }

    public final boolean c(boolean z9, o oVar) throws IOException {
        int i;
        try {
            this.f9450a.t(9L);
            int iJ = j(this.f9450a);
            if (iJ < 0 || iJ > 16384) {
                e.c("FRAME_SIZE_ERROR: %s", Integer.valueOf(iJ));
                throw null;
            }
            byte b7 = (byte) (this.f9450a.readByte() & 255);
            if (z9 && b7 != 4) {
                e.c("Expected a SETTINGS frame but was %s", Byte.valueOf(b7));
                throw null;
            }
            byte b10 = (byte) (this.f9450a.readByte() & 255);
            int i6 = this.f9450a.readInt();
            int i10 = Integer.MAX_VALUE & i6;
            Logger logger = f9449n;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(e.a(true, i10, iJ, b7, b10));
            }
            switch (b7) {
                case 0:
                    e(oVar, iJ, b10, i10);
                    return true;
                case 1:
                    i(oVar, iJ, b10, i10);
                    return true;
                case 2:
                    if (iJ != 5) {
                        e.c("TYPE_PRIORITY length: %d != 5", Integer.valueOf(iJ));
                        throw null;
                    }
                    if (i10 == 0) {
                        e.c("TYPE_PRIORITY streamId == 0", new Object[0]);
                        throw null;
                    }
                    w8.j jVar = this.f9450a;
                    jVar.readInt();
                    jVar.readByte();
                    return true;
                case 3:
                    if (iJ != 4) {
                        e.c("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(iJ));
                        throw null;
                    }
                    if (i10 == 0) {
                        e.c("TYPE_RST_STREAM streamId == 0", new Object[0]);
                        throw null;
                    }
                    int i11 = this.f9450a.readInt();
                    int[] iArrE = c.j.e(11);
                    int length = iArrE.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 < length) {
                            i = iArrE[i12];
                            if (k0.k.c(i) != i11) {
                                i12++;
                            }
                        } else {
                            i = 0;
                        }
                    }
                    if (i == 0) {
                        e.c("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i11));
                        throw null;
                    }
                    q qVar = (q) oVar.f9424l;
                    if (i10 != 0 && (i6 & 1) == 0) {
                        qVar.f9435r.execute(new j(qVar, new Object[]{qVar.f9430m, Integer.valueOf(i10)}, i10, i));
                        return true;
                    }
                    w wVarF = qVar.f(i10);
                    if (wVarF != null) {
                        wVarF.j(i);
                    }
                    return true;
                case 4:
                    s(oVar, iJ, b10, i10);
                    return true;
                case 5:
                    r(oVar, iJ, b10, i10);
                    return true;
                case 6:
                    n(oVar, iJ, b10, i10);
                    return true;
                case 7:
                    f(oVar, iJ, i10);
                    return true;
                case 8:
                    if (iJ != 4) {
                        e.c("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(iJ));
                        throw null;
                    }
                    long j = ((long) this.f9450a.readInt()) & 2147483647L;
                    if (j == 0) {
                        e.c("windowSizeIncrement was 0", Long.valueOf(j));
                        throw null;
                    }
                    q qVar2 = (q) oVar.f9424l;
                    if (i10 == 0) {
                        synchronized (qVar2) {
                            q qVar3 = (q) oVar.f9424l;
                            qVar3.v += j;
                            qVar3.notifyAll();
                            break;
                        }
                        return true;
                    }
                    w wVarD = qVar2.d(i10);
                    if (wVarD != null) {
                        synchronized (wVarD) {
                            wVarD.f9466b += j;
                            if (j > 0) {
                                wVarD.notifyAll();
                            }
                            break;
                        }
                        return true;
                    }
                    return true;
                default:
                    this.f9450a.skip(iJ);
                    return true;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f9450a.close();
    }

    public final void d(o oVar) {
        if (this.f9452l) {
            if (c(true, oVar)) {
                return;
            }
            e.c("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
        w8.k kVar = e.f9393a;
        w8.k kVarG = this.f9450a.g(kVar.f10971a.length);
        Level level = Level.FINE;
        Logger logger = f9449n;
        if (logger.isLoggable(level)) {
            String strG = kVarG.g();
            byte[] bArr = n8.c.f8114a;
            Locale locale = Locale.US;
            logger.fine("<< CONNECTION " + strG);
        }
        if (kVar.equals(kVarG)) {
            return;
        }
        e.c("Expected a connection header but was %s", kVarG.t());
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0115, code lost:
    
        if (r8 == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0117, code lost:
    
        r4.h();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(s8.o r17, int r18, byte r19, int r20) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s8.s.e(s8.o, int, byte, int):void");
    }

    public final void f(o oVar, int i, int i6) {
        int i10;
        w[] wVarArr;
        if (i < 8) {
            e.c("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
            throw null;
        }
        if (i6 != 0) {
            e.c("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        }
        int i11 = this.f9450a.readInt();
        int i12 = this.f9450a.readInt();
        int i13 = i - 8;
        int[] iArrE = c.j.e(11);
        int length = iArrE.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                i10 = 0;
                break;
            }
            i10 = iArrE[i14];
            if (k0.k.c(i10) == i12) {
                break;
            } else {
                i14++;
            }
        }
        if (i10 == 0) {
            e.c("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i12));
            throw null;
        }
        w8.k kVarG = w8.k.f10970m;
        if (i13 > 0) {
            kVarG = this.f9450a.g(i13);
        }
        kVarG.f();
        synchronized (((q) oVar.f9424l)) {
            wVarArr = (w[]) ((q) oVar.f9424l).f9429l.values().toArray(new w[((q) oVar.f9424l).f9429l.size()]);
            ((q) oVar.f9424l).f9433p = true;
        }
        for (w wVar : wVarArr) {
            if (wVar.f9467c > i11 && wVar.f()) {
                wVar.j(5);
                ((q) oVar.f9424l).f(wVar.f9467c);
            }
        }
    }

    public final ArrayList h(int i, short s6, byte b7, int i6) throws IOException {
        r rVar = this.f9451b;
        rVar.f9447n = i;
        rVar.f9444b = i;
        rVar.f9448o = s6;
        rVar.f9445l = b7;
        rVar.f9446m = i6;
        c cVar = this.f9453m;
        w8.a0 a0Var = cVar.f9387b;
        ArrayList arrayList = cVar.f9386a;
        while (!a0Var.b()) {
            byte b10 = a0Var.readByte();
            int i10 = b10 & 255;
            if (i10 == 128) {
                com.google.gson.internal.a.n("index == 0");
                return null;
            }
            if ((b10 & 128) == 128) {
                int iE = cVar.e(i10, 127);
                int i11 = iE - 1;
                if (i11 >= 0) {
                    b[] bVarArr = d.f9391a;
                    if (i11 <= bVarArr.length - 1) {
                        arrayList.add(bVarArr[i11]);
                    }
                }
                int length = cVar.f + 1 + (i11 - d.f9391a.length);
                if (length >= 0) {
                    b[] bVarArr2 = cVar.f9390e;
                    if (length < bVarArr2.length) {
                        arrayList.add(bVarArr2[length]);
                    }
                }
                com.google.gson.internal.a.n(androidx.lifecycle.l.u(iE, "Header index too large "));
                return null;
            }
            if (i10 == 64) {
                w8.k kVarD = cVar.d();
                d.a(kVarD);
                cVar.c(new b(kVarD, cVar.d()));
            } else if ((b10 & 64) == 64) {
                cVar.c(new b(cVar.b(cVar.e(i10, 63) - 1), cVar.d()));
            } else if ((b10 & 32) == 32) {
                int iE2 = cVar.e(i10, 31);
                cVar.f9389d = iE2;
                if (iE2 < 0 || iE2 > cVar.f9388c) {
                    throw new IOException("Invalid dynamic table size update " + cVar.f9389d);
                }
                int i12 = cVar.h;
                if (iE2 < i12) {
                    if (iE2 == 0) {
                        Arrays.fill(cVar.f9390e, (Object) null);
                        cVar.f = cVar.f9390e.length - 1;
                        cVar.g = 0;
                        cVar.h = 0;
                    } else {
                        cVar.a(i12 - iE2);
                    }
                }
            } else if (i10 == 16 || i10 == 0) {
                w8.k kVarD2 = cVar.d();
                d.a(kVarD2);
                arrayList.add(new b(kVarD2, cVar.d()));
            } else {
                arrayList.add(new b(cVar.b(cVar.e(i10, 15) - 1), cVar.d()));
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        return arrayList2;
    }

    public final void i(o oVar, int i, byte b7, int i6) throws IOException {
        if (i6 == 0) {
            e.c("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            throw null;
        }
        boolean z9 = (b7 & 1) != 0;
        short s6 = (b7 & 8) != 0 ? (short) (this.f9450a.readByte() & 255) : (short) 0;
        if ((b7 & 32) != 0) {
            w8.j jVar = this.f9450a;
            jVar.readInt();
            jVar.readByte();
            i -= 5;
        }
        ArrayList arrayListH = h(b(i, b7, s6), s6, b7, i6);
        q qVar = (q) oVar.f9424l;
        if (i6 != 0 && (i6 & 1) == 0) {
            try {
                qVar.f9435r.execute(new j(qVar, new Object[]{qVar.f9430m, Integer.valueOf(i6)}, i6, arrayListH, z9));
                return;
            } catch (RejectedExecutionException unused) {
                return;
            }
        }
        synchronized (qVar) {
            try {
                w wVarD = ((q) oVar.f9424l).d(i6);
                if (wVarD != null) {
                    wVarD.i(arrayListH);
                    if (z9) {
                        wVarD.h();
                        return;
                    }
                    return;
                }
                q qVar2 = (q) oVar.f9424l;
                if (qVar2.f9433p) {
                    return;
                }
                if (i6 <= qVar2.f9431n) {
                    return;
                }
                if (i6 % 2 == qVar2.f9432o % 2) {
                    return;
                }
                w wVar = new w(i6, qVar2, false, z9, arrayListH);
                q qVar3 = (q) oVar.f9424l;
                qVar3.f9431n = i6;
                qVar3.f9429l.put(Integer.valueOf(i6), wVar);
                q.D.execute(new o(oVar, new Object[]{((q) oVar.f9424l).f9430m, Integer.valueOf(i6)}, wVar));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n(o oVar, int i, byte b7, int i6) {
        if (i != 8) {
            e.c("TYPE_PING length != 8: %s", Integer.valueOf(i));
            throw null;
        }
        if (i6 != 0) {
            e.c("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        }
        int i10 = this.f9450a.readInt();
        int i11 = this.f9450a.readInt();
        boolean z9 = (b7 & 1) != 0;
        q qVar = (q) oVar.f9424l;
        if (!z9) {
            try {
                qVar.f9434q.execute(new n(qVar, true, i10, i11));
            } catch (RejectedExecutionException unused) {
            }
        } else {
            synchronized (qVar) {
                q qVar2 = (q) oVar.f9424l;
                qVar2.f9437t = false;
                qVar2.notifyAll();
            }
        }
    }

    public final void r(o oVar, int i, byte b7, int i6) throws IOException {
        if (i6 == 0) {
            e.c("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            throw null;
        }
        short s6 = (b7 & 8) != 0 ? (short) (this.f9450a.readByte() & 255) : (short) 0;
        int i10 = this.f9450a.readInt() & Integer.MAX_VALUE;
        ArrayList arrayListH = h(b(i - 4, b7, s6), s6, b7, i6);
        q qVar = (q) oVar.f9424l;
        synchronized (qVar) {
            try {
                if (qVar.C.contains(Integer.valueOf(i10))) {
                    qVar.j(i10, 2);
                    return;
                }
                qVar.C.add(Integer.valueOf(i10));
                try {
                    qVar.f9435r.execute(new j(qVar, new Object[]{qVar.f9430m, Integer.valueOf(i10)}, i10, arrayListH));
                } catch (RejectedExecutionException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s(o oVar, int i, byte b7, int i6) {
        long j;
        w[] wVarArr = null;
        if (i6 != 0) {
            e.c("TYPE_SETTINGS streamId != 0", new Object[0]);
            throw null;
        }
        if ((b7 & 1) != 0) {
            if (i == 0) {
                return;
            }
            e.c("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            throw null;
        }
        if (i % 6 != 0) {
            e.c("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
            throw null;
        }
        f8.q qVar = new f8.q(3);
        for (int i10 = 0; i10 < i; i10 += 6) {
            int i11 = this.f9450a.readShort() & 65535;
            int i12 = this.f9450a.readInt();
            if (i11 == 2) {
                if (i12 != 0 && i12 != 1) {
                    e.c("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                    throw null;
                }
            } else if (i11 == 3) {
                i11 = 4;
            } else if (i11 != 4) {
                if (i11 == 5 && (i12 < 16384 || i12 > 16777215)) {
                    e.c("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(i12));
                    throw null;
                }
            } else {
                if (i12 < 0) {
                    e.c("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                    throw null;
                }
                i11 = 7;
            }
            qVar.h(i11, i12);
        }
        synchronized (((q) oVar.f9424l)) {
            try {
                int iC = ((q) oVar.f9424l).f9440x.c();
                f8.q qVar2 = ((q) oVar.f9424l).f9440x;
                qVar2.getClass();
                for (int i13 = 0; i13 < 10; i13++) {
                    if (((1 << i13) & qVar.f4964b) != 0) {
                        qVar2.h(i13, ((int[]) qVar.f4965c)[i13]);
                    }
                }
                try {
                    q qVar3 = (q) oVar.f9424l;
                    qVar3.f9434q.execute(new o(oVar, new Object[]{qVar3.f9430m}, qVar));
                } catch (RejectedExecutionException unused) {
                }
                int iC2 = ((q) oVar.f9424l).f9440x.c();
                if (iC2 == -1 || iC2 == iC) {
                    j = 0;
                } else {
                    j = iC2 - iC;
                    q qVar4 = (q) oVar.f9424l;
                    if (!qVar4.f9441y) {
                        qVar4.v += j;
                        if (j > 0) {
                            qVar4.notifyAll();
                        }
                        ((q) oVar.f9424l).f9441y = true;
                    }
                    if (!((q) oVar.f9424l).f9429l.isEmpty()) {
                        wVarArr = (w[]) ((q) oVar.f9424l).f9429l.values().toArray(new w[((q) oVar.f9424l).f9429l.size()]);
                    }
                }
                q.D.execute(new p(oVar, ((q) oVar.f9424l).f9430m));
            } finally {
            }
        }
        if (wVarArr == null || j == 0) {
            return;
        }
        for (w wVar : wVarArr) {
            synchronized (wVar) {
                wVar.f9466b += j;
                if (j > 0) {
                    wVar.notifyAll();
                }
            }
        }
    }
}
