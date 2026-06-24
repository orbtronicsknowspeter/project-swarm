package g5;

import android.content.Context;
import androidx.leanback.widget.Presenter;
import com.uptodown.tv.ui.fragment.TvMyAppsFragment;
import e1.s0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class z extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TvMyAppsFragment f5367b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f5368l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Presenter.ViewHolder f5369m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(TvMyAppsFragment tvMyAppsFragment, long j, Presenter.ViewHolder viewHolder, t6.c cVar) {
        super(2, cVar);
        this.f5367b = tvMyAppsFragment;
        this.f5368l = j;
        this.f5369m = viewHolder;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        return new z(this.f5367b, this.f5368l, this.f5369m, cVar);
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((o7.a0) obj, (t6.c) obj2)).invokeSuspend(p6.x.f8464a);
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        int i = this.f5366a;
        TvMyAppsFragment tvMyAppsFragment = this.f5367b;
        if (i == 0) {
            p6.a.e(obj);
            Context contextRequireContext = tvMyAppsFragment.requireContext();
            contextRequireContext.getClass();
            s0 s0Var = new s0(contextRequireContext, this.f5368l);
            this.f5366a = 1;
            objA = s0Var.a(this);
            u6.a aVar = u6.a.f10763a;
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p6.a.e(obj);
            objA = ((p6.k) obj).f8445a;
        }
        if (!(objA instanceof p6.j)) {
            x4.g gVar = (x4.g) objA;
            if (tvMyAppsFragment.getActivity() != null) {
                f5.a aVar2 = (f5.a) tvMyAppsFragment.getActivity();
                aVar2.getClass();
                aVar2.j(gVar, this.f5369m);
            }
        }
        return p6.x.f8464a;
    }
}
