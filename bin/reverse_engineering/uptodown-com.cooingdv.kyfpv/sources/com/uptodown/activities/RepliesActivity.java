package com.uptodown.activities;

import a3.d;
import a4.g0;
import a4.l0;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Spanned;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.inputmethod.a;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.work.multiprocess.RemoteWorkManager;
import b.n;
import c4.j0;
import c4.j8;
import c4.k0;
import c4.k7;
import c4.mc;
import c4.n8;
import c4.p8;
import c4.q8;
import c4.v8;
import c4.w6;
import com.google.android.gms.internal.measurement.i5;
import com.google.android.gms.internal.measurement.z3;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.RepliesActivity;
import com.uptodown.util.views.UsernameTextView;
import e4.h0;
import j5.t;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import o7.a0;
import o7.c0;
import o7.m0;
import p6.m;
import r7.o0;
import t6.c;
import v7.e;
import x4.k2;
import x4.u2;
import x4.w2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class RepliesActivity extends k0 {
    public static final /* synthetic */ int S = 0;
    public h0 Q;
    public final m O = new m(new w6(this, 3));
    public final ViewModelLazy P = new ViewModelLazy(y.a(v8.class), new q8(this, 0), new p8(this), new q8(this, 1));
    public final d R = new d(this, 14);

    public final void A0() {
        Object systemService = getSystemService("input_method");
        systemService.getClass();
        ((InputMethodManager) systemService).hideSoftInputFromWindow(y0().f10023b.getWindowToken(), 0);
        if (T()) {
            if (y0().f10023b.getText() == null || l7.m.K0(y0().f10023b.getText().toString()).toString().length() <= 0) {
                if (l7.m.K0(y0().f10023b.getText().toString()).toString().length() == 0) {
                    String string = getString(R.string.empty_answer_error);
                    string.getClass();
                    A(string);
                    return;
                }
                return;
            }
            String string2 = y0().f10023b.getText().toString();
            String strY = z3.y(this, "last_review_text");
            String strY2 = z3.y(this, "last_review_timestamp");
            if (strY2 == null) {
                strY2 = "0";
            }
            if (string2 != null && string2.equalsIgnoreCase(strY) && System.currentTimeMillis() - Long.parseLong(strY2) < RemoteWorkManager.DEFAULT_SESSION_TIMEOUT_MILLIS) {
                y0().f10023b.setText("");
                return;
            }
            Context applicationContext = getApplicationContext();
            applicationContext.getClass();
            String string3 = y0().f10023b.getText().toString();
            string3.getClass();
            z3.R(applicationContext, "last_review_text", string3);
            Context applicationContext2 = getApplicationContext();
            applicationContext2.getClass();
            String strValueOf = String.valueOf(System.currentTimeMillis());
            strValueOf.getClass();
            z3.R(applicationContext2, "last_review_timestamp", strValueOf);
            v8 v8VarZ0 = z0();
            String string4 = y0().f10023b.getText().toString();
            Object value = z0().f2220m.getValue();
            value.getClass();
            long j = ((k2) value).f11259a;
            v8VarZ0.getClass();
            string4.getClass();
            a0 viewModelScope = ViewModelKt.getViewModelScope(v8VarZ0);
            e eVar = m0.f8289a;
            c0.s(viewModelScope, v7.d.f10885a, null, new mc(this, string4, j, v8VarZ0, (c) null), 2);
        }
    }

    public final void B0() {
        if (isFinishing()) {
            return;
        }
        Intent intent = new Intent(getApplicationContext(), (Class<?>) LoginActivity.class);
        float f = UptodownApp.I;
        startActivity(intent, b4.d.a(this));
    }

    public final void C0(String str) {
        float f = UptodownApp.I;
        if (!b4.d.t() || !T() || str == null || str.length() == 0) {
            return;
        }
        c0.s(LifecycleOwnerKt.getLifecycleScope(this), null, null, new n(this, str, (c) null, 26), 3);
    }

    public final void D0(final k2 k2Var) {
        CharSequence charSequence;
        boolean zB = k2Var.b();
        int i = k2Var.f11266q;
        final int i6 = 5;
        final int i10 = 4;
        final int i11 = 3;
        final int i12 = 2;
        final int i13 = 0;
        final int i14 = 1;
        if (!zB) {
            if (i > 0) {
                y0().f10031s.f10059z.setTypeface(f4.c.f4884x);
                if (k2Var.f11266q == 1) {
                    y0().f10031s.f10059z.setText(getString(R.string.replies_counter_single));
                } else {
                    y0().f10031s.f10059z.setText(getString(R.string.replies_counter_multiple, String.valueOf(k2Var.f11266q)));
                }
            } else {
                y0().f10031s.f10055u.setVisibility(8);
            }
            y0().f10031s.f10055u.setVisibility(8);
            y0().f10031s.f10054t.setOnClickListener(new View.OnClickListener(this) { // from class: c4.k8

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ RepliesActivity f1795b;

                {
                    this.f1795b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i15 = i11;
                    x4.k2 k2Var2 = k2Var;
                    RepliesActivity repliesActivity = this.f1795b;
                    switch (i15) {
                        case 0:
                            int i16 = RepliesActivity.S;
                            float f = UptodownApp.I;
                            if (b4.d.t()) {
                                RepliesActivity repliesActivity2 = this.f1795b;
                                if (x4.u2.h(repliesActivity2) == null) {
                                    String string = repliesActivity2.getString(R.string.login_required_like_title);
                                    string.getClass();
                                    String string2 = repliesActivity2.getString(R.string.login_required_like_msg);
                                    string2.getClass();
                                    b2.t1.v(repliesActivity2, string, string2);
                                } else {
                                    new e1.v4(repliesActivity2, 1).h(repliesActivity2.y0().f10032t.f10067n);
                                    x4.k2 k2Var3 = k2Var;
                                    if (!j5.t.f6710b.contains(Long.valueOf(k2Var3.f11259a))) {
                                        v8 v8VarZ0 = repliesActivity2.z0();
                                        v8VarZ0.getClass();
                                        o7.a0 viewModelScope = ViewModelKt.getViewModelScope(v8VarZ0);
                                        v7.e eVar = o7.m0.f8289a;
                                        o7.c0.s(viewModelScope, v7.d.f10885a, null, new b6.g(k2Var3, repliesActivity2, v8VarZ0, (t6.c) null, 9), 2);
                                        repliesActivity2.y0().f10032t.f10077y.setText(String.valueOf(k2Var3.f11268s + 1));
                                    }
                                }
                            }
                            break;
                        case 1:
                            int i17 = RepliesActivity.S;
                            repliesActivity.C0(k2Var2.f11260b);
                            break;
                        case 2:
                            int i18 = RepliesActivity.S;
                            repliesActivity.C0(k2Var2.f11260b);
                            break;
                        case 3:
                            int i19 = RepliesActivity.S;
                            float f10 = UptodownApp.I;
                            if (b4.d.t()) {
                                RepliesActivity repliesActivity3 = this.f1795b;
                                if (x4.u2.h(repliesActivity3) == null) {
                                    String string3 = repliesActivity3.getString(R.string.login_required_like_title);
                                    string3.getClass();
                                    String string4 = repliesActivity3.getString(R.string.login_required_like_msg);
                                    string4.getClass();
                                    b2.t1.v(repliesActivity3, string3, string4);
                                } else {
                                    new e1.v4(repliesActivity3, 1).h(repliesActivity3.y0().f10031s.f10048n);
                                    x4.k2 k2Var4 = k2Var;
                                    if (!j5.t.f6710b.contains(Long.valueOf(k2Var4.f11259a))) {
                                        v8 v8VarZ02 = repliesActivity3.z0();
                                        v8VarZ02.getClass();
                                        o7.a0 viewModelScope2 = ViewModelKt.getViewModelScope(v8VarZ02);
                                        v7.e eVar2 = o7.m0.f8289a;
                                        o7.c0.s(viewModelScope2, v7.d.f10885a, null, new b6.g(k2Var4, repliesActivity3, v8VarZ02, (t6.c) null, 9), 2);
                                        repliesActivity3.y0().f10031s.f10057x.setText(String.valueOf(k2Var4.f11268s + 1));
                                    }
                                }
                            }
                            break;
                        case 4:
                            int i20 = RepliesActivity.S;
                            repliesActivity.C0(k2Var2.f11260b);
                            break;
                        default:
                            int i21 = RepliesActivity.S;
                            repliesActivity.C0(k2Var2.f11260b);
                            break;
                    }
                }
            });
            if (t.f6710b.contains(Long.valueOf(k2Var.f11259a))) {
                y0().f10031s.f10048n.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.vector_heart_red));
            }
            y0().f10031s.f10057x.setTypeface(f4.c.f4884x);
            y0().f10031s.f10057x.setText(String.valueOf(k2Var.f11268s));
            y0().f10031s.f10049o.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on));
            y0().f10031s.f10050p.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_off));
            y0().f10031s.f10051q.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_off));
            y0().f10031s.f10052r.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_off));
            y0().f10031s.f10053s.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_off));
            if (k2Var.f11265p >= 2) {
                y0().f10031s.f10050p.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on));
            }
            if (k2Var.f11265p >= 3) {
                y0().f10031s.f10051q.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on));
            }
            if (k2Var.f11265p >= 4) {
                y0().f10031s.f10052r.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on));
            }
            if (k2Var.f11265p == 5) {
                y0().f10031s.f10053s.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on));
            }
            final w2 w2VarH = u2.h(this);
            if (w2VarH == null || !l.a(w2VarH.f11432a, k2Var.f11260b)) {
                y0().f10031s.f10047m.setVisibility(0);
                if (k2Var.f11272x == 1) {
                    y0().f10031s.f10047m.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.vector_following));
                } else {
                    y0().f10031s.f10047m.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.vector_follow));
                }
            } else {
                y0().f10031s.f10047m.setVisibility(8);
            }
            y0().f10031s.f10047m.setOnClickListener(new View.OnClickListener() { // from class: c4.l8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i15 = i14;
                    RepliesActivity repliesActivity = this;
                    x4.w2 w2Var = w2VarH;
                    switch (i15) {
                        case 0:
                            if (w2Var == null) {
                                int i16 = RepliesActivity.S;
                                repliesActivity.B0();
                            } else {
                                repliesActivity.R.D(-1);
                            }
                            break;
                        default:
                            if (w2Var == null) {
                                int i17 = RepliesActivity.S;
                                repliesActivity.B0();
                            } else {
                                repliesActivity.R.D(-1);
                            }
                            break;
                    }
                }
            });
            y0().f10031s.B.setTypeface(f4.c.f4883w);
            y0().f10031s.f10056w.setTypeface(f4.c.f4884x);
            y0().f10031s.v.setTypeface(f4.c.f4884x);
            y0().f10031s.f10058y.setTypeface(f4.c.f4884x);
            CharSequence charSequence2 = (CharSequence) z0().f2222o.getValue();
            if (charSequence2 == null || charSequence2.length() == 0) {
                String strE = u2.e(k2Var.f11262m);
                if (strE == null || strE.length() == 0) {
                    charSequence = null;
                    l0 l0VarF = g0.d().f();
                    float f = UptodownApp.I;
                    l0VarF.h(b4.d.x(this));
                    l0VarF.e(y0().f10031s.f10046l, null);
                } else {
                    l0 l0VarE = g0.d().e(u2.e(k2Var.f11262m));
                    float f10 = UptodownApp.I;
                    l0VarE.h(b4.d.x(this));
                    charSequence = null;
                    l0VarE.e(y0().f10031s.f10046l, null);
                }
            } else {
                l0 l0VarE2 = g0.d().e(u2.e((String) z0().f2222o.getValue()));
                float f11 = UptodownApp.I;
                l0VarE2.h(b4.d.x(this));
                charSequence = null;
                l0VarE2.e(y0().f10031s.f10046l, null);
            }
            String str = k2Var.f11261l;
            if (str == null || str.length() == 0) {
                CharSequence charSequence3 = (CharSequence) z0().f2219l.getValue();
                if (charSequence3 != null && charSequence3.length() != 0) {
                    y0().f10031s.B.setText((CharSequence) z0().f2219l.getValue());
                    int i15 = UsernameTextView.f3453s;
                    i5.g(y0().f10031s.B, k2Var.b(), k2Var.f11271w);
                }
            } else {
                y0().f10031s.B.setText(k2Var.f11261l);
                int i16 = UsernameTextView.f3453s;
                i5.g(y0().f10031s.B, k2Var.b(), k2Var.f11271w);
            }
            String str2 = k2Var.f11267r;
            if (str2 != null && str2.length() != 0) {
                y0().f10031s.f10056w.setText(k2Var.f11267r);
            }
            String str3 = k2Var.f11264o;
            if (str3 == null || str3.length() == 0) {
                y0().f10031s.v.setVisibility(8);
            } else {
                y0().f10031s.v.setMaxLines(Integer.MAX_VALUE);
                TextView textView = y0().f10031s.v;
                Spanned spannedA = k2Var.a();
                textView.setText(spannedA != null ? l7.m.K0(spannedA) : charSequence);
                if (k2Var.f11266q > 0) {
                    y0().f10031s.f10058y.setText(String.valueOf(k2Var.f11266q));
                }
            }
            if (k2Var.f11269t == 1) {
                y0().f10031s.f10045b.setVisibility(0);
            }
            String str4 = k2Var.f11260b;
            if (str4 == null || str4.length() == 0) {
                return;
            }
            y0().f10031s.B.setOnClickListener(new View.OnClickListener(this) { // from class: c4.k8

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ RepliesActivity f1795b;

                {
                    this.f1795b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i152 = i10;
                    x4.k2 k2Var2 = k2Var;
                    RepliesActivity repliesActivity = this.f1795b;
                    switch (i152) {
                        case 0:
                            int i162 = RepliesActivity.S;
                            float f12 = UptodownApp.I;
                            if (b4.d.t()) {
                                RepliesActivity repliesActivity2 = this.f1795b;
                                if (x4.u2.h(repliesActivity2) == null) {
                                    String string = repliesActivity2.getString(R.string.login_required_like_title);
                                    string.getClass();
                                    String string2 = repliesActivity2.getString(R.string.login_required_like_msg);
                                    string2.getClass();
                                    b2.t1.v(repliesActivity2, string, string2);
                                } else {
                                    new e1.v4(repliesActivity2, 1).h(repliesActivity2.y0().f10032t.f10067n);
                                    x4.k2 k2Var3 = k2Var;
                                    if (!j5.t.f6710b.contains(Long.valueOf(k2Var3.f11259a))) {
                                        v8 v8VarZ0 = repliesActivity2.z0();
                                        v8VarZ0.getClass();
                                        o7.a0 viewModelScope = ViewModelKt.getViewModelScope(v8VarZ0);
                                        v7.e eVar = o7.m0.f8289a;
                                        o7.c0.s(viewModelScope, v7.d.f10885a, null, new b6.g(k2Var3, repliesActivity2, v8VarZ0, (t6.c) null, 9), 2);
                                        repliesActivity2.y0().f10032t.f10077y.setText(String.valueOf(k2Var3.f11268s + 1));
                                    }
                                }
                            }
                            break;
                        case 1:
                            int i17 = RepliesActivity.S;
                            repliesActivity.C0(k2Var2.f11260b);
                            break;
                        case 2:
                            int i18 = RepliesActivity.S;
                            repliesActivity.C0(k2Var2.f11260b);
                            break;
                        case 3:
                            int i19 = RepliesActivity.S;
                            float f102 = UptodownApp.I;
                            if (b4.d.t()) {
                                RepliesActivity repliesActivity3 = this.f1795b;
                                if (x4.u2.h(repliesActivity3) == null) {
                                    String string3 = repliesActivity3.getString(R.string.login_required_like_title);
                                    string3.getClass();
                                    String string4 = repliesActivity3.getString(R.string.login_required_like_msg);
                                    string4.getClass();
                                    b2.t1.v(repliesActivity3, string3, string4);
                                } else {
                                    new e1.v4(repliesActivity3, 1).h(repliesActivity3.y0().f10031s.f10048n);
                                    x4.k2 k2Var4 = k2Var;
                                    if (!j5.t.f6710b.contains(Long.valueOf(k2Var4.f11259a))) {
                                        v8 v8VarZ02 = repliesActivity3.z0();
                                        v8VarZ02.getClass();
                                        o7.a0 viewModelScope2 = ViewModelKt.getViewModelScope(v8VarZ02);
                                        v7.e eVar2 = o7.m0.f8289a;
                                        o7.c0.s(viewModelScope2, v7.d.f10885a, null, new b6.g(k2Var4, repliesActivity3, v8VarZ02, (t6.c) null, 9), 2);
                                        repliesActivity3.y0().f10031s.f10057x.setText(String.valueOf(k2Var4.f11268s + 1));
                                    }
                                }
                            }
                            break;
                        case 4:
                            int i20 = RepliesActivity.S;
                            repliesActivity.C0(k2Var2.f11260b);
                            break;
                        default:
                            int i21 = RepliesActivity.S;
                            repliesActivity.C0(k2Var2.f11260b);
                            break;
                    }
                }
            });
            y0().f10031s.f10046l.setOnClickListener(new View.OnClickListener(this) { // from class: c4.k8

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ RepliesActivity f1795b;

                {
                    this.f1795b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i152 = i6;
                    x4.k2 k2Var2 = k2Var;
                    RepliesActivity repliesActivity = this.f1795b;
                    switch (i152) {
                        case 0:
                            int i162 = RepliesActivity.S;
                            float f12 = UptodownApp.I;
                            if (b4.d.t()) {
                                RepliesActivity repliesActivity2 = this.f1795b;
                                if (x4.u2.h(repliesActivity2) == null) {
                                    String string = repliesActivity2.getString(R.string.login_required_like_title);
                                    string.getClass();
                                    String string2 = repliesActivity2.getString(R.string.login_required_like_msg);
                                    string2.getClass();
                                    b2.t1.v(repliesActivity2, string, string2);
                                } else {
                                    new e1.v4(repliesActivity2, 1).h(repliesActivity2.y0().f10032t.f10067n);
                                    x4.k2 k2Var3 = k2Var;
                                    if (!j5.t.f6710b.contains(Long.valueOf(k2Var3.f11259a))) {
                                        v8 v8VarZ0 = repliesActivity2.z0();
                                        v8VarZ0.getClass();
                                        o7.a0 viewModelScope = ViewModelKt.getViewModelScope(v8VarZ0);
                                        v7.e eVar = o7.m0.f8289a;
                                        o7.c0.s(viewModelScope, v7.d.f10885a, null, new b6.g(k2Var3, repliesActivity2, v8VarZ0, (t6.c) null, 9), 2);
                                        repliesActivity2.y0().f10032t.f10077y.setText(String.valueOf(k2Var3.f11268s + 1));
                                    }
                                }
                            }
                            break;
                        case 1:
                            int i17 = RepliesActivity.S;
                            repliesActivity.C0(k2Var2.f11260b);
                            break;
                        case 2:
                            int i18 = RepliesActivity.S;
                            repliesActivity.C0(k2Var2.f11260b);
                            break;
                        case 3:
                            int i19 = RepliesActivity.S;
                            float f102 = UptodownApp.I;
                            if (b4.d.t()) {
                                RepliesActivity repliesActivity3 = this.f1795b;
                                if (x4.u2.h(repliesActivity3) == null) {
                                    String string3 = repliesActivity3.getString(R.string.login_required_like_title);
                                    string3.getClass();
                                    String string4 = repliesActivity3.getString(R.string.login_required_like_msg);
                                    string4.getClass();
                                    b2.t1.v(repliesActivity3, string3, string4);
                                } else {
                                    new e1.v4(repliesActivity3, 1).h(repliesActivity3.y0().f10031s.f10048n);
                                    x4.k2 k2Var4 = k2Var;
                                    if (!j5.t.f6710b.contains(Long.valueOf(k2Var4.f11259a))) {
                                        v8 v8VarZ02 = repliesActivity3.z0();
                                        v8VarZ02.getClass();
                                        o7.a0 viewModelScope2 = ViewModelKt.getViewModelScope(v8VarZ02);
                                        v7.e eVar2 = o7.m0.f8289a;
                                        o7.c0.s(viewModelScope2, v7.d.f10885a, null, new b6.g(k2Var4, repliesActivity3, v8VarZ02, (t6.c) null, 9), 2);
                                        repliesActivity3.y0().f10031s.f10057x.setText(String.valueOf(k2Var4.f11268s + 1));
                                    }
                                }
                            }
                            break;
                        case 4:
                            int i20 = RepliesActivity.S;
                            repliesActivity.C0(k2Var2.f11260b);
                            break;
                        default:
                            int i21 = RepliesActivity.S;
                            repliesActivity.C0(k2Var2.f11260b);
                            break;
                    }
                }
            });
            return;
        }
        if (i > 0) {
            y0().f10032t.A.setTypeface(f4.c.f4884x);
            if (k2Var.f11266q == 1) {
                y0().f10032t.A.setText(getString(R.string.replies_counter_single));
            } else {
                y0().f10032t.A.setText(getString(R.string.replies_counter_multiple, String.valueOf(k2Var.f11266q)));
            }
        } else {
            y0().f10032t.v.setVisibility(8);
        }
        y0().f10032t.f10074u.setOnClickListener(new View.OnClickListener(this) { // from class: c4.k8

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RepliesActivity f1795b;

            {
                this.f1795b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i152 = i13;
                x4.k2 k2Var2 = k2Var;
                RepliesActivity repliesActivity = this.f1795b;
                switch (i152) {
                    case 0:
                        int i162 = RepliesActivity.S;
                        float f12 = UptodownApp.I;
                        if (b4.d.t()) {
                            RepliesActivity repliesActivity2 = this.f1795b;
                            if (x4.u2.h(repliesActivity2) == null) {
                                String string = repliesActivity2.getString(R.string.login_required_like_title);
                                string.getClass();
                                String string2 = repliesActivity2.getString(R.string.login_required_like_msg);
                                string2.getClass();
                                b2.t1.v(repliesActivity2, string, string2);
                            } else {
                                new e1.v4(repliesActivity2, 1).h(repliesActivity2.y0().f10032t.f10067n);
                                x4.k2 k2Var3 = k2Var;
                                if (!j5.t.f6710b.contains(Long.valueOf(k2Var3.f11259a))) {
                                    v8 v8VarZ0 = repliesActivity2.z0();
                                    v8VarZ0.getClass();
                                    o7.a0 viewModelScope = ViewModelKt.getViewModelScope(v8VarZ0);
                                    v7.e eVar = o7.m0.f8289a;
                                    o7.c0.s(viewModelScope, v7.d.f10885a, null, new b6.g(k2Var3, repliesActivity2, v8VarZ0, (t6.c) null, 9), 2);
                                    repliesActivity2.y0().f10032t.f10077y.setText(String.valueOf(k2Var3.f11268s + 1));
                                }
                            }
                        }
                        break;
                    case 1:
                        int i17 = RepliesActivity.S;
                        repliesActivity.C0(k2Var2.f11260b);
                        break;
                    case 2:
                        int i18 = RepliesActivity.S;
                        repliesActivity.C0(k2Var2.f11260b);
                        break;
                    case 3:
                        int i19 = RepliesActivity.S;
                        float f102 = UptodownApp.I;
                        if (b4.d.t()) {
                            RepliesActivity repliesActivity3 = this.f1795b;
                            if (x4.u2.h(repliesActivity3) == null) {
                                String string3 = repliesActivity3.getString(R.string.login_required_like_title);
                                string3.getClass();
                                String string4 = repliesActivity3.getString(R.string.login_required_like_msg);
                                string4.getClass();
                                b2.t1.v(repliesActivity3, string3, string4);
                            } else {
                                new e1.v4(repliesActivity3, 1).h(repliesActivity3.y0().f10031s.f10048n);
                                x4.k2 k2Var4 = k2Var;
                                if (!j5.t.f6710b.contains(Long.valueOf(k2Var4.f11259a))) {
                                    v8 v8VarZ02 = repliesActivity3.z0();
                                    v8VarZ02.getClass();
                                    o7.a0 viewModelScope2 = ViewModelKt.getViewModelScope(v8VarZ02);
                                    v7.e eVar2 = o7.m0.f8289a;
                                    o7.c0.s(viewModelScope2, v7.d.f10885a, null, new b6.g(k2Var4, repliesActivity3, v8VarZ02, (t6.c) null, 9), 2);
                                    repliesActivity3.y0().f10031s.f10057x.setText(String.valueOf(k2Var4.f11268s + 1));
                                }
                            }
                        }
                        break;
                    case 4:
                        int i20 = RepliesActivity.S;
                        repliesActivity.C0(k2Var2.f11260b);
                        break;
                    default:
                        int i21 = RepliesActivity.S;
                        repliesActivity.C0(k2Var2.f11260b);
                        break;
                }
            }
        });
        if (t.f6710b.contains(Long.valueOf(k2Var.f11259a))) {
            y0().f10032t.f10067n.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.vector_heart_red));
        }
        y0().f10032t.f10077y.setTypeface(f4.c.f4884x);
        y0().f10032t.f10077y.setText(String.valueOf(k2Var.f11268s));
        y0().f10032t.f10068o.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on_turbo));
        y0().f10032t.f10069p.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_off_turbo));
        y0().f10032t.f10070q.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_off_turbo));
        y0().f10032t.f10071r.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_off_turbo));
        y0().f10032t.f10072s.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_off_turbo));
        if (k2Var.f11265p >= 2) {
            y0().f10032t.f10069p.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on_turbo));
        }
        if (k2Var.f11265p >= 3) {
            y0().f10032t.f10070q.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on_turbo));
        }
        if (k2Var.f11265p >= 4) {
            y0().f10032t.f10071r.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on_turbo));
        }
        if (k2Var.f11265p == 5) {
            y0().f10032t.f10072s.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on_turbo));
        }
        final w2 w2VarH2 = u2.h(this);
        if (w2VarH2 == null || !l.a(w2VarH2.f11432a, k2Var.f11260b)) {
            y0().f10032t.f10066m.setVisibility(0);
            if (k2Var.f11272x == 1) {
                y0().f10032t.f10066m.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.vector_following));
            } else {
                y0().f10032t.f10066m.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.vector_follow));
            }
        } else {
            y0().f10032t.f10066m.setVisibility(8);
        }
        y0().f10032t.f10066m.setOnClickListener(new View.OnClickListener() { // from class: c4.l8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i152 = i13;
                RepliesActivity repliesActivity = this;
                x4.w2 w2Var = w2VarH2;
                switch (i152) {
                    case 0:
                        if (w2Var == null) {
                            int i162 = RepliesActivity.S;
                            repliesActivity.B0();
                        } else {
                            repliesActivity.R.D(-1);
                        }
                        break;
                    default:
                        if (w2Var == null) {
                            int i17 = RepliesActivity.S;
                            repliesActivity.B0();
                        } else {
                            repliesActivity.R.D(-1);
                        }
                        break;
                }
            }
        });
        y0().f10032t.C.setTypeface(f4.c.f4883w);
        y0().f10032t.f10076x.setTypeface(f4.c.f4884x);
        y0().f10032t.f10075w.setTypeface(f4.c.f4884x);
        y0().f10032t.f10078z.setTypeface(f4.c.f4884x);
        CharSequence charSequence4 = (CharSequence) z0().f2222o.getValue();
        if (charSequence4 == null || charSequence4.length() == 0) {
            String strE2 = u2.e(k2Var.f11262m);
            if (strE2 == null || strE2.length() == 0) {
                l0 l0VarF2 = g0.d().f();
                float f12 = UptodownApp.I;
                l0VarF2.h(b4.d.x(this));
                l0VarF2.e(y0().f10032t.f10065l, null);
            } else {
                l0 l0VarE3 = g0.d().e(u2.e(k2Var.f11262m));
                float f13 = UptodownApp.I;
                l0VarE3.h(b4.d.x(this));
                l0VarE3.e(y0().f10032t.f10065l, null);
            }
        } else {
            l0 l0VarE4 = g0.d().e(u2.e((String) z0().f2222o.getValue()));
            float f14 = UptodownApp.I;
            l0VarE4.h(b4.d.x(this));
            l0VarE4.e(y0().f10032t.f10065l, null);
        }
        String str5 = k2Var.f11261l;
        if (str5 == null || str5.length() == 0) {
            CharSequence charSequence5 = (CharSequence) z0().f2219l.getValue();
            if (charSequence5 != null && charSequence5.length() != 0) {
                y0().f10032t.C.setText((CharSequence) z0().f2219l.getValue());
                int i17 = UsernameTextView.f3453s;
                i5.g(y0().f10032t.C, k2Var.b(), k2Var.f11271w);
            }
        } else {
            y0().f10032t.C.setText(k2Var.f11261l);
            int i18 = UsernameTextView.f3453s;
            i5.g(y0().f10032t.C, k2Var.b(), k2Var.f11271w);
        }
        String str6 = k2Var.f11267r;
        if (str6 != null && str6.length() != 0) {
            y0().f10032t.f10076x.setText(k2Var.f11267r);
        }
        String str7 = k2Var.f11264o;
        if (str7 == null || str7.length() == 0) {
            y0().f10032t.f10075w.setVisibility(8);
        } else {
            y0().f10032t.f10075w.setMaxLines(Integer.MAX_VALUE);
            TextView textView2 = y0().f10032t.f10075w;
            Spanned spannedA2 = k2Var.a();
            textView2.setText(spannedA2 != null ? l7.m.K0(spannedA2) : null);
            if (k2Var.f11266q > 1) {
                y0().f10032t.f10078z.setText(String.valueOf(k2Var.f11266q));
            }
        }
        if (k2Var.f11269t == 1) {
            y0().f10032t.f10064b.setVisibility(0);
        }
        String str8 = k2Var.f11260b;
        if (str8 != null && str8.length() != 0) {
            y0().f10032t.C.setOnClickListener(new View.OnClickListener(this) { // from class: c4.k8

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ RepliesActivity f1795b;

                {
                    this.f1795b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i152 = i14;
                    x4.k2 k2Var2 = k2Var;
                    RepliesActivity repliesActivity = this.f1795b;
                    switch (i152) {
                        case 0:
                            int i162 = RepliesActivity.S;
                            float f122 = UptodownApp.I;
                            if (b4.d.t()) {
                                RepliesActivity repliesActivity2 = this.f1795b;
                                if (x4.u2.h(repliesActivity2) == null) {
                                    String string = repliesActivity2.getString(R.string.login_required_like_title);
                                    string.getClass();
                                    String string2 = repliesActivity2.getString(R.string.login_required_like_msg);
                                    string2.getClass();
                                    b2.t1.v(repliesActivity2, string, string2);
                                } else {
                                    new e1.v4(repliesActivity2, 1).h(repliesActivity2.y0().f10032t.f10067n);
                                    x4.k2 k2Var3 = k2Var;
                                    if (!j5.t.f6710b.contains(Long.valueOf(k2Var3.f11259a))) {
                                        v8 v8VarZ0 = repliesActivity2.z0();
                                        v8VarZ0.getClass();
                                        o7.a0 viewModelScope = ViewModelKt.getViewModelScope(v8VarZ0);
                                        v7.e eVar = o7.m0.f8289a;
                                        o7.c0.s(viewModelScope, v7.d.f10885a, null, new b6.g(k2Var3, repliesActivity2, v8VarZ0, (t6.c) null, 9), 2);
                                        repliesActivity2.y0().f10032t.f10077y.setText(String.valueOf(k2Var3.f11268s + 1));
                                    }
                                }
                            }
                            break;
                        case 1:
                            int i172 = RepliesActivity.S;
                            repliesActivity.C0(k2Var2.f11260b);
                            break;
                        case 2:
                            int i182 = RepliesActivity.S;
                            repliesActivity.C0(k2Var2.f11260b);
                            break;
                        case 3:
                            int i19 = RepliesActivity.S;
                            float f102 = UptodownApp.I;
                            if (b4.d.t()) {
                                RepliesActivity repliesActivity3 = this.f1795b;
                                if (x4.u2.h(repliesActivity3) == null) {
                                    String string3 = repliesActivity3.getString(R.string.login_required_like_title);
                                    string3.getClass();
                                    String string4 = repliesActivity3.getString(R.string.login_required_like_msg);
                                    string4.getClass();
                                    b2.t1.v(repliesActivity3, string3, string4);
                                } else {
                                    new e1.v4(repliesActivity3, 1).h(repliesActivity3.y0().f10031s.f10048n);
                                    x4.k2 k2Var4 = k2Var;
                                    if (!j5.t.f6710b.contains(Long.valueOf(k2Var4.f11259a))) {
                                        v8 v8VarZ02 = repliesActivity3.z0();
                                        v8VarZ02.getClass();
                                        o7.a0 viewModelScope2 = ViewModelKt.getViewModelScope(v8VarZ02);
                                        v7.e eVar2 = o7.m0.f8289a;
                                        o7.c0.s(viewModelScope2, v7.d.f10885a, null, new b6.g(k2Var4, repliesActivity3, v8VarZ02, (t6.c) null, 9), 2);
                                        repliesActivity3.y0().f10031s.f10057x.setText(String.valueOf(k2Var4.f11268s + 1));
                                    }
                                }
                            }
                            break;
                        case 4:
                            int i20 = RepliesActivity.S;
                            repliesActivity.C0(k2Var2.f11260b);
                            break;
                        default:
                            int i21 = RepliesActivity.S;
                            repliesActivity.C0(k2Var2.f11260b);
                            break;
                    }
                }
            });
            y0().f10032t.f10065l.setOnClickListener(new View.OnClickListener(this) { // from class: c4.k8

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ RepliesActivity f1795b;

                {
                    this.f1795b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i152 = i12;
                    x4.k2 k2Var2 = k2Var;
                    RepliesActivity repliesActivity = this.f1795b;
                    switch (i152) {
                        case 0:
                            int i162 = RepliesActivity.S;
                            float f122 = UptodownApp.I;
                            if (b4.d.t()) {
                                RepliesActivity repliesActivity2 = this.f1795b;
                                if (x4.u2.h(repliesActivity2) == null) {
                                    String string = repliesActivity2.getString(R.string.login_required_like_title);
                                    string.getClass();
                                    String string2 = repliesActivity2.getString(R.string.login_required_like_msg);
                                    string2.getClass();
                                    b2.t1.v(repliesActivity2, string, string2);
                                } else {
                                    new e1.v4(repliesActivity2, 1).h(repliesActivity2.y0().f10032t.f10067n);
                                    x4.k2 k2Var3 = k2Var;
                                    if (!j5.t.f6710b.contains(Long.valueOf(k2Var3.f11259a))) {
                                        v8 v8VarZ0 = repliesActivity2.z0();
                                        v8VarZ0.getClass();
                                        o7.a0 viewModelScope = ViewModelKt.getViewModelScope(v8VarZ0);
                                        v7.e eVar = o7.m0.f8289a;
                                        o7.c0.s(viewModelScope, v7.d.f10885a, null, new b6.g(k2Var3, repliesActivity2, v8VarZ0, (t6.c) null, 9), 2);
                                        repliesActivity2.y0().f10032t.f10077y.setText(String.valueOf(k2Var3.f11268s + 1));
                                    }
                                }
                            }
                            break;
                        case 1:
                            int i172 = RepliesActivity.S;
                            repliesActivity.C0(k2Var2.f11260b);
                            break;
                        case 2:
                            int i182 = RepliesActivity.S;
                            repliesActivity.C0(k2Var2.f11260b);
                            break;
                        case 3:
                            int i19 = RepliesActivity.S;
                            float f102 = UptodownApp.I;
                            if (b4.d.t()) {
                                RepliesActivity repliesActivity3 = this.f1795b;
                                if (x4.u2.h(repliesActivity3) == null) {
                                    String string3 = repliesActivity3.getString(R.string.login_required_like_title);
                                    string3.getClass();
                                    String string4 = repliesActivity3.getString(R.string.login_required_like_msg);
                                    string4.getClass();
                                    b2.t1.v(repliesActivity3, string3, string4);
                                } else {
                                    new e1.v4(repliesActivity3, 1).h(repliesActivity3.y0().f10031s.f10048n);
                                    x4.k2 k2Var4 = k2Var;
                                    if (!j5.t.f6710b.contains(Long.valueOf(k2Var4.f11259a))) {
                                        v8 v8VarZ02 = repliesActivity3.z0();
                                        v8VarZ02.getClass();
                                        o7.a0 viewModelScope2 = ViewModelKt.getViewModelScope(v8VarZ02);
                                        v7.e eVar2 = o7.m0.f8289a;
                                        o7.c0.s(viewModelScope2, v7.d.f10885a, null, new b6.g(k2Var4, repliesActivity3, v8VarZ02, (t6.c) null, 9), 2);
                                        repliesActivity3.y0().f10031s.f10057x.setText(String.valueOf(k2Var4.f11268s + 1));
                                    }
                                }
                            }
                            break;
                        case 4:
                            int i20 = RepliesActivity.S;
                            repliesActivity.C0(k2Var2.f11260b);
                            break;
                        default:
                            int i21 = RepliesActivity.S;
                            repliesActivity.C0(k2Var2.f11260b);
                            break;
                    }
                }
            });
        }
        y0().f10032t.f10073t.setOnClickListener(new j8(this, i10));
        y0().f10032t.f10073t.setVisibility(0);
        ImageView imageView = y0().f10032t.f10065l;
        int dimension = (int) imageView.getContext().getResources().getDimension(R.dimen.border_radius_xs);
        imageView.setForeground(ContextCompat.getDrawable(imageView.getContext(), R.drawable.shape_stroke_review_avatar_turbo));
        imageView.setPadding(dimension, dimension, dimension, dimension);
        y0().f10032t.f10063a.setVisibility(0);
        y0().f10031s.f10044a.setVisibility(8);
    }

    public final void E0() {
        w2 w2VarH = u2.h(this);
        if ((w2VarH != null ? w2VarH.f11434l : null) == null) {
            y0().f10026n.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.vector_user_default));
            return;
        }
        l0 l0VarE = g0.d().e(u2.e(w2VarH.f11434l));
        float f = UptodownApp.I;
        l0VarE.g(b4.d.f(this));
        l0VarE.h(b4.d.x(this));
        l0VarE.e(y0().f10026n, null);
        if (w2VarH.d()) {
            ImageView imageView = y0().f10026n;
            int dimension = (int) imageView.getContext().getResources().getDimension(R.dimen.border_radius_xs);
            imageView.setForeground(ContextCompat.getDrawable(imageView.getContext(), R.drawable.shape_stroke_review_small_avatar_turbo));
            imageView.setPadding(dimension, dimension, dimension, dimension);
        }
    }

    public final void F0() {
        w2 w2VarH = u2.h(this);
        if ((w2VarH != null ? w2VarH.f11432a : null) != null) {
            String str = w2VarH.f11432a;
            str.getClass();
            if (str.length() > 0) {
                y0().f10029q.setVisibility(8);
                return;
            }
        }
        y0().f10029q.setVisibility(0);
    }

    @Override // c4.k0, g4.h, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        RelativeLayout relativeLayout = y0().f10022a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        Intent intent = getIntent();
        c cVar = null;
        if (intent != null && (extras = intent.getExtras()) != null) {
            if (extras.containsKey("review")) {
                z0().f2220m.f(Build.VERSION.SDK_INT >= 34 ? (Parcelable) extras.getParcelable("review", k2.class) : extras.getParcelable("review"));
            }
            if (extras.containsKey("appName")) {
                z0().f2218k.f(extras.getString("appName"));
            }
            if (extras.containsKey("username")) {
                z0().f2219l.f(extras.getString("username"));
            }
            if (extras.containsKey("appIconUrl")) {
                z0().f2221n.f(extras.getString("appIconUrl"));
            }
            if (extras.containsKey("userAvatarUrl")) {
                z0().f2222o.f(extras.getString("userAvatarUrl"));
            }
            if (extras.containsKey("appId")) {
                o0 o0Var = z0().f2223p;
                Long lValueOf = Long.valueOf(extras.getLong("appId"));
                o0Var.getClass();
                o0Var.g(null, lValueOf);
            }
            if (extras.containsKey("appUrl")) {
                z0().f2224q.f(extras.getString("appUrl"));
            }
        }
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.core_vector_back);
        if (drawable != null) {
            y0().f10034w.setNavigationIcon(drawable);
            y0().f10034w.setNavigationContentDescription(getString(R.string.back));
        }
        int i = 0;
        y0().f10034w.setNavigationOnClickListener(new j8(this, i));
        y0().A.setTypeface(f4.c.f4883w);
        y0().f10035x.setTypeface(f4.c.f4884x);
        y0().f10036y.setTypeface(f4.c.f4883w);
        y0().f10036y.setText((CharSequence) z0().f2218k.getValue());
        l0 l0VarE = g0.d().e((String) z0().f2221n.getValue());
        float f = UptodownApp.I;
        l0VarE.g(b4.d.f(this));
        l0VarE.h(b4.d.x(this));
        l0VarE.e(y0().f10024l, null);
        y0().f10027o.setVisibility(0);
        int i6 = 1;
        y0().f10027o.setOnClickListener(new j8(this, i6));
        y0().f10037z.setTypeface(f4.c.f4884x);
        E0();
        int i10 = 2;
        y0().f10025m.setOnClickListener(new j8(this, i10));
        int i11 = 3;
        y0().f10029q.setOnClickListener(new j8(this, i11));
        y0().f10023b.setTypeface(f4.c.f4884x);
        y0().f10023b.setOnEditorActionListener(new c4.k2(this, i6));
        F0();
        y0().v.setLayoutManager(new LinearLayoutManager(this, 1, false));
        y0().v.setItemAnimator(new DefaultItemAnimator());
        y0().f10030r.getViewTreeObserver().addOnScrollChangedListener(new k7(this, i6));
        ViewCompat.setOnApplyWindowInsetsListener(y0().f10022a, new a(this, 9));
        if (z0().f2220m.getValue() != null) {
            Object value = z0().f2220m.getValue();
            value.getClass();
            long j = ((k2) value).f11259a;
            v8 v8VarZ0 = z0();
            v8VarZ0.getClass();
            a0 viewModelScope = ViewModelKt.getViewModelScope(v8VarZ0);
            e eVar = m0.f8289a;
            c0.s(viewModelScope, v7.d.f10885a, null, new j0(v8VarZ0, this, j, null), 2);
            Object value2 = z0().f2220m.getValue();
            value2.getClass();
            D0((k2) value2);
        } else {
            finish();
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        p7.c cVar2 = t7.n.f10349a;
        c0.s(lifecycleScope, cVar2, null, new n8(this, cVar, i), 2);
        c0.s(LifecycleOwnerKt.getLifecycleScope(this), cVar2, null, new n8(this, cVar, i6), 2);
        c0.s(LifecycleOwnerKt.getLifecycleScope(this), cVar2, null, new n8(this, cVar, i10), 2);
        c0.s(LifecycleOwnerKt.getLifecycleScope(this), cVar2, null, new n8(this, cVar, i11), 2);
        c0.s(LifecycleOwnerKt.getLifecycleScope(this), cVar2, null, new n8(this, cVar, 4), 2);
    }

    @Override // c4.k0, g4.s0, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        F0();
        E0();
    }

    public final t4.o0 y0() {
        return (t4.o0) this.O.getValue();
    }

    public final v8 z0() {
        return (v8) this.P.getValue();
    }
}
