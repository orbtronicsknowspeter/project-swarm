package r7;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements m0, h, s7.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0 f8973a;

    public e0(c0 c0Var) {
        this.f8973a = c0Var;
    }

    @Override // s7.i
    public final h a(t6.h hVar, int i, q7.a aVar) {
        return (((i < 0 || i >= 2) && i != -2) || aVar != q7.a.f8731b) ? k0.m(this, hVar, i, aVar) : this;
    }

    @Override // r7.h
    public final Object collect(i iVar, t6.c cVar) {
        return this.f8973a.collect(iVar, cVar);
    }

    @Override // r7.m0
    public final Object getValue() {
        return this.f8973a.getValue();
    }
}
