package g4;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelKt;
import com.uptodown.R;
import com.uptodown.core.activities.InstallerActivity;
import java.util.ArrayList;
import u4.v0;
import x4.b3;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5164a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.u f5165b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f5166l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f5167m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f5168n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f5169o;

    public /* synthetic */ f0(ArrayList arrayList, u4.f0 f0Var, ArrayList arrayList2, kotlin.jvm.internal.u uVar, t4.n0 n0Var) {
        this.f5166l = arrayList;
        this.f5167m = f0Var;
        this.f5168n = arrayList2;
        this.f5165b = uVar;
        this.f5169o = n0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj;
        int i = this.f5164a;
        Object obj2 = this.f5169o;
        kotlin.jvm.internal.u uVar = this.f5165b;
        Object obj3 = this.f5168n;
        Object obj4 = this.f5167m;
        Object obj5 = this.f5166l;
        switch (i) {
            case 0:
                TextView textView = (TextView) obj5;
                InstallerActivity installerActivity = (InstallerActivity) obj3;
                ImageView imageView = (ImageView) obj2;
                TextView textView2 = (TextView) obj4;
                int i6 = InstallerActivity.f3395j0;
                if (!uVar.f7022a) {
                    textView.setText(installerActivity.getString(R.string.core_installer_new_features_title_hide));
                    imageView.setImageDrawable(ContextCompat.getDrawable(installerActivity, R.drawable.vector_arrow_angle_up_small_off));
                    textView2.setVisibility(0);
                    uVar.f7022a = true;
                } else {
                    textView.setText(installerActivity.getString(R.string.core_installer_new_features_title));
                    imageView.setImageDrawable(ContextCompat.getDrawable(installerActivity, R.drawable.vector_arrow_angle_down_small_off));
                    textView2.setVisibility(8);
                    uVar.f7022a = false;
                }
                break;
            default:
                ArrayList arrayList = (ArrayList) obj5;
                u4.f0 f0Var = (u4.f0) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                t4.n0 n0Var = (t4.n0) obj2;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 < size) {
                        obj = arrayList.get(i10);
                        i10++;
                        if (((b3) obj).f11068l == 1) {
                        }
                    } else {
                        obj = null;
                    }
                }
                b3 b3Var = (b3) obj;
                if (b3Var != null) {
                    v0 v0VarG = f0Var.G();
                    Context contextRequireContext = f0Var.requireContext();
                    contextRequireContext.getClass();
                    long j = f0Var.B().f11159a;
                    v0VarG.getClass();
                    o7.a0 viewModelScope = ViewModelKt.getViewModelScope(v0VarG);
                    v7.e eVar = o7.m0.f8289a;
                    o7.c0.s(viewModelScope, v7.d.f10885a, null, new u4.s0(contextRequireContext, j, b3Var, arrayList2, v0VarG, null), 2);
                }
                if (uVar.f7022a && f0Var.B().k() && f0Var.B().j()) {
                    Context contextRequireContext2 = f0Var.requireContext();
                    contextRequireContext2.getClass();
                    FragmentActivity fragmentActivityRequireActivity = f0Var.requireActivity();
                    fragmentActivityRequireActivity.getClass();
                    d0.b.j(contextRequireContext2, (c4.k0) fragmentActivityRequireActivity, f0Var.f10485w, f0Var.B(), false);
                }
                f0Var.r(n0Var);
                break;
        }
    }

    public /* synthetic */ f0(kotlin.jvm.internal.u uVar, TextView textView, InstallerActivity installerActivity, ImageView imageView, TextView textView2) {
        this.f5165b = uVar;
        this.f5166l = textView;
        this.f5168n = installerActivity;
        this.f5169o = imageView;
        this.f5167m = textView2;
    }
}
