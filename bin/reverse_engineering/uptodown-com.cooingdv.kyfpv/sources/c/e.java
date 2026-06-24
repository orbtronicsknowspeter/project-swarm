package c;

import a4.d0;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.TextView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.documentfile.provider.DocumentFile;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.l;
import androidx.work.Data;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import b.n;
import c4.d4;
import c4.k0;
import c4.sc;
import com.google.android.gms.internal.measurement.z3;
import com.google.android.material.snackbar.Snackbar;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AppInstalledDetailsActivity;
import com.uptodown.activities.ListsActivity;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.MyApps;
import com.uptodown.activities.MyDownloads;
import com.uptodown.activities.OldVersionsActivity;
import com.uptodown.activities.OrganizationActivity;
import com.uptodown.activities.PreregistrationActivity;
import com.uptodown.activities.PublicProfileActivity;
import com.uptodown.activities.ReviewsActivity;
import com.uptodown.activities.SecurityActivity;
import com.uptodown.activities.UserCommentsActivity;
import com.uptodown.activities.UserDeviceDetailsActivity;
import com.uptodown.activities.UserDevicesActivity;
import com.uptodown.activities.preferences.MobileDataUsageActivity;
import com.uptodown.activities.preferences.PreferencesActivity;
import com.uptodown.core.activities.FileExplorerActivity;
import com.uptodown.core.activities.InstallerActivity;
import com.uptodown.workers.GenerateQueueWorker;
import e1.v4;
import e4.i1;
import j5.t;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.x;
import m8.q;
import n5.o;
import o7.c0;
import o7.m0;
import r7.o0;
import t4.w0;
import w4.m;
import x4.c1;
import x4.f2;
import x4.k2;
import x4.n2;
import x4.r;
import x4.u1;
import x4.u2;
import x4.w2;
import x4.x1;
import x4.z2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1141b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1142l;

    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.f1140a = i;
        this.f1141b = obj;
        this.f1142l = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f1140a;
        int i6 = -1;
        int i10 = 1;
        int i11 = 0;
        Object obj = this.f1142l;
        Object obj2 = this.f1141b;
        switch (i) {
            case 0:
                g gVar = (g) obj2;
                gVar.getClass();
                gVar.f1146a.e((i) obj);
                break;
            case 1:
                AppInstalledDetailsActivity appInstalledDetailsActivity = (AppInstalledDetailsActivity) obj2;
                appInstalledDetailsActivity.I0(appInstalledDetailsActivity.f3302b0);
                float f = UptodownApp.I;
                if (!b4.d.m((String) obj)) {
                    appInstalledDetailsActivity.S0();
                } else {
                    appInstalledDetailsActivity.T0();
                    appInstalledDetailsActivity.R0().V.setText(appInstalledDetailsActivity.getString(R.string.status_download_update_pending));
                }
                break;
            case 2:
                AppInstalledDetailsActivity appInstalledDetailsActivity2 = (AppInstalledDetailsActivity) obj2;
                x4.g gVar2 = (x4.g) obj;
                float f10 = UptodownApp.I;
                if (b4.d.t()) {
                    appInstalledDetailsActivity2.i0(gVar2.f11159a);
                }
                break;
            case 3:
                ((k0) obj2).Q();
                ((androidx.work.impl.utils.c) obj).invoke();
                break;
            case 4:
                ((k0) obj2).l0(((f2) obj).f11152a);
                break;
            case 5:
                c1 c1Var = (c1) obj2;
                int i12 = ListsActivity.S;
                x4.j jVar = new x4.j(0, (String) null, 7);
                jVar.f11225a = c1Var.f11077a;
                jVar.f11226b = c1Var.f11078b;
                jVar.f11228m = true;
                ((ListsActivity) obj).E0(jVar);
                break;
            case 6:
                TextView textView = (TextView) obj2;
                ImageView imageView = (ImageView) obj;
                int i13 = MainActivity.G0;
                if (textView.getVisibility() != 0) {
                    textView.setVisibility(0);
                    imageView.setScaleY(-1.0f);
                } else {
                    textView.setVisibility(8);
                    imageView.setScaleY(1.0f);
                }
                break;
            case 7:
                MainActivity mainActivity = (MainActivity) obj2;
                int i14 = MainActivity.G0;
                mainActivity.Q();
                j5.c.e(mainActivity, ((n2) obj).f11299d, null);
                break;
            case 8:
                MainActivity mainActivity2 = (MainActivity) obj2;
                int i15 = MainActivity.G0;
                LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(mainActivity2);
                v7.e eVar = m0.f8289a;
                c0.s(lifecycleScope, v7.d.f10885a, null, new b6.a(mainActivity2, (ArrayList) obj, null == true ? 1 : 0, 10), 2).h(new androidx.room.b(mainActivity2, 12));
                AlertDialog alertDialog = mainActivity2.F;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
                break;
            case 9:
                MyApps myApps = (MyApps) obj2;
                int i16 = MyApps.f3329g0;
                view.getClass();
                new o(myApps, view, (HashMap) obj, new d4(myApps, i11)).a();
                break;
            case 10:
                ArrayList arrayList = (ArrayList) obj2;
                MyApps myApps2 = (MyApps) obj;
                if (!arrayList.isEmpty()) {
                    String str = ((x4.e) arrayList.get(0)).f11124l;
                    if (str != null) {
                        a5.e.b(str, "listado_instaladas");
                    }
                    String str2 = ((x4.e) arrayList.get(0)).f11124l;
                    float f11 = UptodownApp.I;
                    if (!b4.d.p(myApps2, "GenerateQueueWorker")) {
                        WorkManager.Companion.getInstance(myApps2).enqueue(((OneTimeWorkRequest.Builder) l.t(GenerateQueueWorker.class, "GenerateQueueWorker")).setInputData(new Data.Builder().putBoolean("downloadAnyway", true).putString("packagename", str2).build()).build());
                    }
                }
                AlertDialog alertDialog2 = myApps2.F;
                if (alertDialog2 != null) {
                    alertDialog2.dismiss();
                }
                break;
            case 11:
                MyDownloads myDownloads = (MyDownloads) obj2;
                int i17 = MyDownloads.V;
                view.getClass();
                new o(myDownloads, view, (HashMap) obj, new d4(myDownloads, i10)).a();
                break;
            case 12:
                OldVersionsActivity oldVersionsActivity = (OldVersionsActivity) obj2;
                int i18 = OldVersionsActivity.S;
                oldVersionsActivity.C0((r) obj);
                AlertDialog alertDialog3 = oldVersionsActivity.F;
                if (alertDialog3 != null) {
                    alertDialog3.dismiss();
                }
                break;
            case 13:
                OldVersionsActivity oldVersionsActivity2 = (OldVersionsActivity) obj;
                int i19 = OldVersionsActivity.S;
                if (((CheckBox) ((d0) obj2).f82l).isChecked()) {
                    SharedPreferences sharedPreferences = oldVersionsActivity2.getSharedPreferences("SettingsPreferences", 0);
                    sharedPreferences.getClass();
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putBoolean("show_warning_download_incompatible", true);
                    editorEdit.apply();
                }
                AlertDialog alertDialog4 = oldVersionsActivity2.F;
                if (alertDialog4 != null) {
                    alertDialog4.dismiss();
                }
                break;
            case 14:
                t4.d0 d0Var = (t4.d0) obj;
                int i20 = OrganizationActivity.R;
                String str3 = ((u1) obj2).h;
                if (str3 != null && str3.length() != 0) {
                    View view2 = d0Var.f9702z;
                    TextView textView2 = d0Var.f9698u;
                    int visibility = view2.getVisibility();
                    TextView textView3 = d0Var.f9699w;
                    if (visibility != 0) {
                        textView3.setText(R.string.read_more_desc_app_detail);
                        view2.setVisibility(0);
                        textView2.setMaxLines(6);
                        textView2.setEllipsize(TextUtils.TruncateAt.END);
                    } else {
                        textView3.setText(R.string.read_less_desc_app_detail);
                        view2.setVisibility(8);
                        textView2.setMaxLines(Integer.MAX_VALUE);
                        textView2.setEllipsize(null);
                    }
                    break;
                }
                break;
            case 15:
                PreregistrationActivity preregistrationActivity = (PreregistrationActivity) obj2;
                int i21 = PreregistrationActivity.T;
                LifecycleCoroutineScope lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(preregistrationActivity);
                v7.e eVar2 = m0.f8289a;
                c0.s(lifecycleScope2, v7.d.f10885a, null, new b6.a(preregistrationActivity, (x1) obj, null == true ? 1 : 0, 21), 2);
                AlertDialog alertDialog5 = preregistrationActivity.F;
                alertDialog5.getClass();
                alertDialog5.dismiss();
                break;
            case 16:
                PublicProfileActivity publicProfileActivity = (PublicProfileActivity) obj2;
                x xVar = (x) obj;
                float f12 = UptodownApp.I;
                if (b4.d.t()) {
                    w2 w2Var = (w2) xVar.f7025a;
                    String str4 = w2Var != null ? w2Var.f11432a : null;
                    int i22 = PublicProfileActivity.R;
                    if (publicProfileActivity.T()) {
                        Intent intent = new Intent(publicProfileActivity, (Class<?>) UserCommentsActivity.class);
                        intent.putExtra("userID", str4);
                        publicProfileActivity.startActivity(intent, b4.d.a(publicProfileActivity));
                    }
                }
                break;
            case 17:
                ReviewsActivity reviewsActivity = (ReviewsActivity) obj2;
                Drawable drawable = (Drawable) obj;
                int i23 = ReviewsActivity.T;
                float f13 = UptodownApp.I;
                if (b4.d.t()) {
                    o0 o0Var = reviewsActivity.A0().f1641l;
                    o0Var.getClass();
                    o0Var.g(null, 5);
                    reviewsActivity.y0().f10092n.setImageDrawable(drawable);
                    reviewsActivity.y0().f10093o.setImageDrawable(drawable);
                    reviewsActivity.y0().f10094p.setImageDrawable(drawable);
                    reviewsActivity.y0().f10095q.setImageDrawable(drawable);
                    reviewsActivity.y0().f10096r.setImageDrawable(drawable);
                }
                break;
            case 18:
                SecurityActivity securityActivity = (SecurityActivity) obj2;
                w0 w0Var = (w0) obj;
                int i24 = SecurityActivity.f3350g0;
                float f14 = UptodownApp.I;
                if (b4.d.t()) {
                    LifecycleCoroutineScope lifecycleScope3 = LifecycleOwnerKt.getLifecycleScope(securityActivity);
                    v7.e eVar3 = m0.f8289a;
                    c0.s(lifecycleScope3, v7.d.f10885a, null, new n((Object) securityActivity, (Object) w0Var, (t6.c) (null == true ? 1 : 0), 29), 2);
                }
                break;
            case 19:
                UserDevicesActivity userDevicesActivity = (UserDevicesActivity) obj2;
                int i25 = UserDevicesActivity.R;
                Intent intent2 = new Intent(userDevicesActivity, (Class<?>) UserDeviceDetailsActivity.class);
                intent2.putExtra("user_device", (z2) obj);
                ActivityResultLauncher activityResultLauncher = userDevicesActivity.Q;
                float f15 = UptodownApp.I;
                activityResultLauncher.launch(intent2, b4.d.b(userDevicesActivity));
                break;
            case 20:
                ((Snackbar) obj2).lambda$setAction$0((View.OnClickListener) obj, view);
                break;
            case 21:
                MobileDataUsageActivity mobileDataUsageActivity = (MobileDataUsageActivity) obj;
                int i26 = MobileDataUsageActivity.Q;
                int value = ((NumberPicker) ((q) obj2).f7782l).getValue();
                SharedPreferences sharedPreferences2 = mobileDataUsageActivity.getSharedPreferences("SettingsPreferences", 0);
                sharedPreferences2.getClass();
                SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                editorEdit2.putInt("billing_cycle_mobile_data", value);
                editorEdit2.apply();
                AlertDialog alertDialog6 = mobileDataUsageActivity.F;
                if (alertDialog6 != null) {
                    alertDialog6.dismiss();
                }
                mobileDataUsageActivity.B0().a(mobileDataUsageActivity);
                mobileDataUsageActivity.C0("billing_cycle", null, String.valueOf(value));
                break;
            case 22:
                int i27 = PreferencesActivity.T;
                ((v) obj2).f7023a = ((Number) ((Map.Entry) obj).getKey()).intValue();
                break;
            case 23:
                PreferencesActivity preferencesActivity = (PreferencesActivity) obj2;
                int i28 = PreferencesActivity.T;
                String string = preferencesActivity.getString(R.string.updates);
                string.getClass();
                preferencesActivity.y0(string, (HashMap) obj, Integer.parseInt(z3.u(preferencesActivity)), new androidx.room.b(preferencesActivity, 14));
                break;
            case 24:
                e4.i iVar = (e4.i) obj2;
                x4.g gVar3 = (x4.g) obj;
                if (iVar.f4556a != null && iVar.getBindingAdapterPosition() != -1) {
                    w4.j jVar2 = iVar.f4556a;
                    jVar2.getClass();
                    jVar2.d(gVar3);
                    break;
                }
                break;
            case 25:
                ((e4.x) obj2).f4714l.d((x4.g) obj);
                break;
            case 26:
                x1 x1Var = (x1) obj;
                f0.i iVar2 = ((e4.c0) obj2).f4501b;
                iVar2.getClass();
                k0 k0Var = (k0) iVar2.f4812b;
                k0Var.i0(x1Var.f11449a);
                e4.c0 c0Var = k0Var.H;
                if (c0Var != null) {
                    Iterator it = c0Var.f4503d.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            int i29 = i11 + 1;
                            if (((x1) it.next()).f11449a == x1Var.f11449a) {
                                i6 = i11;
                            } else {
                                i11 = i29;
                            }
                        }
                    }
                    c0Var.a(i6);
                }
                break;
            case 27:
                i1 i1Var = (i1) obj2;
                k2 k2Var = (k2) obj;
                view.getClass();
                m mVar = i1Var.f4566l;
                t4.g gVar4 = i1Var.f4565b;
                Object tag = view.getTag();
                tag.getClass();
                mVar.p(((Integer) tag).intValue());
                if (z3.f2928c) {
                    Context context = i1Var.itemView.getContext();
                    context.getClass();
                    if (u2.h(context) != null) {
                        Context context2 = i1Var.itemView.getContext();
                        context2.getClass();
                        new v4(context2, 1).h(gVar4.f9804m);
                        if (!t.f6710b.contains(Long.valueOf(k2Var.f11259a))) {
                            gVar4.f9811t.setText(String.valueOf(k2Var.f11268s + 1));
                        }
                    }
                }
                break;
            case 28:
                EditText editText = (EditText) obj2;
                FileExplorerActivity fileExplorerActivity = (FileExplorerActivity) obj;
                int i30 = FileExplorerActivity.f3380q0;
                if (editText.getText().toString().length() <= 0) {
                    String string2 = fileExplorerActivity.getString(R.string.core_compress_dialog_file_name_empty);
                    string2.getClass();
                    fileExplorerActivity.A(string2);
                } else {
                    v7.e eVar4 = m0.f8289a;
                    c0.s(c0.b(v7.d.f10885a), null, null, new sc(fileExplorerActivity, editText, null == true ? 1 : 0, 9), 3);
                }
                break;
            default:
                FileExplorerActivity fileExplorerActivity2 = (FileExplorerActivity) obj;
                int i31 = FileExplorerActivity.f3380q0;
                if (obj2 instanceof File) {
                    Application application = fileExplorerActivity2.getApplication();
                    application.getClass();
                    String absolutePath = ((File) obj2).getAbsolutePath();
                    absolutePath.getClass();
                    Intent intent3 = new Intent(fileExplorerActivity2, (Class<?>) InstallerActivity.class);
                    intent3.putExtra("realPath", absolutePath);
                    intent3.putExtra("requireUserAction", false);
                    intent3.putExtra("backgroundInstallation", false);
                    intent3.addFlags(268435456);
                    fileExplorerActivity2.startActivity(intent3);
                } else if (obj2 instanceof DocumentFile) {
                    DocumentFile documentFile = (DocumentFile) obj2;
                    Application application2 = fileExplorerActivity2.getApplication();
                    application2.getClass();
                    documentFile.getUri().getClass();
                    Uri uri = documentFile.getUri();
                    uri.getClass();
                    Intent intent4 = new Intent(fileExplorerActivity2, (Class<?>) InstallerActivity.class);
                    intent4.setData(uri);
                    intent4.putExtra("requireUserAction", false);
                    intent4.putExtra("backgroundInstallation", false);
                    intent4.addFlags(268435456);
                    fileExplorerActivity2.startActivity(intent4);
                }
                AlertDialog alertDialog7 = fileExplorerActivity2.S;
                alertDialog7.getClass();
                alertDialog7.dismiss();
                break;
        }
    }
}
