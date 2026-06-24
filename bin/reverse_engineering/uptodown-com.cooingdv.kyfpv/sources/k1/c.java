package k1;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6942a;

    public c(Object obj) {
        this.f6942a = obj;
    }

    @Override // k1.b
    public final Object a() {
        return this.f6942a;
    }

    @Override // k1.b
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f6942a.equals(((c) obj).f6942a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6942a.hashCode() + 1502476572;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f6942a);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }
}
