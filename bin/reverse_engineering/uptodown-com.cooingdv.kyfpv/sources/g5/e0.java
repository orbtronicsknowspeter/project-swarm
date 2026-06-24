package g5;

import android.app.AlertDialog;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.fragment.app.FragmentActivity;
import androidx.leanback.widget.OnItemViewClickedListener;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.Row;
import androidx.leanback.widget.RowPresenter;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.tv.ui.fragment.TvOldVersionsFragment;
import java.io.File;
import x4.t1;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements OnItemViewClickedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TvOldVersionsFragment f5308a;

    public e0(TvOldVersionsFragment tvOldVersionsFragment) {
        this.f5308a = tvOldVersionsFragment;
    }

    @Override // androidx.leanback.widget.BaseOnItemViewClickedListener
    public final void onItemClicked(Presenter.ViewHolder viewHolder, Object obj, RowPresenter.ViewHolder viewHolder2, Row row) {
        File externalFilesDir;
        if (obj instanceof t1) {
            TvOldVersionsFragment tvOldVersionsFragment = this.f5308a;
            x4.e eVar = tvOldVersionsFragment.f3442b;
            if (eVar == null || ((t1) obj).f11400m != eVar.f11125m) {
                e1.c0 c0Var = j5.g.D;
                Context contextRequireContext = tvOldVersionsFragment.requireContext();
                contextRequireContext.getClass();
                j5.g gVarL = c0Var.l(contextRequireContext);
                gVarL.b();
                x4.g gVar = tvOldVersionsFragment.f3441a;
                gVar.getClass();
                String str = gVar.F;
                str.getClass();
                t1 t1Var = (t1) obj;
                x4.r rVarL = gVarL.L(t1Var.f11400m, str);
                gVarL.c();
                if (rVarL == null) {
                    x4.r rVar = new x4.r();
                    x4.g gVar2 = tvOldVersionsFragment.f3441a;
                    gVar2.getClass();
                    rVar.b(gVar2, t1Var);
                    TvOldVersionsFragment.a(tvOldVersionsFragment, rVar);
                    return;
                }
                long j = rVarL.f11362q;
                if (a5.b.c(j) || a5.c.b(j)) {
                    String str2 = rVarL.f11356b;
                    if (str2 != null) {
                        x4.r rVarB = a5.b.b();
                        if (kotlin.jvm.internal.l.a(rVarB != null ? rVarB.f11356b : null, str2)) {
                            a5.b.f();
                            return;
                        } else {
                            a5.c.d();
                            return;
                        }
                    }
                    long j6 = rVarL.f11362q;
                    if (j6 > 0) {
                        if (a5.b.c(j6) || a5.c.b(j6) || a5.b.e(j6)) {
                            a5.b.f();
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (!rVarL.c() || rVarL.f11367w == null) {
                    x4.g gVar3 = tvOldVersionsFragment.f3441a;
                    gVar3.getClass();
                    rVarL.a(gVar3);
                    TvOldVersionsFragment.a(tvOldVersionsFragment, rVarL);
                    return;
                }
                x4.g gVar4 = tvOldVersionsFragment.f3441a;
                gVar4.getClass();
                String str3 = gVar4.F;
                long j10 = rVarL.f11359n;
                String str4 = rVarL.f11367w;
                str4.getClass();
                if (tvOldVersionsFragment.getActivity() != null) {
                    PackageManager packageManager = tvOldVersionsFragment.requireActivity().getPackageManager();
                    try {
                        packageManager.getClass();
                        str3.getClass();
                        if (j10 < n4.d.d(n4.i.e(packageManager, str3, 1))) {
                            AlertDialog alertDialog = tvOldVersionsFragment.f3443l;
                            if (alertDialog != null) {
                                alertDialog.dismiss();
                            }
                            AlertDialog.Builder builder = new AlertDialog.Builder(tvOldVersionsFragment.getContext());
                            builder.setTitle(tvOldVersionsFragment.getString(R.string.warning_title));
                            builder.setMessage(R.string.msg_warning_old_versions);
                            builder.setCancelable(false);
                            builder.setPositiveButton(android.R.string.ok, new g4.c0(tvOldVersionsFragment, str3, 2));
                            builder.setNegativeButton(android.R.string.cancel, new f5.b(10));
                            AlertDialog alertDialogCreate = builder.create();
                            tvOldVersionsFragment.f3443l = alertDialogCreate;
                            if (alertDialogCreate != null) {
                                alertDialogCreate.show();
                                return;
                            }
                            return;
                        }
                    } catch (PackageManager.NameNotFoundException e10) {
                        e10.printStackTrace();
                    }
                }
                Context contextRequireContext2 = tvOldVersionsFragment.requireContext();
                contextRequireContext2.getClass();
                h4.a aVar = new h4.a(contextRequireContext2);
                if (aVar.d()) {
                    File[] externalFilesDirs = contextRequireContext2.getExternalFilesDirs(null);
                    if (externalFilesDirs.length > 1) {
                        externalFilesDir = externalFilesDirs[1];
                    } else {
                        externalFilesDir = contextRequireContext2.getExternalFilesDir(null);
                        aVar.g();
                        aVar.f();
                    }
                } else {
                    externalFilesDir = contextRequireContext2.getExternalFilesDir(null);
                }
                File file = new File(externalFilesDir, "Apps");
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(file, str4);
                float f = UptodownApp.I;
                FragmentActivity fragmentActivityRequireActivity = tvOldVersionsFragment.requireActivity();
                fragmentActivityRequireActivity.getClass();
                b4.d.r(fragmentActivityRequireActivity, file2);
            }
        }
    }
}
