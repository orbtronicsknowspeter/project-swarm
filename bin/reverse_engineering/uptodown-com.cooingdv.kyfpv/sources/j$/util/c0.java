package j$.util;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c0 f5976c = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f5978b;

    public c0() {
        this.f5977a = false;
        this.f5978b = Double.NaN;
    }

    public c0(double d10) {
        this.f5977a = true;
        this.f5978b = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        boolean z9 = c0Var.f5977a;
        boolean z10 = this.f5977a;
        return (z10 && z9) ? Double.compare(this.f5978b, c0Var.f5978b) == 0 : z10 == z9;
    }

    public final int hashCode() {
        if (!this.f5977a) {
            return 0;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(this.f5978b);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final String toString() {
        if (this.f5977a) {
            return "OptionalDouble[" + this.f5978b + "]";
        }
        return "OptionalDouble.empty";
    }
}
