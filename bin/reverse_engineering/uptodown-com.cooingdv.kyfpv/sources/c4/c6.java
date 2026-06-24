package c4;

import android.content.SharedPreferences;
import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;
import com.uptodown.activities.OldVersionsActivity;
import com.uptodown.activities.preferences.AdvancedPreferencesActivity;
import com.uptodown.activities.preferences.MobileDataUsageActivity;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c6 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1467b;

    public /* synthetic */ c6(Object obj, int i) {
        this.f1466a = i;
        this.f1467b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
        SharedPreferences sharedPreferences;
        int i = this.f1466a;
        boolean z10 = true;
        Object obj = this.f1467b;
        switch (i) {
            case 0:
                int i6 = OldVersionsActivity.S;
                boolean z11 = !z9;
                SharedPreferences sharedPreferences2 = ((OldVersionsActivity) obj).getSharedPreferences("SettingsPreferences", 0);
                sharedPreferences2.getClass();
                SharedPreferences.Editor editorEdit = sharedPreferences2.edit();
                editorEdit.putBoolean("show_warning_download_incompatible", z11);
                editorEdit.apply();
                break;
            case 1:
                ((Chip) obj).lambda$new$0(compoundButton, z9);
                break;
            case 2:
                int i10 = AdvancedPreferencesActivity.Q;
                SharedPreferences sharedPreferences3 = ((AdvancedPreferencesActivity) obj).getSharedPreferences("SettingsPreferences", 0);
                sharedPreferences3.getClass();
                SharedPreferences.Editor editorEdit2 = sharedPreferences3.edit();
                editorEdit2.putBoolean("animations", z9);
                editorEdit2.apply();
                break;
            case 3:
                MobileDataUsageActivity mobileDataUsageActivity = (MobileDataUsageActivity) obj;
                int i11 = MobileDataUsageActivity.Q;
                if (mobileDataUsageActivity.B0().f3585b.getValue() != d4.j.f3577a) {
                    try {
                        SharedPreferences sharedPreferences4 = mobileDataUsageActivity.getSharedPreferences("SettingsPreferences", 0);
                        if (sharedPreferences4.contains("autoplay_wifi")) {
                            z10 = sharedPreferences4.getBoolean("autoplay_wifi", true);
                        }
                        break;
                    } catch (Exception unused) {
                    }
                    if (z9 != z10) {
                        SharedPreferences sharedPreferences5 = mobileDataUsageActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences5.getClass();
                        SharedPreferences.Editor editorEdit3 = sharedPreferences5.edit();
                        editorEdit3.putBoolean("autoplay_wifi", z9);
                        editorEdit3.apply();
                        mobileDataUsageActivity.C0("autoplay", "wifi", String.valueOf(z9));
                    }
                } else {
                    try {
                        sharedPreferences = mobileDataUsageActivity.getSharedPreferences("SettingsPreferences", 0);
                    } catch (Exception unused2) {
                    }
                    boolean z12 = sharedPreferences.contains("autoplay_mobile_data") ? sharedPreferences.getBoolean("autoplay_mobile_data", false) : false;
                    if (z9 != z12) {
                        SharedPreferences sharedPreferences6 = mobileDataUsageActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences6.getClass();
                        SharedPreferences.Editor editorEdit4 = sharedPreferences6.edit();
                        editorEdit4.putBoolean("autoplay_mobile_data", z9);
                        editorEdit4.apply();
                        mobileDataUsageActivity.C0("autoplay", "mobile", String.valueOf(z9));
                    }
                }
                break;
            default:
                m5.z1 z1Var = (m5.z1) obj;
                w4.o oVar = z1Var.f7655b;
                if (oVar != null) {
                    oVar.a(z1Var.getBindingAdapterPosition());
                }
                break;
        }
    }
}
