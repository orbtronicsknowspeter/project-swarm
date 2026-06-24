package x7;

import o7.c2;
import t7.s;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f11523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11524b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f11525l;

    public d(g gVar, d dVar, Object obj) {
        this.f11525l = gVar;
        this.f11523a = dVar;
        this.f11524b = obj;
    }

    @Override // o7.c2
    public final void a(s sVar, int i) {
        this.f11523a.a(sVar, i);
    }

    public final void b(Object obj) {
        g.f11528q.set(this.f11525l, this.f11524b);
        this.f11523a.b(obj);
    }

    public final boolean c(Object obj, Object obj2) {
        boolean zC = this.f11523a.c(obj, obj2);
        if (zC) {
            g.f11528q.set(this.f11525l, this.f11524b);
        }
        return zC;
    }
}
