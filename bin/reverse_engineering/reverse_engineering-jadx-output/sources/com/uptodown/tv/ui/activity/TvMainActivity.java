package com.uptodown.tv.ui.activity;

import android.R;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.leanback.app.BackgroundManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import b2.t1;
import b4.d;
import c4.ya;
import com.uptodown.UptodownApp;
import com.uptodown.core.activities.InstallerActivity;
import com.uptodown.tv.ui.activity.TvMainActivity;
import d4.p;
import f5.a;
import f5.b;
import g5.k;
import g5.t;
import j5.g;
import java.io.File;
import java.util.List;
import l7.u;
import o7.c0;
import q6.l;
import t6.c;
import x4.r;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class TvMainActivity extends a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f3407p = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AlertDialog f3408l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public t f3409m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ActivityResultLauncher f3410n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ActivityResultLauncher f3411o;

    public TvMainActivity() {
        final int i = 0;
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: f5.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TvMainActivity f4895b;

            {
                this.f4895b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                Bundle extras;
                int i6 = i;
                boolean z9 = false;
                TvMainActivity tvMainActivity = this.f4895b;
                ActivityResult activityResult = (ActivityResult) obj;
                switch (i6) {
                    case 0:
                        int i10 = TvMainActivity.f3407p;
                        if (activityResult.getResultCode() == 10) {
                            Intent data = activityResult.getData();
                            String string = (data == null || (extras = data.getExtras()) == null) ? null : extras.getString("realPath");
                            if (string != null && string.length() != 0) {
                                boolean zF = j5.a.f(tvMainActivity);
                                File file = new File(string);
                                String absolutePath = file.getAbsolutePath();
                                absolutePath.getClass();
                                Intent intent = new Intent(tvMainActivity, (Class<?>) InstallerActivity.class);
                                intent.putExtra("realPath", absolutePath);
                                intent.putExtra("requireUserAction", zF);
                                intent.putExtra("backgroundInstallation", false);
                                intent.addFlags(268435456);
                                tvMainActivity.startActivity(intent);
                                g gVarL = g.D.l(tvMainActivity);
                                gVarL.b();
                                String name = file.getName();
                                name.getClass();
                                r rVarG = gVarL.G(name);
                                gVarL.c();
                                Bundle bundle = new Bundle();
                                if ((rVarG != null ? rVarG.f11355b : null) != null) {
                                    String str = rVarG.f11355b;
                                    str.getClass();
                                    t1.i(tvMainActivity, str, bundle, false);
                                    bundle.putString("packagename", rVarG.f11355b);
                                }
                                if (rVarG != null) {
                                    long j = rVarG.f11361q;
                                    if (j > 0) {
                                        bundle.putString("appId", String.valueOf(j));
                                    }
                                }
                                bundle.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "start");
                                android.support.v4.media.g gVar = tvMainActivity.f4892a;
                                if (gVar != null) {
                                    gVar.E(bundle, "install");
                                }
                                break;
                            }
                        }
                        break;
                    default:
                        int i11 = TvMainActivity.f3407p;
                        try {
                            SharedPreferences sharedPreferences = tvMainActivity.getSharedPreferences("SettingsPreferences", 0);
                            if (sharedPreferences.contains("gdpr_tracking_allowed")) {
                                z9 = sharedPreferences.getBoolean("gdpr_tracking_allowed", false);
                            }
                            break;
                        } catch (Exception unused) {
                        }
                        if (z9) {
                            float f = UptodownApp.I;
                            d.F(tvMainActivity);
                        }
                        break;
                }
            }
        });
        activityResultLauncherRegisterForActivityResult.getClass();
        this.f3410n = activityResultLauncherRegisterForActivityResult;
        final int i6 = 1;
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: f5.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TvMainActivity f4895b;

            {
                this.f4895b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                Bundle extras;
                int i62 = i6;
                boolean z9 = false;
                TvMainActivity tvMainActivity = this.f4895b;
                ActivityResult activityResult = (ActivityResult) obj;
                switch (i62) {
                    case 0:
                        int i10 = TvMainActivity.f3407p;
                        if (activityResult.getResultCode() == 10) {
                            Intent data = activityResult.getData();
                            String string = (data == null || (extras = data.getExtras()) == null) ? null : extras.getString("realPath");
                            if (string != null && string.length() != 0) {
                                boolean zF = j5.a.f(tvMainActivity);
                                File file = new File(string);
                                String absolutePath = file.getAbsolutePath();
                                absolutePath.getClass();
                                Intent intent = new Intent(tvMainActivity, (Class<?>) InstallerActivity.class);
                                intent.putExtra("realPath", absolutePath);
                                intent.putExtra("requireUserAction", zF);
                                intent.putExtra("backgroundInstallation", false);
                                intent.addFlags(268435456);
                                tvMainActivity.startActivity(intent);
                                g gVarL = g.D.l(tvMainActivity);
                                gVarL.b();
                                String name = file.getName();
                                name.getClass();
                                r rVarG = gVarL.G(name);
                                gVarL.c();
                                Bundle bundle = new Bundle();
                                if ((rVarG != null ? rVarG.f11355b : null) != null) {
                                    String str = rVarG.f11355b;
                                    str.getClass();
                                    t1.i(tvMainActivity, str, bundle, false);
                                    bundle.putString("packagename", rVarG.f11355b);
                                }
                                if (rVarG != null) {
                                    long j = rVarG.f11361q;
                                    if (j > 0) {
                                        bundle.putString("appId", String.valueOf(j));
                                    }
                                }
                                bundle.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "start");
                                android.support.v4.media.g gVar = tvMainActivity.f4892a;
                                if (gVar != null) {
                                    gVar.E(bundle, "install");
                                }
                                break;
                            }
                        }
                        break;
                    default:
                        int i11 = TvMainActivity.f3407p;
                        try {
                            SharedPreferences sharedPreferences = tvMainActivity.getSharedPreferences("SettingsPreferences", 0);
                            if (sharedPreferences.contains("gdpr_tracking_allowed")) {
                                z9 = sharedPreferences.getBoolean("gdpr_tracking_allowed", false);
                            }
                            break;
                        } catch (Exception unused) {
                        }
                        if (z9) {
                            float f = UptodownApp.I;
                            d.F(tvMainActivity);
                        }
                        break;
                }
            }
        });
        activityResultLauncherRegisterForActivityResult2.getClass();
        this.f3411o = activityResultLauncherRegisterForActivityResult2;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        fragments.getClass();
        if (l.y0(fragments) instanceof k) {
            finish();
        } else {
            super.onBackPressed();
        }
    }

    @Override // f5.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        Uri data;
        SharedPreferences sharedPreferences;
        super.onCreate(bundle);
        setContentView(2131558831);
        this.f3409m = new t();
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        t tVar = this.f3409m;
        c cVar = null;
        if (tVar == null) {
            kotlin.jvm.internal.l.i("tvMainFragment");
            throw null;
        }
        fragmentTransactionBeginTransaction.replace(2131362197, tVar).commit();
        try {
            sharedPreferences = getSharedPreferences("SettingsPreferences", 0);
        } catch (Exception unused) {
        }
        boolean z9 = sharedPreferences.contains("gdpr_tracking_allowed") ? sharedPreferences.getBoolean("gdpr_tracking_allowed", false) : false;
        if (z9) {
            float f = UptodownApp.I;
            d.F(this);
        }
        BackgroundManager backgroundManager = BackgroundManager.getInstance(this);
        Drawable drawable = ContextCompat.getDrawable(this, 2131231285);
        if (backgroundManager != null) {
            backgroundManager.setDrawable(drawable);
        }
        Intent intent = getIntent();
        if (intent == null || (intent.getFlags() & 1048576) == 1048576 || (data = intent.getData()) == null) {
            return;
        }
        String strB = n4.d.b(data, this);
        if (strB != null) {
            boolean z10 = true;
            if (!u.k0(strB, ".xapk", true) && !u.k0(strB, ".apks", true) && !u.k0(strB, ".apkm", true) && !u.k0(strB, ".zip", true)) {
                z10 = false;
            }
            if (z10 || u.k0(strB, ".apk", false)) {
                Intent intent2 = new Intent(getApplicationContext(), (Class<?>) InstallerActivity.class);
                intent2.setData(data);
                this.f3410n.launch(intent2);
                return;
            }
        }
        c0.s(LifecycleOwnerKt.getLifecycleScope(this), v7.d.f10884a, null, new ya(this, j5.c.d(data), cVar, 4), 2);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        AlertDialog alertDialog;
        SharedPreferences sharedPreferences;
        super.onResume();
        AlertDialog alertDialog2 = this.f3408l;
        if (alertDialog2 != null) {
            alertDialog2.dismiss();
        }
        int i = 1;
        boolean z9 = false;
        try {
            sharedPreferences = getSharedPreferences("SettingsPreferences", 0);
        } catch (Exception unused) {
        }
        boolean z10 = sharedPreferences.contains("is_in_eea") ? sharedPreferences.getBoolean("is_in_eea", true) : true;
        if (z10) {
            try {
                SharedPreferences sharedPreferences2 = getSharedPreferences("SettingsPreferences", 0);
                if (sharedPreferences2.contains("gdpr_tracking_allowed")) {
                    z9 = sharedPreferences2.getBoolean("gdpr_tracking_allowed", false);
                }
            } catch (Exception unused2) {
            }
            if (z9) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage(getString(2131952663));
            builder.setPositiveButton(2131952044, new p(this, i));
            builder.setNegativeButton(R.string.cancel, new b(1));
            builder.setCancelable(true);
            this.f3408l = builder.create();
            if (isFinishing() || (alertDialog = this.f3408l) == null) {
                return;
            }
            alertDialog.show();
        }
    }
}
