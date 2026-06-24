package com.uptodown.activities;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import c4.k0;
import c4.w6;
import com.uptodown.UptodownApp;
import com.uptodown.activities.PasswordEditActivity;
import com.uptodown.activities.UserAvatarActivity;
import com.uptodown.activities.UserEditProfileActivity;
import com.uptodown.activities.UsernameEditActivity;
import f4.c;
import p6.m;
import t4.f1;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class UserEditProfileActivity extends k0 {
    public static final /* synthetic */ int R = 0;
    public final m O = new m(new w6(this, 13));
    public final ActivityResultLauncher P;
    public final ActivityResultLauncher Q;

    public UserEditProfileActivity() {
        final int i = 0;
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: c4.uc

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserEditProfileActivity f2186b;

            {
                this.f2186b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                int i6 = i;
                UserEditProfileActivity userEditProfileActivity = this.f2186b;
                ActivityResult activityResult = (ActivityResult) obj;
                switch (i6) {
                    case 0:
                        int i10 = UserEditProfileActivity.R;
                        if (activityResult.getResultCode() == 2) {
                            x4.u2.b(userEditProfileActivity);
                            userEditProfileActivity.setResult(2);
                            userEditProfileActivity.finish();
                        }
                        break;
                    default:
                        int i11 = UserEditProfileActivity.R;
                        if (activityResult.getResultCode() == 10) {
                            userEditProfileActivity.setResult(10);
                            userEditProfileActivity.finish();
                        }
                        break;
                }
            }
        });
        activityResultLauncherRegisterForActivityResult.getClass();
        this.P = activityResultLauncherRegisterForActivityResult;
        final int i6 = 1;
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: c4.uc

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserEditProfileActivity f2186b;

            {
                this.f2186b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                int i62 = i6;
                UserEditProfileActivity userEditProfileActivity = this.f2186b;
                ActivityResult activityResult = (ActivityResult) obj;
                switch (i62) {
                    case 0:
                        int i10 = UserEditProfileActivity.R;
                        if (activityResult.getResultCode() == 2) {
                            x4.u2.b(userEditProfileActivity);
                            userEditProfileActivity.setResult(2);
                            userEditProfileActivity.finish();
                        }
                        break;
                    default:
                        int i11 = UserEditProfileActivity.R;
                        if (activityResult.getResultCode() == 10) {
                            userEditProfileActivity.setResult(10);
                            userEditProfileActivity.finish();
                        }
                        break;
                }
            }
        });
        activityResultLauncherRegisterForActivityResult2.getClass();
        this.Q = activityResultLauncherRegisterForActivityResult2;
    }

    @Override // c4.k0, g4.h, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = y0().f9789a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        Drawable drawable = ContextCompat.getDrawable(this, 2131230922);
        if (drawable != null) {
            y0().f9794o.setNavigationIcon(drawable);
            y0().f9794o.setNavigationContentDescription(getString(2131951735));
        }
        final int i = 0;
        y0().f9794o.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: c4.vc

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserEditProfileActivity f2234b;

            {
                this.f2234b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = i;
                UserEditProfileActivity userEditProfileActivity = this.f2234b;
                switch (i6) {
                    case 0:
                        int i10 = UserEditProfileActivity.R;
                        userEditProfileActivity.finish();
                        break;
                    case 1:
                        int i11 = UserEditProfileActivity.R;
                        if (userEditProfileActivity.T()) {
                            x4.w2 w2VarH = x4.u2.h(userEditProfileActivity);
                            if (w2VarH == null) {
                                userEditProfileActivity.finish();
                            } else {
                                Intent intent = new Intent(userEditProfileActivity, (Class<?>) UsernameEditActivity.class);
                                intent.putExtra("user", w2VarH);
                                ActivityResultLauncher activityResultLauncher = userEditProfileActivity.Q;
                                float f = UptodownApp.I;
                                activityResultLauncher.launch(intent, b4.d.b(userEditProfileActivity));
                            }
                        }
                        break;
                    case 2:
                        int i12 = UserEditProfileActivity.R;
                        if (userEditProfileActivity.T()) {
                            if (x4.u2.h(userEditProfileActivity) == null) {
                                userEditProfileActivity.finish();
                            } else {
                                Intent intent2 = new Intent(userEditProfileActivity, (Class<?>) PasswordEditActivity.class);
                                ActivityResultLauncher activityResultLauncher2 = userEditProfileActivity.P;
                                float f10 = UptodownApp.I;
                                activityResultLauncher2.launch(intent2, b4.d.b(userEditProfileActivity));
                            }
                        }
                        break;
                    case 3:
                        int i13 = UserEditProfileActivity.R;
                        if (userEditProfileActivity.T()) {
                            x4.w2 w2VarH2 = x4.u2.h(userEditProfileActivity);
                            if (w2VarH2 == null) {
                                userEditProfileActivity.finish();
                            } else {
                                Intent intent3 = new Intent(userEditProfileActivity, (Class<?>) UserAvatarActivity.class);
                                intent3.putExtra("user", w2VarH2);
                                ActivityResultLauncher activityResultLauncher3 = userEditProfileActivity.Q;
                                float f11 = UptodownApp.I;
                                activityResultLauncher3.launch(intent3, b4.d.b(userEditProfileActivity));
                            }
                        }
                        break;
                    default:
                        int i14 = UserEditProfileActivity.R;
                        x4.u2.b(userEditProfileActivity);
                        userEditProfileActivity.finish();
                        break;
                }
            }
        });
        y0().f9798s.setTypeface(c.f4882w);
        y0().f9799t.setTypeface(c.f4882w);
        y0().f9797r.setTypeface(c.f4882w);
        y0().f9795p.setTypeface(c.f4882w);
        y0().f9796q.setTypeface(c.f4882w);
        final int i6 = 1;
        y0().f9793n.setOnClickListener(new View.OnClickListener(this) { // from class: c4.vc

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserEditProfileActivity f2234b;

            {
                this.f2234b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i62 = i6;
                UserEditProfileActivity userEditProfileActivity = this.f2234b;
                switch (i62) {
                    case 0:
                        int i10 = UserEditProfileActivity.R;
                        userEditProfileActivity.finish();
                        break;
                    case 1:
                        int i11 = UserEditProfileActivity.R;
                        if (userEditProfileActivity.T()) {
                            x4.w2 w2VarH = x4.u2.h(userEditProfileActivity);
                            if (w2VarH == null) {
                                userEditProfileActivity.finish();
                            } else {
                                Intent intent = new Intent(userEditProfileActivity, (Class<?>) UsernameEditActivity.class);
                                intent.putExtra("user", w2VarH);
                                ActivityResultLauncher activityResultLauncher = userEditProfileActivity.Q;
                                float f = UptodownApp.I;
                                activityResultLauncher.launch(intent, b4.d.b(userEditProfileActivity));
                            }
                        }
                        break;
                    case 2:
                        int i12 = UserEditProfileActivity.R;
                        if (userEditProfileActivity.T()) {
                            if (x4.u2.h(userEditProfileActivity) == null) {
                                userEditProfileActivity.finish();
                            } else {
                                Intent intent2 = new Intent(userEditProfileActivity, (Class<?>) PasswordEditActivity.class);
                                ActivityResultLauncher activityResultLauncher2 = userEditProfileActivity.P;
                                float f10 = UptodownApp.I;
                                activityResultLauncher2.launch(intent2, b4.d.b(userEditProfileActivity));
                            }
                        }
                        break;
                    case 3:
                        int i13 = UserEditProfileActivity.R;
                        if (userEditProfileActivity.T()) {
                            x4.w2 w2VarH2 = x4.u2.h(userEditProfileActivity);
                            if (w2VarH2 == null) {
                                userEditProfileActivity.finish();
                            } else {
                                Intent intent3 = new Intent(userEditProfileActivity, (Class<?>) UserAvatarActivity.class);
                                intent3.putExtra("user", w2VarH2);
                                ActivityResultLauncher activityResultLauncher3 = userEditProfileActivity.Q;
                                float f11 = UptodownApp.I;
                                activityResultLauncher3.launch(intent3, b4.d.b(userEditProfileActivity));
                            }
                        }
                        break;
                    default:
                        int i14 = UserEditProfileActivity.R;
                        x4.u2.b(userEditProfileActivity);
                        userEditProfileActivity.finish();
                        break;
                }
            }
        });
        final int i10 = 2;
        y0().f9792m.setOnClickListener(new View.OnClickListener(this) { // from class: c4.vc

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserEditProfileActivity f2234b;

            {
                this.f2234b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i62 = i10;
                UserEditProfileActivity userEditProfileActivity = this.f2234b;
                switch (i62) {
                    case 0:
                        int i102 = UserEditProfileActivity.R;
                        userEditProfileActivity.finish();
                        break;
                    case 1:
                        int i11 = UserEditProfileActivity.R;
                        if (userEditProfileActivity.T()) {
                            x4.w2 w2VarH = x4.u2.h(userEditProfileActivity);
                            if (w2VarH == null) {
                                userEditProfileActivity.finish();
                            } else {
                                Intent intent = new Intent(userEditProfileActivity, (Class<?>) UsernameEditActivity.class);
                                intent.putExtra("user", w2VarH);
                                ActivityResultLauncher activityResultLauncher = userEditProfileActivity.Q;
                                float f = UptodownApp.I;
                                activityResultLauncher.launch(intent, b4.d.b(userEditProfileActivity));
                            }
                        }
                        break;
                    case 2:
                        int i12 = UserEditProfileActivity.R;
                        if (userEditProfileActivity.T()) {
                            if (x4.u2.h(userEditProfileActivity) == null) {
                                userEditProfileActivity.finish();
                            } else {
                                Intent intent2 = new Intent(userEditProfileActivity, (Class<?>) PasswordEditActivity.class);
                                ActivityResultLauncher activityResultLauncher2 = userEditProfileActivity.P;
                                float f10 = UptodownApp.I;
                                activityResultLauncher2.launch(intent2, b4.d.b(userEditProfileActivity));
                            }
                        }
                        break;
                    case 3:
                        int i13 = UserEditProfileActivity.R;
                        if (userEditProfileActivity.T()) {
                            x4.w2 w2VarH2 = x4.u2.h(userEditProfileActivity);
                            if (w2VarH2 == null) {
                                userEditProfileActivity.finish();
                            } else {
                                Intent intent3 = new Intent(userEditProfileActivity, (Class<?>) UserAvatarActivity.class);
                                intent3.putExtra("user", w2VarH2);
                                ActivityResultLauncher activityResultLauncher3 = userEditProfileActivity.Q;
                                float f11 = UptodownApp.I;
                                activityResultLauncher3.launch(intent3, b4.d.b(userEditProfileActivity));
                            }
                        }
                        break;
                    default:
                        int i14 = UserEditProfileActivity.R;
                        x4.u2.b(userEditProfileActivity);
                        userEditProfileActivity.finish();
                        break;
                }
            }
        });
        final int i11 = 3;
        y0().f9790b.setOnClickListener(new View.OnClickListener(this) { // from class: c4.vc

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserEditProfileActivity f2234b;

            {
                this.f2234b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i62 = i11;
                UserEditProfileActivity userEditProfileActivity = this.f2234b;
                switch (i62) {
                    case 0:
                        int i102 = UserEditProfileActivity.R;
                        userEditProfileActivity.finish();
                        break;
                    case 1:
                        int i112 = UserEditProfileActivity.R;
                        if (userEditProfileActivity.T()) {
                            x4.w2 w2VarH = x4.u2.h(userEditProfileActivity);
                            if (w2VarH == null) {
                                userEditProfileActivity.finish();
                            } else {
                                Intent intent = new Intent(userEditProfileActivity, (Class<?>) UsernameEditActivity.class);
                                intent.putExtra("user", w2VarH);
                                ActivityResultLauncher activityResultLauncher = userEditProfileActivity.Q;
                                float f = UptodownApp.I;
                                activityResultLauncher.launch(intent, b4.d.b(userEditProfileActivity));
                            }
                        }
                        break;
                    case 2:
                        int i12 = UserEditProfileActivity.R;
                        if (userEditProfileActivity.T()) {
                            if (x4.u2.h(userEditProfileActivity) == null) {
                                userEditProfileActivity.finish();
                            } else {
                                Intent intent2 = new Intent(userEditProfileActivity, (Class<?>) PasswordEditActivity.class);
                                ActivityResultLauncher activityResultLauncher2 = userEditProfileActivity.P;
                                float f10 = UptodownApp.I;
                                activityResultLauncher2.launch(intent2, b4.d.b(userEditProfileActivity));
                            }
                        }
                        break;
                    case 3:
                        int i13 = UserEditProfileActivity.R;
                        if (userEditProfileActivity.T()) {
                            x4.w2 w2VarH2 = x4.u2.h(userEditProfileActivity);
                            if (w2VarH2 == null) {
                                userEditProfileActivity.finish();
                            } else {
                                Intent intent3 = new Intent(userEditProfileActivity, (Class<?>) UserAvatarActivity.class);
                                intent3.putExtra("user", w2VarH2);
                                ActivityResultLauncher activityResultLauncher3 = userEditProfileActivity.Q;
                                float f11 = UptodownApp.I;
                                activityResultLauncher3.launch(intent3, b4.d.b(userEditProfileActivity));
                            }
                        }
                        break;
                    default:
                        int i14 = UserEditProfileActivity.R;
                        x4.u2.b(userEditProfileActivity);
                        userEditProfileActivity.finish();
                        break;
                }
            }
        });
        final int i12 = 4;
        y0().f9791l.setOnClickListener(new View.OnClickListener(this) { // from class: c4.vc

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserEditProfileActivity f2234b;

            {
                this.f2234b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i62 = i12;
                UserEditProfileActivity userEditProfileActivity = this.f2234b;
                switch (i62) {
                    case 0:
                        int i102 = UserEditProfileActivity.R;
                        userEditProfileActivity.finish();
                        break;
                    case 1:
                        int i112 = UserEditProfileActivity.R;
                        if (userEditProfileActivity.T()) {
                            x4.w2 w2VarH = x4.u2.h(userEditProfileActivity);
                            if (w2VarH == null) {
                                userEditProfileActivity.finish();
                            } else {
                                Intent intent = new Intent(userEditProfileActivity, (Class<?>) UsernameEditActivity.class);
                                intent.putExtra("user", w2VarH);
                                ActivityResultLauncher activityResultLauncher = userEditProfileActivity.Q;
                                float f = UptodownApp.I;
                                activityResultLauncher.launch(intent, b4.d.b(userEditProfileActivity));
                            }
                        }
                        break;
                    case 2:
                        int i122 = UserEditProfileActivity.R;
                        if (userEditProfileActivity.T()) {
                            if (x4.u2.h(userEditProfileActivity) == null) {
                                userEditProfileActivity.finish();
                            } else {
                                Intent intent2 = new Intent(userEditProfileActivity, (Class<?>) PasswordEditActivity.class);
                                ActivityResultLauncher activityResultLauncher2 = userEditProfileActivity.P;
                                float f10 = UptodownApp.I;
                                activityResultLauncher2.launch(intent2, b4.d.b(userEditProfileActivity));
                            }
                        }
                        break;
                    case 3:
                        int i13 = UserEditProfileActivity.R;
                        if (userEditProfileActivity.T()) {
                            x4.w2 w2VarH2 = x4.u2.h(userEditProfileActivity);
                            if (w2VarH2 == null) {
                                userEditProfileActivity.finish();
                            } else {
                                Intent intent3 = new Intent(userEditProfileActivity, (Class<?>) UserAvatarActivity.class);
                                intent3.putExtra("user", w2VarH2);
                                ActivityResultLauncher activityResultLauncher3 = userEditProfileActivity.Q;
                                float f11 = UptodownApp.I;
                                activityResultLauncher3.launch(intent3, b4.d.b(userEditProfileActivity));
                            }
                        }
                        break;
                    default:
                        int i14 = UserEditProfileActivity.R;
                        x4.u2.b(userEditProfileActivity);
                        userEditProfileActivity.finish();
                        break;
                }
            }
        });
    }

    public final f1 y0() {
        return (f1) this.O.getValue();
    }
}
