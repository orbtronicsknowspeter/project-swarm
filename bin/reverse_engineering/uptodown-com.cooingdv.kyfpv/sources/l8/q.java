package l8;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7257c;

    public q(String str, String str2, String str3) {
        this.f7255a = str;
        this.f7256b = str2;
        this.f7257c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return kotlin.jvm.internal.l.a(this.f7255a, qVar.f7255a) && kotlin.jvm.internal.l.a(this.f7256b, qVar.f7256b) && kotlin.jvm.internal.l.a(this.f7257c, qVar.f7257c);
    }

    public final int hashCode() {
        String str = this.f7255a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f7256b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f7257c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "TranslationUrls(common=" + ((Object) this.f7255a) + ", theme=" + ((Object) this.f7256b) + ", all=" + ((Object) this.f7257c) + ')';
    }
}
