package j$.time.chrono;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f5773e = 0;
    private static final long serialVersionUID = 57387258289L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f5774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5777d;

    static {
        Object[] objArr = {j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS};
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            arrayList.add(Objects.requireNonNull(objArr[i]));
        }
        Collections.unmodifiableList(arrayList);
    }

    public h(l lVar, int i, int i6, int i10) {
        Objects.requireNonNull(lVar, "chrono");
        this.f5774a = lVar;
        this.f5775b = i;
        this.f5776c = i6;
        this.f5777d = i10;
    }

    public final String toString() {
        if (this.f5775b == 0 && this.f5776c == 0 && this.f5777d == 0) {
            return this.f5774a.toString() + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5774a.toString());
        sb.append(" P");
        int i = this.f5775b;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i6 = this.f5776c;
        if (i6 != 0) {
            sb.append(i6);
            sb.append('M');
        }
        int i10 = this.f5777d;
        if (i10 != 0) {
            sb.append(i10);
            sb.append('D');
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f5775b == hVar.f5775b && this.f5776c == hVar.f5776c && this.f5777d == hVar.f5777d && this.f5774a.equals(hVar.f5774a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Integer.rotateLeft(this.f5777d, 16) + (Integer.rotateLeft(this.f5776c, 8) + this.f5775b)) ^ this.f5774a.hashCode();
    }

    public Object writeReplace() {
        return new e0((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
