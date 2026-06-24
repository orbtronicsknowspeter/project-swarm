package m7;

import androidx.core.location.LocationRequestCompat;
import com.google.android.gms.internal.measurement.i5;
import kotlin.jvm.internal.l;
import l7.m;
import t0.f;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f7656b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f7657l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f7658m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7659a;

    static {
        int i = b.f7660a;
        f7656b = i5.m(4611686018427387903L);
        f7657l = i5.m(-4611686018427387903L);
    }

    public static final long a(long j, long j6) {
        long j10 = 1000000;
        long j11 = j6 / j10;
        long j12 = j + j11;
        if (-4611686018426L > j12 || j12 >= 4611686018427L) {
            return i5.m(f.k(j12, -4611686018427387903L, 4611686018427387903L));
        }
        return i5.o((j12 * j10) + (j6 - (j11 * j10)));
    }

    public static final void b(StringBuilder sb, int i, int i6, int i10, String str, boolean z9) {
        sb.append(i);
        if (i6 != 0) {
            sb.append('.');
            String strD0 = m.D0(i10, String.valueOf(i6));
            int i11 = -1;
            int length = strD0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i12 = length - 1;
                    if (strD0.charAt(length) != '0') {
                        i11 = length;
                        break;
                    } else if (i12 < 0) {
                        break;
                    } else {
                        length = i12;
                    }
                }
            }
            int i13 = i11 + 1;
            if (z9 || i13 >= 3) {
                sb.append((CharSequence) strD0, 0, ((i11 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strD0, 0, i13);
            }
        }
        sb.append(str);
    }

    public static int c(long j, long j6) {
        long j10 = j ^ j6;
        if (j10 < 0 || (((int) j10) & 1) == 0) {
            return l.d(j, j6);
        }
        int i = (((int) j) & 1) - (((int) j6) & 1);
        return j < 0 ? -i : i;
    }

    public static final int d(long j) {
        if (e(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % ((long) 1000)) * ((long) 1000000) : (j >> 1) % ((long) 1000000000));
    }

    public static final boolean e(long j) {
        return j == f7656b || j == f7657l;
    }

    public static final long f(long j, long j6) {
        if (e(j)) {
            if (!e(j6) || (j6 ^ j) >= 0) {
                return j;
            }
            com.google.gson.internal.a.p("Summing infinite durations of different signs yields an undefined result.");
            return 0L;
        }
        if (e(j6)) {
            return j6;
        }
        int i = ((int) j) & 1;
        if (i != (((int) j6) & 1)) {
            return i == 1 ? a(j >> 1, j6 >> 1) : a(j6 >> 1, j >> 1);
        }
        long j10 = (j >> 1) + (j6 >> 1);
        return i == 0 ? (-4611686018426999999L > j10 || j10 >= 4611686018427000000L) ? i5.m(j10 / ((long) 1000000)) : i5.o(j10) : i5.n(j10);
    }

    public static final long g(long j, c cVar) {
        if (j == f7656b) {
            return LocationRequestCompat.PASSIVE_INTERVAL;
        }
        if (j == f7657l) {
            return Long.MIN_VALUE;
        }
        return cVar.f7668a.convert(j >> 1, ((((int) j) & 1) == 0 ? c.NANOSECONDS : c.MILLISECONDS).f7668a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return c(this.f7659a, ((a) obj).f7659a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f7659a == ((a) obj).f7659a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f7659a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        long j;
        int iG;
        long j6 = this.f7659a;
        if (j6 == 0) {
            return "0s";
        }
        if (j6 == f7656b) {
            return "Infinity";
        }
        if (j6 == f7657l) {
            return "-Infinity";
        }
        int i = 0;
        boolean z9 = j6 < 0;
        StringBuilder sb = new StringBuilder();
        if (z9) {
            sb.append('-');
        }
        if (j6 < 0) {
            j6 = ((long) (((int) j6) & 1)) + ((-(j6 >> 1)) << 1);
            int i6 = b.f7660a;
        }
        long jG = g(j6, c.DAYS);
        int iG2 = e(j6) ? 0 : (int) (g(j6, c.HOURS) % ((long) 24));
        if (e(j6)) {
            j = 0;
            iG = 0;
        } else {
            j = 0;
            iG = (int) (g(j6, c.MINUTES) % ((long) 60));
        }
        int iG3 = e(j6) ? 0 : (int) (g(j6, c.SECONDS) % ((long) 60));
        int iD = d(j6);
        boolean z10 = jG != j;
        boolean z11 = iG2 != 0;
        boolean z12 = iG != 0;
        boolean z13 = (iG3 == 0 && iD == 0) ? false : true;
        if (z10) {
            sb.append(jG);
            sb.append('d');
            i = 1;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i10 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iG2);
            sb.append('h');
            i = i10;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i11 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iG);
            sb.append('m');
            i = i11;
        }
        if (z13) {
            int i12 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iG3 != 0 || z10 || z11 || z12) {
                b(sb, iG3, iD, 9, "s", false);
            } else if (iD >= 1000000) {
                b(sb, iD / 1000000, iD % 1000000, 6, "ms", false);
            } else if (iD >= 1000) {
                b(sb, iD / 1000, iD % 1000, 3, "us", false);
            } else {
                sb.append(iD);
                sb.append("ns");
            }
            i = i12;
        }
        if (z9 && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }
}
