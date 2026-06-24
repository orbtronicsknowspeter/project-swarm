package m8;

import androidx.leanback.media.MediaPlayerGlue;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class w {
    public g i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f7805m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b f7806n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final m f7807o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f7808p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f7809q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f7810r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f7811s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f7812t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f7813u;
    public final int v;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f7801d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f7802e = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f7798a = new q(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f7799b = x.H;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f7800c = x.I;
    public final b f = new b();
    public final ProxySelector g = ProxySelector.getDefault();
    public final b h = b.f7680b;
    public final SocketFactory j = SocketFactory.getDefault();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final v8.c f7803k = v8.c.f10905a;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j f7804l = j.f7744c;

    public w() {
        b bVar = b.f7679a;
        this.f7805m = bVar;
        this.f7806n = bVar;
        this.f7807o = new m();
        this.f7808p = b.f7681c;
        this.f7809q = true;
        this.f7810r = true;
        this.f7811s = true;
        this.f7812t = MediaPlayerGlue.FAST_FORWARD_REWIND_STEP;
        this.f7813u = MediaPlayerGlue.FAST_FORWARD_REWIND_STEP;
        this.v = MediaPlayerGlue.FAST_FORWARD_REWIND_STEP;
    }
}
