package c4;

import android.view.View;
import com.uptodown.activities.OrganizationActivity;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j6 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OrganizationActivity f1759b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x4.u1 f1760l;

    public /* synthetic */ j6(x4.u1 u1Var, OrganizationActivity organizationActivity) {
        this.f1758a = 0;
        this.f1760l = u1Var;
        this.f1759b = organizationActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f1758a;
        x4.u1 u1Var = this.f1760l;
        OrganizationActivity organizationActivity = this.f1759b;
        switch (i) {
            case 0:
                int i6 = OrganizationActivity.R;
                String str = u1Var.f11414b;
                if (str != null) {
                    j5.c.e(organizationActivity, str, u1Var.f11413a);
                }
                break;
            case 1:
                int i10 = OrganizationActivity.R;
                if (!organizationActivity.isFinishing()) {
                    String str2 = u1Var.f11415c;
                    str2.getClass();
                    j5.c.e(organizationActivity, str2, null);
                }
                break;
            case 2:
                int i11 = OrganizationActivity.R;
                if (!organizationActivity.isFinishing()) {
                    String str3 = u1Var.f11416d;
                    str3.getClass();
                    j5.c.e(organizationActivity, str3, null);
                }
                break;
            default:
                int i12 = OrganizationActivity.R;
                if (!organizationActivity.isFinishing()) {
                    String str4 = u1Var.f11417e;
                    str4.getClass();
                    j5.c.e(organizationActivity, str4, null);
                }
                break;
        }
    }

    public /* synthetic */ j6(OrganizationActivity organizationActivity, x4.u1 u1Var, int i) {
        this.f1758a = i;
        this.f1759b = organizationActivity;
        this.f1760l = u1Var;
    }
}
