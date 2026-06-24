package e5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.leanback.widget.Presenter;
import com.google.android.gms.internal.measurement.i5;
import com.uptodown.R;
import java.util.Arrays;
import java.util.Locale;
import l7.u;
import x4.r;
import x4.t1;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class p extends Presenter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f4753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x4.e f4754b;

    @Override // androidx.leanback.widget.Presenter
    public final void onBindViewHolder(Presenter.ViewHolder viewHolder, Object obj) {
        viewHolder.getClass();
        if (obj == null) {
            return;
        }
        t1 t1Var = (t1) obj;
        i5.g gVar = (i5.g) viewHolder;
        Context context = viewHolder.view.getContext();
        context.getClass();
        String str = this.f4753a;
        x4.e eVar = this.f4754b;
        RelativeLayout relativeLayout = gVar.f5688a;
        ImageView imageView = gVar.f5689b;
        TextView textView = gVar.f5690l;
        ProgressBar progressBar = gVar.f5693o;
        TextView textView2 = gVar.f5691m;
        TextView textView3 = gVar.f5692n;
        TextView textView4 = gVar.f5694p;
        try {
            PackageManager packageManager = context.getPackageManager();
            packageManager.getClass();
            str.getClass();
            ApplicationInfo applicationInfo = n4.i.e(packageManager, str, 0).applicationInfo;
            imageView.setImageDrawable(applicationInfo != null ? applicationInfo.loadIcon(context.getPackageManager()) : null);
        } catch (Exception unused) {
            imageView.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_uptodown_logo_disabled));
        }
        textView.setTypeface(f4.c.f4884x);
        textView2.setTypeface(f4.c.f4884x);
        textView3.setTypeface(f4.c.f4884x);
        textView.setText(eVar != null ? eVar.f11123b : null);
        textView3.setText(t1Var.f11397a);
        progressBar.setVisibility(4);
        textView4.setVisibility(0);
        textView.setTextColor(ContextCompat.getColor(context, R.color.main_dark_grey));
        textView2.setTextColor(ContextCompat.getColor(context, R.color.main_dark_grey));
        textView3.setTextColor(ContextCompat.getColor(context, R.color.main_dark_grey));
        relativeLayout.setBackgroundColor(ContextCompat.getColor(context, R.color.white));
        if ((eVar != null ? Long.valueOf(eVar.f11125m) : null) != null && eVar.f11125m == t1Var.f11400m) {
            textView.setTextColor(ContextCompat.getColor(context, R.color.white));
            textView2.setTextColor(ContextCompat.getColor(context, R.color.white));
            textView3.setTextColor(ContextCompat.getColor(context, R.color.white));
            relativeLayout.setBackgroundColor(ContextCompat.getColor(context, R.color.main_blue));
            textView4.setVisibility(8);
            return;
        }
        j5.g gVarL = j5.g.D.l(context);
        gVarL.b();
        String str2 = t1Var.f11403p;
        str2.getClass();
        r rVarI = gVarL.I(str2);
        gVarL.c();
        boolean z9 = rVarI != null && rVarI.i() > 0 && rVarI.i() < 100;
        if (rVarI == null) {
            textView4.setText(R.string.updates_button_download_app);
            textView4.setBackgroundColor(ContextCompat.getColor(context, R.color.accent_green));
            return;
        }
        if (z9) {
            textView2.setText(String.format(Locale.getDefault(), "%d%%", Arrays.copyOf(new Object[]{Integer.valueOf(rVarI.i())}, 1)));
            textView3.setVisibility(8);
            progressBar.setProgress(rVarI.i());
            progressBar.setVisibility(0);
            textView4.setText(android.R.string.cancel);
            textView4.setBackgroundColor(ContextCompat.getColor(context, R.color.main_light_grey));
            return;
        }
        textView3.setVisibility(0);
        long j = t1Var.f11398b;
        if (j > 0) {
            textView2.setText(i5.H(context, j));
        }
        l4.a aVarC = f4.a.f4870a.c();
        if (!u.m0(aVarC != null ? aVarC.f7096a : null, rVarI.f11356b, true)) {
            textView4.setText(R.string.option_button_install);
            textView4.setBackgroundColor(ContextCompat.getColor(context, R.color.main_blue));
        } else {
            progressBar.setIndeterminate(true);
            progressBar.setVisibility(0);
            textView3.setText(R.string.installing);
            textView2.setText("");
        }
    }

    @Override // androidx.leanback.widget.Presenter
    public final Presenter.ViewHolder onCreateViewHolder(ViewGroup viewGroup) {
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tv_old_version_item, viewGroup, false);
        viewInflate.setFocusable(true);
        viewInflate.setFocusableInTouchMode(true);
        viewInflate.setBackgroundColor(ContextCompat.getColor(viewGroup.getContext(), R.color.white));
        return new i5.g(viewInflate);
    }

    @Override // androidx.leanback.widget.Presenter
    public final void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
        viewHolder.getClass();
    }
}
