package com.uptodown.activities.preferences;

import a4.d0;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.view.PointerIconCompat;
import androidx.lifecycle.l;
import androidx.viewbinding.ViewBindings;
import b4.d;
import c.e;
import c4.k0;
import c4.s4;
import c4.t;
import c4.y2;
import com.google.android.gms.internal.measurement.i5;
import com.google.android.gms.internal.measurement.z3;
import com.uptodown.UptodownApp;
import com.uptodown.activities.GdprPrivacySettings;
import com.uptodown.activities.LanguageSettingsActivity;
import com.uptodown.activities.preferences.AdvancedPreferencesActivity;
import com.uptodown.activities.preferences.MobileDataUsageActivity;
import com.uptodown.activities.preferences.PreferencesActivity;
import com.uptodown.tv.preferences.TvPrivacyPreferences;
import d7.a;
import e1.v4;
import f4.c;
import g4.u;
import j$.time.Year;
import j5.o;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.x;
import p6.i;
import p6.m;
import q6.a0;
import t0.f;
import t4.h0;
import t4.i0;
import x4.m2;
import y2.s;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class PreferencesActivity extends k0 {
    public static final /* synthetic */ int T = 0;
    public final m O;
    public final m P;
    public m2 Q;
    public final ActivityResultLauncher R;
    public final ActivityResultLauncher S;

    public PreferencesActivity() {
        final int i = 0;
        this.O = new m(new a(this) { // from class: d4.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f3593b;

            {
                this.f3593b = this;
            }

            @Override // d7.a
            public final Object invoke() {
                int i6 = i;
                PreferencesActivity preferencesActivity = this.f3593b;
                switch (i6) {
                    case 0:
                        int i10 = PreferencesActivity.T;
                        View viewInflate = preferencesActivity.getLayoutInflater().inflate(2131558790, (ViewGroup) null, false);
                        int i11 = 2131361813;
                        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, 2131361813);
                        if (viewFindChildViewById != null) {
                            h0 h0VarA = h0.a(viewFindChildViewById);
                            i11 = 2131361814;
                            View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, 2131361814);
                            if (viewFindChildViewById2 != null) {
                                h0 h0VarA2 = h0.a(viewFindChildViewById2);
                                i11 = 2131361906;
                                View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, 2131361906);
                                if (viewFindChildViewById3 != null) {
                                    h0 h0VarA3 = h0.a(viewFindChildViewById3);
                                    i11 = 2131361908;
                                    View viewFindChildViewById4 = ViewBindings.findChildViewById(viewInflate, 2131361908);
                                    if (viewFindChildViewById4 != null) {
                                        h0 h0VarA4 = h0.a(viewFindChildViewById4);
                                        i11 = 2131361909;
                                        View viewFindChildViewById5 = ViewBindings.findChildViewById(viewInflate, 2131361909);
                                        if (viewFindChildViewById5 != null) {
                                            b5.m mVarZ = b5.m.z(viewFindChildViewById5);
                                            i11 = 2131361932;
                                            View viewFindChildViewById6 = ViewBindings.findChildViewById(viewInflate, 2131361932);
                                            if (viewFindChildViewById6 != null) {
                                                d0 d0VarG = d0.g(viewFindChildViewById6);
                                                i11 = 2131362116;
                                                View viewFindChildViewById7 = ViewBindings.findChildViewById(viewInflate, 2131362116);
                                                if (viewFindChildViewById7 != null) {
                                                    d0 d0VarG2 = d0.g(viewFindChildViewById7);
                                                    i11 = 2131362169;
                                                    View viewFindChildViewById8 = ViewBindings.findChildViewById(viewInflate, 2131362169);
                                                    if (viewFindChildViewById8 != null) {
                                                        m8.q qVarC = m8.q.c(viewFindChildViewById8);
                                                        i11 = 2131362278;
                                                        View viewFindChildViewById9 = ViewBindings.findChildViewById(viewInflate, 2131362278);
                                                        if (viewFindChildViewById9 != null) {
                                                            d0 d0VarG3 = d0.g(viewFindChildViewById9);
                                                            i11 = 2131362279;
                                                            View viewFindChildViewById10 = ViewBindings.findChildViewById(viewInflate, 2131362279);
                                                            if (viewFindChildViewById10 != null) {
                                                                d0 d0VarG4 = d0.g(viewFindChildViewById10);
                                                                i11 = 2131362567;
                                                                View viewFindChildViewById11 = ViewBindings.findChildViewById(viewInflate, 2131362567);
                                                                if (viewFindChildViewById11 != null) {
                                                                    h0 h0VarA5 = h0.a(viewFindChildViewById11);
                                                                    i11 = 2131362709;
                                                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, 2131362709);
                                                                    if (linearLayout != null) {
                                                                        i11 = 2131362885;
                                                                        View viewFindChildViewById12 = ViewBindings.findChildViewById(viewInflate, 2131362885);
                                                                        if (viewFindChildViewById12 != null) {
                                                                            b5.m mVarZ2 = b5.m.z(viewFindChildViewById12);
                                                                            i11 = 2131362893;
                                                                            View viewFindChildViewById13 = ViewBindings.findChildViewById(viewInflate, 2131362893);
                                                                            if (viewFindChildViewById13 != null) {
                                                                                m8.q qVarC2 = m8.q.c(viewFindChildViewById13);
                                                                                i11 = 2131362942;
                                                                                View viewFindChildViewById14 = ViewBindings.findChildViewById(viewInflate, 2131362942);
                                                                                if (viewFindChildViewById14 != null) {
                                                                                    m8.q qVarC3 = m8.q.c(viewFindChildViewById14);
                                                                                    i11 = 2131363028;
                                                                                    View viewFindChildViewById15 = ViewBindings.findChildViewById(viewInflate, 2131363028);
                                                                                    if (viewFindChildViewById15 != null) {
                                                                                        m8.q qVarC4 = m8.q.c(viewFindChildViewById15);
                                                                                        i11 = 2131363044;
                                                                                        View viewFindChildViewById16 = ViewBindings.findChildViewById(viewInflate, 2131363044);
                                                                                        if (viewFindChildViewById16 != null) {
                                                                                            m8.q qVarC5 = m8.q.c(viewFindChildViewById16);
                                                                                            i11 = 2131363046;
                                                                                            View viewFindChildViewById17 = ViewBindings.findChildViewById(viewInflate, 2131363046);
                                                                                            if (viewFindChildViewById17 != null) {
                                                                                                h0 h0VarA6 = h0.a(viewFindChildViewById17);
                                                                                                i11 = 2131363054;
                                                                                                View viewFindChildViewById18 = ViewBindings.findChildViewById(viewInflate, 2131363054);
                                                                                                if (viewFindChildViewById18 != null) {
                                                                                                    d0 d0VarG5 = d0.g(viewFindChildViewById18);
                                                                                                    LinearLayout linearLayout2 = (LinearLayout) viewInflate;
                                                                                                    i11 = 2131363306;
                                                                                                    View viewFindChildViewById19 = ViewBindings.findChildViewById(viewInflate, 2131363306);
                                                                                                    if (viewFindChildViewById19 != null) {
                                                                                                        m8.q qVarC6 = m8.q.c(viewFindChildViewById19);
                                                                                                        i11 = 2131363429;
                                                                                                        View viewFindChildViewById20 = ViewBindings.findChildViewById(viewInflate, 2131363429);
                                                                                                        if (viewFindChildViewById20 != null) {
                                                                                                            d0 d0VarG6 = d0.g(viewFindChildViewById20);
                                                                                                            i11 = 2131363476;
                                                                                                            View viewFindChildViewById21 = ViewBindings.findChildViewById(viewInflate, 2131363476);
                                                                                                            if (viewFindChildViewById21 != null) {
                                                                                                                h0 h0VarA7 = h0.a(viewFindChildViewById21);
                                                                                                                i11 = 2131363558;
                                                                                                                Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(viewInflate, 2131363558);
                                                                                                                if (toolbar != null) {
                                                                                                                    i11 = 2131363583;
                                                                                                                    View viewFindChildViewById22 = ViewBindings.findChildViewById(viewInflate, 2131363583);
                                                                                                                    if (viewFindChildViewById22 != null) {
                                                                                                                        h0 h0VarA8 = h0.a(viewFindChildViewById22);
                                                                                                                        i11 = 2131364451;
                                                                                                                        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, 2131364451);
                                                                                                                        if (textView != null) {
                                                                                                                            i11 = 2131364622;
                                                                                                                            View viewFindChildViewById23 = ViewBindings.findChildViewById(viewInflate, 2131364622);
                                                                                                                            if (viewFindChildViewById23 != null) {
                                                                                                                                m8.q qVarC7 = m8.q.c(viewFindChildViewById23);
                                                                                                                                i11 = 2131364623;
                                                                                                                                View viewFindChildViewById24 = ViewBindings.findChildViewById(viewInflate, 2131364623);
                                                                                                                                if (viewFindChildViewById24 != null) {
                                                                                                                                    b5.m mVarZ3 = b5.m.z(viewFindChildViewById24);
                                                                                                                                    i11 = 2131364624;
                                                                                                                                    View viewFindChildViewById25 = ViewBindings.findChildViewById(viewInflate, 2131364624);
                                                                                                                                    if (viewFindChildViewById25 != null) {
                                                                                                                                        return new i0(linearLayout2, h0VarA, h0VarA2, h0VarA3, h0VarA4, mVarZ, d0VarG, d0VarG2, qVarC, d0VarG3, d0VarG4, h0VarA5, linearLayout, mVarZ2, qVarC2, qVarC3, qVarC4, qVarC5, h0VarA6, d0VarG5, qVarC6, d0VarG6, h0VarA7, toolbar, h0VarA8, textView, qVarC7, mVarZ3, d0.g(viewFindChildViewById25));
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
                        return null;
                    default:
                        int i12 = PreferencesActivity.T;
                        return new h4.a(preferencesActivity);
                }
            }
        });
        final int i6 = 1;
        this.P = new m(new a(this) { // from class: d4.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f3593b;

            {
                this.f3593b = this;
            }

            @Override // d7.a
            public final Object invoke() {
                int i62 = i6;
                PreferencesActivity preferencesActivity = this.f3593b;
                switch (i62) {
                    case 0:
                        int i10 = PreferencesActivity.T;
                        View viewInflate = preferencesActivity.getLayoutInflater().inflate(2131558790, (ViewGroup) null, false);
                        int i11 = 2131361813;
                        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, 2131361813);
                        if (viewFindChildViewById != null) {
                            h0 h0VarA = h0.a(viewFindChildViewById);
                            i11 = 2131361814;
                            View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, 2131361814);
                            if (viewFindChildViewById2 != null) {
                                h0 h0VarA2 = h0.a(viewFindChildViewById2);
                                i11 = 2131361906;
                                View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, 2131361906);
                                if (viewFindChildViewById3 != null) {
                                    h0 h0VarA3 = h0.a(viewFindChildViewById3);
                                    i11 = 2131361908;
                                    View viewFindChildViewById4 = ViewBindings.findChildViewById(viewInflate, 2131361908);
                                    if (viewFindChildViewById4 != null) {
                                        h0 h0VarA4 = h0.a(viewFindChildViewById4);
                                        i11 = 2131361909;
                                        View viewFindChildViewById5 = ViewBindings.findChildViewById(viewInflate, 2131361909);
                                        if (viewFindChildViewById5 != null) {
                                            b5.m mVarZ = b5.m.z(viewFindChildViewById5);
                                            i11 = 2131361932;
                                            View viewFindChildViewById6 = ViewBindings.findChildViewById(viewInflate, 2131361932);
                                            if (viewFindChildViewById6 != null) {
                                                d0 d0VarG = d0.g(viewFindChildViewById6);
                                                i11 = 2131362116;
                                                View viewFindChildViewById7 = ViewBindings.findChildViewById(viewInflate, 2131362116);
                                                if (viewFindChildViewById7 != null) {
                                                    d0 d0VarG2 = d0.g(viewFindChildViewById7);
                                                    i11 = 2131362169;
                                                    View viewFindChildViewById8 = ViewBindings.findChildViewById(viewInflate, 2131362169);
                                                    if (viewFindChildViewById8 != null) {
                                                        m8.q qVarC = m8.q.c(viewFindChildViewById8);
                                                        i11 = 2131362278;
                                                        View viewFindChildViewById9 = ViewBindings.findChildViewById(viewInflate, 2131362278);
                                                        if (viewFindChildViewById9 != null) {
                                                            d0 d0VarG3 = d0.g(viewFindChildViewById9);
                                                            i11 = 2131362279;
                                                            View viewFindChildViewById10 = ViewBindings.findChildViewById(viewInflate, 2131362279);
                                                            if (viewFindChildViewById10 != null) {
                                                                d0 d0VarG4 = d0.g(viewFindChildViewById10);
                                                                i11 = 2131362567;
                                                                View viewFindChildViewById11 = ViewBindings.findChildViewById(viewInflate, 2131362567);
                                                                if (viewFindChildViewById11 != null) {
                                                                    h0 h0VarA5 = h0.a(viewFindChildViewById11);
                                                                    i11 = 2131362709;
                                                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, 2131362709);
                                                                    if (linearLayout != null) {
                                                                        i11 = 2131362885;
                                                                        View viewFindChildViewById12 = ViewBindings.findChildViewById(viewInflate, 2131362885);
                                                                        if (viewFindChildViewById12 != null) {
                                                                            b5.m mVarZ2 = b5.m.z(viewFindChildViewById12);
                                                                            i11 = 2131362893;
                                                                            View viewFindChildViewById13 = ViewBindings.findChildViewById(viewInflate, 2131362893);
                                                                            if (viewFindChildViewById13 != null) {
                                                                                m8.q qVarC2 = m8.q.c(viewFindChildViewById13);
                                                                                i11 = 2131362942;
                                                                                View viewFindChildViewById14 = ViewBindings.findChildViewById(viewInflate, 2131362942);
                                                                                if (viewFindChildViewById14 != null) {
                                                                                    m8.q qVarC3 = m8.q.c(viewFindChildViewById14);
                                                                                    i11 = 2131363028;
                                                                                    View viewFindChildViewById15 = ViewBindings.findChildViewById(viewInflate, 2131363028);
                                                                                    if (viewFindChildViewById15 != null) {
                                                                                        m8.q qVarC4 = m8.q.c(viewFindChildViewById15);
                                                                                        i11 = 2131363044;
                                                                                        View viewFindChildViewById16 = ViewBindings.findChildViewById(viewInflate, 2131363044);
                                                                                        if (viewFindChildViewById16 != null) {
                                                                                            m8.q qVarC5 = m8.q.c(viewFindChildViewById16);
                                                                                            i11 = 2131363046;
                                                                                            View viewFindChildViewById17 = ViewBindings.findChildViewById(viewInflate, 2131363046);
                                                                                            if (viewFindChildViewById17 != null) {
                                                                                                h0 h0VarA6 = h0.a(viewFindChildViewById17);
                                                                                                i11 = 2131363054;
                                                                                                View viewFindChildViewById18 = ViewBindings.findChildViewById(viewInflate, 2131363054);
                                                                                                if (viewFindChildViewById18 != null) {
                                                                                                    d0 d0VarG5 = d0.g(viewFindChildViewById18);
                                                                                                    LinearLayout linearLayout2 = (LinearLayout) viewInflate;
                                                                                                    i11 = 2131363306;
                                                                                                    View viewFindChildViewById19 = ViewBindings.findChildViewById(viewInflate, 2131363306);
                                                                                                    if (viewFindChildViewById19 != null) {
                                                                                                        m8.q qVarC6 = m8.q.c(viewFindChildViewById19);
                                                                                                        i11 = 2131363429;
                                                                                                        View viewFindChildViewById20 = ViewBindings.findChildViewById(viewInflate, 2131363429);
                                                                                                        if (viewFindChildViewById20 != null) {
                                                                                                            d0 d0VarG6 = d0.g(viewFindChildViewById20);
                                                                                                            i11 = 2131363476;
                                                                                                            View viewFindChildViewById21 = ViewBindings.findChildViewById(viewInflate, 2131363476);
                                                                                                            if (viewFindChildViewById21 != null) {
                                                                                                                h0 h0VarA7 = h0.a(viewFindChildViewById21);
                                                                                                                i11 = 2131363558;
                                                                                                                Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(viewInflate, 2131363558);
                                                                                                                if (toolbar != null) {
                                                                                                                    i11 = 2131363583;
                                                                                                                    View viewFindChildViewById22 = ViewBindings.findChildViewById(viewInflate, 2131363583);
                                                                                                                    if (viewFindChildViewById22 != null) {
                                                                                                                        h0 h0VarA8 = h0.a(viewFindChildViewById22);
                                                                                                                        i11 = 2131364451;
                                                                                                                        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, 2131364451);
                                                                                                                        if (textView != null) {
                                                                                                                            i11 = 2131364622;
                                                                                                                            View viewFindChildViewById23 = ViewBindings.findChildViewById(viewInflate, 2131364622);
                                                                                                                            if (viewFindChildViewById23 != null) {
                                                                                                                                m8.q qVarC7 = m8.q.c(viewFindChildViewById23);
                                                                                                                                i11 = 2131364623;
                                                                                                                                View viewFindChildViewById24 = ViewBindings.findChildViewById(viewInflate, 2131364623);
                                                                                                                                if (viewFindChildViewById24 != null) {
                                                                                                                                    b5.m mVarZ3 = b5.m.z(viewFindChildViewById24);
                                                                                                                                    i11 = 2131364624;
                                                                                                                                    View viewFindChildViewById25 = ViewBindings.findChildViewById(viewInflate, 2131364624);
                                                                                                                                    if (viewFindChildViewById25 != null) {
                                                                                                                                        return new i0(linearLayout2, h0VarA, h0VarA2, h0VarA3, h0VarA4, mVarZ, d0VarG, d0VarG2, qVarC, d0VarG3, d0VarG4, h0VarA5, linearLayout, mVarZ2, qVarC2, qVarC3, qVarC4, qVarC5, h0VarA6, d0VarG5, qVarC6, d0VarG6, h0VarA7, toolbar, h0VarA8, textView, qVarC7, mVarZ3, d0.g(viewFindChildViewById25));
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
                        return null;
                    default:
                        int i12 = PreferencesActivity.T;
                        return new h4.a(preferencesActivity);
                }
            }
        });
        final int i10 = 0;
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: d4.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f3597b;

            {
                this.f3597b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                int i11 = i10;
                PreferencesActivity preferencesActivity = this.f3597b;
                switch (i11) {
                    case 0:
                        int i12 = PreferencesActivity.T;
                        if (((ActivityResult) obj).getResultCode() == 1003) {
                            preferencesActivity.setResult(PointerIconCompat.TYPE_HELP);
                            preferencesActivity.finish();
                            preferencesActivity.startActivity(preferencesActivity.getIntent());
                        }
                        break;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i13 = PreferencesActivity.T;
                        int i14 = 0;
                        if (zBooleanValue) {
                            SharedPreferences sharedPreferences = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences.getClass();
                            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                            editorEdit.putBoolean("recibir_notificaciones", true);
                            editorEdit.apply();
                            preferencesActivity.C0();
                            break;
                        } else {
                            ((SwitchCompat) preferencesActivity.z0().E.f83m).setChecked(false);
                            preferencesActivity.B0();
                            int i15 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("notification_permission_request_api33", -1) + 1;
                            SharedPreferences sharedPreferences2 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences2.getClass();
                            SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                            editorEdit2.putInt("notification_permission_request_api33", i15);
                            editorEdit2.apply();
                            if (Build.VERSION.SDK_INT >= 33 && i15 >= 2 && ContextCompat.checkSelfPermission(preferencesActivity, "android.permission.POST_NOTIFICATIONS") != 0) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                                builder.setTitle(2131952651);
                                builder.setMessage(2131951916);
                                builder.setPositiveButton(2131951759, new p(preferencesActivity, i14));
                                builder.create().show();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        activityResultLauncherRegisterForActivityResult.getClass();
        this.R = activityResultLauncherRegisterForActivityResult;
        final int i11 = 1;
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback(this) { // from class: d4.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f3597b;

            {
                this.f3597b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                int i112 = i11;
                PreferencesActivity preferencesActivity = this.f3597b;
                switch (i112) {
                    case 0:
                        int i12 = PreferencesActivity.T;
                        if (((ActivityResult) obj).getResultCode() == 1003) {
                            preferencesActivity.setResult(PointerIconCompat.TYPE_HELP);
                            preferencesActivity.finish();
                            preferencesActivity.startActivity(preferencesActivity.getIntent());
                        }
                        break;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i13 = PreferencesActivity.T;
                        int i14 = 0;
                        if (zBooleanValue) {
                            SharedPreferences sharedPreferences = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences.getClass();
                            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                            editorEdit.putBoolean("recibir_notificaciones", true);
                            editorEdit.apply();
                            preferencesActivity.C0();
                            break;
                        } else {
                            ((SwitchCompat) preferencesActivity.z0().E.f83m).setChecked(false);
                            preferencesActivity.B0();
                            int i15 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("notification_permission_request_api33", -1) + 1;
                            SharedPreferences sharedPreferences2 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences2.getClass();
                            SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                            editorEdit2.putInt("notification_permission_request_api33", i15);
                            editorEdit2.apply();
                            if (Build.VERSION.SDK_INT >= 33 && i15 >= 2 && ContextCompat.checkSelfPermission(preferencesActivity, "android.permission.POST_NOTIFICATIONS") != 0) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                                builder.setTitle(2131952651);
                                builder.setMessage(2131951916);
                                builder.setPositiveButton(2131951759, new p(preferencesActivity, i14));
                                builder.create().show();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        activityResultLauncherRegisterForActivityResult2.getClass();
        this.S = activityResultLauncherRegisterForActivityResult2;
    }

    public final String A0() {
        int i = Integer.parseInt(z3.u(this));
        if (i == 1) {
            String string = getString(2131952716);
            string.getClass();
            return string;
        }
        if (i == 2) {
            String string2 = getString(2131952717);
            string2.getClass();
            return string2;
        }
        if (i == 3) {
            String string3 = getString(2131952719);
            string3.getClass();
            return string3;
        }
        if (i != 4) {
            return "";
        }
        String string4 = getString(2131952718);
        string4.getClass();
        return string4;
    }

    public final void B0() {
        ((TextView) z0().E.f84n).setText(getString(2131951951));
        v4 v4Var = new v4(this, 1);
        RelativeLayout relativeLayout = (RelativeLayout) z0().K.f1061b;
        relativeLayout.getClass();
        v4Var.g(relativeLayout, 0.3f);
        v4 v4Var2 = new v4(this, 1);
        RelativeLayout relativeLayout2 = (RelativeLayout) z0().f9884q.f81b;
        relativeLayout2.getClass();
        v4Var2.g(relativeLayout2, 0.3f);
        ((SwitchCompat) z0().f9884q.f83m).setClickable(false);
        v4 v4Var3 = new v4(this, 1);
        RelativeLayout relativeLayout3 = (RelativeLayout) z0().f9887t.f81b;
        relativeLayout3.getClass();
        v4Var3.g(relativeLayout3, 0.3f);
        ((SwitchCompat) z0().f9887t.f83m).setClickable(false);
        v4 v4Var4 = new v4(this, 1);
        RelativeLayout relativeLayout4 = (RelativeLayout) z0().f9886s.f81b;
        relativeLayout4.getClass();
        v4Var4.g(relativeLayout4, 0.3f);
        ((SwitchCompat) z0().f9886s.f83m).setClickable(false);
    }

    public final void C0() {
        SharedPreferences sharedPreferences;
        ((TextView) z0().E.f84n).setText(getString(2131951984));
        try {
            sharedPreferences = getSharedPreferences("SettingsPreferences", 0);
        } catch (Exception unused) {
        }
        boolean z9 = sharedPreferences.contains("updates_active") ? sharedPreferences.getBoolean("updates_active", true) : true;
        if (z9) {
            v4 v4Var = new v4(this, 1);
            RelativeLayout relativeLayout = (RelativeLayout) z0().K.f1061b;
            relativeLayout.getClass();
            v4Var.g(relativeLayout, 1.0f);
        } else {
            v4 v4Var2 = new v4(this, 1);
            RelativeLayout relativeLayout2 = (RelativeLayout) z0().K.f1061b;
            relativeLayout2.getClass();
            v4Var2.g(relativeLayout2, 0.3f);
        }
        v4 v4Var3 = new v4(this, 1);
        RelativeLayout relativeLayout3 = (RelativeLayout) z0().f9884q.f81b;
        relativeLayout3.getClass();
        v4Var3.g(relativeLayout3, 1.0f);
        ((SwitchCompat) z0().f9884q.f83m).setClickable(true);
        v4 v4Var4 = new v4(this, 1);
        RelativeLayout relativeLayout4 = (RelativeLayout) z0().f9887t.f81b;
        relativeLayout4.getClass();
        v4Var4.g(relativeLayout4, 1.0f);
        ((SwitchCompat) z0().f9887t.f83m).setClickable(true);
        v4 v4Var5 = new v4(this, 1);
        RelativeLayout relativeLayout5 = (RelativeLayout) z0().f9886s.f81b;
        relativeLayout5.getClass();
        v4Var5.g(relativeLayout5, 1.0f);
        ((SwitchCompat) z0().f9886s.f83m).setClickable(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void finish() {
        /*
            r7 = this;
            x4.m2 r1 = new x4.m2
            r1.<init>(r7)
            x4.m2 r0 = r7.Q
            if (r0 == 0) goto L20
            java.lang.String r2 = r0.f11286a
            java.lang.String r3 = r1.f11286a
            if (r2 != 0) goto L11
            if (r3 == 0) goto L19
        L11:
            if (r2 == 0) goto L20
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L20
        L19:
            boolean r0 = r0.f11287b
            boolean r2 = r1.f11287b
            if (r0 != r2) goto L20
            goto L39
        L20:
            x4.p r3 = new x4.p
            r3.<init>()
            r3.f(r7)
            androidx.lifecycle.LifecycleCoroutineScope r6 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r7)
            b6.g r0 = new b6.g
            r5 = 15
            r4 = 0
            r2 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = 3
            o7.c0.s(r6, r4, r4, r0, r1)
        L39:
            super.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.preferences.PreferencesActivity.finish():void");
    }

    @Override // c4.k0, g4.h, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        int i;
        File externalFilesDir;
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        boolean z9 = true;
        z9 = true;
        super.onCreate(bundle);
        LinearLayout linearLayout = z0().f9877a;
        linearLayout.getClass();
        setContentView(linearLayout);
        float f = UptodownApp.I;
        final int i6 = 0;
        if (d.n(this)) {
            setRequestedOrientation(0);
        }
        this.Q = new m2(this);
        Drawable drawable = ContextCompat.getDrawable(this, 2131230922);
        if (drawable != null) {
            z0().G.setNavigationIcon(drawable);
            z0().G.setNavigationContentDescription(getString(2131951735));
        }
        final int i10 = 16;
        z0().G.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: d4.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f3589b;

            {
                this.f3589b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                PreferencesActivity preferencesActivity = this.f3589b;
                switch (i11) {
                    case 0:
                        int i12 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9884q.f83m).performClick();
                        break;
                    case 1:
                        int i13 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9887t.f83m).performClick();
                        break;
                    case 2:
                        int i14 = PreferencesActivity.T;
                        v vVar = new v();
                        vVar.f7022a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                        int value = Year.now().getValue();
                        preferencesActivity.Q();
                        AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                        x xVar = new x();
                        u uVarC = u.c(preferencesActivity.getLayoutInflater());
                        ((TextView) uVarC.f5273r).setTypeface(f4.c.f4882w);
                        TextView textView = uVarC.f5271p;
                        textView.setTypeface(f4.c.f4883x);
                        textView.setText(preferencesActivity.getString(2131951671));
                        uVarC.f5270o.setTypeface(f4.c.f4883x);
                        EditText editText = uVarC.f5267l;
                        editText.setTypeface(f4.c.f4883x);
                        ((TextView) uVarC.f5272q).setTypeface(f4.c.f4883x);
                        TextView textView2 = uVarC.f5268m;
                        textView2.setTypeface(f4.c.f4882w);
                        TextView textView3 = uVarC.f5269n;
                        textView3.setTypeface(f4.c.f4882w);
                        int i15 = vVar.f7022a;
                        if (i15 > 0) {
                            editText.setText(String.valueOf(i15));
                        }
                        textView2.setOnClickListener(new s4(uVarC, value, preferencesActivity, xVar));
                        z3.J(textView3);
                        textView3.setText(preferencesActivity.getString(2131952538));
                        textView3.setOnClickListener(new t(vVar, uVarC, preferencesActivity, 10));
                        builder.setView(uVarC.f5266b);
                        builder.setCancelable(true);
                        AlertDialog alertDialogCreate = builder.create();
                        xVar.f7024a = alertDialogCreate;
                        if (alertDialogCreate != null) {
                            Window window = alertDialogCreate.getWindow();
                            if (window != null) {
                                a4.x.y(window, 0);
                            }
                            ((AlertDialog) xVar.f7024a).show();
                        }
                        break;
                    case 3:
                        int i16 = PreferencesActivity.T;
                        Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                        ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                        float f10 = UptodownApp.I;
                        activityResultLauncher.launch(intent, b4.d.b(preferencesActivity));
                        break;
                    case 4:
                        int i17 = PreferencesActivity.T;
                        float f11 = UptodownApp.I;
                        if (!b4.d.n(preferencesActivity)) {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), b4.d.a(preferencesActivity));
                        } else {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                        }
                        break;
                    case 5:
                        int i18 = PreferencesActivity.T;
                        Intent intent2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent2.putExtra("advanced_settings_title", preferencesActivity.getString(2131951662));
                        intent2.putExtra("advanced_settings_index", 3);
                        float f12 = UptodownApp.I;
                        preferencesActivity.startActivity(intent2, b4.d.a(preferencesActivity));
                        break;
                    case 6:
                        int i19 = PreferencesActivity.T;
                        Intent intent3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent3.putExtra("advanced_settings_title", preferencesActivity.getString(2131952660));
                        intent3.putExtra("advanced_settings_index", 0);
                        float f13 = UptodownApp.I;
                        preferencesActivity.startActivity(intent3, b4.d.a(preferencesActivity));
                        break;
                    case 7:
                        int i20 = PreferencesActivity.T;
                        Intent intent4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent4.putExtra("advanced_settings_title", preferencesActivity.getString(2131952632));
                        intent4.putExtra("advanced_settings_index", 1);
                        float f14 = UptodownApp.I;
                        preferencesActivity.startActivity(intent4, b4.d.a(preferencesActivity));
                        break;
                    case 8:
                        int i21 = PreferencesActivity.T;
                        String string = preferencesActivity.getString(2131952497);
                        string.getClass();
                        String string2 = preferencesActivity.getString(2131952725);
                        string2.getClass();
                        j5.c.e(preferencesActivity, string2, string);
                        break;
                    case 9:
                        int i22 = PreferencesActivity.T;
                        Intent intent5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent5.putExtra("advanced_settings_title", preferencesActivity.getString(2131951643));
                        intent5.putExtra("advanced_settings_index", 2);
                        float f15 = UptodownApp.I;
                        preferencesActivity.startActivity(intent5, b4.d.a(preferencesActivity));
                        break;
                    case 10:
                        int i23 = PreferencesActivity.T;
                        Intent intent6 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent6.putExtra("advanced_settings_title", preferencesActivity.getString(2131951646));
                        intent6.putExtra("advanced_settings_index", 4);
                        float f16 = UptodownApp.I;
                        preferencesActivity.startActivity(intent6, b4.d.a(preferencesActivity));
                        break;
                    case 11:
                        int i24 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().L.f83m).performClick();
                        break;
                    case 12:
                        int i25 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9886s.f83m).performClick();
                        break;
                    case 13:
                        int i26 = PreferencesActivity.T;
                        preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                        break;
                    case 14:
                        int i27 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9883p.f83m).performClick();
                        break;
                    case 15:
                        int i28 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().C.f83m).performClick();
                        break;
                    case 16:
                        int i29 = PreferencesActivity.T;
                        preferencesActivity.finish();
                        break;
                    default:
                        int i30 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().E.f83m).performClick();
                        break;
                }
            }
        });
        z0().I.setTypeface(c.f4882w);
        z0().f9888u.f9844n.setTypeface(c.f4882w);
        l.y(this, 2131952104, z0().f9888u.f9844n).f9888u.f9843m.setTypeface(c.f4883x);
        z0().f9888u.f9843m.setVisibility(0);
        try {
            sharedPreferences2 = getSharedPreferences("SettingsPreferences", 0);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        String string = sharedPreferences2.contains("Language") ? sharedPreferences2.getString("Language", null) : null;
        String[] stringArray = getResources().getStringArray(2130903043);
        stringArray.getClass();
        String[] stringArray2 = getResources().getStringArray(2130903045);
        stringArray2.getClass();
        int length = stringArray.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                str = "";
                break;
            } else {
                if (stringArray[i11].equals(string)) {
                    str = stringArray2[i11];
                    str.getClass();
                    break;
                }
                i11++;
            }
        }
        z0().f9888u.f9843m.setText(str);
        final int i12 = 3;
        z0().f9888u.f9841b.setOnClickListener(new View.OnClickListener(this) { // from class: d4.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f3589b;

            {
                this.f3589b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i12;
                PreferencesActivity preferencesActivity = this.f3589b;
                switch (i112) {
                    case 0:
                        int i122 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9884q.f83m).performClick();
                        break;
                    case 1:
                        int i13 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9887t.f83m).performClick();
                        break;
                    case 2:
                        int i14 = PreferencesActivity.T;
                        v vVar = new v();
                        vVar.f7022a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                        int value = Year.now().getValue();
                        preferencesActivity.Q();
                        AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                        x xVar = new x();
                        u uVarC = u.c(preferencesActivity.getLayoutInflater());
                        ((TextView) uVarC.f5273r).setTypeface(f4.c.f4882w);
                        TextView textView = uVarC.f5271p;
                        textView.setTypeface(f4.c.f4883x);
                        textView.setText(preferencesActivity.getString(2131951671));
                        uVarC.f5270o.setTypeface(f4.c.f4883x);
                        EditText editText = uVarC.f5267l;
                        editText.setTypeface(f4.c.f4883x);
                        ((TextView) uVarC.f5272q).setTypeface(f4.c.f4883x);
                        TextView textView2 = uVarC.f5268m;
                        textView2.setTypeface(f4.c.f4882w);
                        TextView textView3 = uVarC.f5269n;
                        textView3.setTypeface(f4.c.f4882w);
                        int i15 = vVar.f7022a;
                        if (i15 > 0) {
                            editText.setText(String.valueOf(i15));
                        }
                        textView2.setOnClickListener(new s4(uVarC, value, preferencesActivity, xVar));
                        z3.J(textView3);
                        textView3.setText(preferencesActivity.getString(2131952538));
                        textView3.setOnClickListener(new t(vVar, uVarC, preferencesActivity, 10));
                        builder.setView(uVarC.f5266b);
                        builder.setCancelable(true);
                        AlertDialog alertDialogCreate = builder.create();
                        xVar.f7024a = alertDialogCreate;
                        if (alertDialogCreate != null) {
                            Window window = alertDialogCreate.getWindow();
                            if (window != null) {
                                a4.x.y(window, 0);
                            }
                            ((AlertDialog) xVar.f7024a).show();
                        }
                        break;
                    case 3:
                        int i16 = PreferencesActivity.T;
                        Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                        ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                        float f10 = UptodownApp.I;
                        activityResultLauncher.launch(intent, b4.d.b(preferencesActivity));
                        break;
                    case 4:
                        int i17 = PreferencesActivity.T;
                        float f11 = UptodownApp.I;
                        if (!b4.d.n(preferencesActivity)) {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), b4.d.a(preferencesActivity));
                        } else {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                        }
                        break;
                    case 5:
                        int i18 = PreferencesActivity.T;
                        Intent intent2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent2.putExtra("advanced_settings_title", preferencesActivity.getString(2131951662));
                        intent2.putExtra("advanced_settings_index", 3);
                        float f12 = UptodownApp.I;
                        preferencesActivity.startActivity(intent2, b4.d.a(preferencesActivity));
                        break;
                    case 6:
                        int i19 = PreferencesActivity.T;
                        Intent intent3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent3.putExtra("advanced_settings_title", preferencesActivity.getString(2131952660));
                        intent3.putExtra("advanced_settings_index", 0);
                        float f13 = UptodownApp.I;
                        preferencesActivity.startActivity(intent3, b4.d.a(preferencesActivity));
                        break;
                    case 7:
                        int i20 = PreferencesActivity.T;
                        Intent intent4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent4.putExtra("advanced_settings_title", preferencesActivity.getString(2131952632));
                        intent4.putExtra("advanced_settings_index", 1);
                        float f14 = UptodownApp.I;
                        preferencesActivity.startActivity(intent4, b4.d.a(preferencesActivity));
                        break;
                    case 8:
                        int i21 = PreferencesActivity.T;
                        String string2 = preferencesActivity.getString(2131952497);
                        string2.getClass();
                        String string22 = preferencesActivity.getString(2131952725);
                        string22.getClass();
                        j5.c.e(preferencesActivity, string22, string2);
                        break;
                    case 9:
                        int i22 = PreferencesActivity.T;
                        Intent intent5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent5.putExtra("advanced_settings_title", preferencesActivity.getString(2131951643));
                        intent5.putExtra("advanced_settings_index", 2);
                        float f15 = UptodownApp.I;
                        preferencesActivity.startActivity(intent5, b4.d.a(preferencesActivity));
                        break;
                    case 10:
                        int i23 = PreferencesActivity.T;
                        Intent intent6 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent6.putExtra("advanced_settings_title", preferencesActivity.getString(2131951646));
                        intent6.putExtra("advanced_settings_index", 4);
                        float f16 = UptodownApp.I;
                        preferencesActivity.startActivity(intent6, b4.d.a(preferencesActivity));
                        break;
                    case 11:
                        int i24 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().L.f83m).performClick();
                        break;
                    case 12:
                        int i25 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9886s.f83m).performClick();
                        break;
                    case 13:
                        int i26 = PreferencesActivity.T;
                        preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                        break;
                    case 14:
                        int i27 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9883p.f83m).performClick();
                        break;
                    case 15:
                        int i28 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().C.f83m).performClick();
                        break;
                    case 16:
                        int i29 = PreferencesActivity.T;
                        preferencesActivity.finish();
                        break;
                    default:
                        int i30 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().E.f83m).performClick();
                        break;
                }
            }
        });
        ((TextView) z0().J.f7781l).setTypeface(c.f4882w);
        ((TextView) l.y(this, 2131952709, (TextView) z0().J.f7781l).L.f85o).setTypeface(c.f4882w);
        ((TextView) l.y(this, 2131952709, (TextView) z0().L.f85o).L.f84n).setTypeface(c.f4883x);
        final int i13 = 11;
        ((RelativeLayout) z0().L.f82l).setOnClickListener(new View.OnClickListener(this) { // from class: d4.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f3589b;

            {
                this.f3589b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i13;
                PreferencesActivity preferencesActivity = this.f3589b;
                switch (i112) {
                    case 0:
                        int i122 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9884q.f83m).performClick();
                        break;
                    case 1:
                        int i132 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9887t.f83m).performClick();
                        break;
                    case 2:
                        int i14 = PreferencesActivity.T;
                        v vVar = new v();
                        vVar.f7022a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                        int value = Year.now().getValue();
                        preferencesActivity.Q();
                        AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                        x xVar = new x();
                        u uVarC = u.c(preferencesActivity.getLayoutInflater());
                        ((TextView) uVarC.f5273r).setTypeface(f4.c.f4882w);
                        TextView textView = uVarC.f5271p;
                        textView.setTypeface(f4.c.f4883x);
                        textView.setText(preferencesActivity.getString(2131951671));
                        uVarC.f5270o.setTypeface(f4.c.f4883x);
                        EditText editText = uVarC.f5267l;
                        editText.setTypeface(f4.c.f4883x);
                        ((TextView) uVarC.f5272q).setTypeface(f4.c.f4883x);
                        TextView textView2 = uVarC.f5268m;
                        textView2.setTypeface(f4.c.f4882w);
                        TextView textView3 = uVarC.f5269n;
                        textView3.setTypeface(f4.c.f4882w);
                        int i15 = vVar.f7022a;
                        if (i15 > 0) {
                            editText.setText(String.valueOf(i15));
                        }
                        textView2.setOnClickListener(new s4(uVarC, value, preferencesActivity, xVar));
                        z3.J(textView3);
                        textView3.setText(preferencesActivity.getString(2131952538));
                        textView3.setOnClickListener(new t(vVar, uVarC, preferencesActivity, 10));
                        builder.setView(uVarC.f5266b);
                        builder.setCancelable(true);
                        AlertDialog alertDialogCreate = builder.create();
                        xVar.f7024a = alertDialogCreate;
                        if (alertDialogCreate != null) {
                            Window window = alertDialogCreate.getWindow();
                            if (window != null) {
                                a4.x.y(window, 0);
                            }
                            ((AlertDialog) xVar.f7024a).show();
                        }
                        break;
                    case 3:
                        int i16 = PreferencesActivity.T;
                        Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                        ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                        float f10 = UptodownApp.I;
                        activityResultLauncher.launch(intent, b4.d.b(preferencesActivity));
                        break;
                    case 4:
                        int i17 = PreferencesActivity.T;
                        float f11 = UptodownApp.I;
                        if (!b4.d.n(preferencesActivity)) {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), b4.d.a(preferencesActivity));
                        } else {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                        }
                        break;
                    case 5:
                        int i18 = PreferencesActivity.T;
                        Intent intent2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent2.putExtra("advanced_settings_title", preferencesActivity.getString(2131951662));
                        intent2.putExtra("advanced_settings_index", 3);
                        float f12 = UptodownApp.I;
                        preferencesActivity.startActivity(intent2, b4.d.a(preferencesActivity));
                        break;
                    case 6:
                        int i19 = PreferencesActivity.T;
                        Intent intent3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent3.putExtra("advanced_settings_title", preferencesActivity.getString(2131952660));
                        intent3.putExtra("advanced_settings_index", 0);
                        float f13 = UptodownApp.I;
                        preferencesActivity.startActivity(intent3, b4.d.a(preferencesActivity));
                        break;
                    case 7:
                        int i20 = PreferencesActivity.T;
                        Intent intent4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent4.putExtra("advanced_settings_title", preferencesActivity.getString(2131952632));
                        intent4.putExtra("advanced_settings_index", 1);
                        float f14 = UptodownApp.I;
                        preferencesActivity.startActivity(intent4, b4.d.a(preferencesActivity));
                        break;
                    case 8:
                        int i21 = PreferencesActivity.T;
                        String string2 = preferencesActivity.getString(2131952497);
                        string2.getClass();
                        String string22 = preferencesActivity.getString(2131952725);
                        string22.getClass();
                        j5.c.e(preferencesActivity, string22, string2);
                        break;
                    case 9:
                        int i22 = PreferencesActivity.T;
                        Intent intent5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent5.putExtra("advanced_settings_title", preferencesActivity.getString(2131951643));
                        intent5.putExtra("advanced_settings_index", 2);
                        float f15 = UptodownApp.I;
                        preferencesActivity.startActivity(intent5, b4.d.a(preferencesActivity));
                        break;
                    case 10:
                        int i23 = PreferencesActivity.T;
                        Intent intent6 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent6.putExtra("advanced_settings_title", preferencesActivity.getString(2131951646));
                        intent6.putExtra("advanced_settings_index", 4);
                        float f16 = UptodownApp.I;
                        preferencesActivity.startActivity(intent6, b4.d.a(preferencesActivity));
                        break;
                    case 11:
                        int i24 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().L.f83m).performClick();
                        break;
                    case 12:
                        int i25 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9886s.f83m).performClick();
                        break;
                    case 13:
                        int i26 = PreferencesActivity.T;
                        preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                        break;
                    case 14:
                        int i27 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9883p.f83m).performClick();
                        break;
                    case 15:
                        int i28 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().C.f83m).performClick();
                        break;
                    case 16:
                        int i29 = PreferencesActivity.T;
                        preferencesActivity.finish();
                        break;
                    default:
                        int i30 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().E.f83m).performClick();
                        break;
                }
            }
        });
        if (z3.p(this, "updates_active", true)) {
            v4 v4Var = new v4(this, 1);
            RelativeLayout relativeLayout = (RelativeLayout) z0().K.f1061b;
            relativeLayout.getClass();
            v4Var.g(relativeLayout, 1.0f);
            ((SwitchCompat) l.y(this, 2131951984, (TextView) z0().L.f84n).L.f83m).setChecked(true);
        } else {
            v4 v4Var2 = new v4(this, 1);
            RelativeLayout relativeLayout2 = (RelativeLayout) z0().K.f1061b;
            relativeLayout2.getClass();
            v4Var2.g(relativeLayout2, 0.3f);
            ((SwitchCompat) l.y(this, 2131951951, (TextView) z0().L.f84n).L.f83m).setChecked(false);
        }
        final int i14 = 2;
        ((SwitchCompat) z0().L.f83m).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: d4.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f3591b;

            {
                this.f3591b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                int i15 = i14;
                PreferencesActivity preferencesActivity = this.f3591b;
                switch (i15) {
                    case 0:
                        int i16 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences3 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences3.getClass();
                        SharedPreferences.Editor editorEdit = sharedPreferences3.edit();
                        editorEdit.putBoolean("download_notification", z10);
                        editorEdit.apply();
                        break;
                    case 1:
                        int i17 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences4 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences4.getClass();
                        SharedPreferences.Editor editorEdit2 = sharedPreferences4.edit();
                        editorEdit2.putBoolean("installation_notification", z10);
                        editorEdit2.apply();
                        break;
                    case 2:
                        int i18 = PreferencesActivity.T;
                        if (!z10) {
                            v4 v4Var3 = new v4(preferencesActivity, 1);
                            RelativeLayout relativeLayout3 = (RelativeLayout) preferencesActivity.z0().K.f1061b;
                            relativeLayout3.getClass();
                            v4Var3.g(relativeLayout3, 0.3f);
                            SharedPreferences sharedPreferences5 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences5.getClass();
                            SharedPreferences.Editor editorEdit3 = sharedPreferences5.edit();
                            editorEdit3.putBoolean("updates_active", false);
                            editorEdit3.apply();
                            ((TextView) preferencesActivity.z0().L.f84n).setText(preferencesActivity.getString(2131951951));
                        } else {
                            v4 v4Var4 = new v4(preferencesActivity, 1);
                            RelativeLayout relativeLayout4 = (RelativeLayout) preferencesActivity.z0().K.f1061b;
                            relativeLayout4.getClass();
                            v4Var4.g(relativeLayout4, 1.0f);
                            SharedPreferences sharedPreferences6 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences6.getClass();
                            SharedPreferences.Editor editorEdit4 = sharedPreferences6.edit();
                            editorEdit4.putBoolean("updates_active", true);
                            editorEdit4.apply();
                            ((TextView) preferencesActivity.z0().L.f84n).setText(preferencesActivity.getString(2131951984));
                        }
                        break;
                    case 3:
                        int i19 = PreferencesActivity.T;
                        try {
                            SharedPreferences.Editor editorEdit5 = preferencesActivity.getSharedPreferences("CoreSettings", 0).edit();
                            editorEdit5.putBoolean("search_apk_worker_active", z10);
                            editorEdit5.apply();
                        } catch (Exception e11) {
                            e11.printStackTrace();
                            return;
                        }
                        break;
                    case 4:
                        int i20 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences7 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences7.getClass();
                        SharedPreferences.Editor editorEdit6 = sharedPreferences7.edit();
                        editorEdit6.putBoolean("install_apk_rooted", z10);
                        editorEdit6.apply();
                        if (z10) {
                            try {
                                t0.f.A();
                            } catch (Exception e12) {
                                e12.printStackTrace();
                                return;
                            }
                        }
                        break;
                    case 5:
                        int i21 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences8 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences8.getClass();
                        SharedPreferences.Editor editorEdit7 = sharedPreferences8.edit();
                        editorEdit7.putBoolean("install_apk_as_root_system", z10);
                        editorEdit7.apply();
                        if (z10) {
                            ((h4.a) preferencesActivity.P.getValue()).i(true);
                        }
                        break;
                    default:
                        int i22 = PreferencesActivity.T;
                        if (!z10) {
                            preferencesActivity.B0();
                            SharedPreferences sharedPreferences9 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences9.getClass();
                            SharedPreferences.Editor editorEdit8 = sharedPreferences9.edit();
                            editorEdit8.putBoolean("recibir_notificaciones", false);
                            editorEdit8.apply();
                        } else {
                            preferencesActivity.C0();
                            if (Build.VERSION.SDK_INT < 33) {
                                SharedPreferences sharedPreferences10 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences10.getClass();
                                SharedPreferences.Editor editorEdit9 = sharedPreferences10.edit();
                                editorEdit9.putBoolean("recibir_notificaciones", true);
                                editorEdit9.apply();
                                preferencesActivity.C0();
                            } else {
                                preferencesActivity.S.launch("android.permission.POST_NOTIFICATIONS");
                            }
                        }
                        break;
                }
            }
        });
        ((TextView) z0().f9885r.f7781l).setTypeface(c.f4882w);
        final int i15 = 12;
        ((RelativeLayout) l.y(this, 2131952484, (TextView) z0().f9885r.f7781l).f9886s.f81b).setOnClickListener(new View.OnClickListener(this) { // from class: d4.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f3589b;

            {
                this.f3589b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i15;
                PreferencesActivity preferencesActivity = this.f3589b;
                switch (i112) {
                    case 0:
                        int i122 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9884q.f83m).performClick();
                        break;
                    case 1:
                        int i132 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9887t.f83m).performClick();
                        break;
                    case 2:
                        int i142 = PreferencesActivity.T;
                        v vVar = new v();
                        vVar.f7022a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                        int value = Year.now().getValue();
                        preferencesActivity.Q();
                        AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                        x xVar = new x();
                        u uVarC = u.c(preferencesActivity.getLayoutInflater());
                        ((TextView) uVarC.f5273r).setTypeface(f4.c.f4882w);
                        TextView textView = uVarC.f5271p;
                        textView.setTypeface(f4.c.f4883x);
                        textView.setText(preferencesActivity.getString(2131951671));
                        uVarC.f5270o.setTypeface(f4.c.f4883x);
                        EditText editText = uVarC.f5267l;
                        editText.setTypeface(f4.c.f4883x);
                        ((TextView) uVarC.f5272q).setTypeface(f4.c.f4883x);
                        TextView textView2 = uVarC.f5268m;
                        textView2.setTypeface(f4.c.f4882w);
                        TextView textView3 = uVarC.f5269n;
                        textView3.setTypeface(f4.c.f4882w);
                        int i152 = vVar.f7022a;
                        if (i152 > 0) {
                            editText.setText(String.valueOf(i152));
                        }
                        textView2.setOnClickListener(new s4(uVarC, value, preferencesActivity, xVar));
                        z3.J(textView3);
                        textView3.setText(preferencesActivity.getString(2131952538));
                        textView3.setOnClickListener(new t(vVar, uVarC, preferencesActivity, 10));
                        builder.setView(uVarC.f5266b);
                        builder.setCancelable(true);
                        AlertDialog alertDialogCreate = builder.create();
                        xVar.f7024a = alertDialogCreate;
                        if (alertDialogCreate != null) {
                            Window window = alertDialogCreate.getWindow();
                            if (window != null) {
                                a4.x.y(window, 0);
                            }
                            ((AlertDialog) xVar.f7024a).show();
                        }
                        break;
                    case 3:
                        int i16 = PreferencesActivity.T;
                        Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                        ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                        float f10 = UptodownApp.I;
                        activityResultLauncher.launch(intent, b4.d.b(preferencesActivity));
                        break;
                    case 4:
                        int i17 = PreferencesActivity.T;
                        float f11 = UptodownApp.I;
                        if (!b4.d.n(preferencesActivity)) {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), b4.d.a(preferencesActivity));
                        } else {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                        }
                        break;
                    case 5:
                        int i18 = PreferencesActivity.T;
                        Intent intent2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent2.putExtra("advanced_settings_title", preferencesActivity.getString(2131951662));
                        intent2.putExtra("advanced_settings_index", 3);
                        float f12 = UptodownApp.I;
                        preferencesActivity.startActivity(intent2, b4.d.a(preferencesActivity));
                        break;
                    case 6:
                        int i19 = PreferencesActivity.T;
                        Intent intent3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent3.putExtra("advanced_settings_title", preferencesActivity.getString(2131952660));
                        intent3.putExtra("advanced_settings_index", 0);
                        float f13 = UptodownApp.I;
                        preferencesActivity.startActivity(intent3, b4.d.a(preferencesActivity));
                        break;
                    case 7:
                        int i20 = PreferencesActivity.T;
                        Intent intent4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent4.putExtra("advanced_settings_title", preferencesActivity.getString(2131952632));
                        intent4.putExtra("advanced_settings_index", 1);
                        float f14 = UptodownApp.I;
                        preferencesActivity.startActivity(intent4, b4.d.a(preferencesActivity));
                        break;
                    case 8:
                        int i21 = PreferencesActivity.T;
                        String string2 = preferencesActivity.getString(2131952497);
                        string2.getClass();
                        String string22 = preferencesActivity.getString(2131952725);
                        string22.getClass();
                        j5.c.e(preferencesActivity, string22, string2);
                        break;
                    case 9:
                        int i22 = PreferencesActivity.T;
                        Intent intent5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent5.putExtra("advanced_settings_title", preferencesActivity.getString(2131951643));
                        intent5.putExtra("advanced_settings_index", 2);
                        float f15 = UptodownApp.I;
                        preferencesActivity.startActivity(intent5, b4.d.a(preferencesActivity));
                        break;
                    case 10:
                        int i23 = PreferencesActivity.T;
                        Intent intent6 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent6.putExtra("advanced_settings_title", preferencesActivity.getString(2131951646));
                        intent6.putExtra("advanced_settings_index", 4);
                        float f16 = UptodownApp.I;
                        preferencesActivity.startActivity(intent6, b4.d.a(preferencesActivity));
                        break;
                    case 11:
                        int i24 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().L.f83m).performClick();
                        break;
                    case 12:
                        int i25 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9886s.f83m).performClick();
                        break;
                    case 13:
                        int i26 = PreferencesActivity.T;
                        preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                        break;
                    case 14:
                        int i27 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9883p.f83m).performClick();
                        break;
                    case 15:
                        int i28 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().C.f83m).performClick();
                        break;
                    case 16:
                        int i29 = PreferencesActivity.T;
                        preferencesActivity.finish();
                        break;
                    default:
                        int i30 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().E.f83m).performClick();
                        break;
                }
            }
        });
        ((TextView) z0().f9886s.f85o).setTypeface(c.f4882w);
        ((TextView) l.y(this, 2131952563, (TextView) z0().f9886s.f85o).f9886s.f84n).setTypeface(c.f4883x);
        SwitchCompat switchCompat = (SwitchCompat) l.y(this, 2131952485, (TextView) z0().f9886s.f84n).f9886s.f83m;
        try {
            sharedPreferences = getSharedPreferences("CoreSettings", 0);
        } catch (Exception unused) {
        }
        boolean z10 = sharedPreferences.contains("search_apk_worker_active") ? sharedPreferences.getBoolean("search_apk_worker_active", true) : true;
        switchCompat.setChecked(z10);
        ((SwitchCompat) z0().f9886s.f83m).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: d4.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f3591b;

            {
                this.f3591b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z102) {
                int i152 = i12;
                PreferencesActivity preferencesActivity = this.f3591b;
                switch (i152) {
                    case 0:
                        int i16 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences3 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences3.getClass();
                        SharedPreferences.Editor editorEdit = sharedPreferences3.edit();
                        editorEdit.putBoolean("download_notification", z102);
                        editorEdit.apply();
                        break;
                    case 1:
                        int i17 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences4 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences4.getClass();
                        SharedPreferences.Editor editorEdit2 = sharedPreferences4.edit();
                        editorEdit2.putBoolean("installation_notification", z102);
                        editorEdit2.apply();
                        break;
                    case 2:
                        int i18 = PreferencesActivity.T;
                        if (!z102) {
                            v4 v4Var3 = new v4(preferencesActivity, 1);
                            RelativeLayout relativeLayout3 = (RelativeLayout) preferencesActivity.z0().K.f1061b;
                            relativeLayout3.getClass();
                            v4Var3.g(relativeLayout3, 0.3f);
                            SharedPreferences sharedPreferences5 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences5.getClass();
                            SharedPreferences.Editor editorEdit3 = sharedPreferences5.edit();
                            editorEdit3.putBoolean("updates_active", false);
                            editorEdit3.apply();
                            ((TextView) preferencesActivity.z0().L.f84n).setText(preferencesActivity.getString(2131951951));
                        } else {
                            v4 v4Var4 = new v4(preferencesActivity, 1);
                            RelativeLayout relativeLayout4 = (RelativeLayout) preferencesActivity.z0().K.f1061b;
                            relativeLayout4.getClass();
                            v4Var4.g(relativeLayout4, 1.0f);
                            SharedPreferences sharedPreferences6 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences6.getClass();
                            SharedPreferences.Editor editorEdit4 = sharedPreferences6.edit();
                            editorEdit4.putBoolean("updates_active", true);
                            editorEdit4.apply();
                            ((TextView) preferencesActivity.z0().L.f84n).setText(preferencesActivity.getString(2131951984));
                        }
                        break;
                    case 3:
                        int i19 = PreferencesActivity.T;
                        try {
                            SharedPreferences.Editor editorEdit5 = preferencesActivity.getSharedPreferences("CoreSettings", 0).edit();
                            editorEdit5.putBoolean("search_apk_worker_active", z102);
                            editorEdit5.apply();
                        } catch (Exception e11) {
                            e11.printStackTrace();
                            return;
                        }
                        break;
                    case 4:
                        int i20 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences7 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences7.getClass();
                        SharedPreferences.Editor editorEdit6 = sharedPreferences7.edit();
                        editorEdit6.putBoolean("install_apk_rooted", z102);
                        editorEdit6.apply();
                        if (z102) {
                            try {
                                t0.f.A();
                            } catch (Exception e12) {
                                e12.printStackTrace();
                                return;
                            }
                        }
                        break;
                    case 5:
                        int i21 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences8 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences8.getClass();
                        SharedPreferences.Editor editorEdit7 = sharedPreferences8.edit();
                        editorEdit7.putBoolean("install_apk_as_root_system", z102);
                        editorEdit7.apply();
                        if (z102) {
                            ((h4.a) preferencesActivity.P.getValue()).i(true);
                        }
                        break;
                    default:
                        int i22 = PreferencesActivity.T;
                        if (!z102) {
                            preferencesActivity.B0();
                            SharedPreferences sharedPreferences9 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences9.getClass();
                            SharedPreferences.Editor editorEdit8 = sharedPreferences9.edit();
                            editorEdit8.putBoolean("recibir_notificaciones", false);
                            editorEdit8.apply();
                        } else {
                            preferencesActivity.C0();
                            if (Build.VERSION.SDK_INT < 33) {
                                SharedPreferences sharedPreferences10 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences10.getClass();
                                SharedPreferences.Editor editorEdit9 = sharedPreferences10.edit();
                                editorEdit9.putBoolean("recibir_notificaciones", true);
                                editorEdit9.apply();
                                preferencesActivity.C0();
                            } else {
                                preferencesActivity.S.launch("android.permission.POST_NOTIFICATIONS");
                            }
                        }
                        break;
                }
            }
        });
        ((TextView) z0().f9892z.f7781l).setTypeface(c.f4882w);
        ((TextView) l.y(this, 2131951901, (TextView) z0().f9892z.f7781l).f9889w.f1063m).setTypeface(c.f4882w);
        ((TextView) l.y(this, 2131951902, (TextView) z0().f9889w.f1063m).f9889w.f1062l).setTypeface(c.f4883x);
        final int i16 = 13;
        ((RelativeLayout) l.y(this, 2131951896, (TextView) z0().f9889w.f1062l).f9889w.f1061b).setOnClickListener(new View.OnClickListener(this) { // from class: d4.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f3589b;

            {
                this.f3589b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i16;
                PreferencesActivity preferencesActivity = this.f3589b;
                switch (i112) {
                    case 0:
                        int i122 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9884q.f83m).performClick();
                        break;
                    case 1:
                        int i132 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9887t.f83m).performClick();
                        break;
                    case 2:
                        int i142 = PreferencesActivity.T;
                        v vVar = new v();
                        vVar.f7022a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                        int value = Year.now().getValue();
                        preferencesActivity.Q();
                        AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                        x xVar = new x();
                        u uVarC = u.c(preferencesActivity.getLayoutInflater());
                        ((TextView) uVarC.f5273r).setTypeface(f4.c.f4882w);
                        TextView textView = uVarC.f5271p;
                        textView.setTypeface(f4.c.f4883x);
                        textView.setText(preferencesActivity.getString(2131951671));
                        uVarC.f5270o.setTypeface(f4.c.f4883x);
                        EditText editText = uVarC.f5267l;
                        editText.setTypeface(f4.c.f4883x);
                        ((TextView) uVarC.f5272q).setTypeface(f4.c.f4883x);
                        TextView textView2 = uVarC.f5268m;
                        textView2.setTypeface(f4.c.f4882w);
                        TextView textView3 = uVarC.f5269n;
                        textView3.setTypeface(f4.c.f4882w);
                        int i152 = vVar.f7022a;
                        if (i152 > 0) {
                            editText.setText(String.valueOf(i152));
                        }
                        textView2.setOnClickListener(new s4(uVarC, value, preferencesActivity, xVar));
                        z3.J(textView3);
                        textView3.setText(preferencesActivity.getString(2131952538));
                        textView3.setOnClickListener(new t(vVar, uVarC, preferencesActivity, 10));
                        builder.setView(uVarC.f5266b);
                        builder.setCancelable(true);
                        AlertDialog alertDialogCreate = builder.create();
                        xVar.f7024a = alertDialogCreate;
                        if (alertDialogCreate != null) {
                            Window window = alertDialogCreate.getWindow();
                            if (window != null) {
                                a4.x.y(window, 0);
                            }
                            ((AlertDialog) xVar.f7024a).show();
                        }
                        break;
                    case 3:
                        int i162 = PreferencesActivity.T;
                        Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                        ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                        float f10 = UptodownApp.I;
                        activityResultLauncher.launch(intent, b4.d.b(preferencesActivity));
                        break;
                    case 4:
                        int i17 = PreferencesActivity.T;
                        float f11 = UptodownApp.I;
                        if (!b4.d.n(preferencesActivity)) {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), b4.d.a(preferencesActivity));
                        } else {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                        }
                        break;
                    case 5:
                        int i18 = PreferencesActivity.T;
                        Intent intent2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent2.putExtra("advanced_settings_title", preferencesActivity.getString(2131951662));
                        intent2.putExtra("advanced_settings_index", 3);
                        float f12 = UptodownApp.I;
                        preferencesActivity.startActivity(intent2, b4.d.a(preferencesActivity));
                        break;
                    case 6:
                        int i19 = PreferencesActivity.T;
                        Intent intent3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent3.putExtra("advanced_settings_title", preferencesActivity.getString(2131952660));
                        intent3.putExtra("advanced_settings_index", 0);
                        float f13 = UptodownApp.I;
                        preferencesActivity.startActivity(intent3, b4.d.a(preferencesActivity));
                        break;
                    case 7:
                        int i20 = PreferencesActivity.T;
                        Intent intent4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent4.putExtra("advanced_settings_title", preferencesActivity.getString(2131952632));
                        intent4.putExtra("advanced_settings_index", 1);
                        float f14 = UptodownApp.I;
                        preferencesActivity.startActivity(intent4, b4.d.a(preferencesActivity));
                        break;
                    case 8:
                        int i21 = PreferencesActivity.T;
                        String string2 = preferencesActivity.getString(2131952497);
                        string2.getClass();
                        String string22 = preferencesActivity.getString(2131952725);
                        string22.getClass();
                        j5.c.e(preferencesActivity, string22, string2);
                        break;
                    case 9:
                        int i22 = PreferencesActivity.T;
                        Intent intent5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent5.putExtra("advanced_settings_title", preferencesActivity.getString(2131951643));
                        intent5.putExtra("advanced_settings_index", 2);
                        float f15 = UptodownApp.I;
                        preferencesActivity.startActivity(intent5, b4.d.a(preferencesActivity));
                        break;
                    case 10:
                        int i23 = PreferencesActivity.T;
                        Intent intent6 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent6.putExtra("advanced_settings_title", preferencesActivity.getString(2131951646));
                        intent6.putExtra("advanced_settings_index", 4);
                        float f16 = UptodownApp.I;
                        preferencesActivity.startActivity(intent6, b4.d.a(preferencesActivity));
                        break;
                    case 11:
                        int i24 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().L.f83m).performClick();
                        break;
                    case 12:
                        int i25 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9886s.f83m).performClick();
                        break;
                    case 13:
                        int i26 = PreferencesActivity.T;
                        preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                        break;
                    case 14:
                        int i27 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9883p.f83m).performClick();
                        break;
                    case 15:
                        int i28 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().C.f83m).performClick();
                        break;
                    case 16:
                        int i29 = PreferencesActivity.T;
                        preferencesActivity.finish();
                        break;
                    default:
                        int i30 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().E.f83m).performClick();
                        break;
                }
            }
        });
        final int i17 = 5;
        final int i18 = 4;
        final int i19 = 8;
        if (((h4.a) this.P.getValue()).c("system_app", false) || f.A()) {
            ((TextView) z0().D.f7781l).setTypeface(c.f4882w);
            i = 3;
            final int i20 = 14;
            ((RelativeLayout) l.y(this, 2131952480, (TextView) z0().D.f7781l).f9883p.f81b).setOnClickListener(new View.OnClickListener(this) { // from class: d4.m

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PreferencesActivity f3589b;

                {
                    this.f3589b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i112 = i20;
                    PreferencesActivity preferencesActivity = this.f3589b;
                    switch (i112) {
                        case 0:
                            int i122 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.z0().f9884q.f83m).performClick();
                            break;
                        case 1:
                            int i132 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.z0().f9887t.f83m).performClick();
                            break;
                        case 2:
                            int i142 = PreferencesActivity.T;
                            v vVar = new v();
                            vVar.f7022a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                            int value = Year.now().getValue();
                            preferencesActivity.Q();
                            AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                            x xVar = new x();
                            u uVarC = u.c(preferencesActivity.getLayoutInflater());
                            ((TextView) uVarC.f5273r).setTypeface(f4.c.f4882w);
                            TextView textView = uVarC.f5271p;
                            textView.setTypeface(f4.c.f4883x);
                            textView.setText(preferencesActivity.getString(2131951671));
                            uVarC.f5270o.setTypeface(f4.c.f4883x);
                            EditText editText = uVarC.f5267l;
                            editText.setTypeface(f4.c.f4883x);
                            ((TextView) uVarC.f5272q).setTypeface(f4.c.f4883x);
                            TextView textView2 = uVarC.f5268m;
                            textView2.setTypeface(f4.c.f4882w);
                            TextView textView3 = uVarC.f5269n;
                            textView3.setTypeface(f4.c.f4882w);
                            int i152 = vVar.f7022a;
                            if (i152 > 0) {
                                editText.setText(String.valueOf(i152));
                            }
                            textView2.setOnClickListener(new s4(uVarC, value, preferencesActivity, xVar));
                            z3.J(textView3);
                            textView3.setText(preferencesActivity.getString(2131952538));
                            textView3.setOnClickListener(new t(vVar, uVarC, preferencesActivity, 10));
                            builder.setView(uVarC.f5266b);
                            builder.setCancelable(true);
                            AlertDialog alertDialogCreate = builder.create();
                            xVar.f7024a = alertDialogCreate;
                            if (alertDialogCreate != null) {
                                Window window = alertDialogCreate.getWindow();
                                if (window != null) {
                                    a4.x.y(window, 0);
                                }
                                ((AlertDialog) xVar.f7024a).show();
                            }
                            break;
                        case 3:
                            int i162 = PreferencesActivity.T;
                            Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                            ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                            float f10 = UptodownApp.I;
                            activityResultLauncher.launch(intent, b4.d.b(preferencesActivity));
                            break;
                        case 4:
                            int i172 = PreferencesActivity.T;
                            float f11 = UptodownApp.I;
                            if (!b4.d.n(preferencesActivity)) {
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), b4.d.a(preferencesActivity));
                            } else {
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                            }
                            break;
                        case 5:
                            int i182 = PreferencesActivity.T;
                            Intent intent2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                            intent2.putExtra("advanced_settings_title", preferencesActivity.getString(2131951662));
                            intent2.putExtra("advanced_settings_index", 3);
                            float f12 = UptodownApp.I;
                            preferencesActivity.startActivity(intent2, b4.d.a(preferencesActivity));
                            break;
                        case 6:
                            int i192 = PreferencesActivity.T;
                            Intent intent3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                            intent3.putExtra("advanced_settings_title", preferencesActivity.getString(2131952660));
                            intent3.putExtra("advanced_settings_index", 0);
                            float f13 = UptodownApp.I;
                            preferencesActivity.startActivity(intent3, b4.d.a(preferencesActivity));
                            break;
                        case 7:
                            int i202 = PreferencesActivity.T;
                            Intent intent4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                            intent4.putExtra("advanced_settings_title", preferencesActivity.getString(2131952632));
                            intent4.putExtra("advanced_settings_index", 1);
                            float f14 = UptodownApp.I;
                            preferencesActivity.startActivity(intent4, b4.d.a(preferencesActivity));
                            break;
                        case 8:
                            int i21 = PreferencesActivity.T;
                            String string2 = preferencesActivity.getString(2131952497);
                            string2.getClass();
                            String string22 = preferencesActivity.getString(2131952725);
                            string22.getClass();
                            j5.c.e(preferencesActivity, string22, string2);
                            break;
                        case 9:
                            int i22 = PreferencesActivity.T;
                            Intent intent5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                            intent5.putExtra("advanced_settings_title", preferencesActivity.getString(2131951643));
                            intent5.putExtra("advanced_settings_index", 2);
                            float f15 = UptodownApp.I;
                            preferencesActivity.startActivity(intent5, b4.d.a(preferencesActivity));
                            break;
                        case 10:
                            int i23 = PreferencesActivity.T;
                            Intent intent6 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                            intent6.putExtra("advanced_settings_title", preferencesActivity.getString(2131951646));
                            intent6.putExtra("advanced_settings_index", 4);
                            float f16 = UptodownApp.I;
                            preferencesActivity.startActivity(intent6, b4.d.a(preferencesActivity));
                            break;
                        case 11:
                            int i24 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.z0().L.f83m).performClick();
                            break;
                        case 12:
                            int i25 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.z0().f9886s.f83m).performClick();
                            break;
                        case 13:
                            int i26 = PreferencesActivity.T;
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                            break;
                        case 14:
                            int i27 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.z0().f9883p.f83m).performClick();
                            break;
                        case 15:
                            int i28 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.z0().C.f83m).performClick();
                            break;
                        case 16:
                            int i29 = PreferencesActivity.T;
                            preferencesActivity.finish();
                            break;
                        default:
                            int i30 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.z0().E.f83m).performClick();
                            break;
                    }
                }
            });
            ((TextView) z0().f9883p.f85o).setTypeface(c.f4882w);
            ((TextView) l.y(this, 2131952479, (TextView) z0().f9883p.f85o).f9883p.f84n).setTypeface(c.f4883x);
            ((SwitchCompat) l.y(this, 2131952478, (TextView) z0().f9883p.f84n).f9883p.f83m).setChecked(z3.p(this, "install_apk_rooted", false));
            ((SwitchCompat) z0().f9883p.f83m).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: d4.n

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PreferencesActivity f3591b;

                {
                    this.f3591b = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z102) {
                    int i152 = i18;
                    PreferencesActivity preferencesActivity = this.f3591b;
                    switch (i152) {
                        case 0:
                            int i162 = PreferencesActivity.T;
                            SharedPreferences sharedPreferences3 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences3.getClass();
                            SharedPreferences.Editor editorEdit = sharedPreferences3.edit();
                            editorEdit.putBoolean("download_notification", z102);
                            editorEdit.apply();
                            break;
                        case 1:
                            int i172 = PreferencesActivity.T;
                            SharedPreferences sharedPreferences4 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences4.getClass();
                            SharedPreferences.Editor editorEdit2 = sharedPreferences4.edit();
                            editorEdit2.putBoolean("installation_notification", z102);
                            editorEdit2.apply();
                            break;
                        case 2:
                            int i182 = PreferencesActivity.T;
                            if (!z102) {
                                v4 v4Var3 = new v4(preferencesActivity, 1);
                                RelativeLayout relativeLayout3 = (RelativeLayout) preferencesActivity.z0().K.f1061b;
                                relativeLayout3.getClass();
                                v4Var3.g(relativeLayout3, 0.3f);
                                SharedPreferences sharedPreferences5 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences5.getClass();
                                SharedPreferences.Editor editorEdit3 = sharedPreferences5.edit();
                                editorEdit3.putBoolean("updates_active", false);
                                editorEdit3.apply();
                                ((TextView) preferencesActivity.z0().L.f84n).setText(preferencesActivity.getString(2131951951));
                            } else {
                                v4 v4Var4 = new v4(preferencesActivity, 1);
                                RelativeLayout relativeLayout4 = (RelativeLayout) preferencesActivity.z0().K.f1061b;
                                relativeLayout4.getClass();
                                v4Var4.g(relativeLayout4, 1.0f);
                                SharedPreferences sharedPreferences6 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences6.getClass();
                                SharedPreferences.Editor editorEdit4 = sharedPreferences6.edit();
                                editorEdit4.putBoolean("updates_active", true);
                                editorEdit4.apply();
                                ((TextView) preferencesActivity.z0().L.f84n).setText(preferencesActivity.getString(2131951984));
                            }
                            break;
                        case 3:
                            int i192 = PreferencesActivity.T;
                            try {
                                SharedPreferences.Editor editorEdit5 = preferencesActivity.getSharedPreferences("CoreSettings", 0).edit();
                                editorEdit5.putBoolean("search_apk_worker_active", z102);
                                editorEdit5.apply();
                            } catch (Exception e11) {
                                e11.printStackTrace();
                                return;
                            }
                            break;
                        case 4:
                            int i202 = PreferencesActivity.T;
                            SharedPreferences sharedPreferences7 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences7.getClass();
                            SharedPreferences.Editor editorEdit6 = sharedPreferences7.edit();
                            editorEdit6.putBoolean("install_apk_rooted", z102);
                            editorEdit6.apply();
                            if (z102) {
                                try {
                                    t0.f.A();
                                } catch (Exception e12) {
                                    e12.printStackTrace();
                                    return;
                                }
                            }
                            break;
                        case 5:
                            int i21 = PreferencesActivity.T;
                            SharedPreferences sharedPreferences8 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences8.getClass();
                            SharedPreferences.Editor editorEdit7 = sharedPreferences8.edit();
                            editorEdit7.putBoolean("install_apk_as_root_system", z102);
                            editorEdit7.apply();
                            if (z102) {
                                ((h4.a) preferencesActivity.P.getValue()).i(true);
                            }
                            break;
                        default:
                            int i22 = PreferencesActivity.T;
                            if (!z102) {
                                preferencesActivity.B0();
                                SharedPreferences sharedPreferences9 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences9.getClass();
                                SharedPreferences.Editor editorEdit8 = sharedPreferences9.edit();
                                editorEdit8.putBoolean("recibir_notificaciones", false);
                                editorEdit8.apply();
                            } else {
                                preferencesActivity.C0();
                                if (Build.VERSION.SDK_INT < 33) {
                                    SharedPreferences sharedPreferences10 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                    sharedPreferences10.getClass();
                                    SharedPreferences.Editor editorEdit9 = sharedPreferences10.edit();
                                    editorEdit9.putBoolean("recibir_notificaciones", true);
                                    editorEdit9.apply();
                                    preferencesActivity.C0();
                                } else {
                                    preferencesActivity.S.launch("android.permission.POST_NOTIFICATIONS");
                                }
                            }
                            break;
                    }
                }
            });
            final int i21 = 15;
            ((RelativeLayout) z0().C.f81b).setOnClickListener(new View.OnClickListener(this) { // from class: d4.m

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PreferencesActivity f3589b;

                {
                    this.f3589b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i112 = i21;
                    PreferencesActivity preferencesActivity = this.f3589b;
                    switch (i112) {
                        case 0:
                            int i122 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.z0().f9884q.f83m).performClick();
                            break;
                        case 1:
                            int i132 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.z0().f9887t.f83m).performClick();
                            break;
                        case 2:
                            int i142 = PreferencesActivity.T;
                            v vVar = new v();
                            vVar.f7022a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                            int value = Year.now().getValue();
                            preferencesActivity.Q();
                            AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                            x xVar = new x();
                            u uVarC = u.c(preferencesActivity.getLayoutInflater());
                            ((TextView) uVarC.f5273r).setTypeface(f4.c.f4882w);
                            TextView textView = uVarC.f5271p;
                            textView.setTypeface(f4.c.f4883x);
                            textView.setText(preferencesActivity.getString(2131951671));
                            uVarC.f5270o.setTypeface(f4.c.f4883x);
                            EditText editText = uVarC.f5267l;
                            editText.setTypeface(f4.c.f4883x);
                            ((TextView) uVarC.f5272q).setTypeface(f4.c.f4883x);
                            TextView textView2 = uVarC.f5268m;
                            textView2.setTypeface(f4.c.f4882w);
                            TextView textView3 = uVarC.f5269n;
                            textView3.setTypeface(f4.c.f4882w);
                            int i152 = vVar.f7022a;
                            if (i152 > 0) {
                                editText.setText(String.valueOf(i152));
                            }
                            textView2.setOnClickListener(new s4(uVarC, value, preferencesActivity, xVar));
                            z3.J(textView3);
                            textView3.setText(preferencesActivity.getString(2131952538));
                            textView3.setOnClickListener(new t(vVar, uVarC, preferencesActivity, 10));
                            builder.setView(uVarC.f5266b);
                            builder.setCancelable(true);
                            AlertDialog alertDialogCreate = builder.create();
                            xVar.f7024a = alertDialogCreate;
                            if (alertDialogCreate != null) {
                                Window window = alertDialogCreate.getWindow();
                                if (window != null) {
                                    a4.x.y(window, 0);
                                }
                                ((AlertDialog) xVar.f7024a).show();
                            }
                            break;
                        case 3:
                            int i162 = PreferencesActivity.T;
                            Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                            ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                            float f10 = UptodownApp.I;
                            activityResultLauncher.launch(intent, b4.d.b(preferencesActivity));
                            break;
                        case 4:
                            int i172 = PreferencesActivity.T;
                            float f11 = UptodownApp.I;
                            if (!b4.d.n(preferencesActivity)) {
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), b4.d.a(preferencesActivity));
                            } else {
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                            }
                            break;
                        case 5:
                            int i182 = PreferencesActivity.T;
                            Intent intent2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                            intent2.putExtra("advanced_settings_title", preferencesActivity.getString(2131951662));
                            intent2.putExtra("advanced_settings_index", 3);
                            float f12 = UptodownApp.I;
                            preferencesActivity.startActivity(intent2, b4.d.a(preferencesActivity));
                            break;
                        case 6:
                            int i192 = PreferencesActivity.T;
                            Intent intent3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                            intent3.putExtra("advanced_settings_title", preferencesActivity.getString(2131952660));
                            intent3.putExtra("advanced_settings_index", 0);
                            float f13 = UptodownApp.I;
                            preferencesActivity.startActivity(intent3, b4.d.a(preferencesActivity));
                            break;
                        case 7:
                            int i202 = PreferencesActivity.T;
                            Intent intent4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                            intent4.putExtra("advanced_settings_title", preferencesActivity.getString(2131952632));
                            intent4.putExtra("advanced_settings_index", 1);
                            float f14 = UptodownApp.I;
                            preferencesActivity.startActivity(intent4, b4.d.a(preferencesActivity));
                            break;
                        case 8:
                            int i212 = PreferencesActivity.T;
                            String string2 = preferencesActivity.getString(2131952497);
                            string2.getClass();
                            String string22 = preferencesActivity.getString(2131952725);
                            string22.getClass();
                            j5.c.e(preferencesActivity, string22, string2);
                            break;
                        case 9:
                            int i22 = PreferencesActivity.T;
                            Intent intent5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                            intent5.putExtra("advanced_settings_title", preferencesActivity.getString(2131951643));
                            intent5.putExtra("advanced_settings_index", 2);
                            float f15 = UptodownApp.I;
                            preferencesActivity.startActivity(intent5, b4.d.a(preferencesActivity));
                            break;
                        case 10:
                            int i23 = PreferencesActivity.T;
                            Intent intent6 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                            intent6.putExtra("advanced_settings_title", preferencesActivity.getString(2131951646));
                            intent6.putExtra("advanced_settings_index", 4);
                            float f16 = UptodownApp.I;
                            preferencesActivity.startActivity(intent6, b4.d.a(preferencesActivity));
                            break;
                        case 11:
                            int i24 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.z0().L.f83m).performClick();
                            break;
                        case 12:
                            int i25 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.z0().f9886s.f83m).performClick();
                            break;
                        case 13:
                            int i26 = PreferencesActivity.T;
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                            break;
                        case 14:
                            int i27 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.z0().f9883p.f83m).performClick();
                            break;
                        case 15:
                            int i28 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.z0().C.f83m).performClick();
                            break;
                        case 16:
                            int i29 = PreferencesActivity.T;
                            preferencesActivity.finish();
                            break;
                        default:
                            int i30 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.z0().E.f83m).performClick();
                            break;
                    }
                }
            });
            ((TextView) z0().C.f85o).setTypeface(c.f4882w);
            ((TextView) l.y(this, 2131952482, (TextView) z0().C.f85o).C.f84n).setTypeface(c.f4883x);
            ((SwitchCompat) l.y(this, 2131952481, (TextView) z0().C.f84n).C.f83m).setChecked(z3.p(this, "install_apk_as_root_system", false));
            ((SwitchCompat) z0().C.f83m).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: d4.n

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PreferencesActivity f3591b;

                {
                    this.f3591b = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z102) {
                    int i152 = i17;
                    PreferencesActivity preferencesActivity = this.f3591b;
                    switch (i152) {
                        case 0:
                            int i162 = PreferencesActivity.T;
                            SharedPreferences sharedPreferences3 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences3.getClass();
                            SharedPreferences.Editor editorEdit = sharedPreferences3.edit();
                            editorEdit.putBoolean("download_notification", z102);
                            editorEdit.apply();
                            break;
                        case 1:
                            int i172 = PreferencesActivity.T;
                            SharedPreferences sharedPreferences4 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences4.getClass();
                            SharedPreferences.Editor editorEdit2 = sharedPreferences4.edit();
                            editorEdit2.putBoolean("installation_notification", z102);
                            editorEdit2.apply();
                            break;
                        case 2:
                            int i182 = PreferencesActivity.T;
                            if (!z102) {
                                v4 v4Var3 = new v4(preferencesActivity, 1);
                                RelativeLayout relativeLayout3 = (RelativeLayout) preferencesActivity.z0().K.f1061b;
                                relativeLayout3.getClass();
                                v4Var3.g(relativeLayout3, 0.3f);
                                SharedPreferences sharedPreferences5 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences5.getClass();
                                SharedPreferences.Editor editorEdit3 = sharedPreferences5.edit();
                                editorEdit3.putBoolean("updates_active", false);
                                editorEdit3.apply();
                                ((TextView) preferencesActivity.z0().L.f84n).setText(preferencesActivity.getString(2131951951));
                            } else {
                                v4 v4Var4 = new v4(preferencesActivity, 1);
                                RelativeLayout relativeLayout4 = (RelativeLayout) preferencesActivity.z0().K.f1061b;
                                relativeLayout4.getClass();
                                v4Var4.g(relativeLayout4, 1.0f);
                                SharedPreferences sharedPreferences6 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences6.getClass();
                                SharedPreferences.Editor editorEdit4 = sharedPreferences6.edit();
                                editorEdit4.putBoolean("updates_active", true);
                                editorEdit4.apply();
                                ((TextView) preferencesActivity.z0().L.f84n).setText(preferencesActivity.getString(2131951984));
                            }
                            break;
                        case 3:
                            int i192 = PreferencesActivity.T;
                            try {
                                SharedPreferences.Editor editorEdit5 = preferencesActivity.getSharedPreferences("CoreSettings", 0).edit();
                                editorEdit5.putBoolean("search_apk_worker_active", z102);
                                editorEdit5.apply();
                            } catch (Exception e11) {
                                e11.printStackTrace();
                                return;
                            }
                            break;
                        case 4:
                            int i202 = PreferencesActivity.T;
                            SharedPreferences sharedPreferences7 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences7.getClass();
                            SharedPreferences.Editor editorEdit6 = sharedPreferences7.edit();
                            editorEdit6.putBoolean("install_apk_rooted", z102);
                            editorEdit6.apply();
                            if (z102) {
                                try {
                                    t0.f.A();
                                } catch (Exception e12) {
                                    e12.printStackTrace();
                                    return;
                                }
                            }
                            break;
                        case 5:
                            int i212 = PreferencesActivity.T;
                            SharedPreferences sharedPreferences8 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences8.getClass();
                            SharedPreferences.Editor editorEdit7 = sharedPreferences8.edit();
                            editorEdit7.putBoolean("install_apk_as_root_system", z102);
                            editorEdit7.apply();
                            if (z102) {
                                ((h4.a) preferencesActivity.P.getValue()).i(true);
                            }
                            break;
                        default:
                            int i22 = PreferencesActivity.T;
                            if (!z102) {
                                preferencesActivity.B0();
                                SharedPreferences sharedPreferences9 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences9.getClass();
                                SharedPreferences.Editor editorEdit8 = sharedPreferences9.edit();
                                editorEdit8.putBoolean("recibir_notificaciones", false);
                                editorEdit8.apply();
                            } else {
                                preferencesActivity.C0();
                                if (Build.VERSION.SDK_INT < 33) {
                                    SharedPreferences sharedPreferences10 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                    sharedPreferences10.getClass();
                                    SharedPreferences.Editor editorEdit9 = sharedPreferences10.edit();
                                    editorEdit9.putBoolean("recibir_notificaciones", true);
                                    editorEdit9.apply();
                                    preferencesActivity.C0();
                                } else {
                                    preferencesActivity.S.launch("android.permission.POST_NOTIFICATIONS");
                                }
                            }
                            break;
                    }
                }
            });
        } else {
            ((TextView) z0().D.f7781l).setVisibility(8);
            ((RelativeLayout) z0().f9883p.f81b).setVisibility(8);
            ((RelativeLayout) z0().C.f81b).setVisibility(8);
            i = 3;
        }
        ((TextView) z0().f9891y.f7781l).setTypeface(c.f4882w);
        final int i22 = 17;
        ((RelativeLayout) l.y(this, 2131952514, (TextView) z0().f9891y.f7781l).E.f81b).setOnClickListener(new View.OnClickListener(this) { // from class: d4.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f3589b;

            {
                this.f3589b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i22;
                PreferencesActivity preferencesActivity = this.f3589b;
                switch (i112) {
                    case 0:
                        int i122 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9884q.f83m).performClick();
                        break;
                    case 1:
                        int i132 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9887t.f83m).performClick();
                        break;
                    case 2:
                        int i142 = PreferencesActivity.T;
                        v vVar = new v();
                        vVar.f7022a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                        int value = Year.now().getValue();
                        preferencesActivity.Q();
                        AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                        x xVar = new x();
                        u uVarC = u.c(preferencesActivity.getLayoutInflater());
                        ((TextView) uVarC.f5273r).setTypeface(f4.c.f4882w);
                        TextView textView = uVarC.f5271p;
                        textView.setTypeface(f4.c.f4883x);
                        textView.setText(preferencesActivity.getString(2131951671));
                        uVarC.f5270o.setTypeface(f4.c.f4883x);
                        EditText editText = uVarC.f5267l;
                        editText.setTypeface(f4.c.f4883x);
                        ((TextView) uVarC.f5272q).setTypeface(f4.c.f4883x);
                        TextView textView2 = uVarC.f5268m;
                        textView2.setTypeface(f4.c.f4882w);
                        TextView textView3 = uVarC.f5269n;
                        textView3.setTypeface(f4.c.f4882w);
                        int i152 = vVar.f7022a;
                        if (i152 > 0) {
                            editText.setText(String.valueOf(i152));
                        }
                        textView2.setOnClickListener(new s4(uVarC, value, preferencesActivity, xVar));
                        z3.J(textView3);
                        textView3.setText(preferencesActivity.getString(2131952538));
                        textView3.setOnClickListener(new t(vVar, uVarC, preferencesActivity, 10));
                        builder.setView(uVarC.f5266b);
                        builder.setCancelable(true);
                        AlertDialog alertDialogCreate = builder.create();
                        xVar.f7024a = alertDialogCreate;
                        if (alertDialogCreate != null) {
                            Window window = alertDialogCreate.getWindow();
                            if (window != null) {
                                a4.x.y(window, 0);
                            }
                            ((AlertDialog) xVar.f7024a).show();
                        }
                        break;
                    case 3:
                        int i162 = PreferencesActivity.T;
                        Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                        ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                        float f10 = UptodownApp.I;
                        activityResultLauncher.launch(intent, b4.d.b(preferencesActivity));
                        break;
                    case 4:
                        int i172 = PreferencesActivity.T;
                        float f11 = UptodownApp.I;
                        if (!b4.d.n(preferencesActivity)) {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), b4.d.a(preferencesActivity));
                        } else {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                        }
                        break;
                    case 5:
                        int i182 = PreferencesActivity.T;
                        Intent intent2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent2.putExtra("advanced_settings_title", preferencesActivity.getString(2131951662));
                        intent2.putExtra("advanced_settings_index", 3);
                        float f12 = UptodownApp.I;
                        preferencesActivity.startActivity(intent2, b4.d.a(preferencesActivity));
                        break;
                    case 6:
                        int i192 = PreferencesActivity.T;
                        Intent intent3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent3.putExtra("advanced_settings_title", preferencesActivity.getString(2131952660));
                        intent3.putExtra("advanced_settings_index", 0);
                        float f13 = UptodownApp.I;
                        preferencesActivity.startActivity(intent3, b4.d.a(preferencesActivity));
                        break;
                    case 7:
                        int i202 = PreferencesActivity.T;
                        Intent intent4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent4.putExtra("advanced_settings_title", preferencesActivity.getString(2131952632));
                        intent4.putExtra("advanced_settings_index", 1);
                        float f14 = UptodownApp.I;
                        preferencesActivity.startActivity(intent4, b4.d.a(preferencesActivity));
                        break;
                    case 8:
                        int i212 = PreferencesActivity.T;
                        String string2 = preferencesActivity.getString(2131952497);
                        string2.getClass();
                        String string22 = preferencesActivity.getString(2131952725);
                        string22.getClass();
                        j5.c.e(preferencesActivity, string22, string2);
                        break;
                    case 9:
                        int i222 = PreferencesActivity.T;
                        Intent intent5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent5.putExtra("advanced_settings_title", preferencesActivity.getString(2131951643));
                        intent5.putExtra("advanced_settings_index", 2);
                        float f15 = UptodownApp.I;
                        preferencesActivity.startActivity(intent5, b4.d.a(preferencesActivity));
                        break;
                    case 10:
                        int i23 = PreferencesActivity.T;
                        Intent intent6 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent6.putExtra("advanced_settings_title", preferencesActivity.getString(2131951646));
                        intent6.putExtra("advanced_settings_index", 4);
                        float f16 = UptodownApp.I;
                        preferencesActivity.startActivity(intent6, b4.d.a(preferencesActivity));
                        break;
                    case 11:
                        int i24 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().L.f83m).performClick();
                        break;
                    case 12:
                        int i25 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9886s.f83m).performClick();
                        break;
                    case 13:
                        int i26 = PreferencesActivity.T;
                        preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                        break;
                    case 14:
                        int i27 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9883p.f83m).performClick();
                        break;
                    case 15:
                        int i28 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().C.f83m).performClick();
                        break;
                    case 16:
                        int i29 = PreferencesActivity.T;
                        preferencesActivity.finish();
                        break;
                    default:
                        int i30 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().E.f83m).performClick();
                        break;
                }
            }
        });
        ((TextView) z0().E.f85o).setTypeface(c.f4882w);
        ((TextView) l.y(this, 2131952486, (TextView) z0().E.f85o).E.f84n).setTypeface(c.f4883x);
        if (z3.p(this, "recibir_notificaciones", true)) {
            ((TextView) z0().E.f84n).setText(getString(2131951984));
        } else {
            ((TextView) z0().E.f84n).setText(getString(2131951951));
        }
        final int i23 = 6;
        ((SwitchCompat) z0().E.f83m).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: d4.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f3591b;

            {
                this.f3591b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z102) {
                int i152 = i23;
                PreferencesActivity preferencesActivity = this.f3591b;
                switch (i152) {
                    case 0:
                        int i162 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences3 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences3.getClass();
                        SharedPreferences.Editor editorEdit = sharedPreferences3.edit();
                        editorEdit.putBoolean("download_notification", z102);
                        editorEdit.apply();
                        break;
                    case 1:
                        int i172 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences4 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences4.getClass();
                        SharedPreferences.Editor editorEdit2 = sharedPreferences4.edit();
                        editorEdit2.putBoolean("installation_notification", z102);
                        editorEdit2.apply();
                        break;
                    case 2:
                        int i182 = PreferencesActivity.T;
                        if (!z102) {
                            v4 v4Var3 = new v4(preferencesActivity, 1);
                            RelativeLayout relativeLayout3 = (RelativeLayout) preferencesActivity.z0().K.f1061b;
                            relativeLayout3.getClass();
                            v4Var3.g(relativeLayout3, 0.3f);
                            SharedPreferences sharedPreferences5 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences5.getClass();
                            SharedPreferences.Editor editorEdit3 = sharedPreferences5.edit();
                            editorEdit3.putBoolean("updates_active", false);
                            editorEdit3.apply();
                            ((TextView) preferencesActivity.z0().L.f84n).setText(preferencesActivity.getString(2131951951));
                        } else {
                            v4 v4Var4 = new v4(preferencesActivity, 1);
                            RelativeLayout relativeLayout4 = (RelativeLayout) preferencesActivity.z0().K.f1061b;
                            relativeLayout4.getClass();
                            v4Var4.g(relativeLayout4, 1.0f);
                            SharedPreferences sharedPreferences6 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences6.getClass();
                            SharedPreferences.Editor editorEdit4 = sharedPreferences6.edit();
                            editorEdit4.putBoolean("updates_active", true);
                            editorEdit4.apply();
                            ((TextView) preferencesActivity.z0().L.f84n).setText(preferencesActivity.getString(2131951984));
                        }
                        break;
                    case 3:
                        int i192 = PreferencesActivity.T;
                        try {
                            SharedPreferences.Editor editorEdit5 = preferencesActivity.getSharedPreferences("CoreSettings", 0).edit();
                            editorEdit5.putBoolean("search_apk_worker_active", z102);
                            editorEdit5.apply();
                        } catch (Exception e11) {
                            e11.printStackTrace();
                            return;
                        }
                        break;
                    case 4:
                        int i202 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences7 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences7.getClass();
                        SharedPreferences.Editor editorEdit6 = sharedPreferences7.edit();
                        editorEdit6.putBoolean("install_apk_rooted", z102);
                        editorEdit6.apply();
                        if (z102) {
                            try {
                                t0.f.A();
                            } catch (Exception e12) {
                                e12.printStackTrace();
                                return;
                            }
                        }
                        break;
                    case 5:
                        int i212 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences8 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences8.getClass();
                        SharedPreferences.Editor editorEdit7 = sharedPreferences8.edit();
                        editorEdit7.putBoolean("install_apk_as_root_system", z102);
                        editorEdit7.apply();
                        if (z102) {
                            ((h4.a) preferencesActivity.P.getValue()).i(true);
                        }
                        break;
                    default:
                        int i222 = PreferencesActivity.T;
                        if (!z102) {
                            preferencesActivity.B0();
                            SharedPreferences sharedPreferences9 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences9.getClass();
                            SharedPreferences.Editor editorEdit8 = sharedPreferences9.edit();
                            editorEdit8.putBoolean("recibir_notificaciones", false);
                            editorEdit8.apply();
                        } else {
                            preferencesActivity.C0();
                            if (Build.VERSION.SDK_INT < 33) {
                                SharedPreferences sharedPreferences10 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences10.getClass();
                                SharedPreferences.Editor editorEdit9 = sharedPreferences10.edit();
                                editorEdit9.putBoolean("recibir_notificaciones", true);
                                editorEdit9.apply();
                                preferencesActivity.C0();
                            } else {
                                preferencesActivity.S.launch("android.permission.POST_NOTIFICATIONS");
                            }
                        }
                        break;
                }
            }
        });
        ((TextView) z0().K.f1063m).setTypeface(c.f4882w);
        ((TextView) l.y(this, 2131952709, (TextView) z0().K.f1063m).K.f1062l).setTypeface(c.f4883x);
        ((TextView) z0().K.f1062l).setText(A0());
        i iVar = new i(1, getString(2131951682));
        i iVar2 = new i(2, getString(2131951683));
        i iVar3 = new i(Integer.valueOf(i), getString(2131951686));
        i iVar4 = new i(4, getString(2131951684));
        i[] iVarArr = new i[4];
        iVarArr[0] = iVar;
        iVarArr[1] = iVar2;
        iVarArr[2] = iVar3;
        iVarArr[i] = iVar4;
        HashMap map = new HashMap(a0.h0(4));
        a0.j0(map, iVarArr);
        ((RelativeLayout) z0().K.f1061b).setOnClickListener(new e(23, this, map));
        ((RelativeLayout) z0().f9884q.f81b).setOnClickListener(new View.OnClickListener(this) { // from class: d4.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f3589b;

            {
                this.f3589b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i6;
                PreferencesActivity preferencesActivity = this.f3589b;
                switch (i112) {
                    case 0:
                        int i122 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9884q.f83m).performClick();
                        break;
                    case 1:
                        int i132 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9887t.f83m).performClick();
                        break;
                    case 2:
                        int i142 = PreferencesActivity.T;
                        v vVar = new v();
                        vVar.f7022a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                        int value = Year.now().getValue();
                        preferencesActivity.Q();
                        AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                        x xVar = new x();
                        u uVarC = u.c(preferencesActivity.getLayoutInflater());
                        ((TextView) uVarC.f5273r).setTypeface(f4.c.f4882w);
                        TextView textView = uVarC.f5271p;
                        textView.setTypeface(f4.c.f4883x);
                        textView.setText(preferencesActivity.getString(2131951671));
                        uVarC.f5270o.setTypeface(f4.c.f4883x);
                        EditText editText = uVarC.f5267l;
                        editText.setTypeface(f4.c.f4883x);
                        ((TextView) uVarC.f5272q).setTypeface(f4.c.f4883x);
                        TextView textView2 = uVarC.f5268m;
                        textView2.setTypeface(f4.c.f4882w);
                        TextView textView3 = uVarC.f5269n;
                        textView3.setTypeface(f4.c.f4882w);
                        int i152 = vVar.f7022a;
                        if (i152 > 0) {
                            editText.setText(String.valueOf(i152));
                        }
                        textView2.setOnClickListener(new s4(uVarC, value, preferencesActivity, xVar));
                        z3.J(textView3);
                        textView3.setText(preferencesActivity.getString(2131952538));
                        textView3.setOnClickListener(new t(vVar, uVarC, preferencesActivity, 10));
                        builder.setView(uVarC.f5266b);
                        builder.setCancelable(true);
                        AlertDialog alertDialogCreate = builder.create();
                        xVar.f7024a = alertDialogCreate;
                        if (alertDialogCreate != null) {
                            Window window = alertDialogCreate.getWindow();
                            if (window != null) {
                                a4.x.y(window, 0);
                            }
                            ((AlertDialog) xVar.f7024a).show();
                        }
                        break;
                    case 3:
                        int i162 = PreferencesActivity.T;
                        Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                        ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                        float f10 = UptodownApp.I;
                        activityResultLauncher.launch(intent, b4.d.b(preferencesActivity));
                        break;
                    case 4:
                        int i172 = PreferencesActivity.T;
                        float f11 = UptodownApp.I;
                        if (!b4.d.n(preferencesActivity)) {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), b4.d.a(preferencesActivity));
                        } else {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                        }
                        break;
                    case 5:
                        int i182 = PreferencesActivity.T;
                        Intent intent2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent2.putExtra("advanced_settings_title", preferencesActivity.getString(2131951662));
                        intent2.putExtra("advanced_settings_index", 3);
                        float f12 = UptodownApp.I;
                        preferencesActivity.startActivity(intent2, b4.d.a(preferencesActivity));
                        break;
                    case 6:
                        int i192 = PreferencesActivity.T;
                        Intent intent3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent3.putExtra("advanced_settings_title", preferencesActivity.getString(2131952660));
                        intent3.putExtra("advanced_settings_index", 0);
                        float f13 = UptodownApp.I;
                        preferencesActivity.startActivity(intent3, b4.d.a(preferencesActivity));
                        break;
                    case 7:
                        int i202 = PreferencesActivity.T;
                        Intent intent4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent4.putExtra("advanced_settings_title", preferencesActivity.getString(2131952632));
                        intent4.putExtra("advanced_settings_index", 1);
                        float f14 = UptodownApp.I;
                        preferencesActivity.startActivity(intent4, b4.d.a(preferencesActivity));
                        break;
                    case 8:
                        int i212 = PreferencesActivity.T;
                        String string2 = preferencesActivity.getString(2131952497);
                        string2.getClass();
                        String string22 = preferencesActivity.getString(2131952725);
                        string22.getClass();
                        j5.c.e(preferencesActivity, string22, string2);
                        break;
                    case 9:
                        int i222 = PreferencesActivity.T;
                        Intent intent5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent5.putExtra("advanced_settings_title", preferencesActivity.getString(2131951643));
                        intent5.putExtra("advanced_settings_index", 2);
                        float f15 = UptodownApp.I;
                        preferencesActivity.startActivity(intent5, b4.d.a(preferencesActivity));
                        break;
                    case 10:
                        int i232 = PreferencesActivity.T;
                        Intent intent6 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent6.putExtra("advanced_settings_title", preferencesActivity.getString(2131951646));
                        intent6.putExtra("advanced_settings_index", 4);
                        float f16 = UptodownApp.I;
                        preferencesActivity.startActivity(intent6, b4.d.a(preferencesActivity));
                        break;
                    case 11:
                        int i24 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().L.f83m).performClick();
                        break;
                    case 12:
                        int i25 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9886s.f83m).performClick();
                        break;
                    case 13:
                        int i26 = PreferencesActivity.T;
                        preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                        break;
                    case 14:
                        int i27 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9883p.f83m).performClick();
                        break;
                    case 15:
                        int i28 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().C.f83m).performClick();
                        break;
                    case 16:
                        int i29 = PreferencesActivity.T;
                        preferencesActivity.finish();
                        break;
                    default:
                        int i30 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().E.f83m).performClick();
                        break;
                }
            }
        });
        ((TextView) z0().f9884q.f85o).setTypeface(c.f4882w);
        ((TextView) l.y(this, 2131951976, (TextView) z0().f9884q.f85o).f9884q.f84n).setTypeface(c.f4883x);
        ((SwitchCompat) l.y(this, 2131951975, (TextView) z0().f9884q.f84n).f9884q.f83m).setChecked(z3.p(this, "download_notification", true));
        ((SwitchCompat) z0().f9884q.f83m).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: d4.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f3591b;

            {
                this.f3591b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z102) {
                int i152 = i6;
                PreferencesActivity preferencesActivity = this.f3591b;
                switch (i152) {
                    case 0:
                        int i162 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences3 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences3.getClass();
                        SharedPreferences.Editor editorEdit = sharedPreferences3.edit();
                        editorEdit.putBoolean("download_notification", z102);
                        editorEdit.apply();
                        break;
                    case 1:
                        int i172 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences4 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences4.getClass();
                        SharedPreferences.Editor editorEdit2 = sharedPreferences4.edit();
                        editorEdit2.putBoolean("installation_notification", z102);
                        editorEdit2.apply();
                        break;
                    case 2:
                        int i182 = PreferencesActivity.T;
                        if (!z102) {
                            v4 v4Var3 = new v4(preferencesActivity, 1);
                            RelativeLayout relativeLayout3 = (RelativeLayout) preferencesActivity.z0().K.f1061b;
                            relativeLayout3.getClass();
                            v4Var3.g(relativeLayout3, 0.3f);
                            SharedPreferences sharedPreferences5 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences5.getClass();
                            SharedPreferences.Editor editorEdit3 = sharedPreferences5.edit();
                            editorEdit3.putBoolean("updates_active", false);
                            editorEdit3.apply();
                            ((TextView) preferencesActivity.z0().L.f84n).setText(preferencesActivity.getString(2131951951));
                        } else {
                            v4 v4Var4 = new v4(preferencesActivity, 1);
                            RelativeLayout relativeLayout4 = (RelativeLayout) preferencesActivity.z0().K.f1061b;
                            relativeLayout4.getClass();
                            v4Var4.g(relativeLayout4, 1.0f);
                            SharedPreferences sharedPreferences6 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences6.getClass();
                            SharedPreferences.Editor editorEdit4 = sharedPreferences6.edit();
                            editorEdit4.putBoolean("updates_active", true);
                            editorEdit4.apply();
                            ((TextView) preferencesActivity.z0().L.f84n).setText(preferencesActivity.getString(2131951984));
                        }
                        break;
                    case 3:
                        int i192 = PreferencesActivity.T;
                        try {
                            SharedPreferences.Editor editorEdit5 = preferencesActivity.getSharedPreferences("CoreSettings", 0).edit();
                            editorEdit5.putBoolean("search_apk_worker_active", z102);
                            editorEdit5.apply();
                        } catch (Exception e11) {
                            e11.printStackTrace();
                            return;
                        }
                        break;
                    case 4:
                        int i202 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences7 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences7.getClass();
                        SharedPreferences.Editor editorEdit6 = sharedPreferences7.edit();
                        editorEdit6.putBoolean("install_apk_rooted", z102);
                        editorEdit6.apply();
                        if (z102) {
                            try {
                                t0.f.A();
                            } catch (Exception e12) {
                                e12.printStackTrace();
                                return;
                            }
                        }
                        break;
                    case 5:
                        int i212 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences8 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences8.getClass();
                        SharedPreferences.Editor editorEdit7 = sharedPreferences8.edit();
                        editorEdit7.putBoolean("install_apk_as_root_system", z102);
                        editorEdit7.apply();
                        if (z102) {
                            ((h4.a) preferencesActivity.P.getValue()).i(true);
                        }
                        break;
                    default:
                        int i222 = PreferencesActivity.T;
                        if (!z102) {
                            preferencesActivity.B0();
                            SharedPreferences sharedPreferences9 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences9.getClass();
                            SharedPreferences.Editor editorEdit8 = sharedPreferences9.edit();
                            editorEdit8.putBoolean("recibir_notificaciones", false);
                            editorEdit8.apply();
                        } else {
                            preferencesActivity.C0();
                            if (Build.VERSION.SDK_INT < 33) {
                                SharedPreferences sharedPreferences10 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences10.getClass();
                                SharedPreferences.Editor editorEdit9 = sharedPreferences10.edit();
                                editorEdit9.putBoolean("recibir_notificaciones", true);
                                editorEdit9.apply();
                                preferencesActivity.C0();
                            } else {
                                preferencesActivity.S.launch("android.permission.POST_NOTIFICATIONS");
                            }
                        }
                        break;
                }
            }
        });
        RelativeLayout relativeLayout3 = (RelativeLayout) z0().f9887t.f81b;
        final int i24 = true ? 1 : 0;
        relativeLayout3.setOnClickListener(new View.OnClickListener(this) { // from class: d4.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f3589b;

            {
                this.f3589b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i24;
                PreferencesActivity preferencesActivity = this.f3589b;
                switch (i112) {
                    case 0:
                        int i122 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9884q.f83m).performClick();
                        break;
                    case 1:
                        int i132 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9887t.f83m).performClick();
                        break;
                    case 2:
                        int i142 = PreferencesActivity.T;
                        v vVar = new v();
                        vVar.f7022a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                        int value = Year.now().getValue();
                        preferencesActivity.Q();
                        AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                        x xVar = new x();
                        u uVarC = u.c(preferencesActivity.getLayoutInflater());
                        ((TextView) uVarC.f5273r).setTypeface(f4.c.f4882w);
                        TextView textView = uVarC.f5271p;
                        textView.setTypeface(f4.c.f4883x);
                        textView.setText(preferencesActivity.getString(2131951671));
                        uVarC.f5270o.setTypeface(f4.c.f4883x);
                        EditText editText = uVarC.f5267l;
                        editText.setTypeface(f4.c.f4883x);
                        ((TextView) uVarC.f5272q).setTypeface(f4.c.f4883x);
                        TextView textView2 = uVarC.f5268m;
                        textView2.setTypeface(f4.c.f4882w);
                        TextView textView3 = uVarC.f5269n;
                        textView3.setTypeface(f4.c.f4882w);
                        int i152 = vVar.f7022a;
                        if (i152 > 0) {
                            editText.setText(String.valueOf(i152));
                        }
                        textView2.setOnClickListener(new s4(uVarC, value, preferencesActivity, xVar));
                        z3.J(textView3);
                        textView3.setText(preferencesActivity.getString(2131952538));
                        textView3.setOnClickListener(new t(vVar, uVarC, preferencesActivity, 10));
                        builder.setView(uVarC.f5266b);
                        builder.setCancelable(true);
                        AlertDialog alertDialogCreate = builder.create();
                        xVar.f7024a = alertDialogCreate;
                        if (alertDialogCreate != null) {
                            Window window = alertDialogCreate.getWindow();
                            if (window != null) {
                                a4.x.y(window, 0);
                            }
                            ((AlertDialog) xVar.f7024a).show();
                        }
                        break;
                    case 3:
                        int i162 = PreferencesActivity.T;
                        Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                        ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                        float f10 = UptodownApp.I;
                        activityResultLauncher.launch(intent, b4.d.b(preferencesActivity));
                        break;
                    case 4:
                        int i172 = PreferencesActivity.T;
                        float f11 = UptodownApp.I;
                        if (!b4.d.n(preferencesActivity)) {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), b4.d.a(preferencesActivity));
                        } else {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                        }
                        break;
                    case 5:
                        int i182 = PreferencesActivity.T;
                        Intent intent2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent2.putExtra("advanced_settings_title", preferencesActivity.getString(2131951662));
                        intent2.putExtra("advanced_settings_index", 3);
                        float f12 = UptodownApp.I;
                        preferencesActivity.startActivity(intent2, b4.d.a(preferencesActivity));
                        break;
                    case 6:
                        int i192 = PreferencesActivity.T;
                        Intent intent3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent3.putExtra("advanced_settings_title", preferencesActivity.getString(2131952660));
                        intent3.putExtra("advanced_settings_index", 0);
                        float f13 = UptodownApp.I;
                        preferencesActivity.startActivity(intent3, b4.d.a(preferencesActivity));
                        break;
                    case 7:
                        int i202 = PreferencesActivity.T;
                        Intent intent4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent4.putExtra("advanced_settings_title", preferencesActivity.getString(2131952632));
                        intent4.putExtra("advanced_settings_index", 1);
                        float f14 = UptodownApp.I;
                        preferencesActivity.startActivity(intent4, b4.d.a(preferencesActivity));
                        break;
                    case 8:
                        int i212 = PreferencesActivity.T;
                        String string2 = preferencesActivity.getString(2131952497);
                        string2.getClass();
                        String string22 = preferencesActivity.getString(2131952725);
                        string22.getClass();
                        j5.c.e(preferencesActivity, string22, string2);
                        break;
                    case 9:
                        int i222 = PreferencesActivity.T;
                        Intent intent5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent5.putExtra("advanced_settings_title", preferencesActivity.getString(2131951643));
                        intent5.putExtra("advanced_settings_index", 2);
                        float f15 = UptodownApp.I;
                        preferencesActivity.startActivity(intent5, b4.d.a(preferencesActivity));
                        break;
                    case 10:
                        int i232 = PreferencesActivity.T;
                        Intent intent6 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent6.putExtra("advanced_settings_title", preferencesActivity.getString(2131951646));
                        intent6.putExtra("advanced_settings_index", 4);
                        float f16 = UptodownApp.I;
                        preferencesActivity.startActivity(intent6, b4.d.a(preferencesActivity));
                        break;
                    case 11:
                        int i242 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().L.f83m).performClick();
                        break;
                    case 12:
                        int i25 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9886s.f83m).performClick();
                        break;
                    case 13:
                        int i26 = PreferencesActivity.T;
                        preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                        break;
                    case 14:
                        int i27 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9883p.f83m).performClick();
                        break;
                    case 15:
                        int i28 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().C.f83m).performClick();
                        break;
                    case 16:
                        int i29 = PreferencesActivity.T;
                        preferencesActivity.finish();
                        break;
                    default:
                        int i30 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().E.f83m).performClick();
                        break;
                }
            }
        });
        ((TextView) z0().f9887t.f85o).setTypeface(c.f4882w);
        ((TextView) l.y(this, 2131952093, (TextView) z0().f9887t.f85o).f9887t.f84n).setTypeface(c.f4883x);
        ((SwitchCompat) l.y(this, 2131952096, (TextView) z0().f9887t.f84n).f9887t.f83m).setChecked(z3.p(this, "installation_notification", true));
        SwitchCompat switchCompat2 = (SwitchCompat) z0().f9887t.f83m;
        final int i25 = true ? 1 : 0;
        switchCompat2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: d4.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f3591b;

            {
                this.f3591b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z102) {
                int i152 = i25;
                PreferencesActivity preferencesActivity = this.f3591b;
                switch (i152) {
                    case 0:
                        int i162 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences3 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences3.getClass();
                        SharedPreferences.Editor editorEdit = sharedPreferences3.edit();
                        editorEdit.putBoolean("download_notification", z102);
                        editorEdit.apply();
                        break;
                    case 1:
                        int i172 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences4 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences4.getClass();
                        SharedPreferences.Editor editorEdit2 = sharedPreferences4.edit();
                        editorEdit2.putBoolean("installation_notification", z102);
                        editorEdit2.apply();
                        break;
                    case 2:
                        int i182 = PreferencesActivity.T;
                        if (!z102) {
                            v4 v4Var3 = new v4(preferencesActivity, 1);
                            RelativeLayout relativeLayout32 = (RelativeLayout) preferencesActivity.z0().K.f1061b;
                            relativeLayout32.getClass();
                            v4Var3.g(relativeLayout32, 0.3f);
                            SharedPreferences sharedPreferences5 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences5.getClass();
                            SharedPreferences.Editor editorEdit3 = sharedPreferences5.edit();
                            editorEdit3.putBoolean("updates_active", false);
                            editorEdit3.apply();
                            ((TextView) preferencesActivity.z0().L.f84n).setText(preferencesActivity.getString(2131951951));
                        } else {
                            v4 v4Var4 = new v4(preferencesActivity, 1);
                            RelativeLayout relativeLayout4 = (RelativeLayout) preferencesActivity.z0().K.f1061b;
                            relativeLayout4.getClass();
                            v4Var4.g(relativeLayout4, 1.0f);
                            SharedPreferences sharedPreferences6 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences6.getClass();
                            SharedPreferences.Editor editorEdit4 = sharedPreferences6.edit();
                            editorEdit4.putBoolean("updates_active", true);
                            editorEdit4.apply();
                            ((TextView) preferencesActivity.z0().L.f84n).setText(preferencesActivity.getString(2131951984));
                        }
                        break;
                    case 3:
                        int i192 = PreferencesActivity.T;
                        try {
                            SharedPreferences.Editor editorEdit5 = preferencesActivity.getSharedPreferences("CoreSettings", 0).edit();
                            editorEdit5.putBoolean("search_apk_worker_active", z102);
                            editorEdit5.apply();
                        } catch (Exception e11) {
                            e11.printStackTrace();
                            return;
                        }
                        break;
                    case 4:
                        int i202 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences7 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences7.getClass();
                        SharedPreferences.Editor editorEdit6 = sharedPreferences7.edit();
                        editorEdit6.putBoolean("install_apk_rooted", z102);
                        editorEdit6.apply();
                        if (z102) {
                            try {
                                t0.f.A();
                            } catch (Exception e12) {
                                e12.printStackTrace();
                                return;
                            }
                        }
                        break;
                    case 5:
                        int i212 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences8 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences8.getClass();
                        SharedPreferences.Editor editorEdit7 = sharedPreferences8.edit();
                        editorEdit7.putBoolean("install_apk_as_root_system", z102);
                        editorEdit7.apply();
                        if (z102) {
                            ((h4.a) preferencesActivity.P.getValue()).i(true);
                        }
                        break;
                    default:
                        int i222 = PreferencesActivity.T;
                        if (!z102) {
                            preferencesActivity.B0();
                            SharedPreferences sharedPreferences9 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences9.getClass();
                            SharedPreferences.Editor editorEdit8 = sharedPreferences9.edit();
                            editorEdit8.putBoolean("recibir_notificaciones", false);
                            editorEdit8.apply();
                        } else {
                            preferencesActivity.C0();
                            if (Build.VERSION.SDK_INT < 33) {
                                SharedPreferences sharedPreferences10 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences10.getClass();
                                SharedPreferences.Editor editorEdit9 = sharedPreferences10.edit();
                                editorEdit9.putBoolean("recibir_notificaciones", true);
                                editorEdit9.apply();
                                preferencesActivity.C0();
                            } else {
                                preferencesActivity.S.launch("android.permission.POST_NOTIFICATIONS");
                            }
                        }
                        break;
                }
            }
        });
        if (o.a(this)) {
            C0();
            ((SwitchCompat) z0().E.f83m).setChecked(true);
        } else {
            B0();
            ((SwitchCompat) z0().E.f83m).setChecked(false);
        }
        v vVar = new v();
        String string2 = getString(2131952099);
        string2.getClass();
        if (!z3.B(this, "storage_sdcard")) {
            string2 = getString(2131952099);
            string2.getClass();
            vVar.f7022a = 0;
        } else if (z3.p(this, "storage_sdcard", false)) {
            string2 = getString(2131952558);
            string2.getClass();
            vVar.f7022a = 1;
        }
        HashMap map2 = new HashMap();
        h4.a aVar = new h4.a(this);
        if (aVar.d()) {
            File[] externalFilesDirs = getExternalFilesDirs(null);
            if (externalFilesDirs.length > 1) {
                externalFilesDir = externalFilesDirs[1];
            } else {
                File externalFilesDir2 = getExternalFilesDir(null);
                aVar.g();
                aVar.f();
                externalFilesDir = externalFilesDir2;
            }
        } else {
            externalFilesDir = getExternalFilesDir(null);
        }
        File file = new File(externalFilesDir, "Apps");
        if (!file.exists()) {
            file.mkdirs();
        }
        map2.put(0, getString(2131952098, i5.H(this, file.getFreeSpace())));
        ArrayList arrayListI = a.a.I(this);
        if (!arrayListI.isEmpty()) {
            map2.put(1, getString(2131952559, i5.H(this, ((l4.o) arrayListI.get(0)).f7128d)));
        }
        if (map2.size() > 1) {
            HashMap map3 = new HashMap();
            for (Map.Entry entry : map2.entrySet()) {
                map3.put(entry.getKey(), entry.getValue());
            }
            b5.m mVarZ = b5.m.z(getLayoutInflater().inflate(2131558779, (ViewGroup) null, false));
            RelativeLayout relativeLayout4 = (RelativeLayout) mVarZ.f1061b;
            TextView textView = (TextView) mVarZ.f1063m;
            textView.setTypeface(c.f4882w);
            textView.setText(getString(2131951970));
            ((TextView) mVarZ.f1062l).setText(string2);
            relativeLayout4.setOnClickListener(new y2(this, map3, vVar, mVarZ, 2));
            z0().v.addView(relativeLayout4, z0().v.indexOfChild((RelativeLayout) z0().f9886s.f81b));
        }
        ((TextView) z0().A.f7781l).setTypeface(c.f4882w);
        ((TextView) l.y(this, 2131952489, (TextView) z0().A.f7781l).f9882o.f1063m).setTypeface(c.f4882w);
        ((TextView) l.y(this, 2131951672, (TextView) z0().f9882o.f1063m).f9882o.f1062l).setVisibility(8);
        ((RelativeLayout) z0().f9882o.f1061b).setOnClickListener(new View.OnClickListener(this) { // from class: d4.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f3589b;

            {
                this.f3589b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i14;
                PreferencesActivity preferencesActivity = this.f3589b;
                switch (i112) {
                    case 0:
                        int i122 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9884q.f83m).performClick();
                        break;
                    case 1:
                        int i132 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9887t.f83m).performClick();
                        break;
                    case 2:
                        int i142 = PreferencesActivity.T;
                        v vVar2 = new v();
                        vVar2.f7022a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                        int value = Year.now().getValue();
                        preferencesActivity.Q();
                        AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                        x xVar = new x();
                        u uVarC = u.c(preferencesActivity.getLayoutInflater());
                        ((TextView) uVarC.f5273r).setTypeface(f4.c.f4882w);
                        TextView textView2 = uVarC.f5271p;
                        textView2.setTypeface(f4.c.f4883x);
                        textView2.setText(preferencesActivity.getString(2131951671));
                        uVarC.f5270o.setTypeface(f4.c.f4883x);
                        EditText editText = uVarC.f5267l;
                        editText.setTypeface(f4.c.f4883x);
                        ((TextView) uVarC.f5272q).setTypeface(f4.c.f4883x);
                        TextView textView22 = uVarC.f5268m;
                        textView22.setTypeface(f4.c.f4882w);
                        TextView textView3 = uVarC.f5269n;
                        textView3.setTypeface(f4.c.f4882w);
                        int i152 = vVar2.f7022a;
                        if (i152 > 0) {
                            editText.setText(String.valueOf(i152));
                        }
                        textView22.setOnClickListener(new s4(uVarC, value, preferencesActivity, xVar));
                        z3.J(textView3);
                        textView3.setText(preferencesActivity.getString(2131952538));
                        textView3.setOnClickListener(new t(vVar2, uVarC, preferencesActivity, 10));
                        builder.setView(uVarC.f5266b);
                        builder.setCancelable(true);
                        AlertDialog alertDialogCreate = builder.create();
                        xVar.f7024a = alertDialogCreate;
                        if (alertDialogCreate != null) {
                            Window window = alertDialogCreate.getWindow();
                            if (window != null) {
                                a4.x.y(window, 0);
                            }
                            ((AlertDialog) xVar.f7024a).show();
                        }
                        break;
                    case 3:
                        int i162 = PreferencesActivity.T;
                        Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                        ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                        float f10 = UptodownApp.I;
                        activityResultLauncher.launch(intent, b4.d.b(preferencesActivity));
                        break;
                    case 4:
                        int i172 = PreferencesActivity.T;
                        float f11 = UptodownApp.I;
                        if (!b4.d.n(preferencesActivity)) {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), b4.d.a(preferencesActivity));
                        } else {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                        }
                        break;
                    case 5:
                        int i182 = PreferencesActivity.T;
                        Intent intent2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent2.putExtra("advanced_settings_title", preferencesActivity.getString(2131951662));
                        intent2.putExtra("advanced_settings_index", 3);
                        float f12 = UptodownApp.I;
                        preferencesActivity.startActivity(intent2, b4.d.a(preferencesActivity));
                        break;
                    case 6:
                        int i192 = PreferencesActivity.T;
                        Intent intent3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent3.putExtra("advanced_settings_title", preferencesActivity.getString(2131952660));
                        intent3.putExtra("advanced_settings_index", 0);
                        float f13 = UptodownApp.I;
                        preferencesActivity.startActivity(intent3, b4.d.a(preferencesActivity));
                        break;
                    case 7:
                        int i202 = PreferencesActivity.T;
                        Intent intent4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent4.putExtra("advanced_settings_title", preferencesActivity.getString(2131952632));
                        intent4.putExtra("advanced_settings_index", 1);
                        float f14 = UptodownApp.I;
                        preferencesActivity.startActivity(intent4, b4.d.a(preferencesActivity));
                        break;
                    case 8:
                        int i212 = PreferencesActivity.T;
                        String string22 = preferencesActivity.getString(2131952497);
                        string22.getClass();
                        String string222 = preferencesActivity.getString(2131952725);
                        string222.getClass();
                        j5.c.e(preferencesActivity, string222, string22);
                        break;
                    case 9:
                        int i222 = PreferencesActivity.T;
                        Intent intent5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent5.putExtra("advanced_settings_title", preferencesActivity.getString(2131951643));
                        intent5.putExtra("advanced_settings_index", 2);
                        float f15 = UptodownApp.I;
                        preferencesActivity.startActivity(intent5, b4.d.a(preferencesActivity));
                        break;
                    case 10:
                        int i232 = PreferencesActivity.T;
                        Intent intent6 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent6.putExtra("advanced_settings_title", preferencesActivity.getString(2131951646));
                        intent6.putExtra("advanced_settings_index", 4);
                        float f16 = UptodownApp.I;
                        preferencesActivity.startActivity(intent6, b4.d.a(preferencesActivity));
                        break;
                    case 11:
                        int i242 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().L.f83m).performClick();
                        break;
                    case 12:
                        int i252 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9886s.f83m).performClick();
                        break;
                    case 13:
                        int i26 = PreferencesActivity.T;
                        preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                        break;
                    case 14:
                        int i27 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9883p.f83m).performClick();
                        break;
                    case 15:
                        int i28 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().C.f83m).performClick();
                        break;
                    case 16:
                        int i29 = PreferencesActivity.T;
                        preferencesActivity.finish();
                        break;
                    default:
                        int i30 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().E.f83m).performClick();
                        break;
                }
            }
        });
        z0().B.f9844n.setTypeface(c.f4882w);
        l.y(this, 2131952045, z0().B.f9844n).B.f9841b.setOnClickListener(new View.OnClickListener(this) { // from class: d4.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f3589b;

            {
                this.f3589b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i18;
                PreferencesActivity preferencesActivity = this.f3589b;
                switch (i112) {
                    case 0:
                        int i122 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9884q.f83m).performClick();
                        break;
                    case 1:
                        int i132 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9887t.f83m).performClick();
                        break;
                    case 2:
                        int i142 = PreferencesActivity.T;
                        v vVar2 = new v();
                        vVar2.f7022a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                        int value = Year.now().getValue();
                        preferencesActivity.Q();
                        AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                        x xVar = new x();
                        u uVarC = u.c(preferencesActivity.getLayoutInflater());
                        ((TextView) uVarC.f5273r).setTypeface(f4.c.f4882w);
                        TextView textView2 = uVarC.f5271p;
                        textView2.setTypeface(f4.c.f4883x);
                        textView2.setText(preferencesActivity.getString(2131951671));
                        uVarC.f5270o.setTypeface(f4.c.f4883x);
                        EditText editText = uVarC.f5267l;
                        editText.setTypeface(f4.c.f4883x);
                        ((TextView) uVarC.f5272q).setTypeface(f4.c.f4883x);
                        TextView textView22 = uVarC.f5268m;
                        textView22.setTypeface(f4.c.f4882w);
                        TextView textView3 = uVarC.f5269n;
                        textView3.setTypeface(f4.c.f4882w);
                        int i152 = vVar2.f7022a;
                        if (i152 > 0) {
                            editText.setText(String.valueOf(i152));
                        }
                        textView22.setOnClickListener(new s4(uVarC, value, preferencesActivity, xVar));
                        z3.J(textView3);
                        textView3.setText(preferencesActivity.getString(2131952538));
                        textView3.setOnClickListener(new t(vVar2, uVarC, preferencesActivity, 10));
                        builder.setView(uVarC.f5266b);
                        builder.setCancelable(true);
                        AlertDialog alertDialogCreate = builder.create();
                        xVar.f7024a = alertDialogCreate;
                        if (alertDialogCreate != null) {
                            Window window = alertDialogCreate.getWindow();
                            if (window != null) {
                                a4.x.y(window, 0);
                            }
                            ((AlertDialog) xVar.f7024a).show();
                        }
                        break;
                    case 3:
                        int i162 = PreferencesActivity.T;
                        Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                        ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                        float f10 = UptodownApp.I;
                        activityResultLauncher.launch(intent, b4.d.b(preferencesActivity));
                        break;
                    case 4:
                        int i172 = PreferencesActivity.T;
                        float f11 = UptodownApp.I;
                        if (!b4.d.n(preferencesActivity)) {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), b4.d.a(preferencesActivity));
                        } else {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                        }
                        break;
                    case 5:
                        int i182 = PreferencesActivity.T;
                        Intent intent2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent2.putExtra("advanced_settings_title", preferencesActivity.getString(2131951662));
                        intent2.putExtra("advanced_settings_index", 3);
                        float f12 = UptodownApp.I;
                        preferencesActivity.startActivity(intent2, b4.d.a(preferencesActivity));
                        break;
                    case 6:
                        int i192 = PreferencesActivity.T;
                        Intent intent3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent3.putExtra("advanced_settings_title", preferencesActivity.getString(2131952660));
                        intent3.putExtra("advanced_settings_index", 0);
                        float f13 = UptodownApp.I;
                        preferencesActivity.startActivity(intent3, b4.d.a(preferencesActivity));
                        break;
                    case 7:
                        int i202 = PreferencesActivity.T;
                        Intent intent4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent4.putExtra("advanced_settings_title", preferencesActivity.getString(2131952632));
                        intent4.putExtra("advanced_settings_index", 1);
                        float f14 = UptodownApp.I;
                        preferencesActivity.startActivity(intent4, b4.d.a(preferencesActivity));
                        break;
                    case 8:
                        int i212 = PreferencesActivity.T;
                        String string22 = preferencesActivity.getString(2131952497);
                        string22.getClass();
                        String string222 = preferencesActivity.getString(2131952725);
                        string222.getClass();
                        j5.c.e(preferencesActivity, string222, string22);
                        break;
                    case 9:
                        int i222 = PreferencesActivity.T;
                        Intent intent5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent5.putExtra("advanced_settings_title", preferencesActivity.getString(2131951643));
                        intent5.putExtra("advanced_settings_index", 2);
                        float f15 = UptodownApp.I;
                        preferencesActivity.startActivity(intent5, b4.d.a(preferencesActivity));
                        break;
                    case 10:
                        int i232 = PreferencesActivity.T;
                        Intent intent6 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent6.putExtra("advanced_settings_title", preferencesActivity.getString(2131951646));
                        intent6.putExtra("advanced_settings_index", 4);
                        float f16 = UptodownApp.I;
                        preferencesActivity.startActivity(intent6, b4.d.a(preferencesActivity));
                        break;
                    case 11:
                        int i242 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().L.f83m).performClick();
                        break;
                    case 12:
                        int i252 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9886s.f83m).performClick();
                        break;
                    case 13:
                        int i26 = PreferencesActivity.T;
                        preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                        break;
                    case 14:
                        int i27 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9883p.f83m).performClick();
                        break;
                    case 15:
                        int i28 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().C.f83m).performClick();
                        break;
                    case 16:
                        int i29 = PreferencesActivity.T;
                        preferencesActivity.finish();
                        break;
                    default:
                        int i30 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().E.f83m).performClick();
                        break;
                }
            }
        });
        try {
            SharedPreferences sharedPreferences3 = getSharedPreferences("SettingsPreferences", 0);
            if (sharedPreferences3.contains("is_in_eea")) {
                z9 = sharedPreferences3.getBoolean("is_in_eea", true);
            }
        } catch (Exception unused2) {
        }
        if (!z9) {
            z0().B.f9841b.setVisibility(8);
        }
        z0().f9881n.f9844n.setTypeface(c.f4882w);
        final int i26 = 5;
        l.y(this, 2131951662, z0().f9881n.f9844n).f9881n.f9841b.setOnClickListener(new View.OnClickListener(this) { // from class: d4.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f3589b;

            {
                this.f3589b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i26;
                PreferencesActivity preferencesActivity = this.f3589b;
                switch (i112) {
                    case 0:
                        int i122 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9884q.f83m).performClick();
                        break;
                    case 1:
                        int i132 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9887t.f83m).performClick();
                        break;
                    case 2:
                        int i142 = PreferencesActivity.T;
                        v vVar2 = new v();
                        vVar2.f7022a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                        int value = Year.now().getValue();
                        preferencesActivity.Q();
                        AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                        x xVar = new x();
                        u uVarC = u.c(preferencesActivity.getLayoutInflater());
                        ((TextView) uVarC.f5273r).setTypeface(f4.c.f4882w);
                        TextView textView2 = uVarC.f5271p;
                        textView2.setTypeface(f4.c.f4883x);
                        textView2.setText(preferencesActivity.getString(2131951671));
                        uVarC.f5270o.setTypeface(f4.c.f4883x);
                        EditText editText = uVarC.f5267l;
                        editText.setTypeface(f4.c.f4883x);
                        ((TextView) uVarC.f5272q).setTypeface(f4.c.f4883x);
                        TextView textView22 = uVarC.f5268m;
                        textView22.setTypeface(f4.c.f4882w);
                        TextView textView3 = uVarC.f5269n;
                        textView3.setTypeface(f4.c.f4882w);
                        int i152 = vVar2.f7022a;
                        if (i152 > 0) {
                            editText.setText(String.valueOf(i152));
                        }
                        textView22.setOnClickListener(new s4(uVarC, value, preferencesActivity, xVar));
                        z3.J(textView3);
                        textView3.setText(preferencesActivity.getString(2131952538));
                        textView3.setOnClickListener(new t(vVar2, uVarC, preferencesActivity, 10));
                        builder.setView(uVarC.f5266b);
                        builder.setCancelable(true);
                        AlertDialog alertDialogCreate = builder.create();
                        xVar.f7024a = alertDialogCreate;
                        if (alertDialogCreate != null) {
                            Window window = alertDialogCreate.getWindow();
                            if (window != null) {
                                a4.x.y(window, 0);
                            }
                            ((AlertDialog) xVar.f7024a).show();
                        }
                        break;
                    case 3:
                        int i162 = PreferencesActivity.T;
                        Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                        ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                        float f10 = UptodownApp.I;
                        activityResultLauncher.launch(intent, b4.d.b(preferencesActivity));
                        break;
                    case 4:
                        int i172 = PreferencesActivity.T;
                        float f11 = UptodownApp.I;
                        if (!b4.d.n(preferencesActivity)) {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), b4.d.a(preferencesActivity));
                        } else {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                        }
                        break;
                    case 5:
                        int i182 = PreferencesActivity.T;
                        Intent intent2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent2.putExtra("advanced_settings_title", preferencesActivity.getString(2131951662));
                        intent2.putExtra("advanced_settings_index", 3);
                        float f12 = UptodownApp.I;
                        preferencesActivity.startActivity(intent2, b4.d.a(preferencesActivity));
                        break;
                    case 6:
                        int i192 = PreferencesActivity.T;
                        Intent intent3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent3.putExtra("advanced_settings_title", preferencesActivity.getString(2131952660));
                        intent3.putExtra("advanced_settings_index", 0);
                        float f13 = UptodownApp.I;
                        preferencesActivity.startActivity(intent3, b4.d.a(preferencesActivity));
                        break;
                    case 7:
                        int i202 = PreferencesActivity.T;
                        Intent intent4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent4.putExtra("advanced_settings_title", preferencesActivity.getString(2131952632));
                        intent4.putExtra("advanced_settings_index", 1);
                        float f14 = UptodownApp.I;
                        preferencesActivity.startActivity(intent4, b4.d.a(preferencesActivity));
                        break;
                    case 8:
                        int i212 = PreferencesActivity.T;
                        String string22 = preferencesActivity.getString(2131952497);
                        string22.getClass();
                        String string222 = preferencesActivity.getString(2131952725);
                        string222.getClass();
                        j5.c.e(preferencesActivity, string222, string22);
                        break;
                    case 9:
                        int i222 = PreferencesActivity.T;
                        Intent intent5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent5.putExtra("advanced_settings_title", preferencesActivity.getString(2131951643));
                        intent5.putExtra("advanced_settings_index", 2);
                        float f15 = UptodownApp.I;
                        preferencesActivity.startActivity(intent5, b4.d.a(preferencesActivity));
                        break;
                    case 10:
                        int i232 = PreferencesActivity.T;
                        Intent intent6 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent6.putExtra("advanced_settings_title", preferencesActivity.getString(2131951646));
                        intent6.putExtra("advanced_settings_index", 4);
                        float f16 = UptodownApp.I;
                        preferencesActivity.startActivity(intent6, b4.d.a(preferencesActivity));
                        break;
                    case 11:
                        int i242 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().L.f83m).performClick();
                        break;
                    case 12:
                        int i252 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9886s.f83m).performClick();
                        break;
                    case 13:
                        int i262 = PreferencesActivity.T;
                        preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                        break;
                    case 14:
                        int i27 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9883p.f83m).performClick();
                        break;
                    case 15:
                        int i28 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().C.f83m).performClick();
                        break;
                    case 16:
                        int i29 = PreferencesActivity.T;
                        preferencesActivity.finish();
                        break;
                    default:
                        int i30 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().E.f83m).performClick();
                        break;
                }
            }
        });
        ((TextView) z0().f9890x.f7781l).setTypeface(c.f4882w);
        l.y(this, 2131951691, (TextView) z0().f9890x.f7781l).H.f9844n.setTypeface(c.f4882w);
        final int i27 = 6;
        l.y(this, 2131952491, z0().H.f9844n).H.f9841b.setOnClickListener(new View.OnClickListener(this) { // from class: d4.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f3589b;

            {
                this.f3589b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i27;
                PreferencesActivity preferencesActivity = this.f3589b;
                switch (i112) {
                    case 0:
                        int i122 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9884q.f83m).performClick();
                        break;
                    case 1:
                        int i132 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9887t.f83m).performClick();
                        break;
                    case 2:
                        int i142 = PreferencesActivity.T;
                        v vVar2 = new v();
                        vVar2.f7022a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                        int value = Year.now().getValue();
                        preferencesActivity.Q();
                        AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                        x xVar = new x();
                        u uVarC = u.c(preferencesActivity.getLayoutInflater());
                        ((TextView) uVarC.f5273r).setTypeface(f4.c.f4882w);
                        TextView textView2 = uVarC.f5271p;
                        textView2.setTypeface(f4.c.f4883x);
                        textView2.setText(preferencesActivity.getString(2131951671));
                        uVarC.f5270o.setTypeface(f4.c.f4883x);
                        EditText editText = uVarC.f5267l;
                        editText.setTypeface(f4.c.f4883x);
                        ((TextView) uVarC.f5272q).setTypeface(f4.c.f4883x);
                        TextView textView22 = uVarC.f5268m;
                        textView22.setTypeface(f4.c.f4882w);
                        TextView textView3 = uVarC.f5269n;
                        textView3.setTypeface(f4.c.f4882w);
                        int i152 = vVar2.f7022a;
                        if (i152 > 0) {
                            editText.setText(String.valueOf(i152));
                        }
                        textView22.setOnClickListener(new s4(uVarC, value, preferencesActivity, xVar));
                        z3.J(textView3);
                        textView3.setText(preferencesActivity.getString(2131952538));
                        textView3.setOnClickListener(new t(vVar2, uVarC, preferencesActivity, 10));
                        builder.setView(uVarC.f5266b);
                        builder.setCancelable(true);
                        AlertDialog alertDialogCreate = builder.create();
                        xVar.f7024a = alertDialogCreate;
                        if (alertDialogCreate != null) {
                            Window window = alertDialogCreate.getWindow();
                            if (window != null) {
                                a4.x.y(window, 0);
                            }
                            ((AlertDialog) xVar.f7024a).show();
                        }
                        break;
                    case 3:
                        int i162 = PreferencesActivity.T;
                        Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                        ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                        float f10 = UptodownApp.I;
                        activityResultLauncher.launch(intent, b4.d.b(preferencesActivity));
                        break;
                    case 4:
                        int i172 = PreferencesActivity.T;
                        float f11 = UptodownApp.I;
                        if (!b4.d.n(preferencesActivity)) {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), b4.d.a(preferencesActivity));
                        } else {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                        }
                        break;
                    case 5:
                        int i182 = PreferencesActivity.T;
                        Intent intent2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent2.putExtra("advanced_settings_title", preferencesActivity.getString(2131951662));
                        intent2.putExtra("advanced_settings_index", 3);
                        float f12 = UptodownApp.I;
                        preferencesActivity.startActivity(intent2, b4.d.a(preferencesActivity));
                        break;
                    case 6:
                        int i192 = PreferencesActivity.T;
                        Intent intent3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent3.putExtra("advanced_settings_title", preferencesActivity.getString(2131952660));
                        intent3.putExtra("advanced_settings_index", 0);
                        float f13 = UptodownApp.I;
                        preferencesActivity.startActivity(intent3, b4.d.a(preferencesActivity));
                        break;
                    case 7:
                        int i202 = PreferencesActivity.T;
                        Intent intent4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent4.putExtra("advanced_settings_title", preferencesActivity.getString(2131952632));
                        intent4.putExtra("advanced_settings_index", 1);
                        float f14 = UptodownApp.I;
                        preferencesActivity.startActivity(intent4, b4.d.a(preferencesActivity));
                        break;
                    case 8:
                        int i212 = PreferencesActivity.T;
                        String string22 = preferencesActivity.getString(2131952497);
                        string22.getClass();
                        String string222 = preferencesActivity.getString(2131952725);
                        string222.getClass();
                        j5.c.e(preferencesActivity, string222, string22);
                        break;
                    case 9:
                        int i222 = PreferencesActivity.T;
                        Intent intent5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent5.putExtra("advanced_settings_title", preferencesActivity.getString(2131951643));
                        intent5.putExtra("advanced_settings_index", 2);
                        float f15 = UptodownApp.I;
                        preferencesActivity.startActivity(intent5, b4.d.a(preferencesActivity));
                        break;
                    case 10:
                        int i232 = PreferencesActivity.T;
                        Intent intent6 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent6.putExtra("advanced_settings_title", preferencesActivity.getString(2131951646));
                        intent6.putExtra("advanced_settings_index", 4);
                        float f16 = UptodownApp.I;
                        preferencesActivity.startActivity(intent6, b4.d.a(preferencesActivity));
                        break;
                    case 11:
                        int i242 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().L.f83m).performClick();
                        break;
                    case 12:
                        int i252 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9886s.f83m).performClick();
                        break;
                    case 13:
                        int i262 = PreferencesActivity.T;
                        preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                        break;
                    case 14:
                        int i272 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9883p.f83m).performClick();
                        break;
                    case 15:
                        int i28 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().C.f83m).performClick();
                        break;
                    case 16:
                        int i29 = PreferencesActivity.T;
                        preferencesActivity.finish();
                        break;
                    default:
                        int i30 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().E.f83m).performClick();
                        break;
                }
            }
        });
        z0().F.f9844n.setTypeface(c.f4882w);
        final int i28 = 7;
        l.y(this, 2131952632, z0().F.f9844n).F.f9841b.setOnClickListener(new View.OnClickListener(this) { // from class: d4.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f3589b;

            {
                this.f3589b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i28;
                PreferencesActivity preferencesActivity = this.f3589b;
                switch (i112) {
                    case 0:
                        int i122 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9884q.f83m).performClick();
                        break;
                    case 1:
                        int i132 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9887t.f83m).performClick();
                        break;
                    case 2:
                        int i142 = PreferencesActivity.T;
                        v vVar2 = new v();
                        vVar2.f7022a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                        int value = Year.now().getValue();
                        preferencesActivity.Q();
                        AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                        x xVar = new x();
                        u uVarC = u.c(preferencesActivity.getLayoutInflater());
                        ((TextView) uVarC.f5273r).setTypeface(f4.c.f4882w);
                        TextView textView2 = uVarC.f5271p;
                        textView2.setTypeface(f4.c.f4883x);
                        textView2.setText(preferencesActivity.getString(2131951671));
                        uVarC.f5270o.setTypeface(f4.c.f4883x);
                        EditText editText = uVarC.f5267l;
                        editText.setTypeface(f4.c.f4883x);
                        ((TextView) uVarC.f5272q).setTypeface(f4.c.f4883x);
                        TextView textView22 = uVarC.f5268m;
                        textView22.setTypeface(f4.c.f4882w);
                        TextView textView3 = uVarC.f5269n;
                        textView3.setTypeface(f4.c.f4882w);
                        int i152 = vVar2.f7022a;
                        if (i152 > 0) {
                            editText.setText(String.valueOf(i152));
                        }
                        textView22.setOnClickListener(new s4(uVarC, value, preferencesActivity, xVar));
                        z3.J(textView3);
                        textView3.setText(preferencesActivity.getString(2131952538));
                        textView3.setOnClickListener(new t(vVar2, uVarC, preferencesActivity, 10));
                        builder.setView(uVarC.f5266b);
                        builder.setCancelable(true);
                        AlertDialog alertDialogCreate = builder.create();
                        xVar.f7024a = alertDialogCreate;
                        if (alertDialogCreate != null) {
                            Window window = alertDialogCreate.getWindow();
                            if (window != null) {
                                a4.x.y(window, 0);
                            }
                            ((AlertDialog) xVar.f7024a).show();
                        }
                        break;
                    case 3:
                        int i162 = PreferencesActivity.T;
                        Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                        ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                        float f10 = UptodownApp.I;
                        activityResultLauncher.launch(intent, b4.d.b(preferencesActivity));
                        break;
                    case 4:
                        int i172 = PreferencesActivity.T;
                        float f11 = UptodownApp.I;
                        if (!b4.d.n(preferencesActivity)) {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), b4.d.a(preferencesActivity));
                        } else {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                        }
                        break;
                    case 5:
                        int i182 = PreferencesActivity.T;
                        Intent intent2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent2.putExtra("advanced_settings_title", preferencesActivity.getString(2131951662));
                        intent2.putExtra("advanced_settings_index", 3);
                        float f12 = UptodownApp.I;
                        preferencesActivity.startActivity(intent2, b4.d.a(preferencesActivity));
                        break;
                    case 6:
                        int i192 = PreferencesActivity.T;
                        Intent intent3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent3.putExtra("advanced_settings_title", preferencesActivity.getString(2131952660));
                        intent3.putExtra("advanced_settings_index", 0);
                        float f13 = UptodownApp.I;
                        preferencesActivity.startActivity(intent3, b4.d.a(preferencesActivity));
                        break;
                    case 7:
                        int i202 = PreferencesActivity.T;
                        Intent intent4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent4.putExtra("advanced_settings_title", preferencesActivity.getString(2131952632));
                        intent4.putExtra("advanced_settings_index", 1);
                        float f14 = UptodownApp.I;
                        preferencesActivity.startActivity(intent4, b4.d.a(preferencesActivity));
                        break;
                    case 8:
                        int i212 = PreferencesActivity.T;
                        String string22 = preferencesActivity.getString(2131952497);
                        string22.getClass();
                        String string222 = preferencesActivity.getString(2131952725);
                        string222.getClass();
                        j5.c.e(preferencesActivity, string222, string22);
                        break;
                    case 9:
                        int i222 = PreferencesActivity.T;
                        Intent intent5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent5.putExtra("advanced_settings_title", preferencesActivity.getString(2131951643));
                        intent5.putExtra("advanced_settings_index", 2);
                        float f15 = UptodownApp.I;
                        preferencesActivity.startActivity(intent5, b4.d.a(preferencesActivity));
                        break;
                    case 10:
                        int i232 = PreferencesActivity.T;
                        Intent intent6 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent6.putExtra("advanced_settings_title", preferencesActivity.getString(2131951646));
                        intent6.putExtra("advanced_settings_index", 4);
                        float f16 = UptodownApp.I;
                        preferencesActivity.startActivity(intent6, b4.d.a(preferencesActivity));
                        break;
                    case 11:
                        int i242 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().L.f83m).performClick();
                        break;
                    case 12:
                        int i252 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9886s.f83m).performClick();
                        break;
                    case 13:
                        int i262 = PreferencesActivity.T;
                        preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                        break;
                    case 14:
                        int i272 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9883p.f83m).performClick();
                        break;
                    case 15:
                        int i282 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().C.f83m).performClick();
                        break;
                    case 16:
                        int i29 = PreferencesActivity.T;
                        preferencesActivity.finish();
                        break;
                    default:
                        int i30 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().E.f83m).performClick();
                        break;
                }
            }
        });
        z0().f9880m.f9844n.setTypeface(c.f4882w);
        l.y(this, 2131951663, z0().f9880m.f9844n).f9880m.f9841b.setOnClickListener(new View.OnClickListener(this) { // from class: d4.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f3589b;

            {
                this.f3589b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i19;
                PreferencesActivity preferencesActivity = this.f3589b;
                switch (i112) {
                    case 0:
                        int i122 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9884q.f83m).performClick();
                        break;
                    case 1:
                        int i132 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9887t.f83m).performClick();
                        break;
                    case 2:
                        int i142 = PreferencesActivity.T;
                        v vVar2 = new v();
                        vVar2.f7022a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                        int value = Year.now().getValue();
                        preferencesActivity.Q();
                        AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                        x xVar = new x();
                        u uVarC = u.c(preferencesActivity.getLayoutInflater());
                        ((TextView) uVarC.f5273r).setTypeface(f4.c.f4882w);
                        TextView textView2 = uVarC.f5271p;
                        textView2.setTypeface(f4.c.f4883x);
                        textView2.setText(preferencesActivity.getString(2131951671));
                        uVarC.f5270o.setTypeface(f4.c.f4883x);
                        EditText editText = uVarC.f5267l;
                        editText.setTypeface(f4.c.f4883x);
                        ((TextView) uVarC.f5272q).setTypeface(f4.c.f4883x);
                        TextView textView22 = uVarC.f5268m;
                        textView22.setTypeface(f4.c.f4882w);
                        TextView textView3 = uVarC.f5269n;
                        textView3.setTypeface(f4.c.f4882w);
                        int i152 = vVar2.f7022a;
                        if (i152 > 0) {
                            editText.setText(String.valueOf(i152));
                        }
                        textView22.setOnClickListener(new s4(uVarC, value, preferencesActivity, xVar));
                        z3.J(textView3);
                        textView3.setText(preferencesActivity.getString(2131952538));
                        textView3.setOnClickListener(new t(vVar2, uVarC, preferencesActivity, 10));
                        builder.setView(uVarC.f5266b);
                        builder.setCancelable(true);
                        AlertDialog alertDialogCreate = builder.create();
                        xVar.f7024a = alertDialogCreate;
                        if (alertDialogCreate != null) {
                            Window window = alertDialogCreate.getWindow();
                            if (window != null) {
                                a4.x.y(window, 0);
                            }
                            ((AlertDialog) xVar.f7024a).show();
                        }
                        break;
                    case 3:
                        int i162 = PreferencesActivity.T;
                        Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                        ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                        float f10 = UptodownApp.I;
                        activityResultLauncher.launch(intent, b4.d.b(preferencesActivity));
                        break;
                    case 4:
                        int i172 = PreferencesActivity.T;
                        float f11 = UptodownApp.I;
                        if (!b4.d.n(preferencesActivity)) {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), b4.d.a(preferencesActivity));
                        } else {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                        }
                        break;
                    case 5:
                        int i182 = PreferencesActivity.T;
                        Intent intent2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent2.putExtra("advanced_settings_title", preferencesActivity.getString(2131951662));
                        intent2.putExtra("advanced_settings_index", 3);
                        float f12 = UptodownApp.I;
                        preferencesActivity.startActivity(intent2, b4.d.a(preferencesActivity));
                        break;
                    case 6:
                        int i192 = PreferencesActivity.T;
                        Intent intent3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent3.putExtra("advanced_settings_title", preferencesActivity.getString(2131952660));
                        intent3.putExtra("advanced_settings_index", 0);
                        float f13 = UptodownApp.I;
                        preferencesActivity.startActivity(intent3, b4.d.a(preferencesActivity));
                        break;
                    case 7:
                        int i202 = PreferencesActivity.T;
                        Intent intent4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent4.putExtra("advanced_settings_title", preferencesActivity.getString(2131952632));
                        intent4.putExtra("advanced_settings_index", 1);
                        float f14 = UptodownApp.I;
                        preferencesActivity.startActivity(intent4, b4.d.a(preferencesActivity));
                        break;
                    case 8:
                        int i212 = PreferencesActivity.T;
                        String string22 = preferencesActivity.getString(2131952497);
                        string22.getClass();
                        String string222 = preferencesActivity.getString(2131952725);
                        string222.getClass();
                        j5.c.e(preferencesActivity, string222, string22);
                        break;
                    case 9:
                        int i222 = PreferencesActivity.T;
                        Intent intent5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent5.putExtra("advanced_settings_title", preferencesActivity.getString(2131951643));
                        intent5.putExtra("advanced_settings_index", 2);
                        float f15 = UptodownApp.I;
                        preferencesActivity.startActivity(intent5, b4.d.a(preferencesActivity));
                        break;
                    case 10:
                        int i232 = PreferencesActivity.T;
                        Intent intent6 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent6.putExtra("advanced_settings_title", preferencesActivity.getString(2131951646));
                        intent6.putExtra("advanced_settings_index", 4);
                        float f16 = UptodownApp.I;
                        preferencesActivity.startActivity(intent6, b4.d.a(preferencesActivity));
                        break;
                    case 11:
                        int i242 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().L.f83m).performClick();
                        break;
                    case 12:
                        int i252 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9886s.f83m).performClick();
                        break;
                    case 13:
                        int i262 = PreferencesActivity.T;
                        preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                        break;
                    case 14:
                        int i272 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9883p.f83m).performClick();
                        break;
                    case 15:
                        int i282 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().C.f83m).performClick();
                        break;
                    case 16:
                        int i29 = PreferencesActivity.T;
                        preferencesActivity.finish();
                        break;
                    default:
                        int i30 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().E.f83m).performClick();
                        break;
                }
            }
        });
        z0().f9878b.f9844n.setTypeface(c.f4882w);
        final int i29 = 9;
        l.y(this, 2131951643, z0().f9878b.f9844n).f9878b.f9841b.setOnClickListener(new View.OnClickListener(this) { // from class: d4.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f3589b;

            {
                this.f3589b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i29;
                PreferencesActivity preferencesActivity = this.f3589b;
                switch (i112) {
                    case 0:
                        int i122 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9884q.f83m).performClick();
                        break;
                    case 1:
                        int i132 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9887t.f83m).performClick();
                        break;
                    case 2:
                        int i142 = PreferencesActivity.T;
                        v vVar2 = new v();
                        vVar2.f7022a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                        int value = Year.now().getValue();
                        preferencesActivity.Q();
                        AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                        x xVar = new x();
                        u uVarC = u.c(preferencesActivity.getLayoutInflater());
                        ((TextView) uVarC.f5273r).setTypeface(f4.c.f4882w);
                        TextView textView2 = uVarC.f5271p;
                        textView2.setTypeface(f4.c.f4883x);
                        textView2.setText(preferencesActivity.getString(2131951671));
                        uVarC.f5270o.setTypeface(f4.c.f4883x);
                        EditText editText = uVarC.f5267l;
                        editText.setTypeface(f4.c.f4883x);
                        ((TextView) uVarC.f5272q).setTypeface(f4.c.f4883x);
                        TextView textView22 = uVarC.f5268m;
                        textView22.setTypeface(f4.c.f4882w);
                        TextView textView3 = uVarC.f5269n;
                        textView3.setTypeface(f4.c.f4882w);
                        int i152 = vVar2.f7022a;
                        if (i152 > 0) {
                            editText.setText(String.valueOf(i152));
                        }
                        textView22.setOnClickListener(new s4(uVarC, value, preferencesActivity, xVar));
                        z3.J(textView3);
                        textView3.setText(preferencesActivity.getString(2131952538));
                        textView3.setOnClickListener(new t(vVar2, uVarC, preferencesActivity, 10));
                        builder.setView(uVarC.f5266b);
                        builder.setCancelable(true);
                        AlertDialog alertDialogCreate = builder.create();
                        xVar.f7024a = alertDialogCreate;
                        if (alertDialogCreate != null) {
                            Window window = alertDialogCreate.getWindow();
                            if (window != null) {
                                a4.x.y(window, 0);
                            }
                            ((AlertDialog) xVar.f7024a).show();
                        }
                        break;
                    case 3:
                        int i162 = PreferencesActivity.T;
                        Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                        ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                        float f10 = UptodownApp.I;
                        activityResultLauncher.launch(intent, b4.d.b(preferencesActivity));
                        break;
                    case 4:
                        int i172 = PreferencesActivity.T;
                        float f11 = UptodownApp.I;
                        if (!b4.d.n(preferencesActivity)) {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), b4.d.a(preferencesActivity));
                        } else {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                        }
                        break;
                    case 5:
                        int i182 = PreferencesActivity.T;
                        Intent intent2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent2.putExtra("advanced_settings_title", preferencesActivity.getString(2131951662));
                        intent2.putExtra("advanced_settings_index", 3);
                        float f12 = UptodownApp.I;
                        preferencesActivity.startActivity(intent2, b4.d.a(preferencesActivity));
                        break;
                    case 6:
                        int i192 = PreferencesActivity.T;
                        Intent intent3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent3.putExtra("advanced_settings_title", preferencesActivity.getString(2131952660));
                        intent3.putExtra("advanced_settings_index", 0);
                        float f13 = UptodownApp.I;
                        preferencesActivity.startActivity(intent3, b4.d.a(preferencesActivity));
                        break;
                    case 7:
                        int i202 = PreferencesActivity.T;
                        Intent intent4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent4.putExtra("advanced_settings_title", preferencesActivity.getString(2131952632));
                        intent4.putExtra("advanced_settings_index", 1);
                        float f14 = UptodownApp.I;
                        preferencesActivity.startActivity(intent4, b4.d.a(preferencesActivity));
                        break;
                    case 8:
                        int i212 = PreferencesActivity.T;
                        String string22 = preferencesActivity.getString(2131952497);
                        string22.getClass();
                        String string222 = preferencesActivity.getString(2131952725);
                        string222.getClass();
                        j5.c.e(preferencesActivity, string222, string22);
                        break;
                    case 9:
                        int i222 = PreferencesActivity.T;
                        Intent intent5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent5.putExtra("advanced_settings_title", preferencesActivity.getString(2131951643));
                        intent5.putExtra("advanced_settings_index", 2);
                        float f15 = UptodownApp.I;
                        preferencesActivity.startActivity(intent5, b4.d.a(preferencesActivity));
                        break;
                    case 10:
                        int i232 = PreferencesActivity.T;
                        Intent intent6 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent6.putExtra("advanced_settings_title", preferencesActivity.getString(2131951646));
                        intent6.putExtra("advanced_settings_index", 4);
                        float f16 = UptodownApp.I;
                        preferencesActivity.startActivity(intent6, b4.d.a(preferencesActivity));
                        break;
                    case 11:
                        int i242 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().L.f83m).performClick();
                        break;
                    case 12:
                        int i252 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9886s.f83m).performClick();
                        break;
                    case 13:
                        int i262 = PreferencesActivity.T;
                        preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                        break;
                    case 14:
                        int i272 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9883p.f83m).performClick();
                        break;
                    case 15:
                        int i282 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().C.f83m).performClick();
                        break;
                    case 16:
                        int i292 = PreferencesActivity.T;
                        preferencesActivity.finish();
                        break;
                    default:
                        int i30 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().E.f83m).performClick();
                        break;
                }
            }
        });
        z0().f9879l.f9844n.setTypeface(c.f4882w);
        final int i30 = 10;
        l.y(this, 2131951646, z0().f9879l.f9844n).f9879l.f9841b.setOnClickListener(new View.OnClickListener(this) { // from class: d4.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f3589b;

            {
                this.f3589b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i30;
                PreferencesActivity preferencesActivity = this.f3589b;
                switch (i112) {
                    case 0:
                        int i122 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9884q.f83m).performClick();
                        break;
                    case 1:
                        int i132 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9887t.f83m).performClick();
                        break;
                    case 2:
                        int i142 = PreferencesActivity.T;
                        v vVar2 = new v();
                        vVar2.f7022a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                        int value = Year.now().getValue();
                        preferencesActivity.Q();
                        AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                        x xVar = new x();
                        u uVarC = u.c(preferencesActivity.getLayoutInflater());
                        ((TextView) uVarC.f5273r).setTypeface(f4.c.f4882w);
                        TextView textView2 = uVarC.f5271p;
                        textView2.setTypeface(f4.c.f4883x);
                        textView2.setText(preferencesActivity.getString(2131951671));
                        uVarC.f5270o.setTypeface(f4.c.f4883x);
                        EditText editText = uVarC.f5267l;
                        editText.setTypeface(f4.c.f4883x);
                        ((TextView) uVarC.f5272q).setTypeface(f4.c.f4883x);
                        TextView textView22 = uVarC.f5268m;
                        textView22.setTypeface(f4.c.f4882w);
                        TextView textView3 = uVarC.f5269n;
                        textView3.setTypeface(f4.c.f4882w);
                        int i152 = vVar2.f7022a;
                        if (i152 > 0) {
                            editText.setText(String.valueOf(i152));
                        }
                        textView22.setOnClickListener(new s4(uVarC, value, preferencesActivity, xVar));
                        z3.J(textView3);
                        textView3.setText(preferencesActivity.getString(2131952538));
                        textView3.setOnClickListener(new t(vVar2, uVarC, preferencesActivity, 10));
                        builder.setView(uVarC.f5266b);
                        builder.setCancelable(true);
                        AlertDialog alertDialogCreate = builder.create();
                        xVar.f7024a = alertDialogCreate;
                        if (alertDialogCreate != null) {
                            Window window = alertDialogCreate.getWindow();
                            if (window != null) {
                                a4.x.y(window, 0);
                            }
                            ((AlertDialog) xVar.f7024a).show();
                        }
                        break;
                    case 3:
                        int i162 = PreferencesActivity.T;
                        Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                        ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                        float f10 = UptodownApp.I;
                        activityResultLauncher.launch(intent, b4.d.b(preferencesActivity));
                        break;
                    case 4:
                        int i172 = PreferencesActivity.T;
                        float f11 = UptodownApp.I;
                        if (!b4.d.n(preferencesActivity)) {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), b4.d.a(preferencesActivity));
                        } else {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                        }
                        break;
                    case 5:
                        int i182 = PreferencesActivity.T;
                        Intent intent2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent2.putExtra("advanced_settings_title", preferencesActivity.getString(2131951662));
                        intent2.putExtra("advanced_settings_index", 3);
                        float f12 = UptodownApp.I;
                        preferencesActivity.startActivity(intent2, b4.d.a(preferencesActivity));
                        break;
                    case 6:
                        int i192 = PreferencesActivity.T;
                        Intent intent3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent3.putExtra("advanced_settings_title", preferencesActivity.getString(2131952660));
                        intent3.putExtra("advanced_settings_index", 0);
                        float f13 = UptodownApp.I;
                        preferencesActivity.startActivity(intent3, b4.d.a(preferencesActivity));
                        break;
                    case 7:
                        int i202 = PreferencesActivity.T;
                        Intent intent4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent4.putExtra("advanced_settings_title", preferencesActivity.getString(2131952632));
                        intent4.putExtra("advanced_settings_index", 1);
                        float f14 = UptodownApp.I;
                        preferencesActivity.startActivity(intent4, b4.d.a(preferencesActivity));
                        break;
                    case 8:
                        int i212 = PreferencesActivity.T;
                        String string22 = preferencesActivity.getString(2131952497);
                        string22.getClass();
                        String string222 = preferencesActivity.getString(2131952725);
                        string222.getClass();
                        j5.c.e(preferencesActivity, string222, string22);
                        break;
                    case 9:
                        int i222 = PreferencesActivity.T;
                        Intent intent5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent5.putExtra("advanced_settings_title", preferencesActivity.getString(2131951643));
                        intent5.putExtra("advanced_settings_index", 2);
                        float f15 = UptodownApp.I;
                        preferencesActivity.startActivity(intent5, b4.d.a(preferencesActivity));
                        break;
                    case 10:
                        int i232 = PreferencesActivity.T;
                        Intent intent6 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesActivity.class);
                        intent6.putExtra("advanced_settings_title", preferencesActivity.getString(2131951646));
                        intent6.putExtra("advanced_settings_index", 4);
                        float f16 = UptodownApp.I;
                        preferencesActivity.startActivity(intent6, b4.d.a(preferencesActivity));
                        break;
                    case 11:
                        int i242 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().L.f83m).performClick();
                        break;
                    case 12:
                        int i252 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9886s.f83m).performClick();
                        break;
                    case 13:
                        int i262 = PreferencesActivity.T;
                        preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                        break;
                    case 14:
                        int i272 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().f9883p.f83m).performClick();
                        break;
                    case 15:
                        int i282 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().C.f83m).performClick();
                        break;
                    case 16:
                        int i292 = PreferencesActivity.T;
                        preferencesActivity.finish();
                        break;
                    default:
                        int i302 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.z0().E.f83m).performClick();
                        break;
                }
            }
        });
    }

    public final void y0(String str, HashMap map, int i, d7.l lVar) {
        AlertDialog alertDialog;
        if (isFinishing()) {
            return;
        }
        AlertDialog alertDialog2 = this.F;
        if (alertDialog2 != null) {
            alertDialog2.dismiss();
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        s sVarX = s.x(getLayoutInflater());
        TextView textView = (TextView) sVarX.f11757m;
        TextView textView2 = (TextView) sVarX.f11758n;
        v vVar = new v();
        vVar.f7022a = i;
        textView2.setTypeface(c.f4882w);
        textView2.setText(str);
        for (Map.Entry entry : map.entrySet()) {
            View viewInflate = getLayoutInflater().inflate(2131558819, (ViewGroup) null, false);
            if (viewInflate == null) {
                com.google.gson.internal.a.i("rootView");
                return;
            }
            RadioButton radioButton = (RadioButton) viewInflate;
            radioButton.setId(((Number) entry.getKey()).intValue());
            radioButton.setTypeface(c.f4883x);
            radioButton.setText((CharSequence) entry.getValue());
            radioButton.setOnClickListener(new e(22, vVar, entry));
            if (((Number) entry.getKey()).intValue() == i) {
                radioButton.setChecked(true);
            }
            ((RadioGroup) sVarX.f11756l).addView(radioButton);
        }
        textView.setTypeface(c.f4882w);
        textView.setOnClickListener(new t(lVar, vVar, this, 11));
        builder.setView((LinearLayout) sVarX.f11755b);
        this.F = builder.create();
        if (isFinishing() || (alertDialog = this.F) == null) {
            return;
        }
        alertDialog.setCancelable(true);
        u0();
    }

    public final i0 z0() {
        return (i0) this.O.getValue();
    }
}
