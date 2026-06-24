package x8;

import d7.p;
import g4.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.x;
import l7.m;
import q6.a0;
import q6.l;
import w8.d0;
import w8.n;
import w8.y;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f11546a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(char c9) {
        if ('0' <= c9 && c9 < ':') {
            return c9 - '0';
        }
        if ('a' <= c9 && c9 < 'g') {
            return c9 - 'W';
        }
        if ('A' <= c9 && c9 < 'G') {
            return c9 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c9);
    }

    public static final LinkedHashMap b(ArrayList arrayList) {
        String str = y.f11004b;
        y yVarJ = q1.a.j("/", false);
        p6.i[] iVarArr = {new p6.i(yVarJ, new g(yVarJ))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(a0.h0(1));
        a0.j0(linkedHashMap, iVarArr);
        for (g gVar : l.C0(arrayList, new z(15))) {
            if (((g) linkedHashMap.put(gVar.f11559a, gVar)) == null) {
                while (true) {
                    y yVar = gVar.f11559a;
                    y yVarC = yVar.c();
                    if (yVarC != null) {
                        g gVar2 = (g) linkedHashMap.get(yVarC);
                        if (gVar2 != null) {
                            gVar2.h.add(yVar);
                            break;
                        }
                        g gVar3 = new g(yVarC);
                        linkedHashMap.put(yVarC, gVar3);
                        gVar3.h.add(yVar);
                        gVar = gVar3;
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static final String c(int i) {
        d0.b.v(16);
        String string = Integer.toString(i, 16);
        string.getClass();
        return "0x".concat(string);
    }

    public static final g d(w8.a0 a0Var) throws IOException {
        Long lValueOf;
        int iF = a0Var.f();
        if (iF != 33639248) {
            throw new IOException("bad zip: expected " + c(33639248) + " but was " + c(iF));
        }
        a0Var.skip(4L);
        short sI = a0Var.i();
        int i = sI & 65535;
        if ((sI & 1) != 0) {
            com.google.gson.internal.a.n("unsupported zip: general purpose bit flag=".concat(c(i)));
            return null;
        }
        int i6 = a0Var.i() & 65535;
        short sI2 = a0Var.i();
        int i10 = sI2 & 65535;
        short sI3 = a0Var.i();
        int i11 = sI3 & 65535;
        if (i10 == -1) {
            lValueOf = null;
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.set(14, 0);
            gregorianCalendar.set(((i11 >> 9) & 127) + 1980, ((i11 >> 5) & 15) - 1, sI3 & 31, (i10 >> 11) & 31, (i10 >> 5) & 63, (sI2 & 31) << 1);
            lValueOf = Long.valueOf(gregorianCalendar.getTime().getTime());
        }
        a0Var.f();
        w wVar = new w();
        wVar.f7023a = ((long) a0Var.f()) & 4294967295L;
        w wVar2 = new w();
        wVar2.f7023a = ((long) a0Var.f()) & 4294967295L;
        int i12 = a0Var.i() & 65535;
        int i13 = a0Var.i() & 65535;
        int i14 = a0Var.i() & 65535;
        a0Var.skip(8L);
        w wVar3 = new w();
        wVar3.f7023a = ((long) a0Var.f()) & 4294967295L;
        String strJ = a0Var.j(i12);
        if (m.r0(strJ, (char) 0)) {
            com.google.gson.internal.a.n("bad zip: filename contains 0x00");
            return null;
        }
        long j = wVar2.f7023a == 4294967295L ? 8 : 0L;
        if (wVar.f7023a == 4294967295L) {
            j += (long) 8;
        }
        if (wVar3.f7023a == 4294967295L) {
            j += (long) 8;
        }
        u uVar = new u();
        e(a0Var, i13, new h(uVar, j, wVar2, a0Var, wVar, wVar3));
        if (j > 0 && !uVar.f7021a) {
            com.google.gson.internal.a.n("bad zip: zip64 extra required but absent");
            return null;
        }
        String strJ2 = a0Var.j(i14);
        String str = y.f11004b;
        return new g(q1.a.j("/", false).d(strJ), l7.u.k0(strJ, "/", false), strJ2, wVar.f7023a, wVar2.f7023a, i6, lValueOf, wVar3.f7023a);
    }

    public static final void e(w8.a0 a0Var, int i, p pVar) throws IOException {
        w8.h hVar = a0Var.f10934b;
        long j = i;
        while (j != 0) {
            if (j < 4) {
                com.google.gson.internal.a.n("bad zip: truncated header in extra field");
                return;
            }
            int i6 = a0Var.i() & 65535;
            long jI = ((long) a0Var.i()) & 65535;
            long j6 = j - ((long) 4);
            if (j6 < jI) {
                com.google.gson.internal.a.n("bad zip: truncated value in extra field");
                return;
            }
            a0Var.t(jI);
            long j10 = hVar.f10961b;
            pVar.invoke(Integer.valueOf(i6), Long.valueOf(jI));
            long j11 = (hVar.f10961b + jI) - j10;
            if (j11 < 0) {
                com.google.gson.internal.a.n(androidx.lifecycle.l.u(i6, "unsupported zip: too many bytes processed for "));
                return;
            } else {
                if (j11 > 0) {
                    hVar.skip(j11);
                }
                j = j6 - jI;
            }
        }
    }

    public static final n f(w8.a0 a0Var, n nVar) throws IOException {
        x xVar = new x();
        xVar.f7024a = nVar != null ? nVar.f10984e : null;
        x xVar2 = new x();
        x xVar3 = new x();
        int iF = a0Var.f();
        if (iF != 67324752) {
            throw new IOException("bad zip: expected " + c(67324752) + " but was " + c(iF));
        }
        a0Var.skip(2L);
        short sI = a0Var.i();
        int i = sI & 65535;
        if ((sI & 1) != 0) {
            com.google.gson.internal.a.n("unsupported zip: general purpose bit flag=".concat(c(i)));
            return null;
        }
        a0Var.skip(18L);
        long jI = ((long) a0Var.i()) & 65535;
        int i6 = a0Var.i() & 65535;
        a0Var.skip(jI);
        if (nVar == null) {
            a0Var.skip(i6);
            return null;
        }
        e(a0Var, i6, new i(a0Var, xVar, xVar2, xVar3));
        return new n(nVar.f10980a, nVar.f10981b, nVar.f10982c, (Long) xVar3.f7024a, (Long) xVar.f7024a, (Long) xVar2.f7024a);
    }

    public static final int g(d0 d0Var, int i) {
        int i6;
        int[] iArr = d0Var.f10954o;
        int i10 = i + 1;
        int length = d0Var.f10953n.length;
        iArr.getClass();
        int i11 = length - 1;
        int i12 = 0;
        while (true) {
            if (i12 <= i11) {
                i6 = (i12 + i11) >>> 1;
                int i13 = iArr[i6];
                if (i13 >= i10) {
                    if (i13 <= i10) {
                        break;
                    }
                    i11 = i6 - 1;
                } else {
                    i12 = i6 + 1;
                }
            } else {
                i6 = (-i12) - 1;
                break;
            }
        }
        return i6 >= 0 ? i6 : ~i6;
    }
}
