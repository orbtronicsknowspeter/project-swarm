package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends a implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0 f5761c = new a0();
    private static final long serialVersionUID = 1039765215346859963L;

    @Override // j$.time.chrono.l
    public final String d() {
        return "Minguo";
    }

    @Override // j$.time.chrono.l
    public final m l(int i) {
        if (i == 0) {
            return d0.BEFORE_ROC;
        }
        if (i == 1) {
            return d0.ROC;
        }
        j$.time.g.d("Invalid era: ", i);
        return null;
    }

    @Override // j$.time.chrono.l
    public final String i() {
        return "roc";
    }

    @Override // j$.time.chrono.l
    public final b o(j$.time.temporal.n nVar) {
        if (nVar instanceof c0) {
            return (c0) nVar;
        }
        return new c0(j$.time.h.x(nVar));
    }

    public final j$.time.temporal.u f(j$.time.temporal.a aVar) {
        int i = z.f5812a[aVar.ordinal()];
        if (i == 1) {
            j$.time.temporal.u uVar = j$.time.temporal.a.PROLEPTIC_MONTH.f5899b;
            return j$.time.temporal.u.e(uVar.f5922a - 22932, uVar.f5925d - 22932);
        }
        if (i == 2) {
            j$.time.temporal.u uVar2 = j$.time.temporal.a.YEAR.f5899b;
            return j$.time.temporal.u.f(uVar2.f5925d - 1911, (-uVar2.f5922a) + 1912);
        }
        if (i != 3) {
            return aVar.f5899b;
        }
        j$.time.temporal.u uVar3 = j$.time.temporal.a.YEAR.f5899b;
        return j$.time.temporal.u.e(uVar3.f5922a - 1911, uVar3.f5925d - 1911);
    }

    private a0() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new e0((byte) 1, this);
    }
}
