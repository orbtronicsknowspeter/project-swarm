package j$.time.zone;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.s;
import j$.time.k;
import j$.time.m;
import j$.time.temporal.o;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements Serializable {
    public static final long[] i = new long[0];
    public static final e[] j = new e[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final LocalDateTime[] f5949k = new LocalDateTime[0];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b[] f5950l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f5951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset[] f5952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f5953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LocalDateTime[] f5954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ZoneOffset[] f5955e;
    public final e[] f;
    public final TimeZone g;
    public final transient ConcurrentHashMap h = new ConcurrentHashMap();

    public static Object a(LocalDateTime localDateTime, b bVar) {
        LocalDateTime localDateTime2 = bVar.f5939b;
        if (bVar.e()) {
            if (localDateTime.x(localDateTime2)) {
                return bVar.f5940c;
            }
            if (!localDateTime.x(bVar.f5939b.B(bVar.f5941d.f5752b - bVar.f5940c.f5752b))) {
                return bVar.f5941d;
            }
        } else {
            if (!localDateTime.x(localDateTime2)) {
                return bVar.f5941d;
            }
            if (localDateTime.x(bVar.f5939b.B(bVar.f5941d.f5752b - bVar.f5940c.f5752b))) {
                return bVar.f5940c;
            }
        }
        return bVar;
    }

    public f(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, e[] eVarArr) {
        this.f5951a = jArr;
        this.f5952b = zoneOffsetArr;
        this.f5953c = jArr2;
        this.f5955e = zoneOffsetArr2;
        this.f = eVarArr;
        if (jArr2.length == 0) {
            this.f5954d = f5949k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i6 = 0;
            while (i6 < jArr2.length) {
                int i10 = i6 + 1;
                b bVar = new b(jArr2[i6], zoneOffsetArr2[i6], zoneOffsetArr2[i10]);
                boolean zE = bVar.e();
                LocalDateTime localDateTime = bVar.f5939b;
                if (zE) {
                    arrayList.add(localDateTime);
                    arrayList.add(bVar.f5939b.B(bVar.f5941d.f5752b - bVar.f5940c.f5752b));
                } else {
                    arrayList.add(localDateTime.B(bVar.f5941d.f5752b - bVar.f5940c.f5752b));
                    arrayList.add(bVar.f5939b);
                }
                i6 = i10;
            }
            this.f5954d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.g = null;
    }

    public f(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.f5952b = zoneOffsetArr;
        long[] jArr = i;
        this.f5951a = jArr;
        this.f5953c = jArr;
        this.f5954d = f5949k;
        this.f5955e = zoneOffsetArr;
        this.f = j;
        this.g = null;
    }

    public f(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = {g(timeZone.getRawOffset())};
        this.f5952b = zoneOffsetArr;
        long[] jArr = i;
        this.f5951a = jArr;
        this.f5953c = jArr;
        this.f5954d = f5949k;
        this.f5955e = zoneOffsetArr;
        this.f = j;
        this.g = timeZone;
    }

    public static ZoneOffset g(int i6) {
        return ZoneOffset.C(i6 / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.g != null ? (byte) 100 : (byte) 1, this);
    }

    public static int c(long j6, ZoneOffset zoneOffset) {
        return j$.time.h.E(j$.com.android.tools.r8.a.B(j6 + ((long) zoneOffset.f5752b), 86400)).f5867a;
    }

    public final ZoneOffset d(Instant instant) {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return g(timeZone.getOffset(instant.toEpochMilli()));
        }
        long[] jArr = this.f5953c;
        if (jArr.length == 0) {
            return this.f5952b[0];
        }
        long j6 = instant.f5738a;
        if (this.f.length > 0 && j6 > jArr[jArr.length - 1]) {
            b[] bVarArrB = b(c(j6, this.f5955e[r8.length - 1]));
            b bVar = null;
            for (int i6 = 0; i6 < bVarArrB.length; i6++) {
                bVar = bVarArrB[i6];
                if (j6 < bVar.f5938a) {
                    return bVar.f5940c;
                }
            }
            return bVar.f5941d;
        }
        int iBinarySearch = Arrays.binarySearch(jArr, j6);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return this.f5955e[iBinarySearch + 1];
    }

    public final List f(LocalDateTime localDateTime) {
        Object objE = e(localDateTime);
        if (!(objE instanceof b)) {
            return Collections.singletonList((ZoneOffset) objE);
        }
        b bVar = (b) objE;
        if (bVar.e()) {
            return Collections.EMPTY_LIST;
        }
        Object[] objArr = {bVar.f5940c, bVar.f5941d};
        ArrayList arrayList = new ArrayList(2);
        for (int i6 = 0; i6 < 2; i6++) {
            arrayList.add(Objects.requireNonNull(objArr[i6]));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        if (r8.v(r0) > 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
    
        if (r8.f5743b.G() <= r0.f5743b.G()) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(j$.time.LocalDateTime r8) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.zone.f.e(j$.time.LocalDateTime):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b[] b(int i6) {
        j$.time.h hVarW;
        b[] bVarArr = f5950l;
        Integer numValueOf = Integer.valueOf(i6);
        b[] bVarArr2 = (b[]) this.h.get(numValueOf);
        if (bVarArr2 != null) {
            return bVarArr2;
        }
        long j6 = 1;
        final int i10 = 0;
        final int i11 = 1;
        if (this.g != null) {
            if (i6 < 1800) {
                return bVarArr;
            }
            LocalDateTime localDateTime = LocalDateTime.f5740c;
            j$.time.h hVarD = j$.time.h.D(i6 - 1, 12, 31);
            j$.time.temporal.a.HOUR_OF_DAY.k(0);
            long jT = j$.com.android.tools.r8.a.t(new LocalDateTime(hVarD, k.h[0]), this.f5952b[0]);
            long j10 = 1000;
            int offset = this.g.getOffset(jT * 1000);
            long j11 = 31968000 + jT;
            while (jT < j11) {
                long j12 = jT + 7776000;
                long j13 = j10;
                if (offset != this.g.getOffset(j12 * j13)) {
                    while (j12 - jT > j6) {
                        long jB = j$.com.android.tools.r8.a.B(j12 + jT, 2L);
                        if (this.g.getOffset(jB * j13) == offset) {
                            jT = jB;
                        } else {
                            j12 = jB;
                        }
                        j6 = 1;
                    }
                    if (this.g.getOffset(jT * j13) == offset) {
                        jT = j12;
                    }
                    ZoneOffset zoneOffsetG = g(offset);
                    int offset2 = this.g.getOffset(jT * j13);
                    ZoneOffset zoneOffsetG2 = g(offset2);
                    if (c(jT, zoneOffsetG2) == i6) {
                        bVarArr = (b[]) Arrays.copyOf(bVarArr, bVarArr.length + 1);
                        bVarArr[bVarArr.length - 1] = new b(jT, zoneOffsetG, zoneOffsetG2);
                    }
                    offset = offset2;
                } else {
                    jT = j12;
                }
                j10 = j13;
                j6 = 1;
            }
            if (1916 <= i6 && i6 < 2100) {
                this.h.putIfAbsent(numValueOf, bVarArr);
            }
            return bVarArr;
        }
        e[] eVarArr = this.f;
        b[] bVarArr3 = new b[eVarArr.length];
        int i12 = 0;
        while (i12 < eVarArr.length) {
            e eVar = eVarArr[i12];
            byte b7 = eVar.f5945b;
            m mVar = eVar.f5944a;
            if (b7 < 0) {
                long j14 = i6;
                s.f5798c.getClass();
                int iW = mVar.w(s.f(j14)) + 1 + eVar.f5945b;
                j$.time.h hVar = j$.time.h.f5865d;
                j$.time.temporal.a.YEAR.k(j14);
                Objects.requireNonNull(mVar, "month");
                j$.time.temporal.a.DAY_OF_MONTH.k(iW);
                hVarW = j$.time.h.w(i6, mVar.getValue(), iW);
                j$.time.d dVar = eVar.f5946c;
                if (dVar != null) {
                    final int value = dVar.getValue();
                    hVarW = hVarW.f(new o() { // from class: j$.time.temporal.p
                        @Override // j$.time.temporal.o
                        public final m j(m mVar2) {
                            switch (i11) {
                                case 0:
                                    int iE = mVar2.e(a.DAY_OF_WEEK);
                                    int i13 = value;
                                    if (iE == i13) {
                                        return mVar2;
                                    }
                                    return mVar2.b(iE - i13 >= 0 ? 7 - r0 : -r0, b.DAYS);
                                default:
                                    int iE2 = mVar2.e(a.DAY_OF_WEEK);
                                    int i14 = value;
                                    if (iE2 == i14) {
                                        return mVar2;
                                    }
                                    return mVar2.n(i14 - iE2 >= 0 ? 7 - r1 : -r1, b.DAYS);
                            }
                        }
                    });
                }
            } else {
                j$.time.h hVar2 = j$.time.h.f5865d;
                j$.time.temporal.a.YEAR.k(i6);
                Objects.requireNonNull(mVar, "month");
                j$.time.temporal.a.DAY_OF_MONTH.k(b7);
                hVarW = j$.time.h.w(i6, mVar.getValue(), b7);
                j$.time.d dVar2 = eVar.f5946c;
                if (dVar2 != null) {
                    final int value2 = dVar2.getValue();
                    hVarW = hVarW.f(new o() { // from class: j$.time.temporal.p
                        @Override // j$.time.temporal.o
                        public final m j(m mVar2) {
                            switch (i10) {
                                case 0:
                                    int iE = mVar2.e(a.DAY_OF_WEEK);
                                    int i13 = value2;
                                    if (iE == i13) {
                                        return mVar2;
                                    }
                                    return mVar2.b(iE - i13 >= 0 ? 7 - r0 : -r0, b.DAYS);
                                default:
                                    int iE2 = mVar2.e(a.DAY_OF_WEEK);
                                    int i14 = value2;
                                    if (iE2 == i14) {
                                        return mVar2;
                                    }
                                    return mVar2.n(i14 - iE2 >= 0 ? 7 - r1 : -r1, b.DAYS);
                            }
                        }
                    });
                }
            }
            if (eVar.f5948e) {
                hVarW = hVarW.G(1L);
            }
            LocalDateTime localDateTimeY = LocalDateTime.y(hVarW, eVar.f5947d);
            d dVar3 = eVar.f;
            ZoneOffset zoneOffset = eVar.g;
            ZoneOffset zoneOffset2 = eVar.h;
            dVar3.getClass();
            int i13 = c.f5942a[dVar3.ordinal()];
            if (i13 == 1) {
                localDateTimeY = localDateTimeY.B(zoneOffset2.f5752b - ZoneOffset.UTC.f5752b);
            } else if (i13 == 2) {
                localDateTimeY = localDateTimeY.B(zoneOffset2.f5752b - zoneOffset.f5752b);
            }
            bVarArr3[i12] = new b(localDateTimeY, eVar.h, eVar.i);
            i12++;
            i10 = 0;
        }
        if (i6 < 2100) {
            this.h.putIfAbsent(numValueOf, bVarArr3);
        }
        return bVarArr3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (Objects.equals(this.g, fVar.g) && Arrays.equals(this.f5951a, fVar.f5951a) && Arrays.equals(this.f5952b, fVar.f5952b) && Arrays.equals(this.f5953c, fVar.f5953c) && Arrays.equals(this.f5955e, fVar.f5955e) && Arrays.equals(this.f, fVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.g) ^ Arrays.hashCode(this.f5951a)) ^ Arrays.hashCode(this.f5952b)) ^ Arrays.hashCode(this.f5953c)) ^ Arrays.hashCode(this.f5955e)) ^ Arrays.hashCode(this.f);
    }

    public final String toString() {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        return "ZoneRules[currentStandardOffset=" + this.f5952b[r0.length - 1] + "]";
    }
}
