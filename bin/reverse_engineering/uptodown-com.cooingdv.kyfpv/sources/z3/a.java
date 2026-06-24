package z3;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends w3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f11930b;

    public /* synthetic */ a(c cVar, int i) {
        this.f11929a = i;
        this.f11930b = cVar;
    }

    @Override // w3.a
    public void c(v3.e eVar) {
        switch (this.f11929a) {
            case 1:
                eVar.getClass();
                c cVar = this.f11930b;
                cVar.setYouTubePlayerReady$core_release(true);
                Iterator it = cVar.f11938o.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    com.google.gson.internal.a.o();
                    return;
                }
                cVar.f11938o.clear();
                g gVar = (g) eVar;
                synchronized (gVar.f11949c) {
                    gVar.f11950d.remove(this);
                }
                return;
            default:
                super.c(eVar);
                return;
        }
    }

    @Override // w3.a
    public void d(v3.e eVar, v3.d dVar) {
        switch (this.f11929a) {
            case 0:
                eVar.getClass();
                if (dVar == v3.d.f10836m) {
                    c cVar = this.f11930b;
                    if (!cVar.f11939p && !cVar.f11933a.f11945n) {
                        ((g) eVar).e();
                        break;
                    }
                }
                break;
            default:
                super.d(eVar, dVar);
                break;
        }
    }
}
