package k0;

import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements d, b, c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static l f6906b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final m f6907l = new m(0, 0, 0, false, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f6908a;

    public l(e eVar) {
        Objects.requireNonNull(eVar);
        this.f6908a = eVar;
    }

    public static synchronized l b() {
        try {
            if (f6906b == null) {
                f6906b = new l();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f6906b;
    }

    @Override // k0.c
    public void a(h0.b bVar) {
        ((i0.f) this.f6908a).a(bVar);
    }

    @Override // k0.b
    public void c(int i) {
        ((i0.e) this.f6908a).c(i);
    }

    @Override // k0.b
    public void d() {
        ((i0.e) this.f6908a).d();
    }

    @Override // k0.d
    public void g(h0.b bVar) {
        boolean z9 = bVar.f5396b == 0;
        e eVar = (e) this.f6908a;
        if (z9) {
            eVar.h(null, eVar.s());
            return;
        }
        c cVar = eVar.f6854y;
        if (cVar != null) {
            cVar.a(bVar);
        }
    }

    public /* synthetic */ l(Object obj) {
        this.f6908a = obj;
    }
}
