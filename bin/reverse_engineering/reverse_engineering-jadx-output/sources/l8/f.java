package l8;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f7193c;

    public f(Integer num, String str, String str2) {
        this.f7191a = str;
        this.f7192b = str2;
        this.f7193c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.l.a(this.f7191a, fVar.f7191a) && kotlin.jvm.internal.l.a(this.f7192b, fVar.f7192b) && this.f7193c.equals(fVar.f7193c);
    }

    public final int hashCode() {
        String str = this.f7191a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f7192b;
        return this.f7193c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "FontDetail(fontUrl=" + ((Object) this.f7191a) + ", fontName=" + ((Object) this.f7192b) + ", fontSize=" + this.f7193c + ')';
    }
}
