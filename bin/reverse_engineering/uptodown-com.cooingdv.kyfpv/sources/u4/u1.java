package u4;

import androidx.fragment.app.FragmentActivity;
import com.uptodown.R;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class u1 extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f10620b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z1 f10621l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u1(Throwable th, z1 z1Var, t6.c cVar, int i) {
        super(2, cVar);
        this.f10619a = i;
        this.f10620b = th;
        this.f10621l = z1Var;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f10619a) {
            case 0:
                return new u1(this.f10620b, this.f10621l, cVar, 0);
            default:
                return new u1(this.f10620b, this.f10621l, cVar, 1);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f10619a) {
            case 0:
                u1 u1Var = (u1) create(a0Var, cVar);
                p6.x xVar = p6.x.f8464a;
                u1Var.invokeSuspend(xVar);
                return xVar;
            default:
                u1 u1Var2 = (u1) create(a0Var, cVar);
                p6.x xVar2 = p6.x.f8464a;
                u1Var2.invokeSuspend(xVar2);
                return xVar2;
        }
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f10619a;
        p6.x xVar = p6.x.f8464a;
        z1 z1Var = this.f10621l;
        Throwable th = this.f10620b;
        switch (i) {
            case 0:
                p6.a.e(obj);
                int i6 = s4.y0.f9324l;
                if (!d0.b.J(th)) {
                    if (z1Var.getActivity() instanceof c4.k0) {
                        FragmentActivity activity = z1Var.getActivity();
                        activity.getClass();
                        String string = z1Var.getString(R.string.app_detail_not_found);
                        string.getClass();
                        ((c4.k0) activity).A(string);
                    }
                } else if (z1Var.getActivity() instanceof c4.k0) {
                    FragmentActivity activity2 = z1Var.getActivity();
                    activity2.getClass();
                    ((c4.k0) activity2).J();
                }
                break;
            default:
                p6.a.e(obj);
                int i10 = s4.y0.f9324l;
                if (!d0.b.J(th)) {
                    if (z1Var.getActivity() instanceof c4.k0) {
                        FragmentActivity activity3 = z1Var.getActivity();
                        activity3.getClass();
                        String string2 = z1Var.getString(R.string.error_generico);
                        string2.getClass();
                        ((c4.k0) activity3).N(string2);
                    }
                } else if (z1Var.getActivity() instanceof c4.k0) {
                    FragmentActivity activity4 = z1Var.getActivity();
                    activity4.getClass();
                    ((c4.k0) activity4).J();
                }
                break;
        }
        return xVar;
    }
}
