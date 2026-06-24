package i5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.view.View;
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
public final class d extends Presenter.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f5678b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f5679l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f5680m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f5681n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(View view, Context context) {
        super(view);
        context.getClass();
        this.f5677a = context;
        this.f5678b = (ImageView) view.findViewById(R.id.iv_logo_home_card_item);
        TextView textView = (TextView) view.findViewById(R.id.tv_name_home_card_item);
        this.f5679l = textView;
        TextView textView2 = (TextView) view.findViewById(R.id.tv_desc_home_card_item);
        this.f5680m = textView2;
        TextView textView3 = (TextView) view.findViewById(R.id.tv_status_home_card_item);
        this.f5681n = textView3;
        if (textView != null) {
            textView.setTypeface(f4.c.f4883w);
        }
        if (textView2 != null) {
            textView2.setTypeface(f4.c.f4884x);
        }
        if (textView3 != null) {
            textView3.setTypeface(f4.c.f4884x);
        }
    }

    public final boolean a(x4.e eVar) {
        ApplicationInfo applicationInfoB;
        try {
            PackageManager packageManager = this.f5677a.getPackageManager();
            packageManager.getClass();
            String str = eVar.f11124l;
            str.getClass();
            applicationInfoB = i.b(packageManager, str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            applicationInfoB = null;
        }
        return eVar.v == 0 && applicationInfoB != null && applicationInfoB.enabled;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.d.b(java.lang.Object):void");
    }

    public final void c(q2 q2Var, TextView textView, TextView textView2) {
        Context context = this.f5677a;
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

    public final void d() {
        ImageView imageView = this.f5678b;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        TextView textView = this.f5679l;
        if (textView != null) {
            textView.setText((CharSequence) null);
        }
        TextView textView2 = this.f5680m;
        if (textView2 != null) {
            textView2.setText((CharSequence) null);
        }
        TextView textView3 = this.f5681n;
        if (textView3 != null) {
            textView3.setText((CharSequence) null);
        }
    }
}
