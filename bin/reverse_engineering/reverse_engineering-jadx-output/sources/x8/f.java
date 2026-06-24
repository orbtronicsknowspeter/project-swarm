package x8;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.l;
import p6.m;
import w8.g0;
import w8.k;
import w8.n;
import w8.o;
import w8.u;
import w8.y;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y f11557c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f11558b;

    static {
        String str = y.f11004b;
        f11557c = q1.a.j("/", false);
    }

    public f(ClassLoader classLoader) {
        this.f11558b = new m(new o9.a(classLoader, 8));
    }

    public static String i(y yVar) throws EOFException {
        y yVarD;
        y yVar2 = f11557c;
        yVar2.getClass();
        k kVar = yVar2.f11005a;
        yVar.getClass();
        y yVarB = c.b(yVar2, yVar, true);
        k kVar2 = yVarB.f11005a;
        int iA = c.a(yVarB);
        y yVar3 = iA == -1 ? null : new y(kVar2.q(0, iA));
        int iA2 = c.a(yVar2);
        if (!l.a(yVar3, iA2 != -1 ? new y(kVar.q(0, iA2)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + yVarB + " and " + yVar2).toString());
        }
        ArrayList arrayListA = yVarB.a();
        ArrayList arrayListA2 = yVar2.a();
        int iMin = Math.min(arrayListA.size(), arrayListA2.size());
        int i = 0;
        while (i < iMin && l.a(arrayListA.get(i), arrayListA2.get(i))) {
            i++;
        }
        if (i == iMin && kVar2.f() == kVar.f()) {
            String str = y.f11004b;
            yVarD = q1.a.j(".", false);
        } else {
            if (arrayListA2.subList(i, arrayListA2.size()).indexOf(c.f11551e) != -1) {
                throw new IllegalArgumentException(("Impossible relative path to resolve: " + yVarB + " and " + yVar2).toString());
            }
            w8.h hVar = new w8.h();
            k kVarC = c.c(yVar2);
            if (kVarC == null && (kVarC = c.c(yVarB)) == null) {
                kVarC = c.f(y.f11004b);
            }
            int size = arrayListA2.size();
            for (int i6 = i; i6 < size; i6++) {
                hVar.y(c.f11551e);
                hVar.y(kVarC);
            }
            int size2 = arrayListA.size();
            while (i < size2) {
                hVar.y((k) arrayListA.get(i));
                hVar.y(kVarC);
                i++;
            }
            yVarD = c.d(hVar, false);
        }
        return yVarD.f11005a.t();
    }

    @Override // w8.o
    public final void a(y yVar, y yVar2) throws IOException {
        yVar2.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // w8.o
    public final void b(y yVar) throws IOException {
        throw new IOException(this + " is read-only");
    }

    @Override // w8.o
    public final void c(y yVar) throws IOException {
        throw new IOException(this + " is read-only");
    }

    @Override // w8.o
    public final n e(y yVar) throws EOFException {
        yVar.getClass();
        if (!q1.a.f(yVar)) {
            return null;
        }
        String strI = i(yVar);
        for (p6.i iVar : (List) this.f11558b.getValue()) {
            n nVarE = ((o) iVar.f8441a).e(((y) iVar.f8442b).d(strI));
            if (nVarE != null) {
                return nVarE;
            }
        }
        return null;
    }

    @Override // w8.o
    public final u f(y yVar) throws EOFException, FileNotFoundException {
        if (!q1.a.f(yVar)) {
            s1.o.p(yVar, "file not found: ");
            return null;
        }
        String strI = i(yVar);
        for (p6.i iVar : (List) this.f11558b.getValue()) {
            try {
                return ((o) iVar.f8441a).f(((y) iVar.f8442b).d(strI));
            } catch (FileNotFoundException unused) {
            }
        }
        s1.o.p(yVar, "file not found: ");
        return null;
    }

    @Override // w8.o
    public final u g(y yVar) throws IOException {
        throw new IOException("resources are not writable");
    }

    @Override // w8.o
    public final g0 h(y yVar) throws EOFException, FileNotFoundException {
        yVar.getClass();
        if (!q1.a.f(yVar)) {
            s1.o.p(yVar, "file not found: ");
            return null;
        }
        String strI = i(yVar);
        for (p6.i iVar : (List) this.f11558b.getValue()) {
            try {
                return ((o) iVar.f8441a).h(((y) iVar.f8442b).d(strI));
            } catch (FileNotFoundException unused) {
            }
        }
        s1.o.p(yVar, "file not found: ");
        return null;
    }
}
