package j$.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import j$.util.Objects;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* JADX INFO: loaded from: classes2.dex */
public final class s implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f5893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5894b;

    public s() {
    }

    public s(byte b7, Object obj) {
        this.f5893a = b7;
        this.f5894b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b7 = this.f5893a;
        Object obj = this.f5894b;
        objectOutput.writeByte(b7);
        switch (b7) {
            case 1:
                Duration duration = (Duration) obj;
                objectOutput.writeLong(duration.f5735a);
                objectOutput.writeInt(duration.f5736b);
                return;
            case 2:
                Instant instant = (Instant) obj;
                objectOutput.writeLong(instant.f5738a);
                objectOutput.writeInt(instant.f5739b);
                return;
            case 3:
                h hVar = (h) obj;
                objectOutput.writeInt(hVar.f5867a);
                objectOutput.writeByte(hVar.f5868b);
                objectOutput.writeByte(hVar.f5869c);
                return;
            case 4:
                ((k) obj).K(objectOutput);
                return;
            case 5:
                LocalDateTime localDateTime = (LocalDateTime) obj;
                h hVar2 = localDateTime.f5742a;
                objectOutput.writeInt(hVar2.f5867a);
                objectOutput.writeByte(hVar2.f5868b);
                objectOutput.writeByte(hVar2.f5869c);
                localDateTime.f5743b.K(objectOutput);
                return;
            case 6:
                ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
                LocalDateTime localDateTime2 = zonedDateTime.f5754a;
                h hVar3 = localDateTime2.f5742a;
                objectOutput.writeInt(hVar3.f5867a);
                objectOutput.writeByte(hVar3.f5868b);
                objectOutput.writeByte(hVar3.f5869c);
                localDateTime2.f5743b.K(objectOutput);
                zonedDateTime.f5755b.F(objectOutput);
                zonedDateTime.f5756c.z(objectOutput);
                return;
            case 7:
                objectOutput.writeUTF(((w) obj).f5932b);
                return;
            case 8:
                ((ZoneOffset) obj).F(objectOutput);
                return;
            case 9:
                q qVar = (q) obj;
                qVar.f5887a.K(objectOutput);
                qVar.f5888b.F(objectOutput);
                return;
            case 10:
                OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
                LocalDateTime localDateTime3 = offsetDateTime.f5745a;
                h hVar4 = localDateTime3.f5742a;
                objectOutput.writeInt(hVar4.f5867a);
                objectOutput.writeByte(hVar4.f5868b);
                objectOutput.writeByte(hVar4.f5869c);
                localDateTime3.f5743b.K(objectOutput);
                offsetDateTime.f5746b.F(objectOutput);
                return;
            case 11:
                objectOutput.writeInt(((Year) obj).f5748a);
                return;
            case 12:
                v vVar = (v) obj;
                objectOutput.writeInt(vVar.f5929a);
                objectOutput.writeByte(vVar.f5930b);
                return;
            case 13:
                o oVar = (o) obj;
                objectOutput.writeByte(oVar.f5883a);
                objectOutput.writeByte(oVar.f5884b);
                return;
            case 14:
                r rVar = (r) obj;
                objectOutput.writeInt(rVar.f5890a);
                objectOutput.writeInt(rVar.f5891b);
                objectOutput.writeInt(rVar.f5892c);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        byte b7 = objectInput.readByte();
        this.f5893a = b7;
        this.f5894b = a(b7, objectInput);
    }

    public static Object a(byte b7, ObjectInput objectInput) throws IOException {
        switch (b7) {
            case 1:
                Duration duration = Duration.f5734c;
                long j = objectInput.readLong();
                long j6 = objectInput.readInt();
                return Duration.e(j$.com.android.tools.r8.a.x(j, j$.com.android.tools.r8.a.B(j6, 1000000000L)), (int) j$.com.android.tools.r8.a.A(j6, 1000000000L));
            case 2:
                Instant instant = Instant.f5737c;
                return Instant.w(objectInput.readLong(), objectInput.readInt());
            case 3:
                h hVar = h.f5865d;
                return h.D(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return k.F(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.f5740c;
                h hVar2 = h.f5865d;
                return LocalDateTime.y(h.D(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), k.F(objectInput));
            case 6:
                LocalDateTime localDateTime2 = LocalDateTime.f5740c;
                h hVar3 = h.f5865d;
                LocalDateTime localDateTimeY = LocalDateTime.y(h.D(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), k.F(objectInput));
                ZoneOffset zoneOffsetE = ZoneOffset.E(objectInput);
                ZoneId zoneId = (ZoneId) a(objectInput.readByte(), objectInput);
                Objects.requireNonNull(localDateTimeY, "localDateTime");
                Objects.requireNonNull(zoneOffsetE, TypedValues.CycleType.S_WAVE_OFFSET);
                Objects.requireNonNull(zoneId, "zone");
                if (!(zoneId instanceof ZoneOffset) || zoneOffsetE.equals(zoneId)) {
                    return new ZonedDateTime(localDateTimeY, zoneId, zoneOffsetE);
                }
                g.c("ZoneId must match ZoneOffset");
                return null;
            case 7:
                int i = w.f5931d;
                return ZoneId.w(objectInput.readUTF(), false);
            case 8:
                return ZoneOffset.E(objectInput);
            case 9:
                int i6 = q.f5886c;
                return new q(k.F(objectInput), ZoneOffset.E(objectInput));
            case 10:
                int i10 = OffsetDateTime.f5744c;
                h hVar4 = h.f5865d;
                return new OffsetDateTime(LocalDateTime.y(h.D(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), k.F(objectInput)), ZoneOffset.E(objectInput));
            case 11:
                int i11 = Year.f5747b;
                return Year.v(objectInput.readInt());
            case 12:
                int i12 = v.f5928c;
                int i13 = objectInput.readInt();
                byte b10 = objectInput.readByte();
                j$.time.temporal.a.YEAR.k(i13);
                j$.time.temporal.a.MONTH_OF_YEAR.k(b10);
                return new v(i13, b10);
            case 13:
                int i14 = o.f5882c;
                byte b11 = objectInput.readByte();
                byte b12 = objectInput.readByte();
                m mVarY = m.y(b11);
                Objects.requireNonNull(mVarY, "month");
                j$.time.temporal.a.DAY_OF_MONTH.k(b12);
                if (b12 <= mVarY.x()) {
                    return new o(mVarY.getValue(), b12);
                }
                throw new b("Illegal value for DayOfMonth field, value " + ((int) b12) + " is not valid for month " + mVarY.name());
            case 14:
                r rVar = r.f5889d;
                int i15 = objectInput.readInt();
                int i16 = objectInput.readInt();
                int i17 = objectInput.readInt();
                return ((i15 | i16) | i17) == 0 ? r.f5889d : new r(i15, i16, i17);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.f5894b;
    }
}
