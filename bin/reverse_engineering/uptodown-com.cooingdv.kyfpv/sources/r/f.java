package r;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class f implements l2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f8810a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l2.c f8811b = new l2.c("currentCacheSizeBytes", k0.k.j(k0.k.i(o2.e.class, new o2.a(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l2.c f8812c = new l2.c("maxCacheSizeBytes", k0.k.j(k0.k.i(o2.e.class, new o2.a(2))));

    @Override // l2.a
    public final void a(Object obj, Object obj2) {
        u.f fVar = (u.f) obj;
        l2.e eVar = (l2.e) obj2;
        eVar.f(f8811b, fVar.f10390a);
        eVar.f(f8812c, fVar.f10391b);
    }
}
