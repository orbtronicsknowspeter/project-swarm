package j$.time.zone;

import androidx.work.WorkInfo;
import j$.time.ZoneOffset;
import j$.time.k;
import j$.time.m;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f5944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f5945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j$.time.d f5946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f5947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f5948e;
    public final d f;
    public final ZoneOffset g;
    public final ZoneOffset h;
    public final ZoneOffset i;

    public e(m mVar, int i, j$.time.d dVar, k kVar, boolean z9, d dVar2, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.f5944a = mVar;
        this.f5945b = (byte) i;
        this.f5946c = dVar;
        this.f5947d = kVar;
        this.f5948e = z9;
        this.f = dVar2;
        this.g = zoneOffset;
        this.h = zoneOffset2;
        this.i = zoneOffset3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    public final void b(DataOutput dataOutput) {
        int iH = this.f5948e ? 86400 : this.f5947d.H();
        int i = this.g.f5752b;
        int i6 = this.h.f5752b - i;
        int i10 = this.i.f5752b - i;
        byte b7 = iH % 3600 == 0 ? this.f5948e ? (byte) 24 : this.f5947d.f5874a : (byte) 31;
        int i11 = i % 900 == 0 ? (i / 900) + 128 : 255;
        int i12 = (i6 == 0 || i6 == 1800 || i6 == 3600) ? i6 / 1800 : 3;
        int i13 = (i10 == 0 || i10 == 1800 || i10 == 3600) ? i10 / 1800 : 3;
        j$.time.d dVar = this.f5946c;
        dataOutput.writeInt((this.f5944a.getValue() << 28) + ((this.f5945b + 32) << 22) + ((dVar == null ? 0 : dVar.getValue()) << 19) + (b7 << 14) + (this.f.ordinal() << 12) + (i11 << 4) + (i12 << 2) + i13);
        if (b7 == 31) {
            dataOutput.writeInt(iH);
        }
        if (i11 == 255) {
            dataOutput.writeInt(i);
        }
        if (i12 == 3) {
            dataOutput.writeInt(this.h.f5752b);
        }
        if (i13 == 3) {
            dataOutput.writeInt(this.i.f5752b);
        }
    }

    public static e a(DataInput dataInput) {
        m mVar;
        e eVar;
        k kVarW;
        int i;
        int i6 = dataInput.readInt();
        m mVarY = m.y(i6 >>> 28);
        int i10 = ((264241152 & i6) >>> 22) - 32;
        int i11 = (3670016 & i6) >>> 19;
        j$.time.d dVarV = i11 == 0 ? null : j$.time.d.v(i11);
        int i12 = (507904 & i6) >>> 14;
        d dVar = d.values()[(i6 & 12288) >>> 12];
        int i13 = (i6 & 4080) >>> 4;
        int i14 = (i6 & 12) >>> 2;
        int i15 = i6 & 3;
        if (i12 == 31) {
            long j = dataInput.readInt();
            k kVar = k.f5873e;
            j$.time.temporal.a.SECOND_OF_DAY.k(j);
            int i16 = (int) (j / 3600);
            mVar = mVarY;
            eVar = null;
            long j6 = j - ((long) (i16 * 3600));
            int i17 = (int) (j6 / 60);
            kVarW = k.w(i16, i17, (int) (j6 - ((long) (i17 * 60))), 0);
        } else {
            mVar = mVarY;
            eVar = null;
            int i18 = i12 % 24;
            k kVar2 = k.f5873e;
            j$.time.temporal.a.HOUR_OF_DAY.k(i18);
            kVarW = k.h[i18];
        }
        ZoneOffset zoneOffsetC = i13 == 255 ? ZoneOffset.C(dataInput.readInt()) : ZoneOffset.C((i13 + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) * 900);
        ZoneOffset zoneOffsetC2 = i14 == 3 ? ZoneOffset.C(dataInput.readInt()) : ZoneOffset.C((i14 * 1800) + zoneOffsetC.f5752b);
        if (i15 == 3) {
            i = dataInput.readInt();
        } else {
            i = (i15 * 1800) + zoneOffsetC.f5752b;
        }
        ZoneOffset zoneOffsetC3 = ZoneOffset.C(i);
        boolean z9 = i12 == 24;
        m mVar2 = mVar;
        Objects.requireNonNull(mVar2, "month");
        Objects.requireNonNull(kVarW, "time");
        Objects.requireNonNull(dVar, "timeDefnition");
        Objects.requireNonNull(zoneOffsetC, "standardOffset");
        Objects.requireNonNull(zoneOffsetC2, "offsetBefore");
        Objects.requireNonNull(zoneOffsetC3, "offsetAfter");
        if (i10 < -28 || i10 > 31 || i10 == 0) {
            j$.time.g.c("Day of month indicator must be between -28 and 31 inclusive excluding zero");
            return eVar;
        }
        if (z9 && !kVarW.equals(k.g)) {
            j$.time.g.c("Time must be midnight when end of day flag is true");
            return eVar;
        }
        if (kVarW.f5877d != 0) {
            j$.time.g.c("Time's nano-of-second must be zero");
            return eVar;
        }
        return new e(mVar2, i10, dVarV, kVarW, z9, dVar, zoneOffsetC, zoneOffsetC2, zoneOffsetC3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f5944a == eVar.f5944a && this.f5945b == eVar.f5945b && this.f5946c == eVar.f5946c && this.f == eVar.f && this.f5947d.equals(eVar.f5947d) && this.f5948e == eVar.f5948e && this.g.equals(eVar.g) && this.h.equals(eVar.h) && this.i.equals(eVar.i);
    }

    public final int hashCode() {
        int iH = ((this.f5947d.H() + (this.f5948e ? 1 : 0)) << 15) + (this.f5944a.ordinal() << 11) + ((this.f5945b + 32) << 5);
        j$.time.d dVar = this.f5946c;
        return ((this.g.f5752b ^ (this.f.ordinal() + (iH + ((dVar == null ? 7 : dVar.ordinal()) << 2)))) ^ this.h.f5752b) ^ this.i.f5752b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionRule[");
        sb.append(this.i.f5752b - this.h.f5752b > 0 ? "Gap " : "Overlap ");
        sb.append(this.h);
        sb.append(" to ");
        sb.append(this.i);
        sb.append(", ");
        j$.time.d dVar = this.f5946c;
        if (dVar != null) {
            byte b7 = this.f5945b;
            if (b7 == -1) {
                sb.append(dVar.name());
                sb.append(" on or before last day of ");
                sb.append(this.f5944a.name());
            } else if (b7 < 0) {
                sb.append(dVar.name());
                sb.append(" on or before last day minus ");
                sb.append((-this.f5945b) - 1);
                sb.append(" of ");
                sb.append(this.f5944a.name());
            } else {
                sb.append(dVar.name());
                sb.append(" on or after ");
                sb.append(this.f5944a.name());
                sb.append(' ');
                sb.append((int) this.f5945b);
            }
        } else {
            sb.append(this.f5944a.name());
            sb.append(' ');
            sb.append((int) this.f5945b);
        }
        sb.append(" at ");
        sb.append(this.f5948e ? "24:00" : this.f5947d.toString());
        sb.append(" ");
        sb.append(this.f);
        sb.append(", standard offset ");
        sb.append(this.g);
        sb.append(']');
        return sb.toString();
    }
}
