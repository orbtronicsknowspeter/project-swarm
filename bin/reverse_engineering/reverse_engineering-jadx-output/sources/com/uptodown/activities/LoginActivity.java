package com.uptodown.activities;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.room.g;
import c4.b;
import c4.k2;
import c4.n2;
import c4.o2;
import c4.p2;
import c4.t2;
import c4.x2;
import com.uptodown.UptodownApp;
import com.uptodown.activities.LoginActivity;
import com.uptodown.activities.PasswordRecoveryActivity;
import java.util.regex.Pattern;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.x;
import kotlin.jvm.internal.y;
import o7.a0;
import o7.c0;
import o7.m0;
import p6.m;
import r.h;
import t4.u;
import t6.c;
import t7.n;
import v7.d;
import v7.e;
import x4.w2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class LoginActivity extends t2 {
    public static final /* synthetic */ int W = 0;
    public Drawable U;
    public final m S = new m(new g(this, 21));
    public final ViewModelLazy T = new ViewModelLazy(y.a(x2.class), new p2(this, 0), new o2(this), new p2(this, 1));
    public final b V = new b(this, 2);

    @Override // c4.t2
    public final void C0(w2 w2Var) {
        String str;
        if (w2Var != null) {
            w2Var.e(this);
        }
        if (w2Var != null) {
            try {
                str = w2Var.f11434m;
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            w2Var.getClass();
            String str2 = w2Var.f11434m;
            str2.getClass();
            AccountManager.get(getBaseContext()).addAccountExplicitly(new Account(str2, getString(2131951649)), null, null);
        }
    }

    @Override // c4.t2
    public final void D0(w2 w2Var, String str) {
        y0();
        ((EditText) G0().f10133m.f8820o).setText(w2Var != null ? w2Var.f11434m : null);
        ((EditText) G0().f10133m.f8818m).setText(w2Var != null ? w2Var.f11432b : null);
        ((EditText) G0().f10133m.f8818m).setEnabled(false);
        if (str != null) {
            A(str);
        }
    }

    @Override // c4.t2
    public final void E0() {
        G0().f10131b.setVisibility(0);
    }

    @Override // c4.t2
    public final void F0() {
        String string = getString(2131952184);
        string.getClass();
        A(string);
    }

    public final u G0() {
        return (u) this.S.getValue();
    }

    public final x2 H0() {
        return (x2) this.T.getValue();
    }

    public final void I0() {
        Object systemService = getSystemService("input_method");
        systemService.getClass();
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        inputMethodManager.hideSoftInputFromWindow(((EditText) G0().f10133m.f8818m).getWindowToken(), 0);
        inputMethodManager.hideSoftInputFromWindow(((EditText) G0().f10133m.f8820o).getWindowToken(), 0);
        inputMethodManager.hideSoftInputFromWindow(((EditText) G0().f10133m.f8819n).getWindowToken(), 0);
        inputMethodManager.hideSoftInputFromWindow(((EditText) G0().f10132l.f5273r).getWindowToken(), 0);
        inputMethodManager.hideSoftInputFromWindow(G0().f10132l.f5267l.getWindowToken(), 0);
    }

    public final void J0() {
        I0();
        x2 x2VarH0 = H0();
        String string = ((EditText) G0().f10132l.f5273r).getText().toString();
        String string2 = G0().f10132l.f5267l.getText().toString();
        x2VarH0.getClass();
        string.getClass();
        string2.getClass();
        if (string.length() <= 0 || string2.length() <= 0) {
            String string3 = getString(2131952021);
            string3.getClass();
            A(string3);
            return;
        }
        String string4 = ((EditText) G0().f10132l.f5273r).getText().toString();
        String string5 = G0().f10132l.f5267l.getText().toString();
        x2 x2VarH02 = H0();
        x2VarH02.getClass();
        string4.getClass();
        string5.getClass();
        v vVar = new v();
        vVar.f7022a = -2;
        x xVar = new x();
        x xVar2 = new x();
        x xVar3 = new x();
        a0 viewModelScope = ViewModelKt.getViewModelScope(x2VarH02);
        e eVar = m0.f8288a;
        c0.s(viewModelScope, d.f10884a, null, new c4.w2(x2VarH02, this, string4, string5, xVar3, vVar, xVar, xVar2, (c) null), 2);
    }

    @Override // c4.t2, c4.k0, g4.h, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getOnBackPressedDispatcher().addCallback(this, this.V);
        RelativeLayout relativeLayout = G0().f10130a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        Drawable drawable = ContextCompat.getDrawable(this, 2131230922);
        this.U = drawable;
        if (drawable != null) {
            DrawableCompat.setTint(drawable, ContextCompat.getColor(this, 2131100792));
            G0().f10134n.setNavigationIcon(this.U);
            G0().f10134n.setNavigationContentDescription(getString(2131951735));
        }
        final int i = 0;
        G0().f10134n.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: c4.i2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginActivity f1711b;

            {
                this.f1711b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = i;
                LoginActivity loginActivity = this.f1711b;
                switch (i6) {
                    case 0:
                        int i10 = LoginActivity.W;
                        loginActivity.getOnBackPressedDispatcher().onBackPressed();
                        break;
                    case 1:
                        int i11 = LoginActivity.W;
                        Intent intent = new Intent(loginActivity.getApplicationContext(), (Class<?>) PasswordRecoveryActivity.class);
                        float f = UptodownApp.I;
                        loginActivity.startActivity(intent, b4.d.a(loginActivity));
                        break;
                    case 2:
                        int i12 = LoginActivity.W;
                        LoginActivity loginActivity2 = this.f1711b;
                        loginActivity2.I0();
                        x2 x2VarH0 = loginActivity2.H0();
                        String string = ((EditText) loginActivity2.G0().f10133m.f8818m).getText().toString();
                        x2VarH0.getClass();
                        string.getClass();
                        boolean zMatches = Pattern.compile("^(([^<>()\\[\\]\\\\.,;:\\s@“]+(\\.[^<>()\\[\\]\\\\.,;:\\s@“]+)*)|(“.+“))@((\\[\\d{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$").matcher(string).matches();
                        x2 x2VarH02 = loginActivity2.H0();
                        String string2 = ((EditText) loginActivity2.G0().f10133m.f8820o).getText().toString();
                        String string3 = ((EditText) loginActivity2.G0().f10133m.f8818m).getText().toString();
                        String string4 = ((EditText) loginActivity2.G0().f10133m.f8819n).getText().toString();
                        x2VarH02.getClass();
                        string2.getClass();
                        string3.getClass();
                        string4.getClass();
                        if (string2.length() > 0 && string3.length() > 0 && string4.length() > 5 && zMatches && ((CheckBox) loginActivity2.G0().f10133m.f8817l).isChecked()) {
                            String string5 = ((EditText) loginActivity2.G0().f10133m.f8820o).getText().toString();
                            String string6 = ((EditText) loginActivity2.G0().f10133m.f8818m).getText().toString();
                            String string7 = ((EditText) loginActivity2.G0().f10133m.f8819n).getText().toString();
                            x2 x2VarH03 = loginActivity2.H0();
                            x2VarH03.getClass();
                            string5.getClass();
                            string6.getClass();
                            string7.getClass();
                            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                            kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v();
                            kotlin.jvm.internal.x xVar2 = new kotlin.jvm.internal.x();
                            o7.a0 viewModelScope = ViewModelKt.getViewModelScope(x2VarH03);
                            v7.e eVar = o7.m0.f8288a;
                            o7.c0.s(viewModelScope, v7.d.f10884a, null, new w2(x2VarH03, loginActivity2, string5, string7, string6, vVar, xVar, xVar2, (t6.c) null), 2);
                        } else if (!((CheckBox) loginActivity2.G0().f10133m.f8817l).isChecked()) {
                            String string8 = loginActivity2.getString(2131952018);
                            string8.getClass();
                            loginActivity2.A(string8);
                        } else if (((EditText) loginActivity2.G0().f10133m.f8819n).length() < 6) {
                            String string9 = loginActivity2.getString(2131952760);
                            string9.getClass();
                            loginActivity2.A(string9);
                        } else if (((EditText) loginActivity2.G0().f10133m.f8819n).length() > 99) {
                            String string10 = loginActivity2.getString(2131952758);
                            string10.getClass();
                            loginActivity2.A(string10);
                        } else if (!zMatches) {
                            String string11 = loginActivity2.getString(2131951995);
                            string11.getClass();
                            loginActivity2.A(string11);
                        } else {
                            String string12 = loginActivity2.getString(2131952022);
                            string12.getClass();
                            loginActivity2.A(string12);
                        }
                        break;
                    case 3:
                        loginActivity.V.handleOnBackPressed();
                        break;
                    case 4:
                        int i13 = LoginActivity.W;
                        if (((LinearLayout) loginActivity.G0().f10133m.f8816b).getVisibility() != 0) {
                            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                            alphaAnimation.setInterpolator(new AccelerateInterpolator());
                            alphaAnimation.setDuration(200L);
                            alphaAnimation.setAnimationListener(new l2(loginActivity, 0));
                            ((LinearLayout) loginActivity.G0().f10132l.f5272q).startAnimation(alphaAnimation);
                        }
                        break;
                    default:
                        int i14 = LoginActivity.W;
                        loginActivity.J0();
                        break;
                }
            }
        });
        G0().f10135o.setTypeface(f4.c.f4882w);
        G0().f10132l.f5271p.setTypeface(f4.c.f4882w);
        G0().f10132l.f5268m.setTypeface(f4.c.f4883x);
        ((TextView) G0().f10133m.f8823r).setTypeface(f4.c.f4883x);
        G0().f10131b.setOnClickListener(new c4.e(7));
        final int i6 = 4;
        G0().f10132l.f5271p.setOnClickListener(new View.OnClickListener(this) { // from class: c4.i2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginActivity f1711b;

            {
                this.f1711b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i62 = i6;
                LoginActivity loginActivity = this.f1711b;
                switch (i62) {
                    case 0:
                        int i10 = LoginActivity.W;
                        loginActivity.getOnBackPressedDispatcher().onBackPressed();
                        break;
                    case 1:
                        int i11 = LoginActivity.W;
                        Intent intent = new Intent(loginActivity.getApplicationContext(), (Class<?>) PasswordRecoveryActivity.class);
                        float f = UptodownApp.I;
                        loginActivity.startActivity(intent, b4.d.a(loginActivity));
                        break;
                    case 2:
                        int i12 = LoginActivity.W;
                        LoginActivity loginActivity2 = this.f1711b;
                        loginActivity2.I0();
                        x2 x2VarH0 = loginActivity2.H0();
                        String string = ((EditText) loginActivity2.G0().f10133m.f8818m).getText().toString();
                        x2VarH0.getClass();
                        string.getClass();
                        boolean zMatches = Pattern.compile("^(([^<>()\\[\\]\\\\.,;:\\s@“]+(\\.[^<>()\\[\\]\\\\.,;:\\s@“]+)*)|(“.+“))@((\\[\\d{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$").matcher(string).matches();
                        x2 x2VarH02 = loginActivity2.H0();
                        String string2 = ((EditText) loginActivity2.G0().f10133m.f8820o).getText().toString();
                        String string3 = ((EditText) loginActivity2.G0().f10133m.f8818m).getText().toString();
                        String string4 = ((EditText) loginActivity2.G0().f10133m.f8819n).getText().toString();
                        x2VarH02.getClass();
                        string2.getClass();
                        string3.getClass();
                        string4.getClass();
                        if (string2.length() > 0 && string3.length() > 0 && string4.length() > 5 && zMatches && ((CheckBox) loginActivity2.G0().f10133m.f8817l).isChecked()) {
                            String string5 = ((EditText) loginActivity2.G0().f10133m.f8820o).getText().toString();
                            String string6 = ((EditText) loginActivity2.G0().f10133m.f8818m).getText().toString();
                            String string7 = ((EditText) loginActivity2.G0().f10133m.f8819n).getText().toString();
                            x2 x2VarH03 = loginActivity2.H0();
                            x2VarH03.getClass();
                            string5.getClass();
                            string6.getClass();
                            string7.getClass();
                            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                            kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v();
                            kotlin.jvm.internal.x xVar2 = new kotlin.jvm.internal.x();
                            o7.a0 viewModelScope = ViewModelKt.getViewModelScope(x2VarH03);
                            v7.e eVar = o7.m0.f8288a;
                            o7.c0.s(viewModelScope, v7.d.f10884a, null, new w2(x2VarH03, loginActivity2, string5, string7, string6, vVar, xVar, xVar2, (t6.c) null), 2);
                        } else if (!((CheckBox) loginActivity2.G0().f10133m.f8817l).isChecked()) {
                            String string8 = loginActivity2.getString(2131952018);
                            string8.getClass();
                            loginActivity2.A(string8);
                        } else if (((EditText) loginActivity2.G0().f10133m.f8819n).length() < 6) {
                            String string9 = loginActivity2.getString(2131952760);
                            string9.getClass();
                            loginActivity2.A(string9);
                        } else if (((EditText) loginActivity2.G0().f10133m.f8819n).length() > 99) {
                            String string10 = loginActivity2.getString(2131952758);
                            string10.getClass();
                            loginActivity2.A(string10);
                        } else if (!zMatches) {
                            String string11 = loginActivity2.getString(2131951995);
                            string11.getClass();
                            loginActivity2.A(string11);
                        } else {
                            String string12 = loginActivity2.getString(2131952022);
                            string12.getClass();
                            loginActivity2.A(string12);
                        }
                        break;
                    case 3:
                        loginActivity.V.handleOnBackPressed();
                        break;
                    case 4:
                        int i13 = LoginActivity.W;
                        if (((LinearLayout) loginActivity.G0().f10133m.f8816b).getVisibility() != 0) {
                            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                            alphaAnimation.setInterpolator(new AccelerateInterpolator());
                            alphaAnimation.setDuration(200L);
                            alphaAnimation.setAnimationListener(new l2(loginActivity, 0));
                            ((LinearLayout) loginActivity.G0().f10132l.f5272q).startAnimation(alphaAnimation);
                        }
                        break;
                    default:
                        int i14 = LoginActivity.W;
                        loginActivity.J0();
                        break;
                }
            }
        });
        G0().f10132l.f5269n.setTypeface(f4.c.f4882w);
        final int i10 = 5;
        G0().f10132l.f5269n.setOnClickListener(new View.OnClickListener(this) { // from class: c4.i2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginActivity f1711b;

            {
                this.f1711b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i62 = i10;
                LoginActivity loginActivity = this.f1711b;
                switch (i62) {
                    case 0:
                        int i102 = LoginActivity.W;
                        loginActivity.getOnBackPressedDispatcher().onBackPressed();
                        break;
                    case 1:
                        int i11 = LoginActivity.W;
                        Intent intent = new Intent(loginActivity.getApplicationContext(), (Class<?>) PasswordRecoveryActivity.class);
                        float f = UptodownApp.I;
                        loginActivity.startActivity(intent, b4.d.a(loginActivity));
                        break;
                    case 2:
                        int i12 = LoginActivity.W;
                        LoginActivity loginActivity2 = this.f1711b;
                        loginActivity2.I0();
                        x2 x2VarH0 = loginActivity2.H0();
                        String string = ((EditText) loginActivity2.G0().f10133m.f8818m).getText().toString();
                        x2VarH0.getClass();
                        string.getClass();
                        boolean zMatches = Pattern.compile("^(([^<>()\\[\\]\\\\.,;:\\s@“]+(\\.[^<>()\\[\\]\\\\.,;:\\s@“]+)*)|(“.+“))@((\\[\\d{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$").matcher(string).matches();
                        x2 x2VarH02 = loginActivity2.H0();
                        String string2 = ((EditText) loginActivity2.G0().f10133m.f8820o).getText().toString();
                        String string3 = ((EditText) loginActivity2.G0().f10133m.f8818m).getText().toString();
                        String string4 = ((EditText) loginActivity2.G0().f10133m.f8819n).getText().toString();
                        x2VarH02.getClass();
                        string2.getClass();
                        string3.getClass();
                        string4.getClass();
                        if (string2.length() > 0 && string3.length() > 0 && string4.length() > 5 && zMatches && ((CheckBox) loginActivity2.G0().f10133m.f8817l).isChecked()) {
                            String string5 = ((EditText) loginActivity2.G0().f10133m.f8820o).getText().toString();
                            String string6 = ((EditText) loginActivity2.G0().f10133m.f8818m).getText().toString();
                            String string7 = ((EditText) loginActivity2.G0().f10133m.f8819n).getText().toString();
                            x2 x2VarH03 = loginActivity2.H0();
                            x2VarH03.getClass();
                            string5.getClass();
                            string6.getClass();
                            string7.getClass();
                            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                            kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v();
                            kotlin.jvm.internal.x xVar2 = new kotlin.jvm.internal.x();
                            o7.a0 viewModelScope = ViewModelKt.getViewModelScope(x2VarH03);
                            v7.e eVar = o7.m0.f8288a;
                            o7.c0.s(viewModelScope, v7.d.f10884a, null, new w2(x2VarH03, loginActivity2, string5, string7, string6, vVar, xVar, xVar2, (t6.c) null), 2);
                        } else if (!((CheckBox) loginActivity2.G0().f10133m.f8817l).isChecked()) {
                            String string8 = loginActivity2.getString(2131952018);
                            string8.getClass();
                            loginActivity2.A(string8);
                        } else if (((EditText) loginActivity2.G0().f10133m.f8819n).length() < 6) {
                            String string9 = loginActivity2.getString(2131952760);
                            string9.getClass();
                            loginActivity2.A(string9);
                        } else if (((EditText) loginActivity2.G0().f10133m.f8819n).length() > 99) {
                            String string10 = loginActivity2.getString(2131952758);
                            string10.getClass();
                            loginActivity2.A(string10);
                        } else if (!zMatches) {
                            String string11 = loginActivity2.getString(2131951995);
                            string11.getClass();
                            loginActivity2.A(string11);
                        } else {
                            String string12 = loginActivity2.getString(2131952022);
                            string12.getClass();
                            loginActivity2.A(string12);
                        }
                        break;
                    case 3:
                        loginActivity.V.handleOnBackPressed();
                        break;
                    case 4:
                        int i13 = LoginActivity.W;
                        if (((LinearLayout) loginActivity.G0().f10133m.f8816b).getVisibility() != 0) {
                            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                            alphaAnimation.setInterpolator(new AccelerateInterpolator());
                            alphaAnimation.setDuration(200L);
                            alphaAnimation.setAnimationListener(new l2(loginActivity, 0));
                            ((LinearLayout) loginActivity.G0().f10132l.f5272q).startAnimation(alphaAnimation);
                        }
                        break;
                    default:
                        int i14 = LoginActivity.W;
                        loginActivity.J0();
                        break;
                }
            }
        });
        ((EditText) G0().f10132l.f5273r).setTypeface(f4.c.f4883x);
        final int i11 = 3;
        ((EditText) G0().f10132l.f5273r).setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: c4.j2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginActivity f1752b;

            {
                this.f1752b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z9) {
                int i12 = i11;
                LoginActivity loginActivity = this.f1752b;
                switch (i12) {
                    case 0:
                        int i13 = LoginActivity.W;
                        if (!z9) {
                            ((EditText) loginActivity.G0().f10133m.f8820o).setHint(loginActivity.getString(2131952063));
                        } else {
                            ((EditText) loginActivity.G0().f10133m.f8820o).setHint("");
                        }
                        break;
                    case 1:
                        int i14 = LoginActivity.W;
                        if (!z9) {
                            ((EditText) loginActivity.G0().f10133m.f8818m).setHint(loginActivity.getString(2131952062));
                        } else {
                            ((EditText) loginActivity.G0().f10133m.f8818m).setHint("");
                        }
                        break;
                    case 2:
                        int i15 = LoginActivity.W;
                        if (!z9) {
                            ((EditText) loginActivity.G0().f10133m.f8819n).setHint(loginActivity.getString(2131952064));
                        } else {
                            ((EditText) loginActivity.G0().f10133m.f8819n).setHint("");
                        }
                        break;
                    case 3:
                        int i16 = LoginActivity.W;
                        if (!z9) {
                            ((EditText) loginActivity.G0().f10132l.f5273r).setHint(loginActivity.getString(2131952062));
                        } else {
                            ((EditText) loginActivity.G0().f10132l.f5273r).setHint("");
                        }
                        break;
                    default:
                        int i17 = LoginActivity.W;
                        if (!z9) {
                            loginActivity.G0().f10132l.f5267l.setHint(loginActivity.getString(2131952064));
                        } else {
                            loginActivity.G0().f10132l.f5267l.setHint("");
                        }
                        break;
                }
            }
        });
        G0().f10132l.f5267l.setTypeface(f4.c.f4883x);
        int i12 = 6;
        G0().f10132l.f5267l.setImeOptions(6);
        G0().f10132l.f5267l.setOnEditorActionListener(new k2(this, i));
        G0().f10132l.f5267l.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: c4.j2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginActivity f1752b;

            {
                this.f1752b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z9) {
                int i122 = i6;
                LoginActivity loginActivity = this.f1752b;
                switch (i122) {
                    case 0:
                        int i13 = LoginActivity.W;
                        if (!z9) {
                            ((EditText) loginActivity.G0().f10133m.f8820o).setHint(loginActivity.getString(2131952063));
                        } else {
                            ((EditText) loginActivity.G0().f10133m.f8820o).setHint("");
                        }
                        break;
                    case 1:
                        int i14 = LoginActivity.W;
                        if (!z9) {
                            ((EditText) loginActivity.G0().f10133m.f8818m).setHint(loginActivity.getString(2131952062));
                        } else {
                            ((EditText) loginActivity.G0().f10133m.f8818m).setHint("");
                        }
                        break;
                    case 2:
                        int i15 = LoginActivity.W;
                        if (!z9) {
                            ((EditText) loginActivity.G0().f10133m.f8819n).setHint(loginActivity.getString(2131952064));
                        } else {
                            ((EditText) loginActivity.G0().f10133m.f8819n).setHint("");
                        }
                        break;
                    case 3:
                        int i16 = LoginActivity.W;
                        if (!z9) {
                            ((EditText) loginActivity.G0().f10132l.f5273r).setHint(loginActivity.getString(2131952062));
                        } else {
                            ((EditText) loginActivity.G0().f10132l.f5273r).setHint("");
                        }
                        break;
                    default:
                        int i17 = LoginActivity.W;
                        if (!z9) {
                            loginActivity.G0().f10132l.f5267l.setHint(loginActivity.getString(2131952064));
                        } else {
                            loginActivity.G0().f10132l.f5267l.setHint("");
                        }
                        break;
                }
            }
        });
        Drawable[] compoundDrawables = G0().f10132l.f5267l.getCompoundDrawables();
        compoundDrawables.getClass();
        Drawable drawable2 = compoundDrawables[0];
        if (drawable2 != null) {
            drawable2.setColorFilter(ContextCompat.getColor(this, 2131100824), PorterDuff.Mode.SRC_ATOP);
        }
        TextView textView = (TextView) findViewById(2131364144);
        final int i13 = 1;
        if (textView != null) {
            textView.setTypeface(f4.c.f4882w);
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: c4.i2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ LoginActivity f1711b;

                {
                    this.f1711b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i62 = i13;
                    LoginActivity loginActivity = this.f1711b;
                    switch (i62) {
                        case 0:
                            int i102 = LoginActivity.W;
                            loginActivity.getOnBackPressedDispatcher().onBackPressed();
                            break;
                        case 1:
                            int i112 = LoginActivity.W;
                            Intent intent = new Intent(loginActivity.getApplicationContext(), (Class<?>) PasswordRecoveryActivity.class);
                            float f = UptodownApp.I;
                            loginActivity.startActivity(intent, b4.d.a(loginActivity));
                            break;
                        case 2:
                            int i122 = LoginActivity.W;
                            LoginActivity loginActivity2 = this.f1711b;
                            loginActivity2.I0();
                            x2 x2VarH0 = loginActivity2.H0();
                            String string = ((EditText) loginActivity2.G0().f10133m.f8818m).getText().toString();
                            x2VarH0.getClass();
                            string.getClass();
                            boolean zMatches = Pattern.compile("^(([^<>()\\[\\]\\\\.,;:\\s@“]+(\\.[^<>()\\[\\]\\\\.,;:\\s@“]+)*)|(“.+“))@((\\[\\d{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$").matcher(string).matches();
                            x2 x2VarH02 = loginActivity2.H0();
                            String string2 = ((EditText) loginActivity2.G0().f10133m.f8820o).getText().toString();
                            String string3 = ((EditText) loginActivity2.G0().f10133m.f8818m).getText().toString();
                            String string4 = ((EditText) loginActivity2.G0().f10133m.f8819n).getText().toString();
                            x2VarH02.getClass();
                            string2.getClass();
                            string3.getClass();
                            string4.getClass();
                            if (string2.length() > 0 && string3.length() > 0 && string4.length() > 5 && zMatches && ((CheckBox) loginActivity2.G0().f10133m.f8817l).isChecked()) {
                                String string5 = ((EditText) loginActivity2.G0().f10133m.f8820o).getText().toString();
                                String string6 = ((EditText) loginActivity2.G0().f10133m.f8818m).getText().toString();
                                String string7 = ((EditText) loginActivity2.G0().f10133m.f8819n).getText().toString();
                                x2 x2VarH03 = loginActivity2.H0();
                                x2VarH03.getClass();
                                string5.getClass();
                                string6.getClass();
                                string7.getClass();
                                kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                                kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v();
                                kotlin.jvm.internal.x xVar2 = new kotlin.jvm.internal.x();
                                o7.a0 viewModelScope = ViewModelKt.getViewModelScope(x2VarH03);
                                v7.e eVar = o7.m0.f8288a;
                                o7.c0.s(viewModelScope, v7.d.f10884a, null, new w2(x2VarH03, loginActivity2, string5, string7, string6, vVar, xVar, xVar2, (t6.c) null), 2);
                            } else if (!((CheckBox) loginActivity2.G0().f10133m.f8817l).isChecked()) {
                                String string8 = loginActivity2.getString(2131952018);
                                string8.getClass();
                                loginActivity2.A(string8);
                            } else if (((EditText) loginActivity2.G0().f10133m.f8819n).length() < 6) {
                                String string9 = loginActivity2.getString(2131952760);
                                string9.getClass();
                                loginActivity2.A(string9);
                            } else if (((EditText) loginActivity2.G0().f10133m.f8819n).length() > 99) {
                                String string10 = loginActivity2.getString(2131952758);
                                string10.getClass();
                                loginActivity2.A(string10);
                            } else if (!zMatches) {
                                String string11 = loginActivity2.getString(2131951995);
                                string11.getClass();
                                loginActivity2.A(string11);
                            } else {
                                String string12 = loginActivity2.getString(2131952022);
                                string12.getClass();
                                loginActivity2.A(string12);
                            }
                            break;
                        case 3:
                            loginActivity.V.handleOnBackPressed();
                            break;
                        case 4:
                            int i132 = LoginActivity.W;
                            if (((LinearLayout) loginActivity.G0().f10133m.f8816b).getVisibility() != 0) {
                                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                                alphaAnimation.setInterpolator(new AccelerateInterpolator());
                                alphaAnimation.setDuration(200L);
                                alphaAnimation.setAnimationListener(new l2(loginActivity, 0));
                                ((LinearLayout) loginActivity.G0().f10132l.f5272q).startAnimation(alphaAnimation);
                            }
                            break;
                        default:
                            int i14 = LoginActivity.W;
                            loginActivity.J0();
                            break;
                    }
                }
            });
        }
        ((TextView) G0().f10133m.f8825t).setTypeface(f4.c.f4882w);
        final int i14 = 2;
        ((TextView) G0().f10133m.f8825t).setOnClickListener(new View.OnClickListener(this) { // from class: c4.i2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginActivity f1711b;

            {
                this.f1711b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i62 = i14;
                LoginActivity loginActivity = this.f1711b;
                switch (i62) {
                    case 0:
                        int i102 = LoginActivity.W;
                        loginActivity.getOnBackPressedDispatcher().onBackPressed();
                        break;
                    case 1:
                        int i112 = LoginActivity.W;
                        Intent intent = new Intent(loginActivity.getApplicationContext(), (Class<?>) PasswordRecoveryActivity.class);
                        float f = UptodownApp.I;
                        loginActivity.startActivity(intent, b4.d.a(loginActivity));
                        break;
                    case 2:
                        int i122 = LoginActivity.W;
                        LoginActivity loginActivity2 = this.f1711b;
                        loginActivity2.I0();
                        x2 x2VarH0 = loginActivity2.H0();
                        String string = ((EditText) loginActivity2.G0().f10133m.f8818m).getText().toString();
                        x2VarH0.getClass();
                        string.getClass();
                        boolean zMatches = Pattern.compile("^(([^<>()\\[\\]\\\\.,;:\\s@“]+(\\.[^<>()\\[\\]\\\\.,;:\\s@“]+)*)|(“.+“))@((\\[\\d{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$").matcher(string).matches();
                        x2 x2VarH02 = loginActivity2.H0();
                        String string2 = ((EditText) loginActivity2.G0().f10133m.f8820o).getText().toString();
                        String string3 = ((EditText) loginActivity2.G0().f10133m.f8818m).getText().toString();
                        String string4 = ((EditText) loginActivity2.G0().f10133m.f8819n).getText().toString();
                        x2VarH02.getClass();
                        string2.getClass();
                        string3.getClass();
                        string4.getClass();
                        if (string2.length() > 0 && string3.length() > 0 && string4.length() > 5 && zMatches && ((CheckBox) loginActivity2.G0().f10133m.f8817l).isChecked()) {
                            String string5 = ((EditText) loginActivity2.G0().f10133m.f8820o).getText().toString();
                            String string6 = ((EditText) loginActivity2.G0().f10133m.f8818m).getText().toString();
                            String string7 = ((EditText) loginActivity2.G0().f10133m.f8819n).getText().toString();
                            x2 x2VarH03 = loginActivity2.H0();
                            x2VarH03.getClass();
                            string5.getClass();
                            string6.getClass();
                            string7.getClass();
                            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                            kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v();
                            kotlin.jvm.internal.x xVar2 = new kotlin.jvm.internal.x();
                            o7.a0 viewModelScope = ViewModelKt.getViewModelScope(x2VarH03);
                            v7.e eVar = o7.m0.f8288a;
                            o7.c0.s(viewModelScope, v7.d.f10884a, null, new w2(x2VarH03, loginActivity2, string5, string7, string6, vVar, xVar, xVar2, (t6.c) null), 2);
                        } else if (!((CheckBox) loginActivity2.G0().f10133m.f8817l).isChecked()) {
                            String string8 = loginActivity2.getString(2131952018);
                            string8.getClass();
                            loginActivity2.A(string8);
                        } else if (((EditText) loginActivity2.G0().f10133m.f8819n).length() < 6) {
                            String string9 = loginActivity2.getString(2131952760);
                            string9.getClass();
                            loginActivity2.A(string9);
                        } else if (((EditText) loginActivity2.G0().f10133m.f8819n).length() > 99) {
                            String string10 = loginActivity2.getString(2131952758);
                            string10.getClass();
                            loginActivity2.A(string10);
                        } else if (!zMatches) {
                            String string11 = loginActivity2.getString(2131951995);
                            string11.getClass();
                            loginActivity2.A(string11);
                        } else {
                            String string12 = loginActivity2.getString(2131952022);
                            string12.getClass();
                            loginActivity2.A(string12);
                        }
                        break;
                    case 3:
                        loginActivity.V.handleOnBackPressed();
                        break;
                    case 4:
                        int i132 = LoginActivity.W;
                        if (((LinearLayout) loginActivity.G0().f10133m.f8816b).getVisibility() != 0) {
                            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                            alphaAnimation.setInterpolator(new AccelerateInterpolator());
                            alphaAnimation.setDuration(200L);
                            alphaAnimation.setAnimationListener(new l2(loginActivity, 0));
                            ((LinearLayout) loginActivity.G0().f10132l.f5272q).startAnimation(alphaAnimation);
                        }
                        break;
                    default:
                        int i142 = LoginActivity.W;
                        loginActivity.J0();
                        break;
                }
            }
        });
        ((EditText) G0().f10133m.f8820o).setTypeface(f4.c.f4883x);
        ((EditText) G0().f10133m.f8820o).setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: c4.j2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginActivity f1752b;

            {
                this.f1752b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z9) {
                int i122 = i;
                LoginActivity loginActivity = this.f1752b;
                switch (i122) {
                    case 0:
                        int i132 = LoginActivity.W;
                        if (!z9) {
                            ((EditText) loginActivity.G0().f10133m.f8820o).setHint(loginActivity.getString(2131952063));
                        } else {
                            ((EditText) loginActivity.G0().f10133m.f8820o).setHint("");
                        }
                        break;
                    case 1:
                        int i142 = LoginActivity.W;
                        if (!z9) {
                            ((EditText) loginActivity.G0().f10133m.f8818m).setHint(loginActivity.getString(2131952062));
                        } else {
                            ((EditText) loginActivity.G0().f10133m.f8818m).setHint("");
                        }
                        break;
                    case 2:
                        int i15 = LoginActivity.W;
                        if (!z9) {
                            ((EditText) loginActivity.G0().f10133m.f8819n).setHint(loginActivity.getString(2131952064));
                        } else {
                            ((EditText) loginActivity.G0().f10133m.f8819n).setHint("");
                        }
                        break;
                    case 3:
                        int i16 = LoginActivity.W;
                        if (!z9) {
                            ((EditText) loginActivity.G0().f10132l.f5273r).setHint(loginActivity.getString(2131952062));
                        } else {
                            ((EditText) loginActivity.G0().f10132l.f5273r).setHint("");
                        }
                        break;
                    default:
                        int i17 = LoginActivity.W;
                        if (!z9) {
                            loginActivity.G0().f10132l.f5267l.setHint(loginActivity.getString(2131952064));
                        } else {
                            loginActivity.G0().f10132l.f5267l.setHint("");
                        }
                        break;
                }
            }
        });
        ((TextView) G0().f10133m.f8822q).setTypeface(f4.c.f4882w);
        ((TextView) G0().f10133m.f8822q).setOnClickListener(new View.OnClickListener(this) { // from class: c4.i2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginActivity f1711b;

            {
                this.f1711b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i62 = i11;
                LoginActivity loginActivity = this.f1711b;
                switch (i62) {
                    case 0:
                        int i102 = LoginActivity.W;
                        loginActivity.getOnBackPressedDispatcher().onBackPressed();
                        break;
                    case 1:
                        int i112 = LoginActivity.W;
                        Intent intent = new Intent(loginActivity.getApplicationContext(), (Class<?>) PasswordRecoveryActivity.class);
                        float f = UptodownApp.I;
                        loginActivity.startActivity(intent, b4.d.a(loginActivity));
                        break;
                    case 2:
                        int i122 = LoginActivity.W;
                        LoginActivity loginActivity2 = this.f1711b;
                        loginActivity2.I0();
                        x2 x2VarH0 = loginActivity2.H0();
                        String string = ((EditText) loginActivity2.G0().f10133m.f8818m).getText().toString();
                        x2VarH0.getClass();
                        string.getClass();
                        boolean zMatches = Pattern.compile("^(([^<>()\\[\\]\\\\.,;:\\s@“]+(\\.[^<>()\\[\\]\\\\.,;:\\s@“]+)*)|(“.+“))@((\\[\\d{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$").matcher(string).matches();
                        x2 x2VarH02 = loginActivity2.H0();
                        String string2 = ((EditText) loginActivity2.G0().f10133m.f8820o).getText().toString();
                        String string3 = ((EditText) loginActivity2.G0().f10133m.f8818m).getText().toString();
                        String string4 = ((EditText) loginActivity2.G0().f10133m.f8819n).getText().toString();
                        x2VarH02.getClass();
                        string2.getClass();
                        string3.getClass();
                        string4.getClass();
                        if (string2.length() > 0 && string3.length() > 0 && string4.length() > 5 && zMatches && ((CheckBox) loginActivity2.G0().f10133m.f8817l).isChecked()) {
                            String string5 = ((EditText) loginActivity2.G0().f10133m.f8820o).getText().toString();
                            String string6 = ((EditText) loginActivity2.G0().f10133m.f8818m).getText().toString();
                            String string7 = ((EditText) loginActivity2.G0().f10133m.f8819n).getText().toString();
                            x2 x2VarH03 = loginActivity2.H0();
                            x2VarH03.getClass();
                            string5.getClass();
                            string6.getClass();
                            string7.getClass();
                            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                            kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v();
                            kotlin.jvm.internal.x xVar2 = new kotlin.jvm.internal.x();
                            o7.a0 viewModelScope = ViewModelKt.getViewModelScope(x2VarH03);
                            v7.e eVar = o7.m0.f8288a;
                            o7.c0.s(viewModelScope, v7.d.f10884a, null, new w2(x2VarH03, loginActivity2, string5, string7, string6, vVar, xVar, xVar2, (t6.c) null), 2);
                        } else if (!((CheckBox) loginActivity2.G0().f10133m.f8817l).isChecked()) {
                            String string8 = loginActivity2.getString(2131952018);
                            string8.getClass();
                            loginActivity2.A(string8);
                        } else if (((EditText) loginActivity2.G0().f10133m.f8819n).length() < 6) {
                            String string9 = loginActivity2.getString(2131952760);
                            string9.getClass();
                            loginActivity2.A(string9);
                        } else if (((EditText) loginActivity2.G0().f10133m.f8819n).length() > 99) {
                            String string10 = loginActivity2.getString(2131952758);
                            string10.getClass();
                            loginActivity2.A(string10);
                        } else if (!zMatches) {
                            String string11 = loginActivity2.getString(2131951995);
                            string11.getClass();
                            loginActivity2.A(string11);
                        } else {
                            String string12 = loginActivity2.getString(2131952022);
                            string12.getClass();
                            loginActivity2.A(string12);
                        }
                        break;
                    case 3:
                        loginActivity.V.handleOnBackPressed();
                        break;
                    case 4:
                        int i132 = LoginActivity.W;
                        if (((LinearLayout) loginActivity.G0().f10133m.f8816b).getVisibility() != 0) {
                            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                            alphaAnimation.setInterpolator(new AccelerateInterpolator());
                            alphaAnimation.setDuration(200L);
                            alphaAnimation.setAnimationListener(new l2(loginActivity, 0));
                            ((LinearLayout) loginActivity.G0().f10132l.f5272q).startAnimation(alphaAnimation);
                        }
                        break;
                    default:
                        int i142 = LoginActivity.W;
                        loginActivity.J0();
                        break;
                }
            }
        });
        ((EditText) G0().f10133m.f8818m).setTypeface(f4.c.f4883x);
        ((EditText) G0().f10133m.f8818m).setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: c4.j2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginActivity f1752b;

            {
                this.f1752b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z9) {
                int i122 = i13;
                LoginActivity loginActivity = this.f1752b;
                switch (i122) {
                    case 0:
                        int i132 = LoginActivity.W;
                        if (!z9) {
                            ((EditText) loginActivity.G0().f10133m.f8820o).setHint(loginActivity.getString(2131952063));
                        } else {
                            ((EditText) loginActivity.G0().f10133m.f8820o).setHint("");
                        }
                        break;
                    case 1:
                        int i142 = LoginActivity.W;
                        if (!z9) {
                            ((EditText) loginActivity.G0().f10133m.f8818m).setHint(loginActivity.getString(2131952062));
                        } else {
                            ((EditText) loginActivity.G0().f10133m.f8818m).setHint("");
                        }
                        break;
                    case 2:
                        int i15 = LoginActivity.W;
                        if (!z9) {
                            ((EditText) loginActivity.G0().f10133m.f8819n).setHint(loginActivity.getString(2131952064));
                        } else {
                            ((EditText) loginActivity.G0().f10133m.f8819n).setHint("");
                        }
                        break;
                    case 3:
                        int i16 = LoginActivity.W;
                        if (!z9) {
                            ((EditText) loginActivity.G0().f10132l.f5273r).setHint(loginActivity.getString(2131952062));
                        } else {
                            ((EditText) loginActivity.G0().f10132l.f5273r).setHint("");
                        }
                        break;
                    default:
                        int i17 = LoginActivity.W;
                        if (!z9) {
                            loginActivity.G0().f10132l.f5267l.setHint(loginActivity.getString(2131952064));
                        } else {
                            loginActivity.G0().f10132l.f5267l.setHint("");
                        }
                        break;
                }
            }
        });
        ((EditText) G0().f10133m.f8819n).setTypeface(f4.c.f4883x);
        ((EditText) G0().f10133m.f8819n).setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: c4.j2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginActivity f1752b;

            {
                this.f1752b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z9) {
                int i122 = i14;
                LoginActivity loginActivity = this.f1752b;
                switch (i122) {
                    case 0:
                        int i132 = LoginActivity.W;
                        if (!z9) {
                            ((EditText) loginActivity.G0().f10133m.f8820o).setHint(loginActivity.getString(2131952063));
                        } else {
                            ((EditText) loginActivity.G0().f10133m.f8820o).setHint("");
                        }
                        break;
                    case 1:
                        int i142 = LoginActivity.W;
                        if (!z9) {
                            ((EditText) loginActivity.G0().f10133m.f8818m).setHint(loginActivity.getString(2131952062));
                        } else {
                            ((EditText) loginActivity.G0().f10133m.f8818m).setHint("");
                        }
                        break;
                    case 2:
                        int i15 = LoginActivity.W;
                        if (!z9) {
                            ((EditText) loginActivity.G0().f10133m.f8819n).setHint(loginActivity.getString(2131952064));
                        } else {
                            ((EditText) loginActivity.G0().f10133m.f8819n).setHint("");
                        }
                        break;
                    case 3:
                        int i16 = LoginActivity.W;
                        if (!z9) {
                            ((EditText) loginActivity.G0().f10132l.f5273r).setHint(loginActivity.getString(2131952062));
                        } else {
                            ((EditText) loginActivity.G0().f10132l.f5273r).setHint("");
                        }
                        break;
                    default:
                        int i17 = LoginActivity.W;
                        if (!z9) {
                            loginActivity.G0().f10132l.f5267l.setHint(loginActivity.getString(2131952064));
                        } else {
                            loginActivity.G0().f10132l.f5267l.setHint("");
                        }
                        break;
                }
            }
        });
        Drawable[] compoundDrawables2 = ((EditText) G0().f10133m.f8819n).getCompoundDrawables();
        compoundDrawables2.getClass();
        Drawable drawable3 = compoundDrawables2[0];
        if (drawable3 != null) {
            drawable3.setColorFilter(ContextCompat.getColor(this, 2131100824), PorterDuff.Mode.SRC_ATOP);
        }
        ((CheckBox) G0().f10133m.f8817l).setTypeface(f4.c.f4883x);
        ((CheckBox) G0().f10133m.f8817l).setMovementMethod(LinkMovementMethod.getInstance());
        u uVarG0 = G0();
        uVarG0.getClass();
        g4.u uVar = uVarG0.f10132l;
        uVar.f5270o.setTypeface(f4.c.f4882w);
        uVar.f5266b.setOnClickListener(new c4.d(this, i12));
        h hVar = uVarG0.f10133m;
        ((TextView) hVar.f8824s).setTypeface(f4.c.f4882w);
        ((RelativeLayout) hVar.f8821p).setOnClickListener(new c4.d(this, i12));
        ((TextView) findViewById(2131364391)).setTypeface(f4.c.f4882w);
        ((TextView) findViewById(2131363770)).setTypeface(f4.c.f4883x);
        ((TextView) findViewById(2131364390)).setTypeface(f4.c.f4882w);
        ((TextView) findViewById(2131363769)).setTypeface(f4.c.f4883x);
        ((TextView) findViewById(2131364415)).setTypeface(f4.c.f4882w);
        ((TextView) findViewById(2131363779)).setTypeface(f4.c.f4883x);
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        p7.c cVar = n.f10348a;
        c cVar2 = null;
        c0.s(lifecycleScope, cVar, null, new n2(this, cVar2, i), 2);
        c0.s(LifecycleOwnerKt.getLifecycleScope(this), cVar, null, new n2(this, cVar2, i13), 2);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        Drawable drawable = this.U;
        if (drawable != null) {
            drawable.getClass();
            DrawableCompat.setTintList(drawable, null);
        }
        getWindow().getDecorView().setSystemUiVisibility(0);
        super.onDestroy();
    }

    @Override // c4.k0, g4.s0, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        SharedPreferences sharedPreferences;
        super.onResume();
        I0();
        SharedPreferences sharedPreferences2 = getSharedPreferences("SharedPreferencesUser", 0);
        try {
            sharedPreferences = getSharedPreferences("SettingsPreferences", 0);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        String string = sharedPreferences.contains("UTOKEN") ? sharedPreferences.getString("UTOKEN", null) : null;
        if ((string == null && sharedPreferences2.getString("is_turbo", null) == null) ? false : true) {
            finish();
        }
    }

    @Override // c4.t2
    public final void y0() {
        G0().f10131b.setVisibility(8);
    }
}
