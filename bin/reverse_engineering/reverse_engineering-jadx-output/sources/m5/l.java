package m5;

import android.content.Context;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.util.views.UsernameTextView;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2.e f7451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.h f7452b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f7453l;

    /* JADX WARN: Illegal instructions before constructor call */
    public l(g2.e eVar, w4.h hVar) {
        hVar.getClass();
        RelativeLayout relativeLayout = (RelativeLayout) eVar.f5118b;
        super(relativeLayout);
        this.f7451a = eVar;
        this.f7452b = hVar;
        this.f7453l = relativeLayout.getContext();
        ((UsernameTextView) eVar.f5126s).setTypeface(f4.c.f4882w);
        ((TextView) eVar.f5124q).setTypeface(f4.c.f4883x);
        ((TextView) eVar.f5125r).setTypeface(f4.c.f4883x);
    }

    public final void a(x4.d1 d1Var, g2.e eVar) {
        ImageView imageView = (ImageView) eVar.f5121n;
        ImageView imageView2 = (ImageView) eVar.f5122o;
        ImageView imageView3 = (ImageView) eVar.f5123p;
        ImageView imageView4 = (ImageView) eVar.f5124q;
        int i = d1Var.f11097p;
        ImageView imageView5 = (ImageView) eVar.f5120m;
        Context context = this.f7453l;
        if (i == 1) {
            imageView5.setImageDrawable(ContextCompat.getDrawable(context, 2131231442));
            imageView.setImageDrawable(ContextCompat.getDrawable(context, 2131231440));
            imageView2.setImageDrawable(ContextCompat.getDrawable(context, 2131231440));
            imageView3.setImageDrawable(ContextCompat.getDrawable(context, 2131231440));
            imageView4.setImageDrawable(ContextCompat.getDrawable(context, 2131231440));
            if (d1Var.v >= 1) {
                imageView5.setImageDrawable(ContextCompat.getDrawable(context, 2131231442));
            }
            if (d1Var.v >= 2) {
                imageView.setImageDrawable(ContextCompat.getDrawable(context, 2131231442));
            }
            if (d1Var.v >= 3) {
                imageView2.setImageDrawable(ContextCompat.getDrawable(context, 2131231442));
            }
            if (d1Var.v >= 4) {
                imageView3.setImageDrawable(ContextCompat.getDrawable(context, 2131231442));
            }
            if (d1Var.v == 5) {
                imageView4.setImageDrawable(ContextCompat.getDrawable(context, 2131231442));
                return;
            }
            return;
        }
        imageView5.setImageDrawable(ContextCompat.getDrawable(context, 2131231441));
        imageView.setImageDrawable(ContextCompat.getDrawable(context, 2131231439));
        imageView2.setImageDrawable(ContextCompat.getDrawable(context, 2131231439));
        imageView3.setImageDrawable(ContextCompat.getDrawable(context, 2131231439));
        imageView4.setImageDrawable(ContextCompat.getDrawable(context, 2131231439));
        if (d1Var.v >= 1) {
            imageView5.setImageDrawable(ContextCompat.getDrawable(context, 2131231441));
        }
        if (d1Var.v >= 2) {
            imageView.setImageDrawable(ContextCompat.getDrawable(context, 2131231441));
        }
        if (d1Var.v >= 3) {
            imageView2.setImageDrawable(ContextCompat.getDrawable(context, 2131231441));
        }
        if (d1Var.v >= 4) {
            imageView3.setImageDrawable(ContextCompat.getDrawable(context, 2131231441));
        }
        if (d1Var.v == 5) {
            imageView4.setImageDrawable(ContextCompat.getDrawable(context, 2131231441));
        }
    }
}
