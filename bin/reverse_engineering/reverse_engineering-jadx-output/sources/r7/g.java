package r7;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f8977a;

    public g(h hVar) {
        this.f8977a = hVar;
    }

    @Override // r7.h
    public final Object collect(i iVar, t6.c cVar) {
        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
        xVar.f7024a = s7.c.f9349b;
        Object objCollect = this.f8977a.collect(new f(this, xVar, iVar), cVar);
        return objCollect == u6.a.f10762a ? objCollect : p6.x.f8463a;
    }
}
