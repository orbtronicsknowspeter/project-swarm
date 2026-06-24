package b2;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements l2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f876a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l2.c f877b = l2.c.a(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l2.c f878c = l2.c.a("reason");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l2.c f879d = l2.c.a("frames");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l2.c f880e = l2.c.a("causedBy");
    public static final l2.c f = l2.c.a("overflowCount");

    @Override // l2.a
    public final void a(Object obj, Object obj2) {
        l2.e eVar = (l2.e) obj2;
        t0 t0Var = (t0) ((x1) obj);
        eVar.a(f877b, t0Var.f940a);
        eVar.a(f878c, t0Var.f941b);
        eVar.a(f879d, t0Var.f942c);
        eVar.a(f880e, t0Var.f943d);
        eVar.e(f, t0Var.f944e);
    }
}
