package u4;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class s implements w4.g, k4.c, w4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f10595b;

    public /* synthetic */ s(f0 f0Var, int i) {
        this.f10594a = i;
        this.f10595b = f0Var;
    }

    @Override // w4.g
    public void A(String str) {
        this.f10595b.v(str);
    }

    @Override // k4.c
    public void c(File file, ArrayList arrayList) {
        f0 f0Var = this.f10595b;
        if (f0Var.getActivity() != null) {
            FragmentActivity activity = f0Var.getActivity();
            activity.getClass();
            if (activity.isFinishing()) {
                return;
            }
            FragmentActivity fragmentActivityRequireActivity = f0Var.requireActivity();
            fragmentActivityRequireActivity.getClass();
            new n4.h(fragmentActivityRequireActivity).k(arrayList, false);
            o7.c0.s(LifecycleOwnerKt.getLifecycleScope(f0Var), null, null, new w(f0Var, null, 9), 3);
            if (f0Var.getActivity() instanceof c4.k0) {
                e1.c0 c0Var = j5.g.D;
                FragmentActivity activity2 = f0Var.getActivity();
                activity2.getClass();
                j5.g gVarL = c0Var.l(activity2);
                gVarL.b();
                String name = file.getName();
                name.getClass();
                x4.r rVarG = gVarL.G(name);
                gVarL.c();
                FragmentActivity activity3 = f0Var.getActivity();
                activity3.getClass();
                ((c4.k0) activity3).X(rVarG);
            }
        }
    }

    @Override // w4.c
    public void d(x4.g gVar) {
        int i = this.f10594a;
        f0 f0Var = this.f10595b;
        gVar.getClass();
        switch (i) {
            case 2:
                float f = UptodownApp.I;
                if (b4.d.t() && f0Var.getActivity() != null && !f0Var.requireActivity().isFinishing()) {
                    f0.c(f0Var, gVar);
                    break;
                }
                break;
            case 3:
                float f10 = UptodownApp.I;
                if (b4.d.t() && f0Var.getActivity() != null && !f0Var.requireActivity().isFinishing()) {
                    f0.c(f0Var, gVar);
                    break;
                }
                break;
            default:
                float f11 = UptodownApp.I;
                if (b4.d.t() && f0Var.getActivity() != null && !f0Var.requireActivity().isFinishing()) {
                    f0.c(f0Var, gVar);
                    break;
                }
                break;
        }
    }

    @Override // k4.c
    public void e(int i) {
        f0.k(this.f10595b, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
    /* JADX WARN: Type inference failed for: r4v1, types: [t6.c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    @Override // w4.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(x4.r r15) {
        /*
            Method dump skipped, instruction units count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.s.g(x4.r):void");
    }

    @Override // k4.c
    public void l() {
        f0 f0Var = this.f10595b;
        if (f0Var.getContext() != null) {
            String string = f0Var.getString(R.string.msg_install_from_unknown_source, f0Var.getString(R.string.app_name));
            string.getClass();
            f0Var.v(string);
        }
    }

    @Override // w4.g
    public void p(String str) {
        str.getClass();
        f0 f0Var = this.f10595b;
        FragmentActivity activity = f0Var.getActivity();
        activity.getClass();
        j5.c.e((c4.k0) activity, str, null);
        v0 v0VarG = f0Var.G();
        Context contextRequireContext = f0Var.requireContext();
        contextRequireContext.getClass();
        long j = f0Var.B().f11159a;
        v0VarG.getClass();
        o7.a0 viewModelScope = ViewModelKt.getViewModelScope(v0VarG);
        v7.e eVar = o7.m0.f8289a;
        o7.c0.s(viewModelScope, v7.d.f10885a, null, new n0(contextRequireContext, v0VarG, j, (t6.c) null), 2);
    }

    @Override // k4.c
    public void t() {
        f0 f0Var = this.f10595b;
        if (f0Var.getContext() != null) {
            String string = f0Var.getString(R.string.core_kill_this_app, f0Var.getString(R.string.app_name));
            string.getClass();
            f0Var.v(string);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ff  */
    @Override // w4.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u(x4.r r13) {
        /*
            Method dump skipped, instruction units count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.s.u(x4.r):void");
    }

    @Override // k4.c
    public void v() {
        f0.k(this.f10595b, 0);
    }

    @Override // k4.c
    public void w() {
        f0 f0Var = this.f10595b;
        if (f0Var.getContext() != null) {
            String string = f0Var.getString(R.string.error_unzipping);
            string.getClass();
            f0Var.v(string);
        }
    }

    @Override // k4.c
    public void z() {
        f0 f0Var = this.f10595b;
        if (f0Var.getActivity() == null || !(f0Var.getActivity() instanceof c4.k0)) {
            return;
        }
        FragmentActivity activity = f0Var.getActivity();
        activity.getClass();
        ((c4.k0) activity).j();
    }

    @Override // k4.c
    public void i(File file) {
    }

    @Override // k4.c
    public void j(File file) {
    }
}
