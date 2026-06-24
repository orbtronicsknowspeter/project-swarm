package y8;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class p extends d9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b9.o f11879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11881c;

    public p(b9.o oVar) {
        this.f11879a = oVar;
    }

    @Override // d9.a
    public final boolean b(b9.a aVar) {
        if (!(aVar instanceof b9.p)) {
            return false;
        }
        if (this.f11880b && this.f11881c == 1) {
            this.f11879a.f = false;
            this.f11880b = false;
        }
        return true;
    }

    @Override // d9.a
    public final b9.a d() {
        return this.f11879a;
    }

    @Override // d9.a
    public final boolean e() {
        return true;
    }

    @Override // d9.a
    public final a g(h hVar) {
        if (hVar.h) {
            this.f11880b = true;
            this.f11881c = 0;
        } else if (this.f11880b) {
            this.f11881c++;
        }
        return a.a(hVar.f11834b);
    }
}
