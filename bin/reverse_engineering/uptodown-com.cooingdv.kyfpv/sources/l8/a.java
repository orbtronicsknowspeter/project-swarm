package l8;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7180b;

    public a(boolean z9, boolean z10) {
        this.f7179a = z9;
        this.f7180b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f7179a == aVar.f7179a && this.f7180b == aVar.f7180b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public final int hashCode() {
        boolean z9 = this.f7179a;
        ?? r12 = z9;
        if (z9) {
            r12 = 1;
        }
        int i = r12 * 31;
        boolean z10 = this.f7180b;
        return i + (z10 ? 1 : z10);
    }

    public final String toString() {
        return "ActionButtonSettings(action1Enabled=" + this.f7179a + ", action2Enabled=" + this.f7180b + ')';
    }
}
