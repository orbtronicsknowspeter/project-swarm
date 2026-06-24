package u4;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AppDetailActivity;
import com.uptodown.activities.ListsActivity;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.MoreInfo;
import com.uptodown.activities.PreregistrationActivity;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class p1 implements w4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z1 f10572a;

    public /* synthetic */ p1(z1 z1Var) {
        this.f10572a = z1Var;
    }

    public void a(x4.j jVar) {
        z1 z1Var = this.f10572a;
        if (z1Var.getActivity() != null) {
            FragmentActivity activity = z1Var.getActivity();
            if (activity instanceof AppDetailActivity) {
                FragmentActivity activity2 = z1Var.getActivity();
                activity2.getClass();
                ((AppDetailActivity) activity2).A0(jVar);
                return;
            }
            if (activity instanceof ListsActivity) {
                FragmentActivity activity3 = z1Var.getActivity();
                activity3.getClass();
                ((ListsActivity) activity3).E0(jVar);
                return;
            }
            if (activity instanceof MainActivity) {
                FragmentActivity activity4 = z1Var.getActivity();
                activity4.getClass();
                ((MainActivity) activity4).y1(jVar);
            } else if (activity instanceof MoreInfo) {
                FragmentActivity activity5 = z1Var.getActivity();
                activity5.getClass();
                ((MoreInfo) activity5).C0(jVar);
            } else if (activity instanceof PreregistrationActivity) {
                FragmentActivity activity6 = z1Var.getActivity();
                activity6.getClass();
                ((PreregistrationActivity) activity6).z0(jVar);
            }
        }
    }

    @Override // w4.c
    public void d(x4.g gVar) {
        gVar.getClass();
        float f = UptodownApp.I;
        if (b4.d.t()) {
            boolean zM = gVar.m();
            z1 z1Var = this.f10572a;
            if (zM) {
                LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(z1Var);
                v7.e eVar = o7.m0.f8289a;
                o7.c0.s(lifecycleScope, t7.n.f10349a, null, new v1(z1Var, gVar, null, 0), 2);
                return;
            }
            if (z1Var.getActivity() != null && (z1Var.getActivity() instanceof MainActivity)) {
                FragmentActivity activity = z1Var.getActivity();
                activity.getClass();
                ((MainActivity) activity).i0(gVar.f11159a);
            } else {
                if (z1Var.getActivity() == null || !(z1Var.getActivity() instanceof c4.k0)) {
                    return;
                }
                FragmentActivity activity2 = z1Var.getActivity();
                activity2.getClass();
                ((c4.k0) activity2).i0(gVar.f11159a);
            }
        }
    }
}
