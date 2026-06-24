package j$.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.location.LocationRequestCompat;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements j$.time.temporal.m, j$.time.temporal.o, Comparable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f5886c = 0;
    private static final long serialVersionUID = 7264499704384272492L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f5887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f5888b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        q qVar = (q) obj;
        boolean zEquals = this.f5888b.equals(qVar.f5888b);
        k kVar = this.f5887a;
        if (zEquals) {
            return kVar.compareTo(qVar.f5887a);
        }
        int iCompare = Long.compare(kVar.G() - (((long) this.f5888b.f5752b) * 1000000000), qVar.f5887a.G() - (((long) qVar.f5888b.f5752b) * 1000000000));
        return iCompare == 0 ? this.f5887a.compareTo(qVar.f5887a) : iCompare;
    }

    static {
        k kVar = k.f5873e;
        ZoneOffset zoneOffset = ZoneOffset.g;
        kVar.getClass();
        new q(kVar, zoneOffset);
        k kVar2 = k.f;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        kVar2.getClass();
        new q(kVar2, zoneOffset2);
    }

    public q(k kVar, ZoneOffset zoneOffset) {
        this.f5887a = (k) Objects.requireNonNull(kVar, "time");
        this.f5888b = (ZoneOffset) Objects.requireNonNull(zoneOffset, TypedValues.CycleType.S_WAVE_OFFSET);
    }

    public final q w(k kVar, ZoneOffset zoneOffset) {
        return (this.f5887a == kVar && this.f5888b.equals(zoneOffset)) ? this : new q(kVar, zoneOffset);
    }

    @Override // j$.time.temporal.n
    public final boolean c(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) qVar).n() || qVar == j$.time.temporal.a.OFFSET_SECONDS : qVar != null && qVar.e(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u g(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar != j$.time.temporal.a.OFFSET_SECONDS) {
                k kVar = this.f5887a;
                kVar.getClass();
                return j$.time.temporal.r.d(kVar, qVar);
            }
            return ((j$.time.temporal.a) qVar).f5899b;
        }
        return qVar.f(this);
    }

    @Override // j$.time.temporal.n
    public final int e(j$.time.temporal.q qVar) {
        return j$.time.temporal.r.a(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final long q(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return this.f5888b.f5752b;
            }
            return this.f5887a.q(qVar);
        }
        return qVar.g(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m a(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
            k kVar = this.f5887a;
            if (qVar == aVar) {
                j$.time.temporal.a aVar2 = (j$.time.temporal.a) qVar;
                return w(kVar, ZoneOffset.C(aVar2.f5899b.a(j, aVar2)));
            }
            return w(kVar.a(j, qVar), this.f5888b);
        }
        return (q) qVar.j(this, j);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final q b(long j, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.b) {
            return w(this.f5887a.b(j, sVar), this.f5888b);
        }
        return (q) sVar.e(this, j);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m n(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? b(LocationRequestCompat.PASSIVE_INTERVAL, bVar).b(1L, bVar) : b(-j, bVar);
    }

    @Override // j$.time.temporal.n
    public final Object k(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.r.f5920d || aVar == j$.time.temporal.r.f5921e) {
            return this.f5888b;
        }
        if (((aVar == j$.time.temporal.r.f5917a) || (aVar == j$.time.temporal.r.f5918b)) || aVar == j$.time.temporal.r.f) {
            return null;
        }
        if (aVar == j$.time.temporal.r.g) {
            return this.f5887a;
        }
        if (aVar == j$.time.temporal.r.f5919c) {
            return j$.time.temporal.b.NANOS;
        }
        return aVar.a(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m j(j$.time.temporal.m mVar) {
        return mVar.a(this.f5887a.G(), j$.time.temporal.a.NANO_OF_DAY).a(this.f5888b.f5752b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f5887a.equals(qVar.f5887a) && this.f5888b.equals(qVar.f5888b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5887a.hashCode() ^ this.f5888b.f5752b;
    }

    public final String toString() {
        return this.f5887a.toString() + this.f5888b.f5753c;
    }

    private Object writeReplace() {
        return new s((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m f(h hVar) {
        return (q) j$.com.android.tools.r8.a.a(hVar, this);
    }
}
