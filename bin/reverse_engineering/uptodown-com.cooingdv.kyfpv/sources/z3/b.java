package z3;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f11931a;

    public b(c cVar) {
        this.f11931a = cVar;
    }

    public final void a() {
        c cVar = this.f11931a;
        if (!cVar.f11936m) {
            cVar.f11937n.invoke();
            return;
        }
        y3.e eVar = cVar.f11935l;
        v3.e youtubePlayer$core_release = cVar.getWebViewYouTubePlayer$core_release().getYoutubePlayer$core_release();
        eVar.getClass();
        youtubePlayer$core_release.getClass();
        String str = eVar.f11805d;
        if (str == null) {
            return;
        }
        boolean z9 = eVar.f11803b;
        v3.c cVar2 = v3.c.f10828l;
        if (z9 && eVar.f11804c == cVar2) {
            boolean z10 = eVar.f11802a;
            float f = eVar.f11806e;
            if (z10) {
                ((g) youtubePlayer$core_release).d(str, f);
            } else {
                ((g) youtubePlayer$core_release).b(str, f);
            }
        } else if (!z9 && eVar.f11804c == cVar2) {
            ((g) youtubePlayer$core_release).b(str, eVar.f11806e);
        }
        eVar.f11804c = null;
    }
}
