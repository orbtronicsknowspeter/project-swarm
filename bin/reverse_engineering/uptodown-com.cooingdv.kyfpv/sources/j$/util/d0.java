package j$.util;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d0 f6033c = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6035b;

    public d0() {
        this.f6034a = false;
        this.f6035b = 0;
    }

    public d0(int i) {
        this.f6034a = true;
        this.f6035b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        boolean z9 = d0Var.f6034a;
        boolean z10 = this.f6034a;
        return (z10 && z9) ? this.f6035b == d0Var.f6035b : z10 == z9;
    }

    public final int hashCode() {
        if (this.f6034a) {
            return this.f6035b;
        }
        return 0;
    }

    public final String toString() {
        if (this.f6034a) {
            return "OptionalInt[" + this.f6035b + "]";
        }
        return "OptionalInt.empty";
    }
}
