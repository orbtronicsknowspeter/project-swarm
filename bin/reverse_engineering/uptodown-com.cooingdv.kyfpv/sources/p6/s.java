package p6;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class s implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8459a;

    public /* synthetic */ s(long j) {
        this.f8459a = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return kotlin.jvm.internal.l.d(this.f8459a ^ Long.MIN_VALUE, ((s) obj).f8459a ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f8459a == ((s) obj).f8459a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f8459a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        long j = this.f8459a;
        if (j >= 0) {
            d0.b.v(10);
            String string = Long.toString(j, 10);
            string.getClass();
            return string;
        }
        long j6 = 10;
        long j10 = ((j >>> 1) / j6) << 1;
        long j11 = j - (j10 * j6);
        if (j11 >= j6) {
            j11 -= j6;
            j10++;
        }
        d0.b.v(10);
        String string2 = Long.toString(j10, 10);
        string2.getClass();
        d0.b.v(10);
        String string3 = Long.toString(j11, 10);
        string3.getClass();
        return string2.concat(string3);
    }
}
