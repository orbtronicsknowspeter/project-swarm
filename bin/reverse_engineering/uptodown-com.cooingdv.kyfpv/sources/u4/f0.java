package u4;

import android.app.AlertDialog;
import android.app.NotificationManager;
import android.content.ActivityNotFoundException;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Spanned;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import androidx.viewbinding.ViewBindings;
import androidx.work.Data;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.google.android.gms.internal.measurement.i5;
import com.google.android.gms.internal.measurement.z3;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AppDetailActivity;
import com.uptodown.activities.LoginActivity;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.RepliesActivity;
import com.uptodown.activities.ReviewsActivity;
import com.uptodown.activities.VirusTotalReport;
import com.uptodown.util.views.MaxHeightRecyclerView;
import com.uptodown.util.views.UsernameTextView;
import com.uptodown.views.FullWidthImageView;
import com.uptodown.workers.DownloadApkWorker;
import com.uptodown.workers.GenerateQueueWorker;
import e1.v4;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import x4.f2;
import x4.k2;
import x4.q2;
import x4.u2;
import x4.w2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x4.g f10473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t4.b f10474b;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public android.support.v4.media.g f10477n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AlertDialog f10478o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f10479p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Menu f10480q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public e4.u0 f10481r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public e4.u0 f10482s;
    public final x v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final s f10485w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ActivityResultLauncher f10486x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ActivityResultLauncher f10487y;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p6.f f10475l = FragmentViewModelLazyKt.createViewModelLazy(this, kotlin.jvm.internal.y.a(v0.class), new o9.a(new c0(this, 0), 2), null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p6.f f10476m = FragmentViewModelLazyKt.createViewModelLazy(this, kotlin.jvm.internal.y.a(a1.class), new o9.a(new c0(this, 1), 3), null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f10483t = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final double f10484u = 0.9d;

    public f0() {
        int i = 0;
        this.v = new x(this, i);
        this.f10485w = new s(this, i);
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new i(this, 3));
        activityResultLauncherRegisterForActivityResult.getClass();
        this.f10486x = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new i(this, 0));
        activityResultLauncherRegisterForActivityResult2.getClass();
        this.f10487y = activityResultLauncherRegisterForActivityResult2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (o7.c0.C(r1, r8, r0) == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(u4.f0 r7, v6.c r8) {
        /*
            boolean r0 = r8 instanceof u4.t
            if (r0 == 0) goto L13
            r0 = r8
            u4.t r0 = (u4.t) r0
            int r1 = r0.f10606l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10606l = r1
            goto L18
        L13:
            u4.t r0 = new u4.t
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f10604a
            int r1 = r0.f10606l
            r2 = 0
            r3 = 2
            r4 = 1
            u6.a r5 = u6.a.f10763a
            if (r1 == 0) goto L35
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            p6.a.e(r8)
            goto L5d
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            androidx.privacysandbox.ads.adservices.customaudience.a.i(r7)
            return r2
        L31:
            p6.a.e(r8)
            goto L4b
        L35:
            p6.a.e(r8)
            v7.e r8 = o7.m0.f8289a
            v7.d r8 = v7.d.f10885a
            u4.u r1 = new u4.u
            r6 = 0
            r1.<init>(r7, r2, r6)
            r0.f10606l = r4
            java.lang.Object r8 = o7.c0.C(r1, r8, r0)
            if (r8 != r5) goto L4b
            goto L5c
        L4b:
            v7.e r8 = o7.m0.f8289a
            p7.c r8 = t7.n.f10349a
            u4.u r1 = new u4.u
            r1.<init>(r7, r2, r4)
            r0.f10606l = r3
            java.lang.Object r7 = o7.c0.C(r1, r8, r0)
            if (r7 != r5) goto L5d
        L5c:
            return r5
        L5d:
            p6.x r7 = p6.x.f8464a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.f0.a(u4.f0, v6.c):java.lang.Object");
    }

    public static final void b(f0 f0Var, int i) {
        if (f0Var.B().A0) {
            return;
        }
        f0Var.B().A0 = true;
        Bundle bundle = new Bundle();
        bundle.putString("appId", String.valueOf(f0Var.B().f11159a));
        bundle.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "noCompatibleFile");
        bundle.putInt("installed", i);
        android.support.v4.media.g gVar = f0Var.f10477n;
        if (gVar != null) {
            gVar.E(bundle, "app_details");
        }
    }

    public static final void c(f0 f0Var, x4.g gVar) {
        if (f0Var.getActivity() != null) {
            FragmentActivity activity = f0Var.getActivity();
            activity.getClass();
            if (((c4.k0) activity).T()) {
                if (f0Var.getActivity() instanceof MainActivity) {
                    FragmentActivity activity2 = f0Var.getActivity();
                    activity2.getClass();
                    ((MainActivity) activity2).i0(gVar.f11159a);
                } else if (f0Var.getActivity() instanceof AppDetailActivity) {
                    FragmentActivity activity3 = f0Var.getActivity();
                    activity3.getClass();
                    ((AppDetailActivity) activity3).i0(gVar.f11159a);
                }
            }
        }
    }

    public static final void d(f0 f0Var, ArrayList arrayList) {
        if (f0Var.getContext() == null || arrayList == null || arrayList.isEmpty()) {
            t4.b bVar = f0Var.f10474b;
            bVar.getClass();
            bVar.W.setVisibility(8);
            return;
        }
        e4.u0 u0Var = new e4.u0(new s(f0Var, 3), new x(f0Var, 3));
        f0Var.f10481r = u0Var;
        u0Var.a(arrayList);
        t4.b bVar2 = f0Var.f10474b;
        bVar2.getClass();
        bVar2.f9603c0.setAdapter(f0Var.f10481r);
        t4.b bVar3 = f0Var.f10474b;
        bVar3.getClass();
        bVar3.f9603c0.setNestedScrollingEnabled(false);
        t4.b bVar4 = f0Var.f10474b;
        bVar4.getClass();
        bVar4.f9603c0.setItemAnimator(null);
        t4.b bVar5 = f0Var.f10474b;
        bVar5.getClass();
        bVar5.f9603c0.setLayoutManager(new LinearLayoutManager(f0Var.getContext(), 0, false));
        t4.b bVar6 = f0Var.f10474b;
        bVar6.getClass();
        bVar6.W.setVisibility(0);
    }

    public static final void g(f0 f0Var, View view, Context context) {
        ViewTreeObserver viewTreeObserver;
        float f = UptodownApp.I;
        boolean z9 = true;
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("SettingsPreferences", 0);
            if (sharedPreferences.contains("animations")) {
                z9 = sharedPreferences.getBoolean("animations", true);
            }
        } catch (Exception unused) {
        }
        if (!z9 || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnPreDrawListener(new b0(view, f0Var));
    }

    public static final void h(f0 f0Var, int i, String str) {
        Menu menu = f0Var.f10480q;
        if (menu != null) {
            menu.findItem(i).setTitle(str);
        }
    }

    public static final void i(f0 f0Var, String str) {
        f0Var.J();
        t4.b bVar = f0Var.f10474b;
        bVar.getClass();
        bVar.T.C.setText(str);
        t4.b bVar2 = f0Var.f10474b;
        bVar2.getClass();
        bVar2.L.f9874w.setText(str);
    }

    public static final void j(f0 f0Var) {
        t4.b bVar = f0Var.f10474b;
        bVar.getClass();
        bVar.T.f9657o.setVisibility(0);
        t4.b bVar2 = f0Var.f10474b;
        bVar2.getClass();
        bVar2.T.f9655m.setVisibility(8);
        t4.b bVar3 = f0Var.f10474b;
        bVar3.getClass();
        ((RelativeLayout) bVar3.P.v).setVisibility(0);
        t4.b bVar4 = f0Var.f10474b;
        bVar4.getClass();
        bVar4.P.f9810s.setVisibility(0);
        t4.b bVar5 = f0Var.f10474b;
        bVar5.getClass();
        bVar5.P.f9803l.setVisibility(8);
        t4.b bVar6 = f0Var.f10474b;
        bVar6.getClass();
        ((RelativeLayout) bVar6.P.f9813w).setVisibility(8);
        t4.b bVar7 = f0Var.f10474b;
        bVar7.getClass();
        bVar7.P.f9812u.setVisibility(8);
        t4.b bVar8 = f0Var.f10474b;
        bVar8.getClass();
        bVar8.L.f9870r.setVisibility(0);
        t4.b bVar9 = f0Var.f10474b;
        bVar9.getClass();
        bVar9.L.f9876y.setVisibility(8);
        t4.b bVar10 = f0Var.f10474b;
        bVar10.getClass();
        bVar10.L.f9869q.setVisibility(8);
        t4.b bVar11 = f0Var.f10474b;
        bVar11.getClass();
        bVar11.L.f9868p.setVisibility(8);
        t4.b bVar12 = f0Var.f10474b;
        bVar12.getClass();
        bVar12.L.f9873u.setVisibility(8);
        Context contextRequireContext = f0Var.requireContext();
        contextRequireContext.getClass();
        if (u2.h(contextRequireContext) == null) {
            t4.b bVar13 = f0Var.f10474b;
            bVar13.getClass();
            TextView textView = bVar13.P.f9810s;
            String string = f0Var.getString(R.string.pre_registration_title);
            string.getClass();
            textView.setText(string);
            z3.J(textView);
            t4.b bVar14 = f0Var.f10474b;
            bVar14.getClass();
            ((RelativeLayout) bVar14.P.v).setBackground(ContextCompat.getDrawable(f0Var.requireContext(), R.drawable.ripple_blue_primary_button));
            t4.b bVar15 = f0Var.f10474b;
            bVar15.getClass();
            bVar15.L.f9877z.setText(f0Var.getString(R.string.pre_registration_title));
            t4.b bVar16 = f0Var.f10474b;
            bVar16.getClass();
            bVar16.L.f9865m.setVisibility(0);
            t4.b bVar17 = f0Var.f10474b;
            bVar17.getClass();
            TextView textView2 = bVar17.P.f9810s;
            int i = 1;
            textView2.setOnClickListener(new k(f0Var, textView2, i));
            t4.b bVar18 = f0Var.f10474b;
            bVar18.getClass();
            RelativeLayout relativeLayout = bVar18.L.f9870r;
            relativeLayout.setOnClickListener(new k(f0Var, relativeLayout, i));
        } else {
            f0Var.q();
        }
        t4.b bVar19 = f0Var.f10474b;
        bVar19.getClass();
        bVar19.T.f9657o.setVisibility(0);
        t4.b bVar20 = f0Var.f10474b;
        bVar20.getClass();
        bVar20.T.f9655m.setVisibility(8);
        t4.b bVar21 = f0Var.f10474b;
        bVar21.getClass();
        bVar21.T.f9665x.setVisibility(8);
        t4.b bVar22 = f0Var.f10474b;
        bVar22.getClass();
        ((RelativeLayout) bVar22.P.f9815y).setVisibility(8);
        t4.b bVar23 = f0Var.f10474b;
        bVar23.getClass();
        bVar23.B.setVisibility(8);
        f0Var.I(R.id.action_antivirus_report);
        f0Var.I(R.id.action_uninstall);
        f0Var.I(R.id.action_exclude);
    }

    public static final void k(f0 f0Var, int i) {
        f0Var.J();
        t4.b bVar = f0Var.f10474b;
        bVar.getClass();
        bVar.T.C.setText(f0Var.getString(R.string.unzipping_status, Integer.valueOf(i)));
        t4.b bVar2 = f0Var.f10474b;
        bVar2.getClass();
        bVar2.L.f9874w.setText(f0Var.getString(R.string.unzipping_status, Integer.valueOf(i)));
    }

    public static final void l(f0 f0Var, x4.g gVar) {
        if ((f0Var.getActivity() instanceof MainActivity) || (f0Var.getActivity() instanceof AppDetailActivity)) {
            FragmentActivity activity = f0Var.getActivity();
            activity.getClass();
            ((c4.k0) activity).t0(gVar, new androidx.work.impl.utils.c(13, gVar, f0Var));
        }
    }

    public static final void m(f0 f0Var, k2 k2Var, int i) {
        int dimension = (int) f0Var.getResources().getDimension(R.dimen.margin_m);
        t4.b bVar = f0Var.f10474b;
        bVar.getClass();
        if (bVar.C.getChildCount() > i) {
            t4.b bVar2 = f0Var.f10474b;
            bVar2.getClass();
            bVar2.C.removeViewAt(i);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, dimension, 0, 0);
        boolean zB = k2Var.b();
        t4.b bVar3 = f0Var.f10474b;
        if (zB) {
            bVar3.getClass();
            LinearLayout linearLayout = bVar3.C;
            Context contextRequireContext = f0Var.requireContext();
            contextRequireContext.getClass();
            linearLayout.addView(f0Var.Y(layoutParams, k2Var, contextRequireContext), i);
            return;
        }
        bVar3.getClass();
        LinearLayout linearLayout2 = bVar3.C;
        Context contextRequireContext2 = f0Var.requireContext();
        contextRequireContext2.getClass();
        linearLayout2.addView(f0Var.X(layoutParams, k2Var, contextRequireContext2), i);
    }

    public final void A() {
        if (getContext() == null || UptodownApp.T <= 0) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, UptodownApp.T);
        t4.b bVar = this.f10474b;
        bVar.getClass();
        ((FullWidthImageView) bVar.R.f7782l).setLayoutParams(layoutParams);
        t4.b bVar2 = this.f10474b;
        bVar2.getClass();
        bVar2.f9614m.setScrimVisibleHeightTrigger((int) (((double) UptodownApp.T) * 0.4d));
    }

    public final x4.g B() {
        x4.g gVar = this.f10473a;
        if (gVar != null) {
            return gVar;
        }
        kotlin.jvm.internal.l.i("appInfo");
        throw null;
    }

    public final a1 C() {
        return (a1) this.f10476m.getValue();
    }

    public final void D() {
        if (B().f11159a > 0) {
            W();
            return;
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        v7.e eVar = o7.m0.f8289a;
        o7.c0.s(lifecycleScope, t7.n.f10349a, null, new w(this, null, 3), 2);
    }

    public final void E() {
        if (getContext() != null) {
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            v7.e eVar = o7.m0.f8289a;
            o7.c0.s(lifecycleScope, t7.n.f10349a, null, new w(this, null, 4), 2);
            v0 v0VarG = G();
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            long j = B().f11159a;
            v0VarG.getClass();
            o7.c0.s(ViewModelKt.getViewModelScope(v0VarG), v7.d.f10885a, null, new n0(2, j, contextRequireContext, null, v0VarG), 2);
        }
    }

    public final long F() {
        try {
            String str = B().f11178p;
            if (str != null && str.length() != 0) {
                String str2 = B().f11178p;
                str2.getClass();
                return Long.parseLong(str2);
            }
            return 0L;
        } catch (NumberFormatException e10) {
            e10.printStackTrace();
            return 0L;
        }
    }

    public final v0 G() {
        return (v0) this.f10475l.getValue();
    }

    public final boolean H() {
        File externalFilesDir;
        FragmentActivity activity = getActivity();
        activity.getClass();
        if (((c4.k0) activity).l() && getContext() != null) {
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            h4.a aVar = new h4.a(contextRequireContext);
            if (aVar.d()) {
                File[] externalFilesDirs = contextRequireContext.getExternalFilesDirs(null);
                if (externalFilesDirs.length > 1) {
                    externalFilesDir = externalFilesDirs[1];
                } else {
                    externalFilesDir = contextRequireContext.getExternalFilesDir(null);
                    aVar.g();
                    aVar.f();
                }
            } else {
                externalFilesDir = contextRequireContext.getExternalFilesDir(null);
            }
            File file = new File(externalFilesDir, "Apps");
            if (!file.exists()) {
                file.mkdirs();
            }
            requireContext().getClass();
            if (a.a.F(r0, file) < F() * 2.25d) {
                return false;
            }
        }
        return true;
    }

    public final void I(int i) {
        Menu menu = this.f10480q;
        if (menu != null) {
            menu.getClass();
            menu.findItem(i).setVisible(false);
        }
    }

    public final void J() {
        r0();
        t4.b bVar = this.f10474b;
        bVar.getClass();
        ProgressBar progressBar = bVar.T.f9660r;
        t4.b bVar2 = this.f10474b;
        bVar2.getClass();
        t0.f.I(progressBar, bVar2.T.f9653b);
        r7.o0 o0Var = G().I;
        o0Var.getClass();
        o0Var.g(null, -1);
        t4.b bVar3 = this.f10474b;
        bVar3.getClass();
        ((RelativeLayout) bVar3.P.f9813w).setVisibility(8);
        t4.b bVar4 = this.f10474b;
        bVar4.getClass();
        bVar4.P.f9812u.setVisibility(8);
        t4.b bVar5 = this.f10474b;
        bVar5.getClass();
        ((RelativeLayout) bVar5.P.v).setVisibility(8);
        t4.b bVar6 = this.f10474b;
        bVar6.getClass();
        ((RelativeLayout) bVar6.P.f9814x).setVisibility(0);
        t4.b bVar7 = this.f10474b;
        bVar7.getClass();
        bVar7.T.f9660r.setIndeterminate(true);
        t4.b bVar8 = this.f10474b;
        bVar8.getClass();
        bVar8.T.C.setText(getString(R.string.status_download_update_pending));
        t4.b bVar9 = this.f10474b;
        bVar9.getClass();
        bVar9.L.f9873u.setVisibility(8);
        t4.b bVar10 = this.f10474b;
        bVar10.getClass();
        bVar10.L.f9863b.setVisibility(4);
        t4.b bVar11 = this.f10474b;
        bVar11.getClass();
        bVar11.L.f9875x.setText("");
        t4.b bVar12 = this.f10474b;
        bVar12.getClass();
        bVar12.L.f9866n.setIndeterminate(true);
        t4.b bVar13 = this.f10474b;
        bVar13.getClass();
        bVar13.L.v.setText("");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x07d1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x07e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K(final androidx.fragment.app.FragmentActivity r19) {
        /*
            Method dump skipped, instruction units count: 2479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.f0.K(androidx.fragment.app.FragmentActivity):void");
    }

    public final boolean L() {
        long j = B().f11159a;
        return a5.b.c(j) || a5.c.b(j);
    }

    public final void M(File file) {
        boolean zM;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        boolean z9 = false;
        try {
            SharedPreferences sharedPreferences = contextRequireContext.getSharedPreferences("CoreSettings", 0);
            if (sharedPreferences.contains("show_installation_details")) {
                z9 = sharedPreferences.getBoolean("show_installation_details", false);
            }
        } catch (Exception unused) {
        }
        if (z9) {
            if (getActivity() == null || requireActivity().isFinishing()) {
                return;
            }
            FragmentActivity activity = getActivity();
            activity.getClass();
            int i = c4.k0.N;
            ((c4.k0) activity).V(file, null);
            return;
        }
        s sVar = new s(this, 1);
        if (getActivity() instanceof MainActivity) {
            FragmentActivity activity2 = getActivity();
            activity2.getClass();
            zM = ((MainActivity) activity2).m();
        } else if (getActivity() instanceof AppDetailActivity) {
            FragmentActivity activity3 = getActivity();
            activity3.getClass();
            zM = ((AppDetailActivity) activity3).m();
        } else {
            zM = true;
        }
        String name = file.getName();
        name.getClass();
        if (!l7.u.k0(name, ".xapk", true) && !l7.u.k0(name, ".apks", true) && !l7.u.k0(name, ".apkm", true) && !l7.u.k0(name, ".zip", true)) {
            float f = UptodownApp.I;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            fragmentActivityRequireActivity.getClass();
            b4.d.q(fragmentActivityRequireActivity, B().f11162c0, file);
            return;
        }
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        String absolutePath = file.getAbsolutePath();
        absolutePath.getClass();
        new a2.t(contextRequireContext2, absolutePath, sVar, zM);
    }

    public final void N(k2 k2Var) {
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        v7.e eVar = o7.m0.f8289a;
        t6.c cVar = null;
        o7.c0.s(lifecycleScope, t7.n.f10349a, null, new y(this, k2Var, cVar, 0), 2);
        v0 v0VarG = G();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        v0VarG.getClass();
        o7.c0.s(ViewModelKt.getViewModelScope(v0VarG), v7.d.f10885a, null, new b6.g(v0VarG, k2Var, contextRequireContext, cVar, 24), 2);
    }

    public final void O(String str) {
        Bundle bundleE = k0.k.e(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, str);
        bundleE.putString("packagename", B().F);
        if (B().f11159a >= 0) {
            bundleE.putString("appId", String.valueOf(B().f11159a));
        }
        if (B().J >= 0) {
            bundleE.putString("fileId", String.valueOf(B().J));
        }
        float f = UptodownApp.I;
        if (b4.d.k(B().F)) {
            bundleE.putInt("deeplink", 1);
        } else {
            bundleE.putInt("deeplink", 0);
        }
        android.support.v4.media.g gVar = this.f10477n;
        if (gVar != null) {
            gVar.E(bundleE, "warning");
        }
    }

    public final void P() {
        String str;
        if (getActivity() == null || requireActivity().isFinishing() || (str = B().F) == null || str.length() == 0 || l7.u.m0(B().F, requireActivity().getPackageName(), true)) {
            return;
        }
        PackageManager packageManager = requireActivity().getPackageManager();
        String str2 = B().F;
        str2.getClass();
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str2);
        if (launchIntentForPackage != null) {
            try {
                startActivity(launchIntentForPackage);
            } catch (ActivityNotFoundException unused) {
                String string = getString(R.string.error_open_app, B().f11160b);
                string.getClass();
                v(string);
            } catch (SecurityException unused2) {
                String string2 = getString(R.string.error_open_app, B().f11160b);
                string2.getClass();
                v(string2);
            }
        }
    }

    public final void Q(x4.j jVar) {
        if (getActivity() != null) {
            FragmentActivity activity = getActivity();
            activity.getClass();
            if (((c4.k0) activity).T()) {
                if (getActivity() instanceof MainActivity) {
                    FragmentActivity activity2 = getActivity();
                    activity2.getClass();
                    ((MainActivity) activity2).y1(jVar);
                } else if (getActivity() instanceof AppDetailActivity) {
                    FragmentActivity activity3 = getActivity();
                    activity3.getClass();
                    ((AppDetailActivity) activity3).A0(jVar);
                }
            }
        }
    }

    public final void R() {
        if (getActivity() == null || requireActivity().isFinishing()) {
            return;
        }
        Intent intent = new Intent(requireActivity(), (Class<?>) LoginActivity.class);
        float f = UptodownApp.I;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        fragmentActivityRequireActivity.getClass();
        this.f10486x.launch(intent, b4.d.b(fragmentActivityRequireActivity));
    }

    public final void S(k2 k2Var) {
        if (requireActivity().isFinishing()) {
            return;
        }
        FragmentActivity activity = getActivity();
        activity.getClass();
        if (((c4.k0) activity).T()) {
            Intent intent = new Intent(requireActivity(), (Class<?>) RepliesActivity.class);
            intent.putExtra("review", k2Var);
            intent.putExtra("appId", B().f11159a);
            intent.putExtra("appName", B().f11160b);
            intent.putExtra("appIconUrl", B().f11188u);
            float f = UptodownApp.I;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            fragmentActivityRequireActivity.getClass();
            startActivity(intent, b4.d.a(fragmentActivityRequireActivity));
        }
    }

    public final void T() {
        if (requireActivity().isFinishing()) {
            return;
        }
        FragmentActivity activity = getActivity();
        activity.getClass();
        if (((c4.k0) activity).T()) {
            Intent intent = new Intent(requireActivity(), (Class<?>) ReviewsActivity.class);
            intent.putExtra("appInfo", B());
            intent.putExtra("myReview", (Parcelable) G().v.getValue());
            float f = UptodownApp.I;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            fragmentActivityRequireActivity.getClass();
            startActivity(intent, b4.d.a(fragmentActivityRequireActivity));
        }
    }

    public final void U(k2 k2Var) {
        float f = UptodownApp.I;
        if (b4.d.t()) {
            FragmentActivity activity = getActivity();
            activity.getClass();
            if (((c4.k0) activity).T()) {
                o7.c0.s(LifecycleOwnerKt.getLifecycleScope(this), null, null, new y(this, k2Var, null, 1), 3);
            }
        }
    }

    public final void V() {
        if (getActivity() == null || requireActivity().isFinishing()) {
            return;
        }
        if (B().Z == null) {
            r7.o0 o0Var = G().T;
            Boolean bool = Boolean.TRUE;
            o0Var.getClass();
            o0Var.g(null, bool);
            o7.c0.s(LifecycleOwnerKt.getLifecycleScope(this), null, null, new w(this, null, 18), 3);
            return;
        }
        Intent intent = new Intent(requireActivity(), (Class<?>) VirusTotalReport.class);
        intent.putExtra("appInfo", B());
        intent.putExtra("appReportVT", B().Z);
        float f = UptodownApp.I;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        fragmentActivityRequireActivity.getClass();
        startActivity(intent, b4.d.a(fragmentActivityRequireActivity));
    }

    public final void W() {
        String str;
        String str2;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        String str3 = B().f11188u;
        t6.c cVar = null;
        if (str3 == null || str3.length() == 0) {
            t4.b bVar = this.f10474b;
            bVar.getClass();
            bVar.T.f9653b.setImageDrawable(ContextCompat.getDrawable(contextRequireContext, R.drawable.vector_app_icon_placeholder));
            t4.b bVar2 = this.f10474b;
            bVar2.getClass();
            ((ImageView) bVar2.H.f8823q).setImageDrawable(ContextCompat.getDrawable(contextRequireContext, R.drawable.vector_app_icon_placeholder));
        } else {
            a4.l0 l0VarE = a4.g0.d().e(B().h());
            float f = UptodownApp.I;
            l0VarE.g(b4.d.f(contextRequireContext));
            l0VarE.h(b4.d.x(contextRequireContext));
            t4.b bVar3 = this.f10474b;
            bVar3.getClass();
            l0VarE.e(bVar3.T.f9653b, new m8.q(18, this, contextRequireContext));
            a4.l0 l0VarE2 = a4.g0.d().e(B().i());
            l0VarE2.g(b4.d.f(contextRequireContext));
            l0VarE2.h(b4.d.x(contextRequireContext));
            t4.b bVar4 = this.f10474b;
            bVar4.getClass();
            l0VarE2.e((ImageView) bVar4.H.f8823q, null);
        }
        String str4 = B().f11188u;
        if ((str4 == null || str4.length() == 0) && ((str = B().v) == null || str.length() == 0)) {
            s0(contextRequireContext);
        }
        String str5 = B().f11160b;
        if (str5 != null && str5.length() != 0) {
            t4.b bVar5 = this.f10474b;
            bVar5.getClass();
            bVar5.T.A.setText(B().f11160b);
            t4.b bVar6 = this.f10474b;
            bVar6.getClass();
            bVar6.F0.setText(contextRequireContext.getString(R.string.similar_to_x, B().f11160b));
        }
        String str6 = B().f11171l;
        if (str6 != null && str6.length() != 0) {
            t4.b bVar7 = this.f10474b;
            bVar7.getClass();
            bVar7.T.G.setText(B().f11171l);
            t4.b bVar8 = this.f10474b;
            bVar8.getClass();
            bVar8.T.G.setVisibility(0);
        }
        String str7 = B().f11165f0;
        if (str7 != null && str7.length() != 0) {
            t4.b bVar9 = this.f10474b;
            bVar9.getClass();
            bVar9.T.B.setText(B().f11165f0);
            t4.b bVar10 = this.f10474b;
            bVar10.getClass();
            bVar10.T.B.setVisibility(0);
        }
        String str8 = B().f11191w;
        if (str8 != null && str8.length() != 0) {
            t4.b bVar11 = this.f10474b;
            bVar11.getClass();
            bVar11.T.f9662t.setText(B().f11191w);
        }
        if (B().f11163d0 == 1) {
            t4.b bVar12 = this.f10474b;
            bVar12.getClass();
            bVar12.T.f9663u.setVisibility(0);
        }
        int i = 8;
        if (B().G0 != null) {
            x4.y1 y1Var = B().G0;
            y1Var.getClass();
            if (y1Var.f11468a != null) {
                t4.b bVar13 = this.f10474b;
                bVar13.getClass();
                bVar13.T.v.setVisibility(0);
                t4.b bVar14 = this.f10474b;
                bVar14.getClass();
                TextView textView = bVar14.T.v;
                x4.y1 y1Var2 = B().G0;
                y1Var2.getClass();
                textView.setText(y1Var2.f11468a);
                t4.b bVar15 = this.f10474b;
                bVar15.getClass();
                bVar15.T.v.setOnClickListener(new e(this, i));
            }
        }
        String str9 = B().f11176o;
        x xVar = this.v;
        if (str9 == null || str9.length() == 0) {
            t4.b bVar16 = this.f10474b;
            bVar16.getClass();
            bVar16.E0.setVisibility(8);
        } else {
            t4.b bVar17 = this.f10474b;
            bVar17.getClass();
            bVar17.E0.setVisibility(0);
            t4.b bVar18 = this.f10474b;
            bVar18.getClass();
            bVar18.E0.setOnTouchListener(new l5.e());
            t4.b bVar19 = this.f10474b;
            bVar19.getClass();
            TextView textView2 = bVar19.E0;
            String str10 = B().f11176o;
            str10.getClass();
            Context contextRequireContext2 = requireContext();
            contextRequireContext2.getClass();
            textView2.setText(a.a.M(str10, contextRequireContext2, xVar));
        }
        String str11 = B().f11193x;
        if (str11 == null || str11.length() == 0) {
            t4.b bVar20 = this.f10474b;
            bVar20.getClass();
            bVar20.N.setVisibility(8);
        } else {
            t4.b bVar21 = this.f10474b;
            bVar21.getClass();
            bVar21.f9610j0.setOnTouchListener(new l5.e());
            if (getResources().getConfiguration().getLayoutDirection() == 1) {
                t4.b bVar22 = this.f10474b;
                bVar22.getClass();
                bVar22.f9610j0.setTextDirection(2);
            }
            t4.b bVar23 = this.f10474b;
            bVar23.getClass();
            TextView textView3 = bVar23.f9610j0;
            String str12 = B().f11193x;
            str12.getClass();
            Context contextRequireContext3 = requireContext();
            contextRequireContext3.getClass();
            textView3.setText(a.a.M(str12, contextRequireContext3, xVar));
            t4.b bVar24 = this.f10474b;
            bVar24.getClass();
            bVar24.N.setVisibility(0);
            String str13 = B().f11179p0;
            if (str13 == null || str13.length() == 0) {
                String str14 = B().f11172l0;
                if (str14 != null && str14.length() != 0) {
                    t4.b bVar25 = this.f10474b;
                    bVar25.getClass();
                    TextView textView4 = bVar25.f9615m0;
                    String str15 = B().f11172l0;
                    str15.getClass();
                    Context contextRequireContext4 = requireContext();
                    contextRequireContext4.getClass();
                    textView4.setText(a.a.M(str15, contextRequireContext4, xVar));
                    String str16 = B().n0;
                    if (str16 == null || str16.length() == 0) {
                        t4.b bVar26 = this.f10474b;
                        bVar26.getClass();
                        bVar26.f9613l0.setVisibility(8);
                    } else {
                        t4.b bVar27 = this.f10474b;
                        bVar27.getClass();
                        bVar27.f9613l0.setText(B().n0);
                    }
                    String str17 = B().f11174m0;
                    if (str17 == null || str17.length() == 0) {
                        t4.b bVar28 = this.f10474b;
                        bVar28.getClass();
                        bVar28.f9619p.setVisibility(8);
                    } else {
                        a4.l0 l0VarE3 = a4.g0.d().e(B().f11174m0);
                        float f10 = UptodownApp.I;
                        Context contextRequireContext5 = requireContext();
                        contextRequireContext5.getClass();
                        l0VarE3.g(b4.d.f(contextRequireContext5));
                        Context contextRequireContext6 = requireContext();
                        contextRequireContext6.getClass();
                        l0VarE3.h(b4.d.x(contextRequireContext6));
                        t4.b bVar29 = this.f10474b;
                        bVar29.getClass();
                        l0VarE3.e(bVar29.f9619p, null);
                    }
                    int i6 = B().f11181q0;
                    t4.b bVar30 = this.f10474b;
                    if (i6 == 1) {
                        bVar30.getClass();
                        bVar30.n0.setVisibility(0);
                    } else {
                        bVar30.getClass();
                        bVar30.n0.setVisibility(8);
                    }
                }
            } else {
                t4.b bVar31 = this.f10474b;
                bVar31.getClass();
                bVar31.f9615m0.setText(B().f11179p0);
                t4.b bVar32 = this.f10474b;
                bVar32.getClass();
                bVar32.n0.setVisibility(8);
                t4.b bVar33 = this.f10474b;
                bVar33.getClass();
                bVar33.f9619p.setVisibility(8);
            }
        }
        String str18 = B().f11175n;
        if (str18 == null || str18.length() == 0) {
            I(R.id.action_share);
            I(R.id.action_open_web);
        } else {
            n0(R.id.action_share);
            n0(R.id.action_open_web);
        }
        String str19 = B().f11178p;
        if (str19 == null || str19.length() == 0) {
            I(R.id.action_antivirus_report);
            t4.b bVar34 = this.f10474b;
            bVar34.getClass();
            ((RelativeLayout) bVar34.P.f9815y).setVisibility(8);
        } else {
            n0(R.id.action_antivirus_report);
            t4.b bVar35 = this.f10474b;
            bVar35.getClass();
            ((RelativeLayout) bVar35.P.f9815y).setVisibility(0);
        }
        String str20 = B().f11164e0;
        if (str20 == null || str20.length() == 0) {
            t4.b bVar36 = this.f10474b;
            bVar36.getClass();
            bVar36.V.setVisibility(8);
        } else {
            t4.b bVar37 = this.f10474b;
            bVar37.getClass();
            bVar37.V.setVisibility(0);
            t4.b bVar38 = this.f10474b;
            bVar38.getClass();
            bVar38.B0.setText(B().f11164e0);
        }
        int i10 = B().f11195y;
        t4.b bVar39 = this.f10474b;
        if (i10 == 0) {
            bVar39.getClass();
            bVar39.T.f9661s.setVisibility(8);
            t4.b bVar40 = this.f10474b;
            bVar40.getClass();
            bVar40.T.H.setVisibility(8);
            t4.b bVar41 = this.f10474b;
            bVar41.getClass();
            bVar41.T.f9654l.setWeightSum(2.0f);
        } else {
            bVar39.getClass();
            bVar39.T.E.setVisibility(0);
            t4.b bVar42 = this.f10474b;
            bVar42.getClass();
            bVar42.T.E.setText(String.valueOf(((double) B().f11195y) / 10.0d));
            int i11 = B().f11197z;
            t4.b bVar43 = this.f10474b;
            if (i11 == 1) {
                bVar43.getClass();
                bVar43.T.D.setText(getString(R.string.reviews_counter_single));
            } else {
                bVar43.getClass();
                TextView textView5 = bVar43.T.D;
                String string = getString(R.string.reviews_counter_multiple);
                string.getClass();
                textView5.setText(String.format(string, Arrays.copyOf(new Object[]{i5.D(B().f11197z)}, 1)));
            }
        }
        if (!B().l() || (str2 = B().f11161b0) == null || str2.length() == 0) {
            t4.b bVar44 = this.f10474b;
            bVar44.getClass();
            bVar44.T.f9664w.setText(i5.D(B().f11182r));
            t4.b bVar45 = this.f10474b;
            bVar45.getClass();
            bVar45.T.f9665x.setText(getString(R.string.more_info_downloads_label));
            String str21 = B().F;
            if (str21 == null || str21.length() == 0) {
                t4.b bVar46 = this.f10474b;
                bVar46.getClass();
                bVar46.f9636y.setVisibility(8);
            } else {
                t4.b bVar47 = this.f10474b;
                bVar47.getClass();
                bVar47.f9624r0.setText(B().F);
            }
            String str22 = B().f11178p;
            if (str22 == null || str22.length() == 0) {
                t4.b bVar48 = this.f10474b;
                bVar48.getClass();
                bVar48.A.setVisibility(8);
            } else {
                t4.b bVar49 = this.f10474b;
                bVar49.getClass();
                TextView textView6 = bVar49.f9631v0;
                long jF = F();
                Context contextRequireContext7 = requireContext();
                contextRequireContext7.getClass();
                textView6.setText(i5.H(contextRequireContext7, jF));
            }
            String str23 = B().O;
            if (str23 == null || str23.length() == 0) {
                t4.b bVar50 = this.f10474b;
                bVar50.getClass();
                bVar50.f9638z.setVisibility(8);
            } else {
                String str24 = B().O;
                str24.getClass();
                Integer numH0 = l7.t.h0(str24);
                t4.b bVar51 = this.f10474b;
                if (numH0 != null) {
                    bVar51.getClass();
                    bVar51.f9628t0.setText(getString(R.string.pegi_plus, B().O));
                } else {
                    bVar51.getClass();
                    bVar51.f9628t0.setText(B().O);
                }
            }
        } else {
            t4.b bVar52 = this.f10474b;
            bVar52.getClass();
            bVar52.T.f9664w.setText(B().f11161b0);
            t4.b bVar53 = this.f10474b;
            bVar53.getClass();
            bVar53.M.setVisibility(8);
        }
        String str25 = B().f11186t;
        if (str25 == null || str25.length() == 0 || B().l()) {
            t4.b bVar54 = this.f10474b;
            bVar54.getClass();
            bVar54.T.f9658p.setVisibility(8);
            t4.b bVar55 = this.f10474b;
            bVar55.getClass();
            bVar55.T.I.setVisibility(8);
        } else {
            t4.b bVar56 = this.f10474b;
            bVar56.getClass();
            bVar56.T.f9666y.setText(B().f11186t);
        }
        t4.b bVar57 = this.f10474b;
        bVar57.getClass();
        ((TextView) bVar57.D.f8824r).setText(String.valueOf(((double) B().f11195y) / 10.0d));
        int i12 = B().f11197z;
        t4.b bVar58 = this.f10474b;
        if (i12 == 1) {
            bVar58.getClass();
            ((TextView) bVar58.D.f8825s).setText(getString(R.string.comment_counter_single));
        } else {
            bVar58.getClass();
            TextView textView7 = (TextView) bVar58.D.f8825s;
            String string2 = getString(R.string.reviews_counter_multiple);
            string2.getClass();
            textView7.setText(String.format(string2, Arrays.copyOf(new Object[]{i5.D(B().f11197z)}, 1)));
        }
        t4.b bVar59 = this.f10474b;
        bVar59.getClass();
        ((TextView) bVar59.D.f8825s).setOnClickListener(new e(this, 14));
        String str26 = B().f11162c0;
        if (str26 == null || str26.length() == 0) {
            t4.b bVar60 = this.f10474b;
            bVar60.getClass();
            bVar60.Y.f10126b.setVisibility(8);
        } else {
            t4.b bVar61 = this.f10474b;
            bVar61.getClass();
            bVar61.Y.f10129n.setText(B().f11162c0);
            t4.b bVar62 = this.f10474b;
            bVar62.getClass();
            bVar62.Y.f10129n.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: u4.n
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    f0 f0Var = this.f10551a;
                    t4.b bVar63 = f0Var.f10474b;
                    bVar63.getClass();
                    if (b2.t1.E(bVar63.Y.f10129n)) {
                        return;
                    }
                    t4.b bVar64 = f0Var.f10474b;
                    bVar64.getClass();
                    if (bVar64.Y.f10129n.getMaxLines() <= 6) {
                        t4.b bVar65 = f0Var.f10474b;
                        bVar65.getClass();
                        bVar65.Y.f10127l.setVisibility(8);
                        t4.b bVar66 = f0Var.f10474b;
                        bVar66.getClass();
                        bVar66.Y.f10130o.setVisibility(8);
                    }
                }
            });
            t4.b bVar63 = this.f10474b;
            bVar63.getClass();
            bVar63.Y.f10126b.setVisibility(0);
        }
        String str27 = B().J0;
        if (str27 == null || str27.length() == 0) {
            t4.b bVar64 = this.f10474b;
            bVar64.getClass();
            bVar64.S.setVisibility(8);
        } else {
            t4.b bVar65 = this.f10474b;
            bVar65.getClass();
            bVar65.S.setVisibility(0);
            t4.b bVar66 = this.f10474b;
            bVar66.getClass();
            bVar66.f9622q0.setText(getString(R.string.is_for_you_if, B().f11160b));
            t4.b bVar67 = this.f10474b;
            bVar67.getClass();
            bVar67.f9620p0.setText(B().J0);
        }
        String str28 = B().Q;
        if (str28 == null || str28.length() == 0) {
            String str29 = B().R;
            if (str29 != null && str29.length() != 0) {
                t4.b bVar68 = this.f10474b;
                bVar68.getClass();
                bVar68.I0.setText(B().R);
            }
        } else {
            t4.b bVar69 = this.f10474b;
            bVar69.getClass();
            bVar69.I0.setText(B().Q);
        }
        x4.r1 r1VarA = i5.A(contextRequireContext);
        if (r1VarA != null && r1VarA.f11372a == B().f11159a && r1VarA.f11376e <= 0) {
            r1VarA.f11376e = System.currentTimeMillis();
            r1VarA.a(contextRequireContext);
        }
        if (kotlin.jvm.internal.l.a(B().F, requireContext().getPackageName()) || kotlin.jvm.internal.l.a(B().F, "com.uptodown.installer")) {
            t4.b bVar70 = this.f10474b;
            bVar70.getClass();
            bVar70.v.setVisibility(8);
        }
        ArrayList arrayList = B().D0;
        if (arrayList != null && !arrayList.isEmpty()) {
            t4.b bVar71 = this.f10474b;
            bVar71.getClass();
            if (bVar71.F.getVisibility() == 8) {
                t4.b bVar72 = this.f10474b;
                bVar72.getClass();
                bVar72.F.setVisibility(0);
                t4.b bVar73 = this.f10474b;
                bVar73.getClass();
                bVar73.H0.setTypeface(f4.c.f4883w);
                t4.b bVar74 = this.f10474b;
                bVar74.getClass();
                bVar74.G0.setTypeface(f4.c.f4884x);
                ArrayList arrayList2 = B().D0;
                arrayList2.getClass();
                Iterator it = arrayList2.iterator();
                it.getClass();
                while (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    String str30 = (String) next;
                    if (str30.length() > 0) {
                        View viewInflate = getLayoutInflater().inflate(R.layout.tv_user_says, (ViewGroup) null, false);
                        int i13 = R.id.iv_user_says;
                        if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.iv_user_says)) != null) {
                            i13 = R.id.tv_user_says;
                            TextView textView8 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_user_says);
                            if (textView8 != null) {
                                View view = (LinearLayout) viewInflate;
                                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                                layoutParams.setMargins(0, (int) getResources().getDimension(R.dimen.margin_m), 0, 0);
                                view.setLayoutParams(layoutParams);
                                textView8.setTypeface(f4.c.f4884x);
                                textView8.setText(str30);
                                t4.b bVar75 = this.f10474b;
                                bVar75.getClass();
                                bVar75.G.addView(view);
                            }
                        }
                        com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i13)));
                        return;
                    }
                }
            }
        }
        String str31 = B().f11178p;
        if (str31 != null && str31.length() != 0 && getActivity() != null && !requireActivity().isFinishing() && B().Z == null) {
            o7.c0.s(LifecycleOwnerKt.getLifecycleScope(this), null, null, new w(this, cVar, 19), 3);
        }
        Context contextRequireContext8 = requireContext();
        contextRequireContext8.getClass();
        p0(contextRequireContext8);
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        v7.e eVar = o7.m0.f8289a;
        p7.c cVar2 = t7.n.f10349a;
        o7.c0.s(lifecycleScope, cVar2, null, new w(this, cVar, 23), 2);
        o7.c0.s(LifecycleOwnerKt.getLifecycleScope(this), cVar2, null, new w(this, cVar, 20), 2);
        r7.o0 o0Var = G().N;
        Boolean bool = Boolean.TRUE;
        o0Var.getClass();
        o0Var.g(null, bool);
        if (((Number) G().Q.getValue()).intValue() > 0) {
            w0();
        }
        z();
    }

    public final RelativeLayout X(LinearLayout.LayoutParams layoutParams, k2 k2Var, Context context) {
        int i;
        CharSequence charSequenceK0;
        t4.p0 p0VarA = t4.p0.a(getLayoutInflater().inflate(R.layout.review, (ViewGroup) null, false));
        TextView textView = p0VarA.f10057x;
        LinearLayout linearLayout = p0VarA.f10054t;
        ImageView imageView = p0VarA.f10046l;
        TextView textView2 = p0VarA.f10059z;
        TextView textView3 = p0VarA.f10056w;
        LinearLayout linearLayout2 = p0VarA.f10055u;
        ImageView imageView2 = p0VarA.f10047m;
        TextView textView4 = p0VarA.f10058y;
        TextView textView5 = p0VarA.v;
        UsernameTextView usernameTextView = p0VarA.B;
        RelativeLayout relativeLayout = p0VarA.f10044a;
        relativeLayout.setLayoutParams(layoutParams);
        p0VarA.f10049o.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_on));
        ImageView imageView3 = p0VarA.f10050p;
        imageView3.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_off));
        ImageView imageView4 = p0VarA.f10051q;
        imageView4.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_off));
        ImageView imageView5 = p0VarA.f10052r;
        imageView5.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_off));
        ImageView imageView6 = p0VarA.f10053s;
        imageView6.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_off));
        if (k2Var.f11265p >= 2) {
            i = R.drawable.vector_star_on;
            imageView3.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_on));
        } else {
            i = R.drawable.vector_star_on;
        }
        int i6 = 3;
        if (k2Var.f11265p >= 3) {
            imageView4.setImageDrawable(ContextCompat.getDrawable(context, i));
        }
        int i10 = 4;
        if (k2Var.f11265p >= 4) {
            imageView5.setImageDrawable(ContextCompat.getDrawable(context, i));
        }
        int i11 = 5;
        if (k2Var.f11265p == 5) {
            imageView6.setImageDrawable(ContextCompat.getDrawable(context, i));
        }
        usernameTextView.setTypeface(f4.c.f4883w);
        textView3.setTypeface(f4.c.f4884x);
        textView5.setTypeface(f4.c.f4884x);
        textView4.setTypeface(f4.c.f4884x);
        textView2.setTypeface(f4.c.f4884x);
        String strE = u2.e(k2Var.f11262m);
        if (strE == null || strE.length() == 0) {
            charSequenceK0 = null;
        } else {
            a4.l0 l0VarE = a4.g0.d().e(u2.e(k2Var.f11262m));
            float f = UptodownApp.I;
            l0VarE.h(b4.d.x(context));
            charSequenceK0 = null;
            l0VarE.e(imageView, null);
        }
        String str = k2Var.f11260b;
        if (str != null && str.length() != 0) {
            imageView.setOnClickListener(new j(this, k2Var, i10));
            usernameTextView.setOnClickListener(new j(this, k2Var, i11));
        }
        String str2 = k2Var.f11261l;
        if (str2 != null && str2.length() != 0) {
            usernameTextView.setText(k2Var.f11261l);
            int i12 = UsernameTextView.f3453s;
            i5.g(usernameTextView, k2Var.b(), k2Var.f11271w);
        }
        String str3 = k2Var.f11267r;
        if (str3 != null && str3.length() != 0) {
            textView3.setText(k2Var.f11267r);
        }
        int i13 = k2Var.f11266q;
        if (i13 > 0) {
            textView2.setText(String.valueOf(i13));
        }
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        w2 w2VarH = u2.h(contextRequireContext);
        int i14 = 6;
        if (kotlin.jvm.internal.l.a(w2VarH != null ? w2VarH.f11432a : charSequenceK0, k2Var.f11260b)) {
            imageView2.setVisibility(8);
        } else {
            k0.k.l(this, k2Var.f11272x == 1 ? R.drawable.vector_following : R.drawable.vector_follow, imageView2);
            imageView2.setOnClickListener(new j(this, k2Var, i14));
        }
        String str4 = k2Var.f11264o;
        if (str4 == null || str4.length() == 0) {
            textView5.setVisibility(8);
            linearLayout2.setVisibility(8);
            linearLayout.setVisibility(8);
        } else {
            textView4.setFocusable(true);
            Spanned spannedA = k2Var.a();
            if (spannedA != null) {
                charSequenceK0 = l7.m.K0(spannedA);
            }
            textView5.setText(charSequenceK0);
            textView5.getViewTreeObserver().addOnPreDrawListener(new e4.h1(p0VarA, i6));
            p0VarA.A.setOnClickListener(new f(p0VarA, this, i14));
            linearLayout2.setOnClickListener(new j(this, k2Var, 7));
            linearLayout2.setFocusable(true);
            textView.setTypeface(f4.c.f4884x);
            textView.setText(String.valueOf(k2Var.f11268s));
            if (j5.t.f6710b.contains(Long.valueOf(k2Var.f11259a))) {
                k0.k.l(this, R.drawable.vector_heart_red, p0VarA.f10048n);
            }
            linearLayout.setOnClickListener(new c4.t(this, p0VarA, k2Var, 19));
        }
        textView4.setFocusable(true);
        return relativeLayout;
    }

    public final RelativeLayout Y(LinearLayout.LayoutParams layoutParams, k2 k2Var, Context context) {
        int i;
        CharSequence charSequenceK0;
        t4.q0 q0VarA = t4.q0.a(getLayoutInflater().inflate(R.layout.review_turbo, (ViewGroup) null, false));
        ImageView imageView = q0VarA.f10073t;
        LinearLayout linearLayout = q0VarA.f10074u;
        TextView textView = q0VarA.f10077y;
        TextView textView2 = q0VarA.A;
        TextView textView3 = q0VarA.f10076x;
        LinearLayout linearLayout2 = q0VarA.v;
        ImageView imageView2 = q0VarA.f10066m;
        ImageView imageView3 = q0VarA.f10065l;
        TextView textView4 = q0VarA.f10078z;
        TextView textView5 = q0VarA.f10075w;
        UsernameTextView usernameTextView = q0VarA.C;
        RelativeLayout relativeLayout = q0VarA.f10063a;
        relativeLayout.setLayoutParams(layoutParams);
        q0VarA.f10068o.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_on_turbo));
        ImageView imageView4 = q0VarA.f10069p;
        imageView4.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_off_turbo));
        ImageView imageView5 = q0VarA.f10070q;
        imageView5.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_off_turbo));
        ImageView imageView6 = q0VarA.f10071r;
        imageView6.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_off_turbo));
        ImageView imageView7 = q0VarA.f10072s;
        imageView7.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_off_turbo));
        if (k2Var.f11265p >= 2) {
            i = R.drawable.vector_star_on_turbo;
            imageView4.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_on_turbo));
        } else {
            i = R.drawable.vector_star_on_turbo;
        }
        int i6 = 3;
        if (k2Var.f11265p >= 3) {
            imageView5.setImageDrawable(ContextCompat.getDrawable(context, i));
        }
        int i10 = 4;
        if (k2Var.f11265p >= 4) {
            imageView6.setImageDrawable(ContextCompat.getDrawable(context, i));
        }
        if (k2Var.f11265p == 5) {
            imageView7.setImageDrawable(ContextCompat.getDrawable(context, i));
        }
        usernameTextView.setTypeface(f4.c.f4883w);
        textView3.setTypeface(f4.c.f4884x);
        textView5.setTypeface(f4.c.f4884x);
        textView4.setTypeface(f4.c.f4884x);
        textView2.setTypeface(f4.c.f4884x);
        if (u2.e(k2Var.f11262m) != null) {
            a4.l0 l0VarE = a4.g0.d().e(u2.e(k2Var.f11262m));
            float f = UptodownApp.I;
            l0VarE.h(b4.d.x(context));
            charSequenceK0 = null;
            l0VarE.e(imageView3, null);
        } else {
            charSequenceK0 = null;
        }
        String str = k2Var.f11260b;
        int i11 = 1;
        if (str != null && str.length() != 0) {
            imageView3.setOnClickListener(new j(this, k2Var, 0));
            usernameTextView.setOnClickListener(new j(this, k2Var, i11));
        }
        String str2 = k2Var.f11261l;
        if (str2 != null) {
            usernameTextView.setText(str2);
            int i12 = UsernameTextView.f3453s;
            i5.g(usernameTextView, k2Var.b(), k2Var.f11271w);
        }
        String str3 = k2Var.f11267r;
        if (str3 != null) {
            textView3.setText(str3);
        }
        int i13 = k2Var.f11266q;
        if (i13 > 0) {
            textView2.setText(String.valueOf(i13));
        }
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        w2 w2VarH = u2.h(contextRequireContext);
        if (kotlin.jvm.internal.l.a(w2VarH != null ? w2VarH.f11432a : charSequenceK0, k2Var.f11260b)) {
            imageView2.setVisibility(8);
        } else {
            k0.k.l(this, k2Var.f11272x == 1 ? R.drawable.vector_following : R.drawable.vector_follow, imageView2);
            imageView2.setOnClickListener(new j(this, k2Var, 2));
        }
        if (k2Var.f11264o != null) {
            textView4.setFocusable(true);
            Spanned spannedA = k2Var.a();
            if (spannedA != null) {
                charSequenceK0 = l7.m.K0(spannedA);
            }
            textView5.setText(charSequenceK0);
            textView5.getViewTreeObserver().addOnPreDrawListener(new e4.h1(q0VarA, i10));
            q0VarA.B.setOnClickListener(new f(q0VarA, this, i10));
            linearLayout2.setOnClickListener(new j(this, k2Var, i6));
            linearLayout2.setFocusable(true);
            textView.setTypeface(f4.c.f4884x);
            textView.setText(String.valueOf(k2Var.f11268s));
            if (j5.t.f6710b.contains(Long.valueOf(k2Var.f11259a))) {
                k0.k.l(this, R.drawable.vector_heart_red, q0VarA.f10067n);
            }
            linearLayout.setOnClickListener(new c4.t(this, q0VarA, k2Var, 18));
        } else {
            textView5.setVisibility(8);
            linearLayout2.setVisibility(8);
            linearLayout.setVisibility(8);
        }
        imageView.setOnClickListener(new e(this, 7));
        imageView.setVisibility(0);
        int dimension = (int) imageView3.getContext().getResources().getDimension(R.dimen.border_radius_xs);
        imageView3.setForeground(ContextCompat.getDrawable(imageView3.getContext(), R.drawable.shape_stroke_review_avatar_turbo));
        imageView3.setPadding(dimension, dimension, dimension, dimension);
        textView4.setFocusable(true);
        return relativeLayout;
    }

    public final void Z(String str) {
        int iIntValue = ((Number) G().S.getValue()).intValue();
        if (1 > iIntValue || iIntValue >= 6) {
            FragmentActivity activity = getActivity();
            activity.getClass();
            String string = getString(R.string.error_review_no_valoration);
            string.getClass();
            ((c4.k0) activity).A(string);
            return;
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        v7.e eVar = o7.m0.f8289a;
        o7.c0.s(lifecycleScope, t7.n.f10349a, null, new w(this, null, 21), 2);
        v0 v0VarG = G();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        int iIntValue2 = ((Number) G().S.getValue()).intValue();
        long j = B().f11159a;
        v0VarG.getClass();
        str.getClass();
        o7.c0.s(ViewModelKt.getViewModelScope(v0VarG), v7.d.f10885a, null, new t0(contextRequireContext, str, iIntValue2, j, v0VarG, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a0() {
        /*
            r5 = this;
            t4.b r0 = r5.f10474b
            r0.getClass()
            android.widget.FrameLayout r0 = r0.f9616n
            int r0 = r0.getChildCount()
            r1 = 0
            if (r0 != 0) goto L7d
            x4.g r0 = r5.B()
            java.lang.String r0 = r0.F
            android.content.Context r2 = r5.getContext()
            r3 = 0
            if (r0 == 0) goto L28
            if (r2 == 0) goto L28
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L28
            if (r2 == 0) goto L28
            android.content.pm.PackageInfo r0 = n4.i.e(r2, r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L28
            goto L29
        L28:
            r0 = r3
        L29:
            if (r0 == 0) goto L36
            android.content.Context r0 = r5.requireContext()
            r0.getClass()
            r5.h0(r0)
            goto L43
        L36:
            r0 = 2131951692(0x7f13004c, float:1.9539806E38)
            java.lang.String r0 = r5.getString(r0)
            r0.getClass()
            r5.b0(r0)
        L43:
            android.view.LayoutInflater r0 = r5.getLayoutInflater()
            r2 = 2131558455(0x7f0d0037, float:1.8742226E38)
            android.view.View r0 = r0.inflate(r2, r3, r1)
            r2 = 2131363717(0x7f0a0785, float:1.834725E38)
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r2)
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L6b
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            android.graphics.Typeface r2 = f4.c.f4884x
            r3.setTypeface(r2)
            t4.b r2 = r5.f10474b
            r2.getClass()
            android.widget.FrameLayout r2 = r2.f9616n
            r2.addView(r0)
            goto L7d
        L6b:
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r0 = r0.getResourceName(r2)
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r0 = r1.concat(r0)
            com.google.gson.internal.a.i(r0)
            return
        L7d:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r0.<init>(r2)
            u4.l r2 = new u4.l
            r2.<init>(r5, r1)
            r3 = 5000(0x1388, double:2.4703E-320)
            r0.postDelayed(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.f0.a0():void");
    }

    public final void b0(String str) {
        t4.b bVar = this.f10474b;
        bVar.getClass();
        bVar.T.f9657o.setVisibility(0);
        t4.b bVar2 = this.f10474b;
        bVar2.getClass();
        bVar2.T.f9655m.setVisibility(8);
        t4.b bVar3 = this.f10474b;
        bVar3.getClass();
        bVar3.P.f9808q.setVisibility(0);
        t4.b bVar4 = this.f10474b;
        bVar4.getClass();
        ((RelativeLayout) bVar4.P.v).setVisibility(8);
        t4.b bVar5 = this.f10474b;
        bVar5.getClass();
        ((RelativeLayout) bVar5.P.f9813w).setVisibility(8);
        t4.b bVar6 = this.f10474b;
        bVar6.getClass();
        bVar6.P.f9812u.setVisibility(8);
        t4.b bVar7 = this.f10474b;
        bVar7.getClass();
        bVar7.L.f9867o.setVisibility(0);
        t4.b bVar8 = this.f10474b;
        bVar8.getClass();
        bVar8.L.f9876y.setVisibility(8);
        t4.b bVar9 = this.f10474b;
        bVar9.getClass();
        bVar9.L.f9868p.setVisibility(8);
        t4.b bVar10 = this.f10474b;
        bVar10.getClass();
        bVar10.L.f9873u.setVisibility(8);
        r7.o0 o0Var = G().I;
        o0Var.getClass();
        o0Var.g(null, -1);
        t4.b bVar11 = this.f10474b;
        bVar11.getClass();
        ((RelativeLayout) bVar11.P.f9815y).setVisibility(8);
        t4.b bVar12 = this.f10474b;
        bVar12.getClass();
        bVar12.T.f9655m.setVisibility(8);
        t4.b bVar13 = this.f10474b;
        bVar13.getClass();
        bVar13.P.f9809r.setText(str);
        t4.b bVar14 = this.f10474b;
        bVar14.getClass();
        bVar14.L.f9871s.setText(str);
        t4.b bVar15 = this.f10474b;
        bVar15.getClass();
        bVar15.L.f9876y.setOnClickListener(null);
        t4.b bVar16 = this.f10474b;
        bVar16.getClass();
        bVar16.L.f9867o.setOnClickListener(new e(this, 29));
        t4.b bVar17 = this.f10474b;
        bVar17.getClass();
        bVar17.P.f9808q.setOnClickListener(new p(this, 0));
        I(R.id.action_antivirus_report);
        I(R.id.action_uninstall);
    }

    public final void c0(Context context) {
        String string;
        SharedPreferences sharedPreferences;
        q0();
        t4.b bVar = this.f10474b;
        bVar.getClass();
        ProgressBar progressBar = bVar.T.f9660r;
        t4.b bVar2 = this.f10474b;
        bVar2.getClass();
        t0.f.s(progressBar, bVar2.T.f9653b);
        r7.o0 o0Var = G().I;
        o0Var.getClass();
        o0Var.g(null, -1);
        try {
            sharedPreferences = context.getSharedPreferences("CoreSettings", 0);
        } catch (Exception unused) {
        }
        boolean z9 = sharedPreferences.contains("install_apk_as_root_system") ? sharedPreferences.getBoolean("install_apk_as_root_system", false) : false;
        if (z9) {
            string = context.getString(R.string.option_button_install);
            string.getClass();
        } else {
            String str = B().f11165f0;
            if (str == null || str.length() == 0) {
                string = context.getString(R.string.option_button_install);
                string.getClass();
            } else {
                HashMap map = B().f11187t0;
                String str2 = map != null ? (String) map.get("try") : null;
                if (str2 == null || str2.length() == 0) {
                    string = context.getString(R.string.option_button_install);
                    string.getClass();
                } else {
                    string = str2;
                }
            }
        }
        if (UptodownApp.f3292e0 && B().k()) {
            t4.b bVar3 = this.f10474b;
            bVar3.getClass();
            bVar3.P.f9803l.setVisibility(0);
            t4.b bVar4 = this.f10474b;
            bVar4.getClass();
            bVar4.P.f9804m.setVisibility(0);
        } else {
            t4.b bVar5 = this.f10474b;
            bVar5.getClass();
            bVar5.P.f9803l.setVisibility(8);
            t4.b bVar6 = this.f10474b;
            bVar6.getClass();
            bVar6.P.f9804m.setVisibility(8);
        }
        t4.b bVar7 = this.f10474b;
        bVar7.getClass();
        ((RelativeLayout) bVar7.P.f9813w).setVisibility(8);
        t4.b bVar8 = this.f10474b;
        bVar8.getClass();
        bVar8.T.f9657o.setVisibility(0);
        t4.b bVar9 = this.f10474b;
        bVar9.getClass();
        bVar9.T.f9655m.setVisibility(8);
        t4.b bVar10 = this.f10474b;
        bVar10.getClass();
        TextView textView = bVar10.P.f9810s;
        textView.setText(string);
        z3.J(textView);
        t4.b bVar11 = this.f10474b;
        bVar11.getClass();
        ((RelativeLayout) bVar11.P.v).setBackground(ContextCompat.getDrawable(requireContext(), R.drawable.ripple_blue_primary_button));
        t4.b bVar12 = this.f10474b;
        bVar12.getClass();
        bVar12.P.f9810s.setOnClickListener(new p(this, 2));
        t4.b bVar13 = this.f10474b;
        bVar13.getClass();
        bVar13.L.f9863b.setVisibility(4);
        t4.b bVar14 = this.f10474b;
        bVar14.getClass();
        TextView textView2 = bVar14.L.f9876y;
        textView2.setText(string);
        z3.J(textView2);
        if (G().C.getValue() == null) {
            I(R.id.action_uninstall);
            I(R.id.action_app_installed_details);
        }
    }

    public final void d0(x4.r rVar) {
        r0();
        t4.b bVar = this.f10474b;
        bVar.getClass();
        ProgressBar progressBar = bVar.T.f9660r;
        t4.b bVar2 = this.f10474b;
        bVar2.getClass();
        t0.f.I(progressBar, bVar2.T.f9653b);
        t4.b bVar3 = this.f10474b;
        bVar3.getClass();
        TextView textView = bVar3.P.f9810s;
        String string = getString(R.string.option_button_cancel);
        string.getClass();
        textView.setText(string);
        z3.K(textView);
        t4.b bVar4 = this.f10474b;
        bVar4.getClass();
        ((RelativeLayout) bVar4.P.v).setBackground(ContextCompat.getDrawable(requireContext(), R.drawable.ripple_open_button));
        t4.b bVar5 = this.f10474b;
        bVar5.getClass();
        ((RelativeLayout) bVar5.P.f9813w).setVisibility(8);
        t4.b bVar6 = this.f10474b;
        bVar6.getClass();
        bVar6.L.f9864l.setVisibility(8);
        r7.o0 o0Var = G().I;
        int i = 5;
        o0Var.getClass();
        o0Var.g(null, 5);
        if (rVar == null && getContext() != null) {
            e1.c0 c0Var = j5.g.D;
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            j5.g gVarL = c0Var.l(contextRequireContext);
            gVarL.b();
            String str = B().F;
            str.getClass();
            x4.r rVarL = gVarL.L(B().K, str);
            gVarL.c();
            rVar = rVarL;
        }
        t4.b bVar7 = this.f10474b;
        if (rVar == null) {
            bVar7.getClass();
            bVar7.T.f9660r.setIndeterminate(true);
            t4.b bVar8 = this.f10474b;
            bVar8.getClass();
            bVar8.L.f9866n.setIndeterminate(true);
            return;
        }
        bVar7.getClass();
        bVar7.P.f9810s.setOnClickListener(new p(this, i));
        t4.b bVar9 = this.f10474b;
        bVar9.getClass();
        bVar9.L.f9863b.setVisibility(0);
        boolean zL = L();
        t4.b bVar10 = this.f10474b;
        if (zL) {
            bVar10.getClass();
            TextView textView2 = bVar10.P.f9812u;
            String string2 = getString(R.string.action_pause);
            string2.getClass();
            textView2.setText(string2);
            z3.K(textView2);
            String strValueOf = String.valueOf(rVar.i());
            if (isAdded() && getContext() != null) {
                strValueOf = a4.x.C(strValueOf, requireContext().getString(R.string.percent));
            }
            t4.b bVar11 = this.f10474b;
            bVar11.getClass();
            bVar11.T.f9660r.setIndeterminate(false);
            t4.b bVar12 = this.f10474b;
            bVar12.getClass();
            bVar12.T.f9660r.setProgress(rVar.i());
            if (rVar.k() > 0) {
                t4.b bVar13 = this.f10474b;
                bVar13.getClass();
                TextView textView3 = bVar13.T.C;
                Integer numValueOf = Integer.valueOf(rVar.i());
                long jK = rVar.k();
                Context contextRequireContext2 = requireContext();
                contextRequireContext2.getClass();
                textView3.setText(getString(R.string.percent_of_total_size, numValueOf, i5.H(contextRequireContext2, jK)));
            }
            t4.b bVar14 = this.f10474b;
            bVar14.getClass();
            bVar14.L.f9866n.setIndeterminate(false);
            t4.b bVar15 = this.f10474b;
            bVar15.getClass();
            bVar15.L.v.setVisibility(0);
            t4.b bVar16 = this.f10474b;
            bVar16.getClass();
            bVar16.L.f9872t.setVisibility(8);
            t4.b bVar17 = this.f10474b;
            bVar17.getClass();
            bVar17.L.v.setText(strValueOf);
            t4.b bVar18 = this.f10474b;
            bVar18.getClass();
            TextView textView4 = bVar18.L.f9874w;
            long j = rVar.j();
            Context contextRequireContext3 = requireContext();
            contextRequireContext3.getClass();
            textView4.setText(i5.H(contextRequireContext3, j));
            t4.b bVar19 = this.f10474b;
            bVar19.getClass();
            bVar19.L.f9866n.setProgress(rVar.i());
        } else {
            bVar10.getClass();
            bVar10.T.C.setText(getString(R.string.status_download_update_pending));
            t4.b bVar20 = this.f10474b;
            bVar20.getClass();
            bVar20.T.f9660r.setIndeterminate(true);
            t4.b bVar21 = this.f10474b;
            bVar21.getClass();
            bVar21.L.f9866n.setIndeterminate(true);
            t4.b bVar22 = this.f10474b;
            bVar22.getClass();
            bVar22.L.f9872t.setVisibility(0);
            t4.b bVar23 = this.f10474b;
            bVar23.getClass();
            bVar23.L.v.setVisibility(8);
        }
        t4.b bVar24 = this.f10474b;
        bVar24.getClass();
        TextView textView5 = bVar24.L.f9875x;
        long jK2 = rVar.k();
        Context contextRequireContext4 = requireContext();
        contextRequireContext4.getClass();
        textView5.setText(String.format("/%s", Arrays.copyOf(new Object[]{i5.H(contextRequireContext4, jK2)}, 1)));
    }

    public final void e0() {
        File externalFilesDir;
        boolean zE;
        boolean zIsEmpty;
        boolean z9;
        boolean zD;
        SharedPreferences sharedPreferences;
        String str;
        File externalFilesDir2;
        t6.c cVar = null;
        d0(null);
        r7.o0 o0Var = G().I;
        o0Var.getClass();
        o0Var.g(null, 5);
        long jF = F();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        h4.a aVar = new h4.a(contextRequireContext);
        int i = 1;
        if (aVar.d()) {
            File[] externalFilesDirs = contextRequireContext.getExternalFilesDirs(null);
            if (externalFilesDirs.length > 1) {
                externalFilesDir = externalFilesDirs[1];
            } else {
                externalFilesDir = contextRequireContext.getExternalFilesDir(null);
                aVar.g();
                aVar.f();
            }
        } else {
            externalFilesDir = contextRequireContext.getExternalFilesDir(null);
        }
        File file = new File(externalFilesDir, "Apps");
        if (!file.exists()) {
            file.mkdirs();
        }
        if (!file.exists() && !file.mkdirs()) {
            String string = getString(R.string.error_cant_create_dir);
            string.getClass();
            v(string);
            return;
        }
        int i6 = 0;
        if (!H()) {
            Context contextRequireContext2 = requireContext();
            contextRequireContext2.getClass();
            g0(contextRequireContext2, null);
            Context contextRequireContext3 = requireContext();
            contextRequireContext3.getClass();
            h4.a aVar2 = new h4.a(contextRequireContext3);
            if (aVar2.d()) {
                File[] externalFilesDirs2 = contextRequireContext3.getExternalFilesDirs(null);
                if (externalFilesDirs2.length > 1) {
                    externalFilesDir2 = externalFilesDirs2[1];
                } else {
                    externalFilesDir2 = contextRequireContext3.getExternalFilesDir(null);
                    aVar2.g();
                    aVar2.f();
                }
            } else {
                externalFilesDir2 = contextRequireContext3.getExternalFilesDir(null);
            }
            File file2 = new File(externalFilesDir2, "Apps");
            if (!file2.exists()) {
                file2.mkdirs();
            }
            Context contextRequireContext4 = requireContext();
            contextRequireContext4.getClass();
            long jF2 = a.a.F(contextRequireContext4, file2);
            long totalSpace = file2.getTotalSpace();
            Context contextRequireContext5 = requireContext();
            contextRequireContext5.getClass();
            String strH = i5.H(contextRequireContext5, (long) (F() * 2.25d));
            long j = ((totalSpace - jF2) * ((long) 100)) / totalSpace;
            AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
            View viewInflate = getLayoutInflater().inflate(R.layout.warning_not_space_available_dialog, (ViewGroup) null, false);
            int i10 = R.id.pb_not_storage;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(viewInflate, R.id.pb_not_storage);
            if (progressBar != null) {
                LinearLayout linearLayout = (LinearLayout) viewInflate;
                int i11 = R.id.tv_no_storage_action;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_no_storage_action);
                if (textView != null) {
                    i11 = R.id.tv_not_storage;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_not_storage);
                    if (textView2 != null) {
                        i11 = R.id.tv_not_storage_text;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_not_storage_text);
                        if (textView3 != null) {
                            i11 = R.id.tv_not_storage_title;
                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_not_storage_title)) != null) {
                                textView2.setTypeface(f4.c.f4884x);
                                progressBar.setProgress((int) j);
                                textView3.setTypeface(f4.c.f4884x);
                                textView3.setText(getString(R.string.no_storage_text, strH));
                                textView.setTypeface(f4.c.f4883w);
                                textView.setOnClickListener(new e(this, i));
                                builder.setView(linearLayout);
                                m0(builder);
                                return;
                            }
                        }
                    }
                }
                i10 = i11;
            }
            com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
            return;
        }
        t4.b bVar = this.f10474b;
        bVar.getClass();
        bVar.T.C.setVisibility(0);
        t4.b bVar2 = this.f10474b;
        bVar2.getClass();
        bVar2.T.C.setText(getString(R.string.status_download_update_pending));
        t4.b bVar3 = this.f10474b;
        bVar3.getClass();
        bVar3.T.f9660r.setProgress(0);
        t4.b bVar4 = this.f10474b;
        bVar4.getClass();
        bVar4.L.f9872t.setVisibility(0);
        t4.b bVar5 = this.f10474b;
        bVar5.getClass();
        bVar5.L.v.setVisibility(8);
        t4.b bVar6 = this.f10474b;
        bVar6.getClass();
        bVar6.L.f9874w.setText(R.string.zero_mb);
        t4.b bVar7 = this.f10474b;
        bVar7.getClass();
        TextView textView4 = bVar7.L.f9875x;
        Context contextRequireContext6 = requireContext();
        contextRequireContext6.getClass();
        textView4.setText(String.format("/%s", Arrays.copyOf(new Object[]{i5.H(contextRequireContext6, jF), requireContext()}, 2)));
        t4.b bVar8 = this.f10474b;
        bVar8.getClass();
        bVar8.L.f9866n.setProgress(0);
        AlertDialog alertDialog = this.f10478o;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        fragmentActivityRequireActivity.getClass();
        AlertDialog alertDialogA = j5.c.a(alertDialog, fragmentActivityRequireActivity);
        this.f10478o = alertDialogA;
        if (alertDialogA == null) {
            if (B().j()) {
                x4.r rVar = new x4.r();
                rVar.a(B());
                if (B().m() && (str = B().f11190v0) != null && str.length() != 0) {
                    long j6 = B().f11159a;
                    String str2 = B().f11190v0;
                    str2.getClass();
                    int i12 = B().f11192w0;
                    Context contextRequireContext7 = requireContext();
                    contextRequireContext7.getClass();
                    j5.g gVarL = j5.g.D.l(contextRequireContext7);
                    gVarL.b();
                    if (gVarL.O(j6) == null) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("appId", Long.valueOf(j6));
                        contentValues.put("categoryFrom", str2);
                        contentValues.put("promotedIndex", Integer.valueOf(i12));
                        SQLiteDatabase sQLiteDatabase = gVarL.f6674a;
                        sQLiteDatabase.getClass();
                        sQLiteDatabase.insert("download_promoted", null, contentValues);
                    }
                    gVarL.c();
                }
                x4.p pVar = new x4.p();
                Context contextRequireContext8 = requireContext();
                contextRequireContext8.getClass();
                pVar.g(contextRequireContext8);
                Context contextRequireContext9 = requireContext();
                contextRequireContext9.getClass();
                try {
                    sharedPreferences = contextRequireContext9.getSharedPreferences("SettingsPreferences", 0);
                } catch (Exception unused) {
                }
                boolean z10 = sharedPreferences.contains("show_warning_download_incompatible") ? sharedPreferences.getBoolean("show_warning_download_incompatible", true) : true;
                if (z10) {
                    z9 = rVar.f11366u <= pVar.g;
                    zD = pVar.d(rVar);
                    zE = pVar.e(rVar);
                    if (B().U != null) {
                        ArrayList arrayList = B().U;
                        arrayList.getClass();
                        Context contextRequireContext10 = requireContext();
                        contextRequireContext10.getClass();
                        zIsEmpty = x4.p.c(contextRequireContext10, arrayList).isEmpty();
                    } else {
                        zIsEmpty = true;
                    }
                } else {
                    zE = true;
                    zIsEmpty = true;
                    z9 = true;
                    zD = true;
                }
                if (z9 && zD && zE && zIsEmpty) {
                    if (getActivity() != null && !requireActivity().isFinishing()) {
                        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
                        fragmentActivityRequireActivity2.getClass();
                        w2 w2VarH = u2.h(fragmentActivityRequireActivity2);
                        if (w2VarH == null || !w2VarH.d()) {
                            y();
                        } else if (B().Z == null) {
                            o7.c0.s(LifecycleOwnerKt.getLifecycleScope(this), null, null, new w(this, cVar, i), 3);
                        } else {
                            f2 f2Var = B().Z;
                            f2Var.getClass();
                            if (f2Var.f11155m > 0) {
                                FragmentActivity activity = getActivity();
                                activity.getClass();
                                x4.g gVarB = B();
                                f2 f2Var2 = B().Z;
                                f2Var2.getClass();
                                ((c4.k0) activity).P(gVarB, f2Var2, new g(this, i6), new g(this, i));
                            } else {
                                y();
                            }
                        }
                    }
                } else if (!z9) {
                    O("sdk");
                    String string2 = getString(R.string.msg_warning_incompatible_sdk);
                    string2.getClass();
                    u(string2);
                } else if (!zD) {
                    O("abi");
                    String string3 = getString(R.string.msg_warning_incompatible_abi);
                    string3.getClass();
                    u(string3);
                } else if (zE) {
                    O("required_feature");
                    String string4 = getString(R.string.msg_warning_incompatible_required_features);
                    string4.getClass();
                    u(string4);
                } else {
                    O("density");
                    String string5 = getString(R.string.msg_warning_incompatible_density);
                    string5.getClass();
                    u(string5);
                }
            } else {
                O("no_file_id");
                String string6 = getString(R.string.msg_app_no_compatible_files);
                string6.getClass();
                v(string6);
            }
            d0(null);
        }
    }

    public final void f0() {
        q0();
        t4.b bVar = this.f10474b;
        bVar.getClass();
        ProgressBar progressBar = bVar.T.f9660r;
        t4.b bVar2 = this.f10474b;
        bVar2.getClass();
        t0.f.s(progressBar, bVar2.T.f9653b);
        t4.b bVar3 = this.f10474b;
        bVar3.getClass();
        bVar3.T.f9657o.setVisibility(0);
        t4.b bVar4 = this.f10474b;
        bVar4.getClass();
        bVar4.T.f9655m.setVisibility(8);
        if (UptodownApp.f3292e0 && B().k()) {
            t4.b bVar5 = this.f10474b;
            bVar5.getClass();
            bVar5.P.f9803l.setVisibility(0);
            t4.b bVar6 = this.f10474b;
            bVar6.getClass();
            bVar6.P.f9804m.setVisibility(0);
        } else {
            t4.b bVar7 = this.f10474b;
            bVar7.getClass();
            bVar7.P.f9803l.setVisibility(8);
            t4.b bVar8 = this.f10474b;
            bVar8.getClass();
            bVar8.P.f9804m.setVisibility(8);
        }
        t4.b bVar9 = this.f10474b;
        bVar9.getClass();
        bVar9.P.f9810s.setOnClickListener(new p(this, 16));
        r7.o0 o0Var = G().I;
        o0Var.getClass();
        o0Var.g(null, 3);
        t4.b bVar10 = this.f10474b;
        bVar10.getClass();
        TextView textView = bVar10.P.f9810s;
        String string = getString(R.string.option_button_install);
        string.getClass();
        textView.setText(string);
        z3.J(textView);
        t4.b bVar11 = this.f10474b;
        bVar11.getClass();
        ((RelativeLayout) bVar11.P.v).setBackground(ContextCompat.getDrawable(requireContext(), R.drawable.ripple_blue_primary_button));
        t4.b bVar12 = this.f10474b;
        bVar12.getClass();
        TextView textView2 = bVar12.L.f9876y;
        String string2 = getString(R.string.option_button_install);
        string2.getClass();
        textView2.setText(string2);
        z3.J(textView2);
        I(R.id.action_app_installed_details);
        I(R.id.action_uninstall);
    }

    public final void g0(Context context, x4.r rVar) {
        File externalFilesDir;
        long totalSpace;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        h4.a aVar = new h4.a(contextRequireContext);
        if (aVar.d()) {
            File[] externalFilesDirs = contextRequireContext.getExternalFilesDirs(null);
            if (externalFilesDirs.length > 1) {
                externalFilesDir = externalFilesDirs[1];
            } else {
                externalFilesDir = contextRequireContext.getExternalFilesDir(null);
                aVar.g();
                aVar.f();
            }
        } else {
            externalFilesDir = contextRequireContext.getExternalFilesDir(null);
        }
        File file = new File(externalFilesDir, "Apps");
        if (!file.exists()) {
            file.mkdirs();
        }
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        long jF = a.a.F(contextRequireContext2, file);
        try {
            totalSpace = file.getTotalSpace();
        } catch (SecurityException unused) {
            totalSpace = 0;
        }
        if (totalSpace > 0) {
            Context contextRequireContext3 = requireContext();
            contextRequireContext3.getClass();
            String strH = i5.H(contextRequireContext3, ((long) (F() * 2.25d)) - jF);
            long j = ((totalSpace - jF) * ((long) 100)) / totalSpace;
            t4.b bVar = this.f10474b;
            bVar.getClass();
            ((TextView) bVar.M0.f5277l).setTypeface(f4.c.f4884x);
            t4.b bVar2 = this.f10474b;
            bVar2.getClass();
            ((ProgressBar) bVar2.M0.f5280o).setProgress((int) j);
            t4.b bVar3 = this.f10474b;
            bVar3.getClass();
            ((TextView) bVar3.M0.f5278m).setTypeface(f4.c.f4884x);
            t4.b bVar4 = this.f10474b;
            bVar4.getClass();
            ((TextView) bVar4.M0.f5278m).setText(context.getString(R.string.no_storage_text, strH));
            t4.b bVar5 = this.f10474b;
            bVar5.getClass();
            ((TextView) bVar5.M0.f5276b).setTypeface(f4.c.f4883w);
            t4.b bVar6 = this.f10474b;
            bVar6.getClass();
            ((TextView) bVar6.M0.f5276b).setOnClickListener(new p(this, 19));
            t4.b bVar7 = this.f10474b;
            bVar7.getClass();
            ((RelativeLayout) bVar7.M0.f5279n).setVisibility(0);
        }
        if (rVar == null || !rVar.c()) {
            c0(context);
        } else {
            f0();
        }
    }

    public final void h0(Context context) {
        String string;
        t4.b bVar = this.f10474b;
        bVar.getClass();
        bVar.T.f9657o.setVisibility(0);
        t4.b bVar2 = this.f10474b;
        bVar2.getClass();
        bVar2.T.f9655m.setVisibility(8);
        t4.b bVar3 = this.f10474b;
        bVar3.getClass();
        ((RelativeLayout) bVar3.P.v).setVisibility(8);
        t4.b bVar4 = this.f10474b;
        bVar4.getClass();
        bVar4.P.f9808q.setVisibility(8);
        t4.b bVar5 = this.f10474b;
        bVar5.getClass();
        bVar5.P.f9810s.setVisibility(8);
        t4.b bVar6 = this.f10474b;
        bVar6.getClass();
        bVar6.P.f9803l.setVisibility(8);
        t4.b bVar7 = this.f10474b;
        bVar7.getClass();
        ((RelativeLayout) bVar7.P.f9813w).setVisibility(0);
        t4.b bVar8 = this.f10474b;
        bVar8.getClass();
        bVar8.P.f9812u.setVisibility(8);
        t4.b bVar9 = this.f10474b;
        bVar9.getClass();
        bVar9.L.f9876y.setVisibility(8);
        t4.b bVar10 = this.f10474b;
        bVar10.getClass();
        bVar10.L.f9868p.setVisibility(8);
        t4.b bVar11 = this.f10474b;
        bVar11.getClass();
        bVar11.L.f9873u.setVisibility(0);
        t4.b bVar12 = this.f10474b;
        bVar12.getClass();
        ProgressBar progressBar = bVar12.T.f9660r;
        t4.b bVar13 = this.f10474b;
        bVar13.getClass();
        t0.f.s(progressBar, bVar13.T.f9653b);
        r7.o0 o0Var = G().I;
        o0Var.getClass();
        o0Var.g(null, 0);
        x4.j jVar = B().G;
        if (jVar == null || jVar.f11231p != 1) {
            string = context.getString(R.string.open);
            string.getClass();
        } else {
            string = context.getString(R.string.app_detail_play_button);
            string.getClass();
        }
        t4.b bVar14 = this.f10474b;
        bVar14.getClass();
        bVar14.L.f9873u.setText(string);
        t4.b bVar15 = this.f10474b;
        bVar15.getClass();
        bVar15.P.f9811t.setText(string);
        n0(R.id.action_uninstall);
        n0(R.id.action_app_installed_details);
        String str = B().F;
        if (str == null || str.length() == 0 || !l7.u.m0(requireActivity().getPackageName(), B().F, true)) {
            return;
        }
        t4.b bVar16 = this.f10474b;
        bVar16.getClass();
        bVar16.P.f9805n.setVisibility(8);
        t4.b bVar17 = this.f10474b;
        bVar17.getClass();
        ((RelativeLayout) bVar17.P.f9813w).setVisibility(8);
        t4.b bVar18 = this.f10474b;
        bVar18.getClass();
        ((RelativeLayout) bVar18.P.f9815y).setVisibility(8);
        t4.b bVar19 = this.f10474b;
        bVar19.getClass();
        bVar19.P.f9807p.setVisibility(8);
        t4.b bVar20 = this.f10474b;
        bVar20.getClass();
        bVar20.L.f9873u.setVisibility(8);
        if (728 < B().f11173m) {
            q2 q2Var = (q2) G().D.getValue();
            x4.r rVarA = q2Var != null ? q2Var.a(context) : null;
            if (rVarA == null && B().J > 0) {
                j5.g gVarL = j5.g.D.l(context);
                gVarL.b();
                x4.r rVarI = gVarL.I(String.valueOf(B().J));
                gVarL.c();
                rVarA = rVarI;
            }
            if (rVarA != null && rVarA.c()) {
                k0();
                return;
            }
            r7.o0 o0Var2 = G().D;
            String packageName = requireActivity().getPackageName();
            packageName.getClass();
            q2 q2Var2 = new q2(packageName);
            o0Var2.getClass();
            o0Var2.g(null, q2Var2);
            c0(context);
        }
    }

    public final void i0(x4.r rVar) {
        d0(rVar);
        t4.b bVar = this.f10474b;
        bVar.getClass();
        TextView textView = bVar.P.f9810s;
        String string = getString(R.string.option_button_cancel);
        string.getClass();
        textView.setText(string);
        z3.K(textView);
        t4.b bVar2 = this.f10474b;
        bVar2.getClass();
        ((RelativeLayout) bVar2.P.v).setBackground(ContextCompat.getDrawable(requireContext(), R.drawable.ripple_open_button));
        t4.b bVar3 = this.f10474b;
        bVar3.getClass();
        TextView textView2 = bVar3.P.f9812u;
        String string2 = getString(R.string.updates_button_resume);
        string2.getClass();
        textView2.setText(string2);
        z3.J(textView2);
        t4.b bVar4 = this.f10474b;
        bVar4.getClass();
        bVar4.L.f9863b.setVisibility(8);
        t4.b bVar5 = this.f10474b;
        bVar5.getClass();
        bVar5.L.f9864l.setVisibility(0);
    }

    public final void j0(q2 q2Var) {
        r0();
        t4.b bVar = this.f10474b;
        bVar.getClass();
        ProgressBar progressBar = bVar.T.f9660r;
        t4.b bVar2 = this.f10474b;
        bVar2.getClass();
        t0.f.I(progressBar, bVar2.T.f9653b);
        r7.o0 o0Var = G().I;
        o0Var.getClass();
        o0Var.g(null, 5);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        x4.r rVarA = q2Var.a(contextRequireContext);
        t4.b bVar3 = this.f10474b;
        if (rVarA == null) {
            bVar3.getClass();
            bVar3.T.f9660r.setIndeterminate(true);
            t4.b bVar4 = this.f10474b;
            bVar4.getClass();
            bVar4.L.f9866n.setIndeterminate(true);
            return;
        }
        bVar3.getClass();
        bVar3.T.f9657o.setVisibility(8);
        t4.b bVar5 = this.f10474b;
        bVar5.getClass();
        bVar5.T.f9655m.setVisibility(0);
        t4.b bVar6 = this.f10474b;
        bVar6.getClass();
        ((RelativeLayout) bVar6.P.f9813w).setVisibility(8);
        t4.b bVar7 = this.f10474b;
        bVar7.getClass();
        ((RelativeLayout) bVar7.P.f9813w).setVisibility(8);
        t4.b bVar8 = this.f10474b;
        bVar8.getClass();
        TextView textView = bVar8.P.f9810s;
        String string = getString(R.string.option_button_cancel);
        string.getClass();
        textView.setText(string);
        z3.K(textView);
        t4.b bVar9 = this.f10474b;
        bVar9.getClass();
        ((RelativeLayout) bVar9.P.v).setBackground(ContextCompat.getDrawable(requireContext(), R.drawable.ripple_open_button));
        t4.b bVar10 = this.f10474b;
        bVar10.getClass();
        bVar10.P.f9810s.setOnClickListener(new e(this, 0));
        boolean zD = a5.b.d();
        t4.b bVar11 = this.f10474b;
        if (zD) {
            bVar11.getClass();
            TextView textView2 = bVar11.P.f9812u;
            String string2 = getString(R.string.updates_button_resume);
            string2.getClass();
            textView2.setText(string2);
            z3.J(textView2);
        } else {
            bVar11.getClass();
            TextView textView3 = bVar11.P.f9812u;
            String string3 = getString(R.string.action_pause);
            string3.getClass();
            textView3.setText(string3);
            z3.K(textView3);
        }
        int i = rVarA.i();
        t4.b bVar12 = this.f10474b;
        if (i > 0) {
            bVar12.getClass();
            bVar12.T.f9660r.setIndeterminate(false);
            t4.b bVar13 = this.f10474b;
            bVar13.getClass();
            bVar13.T.f9660r.setProgress(rVarA.i());
            t4.b bVar14 = this.f10474b;
            bVar14.getClass();
            bVar14.L.f9866n.setIndeterminate(false);
        } else {
            bVar12.getClass();
            bVar12.T.f9660r.setIndeterminate(true);
            t4.b bVar15 = this.f10474b;
            bVar15.getClass();
            bVar15.L.f9866n.setIndeterminate(true);
        }
        t4.b bVar16 = this.f10474b;
        bVar16.getClass();
        TextView textView4 = bVar16.T.C;
        Integer numValueOf = Integer.valueOf(rVarA.i());
        long jK = rVarA.k();
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        textView4.setText(getString(R.string.percent_of_total_size, numValueOf, i5.H(contextRequireContext2, jK)));
        t4.b bVar17 = this.f10474b;
        bVar17.getClass();
        bVar17.L.f9863b.setVisibility(0);
        t4.b bVar18 = this.f10474b;
        bVar18.getClass();
        TextView textView5 = bVar18.L.f9874w;
        long jK2 = (rVarA.k() * ((long) rVarA.i())) / ((long) 100);
        Context contextRequireContext3 = requireContext();
        contextRequireContext3.getClass();
        textView5.setText(i5.H(contextRequireContext3, jK2));
        t4.b bVar19 = this.f10474b;
        bVar19.getClass();
        bVar19.L.f9866n.setProgress(rVarA.i());
        t4.b bVar20 = this.f10474b;
        bVar20.getClass();
        bVar20.L.f9872t.setVisibility(8);
        t4.b bVar21 = this.f10474b;
        bVar21.getClass();
        bVar21.L.v.setVisibility(0);
        t4.b bVar22 = this.f10474b;
        bVar22.getClass();
        bVar22.L.v.setText(rVarA.i() + getString(R.string.percent));
        t4.b bVar23 = this.f10474b;
        bVar23.getClass();
        TextView textView6 = bVar23.L.f9875x;
        long jK3 = rVarA.k();
        Context contextRequireContext4 = requireContext();
        contextRequireContext4.getClass();
        textView6.setText(String.format("/%s", Arrays.copyOf(new Object[]{i5.H(contextRequireContext4, jK3)}, 1)));
    }

    public final void k0() {
        q0();
        t4.b bVar = this.f10474b;
        bVar.getClass();
        ProgressBar progressBar = bVar.T.f9660r;
        t4.b bVar2 = this.f10474b;
        bVar2.getClass();
        t0.f.s(progressBar, bVar2.T.f9653b);
        if (UptodownApp.f3292e0 && B().k()) {
            t4.b bVar3 = this.f10474b;
            bVar3.getClass();
            bVar3.P.f9803l.setVisibility(0);
            t4.b bVar4 = this.f10474b;
            bVar4.getClass();
            bVar4.P.f9804m.setVisibility(0);
        } else {
            t4.b bVar5 = this.f10474b;
            bVar5.getClass();
            bVar5.P.f9803l.setVisibility(8);
            t4.b bVar6 = this.f10474b;
            bVar6.getClass();
            bVar6.P.f9804m.setVisibility(8);
        }
        r7.o0 o0Var = G().I;
        o0Var.getClass();
        o0Var.g(null, 2);
        t4.b bVar7 = this.f10474b;
        bVar7.getClass();
        TextView textView = bVar7.P.f9810s;
        String string = getString(R.string.updates_button_update_app);
        string.getClass();
        textView.setText(string);
        z3.J(textView);
        t4.b bVar8 = this.f10474b;
        bVar8.getClass();
        ((RelativeLayout) bVar8.P.v).setBackground(ContextCompat.getDrawable(requireContext(), R.drawable.ripple_blue_primary_button));
        t4.b bVar9 = this.f10474b;
        bVar9.getClass();
        bVar9.P.f9810s.setOnClickListener(new e(this, 28));
        t4.b bVar10 = this.f10474b;
        bVar10.getClass();
        bVar10.L.f9876y.setText(getString(R.string.updates_button_update_app));
        t4.b bVar11 = this.f10474b;
        bVar11.getClass();
        TextView textView2 = bVar11.L.f9876y;
        String string2 = getString(R.string.updates_button_update_app);
        string2.getClass();
        textView2.setText(string2);
        z3.J(textView2);
        n0(R.id.action_app_installed_details);
    }

    public final void l0(Rect rect) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        if (getContext() == null || kotlin.jvm.internal.l.a(B().F, requireContext().getPackageName())) {
            return;
        }
        t4.b bVar = this.f10474b;
        bVar.getClass();
        if (bVar.P.f9802b.getLocalVisibleRect(rect) && !((Boolean) G().L.getValue()).booleanValue()) {
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            t4.b bVar2 = this.f10474b;
            bVar2.getClass();
            RelativeLayout relativeLayout = bVar2.K;
            float f = UptodownApp.I;
            try {
                sharedPreferences2 = contextRequireContext.getSharedPreferences("SettingsPreferences", 0);
            } catch (Exception unused) {
            }
            boolean z9 = sharedPreferences2.contains("animations") ? sharedPreferences2.getBoolean("animations", true) : true;
            if (z9) {
                float f10 = UptodownApp.I;
                relativeLayout.startAnimation(AnimationUtils.loadAnimation(contextRequireContext, R.anim.slide_out_bottom));
                relativeLayout.setVisibility(8);
            } else {
                relativeLayout.setVisibility(8);
            }
            r7.o0 o0Var = G().L;
            Boolean boolValueOf = Boolean.valueOf(!((Boolean) G().L.getValue()).booleanValue());
            o0Var.getClass();
            o0Var.g(null, boolValueOf);
            return;
        }
        t4.b bVar3 = this.f10474b;
        bVar3.getClass();
        if (bVar3.P.f9802b.getLocalVisibleRect(rect) || !((Boolean) G().L.getValue()).booleanValue()) {
            return;
        }
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        t4.b bVar4 = this.f10474b;
        bVar4.getClass();
        RelativeLayout relativeLayout2 = bVar4.K;
        float f11 = UptodownApp.I;
        try {
            sharedPreferences = contextRequireContext2.getSharedPreferences("SettingsPreferences", 0);
        } catch (Exception unused2) {
        }
        boolean z10 = sharedPreferences.contains("animations") ? sharedPreferences.getBoolean("animations", true) : true;
        if (z10) {
            float f12 = UptodownApp.I;
            relativeLayout2.startAnimation(AnimationUtils.loadAnimation(contextRequireContext2, R.anim.slide_in_bottom));
            relativeLayout2.setVisibility(0);
        } else {
            relativeLayout2.setVisibility(0);
        }
        r7.o0 o0Var2 = G().L;
        Boolean boolValueOf2 = Boolean.valueOf(!((Boolean) G().L.getValue()).booleanValue());
        o0Var2.getClass();
        o0Var2.g(null, boolValueOf2);
    }

    public final void m0(AlertDialog.Builder builder) {
        FragmentActivity activity = getActivity();
        activity.getClass();
        if (((c4.k0) activity).F != null) {
            FragmentActivity activity2 = getActivity();
            activity2.getClass();
            AlertDialog alertDialog = ((c4.k0) activity2).F;
            alertDialog.getClass();
            if (alertDialog.isShowing()) {
                return;
            }
        }
        FragmentActivity activity3 = getActivity();
        activity3.getClass();
        ((c4.k0) activity3).F = builder.create();
        if (getActivity() == null || !isAdded() || requireActivity().isFinishing()) {
            return;
        }
        FragmentActivity activity4 = getActivity();
        activity4.getClass();
        if (((c4.k0) activity4).F != null) {
            FragmentActivity activity5 = getActivity();
            activity5.getClass();
            AlertDialog alertDialog2 = ((c4.k0) activity5).F;
            alertDialog2.getClass();
            Window window = alertDialog2.getWindow();
            if (window != null) {
                a4.x.y(window, 0);
            }
            FragmentActivity activity6 = getActivity();
            activity6.getClass();
            AlertDialog alertDialog3 = ((c4.k0) activity6).F;
            alertDialog3.getClass();
            alertDialog3.show();
        }
    }

    public final void n() {
        if (getContext() != null) {
            FragmentActivity activity = getActivity();
            activity.getClass();
            if (((c4.k0) activity).T()) {
                Context contextRequireContext = requireContext();
                contextRequireContext.getClass();
                if (u2.h(contextRequireContext) == null) {
                    R();
                    return;
                }
                if (B().C0 == 1) {
                    v0 v0VarG = G();
                    Context contextRequireContext2 = requireContext();
                    contextRequireContext2.getClass();
                    long j = B().f11159a;
                    v0VarG.getClass();
                    o7.a0 viewModelScope = ViewModelKt.getViewModelScope(v0VarG);
                    v7.e eVar = o7.m0.f8289a;
                    o7.c0.s(viewModelScope, v7.d.f10885a, null, new r0(1, j, contextRequireContext2, null, v0VarG), 2);
                } else {
                    v0 v0VarG2 = G();
                    Context contextRequireContext3 = requireContext();
                    contextRequireContext3.getClass();
                    long j6 = B().f11159a;
                    v0VarG2.getClass();
                    o7.a0 viewModelScope2 = ViewModelKt.getViewModelScope(v0VarG2);
                    v7.e eVar2 = o7.m0.f8289a;
                    o7.c0.s(viewModelScope2, v7.d.f10885a, null, new r0(0, j6, contextRequireContext3, null, v0VarG2), 2);
                }
                if (getActivity() instanceof AppDetailActivity) {
                    FragmentActivity activity2 = getActivity();
                    activity2.getClass();
                    r7.o0 o0Var = ((AppDetailActivity) activity2).Q;
                    Boolean bool = Boolean.TRUE;
                    o0Var.getClass();
                    o0Var.g(null, bool);
                }
            }
        }
    }

    public final void n0(int i) {
        Menu menu = this.f10480q;
        if (menu != null) {
            menu.getClass();
            menu.findItem(i).setVisible(true);
        }
    }

    public final void o() {
        if (getContext() != null) {
            FragmentActivity activity = getActivity();
            activity.getClass();
            if (((c4.k0) activity).T()) {
                Context contextRequireContext = requireContext();
                contextRequireContext.getClass();
                if (u2.h(contextRequireContext) == null) {
                    R();
                    return;
                }
                if (B().B0 == 1) {
                    v0 v0VarG = G();
                    Context contextRequireContext2 = requireContext();
                    contextRequireContext2.getClass();
                    long j = B().f11159a;
                    v0VarG.getClass();
                    o7.a0 viewModelScope = ViewModelKt.getViewModelScope(v0VarG);
                    v7.e eVar = o7.m0.f8289a;
                    o7.c0.s(viewModelScope, v7.d.f10885a, null, new r0(3, j, contextRequireContext2, null, v0VarG), 2);
                } else {
                    v0 v0VarG2 = G();
                    Context contextRequireContext3 = requireContext();
                    contextRequireContext3.getClass();
                    long j6 = B().f11159a;
                    v0VarG2.getClass();
                    o7.a0 viewModelScope2 = ViewModelKt.getViewModelScope(v0VarG2);
                    v7.e eVar2 = o7.m0.f8289a;
                    o7.c0.s(viewModelScope2, v7.d.f10885a, null, new r0(2, j6, contextRequireContext3, null, v0VarG2), 2);
                }
                if (getActivity() instanceof AppDetailActivity) {
                    FragmentActivity activity2 = getActivity();
                    activity2.getClass();
                    r7.o0 o0Var = ((AppDetailActivity) activity2).P;
                    Boolean bool = Boolean.TRUE;
                    o0Var.getClass();
                    o0Var.g(null, bool);
                }
            }
        }
    }

    public final void o0(ArrayList arrayList) {
        FragmentActivity activity = getActivity();
        activity.getClass();
        if (((c4.k0) activity).T()) {
            final int i = 0;
            View viewInflate = getLayoutInflater().inflate(R.layout.remote_install_devices_popup, (ViewGroup) null, false);
            int i6 = R.id.iv_close_remote_install_devices;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.iv_close_remote_install_devices);
            if (imageView != null) {
                i6 = R.id.rl_remote_install_devices;
                if (((LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.rl_remote_install_devices)) != null) {
                    i6 = R.id.rlp_remote_install_devices;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(viewInflate, R.id.rlp_remote_install_devices);
                    if (relativeLayout != null) {
                        i6 = R.id.rv_remote_install_devices;
                        MaxHeightRecyclerView maxHeightRecyclerView = (MaxHeightRecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.rv_remote_install_devices);
                        if (maxHeightRecyclerView != null) {
                            i6 = R.id.tv_remote_install_devices;
                            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_remote_install_devices);
                            if (textView != null) {
                                i6 = R.id.tv_title_remote_install_devices;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_title_remote_install_devices);
                                if (textView2 != null) {
                                    i6 = R.id.v_background_remote_install_devices;
                                    View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.v_background_remote_install_devices);
                                    if (viewFindChildViewById != null) {
                                        RelativeLayout relativeLayout2 = (RelativeLayout) viewInflate;
                                        final t4.n0 n0Var = new t4.n0(relativeLayout2, imageView, relativeLayout, maxHeightRecyclerView, textView, textView2, viewFindChildViewById);
                                        t4.b bVar = this.f10474b;
                                        bVar.getClass();
                                        bVar.f9617o.addView(relativeLayout2);
                                        t4.b bVar2 = this.f10474b;
                                        bVar2.getClass();
                                        bVar2.f9617o.setVisibility(0);
                                        textView2.setTypeface(f4.c.f4883w);
                                        textView.setTypeface(f4.c.f4883w);
                                        kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
                                        ArrayList arrayList2 = new ArrayList();
                                        e4.f1 f1Var = new e4.f1(arrayList, new t4.n0(arrayList, arrayList2, uVar));
                                        boolean z9 = true;
                                        z9 = true;
                                        maxHeightRecyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
                                        maxHeightRecyclerView.setItemAnimator(null);
                                        maxHeightRecyclerView.setAdapter(f1Var);
                                        textView.setOnClickListener(new g4.f0(arrayList, this, arrayList2, uVar, n0Var));
                                        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: u4.r

                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                            public final /* synthetic */ f0 f10585b;

                                            {
                                                this.f10585b = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                switch (i) {
                                                    case 0:
                                                        this.f10585b.r(n0Var);
                                                        break;
                                                    default:
                                                        this.f10585b.r(n0Var);
                                                        break;
                                                }
                                            }
                                        });
                                        final int i10 = z9 ? 1 : 0;
                                        viewFindChildViewById.setOnClickListener(new View.OnClickListener(this) { // from class: u4.r

                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                            public final /* synthetic */ f0 f10585b;

                                            {
                                                this.f10585b = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                switch (i10) {
                                                    case 0:
                                                        this.f10585b.r(n0Var);
                                                        break;
                                                    default:
                                                        this.f10585b.r(n0Var);
                                                        break;
                                                }
                                            }
                                        });
                                        FragmentActivity fragmentActivityRequireActivity = requireActivity();
                                        fragmentActivityRequireActivity.getClass();
                                        new v4(fragmentActivityRequireActivity, 1).g(viewFindChildViewById, 1.0f);
                                        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
                                        fragmentActivityRequireActivity2.getClass();
                                        float f = UptodownApp.I;
                                        try {
                                            SharedPreferences sharedPreferences = fragmentActivityRequireActivity2.getSharedPreferences("SettingsPreferences", 0);
                                            if (sharedPreferences.contains("animations")) {
                                                z9 = sharedPreferences.getBoolean("animations", true);
                                            }
                                        } catch (Exception unused) {
                                        }
                                        if (!z9) {
                                            relativeLayout.setVisibility(0);
                                            return;
                                        }
                                        float f10 = UptodownApp.I;
                                        relativeLayout.startAnimation(AnimationUtils.loadAnimation(fragmentActivityRequireActivity2, R.anim.slide_in_bottom));
                                        relativeLayout.setVisibility(0);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i6)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r9) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.f0.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:358:0x0906 A[PHI: r2
      0x0906: PHI (r2v24 int) = 
      (r2v23 int)
      (r2v25 int)
      (r2v26 int)
      (r2v27 int)
      (r2v49 int)
      (r2v50 int)
      (r2v79 int)
      (r2v80 int)
      (r2v81 int)
      (r2v82 int)
      (r2v83 int)
      (r2v89 int)
      (r2v90 int)
      (r2v91 int)
      (r2v92 int)
      (r2v93 int)
      (r2v94 int)
      (r2v95 int)
      (r2v96 int)
      (r2v97 int)
      (r2v98 int)
      (r2v99 int)
      (r2v100 int)
      (r2v101 int)
      (r2v102 int)
      (r2v103 int)
      (r2v104 int)
      (r2v105 int)
      (r2v106 int)
      (r2v107 int)
      (r2v108 int)
      (r2v109 int)
      (r2v110 int)
      (r2v111 int)
      (r2v112 int)
      (r2v113 int)
      (r2v114 int)
      (r2v115 int)
      (r2v116 int)
      (r2v117 int)
      (r2v118 int)
      (r2v119 int)
      (r2v120 int)
      (r2v121 int)
      (r2v122 int)
      (r2v123 int)
      (r2v124 int)
      (r2v125 int)
      (r2v126 int)
      (r2v127 int)
      (r2v128 int)
      (r2v129 int)
     binds: [B:153:0x03c7, B:155:0x03d4, B:157:0x03e1, B:159:0x03ea, B:199:0x04f7, B:201:0x0500, B:257:0x0669, B:259:0x0676, B:261:0x0683, B:263:0x0690, B:265:0x0699, B:275:0x06df, B:277:0x06ec, B:279:0x06f9, B:281:0x0706, B:283:0x0713, B:285:0x071e, B:287:0x0729, B:289:0x0736, B:291:0x0743, B:293:0x0750, B:295:0x075d, B:297:0x076a, B:299:0x0777, B:301:0x0784, B:303:0x0791, B:305:0x079e, B:307:0x07ab, B:309:0x07b8, B:311:0x07c5, B:313:0x07d2, B:315:0x07df, B:317:0x07ec, B:319:0x07f9, B:321:0x0806, B:323:0x0813, B:325:0x0820, B:327:0x082d, B:329:0x083a, B:331:0x0845, B:333:0x0852, B:335:0x085f, B:337:0x086c, B:339:0x0879, B:341:0x0886, B:343:0x0893, B:345:0x08a0, B:347:0x08ad, B:349:0x08ba, B:351:0x08c7, B:353:0x08d4, B:355:0x08dd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0939 A[PHI: r2
      0x0939: PHI (r2v37 int) = (r2v36 int), (r2v40 int), (r2v42 int) binds: [B:175:0x044d, B:181:0x0474, B:185:0x048e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x094a A[PHI: r6
      0x094a: PHI (r6v32 int) = 
      (r6v31 int)
      (r6v33 int)
      (r6v34 int)
      (r6v37 int)
      (r6v39 int)
      (r6v41 int)
      (r6v42 int)
      (r6v43 int)
      (r6v44 int)
      (r6v45 int)
      (r6v46 int)
      (r6v47 int)
     binds: [B:123:0x02fb, B:125:0x0308, B:127:0x0315, B:131:0x032f, B:135:0x0349, B:139:0x0363, B:141:0x0370, B:143:0x037d, B:145:0x038a, B:147:0x0397, B:149:0x03a4, B:151:0x03b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0951 A[PHI: r6
      0x0951: PHI (r6v36 int) = (r6v35 int), (r6v38 int) binds: [B:129:0x0322, B:133:0x033c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0996 A[PHI: r3
      0x0996: PHI (r3v3 int) = 
      (r3v2 int)
      (r3v5 int)
      (r3v6 int)
      (r3v7 int)
      (r3v8 int)
      (r3v9 int)
      (r3v10 int)
      (r3v11 int)
      (r3v12 int)
      (r3v13 int)
      (r3v14 int)
      (r3v15 int)
      (r3v16 int)
     binds: [B:5:0x0023, B:7:0x002f, B:9:0x003d, B:11:0x0048, B:13:0x0053, B:15:0x005e, B:17:0x0069, B:19:0x0074, B:21:0x007f, B:23:0x008a, B:25:0x0095, B:27:0x00a0, B:29:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r89, android.view.ViewGroup r90, android.os.Bundle r91) {
        /*
            Method dump skipped, instruction units count: 2481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.f0.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        r7.o0 o0Var = G().L;
        Boolean boolValueOf = Boolean.valueOf(!((Boolean) G().L.getValue()).booleanValue());
        o0Var.getClass();
        o0Var.g(null, boolValueOf);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        v7.e eVar = o7.m0.f8289a;
        p7.c cVar = t7.n.f10349a;
        t6.c cVar2 = null;
        o7.c0.s(lifecycleScope, cVar, null, new w(this, cVar2, 11), 2);
        o7.c0.s(LifecycleOwnerKt.getLifecycleScope(this), cVar, null, new w(this, cVar2, 12), 2);
        o7.c0.s(LifecycleOwnerKt.getLifecycleScope(this), cVar, null, new w(this, cVar2, 13), 2);
        o7.c0.s(LifecycleOwnerKt.getLifecycleScope(this), cVar, null, new w(this, cVar2, 14), 2);
        o7.c0.s(LifecycleOwnerKt.getLifecycleScope(this), cVar, null, new w(this, cVar2, 15), 2);
        o7.c0.s(LifecycleOwnerKt.getLifecycleScope(this), cVar, null, new w(this, cVar2, 16), 2);
        if (((Boolean) G().M.getValue()).booleanValue()) {
            r7.o0 o0Var = G().M;
            Boolean bool = Boolean.FALSE;
            o0Var.getClass();
            o0Var.g(null, bool);
        } else {
            Rect rect = new Rect();
            t4.b bVar = this.f10474b;
            bVar.getClass();
            bVar.f9606f0.getHitRect(rect);
            l0(rect);
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            p0(contextRequireContext);
        }
        String str = B().f11178p;
        if (str == null || str.length() == 0 || H()) {
            t4.b bVar2 = this.f10474b;
            bVar2.getClass();
            ((RelativeLayout) bVar2.M0.f5279n).setVisibility(8);
        } else {
            Context contextRequireContext2 = requireContext();
            contextRequireContext2.getClass();
            g0(contextRequireContext2, null);
        }
        z();
        t4.b bVar3 = this.f10474b;
        bVar3.getClass();
        if (bVar3.f9606f0.getScrollY() > 0) {
            Context contextRequireContext3 = requireContext();
            contextRequireContext3.getClass();
            s0(contextRequireContext3);
            String strE = B().e();
            if (strE == null || strE.length() == 0) {
                t4.b bVar4 = this.f10474b;
                bVar4.getClass();
                bVar4.f9614m.setTitle("");
            }
        }
        e4.u0 u0Var = this.f10481r;
        if (u0Var != null) {
            u0Var.notifyDataSetChanged();
        }
        e4.u0 u0Var2 = this.f10482s;
        if (u0Var2 != null) {
            u0Var2.notifyDataSetChanged();
        }
        ArrayList arrayList = this.f10483t;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((e4.u0) obj).notifyDataSetChanged();
        }
        o7.c0.s(LifecycleOwnerKt.getLifecycleScope(this), t7.n.f10349a, null, new w(this, cVar2, 17), 2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        o7.c0.s(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new z(this, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(Context context) {
        Object[] objArr = 0;
        if (!L()) {
            r7.o0 o0Var = a5.b.f193a;
            if (!a5.b.e(B().f11159a)) {
                r7.o0 o0Var2 = a5.c.f197a;
                if (!a5.c.c(B().f11159a)) {
                    LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
                    v7.e eVar = o7.m0.f8289a;
                    o7.c0.s(lifecycleScope, v7.d.f10885a, null, new s4.e0(context, this, objArr == true ? 1 : 0, 3), 2);
                    return;
                }
            }
        }
        String str = B().F;
        str.getClass();
        x4.r rVarB = a5.b.b();
        if (kotlin.jvm.internal.l.a(rVarB != null ? rVarB.f11356b : null, str)) {
            a5.b.f();
        } else {
            a5.c.d();
        }
        Object systemService = context.getSystemService("notification");
        systemService.getClass();
        ((NotificationManager) systemService).cancel(261);
    }

    public final void p0(Context context) {
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        v7.e eVar = o7.m0.f8289a;
        o7.c0.s(lifecycleScope, v7.d.f10885a, null, new d0(this, context, null, 0), 2);
    }

    public final void q() {
        if (B().l()) {
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            v7.e eVar = o7.m0.f8289a;
            o7.c0.s(lifecycleScope, t7.n.f10349a, null, new w(this, null, 0), 2);
            v0 v0VarG = G();
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            long j = B().f11159a;
            v0VarG.getClass();
            o7.c0.s(ViewModelKt.getViewModelScope(v0VarG), v7.d.f10885a, null, new n0(1, j, contextRequireContext, null, v0VarG), 2);
        }
    }

    public final void q0() {
        t4.b bVar = this.f10474b;
        bVar.getClass();
        bVar.T.f9657o.setVisibility(0);
        t4.b bVar2 = this.f10474b;
        bVar2.getClass();
        bVar2.T.f9655m.setVisibility(8);
        t4.b bVar3 = this.f10474b;
        bVar3.getClass();
        ((RelativeLayout) bVar3.P.v).setVisibility(0);
        t4.b bVar4 = this.f10474b;
        bVar4.getClass();
        bVar4.P.f9810s.setVisibility(0);
        t4.b bVar5 = this.f10474b;
        bVar5.getClass();
        ((RelativeLayout) bVar5.P.f9813w).setVisibility(8);
        t4.b bVar6 = this.f10474b;
        bVar6.getClass();
        bVar6.P.f9812u.setVisibility(8);
        t4.b bVar7 = this.f10474b;
        bVar7.getClass();
        bVar7.P.f9808q.setVisibility(8);
        t4.b bVar8 = this.f10474b;
        bVar8.getClass();
        bVar8.L.f9876y.setVisibility(0);
        t4.b bVar9 = this.f10474b;
        bVar9.getClass();
        bVar9.L.f9868p.setVisibility(8);
        t4.b bVar10 = this.f10474b;
        bVar10.getClass();
        bVar10.L.f9873u.setVisibility(8);
    }

    public final void r(t4.n0 n0Var) {
        boolean z9 = true;
        z9 = true;
        if (G().U.compareAndSet(false, true)) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            fragmentActivityRequireActivity.getClass();
            new v4(fragmentActivityRequireActivity, 1).g((View) n0Var.f10016l, 0.0f);
            FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
            fragmentActivityRequireActivity2.getClass();
            RelativeLayout relativeLayout = (RelativeLayout) n0Var.f10015b;
            n5.c cVar = new n5.c(this, z9 ? 1 : 0);
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(fragmentActivityRequireActivity2, R.anim.slide_out_bottom);
            float f = UptodownApp.I;
            try {
                SharedPreferences sharedPreferences = fragmentActivityRequireActivity2.getSharedPreferences("SettingsPreferences", 0);
                if (sharedPreferences.contains("animations")) {
                    z9 = sharedPreferences.getBoolean("animations", true);
                }
            } catch (Exception unused) {
            }
            if (!z9) {
                cVar.onAnimationEnd(animationLoadAnimation);
                return;
            }
            float f10 = UptodownApp.I;
            animationLoadAnimation.setAnimationListener(cVar);
            relativeLayout.startAnimation(animationLoadAnimation);
        }
    }

    public final void r0() {
        t4.b bVar = this.f10474b;
        bVar.getClass();
        bVar.T.f9657o.setVisibility(8);
        t4.b bVar2 = this.f10474b;
        bVar2.getClass();
        bVar2.T.f9655m.setVisibility(0);
        t4.b bVar3 = this.f10474b;
        bVar3.getClass();
        ((RelativeLayout) bVar3.P.v).setVisibility(0);
        t4.b bVar4 = this.f10474b;
        bVar4.getClass();
        bVar4.P.f9810s.setVisibility(0);
        t4.b bVar5 = this.f10474b;
        bVar5.getClass();
        bVar5.P.f9803l.setVisibility(8);
        t4.b bVar6 = this.f10474b;
        bVar6.getClass();
        ((RelativeLayout) bVar6.P.f9813w).setVisibility(8);
        t4.b bVar7 = this.f10474b;
        bVar7.getClass();
        bVar7.L.f9869q.setVisibility(8);
        t4.b bVar8 = this.f10474b;
        bVar8.getClass();
        bVar8.L.f9876y.setVisibility(8);
        t4.b bVar9 = this.f10474b;
        bVar9.getClass();
        bVar9.L.f9868p.setVisibility(0);
        t4.b bVar10 = this.f10474b;
        bVar10.getClass();
        bVar10.L.f9873u.setVisibility(8);
    }

    public final void s() {
        if (getActivity() == null || requireActivity().isFinishing()) {
            return;
        }
        FragmentActivity activity = getActivity();
        activity.getClass();
        ((c4.k0) activity).Q();
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
        a4.d0 d0VarK = a4.d0.k(getLayoutInflater());
        TextView textView = (TextView) d0VarK.f84n;
        TextView textView2 = (TextView) d0VarK.f85o;
        textView.setTypeface(f4.c.f4884x);
        textView.setText(getString(R.string.age_verification_failed));
        ((TextView) d0VarK.f83m).setVisibility(8);
        textView2.setText(getString(R.string.go_back));
        textView2.setTypeface(f4.c.f4883w);
        textView2.setOnClickListener(new p(this, 24));
        builder.setView((LinearLayout) d0VarK.f81b);
        builder.setCancelable(false);
        FragmentActivity activity2 = getActivity();
        activity2.getClass();
        ((c4.k0) activity2).F = builder.create();
        FragmentActivity activity3 = getActivity();
        activity3.getClass();
        ((c4.k0) activity3).u0();
    }

    public final void s0(Context context) {
        t4.b bVar = this.f10474b;
        bVar.getClass();
        bVar.f9607g0.setBackgroundColor(ContextCompat.getColor(context, R.color.transparent));
        if ((context.getResources().getConfiguration().uiMode & 48) == 16) {
            int color = ContextCompat.getColor(context, R.color.main_blue);
            Menu menu = this.f10480q;
            menu.getClass();
            Drawable icon = menu.findItem(R.id.action_search).getIcon();
            if (icon != null) {
                DrawableCompat.setTint(icon, color);
            }
            Drawable drawable = ContextCompat.getDrawable(context, R.drawable.core_vector_back);
            if (drawable != null) {
                t4.b bVar2 = this.f10474b;
                bVar2.getClass();
                bVar2.f9607g0.setNavigationIcon(drawable);
            }
            Drawable drawable2 = ContextCompat.getDrawable(context, R.drawable.core_vector_menu_dots_blue);
            if (drawable2 != null) {
                t4.b bVar3 = this.f10474b;
                bVar3.getClass();
                bVar3.f9607g0.setOverflowIcon(drawable2);
            }
        }
    }

    public final void t() {
        FragmentActivity activity = getActivity();
        activity.getClass();
        AlertDialog alertDialog = ((c4.k0) activity).F;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
        if (L()) {
            uVar.f7022a = a5.b.d() || (a5.c.f197a.getValue() instanceof x4.y0);
            if (a5.b.b() != null) {
                a5.b.g();
            } else if (a5.c.a() != null) {
                a5.c.e();
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        a4.d0 d0VarK = a4.d0.k(getLayoutInflater());
        TextView textView = (TextView) d0VarK.f84n;
        TextView textView2 = (TextView) d0VarK.f85o;
        TextView textView3 = (TextView) d0VarK.f83m;
        if (getActivity() != null && !requireActivity().isFinishing()) {
            textView.setTypeface(f4.c.f4884x);
            textView.setText(requireContext().getString(R.string.download_cancel_confimation_title));
            textView3.setTypeface(f4.c.f4883w);
            textView3.setText(requireContext().getString(R.string.dialog_confirmation_verify_negative));
            textView3.setOnClickListener(new f(uVar, this, 9));
            textView2.setTypeface(f4.c.f4883w);
            textView2.setText(requireContext().getString(R.string.dialog_confirmation_verify_afirmative));
            textView2.setOnClickListener(new p(this, 20));
        }
        builder.setView((LinearLayout) d0VarK.f81b);
        builder.setCancelable(false);
        m0(builder);
    }

    public final void t0(FragmentActivity fragmentActivity) {
        t4.b bVar = this.f10474b;
        bVar.getClass();
        bVar.f9607g0.setBackgroundColor(ContextCompat.getColor(fragmentActivity, R.color.transparent));
        int color = ContextCompat.getColor(fragmentActivity, R.color.white);
        Menu menu = this.f10480q;
        menu.getClass();
        Drawable icon = menu.findItem(R.id.action_search).getIcon();
        if (icon != null) {
            DrawableCompat.setTint(icon, color);
        }
        Drawable drawable = ContextCompat.getDrawable(fragmentActivity, R.drawable.vector_arrow_left_white);
        if (drawable != null) {
            t4.b bVar2 = this.f10474b;
            bVar2.getClass();
            bVar2.f9607g0.setNavigationIcon(drawable);
        }
        Drawable drawable2 = ContextCompat.getDrawable(fragmentActivity, R.drawable.vector_menu_dots);
        if (drawable2 != null) {
            t4.b bVar3 = this.f10474b;
            bVar3.getClass();
            bVar3.f9607g0.setOverflowIcon(drawable2);
        }
    }

    public final void u(String str) {
        ArrayList arrayList;
        if (getActivity() != null) {
            FragmentActivity activity = getActivity();
            activity.getClass();
            AlertDialog alertDialog = ((c4.k0) activity).F;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        }
        if (getContext() != null) {
            ArrayList arrayList2 = new ArrayList();
            String str2 = B().F;
            if (str2 != null && str2.length() != 0 && (arrayList = B().U) != null && !arrayList.isEmpty()) {
                ArrayList arrayList3 = B().U;
                arrayList3.getClass();
                Context contextRequireContext = requireContext();
                contextRequireContext.getClass();
                arrayList2 = x4.p.c(contextRequireContext, arrayList3);
            }
            if (!arrayList2.isEmpty()) {
                Iterator it = arrayList2.iterator();
                it.getClass();
                String strK = "";
                while (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    String str3 = (String) next;
                    if (str3.equals(q6.l.y0(arrayList2))) {
                        strK = a4.x.k(strK, "- ", str3);
                    } else {
                        strK = strK + "- " + str3 + "\n";
                    }
                }
                str = a4.x.k(str, "\n\n", strK);
            }
            a4.d0 d0VarK = a4.d0.k(getLayoutInflater());
            TextView textView = (TextView) d0VarK.f83m;
            TextView textView2 = (TextView) d0VarK.f85o;
            TextView textView3 = (TextView) d0VarK.f84n;
            CheckBox checkBox = (CheckBox) d0VarK.f82l;
            textView3.setTypeface(f4.c.f4884x);
            textView3.setText(str);
            checkBox.setVisibility(0);
            checkBox.setTypeface(f4.c.f4884x);
            checkBox.setOnCheckedChangeListener(new h(this, 0));
            textView2.setTypeface(f4.c.f4883w);
            textView2.setOnClickListener(new e(this, 3));
            textView.setTypeface(f4.c.f4883w);
            textView.setOnClickListener(new f(d0VarK, this, 1));
            AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
            builder.setView((LinearLayout) d0VarK.f81b);
            builder.setCancelable(false);
            m0(builder);
        }
    }

    public final void u0(String str) {
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        v7.e eVar = o7.m0.f8289a;
        o7.c0.s(lifecycleScope, t7.n.f10349a, null, new e0(str, this, null, 0), 2);
    }

    public final void v(String str) {
        if (getActivity() == null || !isAdded() || requireActivity().isFinishing()) {
            return;
        }
        FragmentActivity activity = getActivity();
        activity.getClass();
        AlertDialog alertDialog = ((c4.k0) activity).F;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        a4.d0 d0VarK = a4.d0.k(getLayoutInflater());
        TextView textView = (TextView) d0VarK.f85o;
        TextView textView2 = (TextView) d0VarK.f84n;
        textView2.setTypeface(f4.c.f4884x);
        textView2.setText(str);
        ((TextView) d0VarK.f83m).setVisibility(8);
        textView.setTypeface(f4.c.f4883w);
        textView.setOnClickListener(new p(this, 4));
        builder.setView((LinearLayout) d0VarK.f81b);
        builder.setCancelable(false);
        m0(builder);
    }

    public final void v0(String str) {
        str.getClass();
        if (getContext() == null || B().F == null || !l7.u.m0(B().F, str, true)) {
            return;
        }
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        p0(contextRequireContext);
        if (getActivity() == null || requireActivity().isFinishing() || !(getActivity() instanceof c4.k0)) {
            return;
        }
        FragmentActivity activity = getActivity();
        activity.getClass();
        String string = getString(R.string.install_compatibility_error, B().f11160b);
        string.getClass();
        ((c4.k0) activity).A(string);
    }

    public final void w(d7.a aVar) {
        FragmentActivity activity = getActivity();
        activity.getClass();
        AlertDialog alertDialog = ((c4.k0) activity).F;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        if (getContext() != null) {
            a4.d0 d0VarK = a4.d0.k(getLayoutInflater());
            TextView textView = (TextView) d0VarK.f84n;
            TextView textView2 = (TextView) d0VarK.f83m;
            TextView textView3 = (TextView) d0VarK.f85o;
            textView.setTypeface(f4.c.f4884x);
            textView.setText(getString(R.string.resume_downloads_queue_dialog, B().f11160b));
            textView3.setTypeface(f4.c.f4883w);
            textView3.setText(getString(R.string.updates_button_resume));
            textView3.setOnClickListener(new f(aVar, this, 2));
            textView2.setTypeface(f4.c.f4883w);
            z3.K(textView2);
            textView2.setOnClickListener(new e(this, 5));
            AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
            builder.setView((LinearLayout) d0VarK.f81b);
            builder.setCancelable(false);
            m0(builder);
        }
    }

    public final void w0() {
        try {
            if (B().f11197z <= 0 || ((Number) G().Q.getValue()).intValue() <= 0) {
                t4.b bVar = this.f10474b;
                bVar.getClass();
                ((LinearLayout) bVar.D.f8817b).setVisibility(8);
                t4.b bVar2 = this.f10474b;
                bVar2.getClass();
                ((TextView) bVar2.D.f8826t).setVisibility(8);
                return;
            }
            int dimension = (int) getResources().getDimension(R.dimen.margin_m);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((((Number) G().Q.getValue()).intValue() * B().E) / B().f11197z, dimension);
            t4.b bVar3 = this.f10474b;
            bVar3.getClass();
            ((View) bVar3.D.f8822p).setLayoutParams(layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((((Number) G().Q.getValue()).intValue() * B().D) / B().f11197z, dimension);
            t4.b bVar4 = this.f10474b;
            bVar4.getClass();
            ((View) bVar4.D.f8821o).setLayoutParams(layoutParams2);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams((((Number) G().Q.getValue()).intValue() * B().C) / B().f11197z, dimension);
            t4.b bVar5 = this.f10474b;
            bVar5.getClass();
            ((View) bVar5.D.f8820n).setLayoutParams(layoutParams3);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams((((Number) G().Q.getValue()).intValue() * B().B) / B().f11197z, dimension);
            t4.b bVar6 = this.f10474b;
            bVar6.getClass();
            ((View) bVar6.D.f8819m).setLayoutParams(layoutParams4);
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams((((Number) G().Q.getValue()).intValue() * B().A) / B().f11197z, dimension);
            t4.b bVar7 = this.f10474b;
            bVar7.getClass();
            ((View) bVar7.D.f8818l).setLayoutParams(layoutParams5);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void x(Context context) {
        int i;
        FragmentActivity activity = getActivity();
        activity.getClass();
        AlertDialog alertDialog = ((c4.k0) activity).F;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        final Drawable drawable = ContextCompat.getDrawable(context, R.drawable.vector_star_on);
        final Drawable drawable2 = ContextCompat.getDrawable(context, R.drawable.vector_star_off);
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        View viewInflate = getLayoutInflater().inflate(R.layout.dialog_review_stars, (ViewGroup) null, false);
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        int i6 = R.id.et_review;
        EditText editText = (EditText) ViewBindings.findChildViewById(viewInflate, R.id.et_review);
        if (editText != null) {
            i6 = R.id.iv_avatar_dialog_review;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.iv_avatar_dialog_review);
            if (imageView != null) {
                i6 = R.id.iv_star1_dialog_review;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.iv_star1_dialog_review);
                if (imageView2 != null) {
                    i6 = R.id.iv_star2_dialog_review;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.iv_star2_dialog_review);
                    if (imageView3 != null) {
                        i6 = R.id.iv_star3_dialog_review;
                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.iv_star3_dialog_review);
                        if (imageView4 != null) {
                            i6 = R.id.iv_star4_dialog_review;
                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.iv_star4_dialog_review);
                            if (imageView5 != null) {
                                i6 = R.id.iv_star5_dialog_review;
                                ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.iv_star5_dialog_review);
                                if (imageView6 != null) {
                                    i6 = R.id.tv_app_name_dialog_review;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_app_name_dialog_review);
                                    if (textView != null) {
                                        i6 = R.id.tv_cancel;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_cancel);
                                        if (textView2 != null) {
                                            i6 = R.id.tv_ok;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_ok);
                                            if (textView3 != null) {
                                                final e2.d dVar = new e2.d(linearLayout, editText, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, textView, textView2, textView3);
                                                String strI = B().i();
                                                if (strI == null || strI.length() == 0) {
                                                    imageView.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_app_icon_placeholder));
                                                } else {
                                                    a4.l0 l0VarE = a4.g0.d().e(B().i());
                                                    float f = UptodownApp.I;
                                                    l0VarE.h(b4.d.x(context));
                                                    l0VarE.e(imageView, null);
                                                }
                                                textView.setTypeface(f4.c.f4883w);
                                                textView.setText(B().f11160b);
                                                editText.setText((CharSequence) G().H.getValue());
                                                int iIntValue = ((Number) G().S.getValue()).intValue();
                                                int i10 = 1;
                                                if (iIntValue == 1) {
                                                    imageView2.setImageDrawable(drawable);
                                                    imageView3.setImageDrawable(drawable2);
                                                    imageView4.setImageDrawable(drawable2);
                                                    imageView5.setImageDrawable(drawable2);
                                                    imageView6.setImageDrawable(drawable2);
                                                } else if (iIntValue == 2) {
                                                    imageView2.setImageDrawable(drawable);
                                                    imageView3.setImageDrawable(drawable);
                                                    imageView4.setImageDrawable(drawable2);
                                                    imageView5.setImageDrawable(drawable2);
                                                    imageView6.setImageDrawable(drawable2);
                                                } else if (iIntValue == 3) {
                                                    imageView2.setImageDrawable(drawable);
                                                    imageView3.setImageDrawable(drawable);
                                                    imageView4.setImageDrawable(drawable);
                                                    imageView5.setImageDrawable(drawable2);
                                                    imageView6.setImageDrawable(drawable2);
                                                } else if (iIntValue == 4) {
                                                    imageView2.setImageDrawable(drawable);
                                                    imageView3.setImageDrawable(drawable);
                                                    imageView4.setImageDrawable(drawable);
                                                    imageView5.setImageDrawable(drawable);
                                                    imageView6.setImageDrawable(drawable2);
                                                } else if (iIntValue != 5) {
                                                    imageView2.setImageDrawable(drawable2);
                                                    imageView3.setImageDrawable(drawable2);
                                                    imageView4.setImageDrawable(drawable2);
                                                    imageView5.setImageDrawable(drawable2);
                                                    imageView6.setImageDrawable(drawable2);
                                                } else {
                                                    imageView2.setImageDrawable(drawable);
                                                    imageView3.setImageDrawable(drawable);
                                                    imageView4.setImageDrawable(drawable);
                                                    imageView5.setImageDrawable(drawable);
                                                    imageView6.setImageDrawable(drawable);
                                                }
                                                final int i11 = 0;
                                                imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: u4.q

                                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                    public final /* synthetic */ f0 f10574b;

                                                    {
                                                        this.f10574b = this;
                                                    }

                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        int i12 = i11;
                                                        Drawable drawable3 = drawable2;
                                                        Drawable drawable4 = drawable;
                                                        e2.d dVar2 = dVar;
                                                        f0 f0Var = this.f10574b;
                                                        switch (i12) {
                                                            case 0:
                                                                float f10 = UptodownApp.I;
                                                                if (b4.d.t()) {
                                                                    r7.o0 o0Var = f0Var.G().S;
                                                                    o0Var.getClass();
                                                                    o0Var.g(null, 1);
                                                                    ((ImageView) dVar2.f4469m).setImageDrawable(drawable4);
                                                                    ((ImageView) dVar2.f4470n).setImageDrawable(drawable3);
                                                                    ((ImageView) dVar2.f4471o).setImageDrawable(drawable3);
                                                                    ((ImageView) dVar2.f4472p).setImageDrawable(drawable3);
                                                                    ((ImageView) dVar2.f4473q).setImageDrawable(drawable3);
                                                                }
                                                                break;
                                                            case 1:
                                                                float f11 = UptodownApp.I;
                                                                if (b4.d.t()) {
                                                                    r7.o0 o0Var2 = f0Var.G().S;
                                                                    o0Var2.getClass();
                                                                    o0Var2.g(null, 2);
                                                                    ((ImageView) dVar2.f4469m).setImageDrawable(drawable4);
                                                                    ((ImageView) dVar2.f4470n).setImageDrawable(drawable4);
                                                                    ((ImageView) dVar2.f4471o).setImageDrawable(drawable3);
                                                                    ((ImageView) dVar2.f4472p).setImageDrawable(drawable3);
                                                                    ((ImageView) dVar2.f4473q).setImageDrawable(drawable3);
                                                                }
                                                                break;
                                                            case 2:
                                                                float f12 = UptodownApp.I;
                                                                if (b4.d.t()) {
                                                                    r7.o0 o0Var3 = f0Var.G().S;
                                                                    o0Var3.getClass();
                                                                    o0Var3.g(null, 3);
                                                                    ((ImageView) dVar2.f4469m).setImageDrawable(drawable4);
                                                                    ((ImageView) dVar2.f4470n).setImageDrawable(drawable4);
                                                                    ((ImageView) dVar2.f4471o).setImageDrawable(drawable4);
                                                                    ((ImageView) dVar2.f4472p).setImageDrawable(drawable3);
                                                                    ((ImageView) dVar2.f4473q).setImageDrawable(drawable3);
                                                                }
                                                                break;
                                                            default:
                                                                float f13 = UptodownApp.I;
                                                                if (b4.d.t()) {
                                                                    r7.o0 o0Var4 = f0Var.G().S;
                                                                    o0Var4.getClass();
                                                                    o0Var4.g(null, 4);
                                                                    ((ImageView) dVar2.f4469m).setImageDrawable(drawable4);
                                                                    ((ImageView) dVar2.f4470n).setImageDrawable(drawable4);
                                                                    ((ImageView) dVar2.f4471o).setImageDrawable(drawable4);
                                                                    ((ImageView) dVar2.f4472p).setImageDrawable(drawable4);
                                                                    ((ImageView) dVar2.f4473q).setImageDrawable(drawable3);
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                                final int i12 = 1;
                                                imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: u4.q

                                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                    public final /* synthetic */ f0 f10574b;

                                                    {
                                                        this.f10574b = this;
                                                    }

                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        int i122 = i12;
                                                        Drawable drawable3 = drawable2;
                                                        Drawable drawable4 = drawable;
                                                        e2.d dVar2 = dVar;
                                                        f0 f0Var = this.f10574b;
                                                        switch (i122) {
                                                            case 0:
                                                                float f10 = UptodownApp.I;
                                                                if (b4.d.t()) {
                                                                    r7.o0 o0Var = f0Var.G().S;
                                                                    o0Var.getClass();
                                                                    o0Var.g(null, 1);
                                                                    ((ImageView) dVar2.f4469m).setImageDrawable(drawable4);
                                                                    ((ImageView) dVar2.f4470n).setImageDrawable(drawable3);
                                                                    ((ImageView) dVar2.f4471o).setImageDrawable(drawable3);
                                                                    ((ImageView) dVar2.f4472p).setImageDrawable(drawable3);
                                                                    ((ImageView) dVar2.f4473q).setImageDrawable(drawable3);
                                                                }
                                                                break;
                                                            case 1:
                                                                float f11 = UptodownApp.I;
                                                                if (b4.d.t()) {
                                                                    r7.o0 o0Var2 = f0Var.G().S;
                                                                    o0Var2.getClass();
                                                                    o0Var2.g(null, 2);
                                                                    ((ImageView) dVar2.f4469m).setImageDrawable(drawable4);
                                                                    ((ImageView) dVar2.f4470n).setImageDrawable(drawable4);
                                                                    ((ImageView) dVar2.f4471o).setImageDrawable(drawable3);
                                                                    ((ImageView) dVar2.f4472p).setImageDrawable(drawable3);
                                                                    ((ImageView) dVar2.f4473q).setImageDrawable(drawable3);
                                                                }
                                                                break;
                                                            case 2:
                                                                float f12 = UptodownApp.I;
                                                                if (b4.d.t()) {
                                                                    r7.o0 o0Var3 = f0Var.G().S;
                                                                    o0Var3.getClass();
                                                                    o0Var3.g(null, 3);
                                                                    ((ImageView) dVar2.f4469m).setImageDrawable(drawable4);
                                                                    ((ImageView) dVar2.f4470n).setImageDrawable(drawable4);
                                                                    ((ImageView) dVar2.f4471o).setImageDrawable(drawable4);
                                                                    ((ImageView) dVar2.f4472p).setImageDrawable(drawable3);
                                                                    ((ImageView) dVar2.f4473q).setImageDrawable(drawable3);
                                                                }
                                                                break;
                                                            default:
                                                                float f13 = UptodownApp.I;
                                                                if (b4.d.t()) {
                                                                    r7.o0 o0Var4 = f0Var.G().S;
                                                                    o0Var4.getClass();
                                                                    o0Var4.g(null, 4);
                                                                    ((ImageView) dVar2.f4469m).setImageDrawable(drawable4);
                                                                    ((ImageView) dVar2.f4470n).setImageDrawable(drawable4);
                                                                    ((ImageView) dVar2.f4471o).setImageDrawable(drawable4);
                                                                    ((ImageView) dVar2.f4472p).setImageDrawable(drawable4);
                                                                    ((ImageView) dVar2.f4473q).setImageDrawable(drawable3);
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                                final int i13 = 2;
                                                imageView4.setOnClickListener(new View.OnClickListener(this) { // from class: u4.q

                                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                    public final /* synthetic */ f0 f10574b;

                                                    {
                                                        this.f10574b = this;
                                                    }

                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        int i122 = i13;
                                                        Drawable drawable3 = drawable2;
                                                        Drawable drawable4 = drawable;
                                                        e2.d dVar2 = dVar;
                                                        f0 f0Var = this.f10574b;
                                                        switch (i122) {
                                                            case 0:
                                                                float f10 = UptodownApp.I;
                                                                if (b4.d.t()) {
                                                                    r7.o0 o0Var = f0Var.G().S;
                                                                    o0Var.getClass();
                                                                    o0Var.g(null, 1);
                                                                    ((ImageView) dVar2.f4469m).setImageDrawable(drawable4);
                                                                    ((ImageView) dVar2.f4470n).setImageDrawable(drawable3);
                                                                    ((ImageView) dVar2.f4471o).setImageDrawable(drawable3);
                                                                    ((ImageView) dVar2.f4472p).setImageDrawable(drawable3);
                                                                    ((ImageView) dVar2.f4473q).setImageDrawable(drawable3);
                                                                }
                                                                break;
                                                            case 1:
                                                                float f11 = UptodownApp.I;
                                                                if (b4.d.t()) {
                                                                    r7.o0 o0Var2 = f0Var.G().S;
                                                                    o0Var2.getClass();
                                                                    o0Var2.g(null, 2);
                                                                    ((ImageView) dVar2.f4469m).setImageDrawable(drawable4);
                                                                    ((ImageView) dVar2.f4470n).setImageDrawable(drawable4);
                                                                    ((ImageView) dVar2.f4471o).setImageDrawable(drawable3);
                                                                    ((ImageView) dVar2.f4472p).setImageDrawable(drawable3);
                                                                    ((ImageView) dVar2.f4473q).setImageDrawable(drawable3);
                                                                }
                                                                break;
                                                            case 2:
                                                                float f12 = UptodownApp.I;
                                                                if (b4.d.t()) {
                                                                    r7.o0 o0Var3 = f0Var.G().S;
                                                                    o0Var3.getClass();
                                                                    o0Var3.g(null, 3);
                                                                    ((ImageView) dVar2.f4469m).setImageDrawable(drawable4);
                                                                    ((ImageView) dVar2.f4470n).setImageDrawable(drawable4);
                                                                    ((ImageView) dVar2.f4471o).setImageDrawable(drawable4);
                                                                    ((ImageView) dVar2.f4472p).setImageDrawable(drawable3);
                                                                    ((ImageView) dVar2.f4473q).setImageDrawable(drawable3);
                                                                }
                                                                break;
                                                            default:
                                                                float f13 = UptodownApp.I;
                                                                if (b4.d.t()) {
                                                                    r7.o0 o0Var4 = f0Var.G().S;
                                                                    o0Var4.getClass();
                                                                    o0Var4.g(null, 4);
                                                                    ((ImageView) dVar2.f4469m).setImageDrawable(drawable4);
                                                                    ((ImageView) dVar2.f4470n).setImageDrawable(drawable4);
                                                                    ((ImageView) dVar2.f4471o).setImageDrawable(drawable4);
                                                                    ((ImageView) dVar2.f4472p).setImageDrawable(drawable4);
                                                                    ((ImageView) dVar2.f4473q).setImageDrawable(drawable3);
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                                final int i14 = 3;
                                                imageView5.setOnClickListener(new View.OnClickListener(this) { // from class: u4.q

                                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                    public final /* synthetic */ f0 f10574b;

                                                    {
                                                        this.f10574b = this;
                                                    }

                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        int i122 = i14;
                                                        Drawable drawable3 = drawable2;
                                                        Drawable drawable4 = drawable;
                                                        e2.d dVar2 = dVar;
                                                        f0 f0Var = this.f10574b;
                                                        switch (i122) {
                                                            case 0:
                                                                float f10 = UptodownApp.I;
                                                                if (b4.d.t()) {
                                                                    r7.o0 o0Var = f0Var.G().S;
                                                                    o0Var.getClass();
                                                                    o0Var.g(null, 1);
                                                                    ((ImageView) dVar2.f4469m).setImageDrawable(drawable4);
                                                                    ((ImageView) dVar2.f4470n).setImageDrawable(drawable3);
                                                                    ((ImageView) dVar2.f4471o).setImageDrawable(drawable3);
                                                                    ((ImageView) dVar2.f4472p).setImageDrawable(drawable3);
                                                                    ((ImageView) dVar2.f4473q).setImageDrawable(drawable3);
                                                                }
                                                                break;
                                                            case 1:
                                                                float f11 = UptodownApp.I;
                                                                if (b4.d.t()) {
                                                                    r7.o0 o0Var2 = f0Var.G().S;
                                                                    o0Var2.getClass();
                                                                    o0Var2.g(null, 2);
                                                                    ((ImageView) dVar2.f4469m).setImageDrawable(drawable4);
                                                                    ((ImageView) dVar2.f4470n).setImageDrawable(drawable4);
                                                                    ((ImageView) dVar2.f4471o).setImageDrawable(drawable3);
                                                                    ((ImageView) dVar2.f4472p).setImageDrawable(drawable3);
                                                                    ((ImageView) dVar2.f4473q).setImageDrawable(drawable3);
                                                                }
                                                                break;
                                                            case 2:
                                                                float f12 = UptodownApp.I;
                                                                if (b4.d.t()) {
                                                                    r7.o0 o0Var3 = f0Var.G().S;
                                                                    o0Var3.getClass();
                                                                    o0Var3.g(null, 3);
                                                                    ((ImageView) dVar2.f4469m).setImageDrawable(drawable4);
                                                                    ((ImageView) dVar2.f4470n).setImageDrawable(drawable4);
                                                                    ((ImageView) dVar2.f4471o).setImageDrawable(drawable4);
                                                                    ((ImageView) dVar2.f4472p).setImageDrawable(drawable3);
                                                                    ((ImageView) dVar2.f4473q).setImageDrawable(drawable3);
                                                                }
                                                                break;
                                                            default:
                                                                float f13 = UptodownApp.I;
                                                                if (b4.d.t()) {
                                                                    r7.o0 o0Var4 = f0Var.G().S;
                                                                    o0Var4.getClass();
                                                                    o0Var4.g(null, 4);
                                                                    ((ImageView) dVar2.f4469m).setImageDrawable(drawable4);
                                                                    ((ImageView) dVar2.f4470n).setImageDrawable(drawable4);
                                                                    ((ImageView) dVar2.f4471o).setImageDrawable(drawable4);
                                                                    ((ImageView) dVar2.f4472p).setImageDrawable(drawable4);
                                                                    ((ImageView) dVar2.f4473q).setImageDrawable(drawable3);
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                                imageView6.setOnClickListener(new c4.t(this, dVar, drawable, 20));
                                                editText.setTypeface(f4.c.f4884x);
                                                if (G().v.getValue() != null) {
                                                    Object value = G().v.getValue();
                                                    value.getClass();
                                                    String str = ((k2) value).f11264o;
                                                    if (str != null && str.length() != 0) {
                                                        Object value2 = G().v.getValue();
                                                        value2.getClass();
                                                        editText.setText(String.valueOf(((k2) value2).f11264o));
                                                    }
                                                    Object value3 = G().v.getValue();
                                                    value3.getClass();
                                                    if (((k2) value3).f11265p >= 1) {
                                                        i = R.drawable.vector_star_on;
                                                        k0.k.l(this, R.drawable.vector_star_on, imageView2);
                                                    } else {
                                                        i = R.drawable.vector_star_on;
                                                    }
                                                    Object value4 = G().v.getValue();
                                                    value4.getClass();
                                                    if (((k2) value4).f11265p >= 2) {
                                                        k0.k.l(this, i, imageView3);
                                                    }
                                                    Object value5 = G().v.getValue();
                                                    value5.getClass();
                                                    if (((k2) value5).f11265p >= 3) {
                                                        k0.k.l(this, i, imageView4);
                                                    }
                                                    Object value6 = G().v.getValue();
                                                    value6.getClass();
                                                    if (((k2) value6).f11265p >= 4) {
                                                        k0.k.l(this, i, imageView5);
                                                    }
                                                    Object value7 = G().v.getValue();
                                                    value7.getClass();
                                                    if (((k2) value7).f11265p == 5) {
                                                        k0.k.l(this, i, imageView6);
                                                    }
                                                }
                                                textView3.setTypeface(f4.c.f4883w);
                                                textView3.setOnClickListener(new c4.t(this, context, dVar, 21));
                                                textView2.setTypeface(f4.c.f4883w);
                                                textView2.setOnClickListener(new f(8, this, dVar));
                                                builder.setView(linearLayout);
                                                FragmentActivity activity2 = getActivity();
                                                activity2.getClass();
                                                AlertDialog alertDialog2 = ((c4.k0) activity2).F;
                                                if (alertDialog2 != null) {
                                                    alertDialog2.setOnDismissListener(new c4.v4(this, context, i10));
                                                }
                                                m0(builder);
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i6)));
    }

    public final void y() {
        SharedPreferences sharedPreferences;
        CharSequence charSequence;
        ArrayList arrayList;
        if (getContext() != null) {
            if (G().C.getValue() != null && G().D.getValue() != null) {
                float f = UptodownApp.I;
                Object value = G().C.getValue();
                value.getClass();
                ArrayList arrayListC = b4.d.c((x4.e) value);
                if (arrayListC != null && arrayListC.size() <= 1) {
                    synchronized (UptodownApp.f3300m0) {
                        arrayList = UptodownApp.n0;
                    }
                    if (arrayList.size() <= 1) {
                        Object value2 = G().D.getValue();
                        value2.getClass();
                        String str = ((q2) value2).f11345b;
                        a5.e.b(str, "ficha_app");
                        Context contextRequireContext = requireContext();
                        contextRequireContext.getClass();
                        if (!b4.d.p(contextRequireContext, "GenerateQueueWorker")) {
                            WorkManager.Companion.getInstance(contextRequireContext).enqueue(((OneTimeWorkRequest.Builder) androidx.lifecycle.l.t(GenerateQueueWorker.class, "GenerateQueueWorker")).setInputData(new Data.Builder().putBoolean("downloadAnyway", true).putString("packagename", str).build()).build());
                        }
                    }
                }
                if (a5.b.d()) {
                    w(new androidx.lifecycle.k(19));
                    return;
                }
                return;
            }
            if (getActivity() == null || !(getActivity() instanceof c4.k0)) {
                return;
            }
            float f10 = UptodownApp.I;
            x4.g gVarB = B();
            FragmentActivity activity = getActivity();
            activity.getClass();
            x4.r rVarD = b4.d.D(gVarB, (c4.k0) activity);
            if (rVarD == null || rVarD.f11355a < 0) {
                Context contextRequireContext2 = requireContext();
                contextRequireContext2.getClass();
                c0(contextRequireContext2);
                return;
            }
            if (B().m() && (charSequence = (CharSequence) G().X.getValue()) != null && charSequence.length() != 0) {
                long j = B().f11159a;
                Object value3 = G().X.getValue();
                value3.getClass();
                String str2 = (String) value3;
                int i = B().f11192w0;
                Context contextRequireContext3 = requireContext();
                contextRequireContext3.getClass();
                j5.g gVarL = j5.g.D.l(contextRequireContext3);
                gVarL.b();
                if (gVarL.O(j) == null) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("appId", Long.valueOf(j));
                    contentValues.put("categoryFrom", str2);
                    contentValues.put("promotedIndex", Integer.valueOf(i));
                    SQLiteDatabase sQLiteDatabase = gVarL.f6674a;
                    sQLiteDatabase.getClass();
                    sQLiteDatabase.insert("download_promoted", null, contentValues);
                }
                gVarL.c();
            }
            if (b4.d.k(B().F)) {
                x4.k kVar = UptodownApp.f3294g0;
                kVar.getClass();
                kVar.f11251d = rVarD.f11355a;
                e1.c0 c0Var = j5.g.D;
                Context contextRequireContext4 = requireContext();
                contextRequireContext4.getClass();
                j5.g gVarL2 = c0Var.l(contextRequireContext4);
                gVarL2.b();
                x4.r rVarJ = gVarL2.J(rVarD.f11355a);
                if (rVarJ != null && rVarJ.A == 0) {
                    rVarJ.A = 1;
                    gVarL2.q0(rVarJ);
                }
                gVarL2.c();
            }
            int i6 = rVarD.f11355a;
            String str3 = B().F;
            str3.getClass();
            long j6 = B().f11159a;
            if (getContext() != null && i6 >= 0) {
                Context contextRequireContext5 = requireContext();
                contextRequireContext5.getClass();
                x4.r1 r1VarA = i5.A(contextRequireContext5);
                if (r1VarA != null && r1VarA.f11374c == -1 && kotlin.jvm.internal.l.a(r1VarA.f11373b, str3) && r1VarA.f11372a == j6) {
                    Context contextRequireContext6 = requireContext();
                    contextRequireContext6.getClass();
                    r1VarA.f11374c = i6;
                    r1VarA.a(contextRequireContext6);
                }
            }
            Context contextRequireContext7 = requireContext();
            contextRequireContext7.getClass();
            int i10 = rVarD.f11355a;
            if (b4.d.p(contextRequireContext7, "downloadApkWorker")) {
                t4.b bVar = this.f10474b;
                bVar.getClass();
                TextView textView = bVar.P.f9810s;
                String string = getString(R.string.option_button_cancel);
                string.getClass();
                textView.setText(string);
                z3.K(textView);
                t4.b bVar2 = this.f10474b;
                bVar2.getClass();
                ((RelativeLayout) bVar2.P.v).setBackground(ContextCompat.getDrawable(requireContext(), R.drawable.ripple_open_button));
                t4.b bVar3 = this.f10474b;
                bVar3.getClass();
                bVar3.P.f9810s.setOnClickListener(new e(this, 4));
                t4.b bVar4 = this.f10474b;
                bVar4.getClass();
                bVar4.L.f9863b.setVisibility(0);
                Context contextRequireContext8 = requireContext();
                contextRequireContext8.getClass();
                try {
                    sharedPreferences = contextRequireContext8.getSharedPreferences("SettingsPreferences", 0);
                } catch (Exception unused) {
                }
                boolean z9 = sharedPreferences.contains("floating_download_queue_active") ? sharedPreferences.getBoolean("floating_download_queue_active", true) : true;
                if (!z9) {
                    FragmentActivity activity2 = getActivity();
                    activity2.getClass();
                    String string2 = getString(R.string.msg_added_to_downlads_queue);
                    string2.getClass();
                    ((c4.k0) activity2).A(String.format(string2, Arrays.copyOf(new Object[]{B().f11160b}, 1)));
                }
            } else {
                WorkManager.Companion.getInstance(contextRequireContext7).enqueue(((OneTimeWorkRequest.Builder) androidx.lifecycle.l.t(DownloadApkWorker.class, "downloadApkWorker")).setInputData(new Data.Builder().putInt("downloadId", i10).build()).build());
            }
            if (a5.b.d()) {
                w(new androidx.lifecycle.k(20));
            }
        }
    }

    public final void z() {
        o7.c0.s(LifecycleOwnerKt.getLifecycleScope(this), null, null, new w(this, null, 2), 3);
    }
}
