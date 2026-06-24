package u4;

import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import c4.w6;
import com.uptodown.activities.MainActivity;
import x4.p2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class w0 extends z0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f10652u;
    public final p6.m v = new p6.m(new w6(this, 24));

    public w0(String str) {
        this.f10652u = str;
    }

    @Override // u4.z0
    public final ViewBinding a() {
        return (t4.f) this.v.getValue();
    }

    @Override // u4.z0
    public final String b() {
        return this.f10652u;
    }

    @Override // u4.z0
    public final View d() {
        return ((t4.f) this.v.getValue()).f9774b;
    }

    @Override // u4.z0
    public final TextView g() {
        return ((t4.f) this.v.getValue()).f9776m;
    }

    @Override // u4.z0
    public final RecyclerView h() {
        return ((t4.f) this.v.getValue()).f9775l;
    }

    @Override // u4.z0
    public final TextView i() {
        return ((t4.f) this.v.getValue()).f9777n;
    }

    @Override // u4.z0
    public final void j(x4.j jVar) {
        jVar.getClass();
        int i = jVar.f11230o;
        if (i != 0 && i != 831) {
            FragmentActivity activity = getActivity();
            activity.getClass();
            ((MainActivity) activity).y1(jVar);
        } else if (i != 0) {
            FragmentActivity activity2 = getActivity();
            activity2.getClass();
            ((MainActivity) activity2).x1(jVar);
        } else {
            FragmentActivity activity3 = getActivity();
            activity3.getClass();
            ((MainActivity) activity3).y1(jVar);
        }
    }

    @Override // u4.z0
    public final void k(p2 p2Var) {
        int i;
        p2Var.getClass();
        x4.j jVar = this.f10670a;
        if (jVar != null && jVar.f11230o == 0) {
            x4.j jVar2 = p2Var.f11330a;
            if (jVar2.f11230o != 0 && (i = jVar2.f11225a) != -3 && i != -2) {
                FragmentActivity activity = getActivity();
                activity.getClass();
                ((MainActivity) activity).x1(p2Var.f11330a);
                return;
            }
        }
        FragmentActivity activity2 = getActivity();
        activity2.getClass();
        ((MainActivity) activity2).y1(p2Var.f11330a);
    }

    @Override // u4.z0
    public final void l(String str) {
        this.f10652u = str;
    }
}
