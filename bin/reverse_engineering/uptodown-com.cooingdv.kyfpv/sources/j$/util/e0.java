package j$.util;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e0 f6040c = new e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6042b;

    public e0() {
        this.f6041a = false;
        this.f6042b = 0L;
    }

    public e0(long j) {
        this.f6041a = true;
        this.f6042b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        boolean z9 = e0Var.f6041a;
        boolean z10 = this.f6041a;
        return (z10 && z9) ? this.f6042b == e0Var.f6042b : z10 == z9;
    }

    public final int hashCode() {
        if (!this.f6041a) {
            return 0;
        }
        long j = this.f6042b;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        if (this.f6041a) {
            return "OptionalLong[" + this.f6042b + "]";
        }
        return "OptionalLong.empty";
    }
}
