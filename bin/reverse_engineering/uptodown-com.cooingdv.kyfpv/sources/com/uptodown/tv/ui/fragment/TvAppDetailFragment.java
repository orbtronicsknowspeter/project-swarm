package com.uptodown.tv.ui.fragment;

import a3.e;
import a4.g0;
import a5.c;
import android.R;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcelable;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.inputmethod.a;
import androidx.fragment.app.FragmentActivity;
import androidx.leanback.app.BackgroundManager;
import androidx.leanback.app.DetailsSupportFragment;
import androidx.leanback.widget.Action;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.ClassPresenterSelector;
import androidx.leanback.widget.DetailsOverviewRow;
import androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter;
import androidx.leanback.widget.FullWidthDetailsOverviewSharedElementHelper;
import androidx.leanback.widget.ListRow;
import androidx.leanback.widget.ListRowPresenter;
import androidx.leanback.widget.SparseArrayObjectAdapter;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.l;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import androidx.work.Data;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import b4.d;
import c4.k0;
import c4.ya;
import com.google.android.gms.internal.measurement.i5;
import com.uptodown.UptodownApp;
import com.uptodown.workers.DownloadApkWorker;
import d4.p;
import e1.c0;
import e5.b;
import g5.f;
import j4.o;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import k0.k;
import l7.u;
import n4.i;
import o7.m0;
import t7.n;
import x4.f2;
import x4.g;
import x4.j0;
import x4.q2;
import x4.r;
import x4.u2;
import x4.w2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class TvAppDetailFragment extends DetailsSupportFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f3414a;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayObjectAdapter f3417m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public BackgroundManager f3418n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AlertDialog f3419o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AlertDialog f3420p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public DetailsOverviewRow f3421q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f3422r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public q2 f3423s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public b f3424t;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ActivityResultLauncher f3427x;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3415b = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3416l = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f3425u = true;
    public boolean v = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c0 f3426w = new c0(this);

    public TvAppDetailFragment() {
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new a(this, 20));
        activityResultLauncherRegisterForActivityResult.getClass();
        this.f3427x = activityResultLauncherRegisterForActivityResult;
    }

    public static void a(TvAppDetailFragment tvAppDetailFragment) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 ? Environment.isExternalStorageManager() : i >= 33 || ContextCompat.checkSelfPermission(tvAppDetailFragment.requireContext(), "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            tvAppDetailFragment.j();
        }
    }

    public final void b() {
        if (this.f3414a == null || getContext() == null) {
            return;
        }
        g gVar = this.f3414a;
        gVar.getClass();
        long j = gVar.f11159a;
        if (a5.b.c(j) || c.b(j) || a5.b.e(j)) {
            a5.b.f();
        }
    }

    public final void c(r rVar, String str) {
        AlertDialog alertDialog = this.f3419o;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(str);
        builder.setPositiveButton(R.string.ok, new g5.c(this, rVar));
        builder.setNegativeButton(R.string.cancel, new f5.b(5));
        builder.setCancelable(true);
        AlertDialog alertDialogCreate = builder.create();
        this.f3419o = alertDialogCreate;
        if (alertDialogCreate != null) {
            alertDialogCreate.show();
        }
    }

    public final boolean d() {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        AlertDialog alertDialog = this.f3420p;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        try {
            sharedPreferences2 = contextRequireContext.getSharedPreferences("SettingsPreferences", 0);
        } catch (Exception unused) {
        }
        boolean z9 = sharedPreferences2.contains("is_in_eea") ? sharedPreferences2.getBoolean("is_in_eea", true) : true;
        if (z9) {
            Context contextRequireContext2 = requireContext();
            contextRequireContext2.getClass();
            try {
                sharedPreferences = contextRequireContext2.getSharedPreferences("SettingsPreferences", 0);
            } catch (Exception unused2) {
            }
            boolean z10 = sharedPreferences.contains("gdpr_tracking_allowed") ? sharedPreferences.getBoolean("gdpr_tracking_allowed", false) : false;
            if (!z10) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setMessage(getString(com.uptodown.R.string.tracking_disabled_warning_gdpr));
                builder.setPositiveButton(com.uptodown.R.string.gdpr_set_up, new p(this, 2));
                builder.setNegativeButton(R.string.cancel, new f5.b(4));
                builder.setCancelable(true);
                this.f3420p = builder.create();
                if (!requireActivity().isFinishing()) {
                    AlertDialog alertDialog2 = this.f3420p;
                    if (alertDialog2 != null) {
                        alertDialog2.show();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void g(String str) {
        AlertDialog alertDialog = this.f3419o;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(str);
        builder.setPositiveButton(R.string.ok, new f5.b(2));
        builder.setCancelable(true);
        AlertDialog alertDialogCreate = builder.create();
        this.f3419o = alertDialogCreate;
        if (alertDialogCreate != null) {
            alertDialogCreate.show();
        }
    }

    public final void h() {
        File parentFile;
        PackageManager packageManager;
        g gVar = this.f3414a;
        if (gVar == null || gVar.F == null || getContext() == null) {
            n();
            return;
        }
        c0 c0Var = j5.g.D;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        j5.g gVarL = c0Var.l(contextRequireContext);
        gVarL.b();
        g gVar2 = this.f3414a;
        gVar2.getClass();
        String str = gVar2.F;
        str.getClass();
        g gVar3 = this.f3414a;
        gVar3.getClass();
        r rVarL = gVarL.L(gVar3.K, str);
        ApplicationInfo applicationInfoB = null;
        if (rVarL == null || !rVarL.c() || rVarL.F.isEmpty()) {
            parentFile = null;
            break;
        }
        Iterator it = rVarL.F.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            j0 j0Var = (j0) next;
            if (j0Var.f11241q != null) {
                String str2 = j0Var.f11241q;
                str2.getClass();
                File file = new File(str2);
                if (file.exists() && j0Var.f11239o == file.length()) {
                }
            }
            parentFile = null;
        }
        parentFile = rVarL.g();
        gVarL.c();
        if (parentFile == null) {
            n();
            return;
        }
        g gVar4 = this.f3414a;
        gVar4.getClass();
        String str3 = gVar4.F;
        str3.getClass();
        q2 q2VarY = gVarL.Y(str3);
        this.f3423s = q2VarY;
        if (q2VarY == null || q2VarY.f11350p != 1) {
            float f = UptodownApp.I;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            fragmentActivityRequireActivity.getClass();
            d.r(fragmentActivityRequireActivity, parentFile);
            return;
        }
        if (!parentFile.isDirectory()) {
            parentFile = new File(parentFile.getAbsolutePath()).getParentFile();
        }
        File file2 = parentFile;
        android.support.v4.media.g gVar5 = new android.support.v4.media.g(14, file2, this);
        try {
            FragmentActivity activity = getActivity();
            if (activity != null && (packageManager = activity.getPackageManager()) != null) {
                q2 q2Var = this.f3423s;
                q2Var.getClass();
                applicationInfoB = i.b(packageManager, q2Var.f11345b, 128);
            }
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
        }
        if (applicationInfoB == null) {
            String string = getString(com.uptodown.R.string.installable_files_not_found);
            string.getClass();
            g(string);
            return;
        }
        File file3 = new File(applicationInfoB.sourceDir);
        ArrayList arrayList = new ArrayList();
        arrayList.add(file3);
        file2.getClass();
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        new o(arrayList, file2, gVar5, false, contextRequireContext2);
    }

    public final void i(r rVar) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            g gVar = this.f3414a;
            gVar.getClass();
            rVar.a(gVar);
            int iR = rVar.r(activity);
            if (iR < 0) {
                String string = getString(com.uptodown.R.string.descarga_error);
                string.getClass();
                g(string);
                o();
                return;
            }
            float f = UptodownApp.I;
            if (!d.p(activity, "downloadApkWorker")) {
                WorkManager.Companion.getInstance(activity).enqueue(((OneTimeWorkRequest.Builder) l.t(DownloadApkWorker.class, "downloadApkWorker")).setInputData(new Data.Builder().putInt("downloadId", iR).build()).build());
                return;
            }
            String string2 = getString(com.uptodown.R.string.msg_added_to_downlads_queue);
            string2.getClass();
            g gVar2 = this.f3414a;
            gVar2.getClass();
            g(String.format(string2, Arrays.copyOf(new Object[]{gVar2.f11160b}, 1)));
        }
    }

    public final void j() {
        boolean zE;
        boolean z9;
        boolean zD;
        boolean zIsEmpty;
        SharedPreferences sharedPreferences;
        if (this.f3414a == null || getActivity() == null || k() || d()) {
            return;
        }
        g gVar = this.f3414a;
        if (gVar == null || !gVar.j()) {
            l("no_file_id");
            String string = getString(com.uptodown.R.string.msg_app_no_compatible_files);
            string.getClass();
            g(string);
            return;
        }
        r rVar = new r();
        g gVar2 = this.f3414a;
        gVar2.getClass();
        rVar.a(gVar2);
        x4.p pVar = new x4.p();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        pVar.g(contextRequireContext);
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        try {
            sharedPreferences = contextRequireContext2.getSharedPreferences("SettingsPreferences", 0);
        } catch (Exception unused) {
        }
        boolean z10 = sharedPreferences.contains("show_warning_download_incompatible") ? sharedPreferences.getBoolean("show_warning_download_incompatible", true) : true;
        if (z10) {
            z9 = rVar.f11366u <= pVar.g;
            zD = pVar.d(rVar);
            zE = pVar.e(rVar);
            g gVar3 = this.f3414a;
            gVar3.getClass();
            if (gVar3.U != null) {
                g gVar4 = this.f3414a;
                gVar4.getClass();
                ArrayList arrayList = gVar4.U;
                arrayList.getClass();
                Context contextRequireContext3 = requireContext();
                contextRequireContext3.getClass();
                zIsEmpty = x4.p.c(contextRequireContext3, arrayList).isEmpty();
            } else {
                zIsEmpty = true;
            }
        } else {
            zE = true;
            z9 = true;
            zD = true;
            zIsEmpty = true;
        }
        if (!z9 || !zD || !zE || !zIsEmpty) {
            if (!z9) {
                l("sdk");
                String string2 = getString(com.uptodown.R.string.msg_warning_incompatible_sdk);
                string2.getClass();
                c(rVar, string2);
                return;
            }
            if (!zD) {
                l("abi");
                String string3 = getString(com.uptodown.R.string.msg_warning_incompatible_abi);
                string3.getClass();
                c(rVar, string3);
                return;
            }
            if (zE) {
                l("required_feature");
                String string4 = getString(com.uptodown.R.string.msg_warning_incompatible_required_features);
                string4.getClass();
                c(rVar, string4);
                return;
            }
            l("density");
            String string5 = getString(com.uptodown.R.string.msg_warning_incompatible_density);
            string5.getClass();
            c(rVar, string5);
            return;
        }
        if (getActivity() == null || requireActivity().isFinishing()) {
            return;
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        fragmentActivityRequireActivity.getClass();
        w2 w2VarH = u2.h(fragmentActivityRequireActivity);
        if (w2VarH == null || !w2VarH.d()) {
            i(rVar);
            return;
        }
        g gVar5 = this.f3414a;
        gVar5.getClass();
        if (gVar5.Z == null) {
            o7.c0.s(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ya(this, rVar, (t6.c) null, 8), 3);
            return;
        }
        g gVar6 = this.f3414a;
        gVar6.getClass();
        f2 f2Var = gVar6.Z;
        f2Var.getClass();
        if (f2Var.f11155m <= 0) {
            i(rVar);
            return;
        }
        FragmentActivity activity = getActivity();
        activity.getClass();
        g gVar7 = this.f3414a;
        gVar7.getClass();
        g gVar8 = this.f3414a;
        gVar8.getClass();
        f2 f2Var2 = gVar8.Z;
        f2Var2.getClass();
        ((k0) activity).P(gVar7, f2Var2, new g5.a(this, rVar, 0), new g5.b(this, 0));
    }

    public final boolean k() {
        g gVar = this.f3414a;
        gVar.getClass();
        long j = gVar.f11159a;
        return a5.b.c(j) || c.b(j);
    }

    public final void l(String str) {
        boolean zK;
        if (this.f3414a != null) {
            Bundle bundleE = k.e(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, str);
            g gVar = this.f3414a;
            gVar.getClass();
            bundleE.putString("packagename", gVar.F);
            g gVar2 = this.f3414a;
            gVar2.getClass();
            if (gVar2.f11159a >= 0) {
                g gVar3 = this.f3414a;
                gVar3.getClass();
                bundleE.putString("appId", String.valueOf(gVar3.f11159a));
            }
            g gVar4 = this.f3414a;
            gVar4.getClass();
            if (gVar4.J >= 0) {
                g gVar5 = this.f3414a;
                gVar5.getClass();
                bundleE.putString("fileId", String.valueOf(gVar5.J));
            }
            g gVar6 = this.f3414a;
            if (gVar6 == null) {
                zK = false;
            } else {
                float f = UptodownApp.I;
                zK = d.k(gVar6.F);
            }
            if (zK) {
                bundleE.putInt("deeplink", 1);
            } else {
                bundleE.putInt("deeplink", 0);
            }
            new android.support.v4.media.g(requireActivity(), 20).E(bundleE, "warning");
        }
    }

    public final void m() {
        if (Build.VERSION.SDK_INT >= 33 || ContextCompat.checkSelfPermission(requireContext(), "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            j();
        } else {
            ActivityCompat.requestPermissions(requireActivity(), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 645);
        }
    }

    public final void n() {
        if (Build.VERSION.SDK_INT < 30) {
            m();
            return;
        }
        if (Environment.isExternalStorageManager()) {
            m();
            return;
        }
        try {
            this.f3427x.launch(new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", Uri.parse("package:" + requireContext().getPackageName())));
        } catch (ActivityNotFoundException unused) {
            m();
        }
    }

    public final void o() {
        long j;
        g gVar;
        if (getActivity() != null) {
            if (this.f3416l != 1) {
                try {
                    SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new e5.a());
                    try {
                        gVar = this.f3414a;
                    } catch (NumberFormatException e10) {
                        e10.printStackTrace();
                    }
                    if (gVar == null || gVar.f11178p == null) {
                        j = 0;
                    } else {
                        gVar.getClass();
                        String str = gVar.f11178p;
                        str.getClass();
                        j = Long.parseLong(str);
                    }
                    String string = requireActivity().getString(com.uptodown.R.string.updates_button_download_app);
                    Context contextRequireContext = requireContext();
                    contextRequireContext.getClass();
                    sparseArrayObjectAdapter.set(1, new Action(1L, string, i5.H(contextRequireContext, j)));
                    sparseArrayObjectAdapter.set(3, new Action(3L, requireActivity().getString(com.uptodown.R.string.dialogo_app_old_versions)));
                    sparseArrayObjectAdapter.set(4, new Action(4L, requireActivity().getString(com.uptodown.R.string.virustotal_safety_report_title)));
                    sparseArrayObjectAdapter.set(5, new Action(5L, requireActivity().getString(com.uptodown.R.string.app_detail_more_info_title)));
                    DetailsOverviewRow detailsOverviewRow = this.f3421q;
                    detailsOverviewRow.getClass();
                    detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                this.f3416l = 1;
            }
            b bVar = this.f3424t;
            bVar.getClass();
            i5.b bVar2 = bVar.f4735b;
            if (bVar2 != null) {
                bVar2.a(0);
            }
        }
    }

    @Override // androidx.leanback.app.DetailsSupportFragment, androidx.leanback.app.BaseSupportFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        BackgroundManager backgroundManager;
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Bundle extras = activity.getIntent().getExtras();
            if (extras != null) {
                if (extras.containsKey("appId")) {
                    this.f3415b = extras.getLong("appId");
                }
                if (extras.containsKey("appInfo")) {
                    g gVar = (g) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) extras.getParcelable("appInfo", g.class) : extras.getParcelable("appInfo"));
                    this.f3414a = gVar;
                    if (gVar != null) {
                        this.f3415b = gVar.f11159a;
                    }
                }
            }
            BackgroundManager backgroundManager2 = BackgroundManager.getInstance(activity);
            this.f3418n = backgroundManager2;
            if (backgroundManager2 != null && !backgroundManager2.isAttached() && (backgroundManager = this.f3418n) != null) {
                backgroundManager.attach(activity.getWindow());
            }
            Drawable drawable = ContextCompat.getDrawable(activity, com.uptodown.R.drawable.tv_default_background);
            BackgroundManager backgroundManager3 = this.f3418n;
            if (backgroundManager3 != null) {
                backgroundManager3.setDrawable(drawable);
            }
            this.f3424t = new b(this.f3426w);
            FullWidthDetailsOverviewRowPresenter fullWidthDetailsOverviewRowPresenter = new FullWidthDetailsOverviewRowPresenter(this.f3424t, new e5.d());
            fullWidthDetailsOverviewRowPresenter.setBackgroundColor(ContextCompat.getColor(activity, com.uptodown.R.color.background_color));
            int i = 0;
            fullWidthDetailsOverviewRowPresenter.setInitialState(0);
            FullWidthDetailsOverviewSharedElementHelper fullWidthDetailsOverviewSharedElementHelper = new FullWidthDetailsOverviewSharedElementHelper();
            fullWidthDetailsOverviewSharedElementHelper.setSharedElementEnterTransition(activity, "transition_name");
            fullWidthDetailsOverviewRowPresenter.setListener(fullWidthDetailsOverviewSharedElementHelper);
            fullWidthDetailsOverviewRowPresenter.setParticipatingEntranceTransition(false);
            prepareEntranceTransition();
            fullWidthDetailsOverviewRowPresenter.setOnActionClickedListener(new e(4, this, activity));
            fullWidthDetailsOverviewRowPresenter.setActionsBackgroundColor(ContextCompat.getColor(activity, com.uptodown.R.color.main_blue));
            ClassPresenterSelector classPresenterSelector = new ClassPresenterSelector();
            classPresenterSelector.addClassPresenter(DetailsOverviewRow.class, fullWidthDetailsOverviewRowPresenter);
            classPresenterSelector.addClassPresenter(ListRow.class, new ListRowPresenter());
            ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(classPresenterSelector);
            this.f3417m = arrayObjectAdapter;
            setAdapter(arrayObjectAdapter);
            if (this.f3414a != null) {
                SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new e5.a());
                g gVar2 = this.f3414a;
                gVar2.getClass();
                DetailsOverviewRow detailsOverviewRow = new DetailsOverviewRow(gVar2);
                this.f3421q = detailsOverviewRow;
                detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
                g gVar3 = this.f3414a;
                gVar3.getClass();
                if (gVar3.e() != null) {
                    g0 g0VarD = g0.d();
                    g gVar4 = this.f3414a;
                    gVar4.getClass();
                    g0VarD.e(gVar4.e()).b(new f(this, i));
                } else if (getContext() != null) {
                    Drawable drawable2 = ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.feature_tv);
                    BackgroundManager backgroundManager4 = this.f3418n;
                    backgroundManager4.getClass();
                    backgroundManager4.setDrawable(drawable2);
                }
                g0 g0VarD2 = g0.d();
                g gVar5 = this.f3414a;
                gVar5.getClass();
                g0VarD2.e(gVar5.h()).b(new g5.g(this, i));
                ArrayObjectAdapter arrayObjectAdapter2 = this.f3417m;
                arrayObjectAdapter2.getClass();
                DetailsOverviewRow detailsOverviewRow2 = this.f3421q;
                detailsOverviewRow2.getClass();
                arrayObjectAdapter2.add(detailsOverviewRow2);
            }
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            v7.e eVar = m0.f8289a;
            o7.c0.s(lifecycleScope, n.f10349a, null, new ya(this, null, 9), 2);
            d();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 831) {
            if ((iArr.length == 0) || iArr[0] != 0) {
                return;
            }
            j();
        }
    }

    @Override // androidx.leanback.app.BrandedSupportFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.v) {
            this.v = false;
        } else {
            u();
        }
    }

    @Override // androidx.leanback.app.DetailsSupportFragment, androidx.leanback.app.BrandedSupportFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (!this.f3425u) {
            o7.c0.s(LifecycleOwnerKt.getLifecycleScope(this), null, null, new g5.e(this, null, 1), 3);
        }
        this.f3425u = false;
    }

    @Override // androidx.leanback.app.DetailsSupportFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        BackgroundManager backgroundManager = this.f3418n;
        backgroundManager.getClass();
        backgroundManager.release();
        super.onStop();
    }

    public final void p(r rVar) {
        if (getActivity() != null) {
            if (this.f3416l != 3) {
                SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new e5.a());
                sparseArrayObjectAdapter.set(1, new Action(1L, requireActivity().getString(R.string.cancel)));
                if (this.f3414a != null) {
                    String packageName = requireActivity().getPackageName();
                    g gVar = this.f3414a;
                    gVar.getClass();
                    if (!u.m0(packageName, gVar.F, true)) {
                        sparseArrayObjectAdapter.set(3, new Action(3L, getString(com.uptodown.R.string.dialogo_app_old_versions)));
                    }
                }
                sparseArrayObjectAdapter.set(4, new Action(4L, getString(com.uptodown.R.string.virustotal_safety_report_title)));
                sparseArrayObjectAdapter.set(5, new Action(5L, getString(com.uptodown.R.string.app_detail_more_info_title)));
                DetailsOverviewRow detailsOverviewRow = this.f3421q;
                detailsOverviewRow.getClass();
                detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
                this.f3416l = 3;
            }
            b bVar = this.f3424t;
            bVar.getClass();
            int i = rVar.i();
            i5.b bVar2 = bVar.f4735b;
            if (bVar2 != null) {
                bVar2.a(i);
            }
        }
    }

    public final void q() {
        if (getActivity() != null) {
            if (this.f3416l != 2) {
                SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new e5.a());
                sparseArrayObjectAdapter.set(1, new Action(1L, getString(com.uptodown.R.string.option_button_install)));
                if (getActivity() != null && this.f3414a != null) {
                    String packageName = requireActivity().getPackageName();
                    g gVar = this.f3414a;
                    gVar.getClass();
                    if (!u.m0(packageName, gVar.F, true)) {
                        sparseArrayObjectAdapter.set(3, new Action(3L, getString(com.uptodown.R.string.dialogo_app_old_versions)));
                    }
                }
                sparseArrayObjectAdapter.set(4, new Action(4L, getString(com.uptodown.R.string.virustotal_safety_report_title)));
                sparseArrayObjectAdapter.set(5, new Action(5L, getString(com.uptodown.R.string.app_detail_more_info_title)));
                DetailsOverviewRow detailsOverviewRow = this.f3421q;
                detailsOverviewRow.getClass();
                detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
                this.f3416l = 2;
            }
            b bVar = this.f3424t;
            bVar.getClass();
            i5.b bVar2 = bVar.f4735b;
            if (bVar2 != null) {
                bVar2.a(0);
            }
        }
    }

    public final void r() {
        if (getActivity() != null) {
            if (this.f3416l != 7) {
                SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new e5.a());
                sparseArrayObjectAdapter.set(1, new Action(1L, getString(com.uptodown.R.string.installing)));
                if (getActivity() != null && this.f3414a != null) {
                    String packageName = requireActivity().getPackageName();
                    g gVar = this.f3414a;
                    gVar.getClass();
                    if (!u.m0(packageName, gVar.F, true)) {
                        sparseArrayObjectAdapter.set(3, new Action(3L, getString(com.uptodown.R.string.dialogo_app_old_versions)));
                    }
                }
                sparseArrayObjectAdapter.set(4, new Action(4L, getString(com.uptodown.R.string.virustotal_safety_report_title)));
                sparseArrayObjectAdapter.set(5, new Action(5L, getString(com.uptodown.R.string.app_detail_more_info_title)));
                DetailsOverviewRow detailsOverviewRow = this.f3421q;
                detailsOverviewRow.getClass();
                detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
                this.f3416l = 7;
            }
            b bVar = this.f3424t;
            bVar.getClass();
            i5.b bVar2 = bVar.f4735b;
            if (bVar2 != null) {
                bVar2.f5668p.setIndeterminate(true);
            }
        }
    }

    public final void s() {
        if (getActivity() == null || this.f3416l == 0) {
            return;
        }
        SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new e5.a());
        if (getActivity() != null && this.f3414a != null) {
            String packageName = requireActivity().getPackageName();
            g gVar = this.f3414a;
            gVar.getClass();
            if (!u.m0(packageName, gVar.F, true)) {
                sparseArrayObjectAdapter.set(1, new Action(1L, getString(com.uptodown.R.string.open)));
                sparseArrayObjectAdapter.set(2, new Action(2L, getString(com.uptodown.R.string.dialogo_app_selected_uninstall)));
                sparseArrayObjectAdapter.set(3, new Action(3L, getString(com.uptodown.R.string.dialogo_app_old_versions)));
            }
        }
        sparseArrayObjectAdapter.set(4, new Action(4L, getString(com.uptodown.R.string.virustotal_safety_report_title)));
        sparseArrayObjectAdapter.set(5, new Action(5L, getString(com.uptodown.R.string.app_detail_more_info_title)));
        DetailsOverviewRow detailsOverviewRow = this.f3421q;
        detailsOverviewRow.getClass();
        detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
        this.f3416l = 0;
    }

    public final void t() {
        long j;
        g gVar;
        try {
            if (getActivity() != null && this.f3414a != null) {
                SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new e5.a());
                try {
                    gVar = this.f3414a;
                    gVar.getClass();
                } catch (NumberFormatException e10) {
                    e10.printStackTrace();
                }
                if (gVar.f11178p != null) {
                    g gVar2 = this.f3414a;
                    gVar2.getClass();
                    String str = gVar2.f11178p;
                    str.getClass();
                    j = Long.parseLong(str);
                } else {
                    j = 0;
                }
                String string = getString(com.uptodown.R.string.updates_button_download_app);
                Context contextRequireContext = requireContext();
                contextRequireContext.getClass();
                sparseArrayObjectAdapter.set(1, new Action(1L, string, i5.H(contextRequireContext, j)));
                String packageName = requireActivity().getPackageName();
                g gVar3 = this.f3414a;
                gVar3.getClass();
                if (!u.m0(packageName, gVar3.F, true)) {
                    sparseArrayObjectAdapter.set(2, new Action(2L, getString(com.uptodown.R.string.dialogo_app_selected_uninstall)));
                    sparseArrayObjectAdapter.set(3, new Action(3L, getString(com.uptodown.R.string.dialogo_app_old_versions)));
                }
                sparseArrayObjectAdapter.set(4, new Action(4L, getString(com.uptodown.R.string.virustotal_safety_report_title)));
                sparseArrayObjectAdapter.set(5, new Action(5L, getString(com.uptodown.R.string.app_detail_more_info_title)));
                DetailsOverviewRow detailsOverviewRow = this.f3421q;
                detailsOverviewRow.getClass();
                detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        this.f3416l = 5;
    }

    public final void u() {
        o7.c0.s(LifecycleOwnerKt.getLifecycleScope(this), null, null, new g5.e(this, null, 4), 3);
    }
}
