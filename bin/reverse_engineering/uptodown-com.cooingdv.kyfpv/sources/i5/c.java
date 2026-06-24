package i5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.leanback.widget.Presenter;
import com.google.android.gms.internal.measurement.z3;
import com.uptodown.R;
import n4.i;
import x4.q2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends Presenter.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f5671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f5672b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ImageView f5673l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f5674m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f5675n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f5676o;

    public final boolean a(x4.e eVar) {
        ApplicationInfo applicationInfoB;
        try {
            PackageManager packageManager = this.f5671a.getPackageManager();
            packageManager.getClass();
            String str = eVar.f11124l;
            str.getClass();
            applicationInfoB = i.b(packageManager, str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            applicationInfoB = null;
        }
        return eVar.v == 0 && applicationInfoB != null && applicationInfoB.enabled;
    }

    public final void b(q2 q2Var, TextView textView, TextView textView2) {
        Context context = this.f5671a;
        if (q2Var == null || q2Var.c()) {
            textView.setText(context.getString(R.string.status_download_installed));
            textView.setTextColor(ContextCompat.getColor(context, R.color.download_installed_status));
            textView.setBackground(ContextCompat.getDrawable(context, R.drawable.bg_status_download_installed));
        } else {
            textView.setText(context.getString(R.string.status_download_update));
            z3.N(textView);
        }
        textView.setVisibility(0);
        textView2.setVisibility(8);
    }
}
