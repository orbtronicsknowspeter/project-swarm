package r;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class d implements l2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f8806a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l2.c f8807b = new l2.c("logSource", k0.k.j(k0.k.i(o2.e.class, new o2.a(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l2.c f8808c = new l2.c("logEventDropped", k0.k.j(k0.k.i(o2.e.class, new o2.a(2))));

    @Override // l2.a
    public final void a(Object obj, Object obj2) {
        u.e eVar = (u.e) obj;
        l2.e eVar2 = (l2.e) obj2;
        eVar2.a(f8807b, eVar.f10388a);
        eVar2.a(f8808c, eVar.f10389b);
    }
}
