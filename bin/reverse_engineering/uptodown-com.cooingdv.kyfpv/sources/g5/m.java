package g5;

import android.content.Context;
import androidx.leanback.widget.Presenter;
import e1.s0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f5335b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x4.g f5336l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Presenter.ViewHolder f5337m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, x4.g gVar, Presenter.ViewHolder viewHolder, t6.c cVar) {
        super(2, cVar);
        this.f5335b = nVar;
        this.f5336l = gVar;
        this.f5337m = viewHolder;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        return new m(this.f5335b, this.f5336l, this.f5337m, cVar);
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((o7.a0) obj, (t6.c) obj2)).invokeSuspend(p6.x.f8464a);
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        int i = this.f5334a;
        n nVar = this.f5335b;
        if (i == 0) {
            p6.a.e(obj);
            Context contextRequireContext = nVar.requireContext();
            contextRequireContext.getClass();
            s0 s0Var = new s0(contextRequireContext, this.f5336l.f11159a);
            this.f5334a = 1;
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
        Presenter.ViewHolder viewHolder = this.f5337m;
        if (!(objA instanceof p6.j)) {
            x4.g gVar = (x4.g) objA;
            if (nVar.getActivity() != null && (nVar.getActivity() instanceof f5.a)) {
                try {
                    f5.a aVar2 = (f5.a) nVar.getActivity();
                    aVar2.getClass();
                    aVar2.j(gVar, viewHolder);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
        return p6.x.f8464a;
    }
}
