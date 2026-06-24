package c4;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import androidx.viewbinding.ViewBindings;
import androidx.work.Data;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.CustomWebView;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.MyApps;
import com.uptodown.activities.MyDownloads;
import com.uptodown.core.activities.InstallerActivity;
import com.uptodown.core.view.WrapContentLinearLayoutManager;
import com.uptodown.workers.DownloadApkWorker;
import j$.time.Year;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class k0 extends g4.s0 {
    public static final /* synthetic */ int N = 0;
    public android.support.v4.media.g E;
    public AlertDialog F;
    public RecyclerView G;
    public e4.c0 H;
    public final f0.i I = new f0.i(this, 5);
    public ArrayList J = new ArrayList();
    public ActivityResultLauncher K;
    public n5.d L;
    public RelativeLayout M;

    public final void H(String str, d7.a aVar) {
        if (isFinishing()) {
            return;
        }
        Q();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        a4.d0 d0VarK = a4.d0.k(getLayoutInflater());
        TextView textView = (TextView) d0VarK.f83m;
        TextView textView2 = (TextView) d0VarK.f85o;
        TextView textView3 = (TextView) d0VarK.f84n;
        textView3.setTypeface(f4.c.f4884x);
        textView3.setText(str);
        textView2.setTypeface(f4.c.f4883w);
        textView2.setOnClickListener(new p(aVar, this, 0));
        textView.setTypeface(f4.c.f4883w);
        textView.setOnClickListener(new o(this, 2));
        builder.setView((LinearLayout) d0VarK.f81b);
        this.F = builder.create();
        if (isFinishing() || this.F == null) {
            return;
        }
        u0();
    }

    public final void I(String str, d7.a aVar, d7.a aVar2) {
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        v7.e eVar = o7.m0.f8289a;
        o7.c0.s(lifecycleScope, t7.n.f10349a, null, new w(this, str, aVar, aVar2, null, 0), 2);
    }

    public final void J() {
        if (isFinishing()) {
            return;
        }
        Q();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        int i = 0;
        View viewInflate = getLayoutInflater().inflate(R.layout.dialog_451, (ViewGroup) null, false);
        int i6 = R.id.tv_learn_more;
        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_learn_more);
        if (textView != null) {
            i6 = R.id.tv_msg;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_msg);
            if (textView2 != null) {
                i6 = R.id.tv_ok;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_ok);
                if (textView3 != null) {
                    i6 = R.id.tv_title;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_title);
                    if (textView4 != null) {
                        textView4.setTypeface(f4.c.f4883w);
                        textView2.setTypeface(f4.c.f4884x);
                        textView3.setTypeface(f4.c.f4883w);
                        textView.setTypeface(f4.c.f4884x);
                        textView3.setOnClickListener(new o(this, i));
                        textView.setOnClickListener(new o(this, 1));
                        builder.setView((LinearLayout) viewInflate);
                        this.F = builder.create();
                        if (isFinishing() || this.F == null) {
                            return;
                        }
                        u0();
                        return;
                    }
                }
            }
        }
        com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i6)));
    }

    public final void K(String str, final d7.a aVar, final d7.a aVar2) {
        Integer numH0 = str != null ? l7.t.h0(str) : null;
        if (numH0 == null || numH0.intValue() < 18) {
            aVar.invoke();
            return;
        }
        int i = getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
        final int value = Year.now().getValue();
        if (i > 0) {
            if (value - i >= 18) {
                aVar.invoke();
                return;
            } else {
                L(aVar2);
                return;
            }
        }
        Q();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final g4.u uVarC = g4.u.c(getLayoutInflater());
        TextView textView = uVarC.f5270n;
        TextView textView2 = uVarC.f5269m;
        ((TextView) uVarC.f5274r).setTypeface(f4.c.f4883w);
        uVarC.f5272p.setTypeface(f4.c.f4884x);
        uVarC.f5271o.setTypeface(f4.c.f4884x);
        uVarC.f5268l.setTypeface(f4.c.f4884x);
        ((TextView) uVarC.f5273q).setTypeface(f4.c.f4884x);
        textView2.setTypeface(f4.c.f4883w);
        textView.setTypeface(f4.c.f4883w);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: c4.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditText editText = uVarC.f5268l;
                Integer numH02 = l7.t.h0(editText.getText().toString());
                Editable text = editText.getText();
                text.getClass();
                int length = text.length();
                k0 k0Var = this;
                if (length <= 0 || numH02 == null) {
                    String string = k0Var.getString(R.string.age_verification_input_failed);
                    string.getClass();
                    k0Var.A(string);
                    return;
                }
                String string2 = editText.getText().toString();
                int iIntValue = numH02.intValue();
                string2.getClass();
                int i6 = value;
                if (iIntValue >= i6 || string2.length() != 4 || iIntValue <= 1900) {
                    String string3 = k0Var.getString(R.string.age_verification_input_failed);
                    string3.getClass();
                    k0Var.A(string3);
                    return;
                }
                Object systemService = k0Var.getSystemService("input_method");
                systemService.getClass();
                ((InputMethodManager) systemService).hideSoftInputFromWindow(editText.getWindowToken(), 0);
                k0Var.Q();
                int iIntValue2 = numH02.intValue();
                SharedPreferences sharedPreferences = k0Var.getSharedPreferences("SettingsPreferences", 0);
                sharedPreferences.getClass();
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putInt("ageVerificationYear", iIntValue2);
                editorEdit.apply();
                if (i6 - numH02.intValue() >= 18) {
                    aVar.invoke();
                } else {
                    k0Var.L(aVar2);
                }
            }
        });
        textView.setOnClickListener(new o(this, 3));
        builder.setView(uVarC.f5267b);
        builder.setCancelable(false);
        this.F = builder.create();
        u0();
    }

    public final void L(d7.a aVar) {
        Q();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        a4.d0 d0VarK = a4.d0.k(getLayoutInflater());
        TextView textView = (TextView) d0VarK.f84n;
        textView.setTypeface(f4.c.f4884x);
        textView.setText(getString(R.string.age_verification_failed));
        ((TextView) d0VarK.f83m).setVisibility(8);
        TextView textView2 = (TextView) d0VarK.f85o;
        textView2.setText(getString(R.string.go_back));
        textView2.setTypeface(f4.c.f4883w);
        textView2.setOnClickListener(new p(aVar, this, 1));
        builder.setView((LinearLayout) d0VarK.f81b);
        builder.setCancelable(false);
        this.F = builder.create();
        u0();
    }

    public final void M(File file) {
        String string = getString(R.string.warning_auto_update);
        string.getClass();
        H(string, new androidx.work.impl.utils.c(2, this, file));
    }

    public final void N(String str) {
        str.getClass();
        if (isFinishing()) {
            return;
        }
        Q();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        a4.d0 d0VarK = a4.d0.k(getLayoutInflater());
        TextView textView = (TextView) d0VarK.f85o;
        TextView textView2 = (TextView) d0VarK.f84n;
        textView2.setTypeface(f4.c.f4884x);
        textView2.setText(str);
        ((TextView) d0VarK.f83m).setVisibility(8);
        textView.setTypeface(f4.c.f4883w);
        textView.setOnClickListener(new o(this, 5));
        builder.setView((LinearLayout) d0VarK.f81b);
        this.F = builder.create();
        if (isFinishing() || this.F == null) {
            return;
        }
        u0();
    }

    public final void O() {
        AlertDialog alertDialog;
        if (isFinishing()) {
            return;
        }
        Q();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        a4.d0 d0VarK = a4.d0.k(getLayoutInflater());
        TextView textView = (TextView) d0VarK.f85o;
        TextView textView2 = (TextView) d0VarK.f84n;
        TextView textView3 = (TextView) d0VarK.f83m;
        textView2.setTypeface(f4.c.f4884x);
        textView2.setText(getString(R.string.msg_storage_permission_required));
        textView.setTypeface(f4.c.f4883w);
        MainActivity mainActivity = (MainActivity) this;
        textView.setOnClickListener(new s(0, mainActivity));
        textView3.setTypeface(f4.c.f4883w);
        textView3.setText(getString(R.string.exit));
        textView3.setOnClickListener(new s(1, mainActivity));
        builder.setView((LinearLayout) d0VarK.f81b);
        builder.setCancelable(false);
        this.F = builder.create();
        if (isFinishing() || (alertDialog = this.F) == null) {
            return;
        }
        Window window = alertDialog.getWindow();
        if (window != null) {
            a4.x.y(window, 0);
        }
        AlertDialog alertDialog2 = this.F;
        alertDialog2.getClass();
        alertDialog2.show();
    }

    public final void P(x4.g gVar, x4.f2 f2Var, d7.a aVar, d7.a aVar2) {
        Object obj;
        gVar.getClass();
        Q();
        View viewInflate = getLayoutInflater().inflate(R.layout.dialog_turbo_positives_detected, (ViewGroup) null, false);
        int i = R.id.iv_close_dialog_turbo_positives_detected;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.iv_close_dialog_turbo_positives_detected);
        if (imageView != null) {
            i = R.id.iv_vt_warning;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.iv_vt_warning);
            if (imageView2 != null) {
                i = R.id.ll_vt_warning_positives;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.ll_vt_warning_positives);
                if (linearLayout != null) {
                    i = R.id.rl_vt_report;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(viewInflate, R.id.rl_vt_report);
                    if (relativeLayout != null) {
                        i = R.id.tv_action_dialog_turbo_positives_detected;
                        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_action_dialog_turbo_positives_detected);
                        if (textView != null) {
                            i = R.id.tv_description_dialog_turbo_positives_detected;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_description_dialog_turbo_positives_detected);
                            if (textView2 != null) {
                                i = R.id.tv_title_dialog_turbo_positives_detected;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_title_dialog_turbo_positives_detected);
                                if (textView3 != null) {
                                    i = R.id.tv_vt_warning_latest_scan_title;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_vt_warning_latest_scan_title);
                                    if (textView4 != null) {
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_vt_warning_subtitle);
                                        if (textView5 != null) {
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_vt_warning_title);
                                            if (textView6 != null) {
                                                RelativeLayout relativeLayout2 = (RelativeLayout) viewInflate;
                                                textView3.setTypeface(f4.c.f4883w);
                                                textView2.setTypeface(f4.c.f4884x);
                                                imageView.setOnClickListener(new p(this, aVar2, 2));
                                                if (f2Var != null) {
                                                    textView.setText(getString(R.string.download_anyways));
                                                    textView6.setTypeface(f4.c.f4883w);
                                                    textView5.setTypeface(f4.c.f4884x);
                                                    textView5.setText(getString(R.string.vt_report_warning_subtitle, String.valueOf(f2Var.f11155m), String.valueOf(f2Var.f11154l)));
                                                    textView4.setTypeface(f4.c.f4884x);
                                                    textView4.setText(getString(R.string.virustotal_report_previous_scan, f2Var.f11156n));
                                                    ArrayList arrayList = f2Var.f11157o;
                                                    if (arrayList != null && !arrayList.isEmpty()) {
                                                        ArrayList arrayList2 = f2Var.f11157o;
                                                        arrayList2.getClass();
                                                        int size = arrayList2.size();
                                                        int i6 = 0;
                                                        while (true) {
                                                            if (i6 >= size) {
                                                                obj = null;
                                                                break;
                                                            }
                                                            obj = arrayList2.get(i6);
                                                            i6++;
                                                            x4.g1 g1Var = (x4.g1) obj;
                                                            if (g1Var.f11202l == 0 && g1Var.f11203m == 0) {
                                                                break;
                                                            }
                                                        }
                                                        if (((x4.g1) obj) != null) {
                                                            relativeLayout.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_bg_virustotal_warning_red));
                                                            imageView2.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.vector_vt_report_warning_red));
                                                        }
                                                        ArrayList arrayList3 = f2Var.f11157o;
                                                        arrayList3.getClass();
                                                        m0(linearLayout, arrayList3);
                                                        if (gVar.f11159a > 0) {
                                                            ArrayList arrayList4 = f2Var.f11157o;
                                                            arrayList4.getClass();
                                                            if (arrayList4.size() > 3) {
                                                                View viewInflate2 = getLayoutInflater().inflate(R.layout.tv_show_more, (ViewGroup) null, false);
                                                                if (viewInflate2 == null) {
                                                                    com.google.gson.internal.a.i("rootView");
                                                                    return;
                                                                }
                                                                TextView textView7 = (TextView) viewInflate2;
                                                                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                                                                layoutParams.setMargins((int) getResources().getDimension(R.dimen.margin_s), (int) getResources().getDimension(R.dimen.margin_l), 0, 0);
                                                                textView7.setLayoutParams(layoutParams);
                                                                textView7.setTypeface(f4.c.f4883w);
                                                                textView7.setOnClickListener(new t(this, gVar, f2Var, 0));
                                                                linearLayout.addView(textView7);
                                                            }
                                                        }
                                                    }
                                                }
                                                textView.setTypeface(f4.c.f4883w);
                                                textView.setOnClickListener(new p(this, aVar, 3));
                                                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                                                builder.setView(relativeLayout2);
                                                builder.setCancelable(true);
                                                builder.setOnCancelListener(new u(aVar2, 0));
                                                this.F = builder.create();
                                                u0();
                                                return;
                                            }
                                            i = R.id.tv_vt_warning_title;
                                        } else {
                                            i = R.id.tv_vt_warning_subtitle;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    public final void Q() {
        AlertDialog alertDialog = this.F;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    public final void R() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_preregister_notifications);
        this.G = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new WrapContentLinearLayoutManager(this, 1, false));
            RecyclerView recyclerView2 = this.G;
            recyclerView2.getClass();
            recyclerView2.addItemDecoration(new l5.g((int) getResources().getDimension(R.dimen.margin_m)));
            MainActivity mainActivity = (MainActivity) this;
            this.H = new e4.c0(mainActivity, this.I);
            RecyclerView recyclerView3 = this.G;
            recyclerView3.getClass();
            recyclerView3.setAdapter(this.H);
            new ItemTouchHelper(new v(mainActivity)).attachToRecyclerView(this.G);
        }
    }

    public final void S(x4.q2 q2Var, File file) {
        ApplicationInfo applicationInfoB;
        q2Var.getClass();
        if (!file.isDirectory() && (file = new File(file.getAbsolutePath()).getParentFile()) == null) {
            return;
        }
        File file2 = file;
        b5.m mVar = new b5.m(this, file2, q2Var, 2);
        try {
            PackageManager packageManager = getPackageManager();
            packageManager.getClass();
            applicationInfoB = n4.i.b(packageManager, q2Var.f11345b, 128);
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            applicationInfoB = null;
        }
        if (applicationInfoB == null) {
            String string = getString(R.string.installable_files_not_found);
            string.getClass();
            N(string);
        } else {
            File file3 = new File(applicationInfoB.sourceDir);
            ArrayList arrayList = new ArrayList();
            arrayList.add(file3);
            new j4.o(arrayList, file2, mVar, false, this);
        }
    }

    public final boolean T() {
        if (com.google.android.gms.internal.measurement.z3.f2928c) {
            return true;
        }
        String string = getString(R.string.error_no_connection);
        string.getClass();
        N(string);
        return false;
    }

    public final void U(File file, String str) {
        android.support.v4.media.g gVar = new android.support.v4.media.g(1, this, file);
        if (f4.a.f4870a.c() != null || f4.c.v != null) {
            String string = getString(R.string.core_installation_in_progress_msg);
            string.getClass();
            A(string);
            return;
        }
        String name = file.getName();
        name.getClass();
        if (!l7.u.k0(name, ".xapk", true) && !l7.u.k0(name, ".apks", true) && !l7.u.k0(name, ".apkm", true) && !l7.u.k0(name, ".zip", true)) {
            float f = UptodownApp.I;
            b4.d.q(this, str, file);
        } else {
            String absolutePath = file.getAbsolutePath();
            absolutePath.getClass();
            new a2.t(this, absolutePath, gVar, m());
        }
    }

    public final void V(File file, String str) {
        file.getClass();
        boolean zF = j5.a.f(this);
        x4.w2 w2VarH = x4.u2.h(this);
        j5.g gVarL = j5.g.D.l(this);
        gVarL.b();
        if (file.isFile()) {
            String name = file.getName();
            name.getClass();
            x4.r rVarG = gVarL.G(name);
            if (w2VarH == null || !w2VarH.d()) {
                String absolutePath = file.getAbsolutePath();
                absolutePath.getClass();
                Intent intent = new Intent(this, (Class<?>) InstallerActivity.class);
                intent.putExtra("realPath", absolutePath);
                intent.putExtra("requireUserAction", zF);
                intent.putExtra("backgroundInstallation", false);
                intent.addFlags(268435456);
                if (str != null && str.length() != 0) {
                    intent.putExtra("newFeatures", str);
                }
                startActivity(intent);
                X(rVarG);
            } else {
                o7.c0.s(LifecycleOwnerKt.getLifecycleScope(this), null, null, new d0(this, com.google.android.gms.internal.measurement.z3.x(file.getAbsolutePath()), rVarG, file, str, zF, null), 3);
            }
        } else {
            String absolutePath2 = file.getAbsolutePath();
            absolutePath2.getClass();
            Intent intent2 = new Intent(this, (Class<?>) InstallerActivity.class);
            intent2.putExtra("realPath", absolutePath2);
            intent2.putExtra("requireUserAction", zF);
            intent2.putExtra("backgroundInstallation", false);
            intent2.addFlags(268435456);
            if (str != null && str.length() != 0) {
                intent2.putExtra("newFeatures", str);
            }
            startActivity(intent2);
            String absolutePath3 = file.getAbsolutePath();
            absolutePath3.getClass();
            X(gVarL.H(absolutePath3));
        }
        gVarL.c();
    }

    public final void W(File file, String str) {
        file.getClass();
        boolean z9 = false;
        try {
            SharedPreferences sharedPreferences = getSharedPreferences("CoreSettings", 0);
            if (sharedPreferences.contains("show_installation_details")) {
                z9 = sharedPreferences.getBoolean("show_installation_details", false);
            }
        } catch (Exception unused) {
        }
        if (z9) {
            V(file, str);
            return;
        }
        x4.w2 w2VarH = x4.u2.h(this);
        if (w2VarH == null || !w2VarH.d()) {
            U(file, str);
            return;
        }
        if (!file.isFile()) {
            U(file, str);
            return;
        }
        String strX = com.google.android.gms.internal.measurement.z3.x(file.getAbsolutePath());
        j5.g gVarL = j5.g.D.l(this);
        gVarL.b();
        String name = file.getName();
        name.getClass();
        x4.r rVarG = gVarL.G(name);
        gVarL.c();
        o7.c0.s(LifecycleOwnerKt.getLifecycleScope(this), null, null, new z(this, strX, rVarG, file, str, (t6.c) null), 3);
    }

    public final void X(x4.r rVar) {
        String str;
        Bundle bundle = new Bundle();
        t6.c cVar = null;
        if ((rVar != null ? rVar.f11356b : null) != null) {
            String str2 = rVar.f11356b;
            str2.getClass();
            b2.t1.i(this, str2, bundle, rVar.A == 1);
            bundle.putString("packagename", rVar.f11356b);
        }
        if (rVar != null) {
            long j = rVar.f11362q;
            if (j > 0) {
                bundle.putString("appId", String.valueOf(j));
            }
        }
        if (rVar != null && (str = rVar.f11356b) != null && rVar.f11370z > 0) {
            bundle.putString("updateOrigin", a5.e.a(str));
        }
        if (rVar == null || rVar.f11370z <= 0) {
            bundle.putInt("update", 0);
        } else {
            bundle.putInt("update", 1);
        }
        bundle.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "start");
        android.support.v4.media.g gVar = this.E;
        if (gVar != null) {
            gVar.E(bundle, "install");
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        v7.e eVar = o7.m0.f8289a;
        o7.c0.s(lifecycleScope, v7.d.f10885a, null, new b6.a(this, rVar, cVar, 4), 2);
    }

    public final void applyWindowInsets(View view) {
        view.getClass();
        ViewCompat.setOnApplyWindowInsetsListener(view, new c2.a(8));
    }

    public void b0(x4.d0 d0Var) {
        d0Var.getClass();
    }

    public void c0(x4.i0 i0Var) {
        i0Var.getClass();
    }

    public void d0(x4.u0 u0Var) {
        u0Var.getClass();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (motionEvent == null || motionEvent.getSource() != 8194) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        return true;
    }

    public final void hideKeyboardOnScroll(final View view) {
        view.getClass();
        view.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: c4.n
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view2, int i, int i6, int i10, int i11) {
                if (i6 > i11) {
                    Object systemService = this.f1885a.getSystemService("input_method");
                    systemService.getClass();
                    ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
                }
            }
        });
    }

    public void i0(long j) {
        if (T()) {
            if (j <= 0) {
                k0();
                return;
            }
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            v7.e eVar = o7.m0.f8289a;
            o7.c0.s(lifecycleScope, t7.n.f10349a, null, new x(this, j, null, 1), 2);
        }
    }

    public void j0(long j, String str) {
        if (T()) {
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            v7.e eVar = o7.m0.f8289a;
            o7.c0.s(lifecycleScope, t7.n.f10349a, null, new j0(this, j, str, (t6.c) null, 0), 2);
        }
    }

    public final void k0() {
        if (isFinishing() || (f4.c.f4876o instanceof MyDownloads)) {
            return;
        }
        Intent intent = new Intent(this, (Class<?>) MyDownloads.class);
        float f = UptodownApp.I;
        startActivity(intent, b4.d.a(this));
    }

    public final void l0(String str) {
        if (str == null || isFinishing()) {
            return;
        }
        String strW = androidx.lifecycle.l.w("https://www.virustotal.com/gui/file/", str, "/detection");
        String string = getString(R.string.virustotal_safety_report_title);
        string.getClass();
        j5.c.e(this, strW, string);
    }

    public final void m0(LinearLayout linearLayout, ArrayList arrayList) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins((int) getResources().getDimension(R.dimen.margin_s), (int) getResources().getDimension(R.dimen.margin_m), 0, 0);
        List listSubList = arrayList.subList(0, Math.min(3, arrayList.size()));
        listSubList.getClass();
        for (Object obj : listSubList) {
            obj.getClass();
            x4.g1 g1Var = (x4.g1) obj;
            t4.t0 t0VarA = t4.t0.a(getLayoutInflater());
            TextView textView = t0VarA.f10127l;
            TextView textView2 = t0VarA.f10128m;
            View view = t0VarA.f10126b;
            TextView textView3 = t0VarA.f10129n;
            view.setLayoutParams(layoutParams);
            textView2.setTypeface(f4.c.f4883w);
            textView2.setText(g1Var.f11201b);
            textView.setTypeface(f4.c.f4884x);
            textView.setText(g1Var.f11200a);
            textView3.setTypeface(f4.c.f4883w);
            if (g1Var.f11202l == 1) {
                textView3.setText(getString(R.string.pup));
            } else if (g1Var.f11203m == 1) {
                textView3.setText(getString(R.string.adware));
            } else {
                t0VarA.f10130o.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_circular_red));
                textView3.setText(getString(R.string.malware));
                textView3.setTextColor(ContextCompat.getColor(this, R.color.white));
                textView3.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_bg_accent_red));
            }
            linearLayout.addView(view);
        }
    }

    public final void o0(int i, String str) {
        if (!com.google.android.gms.internal.measurement.z3.f2928c) {
            String string = getString(R.string.error_no_connection);
            string.getClass();
            A(string);
            return;
        }
        float f = UptodownApp.I;
        if (!b4.d.p(this, "downloadApkWorker")) {
            WorkManager.Companion.getInstance(this).enqueue(((OneTimeWorkRequest.Builder) androidx.lifecycle.l.t(DownloadApkWorker.class, "downloadApkWorker")).setInputData(new Data.Builder().putInt("downloadId", i).build()).build());
        } else {
            if (str == null || str.length() == 0) {
                return;
            }
            String string2 = getString(R.string.msg_added_to_downlads_queue);
            string2.getClass();
            A(String.format(string2, Arrays.copyOf(new Object[]{str}, 1)));
        }
    }

    @Override // g4.h, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = new android.support.v4.media.g(this, 20);
        t6.c cVar = null;
        r7.k0.n(new r7.o(a5.d.f202b, new h0(this, cVar, 1)), LifecycleOwnerKt.getLifecycleScope(this));
        r7.k0.n(new r7.o(a5.d.f204d, new h0(this, cVar, 2)), LifecycleOwnerKt.getLifecycleScope(this));
        o7.c0.s(LifecycleOwnerKt.getLifecycleScope(this), null, null, new i0(this, null), 3);
    }

    @Override // g4.s0, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        v7.e eVar = o7.m0.f8289a;
        o7.c0.s(lifecycleScope, v7.d.f10885a, null, new b0(this, null), 2);
        n0();
    }

    public void q0(File file) {
        file.getClass();
    }

    public boolean s0() {
        return !(this instanceof MyApps);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        View viewFindViewById = findViewById(android.R.id.content);
        if (viewFindViewById != null) {
            applyWindowInsets(viewFindViewById);
        }
    }

    public final void showKeyboard(View view) {
        view.getClass();
        Object systemService = getSystemService("input_method");
        systemService.getClass();
        ((InputMethodManager) systemService).showSoftInput(view.findFocus(), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t0(x4.g r19, d7.a r20) {
        /*
            Method dump skipped, instruction units count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.k0.t0(x4.g, d7.a):void");
    }

    public final void u0() {
        AlertDialog alertDialog = this.F;
        alertDialog.getClass();
        Window window = alertDialog.getWindow();
        if (window != null) {
            a4.x.y(window, 0);
        }
        AlertDialog alertDialog2 = this.F;
        alertDialog2.getClass();
        alertDialog2.show();
    }

    public void v0(long j) {
        String string = getString(R.string.core_kill_this_app, getString(R.string.app_name));
        string.getClass();
        N(string);
    }

    public final void w0() {
        if (T()) {
            CustomTabsIntent customTabsIntentBuild = new CustomTabsIntent.Builder().build();
            customTabsIntentBuild.getClass();
            String strH = d0.b.H(this);
            if (l7.m.q0(strH, ".uptodown.com/", false)) {
                strH = (l7.m.q0(strH, "?", false) ? strH.concat("&") : strH.concat("?")).concat("userAgent=uptodownandroid");
            }
            customTabsIntentBuild.intent.setData(Uri.parse(strH));
            try {
                ActivityResultLauncher activityResultLauncher = this.K;
                activityResultLauncher.getClass();
                Intent intent = customTabsIntentBuild.intent;
                float f = UptodownApp.I;
                activityResultLauncher.launch(intent, b4.d.b(this));
            } catch (Exception unused) {
                Intent intent2 = new Intent(this, (Class<?>) CustomWebView.class);
                if (getTitle() != null) {
                    intent2.putExtra("title", getTitle());
                }
                intent2.putExtra("url", strH);
                float f10 = UptodownApp.I;
                startActivity(intent2, b4.d.a(this));
            }
        }
    }

    public void x0(x4.g gVar) {
        gVar.getClass();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        view.getClass();
        super.setContentView(view);
        applyWindowInsets(view);
    }

    public void g0() {
    }

    public void n0() {
    }

    @Override // g4.h
    public final void p() {
    }

    @Override // g4.h
    public final void q() {
    }

    @Override // g4.h
    public final void r() {
    }

    @Override // g4.h
    public void s() {
    }

    @Override // g4.h
    public void u() {
    }

    public void Y(String str) {
    }

    public void Z(String str) {
    }

    public void a0(String str) {
    }

    public void e0(String str) {
    }

    public void h0(String str) {
    }

    public void p0(File file) {
    }

    public void r0(File file) {
    }

    public void f0(String str, String str2) {
    }
}
