package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends a implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f5801c = new v();
    private static final long serialVersionUID = 459996390165777884L;

    @Override // j$.time.chrono.l
    public final String d() {
        return "Japanese";
    }

    @Override // j$.time.chrono.l
    public final String i() {
        return "japanese";
    }

    @Override // j$.time.chrono.l
    public final b o(j$.time.temporal.n nVar) {
        if (nVar instanceof x) {
            return (x) nVar;
        }
        return new x(j$.time.h.x(nVar));
    }

    private v() {
    }

    @Override // j$.time.chrono.l
    public final m l(int i) {
        return y.l(i);
    }

    public final j$.time.temporal.u f(j$.time.temporal.a aVar) {
        switch (u.f5800a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                j$.time.g.b(aVar, "Unsupported field: ");
                return null;
            case 5:
                y[] yVarArr = y.f5808e;
                int i = yVarArr[yVarArr.length - 1].f5810b.f5867a;
                int iMin = 1000000000 - yVarArr[yVarArr.length - 1].f5810b.f5867a;
                int i6 = yVarArr[0].f5810b.f5867a;
                int i10 = 1;
                while (true) {
                    y[] yVarArr2 = y.f5808e;
                    if (i10 >= yVarArr2.length) {
                        return j$.time.temporal.u.f(iMin, 999999999 - i);
                    }
                    y yVar = yVarArr2[i10];
                    iMin = Math.min(iMin, (yVar.f5810b.f5867a - i6) + 1);
                    i6 = yVar.f5810b.f5867a;
                    i10++;
                }
                break;
            case 6:
                y yVar2 = y.f5807d;
                long jMin = j$.time.temporal.a.DAY_OF_YEAR.f5899b.f5924c;
                for (y yVar3 : y.f5808e) {
                    jMin = Math.min(jMin, ((yVar3.f5810b.B() ? 366 : 365) - yVar3.f5810b.A()) + 1);
                    if (yVar3.i() != null) {
                        jMin = Math.min(jMin, yVar3.i().f5810b.A() - 1);
                    }
                }
                return j$.time.temporal.u.f(jMin, j$.time.temporal.a.DAY_OF_YEAR.f5899b.f5925d);
            case 7:
                return j$.time.temporal.u.e(x.f5803d.f5867a, 999999999L);
            case 8:
                long j = y.f5807d.f5809a;
                y[] yVarArr3 = y.f5808e;
                return j$.time.temporal.u.e(j, yVarArr3[yVarArr3.length - 1].f5809a);
            default:
                return aVar.f5899b;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new e0((byte) 1, this);
    }
}
