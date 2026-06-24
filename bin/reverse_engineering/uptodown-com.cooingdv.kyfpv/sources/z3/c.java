package z3;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.k;
import c4.wd;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f11932q = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f11933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y3.d f11934b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y3.e f11935l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f11936m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public d7.a f11937n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final LinkedHashSet f11938o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f11939p;

    public c(Context context, wd wdVar) {
        super(context, null, 0);
        f fVar = new f(context, wdVar);
        this.f11933a = fVar;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        y3.d dVar = new y3.d(applicationContext);
        this.f11934b = dVar;
        y3.e eVar = new y3.e();
        this.f11935l = eVar;
        this.f11937n = new k(21);
        this.f11938o = new LinkedHashSet();
        this.f11939p = true;
        addView(fVar, new FrameLayout.LayoutParams(-1, -1));
        g gVar = fVar.f11943l;
        gVar.a(eVar);
        gVar.a(new a(this, 0));
        gVar.a(new a(this, 1));
        dVar.f11799b.add(new b(this));
    }

    public final void a(w3.a aVar, boolean z9, k9.b bVar, String str) {
        if (this.f11936m) {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("This YouTubePlayerView has already been initialized.");
            return;
        }
        if (z9) {
            this.f11934b.a();
        }
        androidx.work.impl.utils.f fVar = new androidx.work.impl.utils.f(this, bVar, str, aVar, 1);
        this.f11937n = fVar;
        if (z9) {
            return;
        }
        fVar.invoke();
    }

    public final boolean getCanPlay$core_release() {
        return this.f11939p;
    }

    public final f getWebViewYouTubePlayer$core_release() {
        return this.f11933a;
    }

    public final void setCustomPlayerUi(View view) {
        view.getClass();
        removeViews(1, getChildCount() - 1);
        addView(view);
    }

    public final void setYouTubePlayerReady$core_release(boolean z9) {
        this.f11936m = z9;
    }
}
