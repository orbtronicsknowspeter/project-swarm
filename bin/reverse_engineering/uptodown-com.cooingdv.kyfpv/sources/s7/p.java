package s7;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class p implements t6.c, v6.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t6.c f9379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t6.h f9380b;

    public p(t6.c cVar, t6.h hVar) {
        this.f9379a = cVar;
        this.f9380b = hVar;
    }

    @Override // v6.d
    public final v6.d getCallerFrame() {
        t6.c cVar = this.f9379a;
        if (cVar instanceof v6.d) {
            return (v6.d) cVar;
        }
        return null;
    }

    @Override // t6.c
    public final t6.h getContext() {
        return this.f9380b;
    }

    @Override // t6.c
    public final void resumeWith(Object obj) {
        this.f9379a.resumeWith(obj);
    }
}
