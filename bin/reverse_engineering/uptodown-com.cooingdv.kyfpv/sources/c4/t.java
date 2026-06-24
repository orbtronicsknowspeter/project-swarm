package c4;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.leanback.widget.Presenter;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.LoginActivity;
import com.uptodown.activities.MoreInfo;
import com.uptodown.activities.PublicListActivity;
import com.uptodown.activities.PublicProfileActivity;
import com.uptodown.activities.RecommendedActivity;
import com.uptodown.activities.UserActivity;
import com.uptodown.activities.UserDeviceDetailsActivity;
import com.uptodown.activities.VirusTotalReport;
import com.uptodown.activities.WishlistActivity;
import com.uptodown.activities.preferences.AdvancedPreferencesActivity;
import com.uptodown.activities.preferences.PreferencesActivity;
import com.uptodown.core.activities.InstallerActivity;
import com.uptodown.tv.ui.fragment.TvMyAppsFragment;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2102b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f2103l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f2104m;

    public /* synthetic */ t(e2.d dVar, k0 k0Var, j5.k kVar) {
        this.f2101a = 17;
        this.f2104m = dVar;
        this.f2102b = k0Var;
        this.f2103l = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v11, types: [android.app.Activity, android.content.Context, com.uptodown.core.activities.InstallerActivity] */
    /* JADX WARN: Type inference failed for: r9v0, types: [t6.c] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f2101a;
        int i6 = 5;
        int i10 = 0;
        Object obj = this.f2103l;
        Object obj2 = this.f2104m;
        Object obj3 = this.f2102b;
        switch (i) {
            case 0:
                k0 k0Var = (k0) obj3;
                Intent intent = new Intent(k0Var, (Class<?>) VirusTotalReport.class);
                intent.putExtra("appInfo", (x4.g) obj2);
                intent.putExtra("appReportVT", (x4.f2) obj);
                float f = UptodownApp.I;
                k0Var.startActivity(intent, b4.d.a(k0Var));
                break;
            case 1:
                k0 k0Var2 = (k0) obj3;
                LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(k0Var2);
                v7.e eVar = o7.m0.f8289a;
                o7.c0.s(lifecycleScope, t7.n.f10349a, null, new y(k0Var2, (Long) obj2, (x4.f2) obj, null, 0), 2);
                break;
            case 2:
                TextView textView = (TextView) obj2;
                View view2 = (View) obj;
                int i11 = MoreInfo.V;
                view2.setVisibility(8);
                int maxLines = textView.getMaxLines();
                int i12 = ((MoreInfo) obj3).U;
                if (maxLines == i12) {
                    textView.setMaxLines(Integer.MAX_VALUE);
                } else {
                    textView.setMaxLines(i12);
                }
                view2.setVisibility(0);
                break;
            case 3:
                w4 w4Var = (w4) obj3;
                x4.e eVar2 = (x4.e) obj2;
                x4.q2 q2Var = (x4.q2) obj;
                float f10 = UptodownApp.I;
                if (b4.d.t()) {
                    AlertDialog alertDialog = w4Var.F;
                    alertDialog.getClass();
                    alertDialog.dismiss();
                    w4Var.U = false;
                    AlertDialog.Builder builder = new AlertDialog.Builder(w4Var);
                    View viewInflate = w4Var.getLayoutInflater().inflate(R.layout.version_details_dialog, (ViewGroup) null, false);
                    int i13 = R.id.tv_app_name_vd;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_app_name_vd);
                    if (textView2 != null) {
                        i13 = R.id.tv_filename_vd;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_filename_vd);
                        if (textView3 != null) {
                            i13 = R.id.tv_installed_version_vd;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_installed_version_vd);
                            if (textView4 != null) {
                                i13 = R.id.tv_label_app_name_vd;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_label_app_name_vd);
                                if (textView5 != null) {
                                    i13 = R.id.tv_label_filename_vd;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_label_filename_vd);
                                    if (textView6 != null) {
                                        i13 = R.id.tv_label_installed_version_vd;
                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_label_installed_version_vd);
                                        if (textView7 != null) {
                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_label_packagename_vd);
                                            if (textView8 != null) {
                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_label_size_vd);
                                                if (textView9 != null) {
                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_label_update_version_vd);
                                                    if (textView10 != null) {
                                                        TextView textView11 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_packagename_vd);
                                                        if (textView11 != null) {
                                                            TextView textView12 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_size_vd);
                                                            if (textView12 != null) {
                                                                TextView textView13 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_title_vd);
                                                                if (textView13 != null) {
                                                                    TextView textView14 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_update_version_vd);
                                                                    if (textView14 != null) {
                                                                        TextView textView15 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_version_details_accept);
                                                                        if (textView15 != null) {
                                                                            LinearLayout linearLayout = (LinearLayout) viewInflate;
                                                                            j5.g gVarL = j5.g.D.l(w4Var);
                                                                            gVarL.b();
                                                                            x4.r rVar = q2Var.f11353s;
                                                                            long jK = rVar != null ? rVar.k() : 0L;
                                                                            gVarL.c();
                                                                            textView13.setTypeface(f4.c.f4883w);
                                                                            textView5.setTypeface(f4.c.f4884x);
                                                                            textView2.setTypeface(f4.c.f4883w);
                                                                            textView2.setText(eVar2.f11123b);
                                                                            textView7.setTypeface(f4.c.f4884x);
                                                                            textView4.setTypeface(f4.c.f4883w);
                                                                            textView4.setText(String.format("%s(%s)", Arrays.copyOf(new Object[]{eVar2.f11126n, Long.valueOf(eVar2.f11125m)}, 2)));
                                                                            textView10.setTypeface(f4.c.f4884x);
                                                                            textView14.setTypeface(f4.c.f4883w);
                                                                            textView14.setText(String.format("%s(%s)", Arrays.copyOf(new Object[]{q2Var.f11347m, Long.valueOf(q2Var.f11346l)}, 2)));
                                                                            textView8.setTypeface(f4.c.f4884x);
                                                                            textView11.setTypeface(f4.c.f4883w);
                                                                            textView11.setText(eVar2.f11124l);
                                                                            textView9.setTypeface(f4.c.f4884x);
                                                                            textView12.setTypeface(f4.c.f4883w);
                                                                            textView12.setText(com.google.android.gms.internal.measurement.i5.H(w4Var, jK));
                                                                            textView6.setTypeface(f4.c.f4884x);
                                                                            textView3.setTypeface(f4.c.f4883w);
                                                                            textView3.setText(w4Var.getString(R.string.version_details_filename_not_found, eVar2.f11123b));
                                                                            textView15.setTypeface(f4.c.f4883w);
                                                                            textView15.setOnClickListener(new q4(w4Var, 2));
                                                                            builder.setView(linearLayout);
                                                                            w4Var.F = builder.create();
                                                                            if (!w4Var.isFinishing()) {
                                                                                AlertDialog alertDialog2 = w4Var.F;
                                                                                alertDialog2.getClass();
                                                                                Window window = alertDialog2.getWindow();
                                                                                if (window != null) {
                                                                                    a4.x.y(window, 0);
                                                                                }
                                                                                AlertDialog alertDialog3 = w4Var.F;
                                                                                alertDialog3.getClass();
                                                                                alertDialog3.show();
                                                                            }
                                                                        } else {
                                                                            i13 = R.id.tv_version_details_accept;
                                                                        }
                                                                    } else {
                                                                        i13 = R.id.tv_update_version_vd;
                                                                    }
                                                                } else {
                                                                    i13 = R.id.tv_title_vd;
                                                                }
                                                            } else {
                                                                i13 = R.id.tv_size_vd;
                                                            }
                                                        } else {
                                                            i13 = R.id.tv_packagename_vd;
                                                        }
                                                    } else {
                                                        i13 = R.id.tv_label_update_version_vd;
                                                    }
                                                } else {
                                                    i13 = R.id.tv_label_size_vd;
                                                }
                                            } else {
                                                i13 = R.id.tv_label_packagename_vd;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i13)));
                }
                break;
            case 4:
                w4 w4Var2 = (w4) obj3;
                x4.q2 q2Var2 = (x4.q2) obj2;
                j5.g gVar = (j5.g) obj;
                float f11 = UptodownApp.I;
                if (b4.d.t()) {
                    AlertDialog alertDialog4 = w4Var2.F;
                    alertDialog4.getClass();
                    alertDialog4.dismiss();
                    w4Var2.U = false;
                    if (q2Var2.c()) {
                        q2Var2.f11349o = 0;
                    } else {
                        q2Var2.f11349o = 1;
                        x4.r rVar2 = q2Var2.f11353s;
                        if (rVar2 != null) {
                            rVar2.t(w4Var2);
                        }
                    }
                    gVar.b();
                    gVar.p0(q2Var2);
                    gVar.c();
                    w4Var2.K0();
                    b4.d.F(w4Var2);
                }
                break;
            case 5:
                d7.a aVar = (d7.a) obj;
                ((kotlin.jvm.internal.u) obj3).f7022a = true;
                AlertDialog alertDialog5 = ((w4) obj2).F;
                if (alertDialog5 != null) {
                    alertDialog5.dismiss();
                }
                aVar.invoke();
                break;
            case 6:
                PublicProfileActivity publicProfileActivity = (PublicProfileActivity) obj3;
                kotlin.jvm.internal.x xVar = (kotlin.jvm.internal.x) obj2;
                x4.w2 w2Var = (x4.w2) obj;
                if (publicProfileActivity.T()) {
                    Object obj4 = xVar.f7025a;
                    obj4.getClass();
                    if (!kotlin.jvm.internal.l.a(((x4.w2) obj4).f11432a, w2Var != null ? w2Var.f11432a : 0)) {
                        Intent intent2 = new Intent(publicProfileActivity, (Class<?>) PublicListActivity.class);
                        intent2.putExtra("user", (Parcelable) xVar.f7025a);
                        float f12 = UptodownApp.I;
                        publicProfileActivity.startActivity(intent2, b4.d.a(publicProfileActivity));
                    } else {
                        Intent intent3 = new Intent(publicProfileActivity, (Class<?>) RecommendedActivity.class);
                        float f13 = UptodownApp.I;
                        publicProfileActivity.startActivity(intent3, b4.d.a(publicProfileActivity));
                    }
                }
                break;
            case 7:
                UserActivity userActivity = (UserActivity) obj3;
                int i14 = UserActivity.W;
                userActivity.y0((Context) obj2);
                userActivity.setResult(-1);
                Object obj5 = ((kotlin.jvm.internal.x) obj).f7025a;
                obj5.getClass();
                ((AlertDialog) obj5).dismiss();
                break;
            case 8:
                UserDeviceDetailsActivity userDeviceDetailsActivity = (UserDeviceDetailsActivity) obj3;
                int i15 = UserDeviceDetailsActivity.T;
                nc ncVarZ0 = userDeviceDetailsActivity.z0();
                long j = ((x4.z2) obj2).f11482a;
                String string = ((EditText) ((m8.q) obj).f7782l).getText().toString();
                ncVarZ0.getClass();
                string.getClass();
                o7.a0 viewModelScope = ViewModelKt.getViewModelScope(ncVarZ0);
                v7.e eVar3 = o7.m0.f8289a;
                o7.c0.s(viewModelScope, v7.d.f10885a, null, new mc(userDeviceDetailsActivity, j, string, ncVarZ0, (t6.c) null), 2);
                userDeviceDetailsActivity.Q();
                break;
            case 9:
                kotlin.jvm.internal.v vVar = (kotlin.jvm.internal.v) obj3;
                AdvancedPreferencesActivity advancedPreferencesActivity = (AdvancedPreferencesActivity) obj2;
                t4.h0 h0Var = (t4.h0) obj;
                int i16 = AdvancedPreferencesActivity.Q;
                if (vVar.f7023a == 4) {
                    String string2 = Settings.Secure.getString(advancedPreferencesActivity.getContentResolver(), "android_id");
                    TextView textView16 = h0Var.f9844m;
                    textView16.setText(((Object) textView16.getText()) + " id:" + string2);
                    h0Var.f9842b.setOnLongClickListener(new d4.d(i10, advancedPreferencesActivity, string2));
                }
                int i17 = vVar.f7023a;
                if (i17 < 5) {
                    vVar.f7023a = i17 + 1;
                }
                break;
            case 10:
                kotlin.jvm.internal.v vVar2 = (kotlin.jvm.internal.v) obj3;
                g4.u uVar = (g4.u) obj2;
                PreferencesActivity preferencesActivity = (PreferencesActivity) obj;
                int i18 = PreferencesActivity.T;
                if (vVar2.f7023a <= -1) {
                    Editable text = uVar.f5268l.getText();
                    text.getClass();
                    if (text.length() <= 0) {
                    }
                }
                String string3 = preferencesActivity.getString(R.string.age_verification_setting_confirmation_msg);
                string3.getClass();
                preferencesActivity.H(string3, new androidx.room.c(preferencesActivity, vVar2, uVar, i6));
                break;
            case 11:
                int i19 = PreferencesActivity.T;
                ((d7.l) obj3).invoke(Integer.valueOf(((kotlin.jvm.internal.v) obj2).f7023a));
                ((PreferencesActivity) obj).Q();
                break;
            case 12:
                ?? r12 = (InstallerActivity) obj3;
                CheckBox checkBox = (CheckBox) obj2;
                ArrayList arrayList = (ArrayList) obj;
                r12.Z = true;
                AlertDialog alertDialog6 = r12.V;
                if (alertDialog6 != null) {
                    alertDialog6.dismiss();
                }
                if (checkBox.isChecked()) {
                    try {
                        SharedPreferences.Editor editorEdit = r12.getSharedPreferences("CoreSettings", 0).edit();
                        editorEdit.putBoolean("warn_installed", false);
                        editorEdit.apply();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
                r12.H(r12, arrayList);
                break;
            case 13:
                TvMyAppsFragment tvMyAppsFragment = (TvMyAppsFragment) obj3;
                long j6 = ((x4.e) obj2).F;
                LifecycleCoroutineScope lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(tvMyAppsFragment);
                v7.e eVar4 = o7.m0.f8289a;
                o7.c0.s(lifecycleScope2, t7.n.f10349a, null, new g5.z(tvMyAppsFragment, j6, (Presenter.ViewHolder) obj, null), 2);
                AlertDialog alertDialog7 = tvMyAppsFragment.f3434l;
                if (alertDialog7 != null) {
                    alertDialog7.dismiss();
                }
                break;
            case 14:
                Context context = (Context) obj3;
                View view3 = (View) obj;
                AlertDialog.Builder builder2 = new AlertDialog.Builder(context);
                View viewInflate2 = LayoutInflater.from(context).inflate(R.layout.dialog_changelog, (ViewGroup) null);
                ((TextView) viewInflate2.findViewById(R.id.tv_title_cd)).setTypeface(f4.c.f4884x);
                TextView textView17 = (TextView) viewInflate2.findViewById(R.id.tv_changelog_cd);
                textView17.setTypeface(f4.c.f4884x);
                TextView textView18 = (TextView) viewInflate2.findViewById(R.id.tv_accept_cd);
                textView18.setTypeface(f4.c.f4883w);
                textView17.setText((String) obj2);
                AlertDialog alertDialogCreate = builder2.setView(viewInflate2).create();
                Window window2 = alertDialogCreate.getWindow();
                if (window2 != null) {
                    window2.setBackgroundDrawableResource(android.R.color.transparent);
                }
                textView18.setOnClickListener(new d(alertDialogCreate, 22));
                alertDialogCreate.show();
                ViewParent parent = view3.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(view3);
                }
                break;
            case 15:
                x4.a3 a3Var = (x4.a3) obj2;
                x4.j jVar = (x4.j) obj;
                f0.i iVar = ((m5.y1) obj3).f7645m;
                if (iVar != null) {
                    long j10 = a3Var.f11047a;
                    switch (iVar.f4811a) {
                        case 11:
                            float f14 = UptodownApp.I;
                            if (b4.d.t()) {
                                PublicListActivity publicListActivity = (PublicListActivity) iVar.f4812b;
                                LifecycleCoroutineScope lifecycleScope3 = LifecycleOwnerKt.getLifecycleScope(publicListActivity);
                                v7.e eVar5 = o7.m0.f8289a;
                                o7.c0.s(lifecycleScope3, t7.n.f10349a, null, new j0(publicListActivity, j10, jVar, (t6.c) null, 1), 2);
                            }
                            break;
                        case 12:
                            float f15 = UptodownApp.I;
                            if (b4.d.t()) {
                                RecommendedActivity recommendedActivity = (RecommendedActivity) iVar.f4812b;
                                LifecycleCoroutineScope lifecycleScope4 = LifecycleOwnerKt.getLifecycleScope(recommendedActivity);
                                v7.e eVar6 = o7.m0.f8289a;
                                o7.c0.s(lifecycleScope4, t7.n.f10349a, null, new j0(recommendedActivity, j10, jVar, (t6.c) null, 3), 2);
                            }
                            break;
                        default:
                            float f16 = UptodownApp.I;
                            if (b4.d.t()) {
                                WishlistActivity wishlistActivity = (WishlistActivity) iVar.f4812b;
                                LifecycleCoroutineScope lifecycleScope5 = LifecycleOwnerKt.getLifecycleScope(wishlistActivity);
                                v7.e eVar7 = o7.m0.f8289a;
                                o7.c0.s(lifecycleScope5, t7.n.f10349a, null, new j0(wishlistActivity, j10, jVar, (t6.c) null, 7), 2);
                            }
                            break;
                    }
                }
                break;
            case 16:
                k0 k0Var3 = (k0) obj3;
                LifecycleCoroutineScope lifecycleCoroutineScope = (LifecycleCoroutineScope) obj2;
                n5.d dVar = (n5.d) obj;
                float f17 = UptodownApp.I;
                if (b4.d.t() && k0Var3.T()) {
                    if (x4.u2.h(k0Var3) != null) {
                        o7.c0.s(lifecycleCoroutineScope, null, null, new ya(dVar, k0Var3, (t6.c) , 23), 3);
                        new Handler(Looper.getMainLooper()).postDelayed(new androidx.browser.trusted.c(19, dVar, k0Var3), 1000L);
                    } else {
                        k0Var3.startActivity(new Intent(k0Var3, (Class<?>) LoginActivity.class), b4.d.a(k0Var3));
                    }
                    break;
                }
                break;
            case 17:
                k0 k0Var4 = (k0) obj3;
                j5.k kVar = (j5.k) obj;
                if (((CheckBox) ((e2.d) obj2).f4468l).isChecked()) {
                    SharedPreferences sharedPreferences = k0Var4.getSharedPreferences("SettingsPreferences", 0);
                    sharedPreferences.getClass();
                    SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                    editorEdit2.putBoolean("warning_no_wifi", false);
                    editorEdit2.apply();
                }
                AlertDialog alertDialog8 = k0Var4.F;
                if (alertDialog8 != null) {
                    alertDialog8.dismiss();
                }
                kVar.invoke();
                break;
            case 18:
                u4.f0 f0Var = (u4.f0) obj3;
                t4.q0 q0Var = (t4.q0) obj2;
                x4.k2 k2Var = (x4.k2) obj;
                float f18 = UptodownApp.I;
                if (b4.d.t()) {
                    FragmentActivity activity = f0Var.getActivity();
                    activity.getClass();
                    if (((k0) activity).T()) {
                        Context context2 = view.getContext();
                        context2.getClass();
                        if (x4.u2.h(context2) != null) {
                            Context contextRequireContext = f0Var.requireContext();
                            contextRequireContext.getClass();
                            new e1.v4(contextRequireContext, 1).h(q0Var.f10067n);
                            if (!j5.t.f6710b.contains(Long.valueOf(k2Var.f11259a))) {
                                f0Var.N(k2Var);
                                q0Var.f10077y.setText(String.valueOf(k2Var.f11268s + 1));
                            }
                        } else if (f0Var.getActivity() != null) {
                            FragmentActivity activity2 = f0Var.getActivity();
                            activity2.getClass();
                            String string4 = f0Var.getString(R.string.login_required_like_title);
                            string4.getClass();
                            String string5 = f0Var.getString(R.string.login_required_like_msg);
                            string5.getClass();
                            b2.t1.v((k0) activity2, string4, string5);
                        }
                    }
                }
                break;
            case 19:
                u4.f0 f0Var2 = (u4.f0) obj3;
                t4.p0 p0Var = (t4.p0) obj2;
                x4.k2 k2Var2 = (x4.k2) obj;
                float f19 = UptodownApp.I;
                if (b4.d.t()) {
                    FragmentActivity activity3 = f0Var2.getActivity();
                    activity3.getClass();
                    if (((k0) activity3).T()) {
                        Context context3 = view.getContext();
                        context3.getClass();
                        if (x4.u2.h(context3) != null) {
                            Context contextRequireContext2 = f0Var2.requireContext();
                            contextRequireContext2.getClass();
                            new e1.v4(contextRequireContext2, 1).h(p0Var.f10048n);
                            if (!j5.t.f6710b.contains(Long.valueOf(k2Var2.f11259a))) {
                                f0Var2.N(k2Var2);
                                p0Var.f10057x.setText(String.valueOf(k2Var2.f11268s + 1));
                            }
                        } else if (f0Var2.getActivity() != null) {
                            FragmentActivity activity4 = f0Var2.getActivity();
                            activity4.getClass();
                            String string6 = f0Var2.getString(R.string.login_required_like_title);
                            string6.getClass();
                            String string7 = f0Var2.getString(R.string.login_required_like_msg);
                            string7.getClass();
                            b2.t1.v((k0) activity4, string6, string7);
                        }
                    }
                }
                break;
            case 20:
                u4.f0 f0Var3 = (u4.f0) obj3;
                e2.d dVar2 = (e2.d) obj2;
                Drawable drawable = (Drawable) obj;
                float f20 = UptodownApp.I;
                if (b4.d.t()) {
                    r7.o0 o0Var = f0Var3.G().S;
                    o0Var.getClass();
                    o0Var.g(null, 5);
                    ((ImageView) dVar2.f4469m).setImageDrawable(drawable);
                    ((ImageView) dVar2.f4470n).setImageDrawable(drawable);
                    ((ImageView) dVar2.f4471o).setImageDrawable(drawable);
                    ((ImageView) dVar2.f4472p).setImageDrawable(drawable);
                    ((ImageView) dVar2.f4473q).setImageDrawable(drawable);
                }
                break;
            default:
                u4.f0 f0Var4 = (u4.f0) obj3;
                Context context4 = (Context) obj2;
                e2.d dVar3 = (e2.d) obj;
                float f21 = UptodownApp.I;
                if (b4.d.t()) {
                    FragmentActivity activity5 = f0Var4.getActivity();
                    activity5.getClass();
                    if (((k0) activity5).T()) {
                        x4.w2 w2VarH = x4.u2.h(context4);
                        r7.o0 o0Var2 = f0Var4.G().H;
                        Editable text2 = ((EditText) dVar3.f4468l).getText();
                        text2.getClass();
                        o0Var2.f(l7.m.K0(text2).toString());
                        if ((w2VarH != null ? w2VarH.f11432a : null) != null) {
                            String str = w2VarH.f11432a;
                            str.getClass();
                            if (str.length() > 0) {
                                f0Var4.Z((String) f0Var4.G().H.getValue());
                                FragmentActivity activity6 = f0Var4.getActivity();
                                activity6.getClass();
                                AlertDialog alertDialog9 = ((k0) activity6).F;
                                if (alertDialog9 != null) {
                                    alertDialog9.dismiss();
                                }
                            }
                        }
                        f0Var4.R();
                    }
                }
                break;
        }
    }

    public /* synthetic */ t(w4 w4Var, x4.q2 q2Var, j5.g gVar, int i) {
        this.f2101a = 4;
        this.f2102b = w4Var;
        this.f2104m = q2Var;
        this.f2103l = gVar;
    }

    public /* synthetic */ t(Object obj, Object obj2, Object obj3, int i) {
        this.f2101a = i;
        this.f2102b = obj;
        this.f2104m = obj2;
        this.f2103l = obj3;
    }
}
