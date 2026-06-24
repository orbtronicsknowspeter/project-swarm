package c4;

import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import androidx.activity.result.ActivityResultLauncher;
import androidx.lifecycle.ViewModelKt;
import com.uptodown.UptodownApp;
import com.uptodown.activities.PublicProfileActivity;
import com.uptodown.activities.UserAvatarActivity;
import com.uptodown.activities.UserCommentsActivity;
import com.uptodown.activities.UserEditProfileActivity;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l7 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PublicProfileActivity f1829b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x4.w2 f1830l;

    public /* synthetic */ l7(x4.w2 w2Var, PublicProfileActivity publicProfileActivity) {
        this.f1828a = 3;
        this.f1830l = w2Var;
        this.f1829b = publicProfileActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SharedPreferences sharedPreferences;
        String str;
        SharedPreferences sharedPreferences2;
        int i = this.f1828a;
        PublicProfileActivity publicProfileActivity = this.f1829b;
        x4.w2 w2Var = this.f1830l;
        switch (i) {
            case 0:
                int i6 = PublicProfileActivity.R;
                float f = UptodownApp.I;
                if (b4.d.t()) {
                    publicProfileActivity.A0(1, w2Var.f11434m, w2Var.f11431a);
                }
                break;
            case 1:
                int i10 = PublicProfileActivity.R;
                float f10 = UptodownApp.I;
                if (b4.d.t()) {
                    publicProfileActivity.A0(2, w2Var.f11434m, w2Var.f11431a);
                }
                break;
            case 2:
                int i11 = PublicProfileActivity.R;
                float f11 = UptodownApp.I;
                if (b4.d.t()) {
                    String str2 = w2Var.f11431a;
                    if (publicProfileActivity.T()) {
                        Intent intent = new Intent(publicProfileActivity, (Class<?>) UserCommentsActivity.class);
                        intent.putExtra("userID", str2);
                        publicProfileActivity.startActivity(intent, b4.d.a(publicProfileActivity));
                    }
                }
                break;
            case 3:
                int i12 = PublicProfileActivity.R;
                if (w2Var != null) {
                    SharedPreferences sharedPreferences3 = publicProfileActivity.getSharedPreferences("SharedPreferencesUser", 0);
                    try {
                        sharedPreferences = publicProfileActivity.getSharedPreferences("SettingsPreferences", 0);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                    String string = sharedPreferences.contains("UTOKEN") ? sharedPreferences.getString("UTOKEN", null) : null;
                    if (string != null || sharedPreferences3.getString("is_turbo", null) != null) {
                        Intent intent2 = new Intent(publicProfileActivity, (Class<?>) UserEditProfileActivity.class);
                        ActivityResultLauncher activityResultLauncher = publicProfileActivity.Q;
                        float f12 = UptodownApp.I;
                        activityResultLauncher.launch(intent2, b4.d.b(publicProfileActivity));
                    }
                }
                break;
            case 4:
                int i13 = PublicProfileActivity.R;
                float f13 = UptodownApp.I;
                if (b4.d.t() && publicProfileActivity.T()) {
                    Intent intent3 = new Intent(publicProfileActivity, (Class<?>) UserAvatarActivity.class);
                    intent3.putExtra("user", w2Var);
                    publicProfileActivity.Q.launch(intent3, b4.d.b(publicProfileActivity));
                    break;
                }
                break;
            default:
                int i14 = PublicProfileActivity.R;
                float f14 = UptodownApp.I;
                if (b4.d.t()) {
                    PublicProfileActivity publicProfileActivity2 = this.f1829b;
                    if (publicProfileActivity2.T()) {
                        SharedPreferences sharedPreferences4 = publicProfileActivity2.getSharedPreferences("SharedPreferencesUser", 0);
                        try {
                            sharedPreferences2 = publicProfileActivity2.getSharedPreferences("SettingsPreferences", 0);
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                        String string2 = sharedPreferences2.contains("UTOKEN") ? sharedPreferences2.getString("UTOKEN", null) : null;
                        if ((string2 == null && sharedPreferences4.getString("is_turbo", null) == null) || (str = w2Var.f11431a) == null || str.length() == 0) {
                            String string3 = publicProfileActivity2.getString(2131952181);
                            string3.getClass();
                            String string4 = publicProfileActivity2.getString(2131952180);
                            string4.getClass();
                            b2.t1.v(publicProfileActivity2, string3, string4);
                        } else {
                            y7 y7VarZ0 = publicProfileActivity2.z0();
                            String str3 = w2Var.f11431a;
                            str3.getClass();
                            y7VarZ0.getClass();
                            r7.o0 o0Var = y7VarZ0.g;
                            if (o0Var.getValue() instanceof j5.r) {
                                Object value = o0Var.getValue();
                                value.getClass();
                                if (((x4.v2) ((j5.r) value).f6707a).f11425d != 1) {
                                    o7.a0 viewModelScope = ViewModelKt.getViewModelScope(y7VarZ0);
                                    v7.e eVar = o7.m0.f8288a;
                                    o7.c0.s(viewModelScope, v7.d.f10884a, null, new w7(publicProfileActivity2, str3, y7VarZ0, null, 0), 2);
                                } else {
                                    o7.a0 viewModelScope2 = ViewModelKt.getViewModelScope(y7VarZ0);
                                    v7.e eVar2 = o7.m0.f8288a;
                                    o7.c0.s(viewModelScope2, v7.d.f10884a, null, new w7(publicProfileActivity2, str3, y7VarZ0, null, 1), 2);
                                }
                            }
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ l7(PublicProfileActivity publicProfileActivity, x4.w2 w2Var, int i) {
        this.f1828a = i;
        this.f1829b = publicProfileActivity;
        this.f1830l = w2Var;
    }
}
