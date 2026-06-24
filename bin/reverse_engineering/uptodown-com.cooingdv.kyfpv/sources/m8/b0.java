package m8;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a0 f7684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y f7685b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f7687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r f7688e;
    public e0 g;
    public c0 h;
    public c0 i;
    public c0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f7689k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f7690l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7686c = -1;
    public g5.f f = new g5.f(9);

    public static void b(String str, c0 c0Var) {
        if (c0Var.f7699p != null) {
            com.google.gson.internal.a.p(str.concat(".body != null"));
            return;
        }
        if (c0Var.f7700q != null) {
            com.google.gson.internal.a.p(str.concat(".networkResponse != null"));
        } else if (c0Var.f7701r != null) {
            com.google.gson.internal.a.p(str.concat(".cacheResponse != null"));
        } else {
            if (c0Var.f7702s == null) {
                return;
            }
            com.google.gson.internal.a.p(str.concat(".priorResponse != null"));
        }
    }

    public final c0 a() {
        if (this.f7684a == null) {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("request == null");
            return null;
        }
        if (this.f7685b == null) {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("protocol == null");
            return null;
        }
        if (this.f7686c < 0) {
            com.google.gson.internal.a.f(this.f7686c, "code < 0: ");
            return null;
        }
        if (this.f7687d != null) {
            return new c0(this);
        }
        androidx.privacysandbox.ads.adservices.customaudience.a.i("message == null");
        return null;
    }
}
