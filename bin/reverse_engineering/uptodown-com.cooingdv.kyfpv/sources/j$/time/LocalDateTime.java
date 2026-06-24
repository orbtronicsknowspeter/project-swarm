package j$.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.location.LocationRequestCompat;
import androidx.exifinterface.media.ExifInterface;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.format.DateTimeFormatter;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class LocalDateTime implements j$.time.temporal.m, j$.time.temporal.o, j$.time.chrono.e, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LocalDateTime f5740c = y(h.f5865d, k.f5873e);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LocalDateTime f5741d = y(h.f5866e, k.f);
    private static final long serialVersionUID = 6207766400415563566L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f5742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f5743b;

    @Override // j$.time.chrono.e
    public final j$.time.chrono.l getChronology() {
        return ((h) toLocalDate()).getChronology();
    }

    @Override // j$.time.chrono.e
    public final ChronoZonedDateTime h(ZoneOffset zoneOffset) {
        return ZonedDateTime.v(this, zoneOffset, null);
    }

    public static LocalDateTime y(h hVar, k kVar) {
        Objects.requireNonNull(hVar, "date");
        Objects.requireNonNull(kVar, "time");
        return new LocalDateTime(hVar, kVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m j(j$.time.temporal.m mVar) {
        return mVar.a(((h) toLocalDate()).r(), j$.time.temporal.a.EPOCH_DAY).a(toLocalTime().G(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public static LocalDateTime z(long j, int i, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, TypedValues.CycleType.S_WAVE_OFFSET);
        long j6 = i;
        j$.time.temporal.a.NANO_OF_SECOND.k(j6);
        long j10 = j + ((long) zoneOffset.f5752b);
        long j11 = 86400;
        return new LocalDateTime(h.E(j$.com.android.tools.r8.a.B(j10, j11)), k.z((((long) ((int) j$.com.android.tools.r8.a.A(j10, j11))) * 1000000000) + j6));
    }

    public static LocalDateTime w(j$.time.temporal.n nVar) {
        if (nVar instanceof LocalDateTime) {
            return (LocalDateTime) nVar;
        }
        if (!(nVar instanceof ZonedDateTime)) {
            if (nVar instanceof OffsetDateTime) {
                return ((OffsetDateTime) nVar).toLocalDateTime();
            }
            try {
                return new LocalDateTime(h.x(nVar), k.x(nVar));
            } catch (b e10) {
                throw new b("Unable to obtain LocalDateTime from TemporalAccessor: " + nVar + " of type " + nVar.getClass().getName(), e10);
            }
        }
        return ((ZonedDateTime) nVar).f5754a;
    }

    public LocalDateTime(h hVar, k kVar) {
        this.f5742a = hVar;
        this.f5743b = kVar;
    }

    public final LocalDateTime E(h hVar, k kVar) {
        return (this.f5742a == hVar && this.f5743b == kVar) ? this : new LocalDateTime(hVar, kVar);
    }

    @Override // j$.time.temporal.n
    public final boolean c(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar != null && qVar.e(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        return aVar.isDateBased() || aVar.n();
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u g(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a) qVar).n()) {
                k kVar = this.f5743b;
                kVar.getClass();
                return j$.time.temporal.r.d(kVar, qVar);
            }
            return this.f5742a.g(qVar);
        }
        return qVar.f(this);
    }

    @Override // j$.time.temporal.n
    public final int e(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).n() ? this.f5743b.e(qVar) : this.f5742a.e(qVar);
        }
        return j$.time.temporal.r.a(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final long q(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).n() ? this.f5743b.q(qVar) : this.f5742a.q(qVar);
        }
        return qVar.g(this);
    }

    @Override // j$.time.chrono.e
    public final j$.time.chrono.b toLocalDate() {
        return this.f5742a;
    }

    @Override // j$.time.chrono.e
    public final k toLocalTime() {
        return this.f5743b;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m f(h hVar) {
        return E(hVar, this.f5743b);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime a(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            boolean zN = ((j$.time.temporal.a) qVar).n();
            h hVar = this.f5742a;
            if (zN) {
                return E(hVar, this.f5743b.a(j, qVar));
            }
            return E(hVar.a(j, qVar), this.f5743b);
        }
        return (LocalDateTime) qVar.j(this, j);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime b(long j, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return (LocalDateTime) sVar.e(this, j);
        }
        switch (i.f5870a[((j$.time.temporal.b) sVar).ordinal()]) {
            case 1:
                return C(this.f5742a, 0L, 0L, 0L, j);
            case 2:
                LocalDateTime localDateTimeE = E(this.f5742a.G(j / 86400000000L), this.f5743b);
                return localDateTimeE.C(localDateTimeE.f5742a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                LocalDateTime localDateTimeE2 = E(this.f5742a.G(j / 86400000), this.f5743b);
                return localDateTimeE2.C(localDateTimeE2.f5742a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return B(j);
            case 5:
                return C(this.f5742a, 0L, j, 0L, 0L);
            case 6:
                return C(this.f5742a, j, 0L, 0L, 0L);
            case 7:
                LocalDateTime localDateTimeE3 = E(this.f5742a.G(j / 256), this.f5743b);
                return localDateTimeE3.C(localDateTimeE3.f5742a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return E(this.f5742a.b(j, sVar), this.f5743b);
        }
    }

    public final LocalDateTime B(long j) {
        return C(this.f5742a, 0L, 0L, j, 0L);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m n(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? b(LocationRequestCompat.PASSIVE_INTERVAL, bVar).b(1L, bVar) : b(-j, bVar);
    }

    public final LocalDateTime C(h hVar, long j, long j6, long j10, long j11) {
        long j12 = j | j6 | j10 | j11;
        k kVar = this.f5743b;
        if (j12 == 0) {
            return E(hVar, kVar);
        }
        long j13 = 1;
        long jG = kVar.G();
        long j14 = ((((j % 24) * 3600000000000L) + ((j6 % 1440) * 60000000000L) + ((j10 % 86400) * 1000000000) + (j11 % 86400000000000L)) * j13) + jG;
        long jB = j$.com.android.tools.r8.a.B(j14, 86400000000000L) + (((j / 24) + (j6 / 1440) + (j10 / 86400) + (j11 / 86400000000000L)) * j13);
        long jA = j$.com.android.tools.r8.a.A(j14, 86400000000000L);
        return E(hVar.G(jB), jA == jG ? this.f5743b : k.z(jA));
    }

    @Override // j$.time.temporal.n
    public final Object k(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.r.f) {
            return this.f5742a;
        }
        return j$.com.android.tools.r8.a.q(this, aVar);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.a(this);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.time.chrono.e eVar) {
        if (eVar instanceof LocalDateTime) {
            return v((LocalDateTime) eVar);
        }
        return j$.com.android.tools.r8.a.h(this, eVar);
    }

    public final int v(LocalDateTime localDateTime) {
        int iV = this.f5742a.v(localDateTime.f5742a);
        return iV == 0 ? this.f5743b.compareTo(localDateTime.f5743b) : iV;
    }

    public final boolean x(j$.time.chrono.e eVar) {
        if (eVar instanceof LocalDateTime) {
            return v((LocalDateTime) eVar) < 0;
        }
        long jR = this.f5742a.r();
        long jR2 = eVar.toLocalDate().r();
        if (jR >= jR2) {
            return jR == jR2 && this.f5743b.G() < eVar.toLocalTime().G();
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.f5742a.equals(localDateTime.f5742a) && this.f5743b.equals(localDateTime.f5743b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5742a.hashCode() ^ this.f5743b.hashCode();
    }

    public final String toString() {
        return this.f5742a.toString() + ExifInterface.GPS_DIRECTION_TRUE + this.f5743b.toString();
    }

    private Object writeReplace() {
        return new s((byte) 5, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
