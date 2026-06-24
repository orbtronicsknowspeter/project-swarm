package b2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d2 f894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e2 f895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f2 f896e;
    public i2 f;
    public byte g;

    public final p0 a() {
        String str;
        d2 d2Var;
        e2 e2Var;
        if (this.g == 1 && (str = this.f893b) != null && (d2Var = this.f894c) != null && (e2Var = this.f895d) != null) {
            return new p0(this.f892a, str, d2Var, e2Var, this.f896e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if ((1 & this.g) == 0) {
            sb.append(" timestamp");
        }
        if (this.f893b == null) {
            sb.append(" type");
        }
        if (this.f894c == null) {
            sb.append(" app");
        }
        if (this.f895d == null) {
            sb.append(" device");
        }
        androidx.privacysandbox.ads.adservices.customaudience.a.i(k0.k.h("Missing required properties:", sb));
        return null;
    }
}
