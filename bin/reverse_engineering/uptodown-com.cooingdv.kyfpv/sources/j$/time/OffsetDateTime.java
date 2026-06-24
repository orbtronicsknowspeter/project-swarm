package j$.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.location.LocationRequestCompat;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class OffsetDateTime implements j$.time.temporal.m, j$.time.temporal.o, Comparable<OffsetDateTime>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f5744c = 0;
    private static final long serialVersionUID = 2287754244819255394L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDateTime f5745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f5746b;

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int iCompare;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        if (this.f5746b.equals(offsetDateTime2.f5746b)) {
            iCompare = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            LocalDateTime localDateTime = this.f5745a;
            ZoneOffset zoneOffset = this.f5746b;
            localDateTime.getClass();
            long jT = j$.com.android.tools.r8.a.t(localDateTime, zoneOffset);
            LocalDateTime localDateTime2 = offsetDateTime2.f5745a;
            ZoneOffset zoneOffset2 = offsetDateTime2.f5746b;
            localDateTime2.getClass();
            iCompare = Long.compare(jT, j$.com.android.tools.r8.a.t(localDateTime2, zoneOffset2));
            if (iCompare == 0) {
                iCompare = this.f5745a.f5743b.f5877d - offsetDateTime2.f5745a.f5743b.f5877d;
            }
        }
        return iCompare == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : iCompare;
    }

    static {
        LocalDateTime localDateTime = LocalDateTime.f5740c;
        ZoneOffset zoneOffset = ZoneOffset.g;
        localDateTime.getClass();
        new OffsetDateTime(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.f5741d;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        localDateTime2.getClass();
        new OffsetDateTime(localDateTime2, zoneOffset2);
    }

    public static OffsetDateTime v(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        ZoneOffset zoneOffsetD = zoneId.v().d(instant);
        return new OffsetDateTime(LocalDateTime.z(instant.f5738a, instant.f5739b, zoneOffsetD), zoneOffsetD);
    }

    public OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        this.f5745a = (LocalDateTime) Objects.requireNonNull(localDateTime, "dateTime");
        this.f5746b = (ZoneOffset) Objects.requireNonNull(zoneOffset, TypedValues.CycleType.S_WAVE_OFFSET);
    }

    public final OffsetDateTime x(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.f5745a == localDateTime && this.f5746b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
    }

    @Override // j$.time.temporal.n
    public final boolean c(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return true;
        }
        return qVar != null && qVar.e(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u g(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar != j$.time.temporal.a.INSTANT_SECONDS && qVar != j$.time.temporal.a.OFFSET_SECONDS) {
                return this.f5745a.g(qVar);
            }
            return ((j$.time.temporal.a) qVar).f5899b;
        }
        return qVar.f(this);
    }

    @Override // j$.time.temporal.n
    public final int e(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i = p.f5885a[((j$.time.temporal.a) qVar).ordinal()];
            if (i == 1) {
                throw new j$.time.temporal.t("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return this.f5746b.f5752b;
            }
            return this.f5745a.e(qVar);
        }
        return j$.time.temporal.r.a(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final long q(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.g(this);
        }
        int i = p.f5885a[((j$.time.temporal.a) qVar).ordinal()];
        if (i != 1) {
            return i != 2 ? this.f5745a.q(qVar) : this.f5746b.f5752b;
        }
        LocalDateTime localDateTime = this.f5745a;
        ZoneOffset zoneOffset = this.f5746b;
        localDateTime.getClass();
        return j$.com.android.tools.r8.a.t(localDateTime, zoneOffset);
    }

    public LocalDateTime toLocalDateTime() {
        return this.f5745a;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m f(h hVar) {
        LocalDateTime localDateTime = this.f5745a;
        return x(localDateTime.E(hVar, localDateTime.f5743b), this.f5746b);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m a(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
            int i = p.f5885a[aVar.ordinal()];
            LocalDateTime localDateTime = this.f5745a;
            if (i == 1) {
                return v(Instant.w(j, localDateTime.f5743b.f5877d), this.f5746b);
            }
            if (i == 2) {
                return x(localDateTime, ZoneOffset.C(aVar.f5899b.a(j, aVar)));
            }
            return x(localDateTime.a(j, qVar), this.f5746b);
        }
        return (OffsetDateTime) qVar.j(this, j);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime b(long j, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.b) {
            return x(this.f5745a.b(j, sVar), this.f5746b);
        }
        return (OffsetDateTime) sVar.e(this, j);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m n(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? b(LocationRequestCompat.PASSIVE_INTERVAL, bVar).b(1L, bVar) : b(-j, bVar);
    }

    @Override // j$.time.temporal.n
    public final Object k(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.r.f5920d || aVar == j$.time.temporal.r.f5921e) {
            return this.f5746b;
        }
        if (aVar == j$.time.temporal.r.f5917a) {
            return null;
        }
        if (aVar == j$.time.temporal.r.f) {
            return this.f5745a.f5742a;
        }
        if (aVar == j$.time.temporal.r.g) {
            return this.f5745a.f5743b;
        }
        if (aVar == j$.time.temporal.r.f5918b) {
            return j$.time.chrono.s.f5798c;
        }
        if (aVar == j$.time.temporal.r.f5919c) {
            return j$.time.temporal.b.NANOS;
        }
        return aVar.a(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m j(j$.time.temporal.m mVar) {
        return mVar.a(this.f5745a.f5742a.r(), j$.time.temporal.a.EPOCH_DAY).a(this.f5745a.f5743b.G(), j$.time.temporal.a.NANO_OF_DAY).a(this.f5746b.f5752b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            if (this.f5745a.equals(offsetDateTime.f5745a) && this.f5746b.equals(offsetDateTime.f5746b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5745a.hashCode() ^ this.f5746b.f5752b;
    }

    public final String toString() {
        return this.f5745a.toString() + this.f5746b.f5753c;
    }

    private Object writeReplace() {
        return new s((byte) 10, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
