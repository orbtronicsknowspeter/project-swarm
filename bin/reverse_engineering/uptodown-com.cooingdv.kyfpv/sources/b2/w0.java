package b2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f968e;
    public byte f;

    public final x0 a() {
        String str;
        if (this.f == 7 && (str = this.f965b) != null) {
            return new x0(this.f964a, str, this.f966c, this.f967d, this.f968e);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f & 1) == 0) {
            sb.append(" pc");
        }
        if (this.f965b == null) {
            sb.append(" symbol");
        }
        if ((this.f & 2) == 0) {
            sb.append(" offset");
        }
        if ((this.f & 4) == 0) {
            sb.append(" importance");
        }
        androidx.privacysandbox.ads.adservices.customaudience.a.i(k0.k.h("Missing required properties:", sb));
        return null;
    }
}
