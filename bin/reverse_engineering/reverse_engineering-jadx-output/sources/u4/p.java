package u4;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelKt;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.uptodown.UptodownApp;
import com.uptodown.activities.FreeUpSpaceActivity;
import com.uptodown.activities.MainActivity;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f10566b;

    public /* synthetic */ p(f0 f0Var, int i) {
        this.f10565a = i;
        this.f10566b = f0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f10565a;
        f0 f0Var = this.f10566b;
        switch (i) {
            case 0:
                if (f0Var.getActivity() instanceof c4.k0) {
                    FragmentActivity fragmentActivityRequireActivity = f0Var.requireActivity();
                    fragmentActivityRequireActivity.getClass();
                    b2.t1.u((c4.k0) fragmentActivityRequireActivity, f0Var.B().f11174n);
                }
                break;
            case 1:
                FragmentActivity activity = f0Var.getActivity();
                activity.getClass();
                AlertDialog alertDialog = ((c4.k0) activity).F;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
                break;
            case 2:
                Context contextRequireContext = f0Var.requireContext();
                contextRequireContext.getClass();
                FragmentActivity fragmentActivityRequireActivity2 = f0Var.requireActivity();
                fragmentActivityRequireActivity2.getClass();
                d0.b.j(contextRequireContext, (c4.k0) fragmentActivityRequireActivity2, f0Var.f10484w, f0Var.B(), false);
                break;
            case 3:
                FragmentActivity activity2 = f0Var.getActivity();
                activity2.getClass();
                ((c4.k0) activity2).Q();
                break;
            case 4:
                if (f0Var.getActivity() != null && f0Var.isAdded() && !f0Var.requireActivity().isFinishing()) {
                    FragmentActivity activity3 = f0Var.getActivity();
                    activity3.getClass();
                    AlertDialog alertDialog2 = ((c4.k0) activity3).F;
                    if (alertDialog2 != null) {
                        alertDialog2.dismiss();
                    }
                    break;
                }
                break;
            case 5:
                f0Var.t();
                break;
            case 6:
                if (f0Var.getActivity() != null && !f0Var.requireActivity().isFinishing()) {
                    FragmentActivity activity4 = f0Var.getActivity();
                    activity4.getClass();
                    ((c4.k0) activity4).Q();
                    if (f0Var.getActivity() != null && (f0Var.getActivity() instanceof MainActivity)) {
                        FragmentActivity activity5 = f0Var.getActivity();
                        activity5.getClass();
                        ((MainActivity) activity5).getOnBackPressedDispatcher().onBackPressed();
                    } else {
                        FragmentActivity activity6 = f0Var.getActivity();
                        activity6.getClass();
                        ((c4.k0) activity6).finish();
                    }
                    break;
                }
                break;
            case 7:
                Context contextRequireContext2 = f0Var.requireContext();
                contextRequireContext2.getClass();
                f0Var.p(contextRequireContext2);
                Context contextRequireContext3 = f0Var.requireContext();
                contextRequireContext3.getClass();
                FragmentActivity fragmentActivityRequireActivity3 = f0Var.requireActivity();
                fragmentActivityRequireActivity3.getClass();
                d0.b.j(contextRequireContext3, (c4.k0) fragmentActivityRequireActivity3, f0Var.f10484w, f0Var.B(), false);
                FragmentActivity activity7 = f0Var.getActivity();
                activity7.getClass();
                ((c4.k0) activity7).Q();
                break;
            case 8:
                Context contextRequireContext4 = f0Var.requireContext();
                contextRequireContext4.getClass();
                FragmentActivity fragmentActivityRequireActivity4 = f0Var.requireActivity();
                fragmentActivityRequireActivity4.getClass();
                d0.b.j(contextRequireContext4, (c4.k0) fragmentActivityRequireActivity4, f0Var.f10484w, f0Var.B(), false);
                break;
            case 9:
                f0Var.P();
                break;
            case 10:
                f0Var.P();
                break;
            case 11:
                Context contextRequireContext5 = f0Var.requireContext();
                contextRequireContext5.getClass();
                FragmentActivity fragmentActivityRequireActivity5 = f0Var.requireActivity();
                fragmentActivityRequireActivity5.getClass();
                d0.b.j(contextRequireContext5, (c4.k0) fragmentActivityRequireActivity5, f0Var.f10484w, f0Var.B(), false);
                break;
            case 12:
                r7.o0 o0Var = a5.b.f193a;
                if (!a5.b.c(f0Var.B().f11158a) && !a5.b.e(f0Var.B().f11158a)) {
                    r7.o0 o0Var2 = a5.c.f197a;
                    if (a5.c.b(f0Var.B().f11158a) || a5.c.c(f0Var.B().f11158a)) {
                        if (a5.c.f197a.getValue() instanceof x4.y0) {
                            a5.c.f();
                            break;
                        } else {
                            x4.r rVarA = a5.c.a();
                            if (rVarA != null && a5.c.b(f0Var.B().f11158a)) {
                                android.support.v4.media.g gVar = f0Var.f10476n;
                                if (gVar != null) {
                                    Bundle bundle = new Bundle();
                                    bundle.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "paused");
                                    gVar.E(bundle, "download");
                                }
                                a5.c.e();
                                f0Var.i0(rVarA);
                                break;
                            }
                        }
                    }
                } else if (a5.b.d()) {
                    a5.b.h();
                    break;
                } else {
                    x4.r rVarB = a5.b.b();
                    if (rVarB != null && a5.b.c(f0Var.B().f11158a)) {
                        android.support.v4.media.g gVar2 = f0Var.f10476n;
                        if (gVar2 != null) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "paused");
                            gVar2.E(bundle2, "download");
                        }
                        a5.b.g();
                        f0Var.i0(rVarB);
                        break;
                    }
                }
                break;
            case 13:
                f0Var.t();
                break;
            case 14:
                f0Var.R();
                FragmentActivity activity8 = f0Var.getActivity();
                activity8.getClass();
                AlertDialog alertDialog3 = ((c4.k0) activity8).F;
                if (alertDialog3 != null) {
                    alertDialog3.dismiss();
                }
                break;
            case 15:
                FragmentActivity activity9 = f0Var.getActivity();
                activity9.getClass();
                AlertDialog alertDialog4 = ((c4.k0) activity9).F;
                if (alertDialog4 != null) {
                    alertDialog4.dismiss();
                }
                break;
            case 16:
                Context contextRequireContext6 = f0Var.requireContext();
                contextRequireContext6.getClass();
                FragmentActivity fragmentActivityRequireActivity6 = f0Var.requireActivity();
                fragmentActivityRequireActivity6.getClass();
                d0.b.j(contextRequireContext6, (c4.k0) fragmentActivityRequireActivity6, f0Var.f10484w, f0Var.B(), false);
                break;
            case 17:
                f0Var.n();
                FragmentActivity activity10 = f0Var.getActivity();
                activity10.getClass();
                ((c4.k0) activity10).Q();
                break;
            case 18:
                f0Var.o();
                FragmentActivity activity11 = f0Var.getActivity();
                activity11.getClass();
                ((c4.k0) activity11).Q();
                break;
            case 19:
                Intent intent = new Intent(f0Var.requireActivity(), (Class<?>) FreeUpSpaceActivity.class);
                intent.putExtra("appInfo", f0Var.B());
                float f = UptodownApp.I;
                FragmentActivity fragmentActivityRequireActivity7 = f0Var.requireActivity();
                fragmentActivityRequireActivity7.getClass();
                f0Var.startActivity(intent, b4.d.a(fragmentActivityRequireActivity7));
                break;
            case 20:
                Context contextRequireContext7 = f0Var.requireContext();
                contextRequireContext7.getClass();
                f0Var.p(contextRequireContext7);
                FragmentActivity activity12 = f0Var.getActivity();
                activity12.getClass();
                AlertDialog alertDialog5 = ((c4.k0) activity12).F;
                if (alertDialog5 != null) {
                    alertDialog5.dismiss();
                }
                break;
            case 21:
                FragmentActivity activity13 = f0Var.getActivity();
                activity13.getClass();
                AlertDialog alertDialog6 = ((c4.k0) activity13).F;
                if (alertDialog6 != null) {
                    alertDialog6.dismiss();
                }
                break;
            case 22:
                v0 v0VarG = f0Var.G();
                Context contextRequireContext8 = f0Var.requireContext();
                contextRequireContext8.getClass();
                long j = f0Var.B().f11158a;
                v0VarG.getClass();
                o7.a0 viewModelScope = ViewModelKt.getViewModelScope(v0VarG);
                v7.e eVar = o7.m0.f8288a;
                o7.c0.s(viewModelScope, v7.d.f10884a, null, new n0(v0VarG, contextRequireContext8, j, (t6.c) null), 2);
                FragmentActivity activity14 = f0Var.getActivity();
                activity14.getClass();
                AlertDialog alertDialog7 = ((c4.k0) activity14).F;
                if (alertDialog7 != null) {
                    alertDialog7.dismiss();
                }
                break;
            case 23:
                FragmentActivity activity15 = f0Var.getActivity();
                activity15.getClass();
                AlertDialog alertDialog8 = ((c4.k0) activity15).F;
                if (alertDialog8 != null) {
                    alertDialog8.dismiss();
                }
                break;
            default:
                FragmentActivity activity16 = f0Var.getActivity();
                activity16.getClass();
                ((c4.k0) activity16).Q();
                if (f0Var.getActivity() != null && (f0Var.getActivity() instanceof MainActivity)) {
                    FragmentActivity activity17 = f0Var.getActivity();
                    activity17.getClass();
                    ((MainActivity) activity17).getOnBackPressedDispatcher().onBackPressed();
                } else {
                    FragmentActivity activity18 = f0Var.getActivity();
                    activity18.getClass();
                    ((c4.k0) activity18).finish();
                }
                break;
        }
    }
}
