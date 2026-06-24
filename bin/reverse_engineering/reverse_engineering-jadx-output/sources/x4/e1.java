package x4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f11139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11140c;

    public final String a() {
        String str = this.f11140c;
        if (str == null) {
            return null;
        }
        str.getClass();
        return str.substring(l7.m.A0("/", str, 6) + 1);
    }

    public final String toString() {
        String str = this.f11138a;
        long j = this.f11139b;
        String str2 = this.f11140c;
        StringBuilder sb = new StringBuilder("{sha256='");
        sb.append(str);
        sb.append("', size=");
        sb.append(j);
        return a4.x.o(sb, ", absolutePath='", str2, "'}");
    }
}
