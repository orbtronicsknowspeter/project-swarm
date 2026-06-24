package m5;

import android.content.Context;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import com.uptodown.util.views.UsernameTextView;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2.e f7452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.h f7453b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f7454l;

    /* JADX WARN: Illegal instructions before constructor call */
    public l(g2.e eVar, w4.h hVar) {
        hVar.getClass();
        RelativeLayout relativeLayout = (RelativeLayout) eVar.f5119b;
        super(relativeLayout);
        this.f7452a = eVar;
        this.f7453b = hVar;
        this.f7454l = relativeLayout.getContext();
        ((UsernameTextView) eVar.f5127s).setTypeface(f4.c.f4883w);
        ((TextView) eVar.f5125q).setTypeface(f4.c.f4884x);
        ((TextView) eVar.f5126r).setTypeface(f4.c.f4884x);
    }

    public final void a(x4.d1 d1Var, g2.e eVar) {
        ImageView imageView = (ImageView) eVar.f5122n;
        ImageView imageView2 = (ImageView) eVar.f5123o;
        ImageView imageView3 = (ImageView) eVar.f5124p;
        ImageView imageView4 = (ImageView) eVar.f5125q;
        int i = d1Var.f11098p;
        ImageView imageView5 = (ImageView) eVar.f5121m;
        Context context = this.f7454l;
        if (i == 1) {
            imageView5.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_on_turbo));
            imageView.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_off_turbo));
            imageView2.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_off_turbo));
            imageView3.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_off_turbo));
            imageView4.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_off_turbo));
            if (d1Var.v >= 1) {
                imageView5.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_on_turbo));
            }
            if (d1Var.v >= 2) {
                imageView.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_on_turbo));
            }
            if (d1Var.v >= 3) {
                imageView2.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_on_turbo));
            }
            if (d1Var.v >= 4) {
                imageView3.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_on_turbo));
            }
            if (d1Var.v == 5) {
                imageView4.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_on_turbo));
                return;
            }
            return;
        }
        imageView5.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_on));
        imageView.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_off));
        imageView2.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_off));
        imageView3.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_off));
        imageView4.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_off));
        if (d1Var.v >= 1) {
            imageView5.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_on));
        }
        if (d1Var.v >= 2) {
            imageView.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_on));
        }
        if (d1Var.v >= 3) {
            imageView2.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_on));
        }
        if (d1Var.v >= 4) {
            imageView3.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_on));
        }
        if (d1Var.v == 5) {
            imageView4.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_on));
        }
    }
}
