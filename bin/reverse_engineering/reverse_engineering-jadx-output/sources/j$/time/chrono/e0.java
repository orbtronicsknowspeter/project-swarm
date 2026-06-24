package j$.time.chrono;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f5765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5766b;

    public e0() {
    }

    public e0(byte b7, Object obj) {
        this.f5765a = b7;
        this.f5766b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b7 = this.f5765a;
        Object obj = this.f5766b;
        objectOutput.writeByte(b7);
        switch (b7) {
            case 1:
                objectOutput.writeUTF(((a) obj).d());
                return;
            case 2:
                g gVar = (g) obj;
                objectOutput.writeObject(gVar.f5769a);
                objectOutput.writeObject(gVar.f5770b);
                return;
            case 3:
                k kVar = (k) obj;
                objectOutput.writeObject(kVar.f5782a);
                objectOutput.writeObject(kVar.f5783b);
                objectOutput.writeObject(kVar.f5784c);
                return;
            case 4:
                x xVar = (x) obj;
                xVar.getClass();
                objectOutput.writeInt(j$.time.temporal.r.a(xVar, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.r.a(xVar, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.r.a(xVar, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 5:
                objectOutput.writeByte(((y) obj).f5808a);
                return;
            case 6:
                q qVar = (q) obj;
                objectOutput.writeObject(qVar.f5792a);
                objectOutput.writeInt(j$.time.temporal.r.a(qVar, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.r.a(qVar, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.r.a(qVar, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 7:
                c0 c0Var = (c0) obj;
                c0Var.getClass();
                objectOutput.writeInt(j$.time.temporal.r.a(c0Var, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.r.a(c0Var, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.r.a(c0Var, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 8:
                i0 i0Var = (i0) obj;
                i0Var.getClass();
                objectOutput.writeInt(j$.time.temporal.r.a(i0Var, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.r.a(i0Var, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.r.a(i0Var, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 9:
                h hVar = (h) obj;
                objectOutput.writeUTF(hVar.f5773a.d());
                objectOutput.writeInt(hVar.f5774b);
                objectOutput.writeInt(hVar.f5775c);
                objectOutput.writeInt(hVar.f5776d);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object objE;
        byte b7 = objectInput.readByte();
        this.f5765a = b7;
        switch (b7) {
            case 1:
                ConcurrentHashMap concurrentHashMap = a.f5758a;
                objE = j$.com.android.tools.r8.a.E(objectInput.readUTF());
                break;
            case 2:
                objE = ((b) objectInput.readObject()).s((j$.time.k) objectInput.readObject());
                break;
            case 3:
                objE = ((e) objectInput.readObject()).h((ZoneOffset) objectInput.readObject()).m((ZoneId) objectInput.readObject());
                break;
            case 4:
                j$.time.h hVar = x.f5802d;
                int i = objectInput.readInt();
                byte b10 = objectInput.readByte();
                byte b11 = objectInput.readByte();
                v.f5800c.getClass();
                objE = new x(j$.time.h.D(i, b10, b11));
                break;
            case 5:
                y yVar = y.f5806d;
                objE = y.l(objectInput.readByte());
                break;
            case 6:
                o oVar = (o) objectInput.readObject();
                int i6 = objectInput.readInt();
                byte b12 = objectInput.readByte();
                byte b13 = objectInput.readByte();
                oVar.getClass();
                objE = new q(oVar, i6, b12, b13);
                break;
            case 7:
                int i10 = objectInput.readInt();
                byte b14 = objectInput.readByte();
                byte b15 = objectInput.readByte();
                a0.f5760c.getClass();
                objE = new c0(j$.time.h.D(i10 + 1911, b14, b15));
                break;
            case 8:
                int i11 = objectInput.readInt();
                byte b16 = objectInput.readByte();
                byte b17 = objectInput.readByte();
                g0.f5771c.getClass();
                objE = new i0(j$.time.h.D(i11 - 543, b16, b17));
                break;
            case 9:
                int i12 = h.f5772e;
                objE = new h(j$.com.android.tools.r8.a.E(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.f5766b = objE;
    }

    private Object readResolve() {
        return this.f5766b;
    }
}
