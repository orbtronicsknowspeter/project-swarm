package m5;

import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import c4.w6;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f7375a;

    public final void a(ProgressBar progressBar, ImageView imageView) {
        progressBar.getClass();
        imageView.getClass();
        if (progressBar.getVisibility() != 0 || this.f7375a) {
            return;
        }
        this.f7375a = true;
        this.itemView.getContext().getClass();
        androidx.work.impl.utils.c cVar = new androidx.work.impl.utils.c(11, progressBar, this);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.6f, 1.0f);
        valueAnimatorOfFloat.setStartDelay(200L);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new n5.h(imageView, 0));
        valueAnimatorOfFloat.addListener(new n5.i(0, cVar));
        valueAnimatorOfFloat.start();
    }

    public final void b(ProgressBar progressBar, ImageView imageView) {
        progressBar.getClass();
        imageView.getClass();
        if (progressBar.getVisibility() != 8 || this.f7375a) {
            return;
        }
        progressBar.setVisibility(0);
        this.f7375a = true;
        this.itemView.getContext().getClass();
        w6 w6Var = new w6(this, 21);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.6f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new n5.h(imageView, 1));
        valueAnimatorOfFloat.addListener(new n5.i(1, w6Var));
        valueAnimatorOfFloat.start();
    }
}
