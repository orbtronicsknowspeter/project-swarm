package g4;

import android.app.AlertDialog;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f5163b;

    public /* synthetic */ f(h hVar, int i) {
        this.f5162a = i;
        this.f5163b = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f5162a) {
            case 0:
                h hVar = this.f5163b;
                AlertDialog alertDialog = hVar.f5177a;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
                hVar.y();
                break;
            case 1:
                AlertDialog alertDialog2 = this.f5163b.f5177a;
                alertDialog2.getClass();
                alertDialog2.dismiss();
                break;
            default:
                AlertDialog alertDialog3 = this.f5163b.f5177a;
                alertDialog3.getClass();
                alertDialog3.dismiss();
                break;
        }
    }
}
