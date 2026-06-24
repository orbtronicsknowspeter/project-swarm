package s1;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class p implements s2.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f9147c = new o(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f9148d = new e(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s2.a f9149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile s2.b f9150b;

    public p(o oVar, s2.b bVar) {
        this.f9149a = oVar;
        this.f9150b = bVar;
    }

    public final void a(s2.a aVar) {
        s2.b bVar;
        s2.b bVar2;
        s2.b bVar3 = this.f9150b;
        e eVar = f9148d;
        if (bVar3 != eVar) {
            aVar.b(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f9150b;
            if (bVar != eVar) {
                bVar2 = bVar;
            } else {
                this.f9149a = new a3.e(5, this.f9149a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.b(bVar);
        }
    }

    @Override // s2.b
    public final Object get() {
        return this.f9150b.get();
    }
}
