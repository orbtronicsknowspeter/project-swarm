package w8;

import java.io.File;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class y implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f11004b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f11005a;

    static {
        String str = File.separator;
        str.getClass();
        f11004b = str;
    }

    public y(k kVar) {
        kVar.getClass();
        this.f11005a = kVar;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int iA = x8.c.a(this);
        k kVar = this.f11005a;
        if (iA == -1) {
            iA = 0;
        } else if (iA < kVar.f() && kVar.k(iA) == 92) {
            iA++;
        }
        int iF = kVar.f();
        int i = iA;
        while (iA < iF) {
            if (kVar.k(iA) == 47 || kVar.k(iA) == 92) {
                arrayList.add(kVar.q(i, iA));
                i = iA + 1;
            }
            iA++;
        }
        if (i < kVar.f()) {
            arrayList.add(kVar.q(i, kVar.f()));
        }
        return arrayList;
    }

    public final String b() {
        k kVar = x8.c.f11547a;
        k kVarR = this.f11005a;
        int iM = k.m(kVarR, kVar);
        if (iM == -1) {
            iM = k.m(kVarR, x8.c.f11548b);
        }
        if (iM != -1) {
            kVarR = k.r(kVarR, iM + 1, 0, 2);
        } else if (e() != null && kVarR.f() == 2) {
            kVarR = k.f10970m;
        }
        return kVarR.t();
    }

    public final y c() {
        k kVar = x8.c.f11550d;
        k kVar2 = this.f11005a;
        if (kotlin.jvm.internal.l.a(kVar2, kVar)) {
            return null;
        }
        k kVar3 = x8.c.f11547a;
        if (kotlin.jvm.internal.l.a(kVar2, kVar3)) {
            return null;
        }
        k kVar4 = x8.c.f11548b;
        if (kotlin.jvm.internal.l.a(kVar2, kVar4)) {
            return null;
        }
        k kVar5 = x8.c.f11551e;
        kVar2.getClass();
        kVar5.getClass();
        int iF = kVar2.f();
        byte[] bArr = kVar5.f10971a;
        if (kVar2.o(iF - bArr.length, kVar5, bArr.length) && (kVar2.f() == 2 || kVar2.o(kVar2.f() - 3, kVar3, 1) || kVar2.o(kVar2.f() - 3, kVar4, 1))) {
            return null;
        }
        int iM = k.m(kVar2, kVar3);
        if (iM == -1) {
            iM = k.m(kVar2, kVar4);
        }
        if (iM == 2 && e() != null) {
            if (kVar2.f() == 3) {
                return null;
            }
            return new y(k.r(kVar2, 0, 3, 1));
        }
        if (iM == 1) {
            kVar4.getClass();
            if (kVar2.o(0, kVar4, kVar4.f())) {
                return null;
            }
        }
        if (iM != -1 || e() == null) {
            return iM == -1 ? new y(kVar) : iM == 0 ? new y(k.r(kVar2, 0, 1, 1)) : new y(k.r(kVar2, 0, iM, 1));
        }
        if (kVar2.f() == 2) {
            return null;
        }
        return new y(k.r(kVar2, 0, 2, 1));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        y yVar = (y) obj;
        yVar.getClass();
        return this.f11005a.compareTo(yVar.f11005a);
    }

    public final y d(String str) {
        str.getClass();
        h hVar = new h();
        hVar.G(str);
        return x8.c.b(this, x8.c.d(hVar, false), false);
    }

    public final Character e() {
        k kVar = x8.c.f11547a;
        k kVar2 = this.f11005a;
        if (k.i(kVar2, kVar) != -1 || kVar2.f() < 2 || kVar2.k(1) != 58) {
            return null;
        }
        char cK = (char) kVar2.k(0);
        if (('a' > cK || cK >= '{') && ('A' > cK || cK >= '[')) {
            return null;
        }
        return Character.valueOf(cK);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof y) && kotlin.jvm.internal.l.a(((y) obj).f11005a, this.f11005a);
    }

    public final int hashCode() {
        return this.f11005a.hashCode();
    }

    public final File toFile() {
        return new File(this.f11005a.t());
    }

    public final String toString() {
        return this.f11005a.t();
    }
}
