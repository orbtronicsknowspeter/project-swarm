package j$.time;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f5889d = new r(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5892c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        Object[] objArr = {j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS};
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            arrayList.add(Objects.requireNonNull(objArr[i]));
        }
        Collections.unmodifiableList(arrayList);
    }

    public r(int i, int i6, int i10) {
        this.f5890a = i;
        this.f5891b = i6;
        this.f5892c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.f5890a == rVar.f5890a && this.f5891b == rVar.f5891b && this.f5892c == rVar.f5892c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.f5892c, 16) + Integer.rotateLeft(this.f5891b, 8) + this.f5890a;
    }

    public final String toString() {
        if (this == f5889d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i = this.f5890a;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i6 = this.f5891b;
        if (i6 != 0) {
            sb.append(i6);
            sb.append('M');
        }
        int i10 = this.f5892c;
        if (i10 != 0) {
            sb.append(i10);
            sb.append('D');
        }
        return sb.toString();
    }

    private Object writeReplace() {
        return new s((byte) 14, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
