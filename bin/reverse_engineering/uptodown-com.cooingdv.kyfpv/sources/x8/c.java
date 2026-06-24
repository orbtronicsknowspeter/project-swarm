package x8;

import a4.x;
import androidx.lifecycle.l;
import com.google.android.gms.internal.measurement.z3;
import w8.k;
import w8.y;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f11548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f11549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f11550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f11551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f11552e;

    static {
        k kVar = k.f10971m;
        f11548a = z3.m("/");
        f11549b = z3.m("\\");
        f11550c = z3.m("/\\");
        f11551d = z3.m(".");
        f11552e = z3.m("..");
    }

    public static final int a(y yVar) {
        k kVar = yVar.f11006a;
        if (kVar.f() != 0) {
            if (kVar.k(0) != 47) {
                if (kVar.k(0) == 92) {
                    if (kVar.f() > 2 && kVar.k(1) == 92) {
                        k kVar2 = f11549b;
                        kVar2.getClass();
                        int iH = kVar.h(2, kVar2.j());
                        return iH == -1 ? kVar.f() : iH;
                    }
                } else if (kVar.f() > 2 && kVar.k(1) == 58 && kVar.k(2) == 92) {
                    char cK = (char) kVar.k(0);
                    if ('a' <= cK && cK < '{') {
                        return 3;
                    }
                    if ('A' <= cK && cK < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public static final y b(y yVar, y yVar2, boolean z9) {
        yVar2.getClass();
        if (a(yVar2) != -1 || yVar2.e() != null) {
            return yVar2;
        }
        k kVarC = c(yVar);
        if (kVarC == null && (kVarC = c(yVar2)) == null) {
            kVarC = f(y.f11005b);
        }
        w8.h hVar = new w8.h();
        hVar.y(yVar.f11006a);
        if (hVar.f10962b > 0) {
            hVar.y(kVarC);
        }
        hVar.y(yVar2.f11006a);
        return d(hVar, z9);
    }

    public static final k c(y yVar) {
        k kVar = yVar.f11006a;
        k kVar2 = f11548a;
        if (k.i(kVar, kVar2) != -1) {
            return kVar2;
        }
        k kVar3 = yVar.f11006a;
        k kVar4 = f11549b;
        if (k.i(kVar3, kVar4) != -1) {
            return kVar4;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011c A[EDGE_INSN: B:101:0x011c->B:84:0x011c BREAK  A[LOOP:1: B:53:0x00ab->B:116:0x00ab], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final w8.y d(w8.h r17, boolean r18) throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.c.d(w8.h, boolean):w8.y");
    }

    public static final k e(byte b7) {
        if (b7 == 47) {
            return f11548a;
        }
        if (b7 == 92) {
            return f11549b;
        }
        com.google.gson.internal.a.p(l.u(b7, "not a directory separator: "));
        return null;
    }

    public static final k f(String str) {
        if (kotlin.jvm.internal.l.a(str, "/")) {
            return f11548a;
        }
        if (kotlin.jvm.internal.l.a(str, "\\")) {
            return f11549b;
        }
        com.google.gson.internal.a.p(x.j("not a directory separator: ", str));
        return null;
    }
}
