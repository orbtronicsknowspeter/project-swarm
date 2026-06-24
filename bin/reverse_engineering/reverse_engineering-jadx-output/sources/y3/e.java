package y3;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends w3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f11801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v3.c f11803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f11804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f11805e;

    @Override // w3.a
    public final void a(v3.e eVar, float f) {
        eVar.getClass();
        this.f11805e = f;
    }

    @Override // w3.a
    public final void b(v3.e eVar, v3.c cVar) {
        eVar.getClass();
        if (cVar == v3.c.f10827l) {
            this.f11803c = cVar;
        }
    }

    @Override // w3.a
    public final void d(v3.e eVar, v3.d dVar) {
        eVar.getClass();
        int iOrdinal = dVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                this.f11802b = true;
                return;
            } else if (iOrdinal != 4) {
                return;
            }
        }
        this.f11802b = false;
    }

    @Override // w3.a
    public final void f(v3.e eVar, String str) {
        eVar.getClass();
        this.f11804d = str;
    }
}
