package j$.util;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b0 f5972b = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5973a;

    public b0() {
        this.f5973a = null;
    }

    public b0(Object obj) {
        this.f5973a = Objects.requireNonNull(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b0) {
            return Objects.equals(this.f5973a, ((b0) obj).f5973a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f5973a);
    }

    public final String toString() {
        Object obj = this.f5973a;
        return obj != null ? String.format("Optional[%s]", obj) : "Optional.empty";
    }
}
