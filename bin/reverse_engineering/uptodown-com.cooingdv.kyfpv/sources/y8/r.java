package y8;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class r extends d9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b9.s f11885a = new b9.s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f11886b = new n();

    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    @Override // d9.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.CharSequence r12) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y8.r.a(java.lang.CharSequence):void");
    }

    @Override // d9.a
    public final void c() {
        if (this.f11886b.f11873b.length() == 0) {
            this.f11885a.f();
        }
    }

    @Override // d9.a
    public final b9.a d() {
        return this.f11885a;
    }

    @Override // d9.a
    public final void f(m mVar) {
        StringBuilder sb = this.f11886b.f11873b;
        if (sb.length() > 0) {
            mVar.f(sb.toString(), this.f11885a);
        }
    }

    @Override // d9.a
    public final a g(h hVar) {
        if (hVar.h) {
            return null;
        }
        return a.a(hVar.f11834b);
    }
}
