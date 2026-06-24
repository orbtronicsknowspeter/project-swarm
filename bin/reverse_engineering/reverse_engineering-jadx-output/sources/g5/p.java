package g5;

import android.content.Context;
import androidx.leanback.widget.Presenter;
import e1.s0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class p extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f5346b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x4.g f5347l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Presenter.ViewHolder f5348m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, x4.g gVar, Presenter.ViewHolder viewHolder, t6.c cVar) {
        super(2, cVar);
        this.f5346b = qVar;
        this.f5347l = gVar;
        this.f5348m = viewHolder;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        return new p(this.f5346b, this.f5347l, this.f5348m, cVar);
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((o7.a0) obj, (t6.c) obj2)).invokeSuspend(p6.x.f8463a);
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        int i = this.f5345a;
        q qVar = this.f5346b;
        if (i == 0) {
            p6.a.e(obj);
            Context contextRequireContext = qVar.requireContext();
            contextRequireContext.getClass();
            s0 s0Var = new s0(contextRequireContext, this.f5347l.f11158a);
            this.f5345a = 1;
            objA = s0Var.a(this);
            u6.a aVar = u6.a.f10762a;
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p6.a.e(obj);
            objA = ((p6.k) obj).f8444a;
        }
        Presenter.ViewHolder viewHolder = this.f5348m;
        if (!(objA instanceof p6.j)) {
            x4.g gVar = (x4.g) objA;
            if (qVar.getActivity() != null && (qVar.getActivity() instanceof f5.a)) {
                try {
                    f5.a aVar2 = (f5.a) qVar.getActivity();
                    aVar2.getClass();
                    aVar2.j(gVar, viewHolder);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
        return p6.x.f8463a;
    }
}
