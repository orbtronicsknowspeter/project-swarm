package j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class Duration implements Comparable<Duration>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Duration f5734c = new Duration(0, 0);
    private static final long serialVersionUID = 3078945930695997490L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5736b;

    @Override // java.lang.Comparable
    public final int compareTo(Duration duration) {
        Duration duration2 = duration;
        int iCompare = Long.compare(this.f5735a, duration2.f5735a);
        return iCompare != 0 ? iCompare : this.f5736b - duration2.f5736b;
    }

    static {
        BigInteger.valueOf(1000000000L);
    }

    public static Duration ofMillis(long j) {
        long j6 = j / 1000;
        int i = (int) (j % 1000);
        if (i < 0) {
            i += 1000;
            j6--;
        }
        return e(j6, i * 1000000);
    }

    public static Duration f(long j) {
        long j6 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i = (int) (((long) i) + 1000000000);
            j6--;
        }
        return e(j6, i);
    }

    public static Duration e(long j, int i) {
        if ((((long) i) | j) == 0) {
            return f5734c;
        }
        return new Duration(j, i);
    }

    public Duration(long j, int i) {
        this.f5735a = j;
        this.f5736b = i;
    }

    public long toMillis() {
        long j = this.f5735a;
        long j6 = this.f5736b;
        if (j < 0) {
            j++;
            j6 -= 1000000000;
        }
        return j$.com.android.tools.r8.a.x(j$.com.android.tools.r8.a.w(j, 1000), j6 / 1000000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Duration) {
            Duration duration = (Duration) obj;
            if (this.f5735a == duration.f5735a && this.f5736b == duration.f5736b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.f5735a;
        return (this.f5736b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        if (this == f5734c) {
            return "PT0S";
        }
        long j = this.f5735a;
        if (j < 0 && this.f5736b > 0) {
            j++;
        }
        long j6 = j / 3600;
        int i = (int) ((j % 3600) / 60);
        int i6 = (int) (j % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j6 != 0) {
            sb.append(j6);
            sb.append('H');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('M');
        }
        if (i6 == 0 && this.f5736b == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (this.f5735a < 0 && this.f5736b > 0 && i6 == 0) {
            sb.append("-0");
        } else {
            sb.append(i6);
        }
        if (this.f5736b > 0) {
            int length = sb.length();
            long j10 = this.f5735a;
            int i10 = this.f5736b;
            if (j10 < 0) {
                sb.append(2000000000 - ((long) i10));
            } else {
                sb.append(((long) i10) + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }

    private Object writeReplace() {
        return new s((byte) 1, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
