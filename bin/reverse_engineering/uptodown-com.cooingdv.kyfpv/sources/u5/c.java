package u5;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10710b;

    public c(String str, String str2) {
        this.f10709a = str;
        this.f10710b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.l.a(this.f10709a, cVar.f10709a) && this.f10710b.equals(cVar.f10710b);
    }

    public final int hashCode() {
        String str = this.f10709a;
        return this.f10710b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "GPPEncodingResult(gppString=" + ((Object) this.f10709a) + ", tcString=" + ((Object) this.f10710b) + ')';
    }
}
