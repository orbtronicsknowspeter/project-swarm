package m5;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.measurement.i5;
import com.google.android.gms.internal.measurement.z3;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import x4.q2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7370a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(View view, Context context) {
        super(view);
        view.getClass();
        context.getClass();
        this.f7370a = context;
    }

    public static void a(RelativeLayout.LayoutParams layoutParams, Context context, int i, int i6) {
        context.getClass();
        int dimension = (int) context.getResources().getDimension(R.dimen.margin_m);
        String string = null;
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("SettingsPreferences", 0);
            if (sharedPreferences.contains("Language")) {
                string = sharedPreferences.getString("Language", null);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (!kotlin.jvm.internal.l.a(string, "ar")) {
            if (i == i6) {
                layoutParams.setMargins(dimension, 0, dimension, 0);
                return;
            } else {
                layoutParams.setMargins(dimension, 0, 0, 0);
                return;
            }
        }
        if (i == i6) {
            layoutParams.setMargins(dimension, 0, 0, 0);
        } else if (i == 1) {
            layoutParams.setMargins(dimension, 0, dimension, 0);
        } else {
            layoutParams.setMargins(dimension, 0, 0, 0);
        }
    }

    public static void b(View view, w4.c cVar, x4.g gVar) {
        view.getClass();
        cVar.getClass();
        gVar.getClass();
        view.setOnClickListener(new g4.b0(4, cVar, gVar));
    }

    public static void f(x4.g gVar, TextView textView, TextView textView2) {
        gVar.getClass();
        textView.getClass();
        textView2.getClass();
        textView.setText(gVar.f11160b);
        String str = gVar.f11176o;
        if (str == null || str.length() == 0) {
            str = gVar.f11191w;
        }
        textView2.setText(str);
    }

    public final void c(x4.g gVar, ProgressBar progressBar, ImageView imageView, TextView textView, TextView textView2, TextView textView3, LinearLayout linearLayout) {
        gVar.getClass();
        progressBar.getClass();
        imageView.getClass();
        textView.getClass();
        textView2.getClass();
        linearLayout.getClass();
        e1.c0 c0Var = j5.g.D;
        Context context = this.f7370a;
        j5.g gVarL = c0Var.l(context);
        gVarL.b();
        String str = gVar.F;
        x4.r rVarL = str != null ? gVarL.L(gVar.K, str) : null;
        long j = gVar.f11159a;
        boolean z9 = a5.b.c(j) || a5.c.b(j);
        boolean z10 = rVarL != null && rVarL.m();
        if (rVarL == null || !(z9 || z10)) {
            String str2 = gVar.F;
            t0.f.s(progressBar, imageView);
            linearLayout.setVisibility(8);
            if (textView3 != null) {
                d(str2, textView3, textView);
                return;
            }
            return;
        }
        int i = rVarL.i();
        long jK = rVarL.k();
        t0.f.I(progressBar, imageView);
        textView.setVisibility(8);
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        linearLayout.setVisibility(0);
        if (i == 0) {
            progressBar.setIndeterminate(true);
            textView2.setText(context.getString(R.string.status_download_update_pending));
        } else {
            progressBar.setIndeterminate(false);
            progressBar.setProgress(i);
            textView2.setText(context.getString(R.string.percent_of_total_size, Integer.valueOf(i), i5.H(context, jK)));
        }
    }

    public final void d(String str, TextView textView, TextView textView2) {
        textView.getClass();
        textView2.getClass();
        Context context = this.f7370a;
        PackageInfo packageInfoE = null;
        if (str != null && context != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    packageInfoE = n4.i.e(packageManager, str, 0);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (packageInfoE == null) {
            textView.setVisibility(8);
            textView2.setVisibility(0);
            return;
        }
        j5.g gVarL = j5.g.D.l(context);
        gVarL.b();
        str.getClass();
        q2 q2VarY = gVarL.Y(str);
        x4.e eVarB = gVarL.B(str);
        gVarL.c();
        if (eVarB == null) {
            textView.setVisibility(0);
            textView2.setVisibility(8);
            return;
        }
        if (eVarB.d()) {
            textView.setVisibility(8);
            textView2.setVisibility(0);
            return;
        }
        textView.setTypeface(f4.c.f4883w);
        if (eVarB.K) {
            textView.setText(context.getString(R.string.dark_mode_disabled));
            textView.setTextColor(ContextCompat.getColor(context, R.color.main_light_grey));
            textView.setBackground(ContextCompat.getDrawable(context, R.drawable.bg_status_download_installed));
        } else if (q2VarY == null || q2VarY.c() || eVarB.v != 0) {
            textView.setText(context.getString(R.string.status_download_installed));
            z3.J(textView);
        } else {
            textView.setText(context.getString(R.string.status_download_update));
            z3.N(textView);
        }
        textView.setVisibility(0);
        textView2.setVisibility(8);
    }

    public final void e(ImageView imageView, String str) {
        imageView.getClass();
        Context context = this.f7370a;
        if (str == null) {
            imageView.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_app_icon_placeholder));
            return;
        }
        a4.l0 l0VarE = a4.g0.d().e(str);
        float f = UptodownApp.I;
        l0VarE.g(b4.d.f(context));
        l0VarE.h(b4.d.x(context));
        l0VarE.e(imageView, null);
    }
}
