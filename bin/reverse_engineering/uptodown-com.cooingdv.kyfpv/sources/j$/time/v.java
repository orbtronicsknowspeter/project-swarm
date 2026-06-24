package j$.time;

import androidx.core.location.LocationRequestCompat;
import androidx.leanback.media.MediaPlayerGlue;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class v implements j$.time.temporal.m, j$.time.temporal.o, Comparable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f5928c = 0;
    private static final long serialVersionUID = 4183400860270640070L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5930b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        v vVar = (v) obj;
        int i = this.f5929a - vVar.f5929a;
        return i == 0 ? this.f5930b - vVar.f5930b : i;
    }

    static {
        j$.time.format.n nVar = new j$.time.format.n();
        nVar.h(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.u.EXCEEDS_PAD);
        nVar.c('-');
        nVar.g(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        nVar.l(Locale.getDefault(), j$.time.format.t.SMART, null);
    }

    public v(int i, int i6) {
        this.f5929a = i;
        this.f5930b = i6;
    }

    public final v z(int i, int i6) {
        return (this.f5929a == i && this.f5930b == i6) ? this : new v(i, i6);
    }

    @Override // j$.time.temporal.n
    public final boolean c(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.YEAR || qVar == j$.time.temporal.a.MONTH_OF_YEAR || qVar == j$.time.temporal.a.PROLEPTIC_MONTH || qVar == j$.time.temporal.a.YEAR_OF_ERA || qVar == j$.time.temporal.a.ERA : qVar != null && qVar.e(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u g(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.u.e(1L, this.f5929a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.r.d(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final int e(j$.time.temporal.q qVar) {
        return g(qVar).a(q(qVar), qVar);
    }

    @Override // j$.time.temporal.n
    public final long q(j$.time.temporal.q qVar) {
        int i;
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.g(this);
        }
        int i6 = u.f5926a[((j$.time.temporal.a) qVar).ordinal()];
        if (i6 == 1) {
            i = this.f5930b;
        } else {
            if (i6 == 2) {
                return v();
            }
            if (i6 == 3) {
                int i10 = this.f5929a;
                if (i10 < 1) {
                    i10 = 1 - i10;
                }
                return i10;
            }
            if (i6 != 4) {
                if (i6 == 5) {
                    return this.f5929a < 1 ? 0 : 1;
                }
                throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
            }
            i = this.f5929a;
        }
        return i;
    }

    public final long v() {
        return ((((long) this.f5929a) * 12) + ((long) this.f5930b)) - 1;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final v a(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (v) qVar.j(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.k(j);
        int i = u.f5926a[aVar.ordinal()];
        if (i == 1) {
            int i6 = (int) j;
            j$.time.temporal.a.MONTH_OF_YEAR.k(i6);
            return z(this.f5929a, i6);
        }
        if (i == 2) {
            return x(j - v());
        }
        if (i == 3) {
            if (this.f5929a < 1) {
                j = 1 - j;
            }
            int i10 = (int) j;
            j$.time.temporal.a.YEAR.k(i10);
            return z(i10, this.f5930b);
        }
        if (i == 4) {
            int i11 = (int) j;
            j$.time.temporal.a.YEAR.k(i11);
            return z(i11, this.f5930b);
        }
        if (i != 5) {
            throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
        }
        if (q(j$.time.temporal.a.ERA) == j) {
            return this;
        }
        int i12 = 1 - this.f5929a;
        j$.time.temporal.a.YEAR.k(i12);
        return z(i12, this.f5930b);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final v b(long j, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.b) {
            switch (u.f5927b[((j$.time.temporal.b) sVar).ordinal()]) {
                case 1:
                    return x(j);
                case 2:
                    return y(j);
                case 3:
                    return y(j$.com.android.tools.r8.a.w(j, 10));
                case 4:
                    return y(j$.com.android.tools.r8.a.w(j, 100));
                case 5:
                    return y(j$.com.android.tools.r8.a.w(j, 1000));
                case 6:
                    j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                    return a(j$.com.android.tools.r8.a.x(q(aVar), j), aVar);
                default:
                    g.b(sVar, "Unsupported unit: ");
                    return null;
            }
        }
        return (v) sVar.e(this, j);
    }

    public final v y(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return z(aVar.f5899b.a(((long) this.f5929a) + j, aVar), this.f5930b);
    }

    public final v x(long j) {
        if (j == 0) {
            return this;
        }
        long j6 = (((long) this.f5929a) * 12) + ((long) (this.f5930b - 1)) + j;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        long j10 = 12;
        return z(aVar.f5899b.a(j$.com.android.tools.r8.a.B(j6, j10), aVar), ((int) j$.com.android.tools.r8.a.A(j6, j10)) + 1);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m n(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? b(LocationRequestCompat.PASSIVE_INTERVAL, bVar).b(1L, bVar) : b(-j, bVar);
    }

    @Override // j$.time.temporal.n
    public final Object k(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.r.f5918b) {
            return j$.time.chrono.s.f5798c;
        }
        if (aVar == j$.time.temporal.r.f5919c) {
            return j$.time.temporal.b.MONTHS;
        }
        return j$.time.temporal.r.c(this, aVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m j(j$.time.temporal.m mVar) {
        if (!j$.com.android.tools.r8.a.v(mVar).equals(j$.time.chrono.s.f5798c)) {
            throw new b("Adjustment only supported on ISO date-time");
        }
        return mVar.a(v(), j$.time.temporal.a.PROLEPTIC_MONTH);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            if (this.f5929a == vVar.f5929a && this.f5930b == vVar.f5930b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5929a ^ (this.f5930b << 27);
    }

    public final String toString() {
        int iAbs = Math.abs(this.f5929a);
        StringBuilder sb = new StringBuilder(9);
        int i = this.f5929a;
        if (iAbs >= 1000) {
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + MediaPlayerGlue.FAST_FORWARD_REWIND_STEP);
            sb.deleteCharAt(0);
        }
        sb.append(this.f5930b < 10 ? "-0" : "-");
        sb.append(this.f5930b);
        return sb.toString();
    }

    private Object writeReplace() {
        return new s((byte) 12, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m f(h hVar) {
        return (v) j$.com.android.tools.r8.a.a(hVar, this);
    }
}
