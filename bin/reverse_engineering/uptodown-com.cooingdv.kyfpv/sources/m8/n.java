package m8;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String[] f7764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f7765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7766d;

    public n(o oVar) {
        this.f7763a = oVar.f7768a;
        this.f7764b = oVar.f7770c;
        this.f7765c = oVar.f7771d;
        this.f7766d = oVar.f7769b;
    }

    public final void a(String... strArr) {
        if (!this.f7763a) {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("no cipher suites for cleartext connections");
        } else if (strArr.length != 0) {
            this.f7764b = (String[]) strArr.clone();
        } else {
            com.google.gson.internal.a.p("At least one cipher suite is required");
        }
    }

    public final void b(String... strArr) {
        if (!this.f7763a) {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("no TLS versions for cleartext connections");
        } else if (strArr.length != 0) {
            this.f7765c = (String[]) strArr.clone();
        } else {
            com.google.gson.internal.a.p("At least one TLS version is required");
        }
    }

    public n(boolean z9) {
        this.f7763a = z9;
    }
}
