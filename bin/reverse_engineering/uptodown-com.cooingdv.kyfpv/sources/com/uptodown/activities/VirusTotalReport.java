package com.uptodown.activities;

import a4.g0;
import a4.l0;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.viewbinding.ViewBindings;
import b.s;
import b4.d;
import c4.jd;
import c4.k0;
import c4.ld;
import c4.md;
import c4.nd;
import c4.od;
import c4.w6;
import com.google.gson.internal.a;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.VirusTotalReport;
import f4.c;
import j$.util.concurrent.ConcurrentHashMap;
import j5.t;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.y;
import o7.a0;
import o7.c0;
import o7.m0;
import p6.m;
import r7.o0;
import t4.j1;
import t4.t0;
import t7.n;
import x4.e;
import x4.f2;
import x4.g;
import x4.g1;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class VirusTotalReport extends k0 {
    public static final /* synthetic */ int Q = 0;
    public final m O = new m(new w6(this, 15));
    public final ViewModelLazy P = new ViewModelLazy(y.a(od.class), new md(this, 0), new ld(this), new md(this, 1));

    public final void A0() {
        f2 f2Var = (f2) z0().f1971e.getValue();
        String str = f2Var != null ? f2Var.f11152a : null;
        if (str == null || str.length() == 0) {
            g gVar = (g) z0().f1969c.getValue();
            String str2 = gVar != null ? gVar.P : null;
            if (str2 == null || str2.length() == 0) {
                y0().f9913l.setVisibility(8);
            } else {
                TextView textView = y0().v;
                Object value = z0().f1969c.getValue();
                value.getClass();
                textView.setText(((g) value).P);
            }
        } else {
            TextView textView2 = y0().v;
            Object value2 = z0().f1971e.getValue();
            value2.getClass();
            textView2.setText(((f2) value2).f11152a);
        }
        g gVar2 = (g) z0().f1969c.getValue();
        String str3 = gVar2 != null ? gVar2.M : null;
        if (str3 == null || str3.length() == 0) {
            e eVar = (e) z0().f1970d.getValue();
            String str4 = eVar != null ? eVar.f11133u : null;
            if (str4 == null || str4.length() == 0) {
                y0().f9914m.setVisibility(8);
            } else {
                TextView textView3 = y0().f9924x;
                e eVar2 = (e) z0().f1970d.getValue();
                textView3.setText(eVar2 != null ? eVar2.f11133u : null);
            }
        } else {
            TextView textView4 = y0().f9924x;
            g gVar3 = (g) z0().f1969c.getValue();
            textView4.setText(gVar3 != null ? gVar3.M : null);
        }
        if (y0().f9913l.getVisibility() == 0) {
            final int i = 0;
            y0().f9913l.setOnClickListener(new jd(this, i));
            y0().f9913l.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: c4.kd

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ VirusTotalReport f1807b;

                {
                    this.f1807b = this;
                }

                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    int i6 = i;
                    VirusTotalReport virusTotalReport = this.f1807b;
                    switch (i6) {
                        case 0:
                            int i10 = VirusTotalReport.Q;
                            String string = virusTotalReport.y0().v.getText().toString();
                            if (string != null && string.length() != 0) {
                                Object systemService = virusTotalReport.getSystemService("clipboard");
                                systemService.getClass();
                                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(null, string));
                            }
                            break;
                        default:
                            int i11 = VirusTotalReport.Q;
                            String string2 = virusTotalReport.y0().f9924x.getText().toString();
                            if (string2 != null && string2.length() != 0) {
                                Object systemService2 = virusTotalReport.getSystemService("clipboard");
                                systemService2.getClass();
                                ((ClipboardManager) systemService2).setPrimaryClip(ClipData.newPlainText(null, string2));
                            }
                            break;
                    }
                    return true;
                }
            });
        }
        if (y0().f9914m.getVisibility() == 0) {
            final int i6 = 1;
            y0().f9914m.setOnClickListener(new jd(this, i6));
            y0().f9914m.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: c4.kd

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ VirusTotalReport f1807b;

                {
                    this.f1807b = this;
                }

                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    int i62 = i6;
                    VirusTotalReport virusTotalReport = this.f1807b;
                    switch (i62) {
                        case 0:
                            int i10 = VirusTotalReport.Q;
                            String string = virusTotalReport.y0().v.getText().toString();
                            if (string != null && string.length() != 0) {
                                Object systemService = virusTotalReport.getSystemService("clipboard");
                                systemService.getClass();
                                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(null, string));
                            }
                            break;
                        default:
                            int i11 = VirusTotalReport.Q;
                            String string2 = virusTotalReport.y0().f9924x.getText().toString();
                            if (string2 != null && string2.length() != 0) {
                                Object systemService2 = virusTotalReport.getSystemService("clipboard");
                                systemService2.getClass();
                                ((ClipboardManager) systemService2).setPrimaryClip(ClipData.newPlainText(null, string2));
                            }
                            break;
                    }
                    return true;
                }
            });
        }
        y0().f9915n.setVisibility(8);
    }

    public final void B0() {
        y0().f9923w.setVisibility(8);
        y0().f9924x.setVisibility(8);
        y0().f9921t.setText(getString(R.string.vt_report_not_available_check_on));
        y0().v.setText(getString(R.string.vt_report_not_available_pending));
        y0().f9915n.setVisibility(8);
    }

    public final void C0() {
        View viewInflate = getLayoutInflater().inflate(R.layout.virus_total_report_not_available, (ViewGroup) null, false);
        int i = R.id.iv_vt_not_available;
        if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.iv_vt_not_available)) != null) {
            i = R.id.ll_vt_not_available_origin;
            if (((LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.ll_vt_not_available_origin)) != null) {
                i = R.id.ll_vt_not_available_review;
                if (((LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.ll_vt_not_available_review)) != null) {
                    i = R.id.ll_vt_not_available_scan;
                    if (((LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.ll_vt_not_available_scan)) != null) {
                        i = R.id.tv_vt_not_available_about;
                        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_vt_not_available_about);
                        if (textView != null) {
                            i = R.id.tv_vt_not_available_origin;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_vt_not_available_origin);
                            if (textView2 != null) {
                                i = R.id.tv_vt_not_available_review;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_vt_not_available_review);
                                if (textView3 != null) {
                                    i = R.id.tv_vt_not_available_scan;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_vt_not_available_scan);
                                    if (textView4 != null) {
                                        i = R.id.tv_vt_not_available_subtitle;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_vt_not_available_subtitle);
                                        if (textView5 != null) {
                                            i = R.id.tv_vt_not_available_title;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_vt_not_available_title);
                                            if (textView6 != null) {
                                                textView6.setTypeface(c.f4883w);
                                                textView5.setTypeface(c.f4884x);
                                                textView.setTypeface(c.f4884x);
                                                textView3.setTypeface(c.f4884x);
                                                textView2.setTypeface(c.f4884x);
                                                textView4.setTypeface(c.f4884x);
                                                y0().f9918q.addView((LinearLayout) viewInflate);
                                                return;
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
        a.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    public final void D0(f2 f2Var) {
        View viewInflate = getLayoutInflater().inflate(R.layout.virus_total_report_safe, (ViewGroup) null, false);
        int i = R.id.flow_vt_safe_items;
        if (((Flow) ViewBindings.findChildViewById(viewInflate, R.id.flow_vt_safe_items)) != null) {
            i = R.id.iv_vt_safe;
            if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.iv_vt_safe)) != null) {
                i = R.id.ll_vt_safe_malware;
                if (((LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.ll_vt_safe_malware)) != null) {
                    i = R.id.ll_vt_safe_spyware;
                    if (((LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.ll_vt_safe_spyware)) != null) {
                        i = R.id.ll_vt_safe_virus;
                        if (((LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.ll_vt_safe_virus)) != null) {
                            i = R.id.tv_vt_safe_certified;
                            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_vt_safe_certified);
                            if (textView != null) {
                                i = R.id.tv_vt_safe_latest_scan_title;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_vt_safe_latest_scan_title);
                                if (textView2 != null) {
                                    i = R.id.tv_vt_safe_malware;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_vt_safe_malware);
                                    if (textView3 != null) {
                                        i = R.id.tv_vt_safe_spyware;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_vt_safe_spyware);
                                        if (textView4 != null) {
                                            i = R.id.tv_vt_safe_subtitle;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_vt_safe_subtitle);
                                            if (textView5 != null) {
                                                i = R.id.tv_vt_safe_title;
                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_vt_safe_title);
                                                if (textView6 != null) {
                                                    i = R.id.tv_vt_safe_virus;
                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_vt_safe_virus);
                                                    if (textView7 != null) {
                                                        LinearLayout linearLayout = (LinearLayout) viewInflate;
                                                        textView6.setTypeface(c.f4883w);
                                                        textView5.setTypeface(c.f4884x);
                                                        textView2.setTypeface(c.f4884x);
                                                        textView.setTypeface(c.f4884x);
                                                        textView7.setTypeface(c.f4883w);
                                                        textView4.setTypeface(c.f4883w);
                                                        textView3.setTypeface(c.f4883w);
                                                        int i6 = f2Var.f11154l;
                                                        if (i6 > 0) {
                                                            textView5.setText(getString(R.string.vt_report_safe_subtitle, String.valueOf(i6)));
                                                        } else {
                                                            textView5.setVisibility(8);
                                                        }
                                                        textView2.setText(getString(R.string.virustotal_report_previous_scan, f2Var.f11156n));
                                                        y0().f9918q.addView(linearLayout);
                                                        return;
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
        a.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    public final void E0(f2 f2Var) {
        Object obj = null;
        View viewInflate = getLayoutInflater().inflate(R.layout.virus_total_report_warning, (ViewGroup) null, false);
        int i = R.id.iv_vt_warning;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.iv_vt_warning);
        if (imageView != null) {
            i = R.id.ll_vt_warning_positives;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.ll_vt_warning_positives);
            if (linearLayout != null) {
                i = R.id.rl_vt_warning_header;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(viewInflate, R.id.rl_vt_warning_header);
                if (relativeLayout != null) {
                    i = R.id.tv_vt_warning_about;
                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_vt_warning_about);
                    if (textView != null) {
                        i = R.id.tv_vt_warning_latest_scan_title;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_vt_warning_latest_scan_title);
                        if (textView2 != null) {
                            i = R.id.tv_vt_warning_subtitle;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_vt_warning_subtitle);
                            if (textView3 != null) {
                                i = R.id.tv_vt_warning_title;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_vt_warning_title);
                                if (textView4 != null) {
                                    LinearLayout linearLayout2 = (LinearLayout) viewInflate;
                                    textView4.setTypeface(c.f4883w);
                                    textView3.setTypeface(c.f4884x);
                                    textView2.setTypeface(c.f4884x);
                                    textView.setTypeface(c.f4884x);
                                    textView3.setText(getString(R.string.vt_report_warning_subtitle, String.valueOf(f2Var.f11155m), String.valueOf(f2Var.f11154l)));
                                    textView2.setText(getString(R.string.virustotal_report_previous_scan, f2Var.f11156n));
                                    ArrayList arrayList = f2Var.f11157o;
                                    if (arrayList != null && !arrayList.isEmpty()) {
                                        ArrayList arrayList2 = f2Var.f11157o;
                                        arrayList2.getClass();
                                        int size = arrayList2.size();
                                        int i6 = 0;
                                        while (true) {
                                            if (i6 >= size) {
                                                break;
                                            }
                                            Object obj2 = arrayList2.get(i6);
                                            i6++;
                                            g1 g1Var = (g1) obj2;
                                            if (g1Var.f11202l == 0 && g1Var.f11203m == 0) {
                                                obj = obj2;
                                                break;
                                            }
                                        }
                                        if (((g1) obj) != null) {
                                            relativeLayout.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_bg_virustotal_warning_red));
                                            imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.vector_vt_report_warning_red));
                                        }
                                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                                        layoutParams.setMargins((int) getResources().getDimension(R.dimen.margin_s), (int) getResources().getDimension(R.dimen.margin_m), 0, 0);
                                        Iterator it = f2Var.f11157o.iterator();
                                        it.getClass();
                                        while (it.hasNext()) {
                                            Object next = it.next();
                                            next.getClass();
                                            g1 g1Var2 = (g1) next;
                                            t0 t0VarA = t0.a(getLayoutInflater());
                                            TextView textView5 = t0VarA.f10127l;
                                            TextView textView6 = t0VarA.f10128m;
                                            RelativeLayout relativeLayout2 = t0VarA.f10126b;
                                            TextView textView7 = t0VarA.f10129n;
                                            relativeLayout2.setLayoutParams(layoutParams);
                                            textView6.setTypeface(c.f4883w);
                                            textView6.setText(g1Var2.f11201b);
                                            textView5.setTypeface(c.f4884x);
                                            textView5.setText(g1Var2.f11200a);
                                            textView7.setTypeface(c.f4883w);
                                            if (g1Var2.f11202l == 1) {
                                                textView7.setText(getString(R.string.pup));
                                            } else if (g1Var2.f11203m == 1) {
                                                textView7.setText(getString(R.string.adware));
                                            } else {
                                                t0VarA.f10130o.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_circular_red));
                                                textView7.setText(getString(R.string.malware));
                                                textView7.setTextColor(ContextCompat.getColor(this, R.color.white));
                                                textView7.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_bg_accent_red));
                                            }
                                            linearLayout.addView(relativeLayout2);
                                        }
                                    }
                                    y0().f9918q.addView(linearLayout2);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        a.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // c4.k0, g4.h, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = y0().f9911a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        Intent intent = getIntent();
        t6.c cVar = null;
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null && extras.containsKey("appInfo")) {
                z0().f1969c.f(Build.VERSION.SDK_INT >= 34 ? (Parcelable) extras.getParcelable("appInfo", g.class) : extras.getParcelable("appInfo"));
            }
            if (extras != null && extras.containsKey("app_selected")) {
                z0().f1970d.f(Build.VERSION.SDK_INT >= 34 ? (Parcelable) extras.getParcelable("app_selected", e.class) : extras.getParcelable("app_selected"));
            }
            if (extras != null && extras.containsKey("old_version_name")) {
                z0().f.f(extras.getString("old_version_name"));
            }
            if (extras != null && extras.containsKey("oldVersionId")) {
                o0 o0Var = z0().h;
                Boolean bool = Boolean.TRUE;
                o0Var.getClass();
                o0Var.g(null, bool);
                o0 o0Var2 = z0().g;
                Long lValueOf = Long.valueOf(extras.getLong("oldVersionId"));
                o0Var2.getClass();
                o0Var2.g(null, lValueOf);
            }
            if (extras != null && extras.containsKey("appReportVT")) {
                z0().f1971e.f(Build.VERSION.SDK_INT >= 34 ? (Parcelable) extras.getParcelable("appReportVT", f2.class) : extras.getParcelable("appReportVT"));
            }
            if (extras != null && extras.containsKey("isVirusTotalReportAvaialable")) {
                o0 o0Var3 = z0().i;
                Boolean boolValueOf = Boolean.valueOf(extras.getBoolean("isVirusTotalReportAvaialable"));
                o0Var3.getClass();
                o0Var3.g(null, boolValueOf);
            }
        }
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.core_vector_back);
        if (drawable != null) {
            y0().f9919r.setNavigationIcon(drawable);
            y0().f9919r.setNavigationContentDescription(getString(R.string.back));
        }
        y0().f9919r.setNavigationOnClickListener(new jd(this, 2));
        y0().f9925y.setTypeface(c.f4883w);
        if (z0().f1969c.getValue() != null) {
            Object value = z0().f1969c.getValue();
            value.getClass();
            String strI = ((g) value).i();
            if (strI == null || strI.length() == 0) {
                ((ImageView) y0().f9912b.f82l).setImageDrawable(ContextCompat.getDrawable(this, R.drawable.vector_app_icon_placeholder));
            } else {
                g0 g0VarD = g0.d();
                Object value2 = z0().f1969c.getValue();
                value2.getClass();
                l0 l0VarE = g0VarD.e(((g) value2).i());
                float f = UptodownApp.I;
                l0VarE.h(d.x(this));
                l0VarE.e((ImageView) y0().f9912b.f82l, null);
            }
        } else if (z0().f1970d.getValue() != null) {
            ConcurrentHashMap concurrentHashMap = t.f6709a;
            Object value3 = z0().f1970d.getValue();
            value3.getClass();
            ((ImageView) y0().f9912b.f82l).setImageDrawable(t.b(this, ((e) value3).f11124l));
        }
        ((TextView) y0().f9912b.f84n).setTypeface(c.f4883w);
        if (z0().f1969c.getValue() != null) {
            TextView textView = (TextView) y0().f9912b.f84n;
            Object value4 = z0().f1969c.getValue();
            value4.getClass();
            textView.setText(((g) value4).f11160b);
        } else if (z0().f1970d.getValue() != null) {
            TextView textView2 = (TextView) y0().f9912b.f84n;
            Object value5 = z0().f1970d.getValue();
            value5.getClass();
            textView2.setText(((e) value5).f11123b);
        }
        ((TextView) y0().f9912b.f85o).setTypeface(c.f4884x);
        CharSequence charSequence = (CharSequence) z0().f.getValue();
        if (charSequence != null && charSequence.length() != 0) {
            ((TextView) y0().f9912b.f85o).setText((CharSequence) z0().f.getValue());
        } else if (z0().f1969c.getValue() != null) {
            TextView textView3 = (TextView) y0().f9912b.f85o;
            Object value6 = z0().f1969c.getValue();
            value6.getClass();
            textView3.setText(((g) value6).f11171l);
        } else if (z0().f1970d.getValue() != null) {
            TextView textView4 = (TextView) y0().f9912b.f85o;
            Object value7 = z0().f1970d.getValue();
            value7.getClass();
            textView4.setText(((e) value7).f11126n);
        }
        if (z0().f1969c.getValue() != null) {
            Object value8 = z0().f1969c.getValue();
            value8.getClass();
            String str = ((g) value8).f11191w;
            if (str != null && str.length() != 0) {
                ((TextView) y0().f9912b.f83m).setTypeface(c.f4884x);
                ((TextView) y0().f9912b.f83m).setVisibility(0);
                TextView textView5 = (TextView) y0().f9912b.f83m;
                Object value9 = z0().f1969c.getValue();
                value9.getClass();
                textView5.setText(((g) value9).f11191w);
            }
        }
        y0().f9921t.setTypeface(c.f4884x);
        y0().f9920s.setTypeface(c.f4883w);
        y0().f9920s.setOnClickListener(new jd(this, 3));
        y0().A.setTypeface(c.f4883w);
        y0().f9926z.setTypeface(c.f4884x);
        y0().f9916o.setOnClickListener(new jd(this, 4));
        y0().C.setTypeface(c.f4883w);
        y0().B.setTypeface(c.f4884x);
        y0().f9917p.setOnClickListener(new jd(this, 5));
        y0().v.setTypeface(c.f4884x);
        y0().f9922u.setTypeface(c.f4883w);
        y0().f9924x.setTypeface(c.f4884x);
        y0().f9923w.setTypeface(c.f4883w);
        y0().f9915n.setOnClickListener(new c4.e(24));
        if (z0().f1971e.getValue() != null) {
            A0();
            Object value10 = z0().f1971e.getValue();
            value10.getClass();
            ArrayList arrayList = ((f2) value10).f11157o;
            if (arrayList == null || arrayList.isEmpty()) {
                Object value11 = z0().f1971e.getValue();
                value11.getClass();
                D0((f2) value11);
            } else {
                Object value12 = z0().f1971e.getValue();
                value12.getClass();
                E0((f2) value12);
            }
        } else {
            if (((Boolean) z0().i.getValue()).booleanValue()) {
                od odVarZ0 = z0();
                Object value13 = z0().f1969c.getValue();
                value13.getClass();
                long j = ((g) value13).J;
                long jLongValue = ((Number) z0().g.getValue()).longValue();
                boolean zBooleanValue = ((Boolean) z0().h.getValue()).booleanValue();
                odVarZ0.getClass();
                a0 viewModelScope = ViewModelKt.getViewModelScope(odVarZ0);
                v7.e eVar = m0.f8289a;
                c0.s(viewModelScope, v7.d.f10885a, null, new nd(odVarZ0, zBooleanValue, j, jLongValue, this, null), 2);
                c0.s(LifecycleOwnerKt.getLifecycleScope(this), n.f10349a, null, new s(this, cVar, 18), 2);
            }
            C0();
            B0();
        }
        c0.s(LifecycleOwnerKt.getLifecycleScope(this), n.f10349a, null, new s(this, cVar, 18), 2);
    }

    public final j1 y0() {
        return (j1) this.O.getValue();
    }

    public final od z0() {
        return (od) this.P.getValue();
    }
}
