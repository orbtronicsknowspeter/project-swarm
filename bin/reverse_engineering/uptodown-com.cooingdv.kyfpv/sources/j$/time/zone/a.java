package j$.time.zone;

import j$.time.ZoneOffset;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f5935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5936b;

    public a() {
    }

    public a(byte b7, Object obj) {
        this.f5935a = b7;
        this.f5936b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b7 = this.f5935a;
        Object obj = this.f5936b;
        objectOutput.writeByte(b7);
        if (b7 != 1) {
            if (b7 == 2) {
                b bVar = (b) obj;
                c(bVar.f5938a, objectOutput);
                d(bVar.f5940c, objectOutput);
                d(bVar.f5941d, objectOutput);
                return;
            }
            if (b7 == 3) {
                ((e) obj).b(objectOutput);
                return;
            } else {
                if (b7 != 100) {
                    throw new InvalidClassException("Unknown serialized type");
                }
                objectOutput.writeUTF(((f) obj).g.getID());
                return;
            }
        }
        f fVar = (f) obj;
        objectOutput.writeInt(fVar.f5951a.length);
        for (long j : fVar.f5951a) {
            c(j, objectOutput);
        }
        for (ZoneOffset zoneOffset : fVar.f5952b) {
            d(zoneOffset, objectOutput);
        }
        objectOutput.writeInt(fVar.f5953c.length);
        for (long j6 : fVar.f5953c) {
            c(j6, objectOutput);
        }
        for (ZoneOffset zoneOffset2 : fVar.f5955e) {
            d(zoneOffset2, objectOutput);
        }
        objectOutput.writeByte(fVar.f.length);
        for (e eVar : fVar.f) {
            eVar.b(objectOutput);
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object fVar;
        byte b7 = objectInput.readByte();
        this.f5935a = b7;
        if (b7 == 1) {
            long[] jArr = f.i;
            int i = objectInput.readInt();
            long[] jArr2 = i == 0 ? jArr : new long[i];
            for (int i6 = 0; i6 < i; i6++) {
                jArr2[i6] = a(objectInput);
            }
            int i10 = i + 1;
            ZoneOffset[] zoneOffsetArr = new ZoneOffset[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                zoneOffsetArr[i11] = b(objectInput);
            }
            int i12 = objectInput.readInt();
            if (i12 != 0) {
                jArr = new long[i12];
            }
            long[] jArr3 = jArr;
            for (int i13 = 0; i13 < i12; i13++) {
                jArr3[i13] = a(objectInput);
            }
            int i14 = i12 + 1;
            ZoneOffset[] zoneOffsetArr2 = new ZoneOffset[i14];
            for (int i15 = 0; i15 < i14; i15++) {
                zoneOffsetArr2[i15] = b(objectInput);
            }
            int i16 = objectInput.readByte();
            e[] eVarArr = i16 == 0 ? f.j : new e[i16];
            for (int i17 = 0; i17 < i16; i17++) {
                eVarArr[i17] = e.a(objectInput);
            }
            fVar = new f(jArr2, zoneOffsetArr, jArr3, zoneOffsetArr2, eVarArr);
        } else if (b7 == 2) {
            int i18 = b.f5937e;
            long jA = a(objectInput);
            ZoneOffset zoneOffsetB = b(objectInput);
            ZoneOffset zoneOffsetB2 = b(objectInput);
            if (zoneOffsetB.equals(zoneOffsetB2)) {
                j$.time.g.c("Offsets must not be equal");
                return;
            }
            fVar = new b(jA, zoneOffsetB, zoneOffsetB2);
        } else if (b7 == 3) {
            fVar = e.a(objectInput);
        } else {
            if (b7 != 100) {
                throw new StreamCorruptedException("Unknown serialized type");
            }
            fVar = new f(TimeZone.getTimeZone(objectInput.readUTF()));
        }
        this.f5936b = fVar;
    }

    private Object readResolve() {
        return this.f5936b;
    }

    public static ZoneOffset b(DataInput dataInput) throws IOException {
        byte b7 = dataInput.readByte();
        return b7 == 127 ? ZoneOffset.C(dataInput.readInt()) : ZoneOffset.C(b7 * 900);
    }

    public static void c(long j, DataOutput dataOutput) throws IOException {
        if (j >= -4575744000L && j < 10413792000L && j % 900 == 0) {
            int i = (int) ((j + 4575744000L) / 900);
            dataOutput.writeByte((i >>> 16) & 255);
            dataOutput.writeByte((i >>> 8) & 255);
            dataOutput.writeByte(i & 255);
            return;
        }
        dataOutput.writeByte(255);
        dataOutput.writeLong(j);
    }

    public static long a(DataInput dataInput) {
        int i = dataInput.readByte() & 255;
        if (i == 255) {
            return dataInput.readLong();
        }
        return (((long) (((i << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255))) * 900) - 4575744000L;
    }

    public static void d(ZoneOffset zoneOffset, DataOutput dataOutput) throws IOException {
        int i = zoneOffset.f5752b;
        int i6 = i % 900 == 0 ? i / 900 : 127;
        dataOutput.writeByte(i6);
        if (i6 == 127) {
            dataOutput.writeInt(i);
        }
    }
}
