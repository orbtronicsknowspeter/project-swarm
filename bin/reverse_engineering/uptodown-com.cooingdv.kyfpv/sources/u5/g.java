package u5;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f10718b;

    public g(int i, i iVar) {
        iVar.getClass();
        this.f10717a = i;
        this.f10718b = iVar;
    }

    public final String a() throws w5.e {
        int i = this.f10717a;
        if (i <= 0) {
            throw new w5.e(kotlin.jvm.internal.l.g(": TCModelError, cannot hash invalid PurposeRestriction", "f.k"));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append('-');
        sb.append(this.f10718b.f10727a);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f10717a == gVar.f10717a && this.f10718b == gVar.f10718b;
    }

    public final int hashCode() {
        return this.f10718b.hashCode() + (this.f10717a * 31);
    }

    public final String toString() {
        return "PurposeRestriction(purposeId=" + this.f10717a + ", restrictionType=" + this.f10718b + ')';
    }
}
