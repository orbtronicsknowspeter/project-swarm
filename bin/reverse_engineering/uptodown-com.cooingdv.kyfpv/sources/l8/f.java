package l8;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f7194c;

    public f(Integer num, String str, String str2) {
        this.f7192a = str;
        this.f7193b = str2;
        this.f7194c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.l.a(this.f7192a, fVar.f7192a) && kotlin.jvm.internal.l.a(this.f7193b, fVar.f7193b) && this.f7194c.equals(fVar.f7194c);
    }

    public final int hashCode() {
        String str = this.f7192a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f7193b;
        return this.f7194c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "FontDetail(fontUrl=" + ((Object) this.f7192a) + ", fontName=" + ((Object) this.f7193b) + ", fontSize=" + this.f7194c + ')';
    }
}
