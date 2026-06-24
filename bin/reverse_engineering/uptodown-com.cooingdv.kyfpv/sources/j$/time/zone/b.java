package j$.time.zone;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Comparable, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f5937e = 0;
    private static final long serialVersionUID = -6946044323557704546L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDateTime f5939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ZoneOffset f5940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ZoneOffset f5941d;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f5938a, ((b) obj).f5938a);
    }

    public b(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        localDateTime.getClass();
        this.f5938a = j$.com.android.tools.r8.a.t(localDateTime, zoneOffset);
        this.f5939b = localDateTime;
        this.f5940c = zoneOffset;
        this.f5941d = zoneOffset2;
    }

    public b(long j, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f5938a = j;
        this.f5939b = LocalDateTime.z(j, 0, zoneOffset);
        this.f5940c = zoneOffset;
        this.f5941d = zoneOffset2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    public final boolean e() {
        return this.f5941d.f5752b > this.f5940c.f5752b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f5938a == bVar.f5938a && this.f5940c.equals(bVar.f5940c) && this.f5941d.equals(bVar.f5941d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f5939b.hashCode() ^ this.f5940c.f5752b) ^ Integer.rotateLeft(this.f5941d.f5752b, 16);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Transition[");
        sb.append(e() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.f5939b);
        sb.append(this.f5940c);
        sb.append(" to ");
        sb.append(this.f5941d);
        sb.append(']');
        return sb.toString();
    }
}
