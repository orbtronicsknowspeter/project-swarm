package x4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f11308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f11311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f11312e;
    public String f;
    public String g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2)) {
            return false;
        }
        o2 o2Var = (o2) obj;
        return this.f11308a == o2Var.f11308a && this.f11309b == o2Var.f11309b && this.f11310c == o2Var.f11310c && kotlin.jvm.internal.l.a(this.f11311d, o2Var.f11311d) && kotlin.jvm.internal.l.a(this.f11312e, o2Var.f11312e) && kotlin.jvm.internal.l.a(this.f, o2Var.f) && kotlin.jvm.internal.l.a(this.g, o2Var.g);
    }

    public final int hashCode() {
        long j = this.f11308a;
        int i = ((((((int) (j ^ (j >>> 32))) * 31) + this.f11309b) * 31) + this.f11310c) * 31;
        String str = this.f11311d;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f11312e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        long j = this.f11308a;
        int i = this.f11309b;
        int i6 = this.f11310c;
        String str = this.f11311d;
        String str2 = this.f11312e;
        String str3 = this.f;
        String str4 = this.g;
        StringBuilder sb = new StringBuilder("FloatingCategoryTopExtraData(lastUpdate=");
        sb.append(j);
        sb.append(", totalApps=");
        sb.append(i);
        sb.append(", editorID=");
        sb.append(i6);
        sb.append(", editorName=");
        sb.append(str);
        a4.x.B(sb, ", editorAvatar=", str2, ", editorJobTitle=", str3);
        return a4.x.o(sb, ", url=", str4, ")");
    }
}
