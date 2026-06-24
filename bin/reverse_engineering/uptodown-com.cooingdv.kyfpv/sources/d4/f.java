package d4;

import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.preferences.MobileDataUsageActivity;
import r7.o0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MobileDataUsageActivity f3568b;

    public /* synthetic */ f(MobileDataUsageActivity mobileDataUsageActivity, int i) {
        this.f3567a = i;
        this.f3568b = mobileDataUsageActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string;
        SharedPreferences sharedPreferences;
        String str;
        String string2;
        SharedPreferences sharedPreferences2;
        String string3;
        SharedPreferences sharedPreferences3;
        String string4;
        SharedPreferences sharedPreferences4;
        String string5;
        SharedPreferences sharedPreferences5;
        String string6;
        SharedPreferences sharedPreferences6;
        int i = this.f3567a;
        String str2 = "notify";
        String str3 = "auto";
        j jVar = j.f3577a;
        MobileDataUsageActivity mobileDataUsageActivity = this.f3568b;
        switch (i) {
            case 0:
                int i6 = MobileDataUsageActivity.Q;
                if (mobileDataUsageActivity.B0().f3585b.getValue() != jVar) {
                    o0 o0Var = mobileDataUsageActivity.B0().f3585b;
                    o0Var.getClass();
                    o0Var.g(null, jVar);
                    TextView textView = mobileDataUsageActivity.A0().f10157x;
                    TextView textView2 = mobileDataUsageActivity.A0().N;
                    textView.setTextColor(ContextCompat.getColor(mobileDataUsageActivity, R.color.white));
                    textView.setBackground(ContextCompat.getDrawable(mobileDataUsageActivity, R.drawable.shape_bg_blue_primary));
                    textView2.setTextColor(ContextCompat.getColor(mobileDataUsageActivity, R.color.text_secundary));
                    textView2.setBackground(null);
                    mobileDataUsageActivity.B0().a(mobileDataUsageActivity);
                    mobileDataUsageActivity.C0("connection_tab", null, "mobile");
                }
                break;
            case 1:
                int i10 = MobileDataUsageActivity.Q;
                Object value = mobileDataUsageActivity.B0().f3585b.getValue();
                j jVar2 = j.f3578b;
                if (value != jVar2) {
                    o0 o0Var2 = mobileDataUsageActivity.B0().f3585b;
                    o0Var2.getClass();
                    o0Var2.g(null, jVar2);
                    TextView textView3 = mobileDataUsageActivity.A0().N;
                    TextView textView4 = mobileDataUsageActivity.A0().f10157x;
                    textView3.setTextColor(ContextCompat.getColor(mobileDataUsageActivity, R.color.white));
                    textView3.setBackground(ContextCompat.getDrawable(mobileDataUsageActivity, R.drawable.shape_bg_blue_primary));
                    textView4.setTextColor(ContextCompat.getColor(mobileDataUsageActivity, R.color.text_secundary));
                    textView4.setBackground(null);
                    mobileDataUsageActivity.B0().a(mobileDataUsageActivity);
                    mobileDataUsageActivity.C0("connection_tab", null, "wifi");
                }
                break;
            case 2:
                int i11 = MobileDataUsageActivity.Q;
                if (mobileDataUsageActivity.B0().f3585b.getValue() != jVar) {
                    try {
                        SharedPreferences sharedPreferences7 = mobileDataUsageActivity.getSharedPreferences("SettingsPreferences", 0);
                        if (sharedPreferences7.contains("updates_wifi")) {
                            String string7 = sharedPreferences7.getString("updates_wifi", "auto");
                            string7.getClass();
                            str3 = string7;
                        }
                    } catch (Exception unused) {
                    }
                    if (!str3.equals("notify")) {
                        mobileDataUsageActivity.y0(mobileDataUsageActivity.A0().K, mobileDataUsageActivity.A0().H);
                        SharedPreferences sharedPreferences8 = mobileDataUsageActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences8.getClass();
                        SharedPreferences.Editor editorEdit = sharedPreferences8.edit();
                        editorEdit.putString("updates_wifi", "notify");
                        editorEdit.apply();
                        mobileDataUsageActivity.C0("updates", "wifi", "notify");
                    }
                } else {
                    try {
                        sharedPreferences = mobileDataUsageActivity.getSharedPreferences("SettingsPreferences", 0);
                    } catch (Exception unused2) {
                    }
                    if (sharedPreferences.contains("updates_mobile_data")) {
                        string = sharedPreferences.getString("updates_mobile_data", "notify");
                        string.getClass();
                    } else {
                        string = "notify";
                    }
                    if (!string.equals("notify")) {
                        mobileDataUsageActivity.y0(mobileDataUsageActivity.A0().K, mobileDataUsageActivity.A0().H);
                        SharedPreferences sharedPreferences9 = mobileDataUsageActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences9.getClass();
                        SharedPreferences.Editor editorEdit2 = sharedPreferences9.edit();
                        editorEdit2.putString("updates_mobile_data", "notify");
                        editorEdit2.apply();
                        mobileDataUsageActivity.C0("updates", "mobile", "notify");
                    }
                }
                break;
            case 3:
                int i12 = MobileDataUsageActivity.Q;
                if (mobileDataUsageActivity.B0().f3585b.getValue() != jVar) {
                    try {
                        sharedPreferences2 = mobileDataUsageActivity.getSharedPreferences("SettingsPreferences", 0);
                        str = "updates_wifi";
                    } catch (Exception unused3) {
                        str = "updates_wifi";
                    }
                    if (sharedPreferences2.contains(str)) {
                        string2 = sharedPreferences2.getString(str, "auto");
                        string2.getClass();
                    } else {
                        string2 = "auto";
                    }
                    if (!string2.equals("auto")) {
                        mobileDataUsageActivity.y0(mobileDataUsageActivity.A0().H, mobileDataUsageActivity.A0().K);
                        SharedPreferences sharedPreferences10 = mobileDataUsageActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences10.getClass();
                        SharedPreferences.Editor editorEdit3 = sharedPreferences10.edit();
                        editorEdit3.putString(str, "auto");
                        editorEdit3.apply();
                        mobileDataUsageActivity.C0("updates", "wifi", "auto");
                    }
                } else {
                    try {
                        SharedPreferences sharedPreferences11 = mobileDataUsageActivity.getSharedPreferences("SettingsPreferences", 0);
                        if (sharedPreferences11.contains("updates_mobile_data")) {
                            String string8 = sharedPreferences11.getString("updates_mobile_data", "notify");
                            string8.getClass();
                            str2 = string8;
                        }
                    } catch (Exception unused4) {
                    }
                    if (!str2.equals("auto")) {
                        mobileDataUsageActivity.y0(mobileDataUsageActivity.A0().H, mobileDataUsageActivity.A0().K);
                        SharedPreferences sharedPreferences12 = mobileDataUsageActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences12.getClass();
                        SharedPreferences.Editor editorEdit4 = sharedPreferences12.edit();
                        editorEdit4.putString("updates_mobile_data", "auto");
                        editorEdit4.apply();
                        mobileDataUsageActivity.C0("updates", "mobile", "auto");
                    }
                }
                break;
            case 4:
                int i13 = MobileDataUsageActivity.Q;
                AlertDialog alertDialog = mobileDataUsageActivity.F;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
                break;
            case 5:
                int i14 = MobileDataUsageActivity.Q;
                mobileDataUsageActivity.finish();
                break;
            case 6:
                int i15 = MobileDataUsageActivity.Q;
                if (mobileDataUsageActivity.B0().f3585b.getValue() == jVar) {
                    try {
                        SharedPreferences sharedPreferences13 = mobileDataUsageActivity.getSharedPreferences("SettingsPreferences", 0);
                        if (sharedPreferences13.contains("image_quality_mobile_data")) {
                            String string9 = sharedPreferences13.getString("image_quality_mobile_data", "auto");
                            string9.getClass();
                            str3 = string9;
                        }
                    } catch (Exception unused5) {
                    }
                    if (!str3.equals("low")) {
                        mobileDataUsageActivity.y0(mobileDataUsageActivity.A0().v, mobileDataUsageActivity.A0().f10159z);
                        SharedPreferences sharedPreferences14 = mobileDataUsageActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences14.getClass();
                        SharedPreferences.Editor editorEdit5 = sharedPreferences14.edit();
                        editorEdit5.putString("image_quality_mobile_data", "low");
                        editorEdit5.apply();
                        float f = UptodownApp.I;
                        b4.d.d(mobileDataUsageActivity);
                        mobileDataUsageActivity.C0("image_quality", "mobile", "low");
                    }
                } else {
                    try {
                        SharedPreferences sharedPreferences15 = mobileDataUsageActivity.getSharedPreferences("SettingsPreferences", 0);
                        if (sharedPreferences15.contains("image_quality_wifi")) {
                            String string10 = sharedPreferences15.getString("image_quality_wifi", "auto");
                            string10.getClass();
                            str3 = string10;
                        }
                    } catch (Exception unused6) {
                    }
                    if (!str3.equals("low")) {
                        mobileDataUsageActivity.y0(mobileDataUsageActivity.A0().v, mobileDataUsageActivity.A0().f10159z);
                        SharedPreferences sharedPreferences16 = mobileDataUsageActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences16.getClass();
                        SharedPreferences.Editor editorEdit6 = sharedPreferences16.edit();
                        editorEdit6.putString("image_quality_wifi", "low");
                        editorEdit6.apply();
                        float f10 = UptodownApp.I;
                        b4.d.d(mobileDataUsageActivity);
                        mobileDataUsageActivity.C0("image_quality", "wifi", "low");
                    }
                }
                mobileDataUsageActivity.y0(mobileDataUsageActivity.A0().v, mobileDataUsageActivity.A0().f10159z);
                break;
            case 7:
                int i16 = MobileDataUsageActivity.Q;
                if (mobileDataUsageActivity.B0().f3585b.getValue() == jVar) {
                    try {
                        sharedPreferences4 = mobileDataUsageActivity.getSharedPreferences("SettingsPreferences", 0);
                    } catch (Exception unused7) {
                    }
                    if (sharedPreferences4.contains("image_quality_mobile_data")) {
                        string4 = sharedPreferences4.getString("image_quality_mobile_data", "auto");
                        string4.getClass();
                    } else {
                        string4 = "auto";
                    }
                    if (!string4.equals("auto")) {
                        mobileDataUsageActivity.y0(mobileDataUsageActivity.A0().f10159z, mobileDataUsageActivity.A0().v);
                        SharedPreferences sharedPreferences17 = mobileDataUsageActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences17.getClass();
                        SharedPreferences.Editor editorEdit7 = sharedPreferences17.edit();
                        editorEdit7.putString("image_quality_mobile_data", "auto");
                        editorEdit7.apply();
                        float f11 = UptodownApp.I;
                        b4.d.d(mobileDataUsageActivity);
                        mobileDataUsageActivity.C0("image_quality", "mobile", "auto");
                    }
                } else {
                    try {
                        sharedPreferences3 = mobileDataUsageActivity.getSharedPreferences("SettingsPreferences", 0);
                    } catch (Exception unused8) {
                    }
                    if (sharedPreferences3.contains("image_quality_wifi")) {
                        string3 = sharedPreferences3.getString("image_quality_wifi", "auto");
                        string3.getClass();
                    } else {
                        string3 = "auto";
                    }
                    if (!string3.equals("auto")) {
                        mobileDataUsageActivity.y0(mobileDataUsageActivity.A0().f10159z, mobileDataUsageActivity.A0().v);
                        SharedPreferences sharedPreferences18 = mobileDataUsageActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences18.getClass();
                        SharedPreferences.Editor editorEdit8 = sharedPreferences18.edit();
                        editorEdit8.putString("image_quality_wifi", "auto");
                        editorEdit8.apply();
                        float f12 = UptodownApp.I;
                        b4.d.d(mobileDataUsageActivity);
                        mobileDataUsageActivity.C0("image_quality", "wifi", "auto");
                    }
                }
                mobileDataUsageActivity.y0(mobileDataUsageActivity.A0().f10159z, mobileDataUsageActivity.A0().v);
                break;
            case 8:
                int i17 = MobileDataUsageActivity.Q;
                if (mobileDataUsageActivity.B0().f3585b.getValue() != jVar) {
                    try {
                        SharedPreferences sharedPreferences19 = mobileDataUsageActivity.getSharedPreferences("SettingsPreferences", 0);
                        if (sharedPreferences19.contains("background_sync_wifi")) {
                            String string11 = sharedPreferences19.getString("background_sync_wifi", "auto");
                            string11.getClass();
                            str3 = string11;
                        }
                    } catch (Exception unused9) {
                    }
                    if (!str3.equals("reduced")) {
                        mobileDataUsageActivity.y0(mobileDataUsageActivity.A0().D, mobileDataUsageActivity.A0().B);
                        SharedPreferences sharedPreferences20 = mobileDataUsageActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences20.getClass();
                        SharedPreferences.Editor editorEdit9 = sharedPreferences20.edit();
                        editorEdit9.putString("background_sync_wifi", "reduced");
                        editorEdit9.apply();
                        mobileDataUsageActivity.C0("sync", "wifi", "reduced");
                    }
                } else {
                    try {
                        SharedPreferences sharedPreferences21 = mobileDataUsageActivity.getSharedPreferences("SettingsPreferences", 0);
                        if (sharedPreferences21.contains("background_sync_mobile_data")) {
                            String string12 = sharedPreferences21.getString("background_sync_mobile_data", "auto");
                            string12.getClass();
                            str3 = string12;
                        }
                    } catch (Exception unused10) {
                    }
                    if (!str3.equals("reduced")) {
                        mobileDataUsageActivity.y0(mobileDataUsageActivity.A0().D, mobileDataUsageActivity.A0().B);
                        SharedPreferences sharedPreferences22 = mobileDataUsageActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences22.getClass();
                        SharedPreferences.Editor editorEdit10 = sharedPreferences22.edit();
                        editorEdit10.putString("background_sync_mobile_data", "reduced");
                        editorEdit10.apply();
                        mobileDataUsageActivity.C0("sync", "mobile", "reduced");
                    }
                }
                break;
            case 9:
                int i18 = MobileDataUsageActivity.Q;
                if (mobileDataUsageActivity.B0().f3585b.getValue() != jVar) {
                    try {
                        sharedPreferences5 = mobileDataUsageActivity.getSharedPreferences("SettingsPreferences", 0);
                    } catch (Exception unused11) {
                    }
                    if (sharedPreferences5.contains("background_sync_wifi")) {
                        string5 = sharedPreferences5.getString("background_sync_wifi", "auto");
                        string5.getClass();
                    } else {
                        string5 = "auto";
                    }
                    if (!string5.equals("auto")) {
                        mobileDataUsageActivity.y0(mobileDataUsageActivity.A0().B, mobileDataUsageActivity.A0().D);
                        SharedPreferences sharedPreferences23 = mobileDataUsageActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences23.getClass();
                        SharedPreferences.Editor editorEdit11 = sharedPreferences23.edit();
                        editorEdit11.putString("background_sync_wifi", "auto");
                        editorEdit11.apply();
                        mobileDataUsageActivity.C0("sync", "wifi", "auto");
                    }
                } else {
                    try {
                        sharedPreferences6 = mobileDataUsageActivity.getSharedPreferences("SettingsPreferences", 0);
                    } catch (Exception unused12) {
                    }
                    if (sharedPreferences6.contains("background_sync_mobile_data")) {
                        string6 = sharedPreferences6.getString("background_sync_mobile_data", "auto");
                        string6.getClass();
                    } else {
                        string6 = "auto";
                    }
                    if (!string6.equals("auto")) {
                        mobileDataUsageActivity.y0(mobileDataUsageActivity.A0().B, mobileDataUsageActivity.A0().D);
                        SharedPreferences sharedPreferences24 = mobileDataUsageActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences24.getClass();
                        SharedPreferences.Editor editorEdit12 = sharedPreferences24.edit();
                        editorEdit12.putString("background_sync_mobile_data", "auto");
                        editorEdit12.apply();
                        mobileDataUsageActivity.C0("sync", "mobile", "auto");
                    }
                }
                break;
            case 10:
                int i19 = MobileDataUsageActivity.Q;
                Object value2 = mobileDataUsageActivity.B0().f3584a.getValue();
                k kVar = k.f3580a;
                if (value2 != kVar) {
                    o0 o0Var3 = mobileDataUsageActivity.B0().f3584a;
                    o0Var3.getClass();
                    o0Var3.g(null, kVar);
                    mobileDataUsageActivity.z0(mobileDataUsageActivity.A0().G, mobileDataUsageActivity.A0().M, mobileDataUsageActivity.A0().f10158y);
                    mobileDataUsageActivity.A0().f10146l.setVisibility(8);
                    mobileDataUsageActivity.B0().a(mobileDataUsageActivity);
                    mobileDataUsageActivity.C0("timeframe", null, "today");
                }
                break;
            case 11:
                int i20 = MobileDataUsageActivity.Q;
                Object value3 = mobileDataUsageActivity.B0().f3584a.getValue();
                k kVar2 = k.f3581b;
                if (value3 != kVar2) {
                    o0 o0Var4 = mobileDataUsageActivity.B0().f3584a;
                    o0Var4.getClass();
                    o0Var4.g(null, kVar2);
                    mobileDataUsageActivity.z0(mobileDataUsageActivity.A0().M, mobileDataUsageActivity.A0().G, mobileDataUsageActivity.A0().f10158y);
                    mobileDataUsageActivity.A0().f10146l.setVisibility(8);
                    mobileDataUsageActivity.B0().a(mobileDataUsageActivity);
                    mobileDataUsageActivity.C0("timeframe", null, "week");
                }
                break;
            case 12:
                int i21 = MobileDataUsageActivity.Q;
                Object value4 = mobileDataUsageActivity.B0().f3584a.getValue();
                k kVar3 = k.f3582l;
                if (value4 != kVar3) {
                    o0 o0Var5 = mobileDataUsageActivity.B0().f3584a;
                    o0Var5.getClass();
                    o0Var5.g(null, kVar3);
                    mobileDataUsageActivity.z0(mobileDataUsageActivity.A0().f10158y, mobileDataUsageActivity.A0().M, mobileDataUsageActivity.A0().G);
                    mobileDataUsageActivity.A0().f10146l.setVisibility(0);
                    mobileDataUsageActivity.B0().a(mobileDataUsageActivity);
                    mobileDataUsageActivity.C0("timeframe", null, "month");
                }
                break;
            default:
                int i22 = MobileDataUsageActivity.Q;
                View viewInflate = mobileDataUsageActivity.getLayoutInflater().inflate(R.layout.dialog_billing_cycle_day_picker, (ViewGroup) null, false);
                int i23 = R.id.number_picker_billing_day;
                NumberPicker numberPicker = (NumberPicker) ViewBindings.findChildViewById(viewInflate, R.id.number_picker_billing_day);
                if (numberPicker != null) {
                    i23 = R.id.tv_cancel_billing_day_picker;
                    TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_cancel_billing_day_picker);
                    if (textView5 != null) {
                        i23 = R.id.tv_message_billing_day_picker;
                        TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_message_billing_day_picker);
                        if (textView6 != null) {
                            i23 = R.id.tv_note_billing_day_picker;
                            TextView textView7 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_note_billing_day_picker);
                            if (textView7 != null) {
                                i23 = R.id.tv_ok_billing_day_picker;
                                TextView textView8 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_ok_billing_day_picker);
                                if (textView8 != null) {
                                    i23 = R.id.tv_title_billing_day_picker;
                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_title_billing_day_picker);
                                    if (textView9 != null) {
                                        LinearLayout linearLayout = (LinearLayout) viewInflate;
                                        m8.q qVar = new m8.q(linearLayout, numberPicker, textView5, textView6, textView7, textView8, textView9);
                                        textView9.setTypeface(f4.c.f4883w);
                                        textView6.setTypeface(f4.c.f4884x);
                                        textView7.setTypeface(f4.c.f4884x);
                                        textView5.setTypeface(f4.c.f4883w);
                                        textView8.setTypeface(f4.c.f4883w);
                                        numberPicker.setMinValue(1);
                                        numberPicker.setMaxValue(31);
                                        numberPicker.setValue(t0.f.j(((Number) mobileDataUsageActivity.B0().f3586c.getValue()).intValue(), 1, 31));
                                        mobileDataUsageActivity.F = new AlertDialog.Builder(mobileDataUsageActivity).setView(linearLayout).setCancelable(true).create();
                                        textView5.setOnClickListener(new f(mobileDataUsageActivity, 4));
                                        textView8.setOnClickListener(new c.e(21, qVar, mobileDataUsageActivity));
                                        mobileDataUsageActivity.u0();
                                    }
                                }
                            }
                        }
                    }
                }
                com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i23)));
                break;
        }
    }
}
