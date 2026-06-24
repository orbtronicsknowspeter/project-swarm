package com.uptodown.core.activities;

import android.content.Intent;
import android.content.pm.PackageInstaller;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.inputmethod.a;
import g4.b;
import j$.util.concurrent.ConcurrentHashMap;
import n4.h;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class ConfirmationIntentWrapperActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f3375n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3377b = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b f3378l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ActivityResultLauncher f3379m;

    public ConfirmationIntentWrapperActivity() {
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new a(this, 19));
        activityResultLauncherRegisterForActivityResult.getClass();
        this.f3379m = activityResultLauncherRegisterForActivityResult;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f3377b = getIntent().getIntExtra("com.uptodown.sapk.session_id", -1);
        this.f3378l = new b();
        PackageInstaller packageInstaller = getPackageManager().getPackageInstaller();
        b bVar = this.f3378l;
        bVar.getClass();
        packageInstaller.registerSessionCallback(bVar);
        Intent intent = getIntent();
        intent.getClass();
        try {
            this.f3379m.launch((Intent) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) intent.getParcelableExtra("com.uptodown.sapk.confirmation_intent", Intent.class) : intent.getParcelableExtra("com.uptodown.sapk.confirmation_intent")));
        } catch (Exception e10) {
            e10.printStackTrace();
            ConcurrentHashMap concurrentHashMap = h.f7967c;
            d0.b.x(this.f3377b, false);
            this.f3376a = true;
            finish();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        b bVar = this.f3378l;
        if (bVar != null) {
            try {
                getPackageManager().getPackageInstaller().unregisterSessionCallback(bVar);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        if (!this.f3376a) {
            ConcurrentHashMap concurrentHashMap = h.f7967c;
            d0.b.x(this.f3377b, true);
            f4.a.f4870a.a();
        }
        super.onDestroy();
    }
}
