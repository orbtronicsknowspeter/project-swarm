package j$.time;

import androidx.core.location.LocationRequestCompat;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements j$.time.temporal.m, j$.time.temporal.o, Comparable, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f5873e;
    public static final k f;
    public static final k g;
    public static final k[] h = new k[24];
    private static final long serialVersionUID = 6414437269572265201L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f5874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f5875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte f5876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5877d;

    static {
        int i = 0;
        while (true) {
            k[] kVarArr = h;
            if (i < kVarArr.length) {
                kVarArr[i] = new k(i, 0, 0, 0);
                i++;
            } else {
                k kVar = kVarArr[0];
                g = kVar;
                k kVar2 = kVarArr[12];
                f5873e = kVar;
                f = new k(23, 59, 59, 999999999);
                return;
            }
        }
    }

    public static k z(long j) {
        j$.time.temporal.a.NANO_OF_DAY.k(j);
        int i = (int) (j / 3600000000000L);
        long j6 = j - (((long) i) * 3600000000000L);
        int i6 = (int) (j6 / 60000000000L);
        long j10 = j6 - (((long) i6) * 60000000000L);
        int i10 = (int) (j10 / 1000000000);
        return w(i, i6, i10, (int) (j10 - (((long) i10) * 1000000000)));
    }

    public static k x(j$.time.temporal.n nVar) {
        Objects.requireNonNull(nVar, "temporal");
        k kVar = (k) nVar.k(j$.time.temporal.r.g);
        if (kVar != null) {
            return kVar;
        }
        throw new b("Unable to obtain LocalTime from TemporalAccessor: " + nVar + " of type " + nVar.getClass().getName());
    }

    public static k w(int i, int i6, int i10, int i11) {
        if ((i6 | i10 | i11) == 0) {
            return h[i];
        }
        return new k(i, i6, i10, i11);
    }

    public k(int i, int i6, int i10, int i11) {
        this.f5874a = (byte) i;
        this.f5875b = (byte) i6;
        this.f5876c = (byte) i10;
        this.f5877d = i11;
    }

    @Override // j$.time.temporal.n
    public final boolean c(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).n();
        }
        return qVar != null && qVar.e(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u g(j$.time.temporal.q qVar) {
        return j$.time.temporal.r.d(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final int e(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return y(qVar);
        }
        return j$.time.temporal.r.a(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final long q(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar == j$.time.temporal.a.NANO_OF_DAY) {
                return G();
            }
            if (qVar == j$.time.temporal.a.MICRO_OF_DAY) {
                return G() / 1000;
            }
            return y(qVar);
        }
        return qVar.g(this);
    }

    public final int y(j$.time.temporal.q qVar) {
        switch (j.f5871a[((j$.time.temporal.a) qVar).ordinal()]) {
            case 1:
                return this.f5877d;
            case 2:
                throw new j$.time.temporal.t("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return this.f5877d / 1000;
            case 4:
                throw new j$.time.temporal.t("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return this.f5877d / 1000000;
            case 6:
                return (int) (G() / 1000000);
            case 7:
                return this.f5876c;
            case 8:
                return H();
            case 9:
                return this.f5875b;
            case 10:
                return (this.f5874a * 60) + this.f5875b;
            case 11:
                return this.f5874a % 12;
            case 12:
                int i = this.f5874a % 12;
                if (i % 12 == 0) {
                    return 12;
                }
                return i;
            case 13:
                return this.f5874a;
            case 14:
                byte b7 = this.f5874a;
                if (b7 == 0) {
                    return 24;
                }
                return b7;
            case 15:
                return this.f5874a / 12;
            default:
                throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
        }
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final k a(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (k) qVar.j(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.k(j);
        switch (j.f5871a[aVar.ordinal()]) {
            case 1:
                return J((int) j);
            case 2:
                return z(j);
            case 3:
                return J(((int) j) * 1000);
            case 4:
                return z(j * 1000);
            case 5:
                return J(((int) j) * 1000000);
            case 6:
                return z(j * 1000000);
            case 7:
                int i = (int) j;
                if (this.f5876c != i) {
                    j$.time.temporal.a.SECOND_OF_MINUTE.k(i);
                    return w(this.f5874a, this.f5875b, i, this.f5877d);
                }
                return this;
            case 8:
                return E(j - ((long) H()));
            case 9:
                int i6 = (int) j;
                if (this.f5875b != i6) {
                    j$.time.temporal.a.MINUTE_OF_HOUR.k(i6);
                    return w(this.f5874a, i6, this.f5876c, this.f5877d);
                }
                return this;
            case 10:
                return C(j - ((long) ((this.f5874a * 60) + this.f5875b)));
            case 11:
                return B(j - ((long) (this.f5874a % 12)));
            case 12:
                if (j == 12) {
                    j = 0;
                }
                return B(j - ((long) (this.f5874a % 12)));
            case 13:
                int i10 = (int) j;
                if (this.f5874a != i10) {
                    j$.time.temporal.a.HOUR_OF_DAY.k(i10);
                    return w(i10, this.f5875b, this.f5876c, this.f5877d);
                }
                return this;
            case 14:
                if (j == 24) {
                    j = 0;
                }
                int i11 = (int) j;
                if (this.f5874a != i11) {
                    j$.time.temporal.a.HOUR_OF_DAY.k(i11);
                    return w(i11, this.f5875b, this.f5876c, this.f5877d);
                }
                return this;
            case 15:
                return B((j - ((long) (this.f5874a / 12))) * 12);
            default:
                throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
        }
    }

    public final k J(int i) {
        if (this.f5877d == i) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.k(i);
        return w(this.f5874a, this.f5875b, this.f5876c, i);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final k b(long j, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.b) {
            switch (j.f5872b[((j$.time.temporal.b) sVar).ordinal()]) {
                case 1:
                    return D(j);
                case 2:
                    return D((j % 86400000000L) * 1000);
                case 3:
                    return D((j % 86400000) * 1000000);
                case 4:
                    return E(j);
                case 5:
                    return C(j);
                case 6:
                    return B(j);
                case 7:
                    return B((j % 2) * 12);
                default:
                    g.b(sVar, "Unsupported unit: ");
                    return null;
            }
        }
        return (k) sVar.e(this, j);
    }

    public final k B(long j) {
        return j == 0 ? this : w(((((int) (j % 24)) + this.f5874a) + 24) % 24, this.f5875b, this.f5876c, this.f5877d);
    }

    public final k C(long j) {
        if (j != 0) {
            int i = (this.f5874a * 60) + this.f5875b;
            int i6 = ((((int) (j % 1440)) + i) + 1440) % 1440;
            if (i != i6) {
                return w(i6 / 60, i6 % 60, this.f5876c, this.f5877d);
            }
        }
        return this;
    }

    public final k E(long j) {
        if (j != 0) {
            int i = (this.f5875b * 60) + (this.f5874a * 3600) + this.f5876c;
            int i6 = ((((int) (j % 86400)) + i) + 86400) % 86400;
            if (i != i6) {
                return w(i6 / 3600, (i6 / 60) % 60, i6 % 60, this.f5877d);
            }
        }
        return this;
    }

    public final k D(long j) {
        if (j != 0) {
            long jG = G();
            long j6 = (((j % 86400000000000L) + jG) + 86400000000000L) % 86400000000000L;
            if (jG != j6) {
                return w((int) (j6 / 3600000000000L), (int) ((j6 / 60000000000L) % 60), (int) ((j6 / 1000000000) % 60), (int) (j6 % 1000000000));
            }
        }
        return this;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m n(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? b(LocationRequestCompat.PASSIVE_INTERVAL, bVar).b(1L, bVar) : b(-j, bVar);
    }

    @Override // j$.time.temporal.n
    public final Object k(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.r.f5918b || aVar == j$.time.temporal.r.f5917a || aVar == j$.time.temporal.r.f5921e || aVar == j$.time.temporal.r.f5920d) {
            return null;
        }
        if (aVar == j$.time.temporal.r.g) {
            return this;
        }
        if (aVar == j$.time.temporal.r.f) {
            return null;
        }
        if (aVar == j$.time.temporal.r.f5919c) {
            return j$.time.temporal.b.NANOS;
        }
        return aVar.a(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m j(j$.time.temporal.m mVar) {
        return mVar.a(G(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public final int H() {
        return (this.f5875b * 60) + (this.f5874a * 3600) + this.f5876c;
    }

    public final long G() {
        return (((long) this.f5876c) * 1000000000) + (((long) this.f5875b) * 60000000000L) + (((long) this.f5874a) * 3600000000000L) + ((long) this.f5877d);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final int compareTo(k kVar) {
        int iCompare = Integer.compare(this.f5874a, kVar.f5874a);
        return (iCompare == 0 && (iCompare = Integer.compare(this.f5875b, kVar.f5875b)) == 0 && (iCompare = Integer.compare(this.f5876c, kVar.f5876c)) == 0) ? Integer.compare(this.f5877d, kVar.f5877d) : iCompare;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f5874a == kVar.f5874a && this.f5875b == kVar.f5875b && this.f5876c == kVar.f5876c && this.f5877d == kVar.f5877d) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m f(h hVar) {
        return (k) j$.com.android.tools.r8.a.a(hVar, this);
    }

    public final int hashCode() {
        long jG = G();
        return (int) (jG ^ (jG >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b7 = this.f5874a;
        byte b10 = this.f5875b;
        byte b11 = this.f5876c;
        int i = this.f5877d;
        sb.append(b7 < 10 ? "0" : "");
        sb.append((int) b7);
        sb.append(b10 < 10 ? ":0" : ":");
        sb.append((int) b10);
        if (b11 > 0 || i > 0) {
            sb.append(b11 < 10 ? ":0" : ":");
            sb.append((int) b11);
            if (i > 0) {
                sb.append('.');
                if (i % 1000000 == 0) {
                    sb.append(Integer.toString((i / 1000000) + 1000).substring(1));
                } else if (i % 1000 == 0) {
                    sb.append(Integer.toString((i / 1000) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(i + 1000000000).substring(1));
                }
            }
        }
        return sb.toString();
    }

    private Object writeReplace() {
        return new s((byte) 4, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final void K(DataOutput dataOutput) {
        if (this.f5877d == 0) {
            if (this.f5876c == 0) {
                byte b7 = this.f5875b;
                byte b10 = this.f5874a;
                if (b7 == 0) {
                    dataOutput.writeByte(~b10);
                    return;
                } else {
                    dataOutput.writeByte(b10);
                    dataOutput.writeByte(~this.f5875b);
                    return;
                }
            }
            dataOutput.writeByte(this.f5874a);
            dataOutput.writeByte(this.f5875b);
            dataOutput.writeByte(~this.f5876c);
            return;
        }
        dataOutput.writeByte(this.f5874a);
        dataOutput.writeByte(this.f5875b);
        dataOutput.writeByte(this.f5876c);
        dataOutput.writeInt(this.f5877d);
    }

    public static k F(DataInput dataInput) throws IOException {
        int i;
        int i6;
        int i10 = dataInput.readByte();
        int i11 = 0;
        if (i10 < 0) {
            i10 = ~i10;
            i6 = 0;
            i = 0;
        } else {
            byte b7 = dataInput.readByte();
            if (b7 < 0) {
                int i12 = ~b7;
                i = 0;
                i11 = i12;
                i6 = 0;
            } else {
                byte b10 = dataInput.readByte();
                if (b10 < 0) {
                    i6 = ~b10;
                    i = 0;
                    i11 = b7;
                } else {
                    i = dataInput.readInt();
                    i11 = b7;
                    i6 = b10;
                }
            }
        }
        j$.time.temporal.a.HOUR_OF_DAY.k(i10);
        j$.time.temporal.a.MINUTE_OF_HOUR.k(i11);
        j$.time.temporal.a.SECOND_OF_MINUTE.k(i6);
        j$.time.temporal.a.NANO_OF_SECOND.k(i);
        return w(i10, i11, i6, i);
    }
}
