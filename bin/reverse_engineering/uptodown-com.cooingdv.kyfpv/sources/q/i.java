package q;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class i implements l2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f8584a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l2.c f8585b = l2.c.a("eventTimeMs");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l2.c f8586c = l2.c.a("eventCode");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l2.c f8587d = l2.c.a("complianceData");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l2.c f8588e = l2.c.a("eventUptimeMs");
    public static final l2.c f = l2.c.a("sourceExtension");
    public static final l2.c g = l2.c.a("sourceExtensionJsonProto3");
    public static final l2.c h = l2.c.a("timezoneOffsetSeconds");
    public static final l2.c i = l2.c.a("networkConnectionInfo");
    public static final l2.c j = l2.c.a("experimentIds");

    @Override // l2.a
    public final void a(Object obj, Object obj2) {
        l2.e eVar = (l2.e) obj2;
        s sVar = (s) ((e0) obj);
        eVar.f(f8585b, sVar.f8613a);
        eVar.a(f8586c, sVar.f8614b);
        eVar.a(f8587d, sVar.f8615c);
        eVar.f(f8588e, sVar.f8616d);
        eVar.a(f, sVar.f8617e);
        eVar.a(g, sVar.f);
        eVar.f(h, sVar.g);
        eVar.a(i, sVar.h);
        eVar.a(j, sVar.i);
    }
}
