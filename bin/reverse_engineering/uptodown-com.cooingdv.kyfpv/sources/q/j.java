package q;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class j implements l2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f8589a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l2.c f8590b = l2.c.a("requestTimeMs");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l2.c f8591c = l2.c.a("requestUptimeMs");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l2.c f8592d = l2.c.a("clientInfo");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l2.c f8593e = l2.c.a("logSource");
    public static final l2.c f = l2.c.a("logSourceName");
    public static final l2.c g = l2.c.a("logEvent");
    public static final l2.c h = l2.c.a("qosTier");

    @Override // l2.a
    public final void a(Object obj, Object obj2) {
        l2.e eVar = (l2.e) obj2;
        t tVar = (t) ((f0) obj);
        eVar.f(f8590b, tVar.f8618a);
        eVar.f(f8591c, tVar.f8619b);
        eVar.a(f8592d, tVar.f8620c);
        eVar.a(f8593e, tVar.f8621d);
        eVar.a(f, tVar.f8622e);
        eVar.a(g, tVar.f);
        eVar.a(h, j0.f8594a);
    }
}
