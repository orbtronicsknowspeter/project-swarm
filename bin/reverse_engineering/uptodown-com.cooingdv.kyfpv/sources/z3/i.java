package z3;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends w3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f11952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ YouTubePlayerView f11953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f11954c;

    public i(String str, YouTubePlayerView youTubePlayerView, boolean z9) {
        this.f11952a = str;
        this.f11953b = youTubePlayerView;
        this.f11954c = z9;
    }

    @Override // w3.a
    public final void c(v3.e eVar) {
        eVar.getClass();
        String str = this.f11952a;
        if (str != null) {
            if (this.f11953b.f3285b.getCanPlay$core_release() && this.f11954c) {
                ((g) eVar).d(str, 0.0f);
            } else {
                ((g) eVar).b(str, 0.0f);
            }
        }
        g gVar = (g) eVar;
        synchronized (gVar.f11949c) {
            gVar.f11950d.remove(this);
        }
    }
}
