package c4;

import android.view.View;
import com.inmobi.cmp.ChoiceCmp;
import com.uptodown.R;
import com.uptodown.activities.GdprPrivacySettings;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s1 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GdprPrivacySettings f2067b;

    public /* synthetic */ s1(GdprPrivacySettings gdprPrivacySettings, int i) {
        this.f2066a = i;
        this.f2067b = gdprPrivacySettings;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f2066a;
        GdprPrivacySettings gdprPrivacySettings = this.f2067b;
        switch (i) {
            case 0:
                int i6 = GdprPrivacySettings.P;
                gdprPrivacySettings.getOnBackPressedDispatcher().onBackPressed();
                break;
            case 1:
                int i10 = GdprPrivacySettings.P;
                ChoiceCmp.forceDisplayUI(gdprPrivacySettings);
                ChoiceCmp.showUSRegulationScreen(gdprPrivacySettings);
                break;
            case 2:
                int i11 = GdprPrivacySettings.P;
                if (!gdprPrivacySettings.isFinishing()) {
                    String string = gdprPrivacySettings.getString(R.string.url_contact);
                    string.getClass();
                    j5.c.e(gdprPrivacySettings, string, null);
                }
                break;
            case 3:
                int i12 = GdprPrivacySettings.P;
                gdprPrivacySettings.y0().f9983o.setChecked(true);
                gdprPrivacySettings.y0().f9982n.setChecked(true);
                gdprPrivacySettings.y0().f9984p.setChecked(true);
                gdprPrivacySettings.z0();
                gdprPrivacySettings.finish();
                break;
            case 4:
                int i13 = GdprPrivacySettings.P;
                gdprPrivacySettings.A0();
                gdprPrivacySettings.y0().f9983o.setChecked(false);
                gdprPrivacySettings.y0().f9982n.setChecked(false);
                gdprPrivacySettings.y0().f9984p.setChecked(false);
                break;
            default:
                int i14 = GdprPrivacySettings.P;
                gdprPrivacySettings.z0();
                gdprPrivacySettings.finish();
                break;
        }
    }
}
