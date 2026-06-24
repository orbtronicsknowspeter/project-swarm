package j$.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.location.LocationRequestCompat;
import j$.time.chrono.ChronoZonedDateTime;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ZonedDateTime implements j$.time.temporal.m, ChronoZonedDateTime<h>, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDateTime f5754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f5755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ZoneId f5756c;

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ long toEpochSecond() {
        return j$.com.android.tools.r8.a.u(this);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ChronoZonedDateTime<?> chronoZonedDateTime) {
        return j$.com.android.tools.r8.a.i(this, chronoZonedDateTime);
    }

    public static ZonedDateTime now() {
        a aVarF = j$.com.android.tools.r8.a.F();
        Objects.requireNonNull(aVarF, "clock");
        return ofInstant(Instant.ofEpochMilli(System.currentTimeMillis()), aVarF.f5758a);
    }

    public static ZonedDateTime now(ZoneId zoneId) {
        a aVar;
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId == ZoneOffset.UTC) {
            aVar = a.f5757b;
        } else {
            aVar = new a(zoneId);
        }
        Objects.requireNonNull(aVar, "clock");
        aVar.getClass();
        return ofInstant(Instant.ofEpochMilli(System.currentTimeMillis()), aVar.f5758a);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.chrono.l getChronology() {
        return ((h) toLocalDate()).getChronology();
    }

    public static ZonedDateTime of(int i, int i6, int i10, int i11, int i12, int i13, int i14, ZoneId zoneId) {
        LocalDateTime localDateTime = LocalDateTime.f5740c;
        h hVarD = h.D(i, i6, i10);
        j$.time.temporal.a.HOUR_OF_DAY.k(i11);
        j$.time.temporal.a.MINUTE_OF_HOUR.k(i12);
        j$.time.temporal.a.SECOND_OF_MINUTE.k(i13);
        j$.time.temporal.a.NANO_OF_SECOND.k(i14);
        return v(new LocalDateTime(hVarD, k.w(i11, i12, i13, i14)), zoneId, null);
    }

    public static ZonedDateTime v(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        j$.time.zone.f fVarV = zoneId.v();
        List listF = fVarV.f(localDateTime);
        if (listF.size() == 1) {
            zoneOffset = (ZoneOffset) listF.get(0);
        } else if (listF.size() != 0) {
            if (zoneOffset == null || !listF.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) Objects.requireNonNull((ZoneOffset) listF.get(0), TypedValues.CycleType.S_WAVE_OFFSET);
            }
        } else {
            Object objE = fVarV.e(localDateTime);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            localDateTime = localDateTime.B(Duration.e(bVar.f5941d.f5752b - bVar.f5940c.f5752b, 0).f5735a);
            zoneOffset = bVar.f5941d;
        }
        return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    public static ZonedDateTime ofInstant(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return j(instant.f5738a, instant.f5739b, zoneId);
    }

    public static ZonedDateTime j(long j, int i, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.v().d(Instant.w(j, i));
        return new ZonedDateTime(LocalDateTime.z(j, i, zoneOffsetD), zoneId, zoneOffsetD);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final Instant toInstant() {
        return Instant.w(toEpochSecond(), toLocalTime().f5877d);
    }

    public ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.f5754a = localDateTime;
        this.f5755b = zoneOffset;
        this.f5756c = zoneId;
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
            if (qVar == j$.time.temporal.a.INSTANT_SECONDS || qVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) qVar).f5899b;
            }
            return this.f5754a.g(qVar);
        }
        return qVar.f(this);
    }

    @Override // j$.time.temporal.n
    public final int e(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i = x.f5934a[((j$.time.temporal.a) qVar).ordinal()];
            if (i == 1) {
                throw new j$.time.temporal.t("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return this.f5755b.f5752b;
            }
            return this.f5754a.e(qVar);
        }
        return j$.com.android.tools.r8.a.k(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final long q(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.g(this);
        }
        int i = x.f5934a[((j$.time.temporal.a) qVar).ordinal()];
        return i != 1 ? i != 2 ? this.f5754a.q(qVar) : this.f5755b.f5752b : j$.com.android.tools.r8.a.u(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset getOffset() {
        return this.f5755b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId getZone() {
        return this.f5756c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime m(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.f5756c.equals(zoneId) ? this : v(this.f5754a, zoneId, this.f5755b);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.chrono.e toLocalDateTime() {
        return this.f5754a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.chrono.b toLocalDate() {
        return this.f5754a.f5742a;
    }

    public int getYear() {
        return this.f5754a.f5742a.f5867a;
    }

    public int getMonthValue() {
        return this.f5754a.f5742a.f5868b;
    }

    public int getDayOfMonth() {
        return this.f5754a.f5742a.f5869c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final k toLocalTime() {
        return this.f5754a.f5743b;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m f(h hVar) {
        return v(LocalDateTime.y(hVar, this.f5754a.f5743b), this.f5756c, this.f5755b);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m a(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
            int i = x.f5934a[aVar.ordinal()];
            if (i == 1) {
                return j(j, this.f5754a.f5743b.f5877d, this.f5756c);
            }
            if (i != 2) {
                return v(this.f5754a.a(j, qVar), this.f5756c, this.f5755b);
            }
            ZoneOffset zoneOffsetC = ZoneOffset.C(aVar.f5899b.a(j, aVar));
            return (zoneOffsetC.equals(this.f5755b) || !this.f5756c.v().f(this.f5754a).contains(zoneOffsetC)) ? this : new ZonedDateTime(this.f5754a, this.f5756c, zoneOffsetC);
        }
        return (ZonedDateTime) qVar.j(this, j);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime b(long j, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return (ZonedDateTime) sVar.e(this, j);
        }
        j$.time.temporal.b bVar = (j$.time.temporal.b) sVar;
        if (bVar.compareTo(j$.time.temporal.b.DAYS) >= 0 && bVar != j$.time.temporal.b.FOREVER) {
            return v(this.f5754a.b(j, sVar), this.f5756c, this.f5755b);
        }
        LocalDateTime localDateTimeB = this.f5754a.b(j, sVar);
        ZoneOffset zoneOffset = this.f5755b;
        ZoneId zoneId = this.f5756c;
        Objects.requireNonNull(localDateTimeB, "localDateTime");
        Objects.requireNonNull(zoneOffset, TypedValues.CycleType.S_WAVE_OFFSET);
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId.v().f(localDateTimeB).contains(zoneOffset)) {
            return new ZonedDateTime(localDateTimeB, zoneId, zoneOffset);
        }
        localDateTimeB.getClass();
        return j(j$.com.android.tools.r8.a.t(localDateTimeB, zoneOffset), localDateTimeB.f5743b.f5877d, zoneId);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m n(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? b(LocationRequestCompat.PASSIVE_INTERVAL, bVar).b(1L, bVar) : b(-j, bVar);
    }

    @Override // j$.time.temporal.n
    public final Object k(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.r.f) {
            return this.f5754a.f5742a;
        }
        return j$.com.android.tools.r8.a.r(this, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZonedDateTime) {
            ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
            if (this.f5754a.equals(zonedDateTime.f5754a) && this.f5755b.equals(zonedDateTime.f5755b) && this.f5756c.equals(zonedDateTime.f5756c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f5754a.hashCode() ^ this.f5755b.f5752b) ^ Integer.rotateLeft(this.f5756c.hashCode(), 3);
    }

    public final String toString() {
        String str = this.f5754a.toString() + this.f5755b.f5753c;
        ZoneOffset zoneOffset = this.f5755b;
        ZoneId zoneId = this.f5756c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    private Object writeReplace() {
        return new s((byte) 6, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
