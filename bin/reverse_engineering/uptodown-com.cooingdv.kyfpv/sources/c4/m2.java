package c4;

import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.uptodown.R;
import com.uptodown.activities.LoginActivity;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class m2 implements r7.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f1855b;

    public /* synthetic */ m2(LoginActivity loginActivity, int i) {
        this.f1854a = i;
        this.f1855b = loginActivity;
    }

    @Override // r7.i
    public final Object emit(Object obj, t6.c cVar) {
        int i = this.f1854a;
        p6.x xVar = p6.x.f8464a;
        LoginActivity loginActivity = this.f1855b;
        switch (i) {
            case 0:
                j5.s sVar = (j5.s) obj;
                if (sVar instanceof j5.p) {
                    int i6 = LoginActivity.W;
                    loginActivity.G0().f10132b.setVisibility(0);
                } else if (sVar instanceof j5.r) {
                    if (x4.u2.g(loginActivity)) {
                        String str = ((u2) ((j5.r) sVar).f6708a).f2151b;
                        if (str != null) {
                            loginActivity.A(str);
                        }
                        loginActivity.F0();
                        loginActivity.setResult(1);
                    } else {
                        String str2 = ((u2) ((j5.r) sVar).f6708a).f2152c;
                        if (str2 != null) {
                            loginActivity.N(str2);
                        } else {
                            String string = loginActivity.getString(R.string.login_error_message);
                            string.getClass();
                            loginActivity.N(string);
                        }
                    }
                    int i10 = LoginActivity.W;
                    loginActivity.G0().f10132b.setVisibility(8);
                    if (x4.u2.g(loginActivity) && ((u2) ((j5.r) sVar).f6708a).f2151b == null) {
                        loginActivity.getOnBackPressedDispatcher().onBackPressed();
                    }
                } else if (!(sVar instanceof j5.q)) {
                    com.google.gson.internal.a.b();
                }
                break;
            default:
                j5.s sVar2 = (j5.s) obj;
                if (sVar2 instanceof j5.p) {
                    int i11 = LoginActivity.W;
                    loginActivity.G0().f10132b.setVisibility(0);
                } else if (sVar2 instanceof j5.r) {
                    v2 v2Var = (v2) ((j5.r) sVar2).f6708a;
                    int i12 = v2Var.f2194a;
                    String str3 = v2Var.f2196c;
                    String str4 = v2Var.f2195b;
                    if (i12 == 1) {
                        if (str4 != null && str4.length() != 0) {
                            loginActivity.A(str4);
                        }
                        int i13 = LoginActivity.W;
                        t4.u uVarG0 = loginActivity.G0();
                        ((EditText) uVarG0.f10134m.f8821o).setText("");
                        g4.u uVar = uVarG0.f10133l;
                        ((EditText) uVar.f5274r).setText("");
                        r.h hVar = uVarG0.f10134m;
                        EditText editText = (EditText) hVar.f8819m;
                        editText.setText("");
                        editText.setEnabled(true);
                        ((EditText) hVar.f8820n).setText("");
                        uVar.f5268l.setText("");
                        ((CheckBox) hVar.f8818l).setChecked(false);
                        t4.u uVarG02 = loginActivity.G0();
                        uVarG02.f10136o.setText(loginActivity.getString(R.string.title_login));
                        ((LinearLayout) uVarG02.f10133l.f5273q).setVisibility(0);
                        ((LinearLayout) uVarG02.f10134m.f8817b).setVisibility(8);
                    } else if (str3 == null || str3.length() == 0) {
                        String string2 = loginActivity.getString(R.string.signup_error_message);
                        string2.getClass();
                        loginActivity.A(string2);
                    } else {
                        loginActivity.A(str3);
                    }
                    int i14 = LoginActivity.W;
                    loginActivity.G0().f10132b.setVisibility(8);
                } else if (!(sVar2 instanceof j5.q)) {
                    com.google.gson.internal.a.b();
                }
                break;
        }
        return null;
    }
}
