package z3;

import android.content.Context;
import android.webkit.WebView;
import c4.wd;
import java.util.Collection;
import java.util.List;
import q6.l;
import v3.j;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends WebView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wd f11941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f11942b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g f11943l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public androidx.room.b f11944m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f11945n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final v3.h f11946o;

    public f(Context context, wd wdVar) {
        super(context, null, 0);
        this.f11941a = wdVar;
        j jVar = new j();
        this.f11942b = jVar;
        this.f11943l = new g(this, jVar);
        this.f11946o = new v3.h(this);
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        g gVar = this.f11943l;
        synchronized (gVar.f11949c) {
            gVar.f11950d.clear();
        }
        gVar.f11948b.removeCallbacksAndMessages(null);
        super.destroy();
    }

    public v3.e getInstance() {
        return this.f11943l;
    }

    public Collection<w3.a> getListeners() {
        List listG0;
        g gVar = this.f11943l;
        synchronized (gVar.f11949c) {
            listG0 = l.G0(gVar.f11950d);
        }
        return listG0;
    }

    public final v3.e getYoutubePlayer$core_release() {
        return this.f11943l;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowVisibilityChanged(int i) {
        if (this.f11945n && (i == 8 || i == 4)) {
            return;
        }
        super.onWindowVisibilityChanged(i);
    }

    public final void setBackgroundPlaybackEnabled$core_release(boolean z9) {
        this.f11945n = z9;
    }
}
