package u4;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.uptodown.UptodownApp;
import x4.k2;
import x4.u2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f10508b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k2 f10509l;

    public /* synthetic */ j(f0 f0Var, k2 k2Var, int i) {
        this.f10507a = i;
        this.f10508b = f0Var;
        this.f10509l = k2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f10507a;
        k2 k2Var = this.f10509l;
        f0 f0Var = this.f10508b;
        switch (i) {
            case 0:
                f0Var.U(k2Var);
                break;
            case 1:
                f0Var.U(k2Var);
                break;
            case 2:
                FragmentActivity activity = f0Var.getActivity();
                activity.getClass();
                if (((c4.k0) activity).T()) {
                    Context contextRequireContext = f0Var.requireContext();
                    contextRequireContext.getClass();
                    if (u2.h(contextRequireContext) != null) {
                        v0 v0VarG = f0Var.G();
                        Context contextRequireContext2 = f0Var.requireContext();
                        contextRequireContext2.getClass();
                        int i6 = k2Var.f11271x;
                        String str = k2Var.f11259b;
                        str.getClass();
                        v0VarG.a(contextRequireContext2, i6, str);
                    } else if (f0Var.getActivity() != null) {
                        FragmentActivity activity2 = f0Var.getActivity();
                        activity2.getClass();
                        String string = f0Var.getString(2131952181);
                        string.getClass();
                        String string2 = f0Var.getString(2131952180);
                        string2.getClass();
                        b2.t1.v((c4.k0) activity2, string, string2);
                    }
                }
                break;
            case 3:
                float f = UptodownApp.I;
                if (b4.d.t()) {
                    f0Var.S(k2Var);
                }
                break;
            case 4:
                f0Var.U(k2Var);
                break;
            case 5:
                f0Var.U(k2Var);
                break;
            case 6:
                FragmentActivity activity3 = f0Var.getActivity();
                activity3.getClass();
                if (((c4.k0) activity3).T()) {
                    Context contextRequireContext3 = f0Var.requireContext();
                    contextRequireContext3.getClass();
                    if (u2.h(contextRequireContext3) != null) {
                        v0 v0VarG2 = f0Var.G();
                        Context contextRequireContext4 = f0Var.requireContext();
                        contextRequireContext4.getClass();
                        int i10 = k2Var.f11271x;
                        String str2 = k2Var.f11259b;
                        str2.getClass();
                        v0VarG2.a(contextRequireContext4, i10, str2);
                    } else if (f0Var.getActivity() != null) {
                        FragmentActivity activity4 = f0Var.getActivity();
                        activity4.getClass();
                        String string3 = f0Var.getString(2131952181);
                        string3.getClass();
                        String string4 = f0Var.getString(2131952180);
                        string4.getClass();
                        b2.t1.v((c4.k0) activity4, string3, string4);
                    }
                }
                break;
            default:
                float f10 = UptodownApp.I;
                if (b4.d.t()) {
                    f0Var.S(k2Var);
                }
                break;
        }
    }
}
