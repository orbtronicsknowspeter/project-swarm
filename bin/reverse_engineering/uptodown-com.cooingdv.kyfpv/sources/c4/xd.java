package c4;

import android.view.View;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.uptodown.UptodownApp;
import com.uptodown.activities.YouTubeActivity;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class xd extends w3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2322c;

    public /* synthetic */ xd(int i, Object obj, Object obj2) {
        this.f2320a = i;
        this.f2321b = obj;
        this.f2322c = obj2;
    }

    @Override // w3.a
    public void a(v3.e eVar, float f) {
        switch (this.f2320a) {
            case 1:
                eVar.getClass();
                UptodownApp.f3289b0.put(((e4.m1) this.f2321b).i, Float.valueOf(f));
                break;
            default:
                super.a(eVar, f);
                break;
        }
    }

    @Override // w3.a
    public void b(v3.e eVar, v3.c cVar) {
        switch (this.f2320a) {
            case 0:
                eVar.getClass();
                ((YouTubeActivity) this.f2321b).finish();
                break;
            default:
                super.b(eVar, cVar);
                break;
        }
    }

    @Override // w3.a
    public final void c(v3.e eVar) {
        int i = this.f2320a;
        Object obj = this.f2322c;
        switch (i) {
            case 0:
                eVar.getClass();
                int i6 = YouTubeActivity.Q;
                ((z3.g) eVar).d((String) obj, 0.0f);
                break;
            default:
                e4.m1 m1Var = (e4.m1) this.f2321b;
                YouTubePlayerView youTubePlayerView = m1Var.g;
                eVar.getClass();
                if (UptodownApp.U == 0) {
                    youTubePlayerView.getClass();
                    if (youTubePlayerView.getHeight() != 0) {
                        youTubePlayerView.getClass();
                        UptodownApp.U = youTubePlayerView.getHeight();
                        youTubePlayerView.getClass();
                        UptodownApp.V = youTubePlayerView.getWidth();
                    }
                }
                l5.c cVar = new l5.c((View) obj, eVar);
                m1Var.f4637n = cVar;
                z3.g gVar = (z3.g) eVar;
                gVar.a(cVar);
                gVar.c(gVar.f11947a, "mute", new Object[0]);
                m1Var.h = eVar;
                m1Var.f4635l = true;
                m1Var.notifyItemChanged(0);
                break;
        }
    }

    @Override // w3.a
    public void d(v3.e eVar, v3.d dVar) {
        switch (this.f2320a) {
            case 1:
                e4.m1 m1Var = (e4.m1) this.f2321b;
                eVar.getClass();
                v3.d dVar2 = v3.d.f10838o;
                if (dVar == dVar2 && m1Var.f) {
                    ((z3.g) eVar).f();
                }
                if (dVar == dVar2 && kotlin.jvm.internal.l.a(m1Var.f4632d, kotlin.jvm.internal.y.a(u4.m1.class).c())) {
                    ((z3.g) eVar).f();
                }
                if (dVar == v3.d.f10837n) {
                    m1Var.f4636m = false;
                }
                if (dVar == v3.d.f10836m) {
                    m1Var.f4636m = true;
                }
                break;
            default:
                super.d(eVar, dVar);
                break;
        }
    }
}
