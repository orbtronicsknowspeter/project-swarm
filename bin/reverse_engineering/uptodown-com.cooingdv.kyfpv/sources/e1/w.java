package e1;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.animation.DecelerateInterpolator;
import com.uptodown.util.views.UsernameTextView;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class w implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4334a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f4335b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f4336l;

    public w(y yVar, long j) {
        this.f4335b = j;
        Objects.requireNonNull(yVar);
        this.f4336l = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4334a;
        long j = this.f4335b;
        Object obj = this.f4336l;
        switch (i) {
            case 0:
                ((y) obj).m(j);
                break;
            case 1:
                m3 m3Var = (m3) obj;
                y yVar = m3Var.f3876a.f4272w;
                t1.j(yVar);
                yVar.j(j);
                m3Var.f4123n = null;
                break;
            default:
                UsernameTextView usernameTextView = (UsernameTextView) obj;
                ValueAnimator valueAnimator = usernameTextView.f3454a;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setDuration(j);
                valueAnimatorOfFloat.setRepeatCount(1);
                valueAnimatorOfFloat.setRepeatMode(2);
                valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
                valueAnimatorOfFloat.addUpdateListener(new com.google.android.material.motion.c(usernameTextView, 3));
                usernameTextView.f3454a = valueAnimatorOfFloat;
                valueAnimatorOfFloat.start();
                Handler animationHandler = usernameTextView.getAnimationHandler();
                if (animationHandler != null) {
                    animationHandler.postDelayed(this, usernameTextView.f3458n);
                }
                break;
        }
    }

    public w(m3 m3Var, long j) {
        this.f4335b = j;
        Objects.requireNonNull(m3Var);
        this.f4336l = m3Var;
    }

    public w(UsernameTextView usernameTextView, long j) {
        this.f4336l = usernameTextView;
        this.f4335b = j;
    }
}
