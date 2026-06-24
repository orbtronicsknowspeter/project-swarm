package com.uptodown.activities;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import b.s;
import b5.l;
import b6.g;
import c4.cd;
import c4.ed;
import c4.fd;
import c4.id;
import c4.k0;
import c4.w6;
import com.uptodown.R;
import com.uptodown.activities.UsernameEditActivity;
import com.uptodown.util.views.UsernameTextView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.x;
import kotlin.jvm.internal.y;
import o7.c0;
import o7.m0;
import p6.m;
import t4.h1;
import t6.c;
import t7.n;
import v7.d;
import v7.e;
import x4.w2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class UsernameEditActivity extends k0 {
    public static final /* synthetic */ int R = 0;
    public w2 O;
    public final ViewModelLazy P = new ViewModelLazy(y.a(id.class), new fd(this, 0), new ed(this), new fd(this, 1));
    public final m Q = new m(new w6(this, 14));

    @Override // c4.k0, g4.h, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        UsernameEditActivity usernameEditActivity;
        String str;
        Bundle extras;
        Spanned spannedFromHtml;
        super.onCreate(bundle);
        RelativeLayout relativeLayout = y0().f9846a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        final int i = 2;
        c cVar = null;
        if (getIntent() == null || (extras = getIntent().getExtras()) == null || !extras.containsKey("user")) {
            usernameEditActivity = this;
        } else {
            int i6 = Build.VERSION.SDK_INT;
            this.O = (w2) (i6 >= 34 ? (Parcelable) extras.getParcelable("user", w2.class) : extras.getParcelable("user"));
            Drawable drawable = ContextCompat.getDrawable(this, R.drawable.core_vector_back);
            final int i10 = 0;
            if (drawable != null) {
                y0().f9859x.setNavigationIcon(drawable);
                y0().f9859x.setNavigationContentDescription(getString(R.string.back));
                y0().f9859x.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: c4.ad

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ UsernameEditActivity f1399b;

                    {
                        this.f1399b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SharedPreferences sharedPreferences;
                        int i11 = i10;
                        UsernameEditActivity usernameEditActivity2 = this.f1399b;
                        switch (i11) {
                            case 0:
                                int i12 = UsernameEditActivity.R;
                                usernameEditActivity2.getOnBackPressedDispatcher().onBackPressed();
                                break;
                            case 1:
                                int i13 = UsernameEditActivity.R;
                                usernameEditActivity2.w0();
                                break;
                            case 2:
                                int i14 = UsernameEditActivity.R;
                                usernameEditActivity2.w0();
                                break;
                            case 3:
                                int i15 = UsernameEditActivity.R;
                                usernameEditActivity2.w0();
                                break;
                            case 4:
                                if (usernameEditActivity2.O != null) {
                                    SharedPreferences sharedPreferences2 = usernameEditActivity2.getSharedPreferences("SharedPreferencesUser", 0);
                                    try {
                                        sharedPreferences = usernameEditActivity2.getSharedPreferences("SettingsPreferences", 0);
                                    } catch (Exception e10) {
                                        e10.printStackTrace();
                                    }
                                    String string = sharedPreferences.contains("UTOKEN") ? sharedPreferences.getString("UTOKEN", null) : null;
                                    if (string != null || sharedPreferences2.getString("is_turbo", null) != null) {
                                        x4.w2 w2Var = usernameEditActivity2.O;
                                        w2Var.getClass();
                                        if (w2Var.d()) {
                                        }
                                    }
                                }
                                j5.c.e(usernameEditActivity2, d0.b.H(usernameEditActivity2), null);
                                break;
                            case 5:
                                int i16 = UsernameEditActivity.R;
                                usernameEditActivity2.w0();
                                break;
                            default:
                                int i17 = UsernameEditActivity.R;
                                usernameEditActivity2.w0();
                                break;
                        }
                    }
                });
            }
            y0().A.setTypeface(f4.c.f4883w);
            y0().C.setTypeface(f4.c.f4884x);
            y0().B.setTypeface(f4.c.f4884x);
            final int i11 = 4;
            y0().f9851o.setOnClickListener(new View.OnClickListener(this) { // from class: c4.ad

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ UsernameEditActivity f1399b;

                {
                    this.f1399b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SharedPreferences sharedPreferences;
                    int i112 = i11;
                    UsernameEditActivity usernameEditActivity2 = this.f1399b;
                    switch (i112) {
                        case 0:
                            int i12 = UsernameEditActivity.R;
                            usernameEditActivity2.getOnBackPressedDispatcher().onBackPressed();
                            break;
                        case 1:
                            int i13 = UsernameEditActivity.R;
                            usernameEditActivity2.w0();
                            break;
                        case 2:
                            int i14 = UsernameEditActivity.R;
                            usernameEditActivity2.w0();
                            break;
                        case 3:
                            int i15 = UsernameEditActivity.R;
                            usernameEditActivity2.w0();
                            break;
                        case 4:
                            if (usernameEditActivity2.O != null) {
                                SharedPreferences sharedPreferences2 = usernameEditActivity2.getSharedPreferences("SharedPreferencesUser", 0);
                                try {
                                    sharedPreferences = usernameEditActivity2.getSharedPreferences("SettingsPreferences", 0);
                                } catch (Exception e10) {
                                    e10.printStackTrace();
                                }
                                String string = sharedPreferences.contains("UTOKEN") ? sharedPreferences.getString("UTOKEN", null) : null;
                                if (string != null || sharedPreferences2.getString("is_turbo", null) != null) {
                                    x4.w2 w2Var = usernameEditActivity2.O;
                                    w2Var.getClass();
                                    if (w2Var.d()) {
                                    }
                                }
                            }
                            j5.c.e(usernameEditActivity2, d0.b.H(usernameEditActivity2), null);
                            break;
                        case 5:
                            int i16 = UsernameEditActivity.R;
                            usernameEditActivity2.w0();
                            break;
                        default:
                            int i17 = UsernameEditActivity.R;
                            usernameEditActivity2.w0();
                            break;
                    }
                }
            });
            y0().f9847b.setTypeface(f4.c.f4884x);
            EditText editText = y0().f9847b;
            w2 w2Var = this.O;
            w2Var.getClass();
            editText.setText(w2Var.f11435m);
            y0().E.setTypeface(f4.c.f4883w);
            y0().f9861z.setTypeface(f4.c.f4884x);
            y0().f9860y.setTypeface(f4.c.f4884x);
            y0().D.setTypeface(f4.c.f4884x);
            y0().F.setTypeface(f4.c.f4883w);
            y0().G.setTypeface(f4.c.f4883w);
            y0().H.setTypeface(f4.c.f4883w);
            y0().I.setTypeface(f4.c.f4883w);
            UsernameTextView usernameTextView = y0().F;
            w2 w2Var2 = this.O;
            w2Var2.getClass();
            usernameTextView.setText(w2Var2.f11435m);
            UsernameTextView usernameTextView2 = y0().G;
            w2 w2Var3 = this.O;
            w2Var3.getClass();
            usernameTextView2.setText(w2Var3.f11435m);
            UsernameTextView usernameTextView3 = y0().H;
            w2 w2Var4 = this.O;
            w2Var4.getClass();
            usernameTextView3.setText(w2Var4.f11435m);
            UsernameTextView usernameTextView4 = y0().I;
            w2 w2Var5 = this.O;
            w2Var5.getClass();
            usernameTextView4.setText(w2Var5.f11435m);
            final v vVar = new v();
            final x xVar = new x();
            xVar.f7025a = "type0";
            final int i12 = 1;
            y0().f9856t.setOnClickListener(new View.OnClickListener(this) { // from class: c4.bd

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ UsernameEditActivity f1439b;

                {
                    this.f1439b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i13 = i12;
                    UsernameEditActivity usernameEditActivity2 = this.f1439b;
                    kotlin.jvm.internal.x xVar2 = xVar;
                    kotlin.jvm.internal.v vVar2 = vVar;
                    switch (i13) {
                        case 0:
                            int i14 = UsernameEditActivity.R;
                            Activity activity = f4.c.f4876o;
                            UsernameEditActivity usernameEditActivity3 = this.f1439b;
                            t0.f.h(usernameEditActivity3, usernameEditActivity3.y0().f9847b);
                            if (usernameEditActivity3.y0().f9847b.getText().toString().length() == 0) {
                                String string = usernameEditActivity3.getString(R.string.error_email_vacio_recuperar_pass);
                                string.getClass();
                                usernameEditActivity3.A(string);
                            } else if (usernameEditActivity3.y0().f9847b.getText().toString().length() < 3) {
                                String string2 = usernameEditActivity3.getString(R.string.validation_three_chars_min);
                                string2.getClass();
                                usernameEditActivity3.A(string2);
                            } else if (usernameEditActivity3.y0().f9847b.getText().toString().length() <= 99) {
                                String string3 = usernameEditActivity3.y0().f9847b.getText().toString();
                                Pattern patternCompile = Pattern.compile("^[a-zA-Z0-9_]+$");
                                patternCompile.getClass();
                                string3.getClass();
                                if (!patternCompile.matcher(string3).matches()) {
                                    String string4 = usernameEditActivity3.getString(R.string.validation_username_chars_type);
                                    string4.getClass();
                                    usernameEditActivity3.A(string4);
                                } else {
                                    id idVar = (id) usernameEditActivity3.P.getValue();
                                    String string5 = usernameEditActivity3.y0().f9847b.getText().toString();
                                    x4.w2 w2Var6 = usernameEditActivity3.O;
                                    int i15 = vVar2.f7023a;
                                    String str2 = (String) xVar2.f7025a;
                                    idVar.getClass();
                                    string5.getClass();
                                    str2.getClass();
                                    kotlin.jvm.internal.v vVar3 = new kotlin.jvm.internal.v();
                                    kotlin.jvm.internal.x xVar3 = new kotlin.jvm.internal.x();
                                    o7.a0 viewModelScope = ViewModelKt.getViewModelScope(idVar);
                                    v7.e eVar = o7.m0.f8289a;
                                    o7.c0.s(viewModelScope, v7.d.f10885a, null, new hd(idVar, usernameEditActivity3, string5, i15, xVar3, vVar3, w2Var6, str2, null), 2);
                                }
                            } else {
                                String string6 = usernameEditActivity3.getString(R.string.validation_hundred_chars_max);
                                string6.getClass();
                                usernameEditActivity3.A(string6);
                            }
                            break;
                        case 1:
                            int i16 = UsernameEditActivity.R;
                            usernameEditActivity2.y0().f9857u.setChecked(false);
                            usernameEditActivity2.y0().v.setChecked(false);
                            usernameEditActivity2.y0().f9858w.setChecked(false);
                            vVar2.f7023a = 0;
                            xVar2.f7025a = "type0";
                            break;
                        case 2:
                            int i17 = UsernameEditActivity.R;
                            usernameEditActivity2.y0().f9856t.setChecked(false);
                            usernameEditActivity2.y0().v.setChecked(false);
                            usernameEditActivity2.y0().f9858w.setChecked(false);
                            vVar2.f7023a = 1;
                            xVar2.f7025a = "type1";
                            break;
                        case 3:
                            int i18 = UsernameEditActivity.R;
                            usernameEditActivity2.y0().f9856t.setChecked(false);
                            usernameEditActivity2.y0().f9857u.setChecked(false);
                            usernameEditActivity2.y0().f9858w.setChecked(false);
                            vVar2.f7023a = 2;
                            xVar2.f7025a = "type2";
                            break;
                        default:
                            int i19 = UsernameEditActivity.R;
                            usernameEditActivity2.y0().f9856t.setChecked(false);
                            usernameEditActivity2.y0().f9857u.setChecked(false);
                            usernameEditActivity2.y0().v.setChecked(false);
                            vVar2.f7023a = 3;
                            xVar2.f7025a = "type3";
                            break;
                    }
                }
            });
            y0().f9857u.setOnClickListener(new View.OnClickListener(this) { // from class: c4.bd

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ UsernameEditActivity f1439b;

                {
                    this.f1439b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i13 = i;
                    UsernameEditActivity usernameEditActivity2 = this.f1439b;
                    kotlin.jvm.internal.x xVar2 = xVar;
                    kotlin.jvm.internal.v vVar2 = vVar;
                    switch (i13) {
                        case 0:
                            int i14 = UsernameEditActivity.R;
                            Activity activity = f4.c.f4876o;
                            UsernameEditActivity usernameEditActivity3 = this.f1439b;
                            t0.f.h(usernameEditActivity3, usernameEditActivity3.y0().f9847b);
                            if (usernameEditActivity3.y0().f9847b.getText().toString().length() == 0) {
                                String string = usernameEditActivity3.getString(R.string.error_email_vacio_recuperar_pass);
                                string.getClass();
                                usernameEditActivity3.A(string);
                            } else if (usernameEditActivity3.y0().f9847b.getText().toString().length() < 3) {
                                String string2 = usernameEditActivity3.getString(R.string.validation_three_chars_min);
                                string2.getClass();
                                usernameEditActivity3.A(string2);
                            } else if (usernameEditActivity3.y0().f9847b.getText().toString().length() <= 99) {
                                String string3 = usernameEditActivity3.y0().f9847b.getText().toString();
                                Pattern patternCompile = Pattern.compile("^[a-zA-Z0-9_]+$");
                                patternCompile.getClass();
                                string3.getClass();
                                if (!patternCompile.matcher(string3).matches()) {
                                    String string4 = usernameEditActivity3.getString(R.string.validation_username_chars_type);
                                    string4.getClass();
                                    usernameEditActivity3.A(string4);
                                } else {
                                    id idVar = (id) usernameEditActivity3.P.getValue();
                                    String string5 = usernameEditActivity3.y0().f9847b.getText().toString();
                                    x4.w2 w2Var6 = usernameEditActivity3.O;
                                    int i15 = vVar2.f7023a;
                                    String str2 = (String) xVar2.f7025a;
                                    idVar.getClass();
                                    string5.getClass();
                                    str2.getClass();
                                    kotlin.jvm.internal.v vVar3 = new kotlin.jvm.internal.v();
                                    kotlin.jvm.internal.x xVar3 = new kotlin.jvm.internal.x();
                                    o7.a0 viewModelScope = ViewModelKt.getViewModelScope(idVar);
                                    v7.e eVar = o7.m0.f8289a;
                                    o7.c0.s(viewModelScope, v7.d.f10885a, null, new hd(idVar, usernameEditActivity3, string5, i15, xVar3, vVar3, w2Var6, str2, null), 2);
                                }
                            } else {
                                String string6 = usernameEditActivity3.getString(R.string.validation_hundred_chars_max);
                                string6.getClass();
                                usernameEditActivity3.A(string6);
                            }
                            break;
                        case 1:
                            int i16 = UsernameEditActivity.R;
                            usernameEditActivity2.y0().f9857u.setChecked(false);
                            usernameEditActivity2.y0().v.setChecked(false);
                            usernameEditActivity2.y0().f9858w.setChecked(false);
                            vVar2.f7023a = 0;
                            xVar2.f7025a = "type0";
                            break;
                        case 2:
                            int i17 = UsernameEditActivity.R;
                            usernameEditActivity2.y0().f9856t.setChecked(false);
                            usernameEditActivity2.y0().v.setChecked(false);
                            usernameEditActivity2.y0().f9858w.setChecked(false);
                            vVar2.f7023a = 1;
                            xVar2.f7025a = "type1";
                            break;
                        case 3:
                            int i18 = UsernameEditActivity.R;
                            usernameEditActivity2.y0().f9856t.setChecked(false);
                            usernameEditActivity2.y0().f9857u.setChecked(false);
                            usernameEditActivity2.y0().f9858w.setChecked(false);
                            vVar2.f7023a = 2;
                            xVar2.f7025a = "type2";
                            break;
                        default:
                            int i19 = UsernameEditActivity.R;
                            usernameEditActivity2.y0().f9856t.setChecked(false);
                            usernameEditActivity2.y0().f9857u.setChecked(false);
                            usernameEditActivity2.y0().v.setChecked(false);
                            vVar2.f7023a = 3;
                            xVar2.f7025a = "type3";
                            break;
                    }
                }
            });
            final int i13 = 3;
            y0().v.setOnClickListener(new View.OnClickListener(this) { // from class: c4.bd

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ UsernameEditActivity f1439b;

                {
                    this.f1439b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i132 = i13;
                    UsernameEditActivity usernameEditActivity2 = this.f1439b;
                    kotlin.jvm.internal.x xVar2 = xVar;
                    kotlin.jvm.internal.v vVar2 = vVar;
                    switch (i132) {
                        case 0:
                            int i14 = UsernameEditActivity.R;
                            Activity activity = f4.c.f4876o;
                            UsernameEditActivity usernameEditActivity3 = this.f1439b;
                            t0.f.h(usernameEditActivity3, usernameEditActivity3.y0().f9847b);
                            if (usernameEditActivity3.y0().f9847b.getText().toString().length() == 0) {
                                String string = usernameEditActivity3.getString(R.string.error_email_vacio_recuperar_pass);
                                string.getClass();
                                usernameEditActivity3.A(string);
                            } else if (usernameEditActivity3.y0().f9847b.getText().toString().length() < 3) {
                                String string2 = usernameEditActivity3.getString(R.string.validation_three_chars_min);
                                string2.getClass();
                                usernameEditActivity3.A(string2);
                            } else if (usernameEditActivity3.y0().f9847b.getText().toString().length() <= 99) {
                                String string3 = usernameEditActivity3.y0().f9847b.getText().toString();
                                Pattern patternCompile = Pattern.compile("^[a-zA-Z0-9_]+$");
                                patternCompile.getClass();
                                string3.getClass();
                                if (!patternCompile.matcher(string3).matches()) {
                                    String string4 = usernameEditActivity3.getString(R.string.validation_username_chars_type);
                                    string4.getClass();
                                    usernameEditActivity3.A(string4);
                                } else {
                                    id idVar = (id) usernameEditActivity3.P.getValue();
                                    String string5 = usernameEditActivity3.y0().f9847b.getText().toString();
                                    x4.w2 w2Var6 = usernameEditActivity3.O;
                                    int i15 = vVar2.f7023a;
                                    String str2 = (String) xVar2.f7025a;
                                    idVar.getClass();
                                    string5.getClass();
                                    str2.getClass();
                                    kotlin.jvm.internal.v vVar3 = new kotlin.jvm.internal.v();
                                    kotlin.jvm.internal.x xVar3 = new kotlin.jvm.internal.x();
                                    o7.a0 viewModelScope = ViewModelKt.getViewModelScope(idVar);
                                    v7.e eVar = o7.m0.f8289a;
                                    o7.c0.s(viewModelScope, v7.d.f10885a, null, new hd(idVar, usernameEditActivity3, string5, i15, xVar3, vVar3, w2Var6, str2, null), 2);
                                }
                            } else {
                                String string6 = usernameEditActivity3.getString(R.string.validation_hundred_chars_max);
                                string6.getClass();
                                usernameEditActivity3.A(string6);
                            }
                            break;
                        case 1:
                            int i16 = UsernameEditActivity.R;
                            usernameEditActivity2.y0().f9857u.setChecked(false);
                            usernameEditActivity2.y0().v.setChecked(false);
                            usernameEditActivity2.y0().f9858w.setChecked(false);
                            vVar2.f7023a = 0;
                            xVar2.f7025a = "type0";
                            break;
                        case 2:
                            int i17 = UsernameEditActivity.R;
                            usernameEditActivity2.y0().f9856t.setChecked(false);
                            usernameEditActivity2.y0().v.setChecked(false);
                            usernameEditActivity2.y0().f9858w.setChecked(false);
                            vVar2.f7023a = 1;
                            xVar2.f7025a = "type1";
                            break;
                        case 3:
                            int i18 = UsernameEditActivity.R;
                            usernameEditActivity2.y0().f9856t.setChecked(false);
                            usernameEditActivity2.y0().f9857u.setChecked(false);
                            usernameEditActivity2.y0().f9858w.setChecked(false);
                            vVar2.f7023a = 2;
                            xVar2.f7025a = "type2";
                            break;
                        default:
                            int i19 = UsernameEditActivity.R;
                            usernameEditActivity2.y0().f9856t.setChecked(false);
                            usernameEditActivity2.y0().f9857u.setChecked(false);
                            usernameEditActivity2.y0().v.setChecked(false);
                            vVar2.f7023a = 3;
                            xVar2.f7025a = "type3";
                            break;
                    }
                }
            });
            y0().f9858w.setOnClickListener(new View.OnClickListener(this) { // from class: c4.bd

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ UsernameEditActivity f1439b;

                {
                    this.f1439b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i132 = i11;
                    UsernameEditActivity usernameEditActivity2 = this.f1439b;
                    kotlin.jvm.internal.x xVar2 = xVar;
                    kotlin.jvm.internal.v vVar2 = vVar;
                    switch (i132) {
                        case 0:
                            int i14 = UsernameEditActivity.R;
                            Activity activity = f4.c.f4876o;
                            UsernameEditActivity usernameEditActivity3 = this.f1439b;
                            t0.f.h(usernameEditActivity3, usernameEditActivity3.y0().f9847b);
                            if (usernameEditActivity3.y0().f9847b.getText().toString().length() == 0) {
                                String string = usernameEditActivity3.getString(R.string.error_email_vacio_recuperar_pass);
                                string.getClass();
                                usernameEditActivity3.A(string);
                            } else if (usernameEditActivity3.y0().f9847b.getText().toString().length() < 3) {
                                String string2 = usernameEditActivity3.getString(R.string.validation_three_chars_min);
                                string2.getClass();
                                usernameEditActivity3.A(string2);
                            } else if (usernameEditActivity3.y0().f9847b.getText().toString().length() <= 99) {
                                String string3 = usernameEditActivity3.y0().f9847b.getText().toString();
                                Pattern patternCompile = Pattern.compile("^[a-zA-Z0-9_]+$");
                                patternCompile.getClass();
                                string3.getClass();
                                if (!patternCompile.matcher(string3).matches()) {
                                    String string4 = usernameEditActivity3.getString(R.string.validation_username_chars_type);
                                    string4.getClass();
                                    usernameEditActivity3.A(string4);
                                } else {
                                    id idVar = (id) usernameEditActivity3.P.getValue();
                                    String string5 = usernameEditActivity3.y0().f9847b.getText().toString();
                                    x4.w2 w2Var6 = usernameEditActivity3.O;
                                    int i15 = vVar2.f7023a;
                                    String str2 = (String) xVar2.f7025a;
                                    idVar.getClass();
                                    string5.getClass();
                                    str2.getClass();
                                    kotlin.jvm.internal.v vVar3 = new kotlin.jvm.internal.v();
                                    kotlin.jvm.internal.x xVar3 = new kotlin.jvm.internal.x();
                                    o7.a0 viewModelScope = ViewModelKt.getViewModelScope(idVar);
                                    v7.e eVar = o7.m0.f8289a;
                                    o7.c0.s(viewModelScope, v7.d.f10885a, null, new hd(idVar, usernameEditActivity3, string5, i15, xVar3, vVar3, w2Var6, str2, null), 2);
                                }
                            } else {
                                String string6 = usernameEditActivity3.getString(R.string.validation_hundred_chars_max);
                                string6.getClass();
                                usernameEditActivity3.A(string6);
                            }
                            break;
                        case 1:
                            int i16 = UsernameEditActivity.R;
                            usernameEditActivity2.y0().f9857u.setChecked(false);
                            usernameEditActivity2.y0().v.setChecked(false);
                            usernameEditActivity2.y0().f9858w.setChecked(false);
                            vVar2.f7023a = 0;
                            xVar2.f7025a = "type0";
                            break;
                        case 2:
                            int i17 = UsernameEditActivity.R;
                            usernameEditActivity2.y0().f9856t.setChecked(false);
                            usernameEditActivity2.y0().v.setChecked(false);
                            usernameEditActivity2.y0().f9858w.setChecked(false);
                            vVar2.f7023a = 1;
                            xVar2.f7025a = "type1";
                            break;
                        case 3:
                            int i18 = UsernameEditActivity.R;
                            usernameEditActivity2.y0().f9856t.setChecked(false);
                            usernameEditActivity2.y0().f9857u.setChecked(false);
                            usernameEditActivity2.y0().f9858w.setChecked(false);
                            vVar2.f7023a = 2;
                            xVar2.f7025a = "type2";
                            break;
                        default:
                            int i19 = UsernameEditActivity.R;
                            usernameEditActivity2.y0().f9856t.setChecked(false);
                            usernameEditActivity2.y0().f9857u.setChecked(false);
                            usernameEditActivity2.y0().v.setChecked(false);
                            vVar2.f7023a = 3;
                            xVar2.f7025a = "type3";
                            break;
                    }
                }
            });
            w2 w2Var6 = this.O;
            w2Var6.getClass();
            if (!w2Var6.d()) {
                y0().B.setVisibility(0);
                TextView textView = y0().B;
                String string = getString(R.string.username_turbo_styles_locked);
                string.getClass();
                if (i6 >= 24) {
                    spannedFromHtml = Html.fromHtml(string, 0, null, new l5.m(this));
                    spannedFromHtml.getClass();
                } else {
                    spannedFromHtml = Html.fromHtml(string, null, new l5.m(this));
                    spannedFromHtml.getClass();
                }
                textView.setText(spannedFromHtml);
                final int i14 = 5;
                y0().B.setOnClickListener(new View.OnClickListener(this) { // from class: c4.ad

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ UsernameEditActivity f1399b;

                    {
                        this.f1399b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SharedPreferences sharedPreferences;
                        int i112 = i14;
                        UsernameEditActivity usernameEditActivity2 = this.f1399b;
                        switch (i112) {
                            case 0:
                                int i122 = UsernameEditActivity.R;
                                usernameEditActivity2.getOnBackPressedDispatcher().onBackPressed();
                                break;
                            case 1:
                                int i132 = UsernameEditActivity.R;
                                usernameEditActivity2.w0();
                                break;
                            case 2:
                                int i142 = UsernameEditActivity.R;
                                usernameEditActivity2.w0();
                                break;
                            case 3:
                                int i15 = UsernameEditActivity.R;
                                usernameEditActivity2.w0();
                                break;
                            case 4:
                                if (usernameEditActivity2.O != null) {
                                    SharedPreferences sharedPreferences2 = usernameEditActivity2.getSharedPreferences("SharedPreferencesUser", 0);
                                    try {
                                        sharedPreferences = usernameEditActivity2.getSharedPreferences("SettingsPreferences", 0);
                                    } catch (Exception e10) {
                                        e10.printStackTrace();
                                    }
                                    String string2 = sharedPreferences.contains("UTOKEN") ? sharedPreferences.getString("UTOKEN", null) : null;
                                    if (string2 != null || sharedPreferences2.getString("is_turbo", null) != null) {
                                        x4.w2 w2Var7 = usernameEditActivity2.O;
                                        w2Var7.getClass();
                                        if (w2Var7.d()) {
                                        }
                                    }
                                }
                                j5.c.e(usernameEditActivity2, d0.b.H(usernameEditActivity2), null);
                                break;
                            case 5:
                                int i16 = UsernameEditActivity.R;
                                usernameEditActivity2.w0();
                                break;
                            default:
                                int i17 = UsernameEditActivity.R;
                                usernameEditActivity2.w0();
                                break;
                        }
                    }
                });
                final int i15 = 6;
                y0().C.setOnClickListener(new View.OnClickListener(this) { // from class: c4.ad

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ UsernameEditActivity f1399b;

                    {
                        this.f1399b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SharedPreferences sharedPreferences;
                        int i112 = i15;
                        UsernameEditActivity usernameEditActivity2 = this.f1399b;
                        switch (i112) {
                            case 0:
                                int i122 = UsernameEditActivity.R;
                                usernameEditActivity2.getOnBackPressedDispatcher().onBackPressed();
                                break;
                            case 1:
                                int i132 = UsernameEditActivity.R;
                                usernameEditActivity2.w0();
                                break;
                            case 2:
                                int i142 = UsernameEditActivity.R;
                                usernameEditActivity2.w0();
                                break;
                            case 3:
                                int i152 = UsernameEditActivity.R;
                                usernameEditActivity2.w0();
                                break;
                            case 4:
                                if (usernameEditActivity2.O != null) {
                                    SharedPreferences sharedPreferences2 = usernameEditActivity2.getSharedPreferences("SharedPreferencesUser", 0);
                                    try {
                                        sharedPreferences = usernameEditActivity2.getSharedPreferences("SettingsPreferences", 0);
                                    } catch (Exception e10) {
                                        e10.printStackTrace();
                                    }
                                    String string2 = sharedPreferences.contains("UTOKEN") ? sharedPreferences.getString("UTOKEN", null) : null;
                                    if (string2 != null || sharedPreferences2.getString("is_turbo", null) != null) {
                                        x4.w2 w2Var7 = usernameEditActivity2.O;
                                        w2Var7.getClass();
                                        if (w2Var7.d()) {
                                        }
                                    }
                                }
                                j5.c.e(usernameEditActivity2, d0.b.H(usernameEditActivity2), null);
                                break;
                            case 5:
                                int i16 = UsernameEditActivity.R;
                                usernameEditActivity2.w0();
                                break;
                            default:
                                int i17 = UsernameEditActivity.R;
                                usernameEditActivity2.w0();
                                break;
                        }
                    }
                });
                y0().f9851o.setVisibility(8);
                y0().f9856t.setChecked(true);
                y0().f9848l.setVisibility(0);
                y0().f9857u.setEnabled(false);
                y0().f9849m.setVisibility(0);
                y0().v.setEnabled(false);
                y0().f9850n.setVisibility(0);
                y0().f9858w.setEnabled(false);
                y0().f9852p.setOnClickListener(new View.OnClickListener(this) { // from class: c4.ad

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ UsernameEditActivity f1399b;

                    {
                        this.f1399b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SharedPreferences sharedPreferences;
                        int i112 = i12;
                        UsernameEditActivity usernameEditActivity2 = this.f1399b;
                        switch (i112) {
                            case 0:
                                int i122 = UsernameEditActivity.R;
                                usernameEditActivity2.getOnBackPressedDispatcher().onBackPressed();
                                break;
                            case 1:
                                int i132 = UsernameEditActivity.R;
                                usernameEditActivity2.w0();
                                break;
                            case 2:
                                int i142 = UsernameEditActivity.R;
                                usernameEditActivity2.w0();
                                break;
                            case 3:
                                int i152 = UsernameEditActivity.R;
                                usernameEditActivity2.w0();
                                break;
                            case 4:
                                if (usernameEditActivity2.O != null) {
                                    SharedPreferences sharedPreferences2 = usernameEditActivity2.getSharedPreferences("SharedPreferencesUser", 0);
                                    try {
                                        sharedPreferences = usernameEditActivity2.getSharedPreferences("SettingsPreferences", 0);
                                    } catch (Exception e10) {
                                        e10.printStackTrace();
                                    }
                                    String string2 = sharedPreferences.contains("UTOKEN") ? sharedPreferences.getString("UTOKEN", null) : null;
                                    if (string2 != null || sharedPreferences2.getString("is_turbo", null) != null) {
                                        x4.w2 w2Var7 = usernameEditActivity2.O;
                                        w2Var7.getClass();
                                        if (w2Var7.d()) {
                                        }
                                    }
                                }
                                j5.c.e(usernameEditActivity2, d0.b.H(usernameEditActivity2), null);
                                break;
                            case 5:
                                int i16 = UsernameEditActivity.R;
                                usernameEditActivity2.w0();
                                break;
                            default:
                                int i17 = UsernameEditActivity.R;
                                usernameEditActivity2.w0();
                                break;
                        }
                    }
                });
                y0().f9853q.setOnClickListener(new View.OnClickListener(this) { // from class: c4.ad

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ UsernameEditActivity f1399b;

                    {
                        this.f1399b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SharedPreferences sharedPreferences;
                        int i112 = i;
                        UsernameEditActivity usernameEditActivity2 = this.f1399b;
                        switch (i112) {
                            case 0:
                                int i122 = UsernameEditActivity.R;
                                usernameEditActivity2.getOnBackPressedDispatcher().onBackPressed();
                                break;
                            case 1:
                                int i132 = UsernameEditActivity.R;
                                usernameEditActivity2.w0();
                                break;
                            case 2:
                                int i142 = UsernameEditActivity.R;
                                usernameEditActivity2.w0();
                                break;
                            case 3:
                                int i152 = UsernameEditActivity.R;
                                usernameEditActivity2.w0();
                                break;
                            case 4:
                                if (usernameEditActivity2.O != null) {
                                    SharedPreferences sharedPreferences2 = usernameEditActivity2.getSharedPreferences("SharedPreferencesUser", 0);
                                    try {
                                        sharedPreferences = usernameEditActivity2.getSharedPreferences("SettingsPreferences", 0);
                                    } catch (Exception e10) {
                                        e10.printStackTrace();
                                    }
                                    String string2 = sharedPreferences.contains("UTOKEN") ? sharedPreferences.getString("UTOKEN", null) : null;
                                    if (string2 != null || sharedPreferences2.getString("is_turbo", null) != null) {
                                        x4.w2 w2Var7 = usernameEditActivity2.O;
                                        w2Var7.getClass();
                                        if (w2Var7.d()) {
                                        }
                                    }
                                }
                                j5.c.e(usernameEditActivity2, d0.b.H(usernameEditActivity2), null);
                                break;
                            case 5:
                                int i16 = UsernameEditActivity.R;
                                usernameEditActivity2.w0();
                                break;
                            default:
                                int i17 = UsernameEditActivity.R;
                                usernameEditActivity2.w0();
                                break;
                        }
                    }
                });
                y0().f9854r.setOnClickListener(new View.OnClickListener(this) { // from class: c4.ad

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ UsernameEditActivity f1399b;

                    {
                        this.f1399b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SharedPreferences sharedPreferences;
                        int i112 = i13;
                        UsernameEditActivity usernameEditActivity2 = this.f1399b;
                        switch (i112) {
                            case 0:
                                int i122 = UsernameEditActivity.R;
                                usernameEditActivity2.getOnBackPressedDispatcher().onBackPressed();
                                break;
                            case 1:
                                int i132 = UsernameEditActivity.R;
                                usernameEditActivity2.w0();
                                break;
                            case 2:
                                int i142 = UsernameEditActivity.R;
                                usernameEditActivity2.w0();
                                break;
                            case 3:
                                int i152 = UsernameEditActivity.R;
                                usernameEditActivity2.w0();
                                break;
                            case 4:
                                if (usernameEditActivity2.O != null) {
                                    SharedPreferences sharedPreferences2 = usernameEditActivity2.getSharedPreferences("SharedPreferencesUser", 0);
                                    try {
                                        sharedPreferences = usernameEditActivity2.getSharedPreferences("SettingsPreferences", 0);
                                    } catch (Exception e10) {
                                        e10.printStackTrace();
                                    }
                                    String string2 = sharedPreferences.contains("UTOKEN") ? sharedPreferences.getString("UTOKEN", null) : null;
                                    if (string2 != null || sharedPreferences2.getString("is_turbo", null) != null) {
                                        x4.w2 w2Var7 = usernameEditActivity2.O;
                                        w2Var7.getClass();
                                        if (w2Var7.d()) {
                                        }
                                    }
                                }
                                j5.c.e(usernameEditActivity2, d0.b.H(usernameEditActivity2), null);
                                break;
                            case 5:
                                int i16 = UsernameEditActivity.R;
                                usernameEditActivity2.w0();
                                break;
                            default:
                                int i17 = UsernameEditActivity.R;
                                usernameEditActivity2.w0();
                                break;
                        }
                    }
                });
            }
            y0().f9847b.addTextChangedListener(new cd(this, 1));
            y0().E.setOnClickListener(new View.OnClickListener(this) { // from class: c4.bd

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ UsernameEditActivity f1439b;

                {
                    this.f1439b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i132 = i10;
                    UsernameEditActivity usernameEditActivity2 = this.f1439b;
                    kotlin.jvm.internal.x xVar2 = xVar;
                    kotlin.jvm.internal.v vVar2 = vVar;
                    switch (i132) {
                        case 0:
                            int i142 = UsernameEditActivity.R;
                            Activity activity = f4.c.f4876o;
                            UsernameEditActivity usernameEditActivity3 = this.f1439b;
                            t0.f.h(usernameEditActivity3, usernameEditActivity3.y0().f9847b);
                            if (usernameEditActivity3.y0().f9847b.getText().toString().length() == 0) {
                                String string2 = usernameEditActivity3.getString(R.string.error_email_vacio_recuperar_pass);
                                string2.getClass();
                                usernameEditActivity3.A(string2);
                            } else if (usernameEditActivity3.y0().f9847b.getText().toString().length() < 3) {
                                String string22 = usernameEditActivity3.getString(R.string.validation_three_chars_min);
                                string22.getClass();
                                usernameEditActivity3.A(string22);
                            } else if (usernameEditActivity3.y0().f9847b.getText().toString().length() <= 99) {
                                String string3 = usernameEditActivity3.y0().f9847b.getText().toString();
                                Pattern patternCompile = Pattern.compile("^[a-zA-Z0-9_]+$");
                                patternCompile.getClass();
                                string3.getClass();
                                if (!patternCompile.matcher(string3).matches()) {
                                    String string4 = usernameEditActivity3.getString(R.string.validation_username_chars_type);
                                    string4.getClass();
                                    usernameEditActivity3.A(string4);
                                } else {
                                    id idVar = (id) usernameEditActivity3.P.getValue();
                                    String string5 = usernameEditActivity3.y0().f9847b.getText().toString();
                                    x4.w2 w2Var62 = usernameEditActivity3.O;
                                    int i152 = vVar2.f7023a;
                                    String str2 = (String) xVar2.f7025a;
                                    idVar.getClass();
                                    string5.getClass();
                                    str2.getClass();
                                    kotlin.jvm.internal.v vVar3 = new kotlin.jvm.internal.v();
                                    kotlin.jvm.internal.x xVar3 = new kotlin.jvm.internal.x();
                                    o7.a0 viewModelScope = ViewModelKt.getViewModelScope(idVar);
                                    v7.e eVar = o7.m0.f8289a;
                                    o7.c0.s(viewModelScope, v7.d.f10885a, null, new hd(idVar, usernameEditActivity3, string5, i152, xVar3, vVar3, w2Var62, str2, null), 2);
                                }
                            } else {
                                String string6 = usernameEditActivity3.getString(R.string.validation_hundred_chars_max);
                                string6.getClass();
                                usernameEditActivity3.A(string6);
                            }
                            break;
                        case 1:
                            int i16 = UsernameEditActivity.R;
                            usernameEditActivity2.y0().f9857u.setChecked(false);
                            usernameEditActivity2.y0().v.setChecked(false);
                            usernameEditActivity2.y0().f9858w.setChecked(false);
                            vVar2.f7023a = 0;
                            xVar2.f7025a = "type0";
                            break;
                        case 2:
                            int i17 = UsernameEditActivity.R;
                            usernameEditActivity2.y0().f9856t.setChecked(false);
                            usernameEditActivity2.y0().v.setChecked(false);
                            usernameEditActivity2.y0().f9858w.setChecked(false);
                            vVar2.f7023a = 1;
                            xVar2.f7025a = "type1";
                            break;
                        case 3:
                            int i18 = UsernameEditActivity.R;
                            usernameEditActivity2.y0().f9856t.setChecked(false);
                            usernameEditActivity2.y0().f9857u.setChecked(false);
                            usernameEditActivity2.y0().f9858w.setChecked(false);
                            vVar2.f7023a = 2;
                            xVar2.f7025a = "type2";
                            break;
                        default:
                            int i19 = UsernameEditActivity.R;
                            usernameEditActivity2.y0().f9856t.setChecked(false);
                            usernameEditActivity2.y0().f9857u.setChecked(false);
                            usernameEditActivity2.y0().v.setChecked(false);
                            vVar2.f7023a = 3;
                            xVar2.f7025a = "type3";
                            break;
                    }
                }
            });
            y0().f9847b.addTextChangedListener(new cd(this, 0));
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            e eVar = m0.f8289a;
            int i16 = 14;
            usernameEditActivity = this;
            c0.s(lifecycleScope, n.f10349a, null, new g(usernameEditActivity, vVar, xVar, cVar, i16), 2);
            id idVar = (id) usernameEditActivity.P.getValue();
            idVar.getClass();
            c0.s(ViewModelKt.getViewModelScope(idVar), d.f10885a, null, new l((k0) usernameEditActivity, new ArrayList(), (Object) idVar, cVar, i16), 2);
        }
        w2 w2Var7 = usernameEditActivity.O;
        if (w2Var7 != null && (str = w2Var7.f11435m) != null && str.length() != 0) {
            w2 w2Var8 = usernameEditActivity.O;
            w2Var8.getClass();
            String str2 = w2Var8.f11435m;
            str2.getClass();
            z0(str2);
        }
        c0.s(LifecycleOwnerKt.getLifecycleScope(this), n.f10349a, null, new s(this, cVar, 17), 2);
    }

    public final h1 y0() {
        return (h1) this.Q.getValue();
    }

    public final void z0(String str) {
        if (str.length() <= 0 || str.length() < 3) {
            y0().f9861z.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(this, R.drawable.vector_unchecked), (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            y0().f9861z.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(this, R.drawable.vector_checked), (Drawable) null, (Drawable) null, (Drawable) null);
        }
        if (str.length() <= 99) {
            y0().f9860y.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(this, R.drawable.vector_checked), (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            y0().f9860y.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(this, R.drawable.vector_unchecked), (Drawable) null, (Drawable) null, (Drawable) null);
        }
        if (str.length() > 0) {
            Pattern patternCompile = Pattern.compile("^[a-zA-Z0-9_]+$");
            patternCompile.getClass();
            if (patternCompile.matcher(str).matches()) {
                y0().D.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(this, R.drawable.vector_checked), (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
        }
        y0().D.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(this, R.drawable.vector_unchecked), (Drawable) null, (Drawable) null, (Drawable) null);
    }
}
