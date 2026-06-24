package f0;

import a4.x;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.viewbinding.ViewBindings;
import b.n;
import c3.d1;
import c3.p0;
import c4.da;
import c4.f9;
import c4.g9;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.measurement.h1;
import com.google.android.gms.internal.measurement.i5;
import com.google.android.gms.internal.measurement.k1;
import com.google.android.gms.internal.measurement.x0;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.PublicListActivity;
import com.uptodown.activities.RecommendedActivity;
import com.uptodown.activities.RepliesActivity;
import com.uptodown.activities.ReviewsActivity;
import com.uptodown.activities.SecurityActivity;
import com.uptodown.activities.UserDeviceDetailsActivity;
import com.uptodown.activities.WishlistActivity;
import com.uptodown.core.activities.InstallerActivity;
import e1.b2;
import e1.i2;
import e1.m1;
import e1.t1;
import e1.u0;
import e1.u4;
import e1.w0;
import e1.z4;
import e4.c1;
import e4.e1;
import e4.i0;
import e4.n0;
import j$.util.concurrent.ConcurrentHashMap;
import j5.t;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import l7.u;
import o7.a0;
import o7.c0;
import o7.m0;
import org.json.JSONException;
import org.json.JSONObject;
import w4.m;
import x4.a3;
import x4.k2;
import x4.u2;
import x4.y2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements e3.b, m, w4.b, z4, k4.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static i f4810l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4812b;

    public i(Context context) {
        String strD;
        this.f4811a = 0;
        b bVarA = b.a(context);
        this.f4812b = bVarA;
        bVarA.b();
        String strD2 = bVarA.d("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strD2) || (strD = bVarA.d(b.f("googleSignInOptions", strD2))) == null) {
            return;
        }
        try {
            GoogleSignInOptions.c(strD);
        } catch (JSONException unused) {
        }
    }

    public static i f(Object obj) {
        if (obj != null) {
            return new i(obj, 24);
        }
        com.google.gson.internal.a.i("instance cannot be null");
        return null;
    }

    public static synchronized i o(Context context) {
        return s(context.getApplicationContext());
    }

    public static synchronized i s(Context context) {
        i iVar = f4810l;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(context);
        f4810l = iVar2;
        return iVar2;
    }

    public void A(i2 i2Var, e1.h hVar) {
        ((EnumMap) this.f4812b).put(i2Var, hVar);
    }

    @Override // e1.z4
    public void a(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        u4 u4Var = (u4) this.f4812b;
        if (!zIsEmpty) {
            u4Var.b().p(new b2(this, str, str2, bundle));
            return;
        }
        t1 t1Var = u4Var.f4317u;
        if (t1Var != null) {
            w0 w0Var = t1Var.f4265o;
            t1.m(w0Var);
            w0Var.f4340o.c(str2, "AppId not known when logging event");
        }
    }

    @Override // w4.b
    public void b(int i) {
        e1 e1Var;
        e1 e1Var2;
        e1 e1Var3;
        int i6 = this.f4811a;
        int i10 = 2;
        t6.c cVar = null;
        int i11 = 1;
        Object obj = this.f4812b;
        switch (i6) {
            case 11:
                PublicListActivity publicListActivity = (PublicListActivity) obj;
                float f = UptodownApp.I;
                if (b4.d.t() && (e1Var = publicListActivity.f3337c0) != null && !e1Var.f4520a.isEmpty()) {
                    e1 e1Var4 = publicListActivity.f3337c0;
                    e1Var4.getClass();
                    Object obj2 = e1Var4.f4520a.get(i);
                    obj2.getClass();
                    a3 a3Var = (a3) obj2;
                    publicListActivity.j0(a3Var.f11047a, a3Var.i);
                    break;
                }
                break;
            case 12:
                RecommendedActivity recommendedActivity = (RecommendedActivity) obj;
                float f10 = UptodownApp.I;
                if (b4.d.t() && (e1Var2 = recommendedActivity.f3341c0) != null && !e1Var2.f4520a.isEmpty()) {
                    e1 e1Var5 = recommendedActivity.f3341c0;
                    e1Var5.getClass();
                    Object obj3 = e1Var5.f4520a.get(i);
                    obj3.getClass();
                    a3 a3Var2 = (a3) obj3;
                    recommendedActivity.j0(a3Var2.f11047a, a3Var2.i);
                    break;
                }
                break;
            case 13:
            case 15:
            default:
                WishlistActivity wishlistActivity = (WishlistActivity) obj;
                float f11 = UptodownApp.I;
                if (b4.d.t() && (e1Var3 = wishlistActivity.f3370c0) != null && !e1Var3.f4520a.isEmpty()) {
                    e1 e1Var6 = wishlistActivity.f3370c0;
                    e1Var6.getClass();
                    Object obj4 = e1Var6.f4520a.get(i);
                    obj4.getClass();
                    a3 a3Var3 = (a3) obj4;
                    wishlistActivity.j0(a3Var3.f11047a, a3Var3.i);
                    break;
                }
                break;
            case 14:
                SecurityActivity securityActivity = (SecurityActivity) obj;
                float f12 = UptodownApp.I;
                if (b4.d.t()) {
                    int i12 = SecurityActivity.f3350g0;
                    n0 n0Var = securityActivity.f3352c0;
                    n0Var.getClass();
                    if (n0Var.a().get(i) instanceof x4.e) {
                        n0 n0Var2 = securityActivity.f3352c0;
                        n0Var2.getClass();
                        Object obj5 = n0Var2.a().get(i);
                        obj5.getClass();
                        x4.e eVar = (x4.e) obj5;
                        if (!securityActivity.isFinishing()) {
                            int i13 = 0;
                            View viewInflate = securityActivity.getLayoutInflater().inflate(R.layout.dialog_positive_selected, (ViewGroup) null, false);
                            int i14 = R.id.iv_icon;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.iv_icon);
                            if (imageView != null) {
                                i14 = R.id.rl_header;
                                if (((RelativeLayout) ViewBindings.findChildViewById(viewInflate, R.id.rl_header)) != null) {
                                    i14 = R.id.tv_app_name;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_app_name);
                                    if (textView != null) {
                                        i14 = R.id.tv_open_app_details_positive;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_open_app_details_positive);
                                        if (textView2 != null) {
                                            i14 = R.id.tv_rollback_positive;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_rollback_positive);
                                            if (textView3 != null) {
                                                i14 = R.id.tv_uninstall_positive;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_uninstall_positive);
                                                if (textView4 != null) {
                                                    i14 = R.id.tv_virus_report_positive;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_virus_report_positive);
                                                    if (textView5 != null) {
                                                        i14 = R.id.v_outside_header;
                                                        if (ViewBindings.findChildViewById(viewInflate, R.id.v_outside_header) != null) {
                                                            securityActivity.F = new AlertDialog.Builder(securityActivity).setView((RelativeLayout) viewInflate).create();
                                                            textView.setTypeface(f4.c.f4883w);
                                                            textView.setText(eVar.f11123b);
                                                            ConcurrentHashMap concurrentHashMap = t.f6709a;
                                                            imageView.setImageDrawable(t.b(securityActivity, eVar.f11124l));
                                                            if (eVar.f11124l == null || eVar.f11133u == null || eVar.F <= 0) {
                                                                textView2.setVisibility(8);
                                                                textView5.setVisibility(8);
                                                                textView3.setVisibility(8);
                                                            } else {
                                                                textView2.setTypeface(f4.c.f4884x);
                                                                textView2.setOnClickListener(new da(securityActivity, eVar, i13));
                                                                textView5.setTypeface(f4.c.f4884x);
                                                                textView5.setOnClickListener(new da(securityActivity, eVar, i11));
                                                                textView3.setTypeface(f4.c.f4884x);
                                                                textView3.setOnClickListener(new da(securityActivity, eVar, i10));
                                                            }
                                                            if (u.m0(securityActivity.getPackageName(), eVar.f11124l, true)) {
                                                                textView4.setVisibility(8);
                                                            } else {
                                                                textView4.setTypeface(f4.c.f4884x);
                                                                textView4.setOnClickListener(new da(eVar, securityActivity));
                                                            }
                                                            if (!securityActivity.isFinishing()) {
                                                                AlertDialog alertDialog = securityActivity.F;
                                                                alertDialog.getClass();
                                                                Window window = alertDialog.getWindow();
                                                                if (window != null) {
                                                                    x.y(window, 0);
                                                                }
                                                                AlertDialog alertDialog2 = securityActivity.F;
                                                                alertDialog2.getClass();
                                                                alertDialog2.show();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i14)));
                        }
                    }
                }
                break;
            case 16:
                UserDeviceDetailsActivity userDeviceDetailsActivity = (UserDeviceDetailsActivity) obj;
                c1 c1Var = userDeviceDetailsActivity.Q;
                if (c1Var != null) {
                    Object obj6 = c1Var.f4504a.get(i);
                    obj6.getClass();
                    y2 y2Var = (y2) obj6;
                    if (y2Var.f11477e != 1) {
                        String string = userDeviceDetailsActivity.getString(R.string.msg_app_not_found);
                        string.getClass();
                        userDeviceDetailsActivity.A(string);
                    } else {
                        String str = y2Var.f11474b;
                        if (str == null || str.length() == 0) {
                            String string2 = userDeviceDetailsActivity.getString(R.string.msg_app_not_found);
                            string2.getClass();
                            userDeviceDetailsActivity.A(string2);
                        } else {
                            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(userDeviceDetailsActivity);
                            v7.e eVar2 = m0.f8289a;
                            c0.s(lifecycleScope, v7.d.f10885a, null, new b6.g(userDeviceDetailsActivity, y2Var, cVar, 13), 2);
                        }
                    }
                }
                break;
        }
    }

    @Override // k4.c
    public void c(File file, ArrayList arrayList) {
        ((InstallerActivity) this.f4812b).K(file, arrayList);
    }

    @Override // w4.m
    public void d(int i) {
        ReviewsActivity reviewsActivity = (ReviewsActivity) this.f4812b;
        float f = UptodownApp.I;
        if (b4.d.t() && reviewsActivity.T()) {
            if (u2.h(reviewsActivity) == null) {
                String string = reviewsActivity.getString(R.string.login_required_follow_title);
                string.getClass();
                String string2 = reviewsActivity.getString(R.string.login_required_follow_msg);
                string2.getClass();
                b2.t1.v(reviewsActivity, string, string2);
                return;
            }
            i0 i0Var = reviewsActivity.Q;
            t6.c cVar = null;
            k2 k2Var = i0Var != null ? (k2) i0Var.f4561a.get(i) : null;
            if (k2Var != null) {
                g9 g9VarA0 = reviewsActivity.A0();
                int i6 = k2Var.f11272x;
                String strValueOf = String.valueOf(k2Var.f11260b);
                g9VarA0.getClass();
                if (i6 == 1) {
                    a0 viewModelScope = ViewModelKt.getViewModelScope(g9VarA0);
                    v7.e eVar = m0.f8289a;
                    c0.s(viewModelScope, v7.d.f10885a, null, new f9(reviewsActivity, strValueOf, g9VarA0, cVar, 1), 2);
                } else {
                    a0 viewModelScope2 = ViewModelKt.getViewModelScope(g9VarA0);
                    v7.e eVar2 = m0.f8289a;
                    c0.s(viewModelScope2, v7.d.f10885a, null, new f9(reviewsActivity, strValueOf, g9VarA0, cVar, 0), 2);
                }
            }
        }
    }

    @Override // k4.c
    public void e(int i) {
        InstallerActivity installerActivity = (InstallerActivity) this.f4812b;
        installerActivity.runOnUiThread(new androidx.core.content.res.a(installerActivity, i, 2));
    }

    @Override // w4.m
    public void g(int i) {
        ArrayList arrayList;
        ReviewsActivity reviewsActivity = (ReviewsActivity) this.f4812b;
        float f = UptodownApp.I;
        if (b4.d.t() && reviewsActivity.T()) {
            i0 i0Var = reviewsActivity.Q;
            t6.c cVar = null;
            k2 k2Var = (i0Var == null || (arrayList = i0Var.f4561a) == null) ? null : (k2) arrayList.get(i);
            if (k2Var != null) {
                c0.s(LifecycleOwnerKt.getLifecycleScope(reviewsActivity), null, null, new n(reviewsActivity, k2Var, cVar, 27), 3);
            }
        }
    }

    @Override // m6.a
    public Object get() {
        int i = this.f4811a;
        Object obj = this.f4812b;
        switch (i) {
            case 3:
                n1.f fVar = (n1.f) ((i) obj).f4812b;
                fVar.getClass();
                p0 p0Var = p0.f1300a;
                return p0.a(fVar);
            case 4:
                return new c3.w0((d1) ((e3.c) obj).get());
            default:
                return obj;
        }
    }

    @Override // k4.c
    public void i(File file) {
        long length;
        InstallerActivity installerActivity = (InstallerActivity) this.f4812b;
        if (file != null) {
            installerActivity.S = file.getAbsolutePath();
            PackageManager packageManager = installerActivity.getPackageManager();
            packageManager.getClass();
            String str = installerActivity.S;
            str.getClass();
            PackageInfo packageInfoD = n4.i.d(packageManager, str, 128);
            Drawable drawableLoadIcon = null;
            if ((packageInfoD != null ? packageInfoD.applicationInfo : null) != null) {
                if (!installerActivity.f3400f0) {
                    ImageView imageView = installerActivity.O;
                    if (imageView != null) {
                        String absolutePath = file.getAbsolutePath();
                        absolutePath.getClass();
                        PackageManager packageManager2 = installerActivity.getPackageManager();
                        packageManager2.getClass();
                        PackageInfo packageInfoD2 = n4.i.d(packageManager2, absolutePath, 128);
                        if ((packageInfoD2 != null ? packageInfoD2.applicationInfo : null) != null) {
                            ApplicationInfo applicationInfo = packageInfoD2.applicationInfo;
                            applicationInfo.getClass();
                            applicationInfo.sourceDir = absolutePath;
                            ApplicationInfo applicationInfo2 = packageInfoD2.applicationInfo;
                            applicationInfo2.getClass();
                            applicationInfo2.publicSourceDir = absolutePath;
                            ApplicationInfo applicationInfo3 = packageInfoD2.applicationInfo;
                            applicationInfo3.getClass();
                            drawableLoadIcon = applicationInfo3.loadIcon(installerActivity.getPackageManager());
                        }
                        imageView.setImageDrawable(drawableLoadIcon);
                    }
                    installerActivity.f3400f0 = true;
                }
                LinearLayout linearLayout = installerActivity.F;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                ApplicationInfo applicationInfo4 = packageInfoD.applicationInfo;
                applicationInfo4.getClass();
                String str2 = installerActivity.S;
                str2.getClass();
                applicationInfo4.sourceDir = str2;
                applicationInfo4.publicSourceDir = str2;
                String string = packageManager.getApplicationLabel(applicationInfo4).toString();
                long jD = n4.d.d(packageInfoD);
                String str3 = installerActivity.S;
                str3.getClass();
                try {
                    length = new File(str3).length();
                } catch (Exception unused) {
                    length = -1;
                }
                f4.a aVar = f4.a.f4870a;
                String str4 = packageInfoD.packageName;
                str4.getClass();
                aVar.d(jD, length, str4, string);
                if (installerActivity.f3399e0) {
                    return;
                }
                TextView textView = installerActivity.E;
                if (textView != null) {
                    textView.setText(string);
                }
                TextView textView2 = installerActivity.E;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                TextView textView3 = installerActivity.G;
                if (textView3 != null) {
                    textView3.setText(file.getName());
                }
                TextView textView4 = installerActivity.G;
                if (textView4 != null) {
                    textView4.setVisibility(0);
                }
                TextView textView5 = installerActivity.H;
                if (textView5 != null) {
                    textView5.setText(i5.G(length));
                }
                TextView textView6 = installerActivity.H;
                if (textView6 != null) {
                    textView6.setVisibility(0);
                }
                TextView textView7 = installerActivity.I;
                if (textView7 != null) {
                    textView7.setText(packageInfoD.versionName);
                }
                TextView textView8 = installerActivity.I;
                if (textView8 != null) {
                    textView8.setVisibility(0);
                }
            }
        }
    }

    @Override // k4.c
    public void j(File file) {
        InstallerActivity installerActivity = (InstallerActivity) this.f4812b;
        if (installerActivity.R == null) {
            installerActivity.R = new ArrayList();
        }
        ArrayList arrayList = installerActivity.R;
        arrayList.getClass();
        arrayList.add(file);
    }

    public g2.d k(JSONObject jSONObject) throws JSONException {
        e1.c0 c0Var;
        int i = jSONObject.getInt("settings_version");
        if (i != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.", null);
            c0Var = new e1.c0(7);
        } else {
            c0Var = new e1.c0(8);
        }
        q1.a aVar = (q1.a) this.f4812b;
        switch (c0Var.f3843a) {
            case 7:
                return e1.c0.j(aVar);
            default:
                jSONObject.optInt("settings_version", 0);
                int iOptInt = jSONObject.optInt("cache_duration", 3600);
                double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
                double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
                int iOptInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
                g2.c cVar = jSONObject.has("session") ? new g2.c(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new g2.c(new JSONObject().optInt("max_custom_exception_events", 8));
                JSONObject jSONObject2 = jSONObject.getJSONObject("features");
                return new g2.d(jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : System.currentTimeMillis() + (((long) iOptInt) * 1000), cVar, new g2.b(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false)), dOptDouble, dOptDouble2, iOptInt2);
        }
    }

    @Override // k4.c
    public void l() {
        InstallerActivity installerActivity = (InstallerActivity) this.f4812b;
        installerActivity.getWindow().clearFlags(128);
        TextView textView = installerActivity.L;
        if (textView != null) {
            textView.setText(R.string.error_not_enough_space);
        }
    }

    public JSONObject m() throws Throwable {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f4812b;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(y1.g.i(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e10) {
                        e = e10;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        y1.g.b(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    y1.g.b(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            y1.g.b(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            y1.g.b(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    public void n(q1.c cVar) {
        k1 k1Var = (k1) this.f4812b;
        ArrayList arrayList = k1Var.f2681c;
        synchronized (arrayList) {
            for (int i = 0; i < arrayList.size(); i++) {
                try {
                    if (cVar.equals(((Pair) arrayList.get(i)).first)) {
                        Log.w("FA", "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            h1 h1Var = new h1(cVar);
            arrayList.add(new Pair(cVar, h1Var));
            if (k1Var.f != null) {
                try {
                    k1Var.f.registerOnMeasurementEventListener(h1Var);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w("FA", "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            k1Var.a(new x0(k1Var, h1Var, 5));
        }
    }

    @Override // w4.m
    public void p(int i) {
        ArrayList arrayList;
        ReviewsActivity reviewsActivity = (ReviewsActivity) this.f4812b;
        float f = UptodownApp.I;
        if (b4.d.t() && reviewsActivity.T()) {
            if (u2.h(reviewsActivity) == null) {
                String string = reviewsActivity.getString(R.string.login_required_like_title);
                string.getClass();
                String string2 = reviewsActivity.getString(R.string.login_required_like_msg);
                string2.getClass();
                b2.t1.v(reviewsActivity, string, string2);
                return;
            }
            i0 i0Var = reviewsActivity.Q;
            t6.c cVar = null;
            k2 k2Var = (i0Var == null || (arrayList = i0Var.f4561a) == null) ? null : (k2) arrayList.get(i);
            if (!b4.d.t() || k2Var == null) {
                return;
            }
            if (t.f6710b.contains(Long.valueOf(k2Var.f11259a))) {
                return;
            }
            g9 g9VarA0 = reviewsActivity.A0();
            g9VarA0.getClass();
            a0 viewModelScope = ViewModelKt.getViewModelScope(g9VarA0);
            v7.e eVar = m0.f8289a;
            c0.s(viewModelScope, v7.d.f10885a, null, new b6.g(k2Var, reviewsActivity, g9VarA0, cVar, 10), 2);
        }
    }

    @Override // w4.m
    public void q(int i) {
        ArrayList arrayList;
        ReviewsActivity reviewsActivity = (ReviewsActivity) this.f4812b;
        float f = UptodownApp.I;
        if (b4.d.t() && reviewsActivity.T()) {
            i0 i0Var = reviewsActivity.Q;
            k2 k2Var = (i0Var == null || (arrayList = i0Var.f4561a) == null) ? null : (k2) arrayList.get(i);
            Intent intent = new Intent(reviewsActivity, (Class<?>) RepliesActivity.class);
            intent.putExtra("review", k2Var);
            x4.g gVar = (x4.g) reviewsActivity.A0().i.getValue();
            intent.putExtra("appId", gVar != null ? gVar.f11159a : 0L);
            x4.g gVar2 = (x4.g) reviewsActivity.A0().i.getValue();
            intent.putExtra("appIconUrl", gVar2 != null ? gVar2.f11188u : null);
            x4.g gVar3 = (x4.g) reviewsActivity.A0().i.getValue();
            String str = gVar3 != null ? gVar3.f11160b : null;
            if (str != null && str.length() != 0) {
                Object value = reviewsActivity.A0().i.getValue();
                value.getClass();
                intent.putExtra("appName", ((x4.g) value).f11160b);
            }
            reviewsActivity.startActivity(intent, b4.d.a(reviewsActivity));
        }
    }

    public synchronized void r() {
        b bVar = (b) this.f4812b;
        ReentrantLock reentrantLock = bVar.f4800a;
        reentrantLock.lock();
        try {
            bVar.f4801b.edit().clear().apply();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // k4.c
    public void t() {
        f4.a.f4870a.a();
        InstallerActivity installerActivity = (InstallerActivity) this.f4812b;
        installerActivity.getWindow().clearFlags(128);
        TextView textView = installerActivity.f3405z;
        if (textView != null) {
            textView.setText(installerActivity.getString(R.string.core_kill_this_app, installerActivity.getString(R.string.app_name)));
        }
        TextView textView2 = installerActivity.f3405z;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        TextView textView3 = installerActivity.N;
        if (textView3 != null) {
            textView3.setOnClickListener(new g4.a0(installerActivity, 8));
        }
    }

    public String toString() {
        switch (this.f4811a) {
            case 20:
                StringBuilder sb = new StringBuilder("1");
                for (i2 i2Var : i2.values()) {
                    e1.h hVar = (e1.h) ((EnumMap) this.f4812b).get(i2Var);
                    if (hVar == null) {
                        hVar = e1.h.UNSET;
                    }
                    sb.append(hVar.f4014a);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // w4.m
    public void u() {
        float f = UptodownApp.I;
        if (b4.d.t()) {
            ((ReviewsActivity) this.f4812b).w0();
        }
    }

    @Override // k4.c
    public void v() {
        InstallerActivity installerActivity = (InstallerActivity) this.f4812b;
        installerActivity.runOnUiThread(new androidx.core.content.res.a(installerActivity, 0, 2));
    }

    @Override // k4.c
    public void w() {
        TextView textView = ((InstallerActivity) this.f4812b).L;
        if (textView != null) {
            textView.setText(R.string.error_unzipping);
        }
    }

    public void x(int i, String str, List list, boolean z9, boolean z10) {
        u0 u0Var;
        m1 m1Var = (m1) this.f4812b;
        int i6 = i - 1;
        if (i6 == 0) {
            w0 w0Var = m1Var.f3876a.f4265o;
            t1.m(w0Var);
            u0Var = w0Var.v;
        } else if (i6 != 1) {
            if (i6 == 3) {
                w0 w0Var2 = m1Var.f3876a.f4265o;
                t1.m(w0Var2);
                u0Var = w0Var2.f4347w;
            } else if (i6 != 4) {
                w0 w0Var3 = m1Var.f3876a.f4265o;
                t1.m(w0Var3);
                u0Var = w0Var3.f4346u;
            } else if (z9) {
                w0 w0Var4 = m1Var.f3876a.f4265o;
                t1.m(w0Var4);
                u0Var = w0Var4.f4344s;
            } else if (z10) {
                w0 w0Var5 = m1Var.f3876a.f4265o;
                t1.m(w0Var5);
                u0Var = w0Var5.f4343r;
            } else {
                w0 w0Var6 = m1Var.f3876a.f4265o;
                t1.m(w0Var6);
                u0Var = w0Var6.f4345t;
            }
        } else if (z9) {
            w0 w0Var7 = m1Var.f3876a.f4265o;
            t1.m(w0Var7);
            u0Var = w0Var7.f4341p;
        } else if (z10) {
            w0 w0Var8 = m1Var.f3876a.f4265o;
            t1.m(w0Var8);
            u0Var = w0Var8.f4340o;
        } else {
            w0 w0Var9 = m1Var.f3876a.f4265o;
            t1.m(w0Var9);
            u0Var = w0Var9.f4342q;
        }
        int size = list.size();
        if (size == 1) {
            u0Var.c(list.get(0), str);
            return;
        }
        if (size == 2) {
            u0Var.d(list.get(0), str, list.get(1));
        } else if (size != 3) {
            u0Var.b(str);
        } else {
            u0Var.e(str, list.get(0), list.get(1), list.get(2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void y(e1.i2 r2, int r3) {
        /*
            r1 = this;
            r0 = -30
            if (r3 == r0) goto L1e
            r0 = -20
            if (r3 == r0) goto L1b
            r0 = -10
            if (r3 == r0) goto L18
            if (r3 == 0) goto L1b
            r0 = 30
            if (r3 == r0) goto L15
            e1.h r3 = e1.h.UNSET
            goto L20
        L15:
            e1.h r3 = e1.h.INITIALIZATION
            goto L20
        L18:
            e1.h r3 = e1.h.MANIFEST
            goto L20
        L1b:
            e1.h r3 = e1.h.API
            goto L20
        L1e:
            e1.h r3 = e1.h.TCF
        L20:
            java.lang.Object r0 = r1.f4812b
            java.util.EnumMap r0 = (java.util.EnumMap) r0
            r0.put(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.i.y(e1.i2, int):void");
    }

    @Override // k4.c
    public void z() {
        f4.a.f4870a.a();
        InstallerActivity installerActivity = (InstallerActivity) this.f4812b;
        installerActivity.getWindow().clearFlags(128);
        TextView textView = installerActivity.f3405z;
        if (textView != null) {
            textView.setText(installerActivity.getString(R.string.msg_install_from_unknown_source, installerActivity.getString(R.string.app_name)));
        }
        installerActivity.j();
    }

    public /* synthetic */ i(Object obj, int i) {
        this.f4811a = i;
        this.f4812b = obj;
    }

    public i(EnumMap enumMap) {
        this.f4811a = 20;
        EnumMap enumMap2 = new EnumMap(i2.class);
        this.f4812b = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public i(int i) {
        this.f4811a = i;
        switch (i) {
            case 20:
                this.f4812b = new EnumMap(i2.class);
                break;
            default:
                this.f4812b = new HashMap(3);
                break;
        }
    }

    public i(e2.d dVar) {
        this.f4811a = 25;
        this.f4812b = new File((File) dVar.f4469m, "com.crashlytics.settings.json");
    }

    public i(android.support.v4.media.session.f fVar) {
        this.f4811a = 2;
        this.f4812b = new WeakReference(fVar);
    }

    private final void h(View view, int i) {
    }
}
