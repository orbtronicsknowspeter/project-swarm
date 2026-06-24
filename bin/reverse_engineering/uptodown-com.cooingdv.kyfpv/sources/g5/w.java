package g5;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import c4.ya;
import com.uptodown.tv.ui.fragment.TvMyAppsFragment;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x4.e f5363b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TvMyAppsFragment f5364l;

    public /* synthetic */ w(TvMyAppsFragment tvMyAppsFragment, x4.e eVar, int i) {
        this.f5362a = i;
        this.f5364l = tvMyAppsFragment;
        this.f5363b = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f5362a;
        x4.e eVar = this.f5363b;
        TvMyAppsFragment tvMyAppsFragment = this.f5364l;
        switch (i) {
            case 0:
                try {
                    if (eVar.f11124l != null) {
                        PackageManager packageManager = tvMyAppsFragment.requireContext().getPackageManager();
                        String str = eVar.f11124l;
                        str.getClass();
                        Intent leanbackLaunchIntentForPackage = packageManager.getLeanbackLaunchIntentForPackage(str);
                        if (leanbackLaunchIntentForPackage == null) {
                            PackageManager packageManager2 = tvMyAppsFragment.requireContext().getPackageManager();
                            String str2 = eVar.f11124l;
                            str2.getClass();
                            leanbackLaunchIntentForPackage = packageManager2.getLaunchIntentForPackage(str2);
                        }
                        if (leanbackLaunchIntentForPackage != null) {
                            tvMyAppsFragment.startActivity(leanbackLaunchIntentForPackage);
                        }
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                AlertDialog alertDialog = tvMyAppsFragment.f3434l;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
                break;
            case 1:
                if (eVar.f11124l != null) {
                    Context contextRequireContext = tvMyAppsFragment.requireContext();
                    contextRequireContext.getClass();
                    String str3 = eVar.f11124l;
                    str3.getClass();
                    Intent intent = new Intent("android.intent.action.DELETE", Uri.parse("package:".concat(str3)));
                    intent.addFlags(268435456);
                    contextRequireContext.startActivity(intent);
                }
                AlertDialog alertDialog2 = tvMyAppsFragment.f3434l;
                if (alertDialog2 != null) {
                    alertDialog2.dismiss();
                }
                break;
            case 2:
                LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(tvMyAppsFragment);
                v7.e eVar2 = o7.m0.f8289a;
                o7.c0.s(lifecycleScope, t7.n.f10349a, null, new ya(tvMyAppsFragment, eVar, (t6.c) null, 12), 2);
                AlertDialog alertDialog3 = tvMyAppsFragment.f3434l;
                if (alertDialog3 != null) {
                    alertDialog3.dismiss();
                }
                break;
            default:
                AlertDialog alertDialog4 = tvMyAppsFragment.f3434l;
                if (alertDialog4 != null) {
                    alertDialog4.dismiss();
                }
                e1.c0 c0Var = j5.g.D;
                Context contextRequireContext2 = tvMyAppsFragment.requireContext();
                contextRequireContext2.getClass();
                j5.g gVarL = c0Var.l(contextRequireContext2);
                gVarL.b();
                if (eVar.v == 0) {
                    eVar.v = 1;
                    eVar.f11128p = x4.d.f11089b;
                    String str4 = eVar.f11124l;
                    str4.getClass();
                    gVarL.s(str4);
                    Context contextRequireContext3 = tvMyAppsFragment.requireContext();
                    contextRequireContext3.getClass();
                    a.a.r(contextRequireContext3);
                } else {
                    eVar.v = 0;
                }
                gVarL.m0(eVar);
                gVarL.c();
                break;
        }
    }

    public /* synthetic */ w(x4.e eVar, TvMyAppsFragment tvMyAppsFragment, int i) {
        this.f5362a = i;
        this.f5363b = eVar;
        this.f5364l = tvMyAppsFragment;
    }
}
