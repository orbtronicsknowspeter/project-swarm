package com.uptodown.activities;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.ContextCompat;
import androidx.room.g;
import b4.d;
import c4.k0;
import c4.s1;
import com.google.android.gms.internal.measurement.z3;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.GdprPrivacySettings;
import f4.c;
import p6.m;
import t4.l1;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class GdprPrivacySettings extends k0 {
    public static final /* synthetic */ int P = 0;
    public final m O = new m(new g(this, 17));

    public final void A0() {
        if (y0().f9987s.getVisibility() == 0) {
            y0().f9985q.setText(R.string.save);
            y0().f9985q.setOnClickListener(new s1(this, 5));
            y0().f9987s.setVisibility(8);
        }
    }

    public final void B0(SwitchCompat switchCompat, TextView textView, boolean z9) {
        if (z9) {
            switchCompat.setTextColor(ContextCompat.getColor(this, R.color.text_primary));
            textView.setTextColor(ContextCompat.getColor(this, R.color.text_primary));
        } else {
            switchCompat.setTextColor(ContextCompat.getColor(this, R.color.main_light_grey));
            textView.setTextColor(ContextCompat.getColor(this, R.color.main_light_grey));
        }
    }

    @Override // c4.k0, g4.h, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = y0().f9978a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        final int i = 0;
        y0().f9979b.setOnClickListener(new s1(this, i));
        y0().f9992y.setTypeface(c.f4883w);
        y0().E.setTypeface(c.f4883w);
        y0().f9986r.setTypeface(c.f4884x);
        y0().B.setTypeface(c.f4883w);
        y0().v.setTypeface(c.f4884x);
        y0().A.setTypeface(c.f4883w);
        y0().f9989u.setTypeface(c.f4884x);
        y0().C.setTypeface(c.f4883w);
        y0().f9990w.setTypeface(c.f4884x);
        y0().f9993z.setTypeface(c.f4883w);
        y0().f9988t.setTypeface(c.f4884x);
        y0().D.setTypeface(c.f4883w);
        y0().f9991x.setTypeface(c.f4884x);
        y0().f9985q.setTypeface(c.f4883w);
        y0().f9987s.setTypeface(c.f4883w);
        y0().F.setText("⚠ " + getString(R.string.tracking_disabled_warning_gdpr) + " ⚠");
        y0().F.setTypeface(c.f4884x);
        y0().f9982n.setChecked(z3.p(this, "gdpr_analytics_allowed", false));
        y0().f9984p.setChecked(z3.p(this, "gdpr_crashlytics_allowed", false));
        y0().f9983o.setChecked(z3.p(this, "gdpr_tracking_allowed", false));
        final int i6 = 1;
        if (z3.p(this, "gdpr_requested", false)) {
            B0(y0().f9982n, y0().f9989u, y0().f9982n.isChecked());
            B0(y0().f9984p, y0().f9990w, y0().f9984p.isChecked());
            B0(y0().f9983o, y0().v, y0().f9983o.isChecked());
        } else {
            B0(y0().f9982n, y0().f9989u, true);
            B0(y0().f9984p, y0().f9990w, true);
            B0(y0().f9983o, y0().v, true);
            y0().f9982n.setChecked(true);
            y0().f9984p.setChecked(true);
            y0().f9983o.setChecked(true);
        }
        if (y0().f9983o.isChecked()) {
            y0().F.setVisibility(8);
        } else {
            y0().F.setVisibility(0);
        }
        y0().f9982n.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: c4.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GdprPrivacySettings f2111b;

            {
                this.f2111b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
                int i10 = i;
                GdprPrivacySettings gdprPrivacySettings = this.f2111b;
                switch (i10) {
                    case 0:
                        int i11 = GdprPrivacySettings.P;
                        gdprPrivacySettings.B0(gdprPrivacySettings.y0().f9982n, gdprPrivacySettings.y0().f9989u, z9);
                        gdprPrivacySettings.A0();
                        break;
                    case 1:
                        int i12 = GdprPrivacySettings.P;
                        gdprPrivacySettings.B0(gdprPrivacySettings.y0().f9984p, gdprPrivacySettings.y0().f9990w, z9);
                        gdprPrivacySettings.A0();
                        break;
                    default:
                        int i13 = GdprPrivacySettings.P;
                        gdprPrivacySettings.B0(gdprPrivacySettings.y0().f9983o, gdprPrivacySettings.y0().v, z9);
                        gdprPrivacySettings.A0();
                        if (!gdprPrivacySettings.y0().f9983o.isChecked()) {
                            gdprPrivacySettings.y0().F.setVisibility(0);
                        } else {
                            gdprPrivacySettings.y0().F.setVisibility(8);
                        }
                        break;
                }
            }
        });
        y0().f9984p.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: c4.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GdprPrivacySettings f2111b;

            {
                this.f2111b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
                int i10 = i6;
                GdprPrivacySettings gdprPrivacySettings = this.f2111b;
                switch (i10) {
                    case 0:
                        int i11 = GdprPrivacySettings.P;
                        gdprPrivacySettings.B0(gdprPrivacySettings.y0().f9982n, gdprPrivacySettings.y0().f9989u, z9);
                        gdprPrivacySettings.A0();
                        break;
                    case 1:
                        int i12 = GdprPrivacySettings.P;
                        gdprPrivacySettings.B0(gdprPrivacySettings.y0().f9984p, gdprPrivacySettings.y0().f9990w, z9);
                        gdprPrivacySettings.A0();
                        break;
                    default:
                        int i13 = GdprPrivacySettings.P;
                        gdprPrivacySettings.B0(gdprPrivacySettings.y0().f9983o, gdprPrivacySettings.y0().v, z9);
                        gdprPrivacySettings.A0();
                        if (!gdprPrivacySettings.y0().f9983o.isChecked()) {
                            gdprPrivacySettings.y0().F.setVisibility(0);
                        } else {
                            gdprPrivacySettings.y0().F.setVisibility(8);
                        }
                        break;
                }
            }
        });
        y0().f9980l.setOnClickListener(new s1(this, i6));
        final int i10 = 2;
        y0().f9983o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: c4.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GdprPrivacySettings f2111b;

            {
                this.f2111b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
                int i102 = i10;
                GdprPrivacySettings gdprPrivacySettings = this.f2111b;
                switch (i102) {
                    case 0:
                        int i11 = GdprPrivacySettings.P;
                        gdprPrivacySettings.B0(gdprPrivacySettings.y0().f9982n, gdprPrivacySettings.y0().f9989u, z9);
                        gdprPrivacySettings.A0();
                        break;
                    case 1:
                        int i12 = GdprPrivacySettings.P;
                        gdprPrivacySettings.B0(gdprPrivacySettings.y0().f9984p, gdprPrivacySettings.y0().f9990w, z9);
                        gdprPrivacySettings.A0();
                        break;
                    default:
                        int i13 = GdprPrivacySettings.P;
                        gdprPrivacySettings.B0(gdprPrivacySettings.y0().f9983o, gdprPrivacySettings.y0().v, z9);
                        gdprPrivacySettings.A0();
                        if (!gdprPrivacySettings.y0().f9983o.isChecked()) {
                            gdprPrivacySettings.y0().F.setVisibility(0);
                        } else {
                            gdprPrivacySettings.y0().F.setVisibility(8);
                        }
                        break;
                }
            }
        });
        y0().f9981m.setOnClickListener(new s1(this, i10));
        y0().f9985q.setOnClickListener(new s1(this, 3));
        y0().f9987s.setOnClickListener(new s1(this, 4));
    }

    @Override // c4.k0, g4.s0, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (z3.p(this, "gdpr_requested", false)) {
            return;
        }
        z3.M(this, "gdpr_requested", true);
        z3.M(this, "gdpr_analytics_allowed", true);
        z3.M(this, "gdpr_crashlytics_allowed", true);
        z3.M(this, "gdpr_tracking_allowed", true);
    }

    public final l1 y0() {
        return (l1) this.O.getValue();
    }

    public final void z0() {
        boolean zIsChecked = y0().f9984p.isChecked();
        if (z3.p(this, "gdpr_crashlytics_allowed", false) != zIsChecked) {
            z3.M(this, "gdpr_crashlytics_allowed", zIsChecked);
        }
        boolean zIsChecked2 = y0().f9982n.isChecked();
        if (z3.p(this, "gdpr_analytics_allowed", false) != zIsChecked2) {
            z3.M(this, "gdpr_analytics_allowed", zIsChecked2);
        }
        boolean zIsChecked3 = y0().f9983o.isChecked();
        if (z3.p(this, "gdpr_tracking_allowed", false) != zIsChecked3) {
            z3.M(this, "gdpr_tracking_allowed", zIsChecked3);
        }
        if (!z3.p(this, "gdpr_tracking_allowed", false)) {
            setResult(0);
            return;
        }
        float f = UptodownApp.I;
        d.F(this);
        setResult(-1);
    }
}
