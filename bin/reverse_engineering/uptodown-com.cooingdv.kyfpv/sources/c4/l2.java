package c4;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import com.uptodown.R;
import com.uptodown.activities.LoginActivity;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class l2 implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f1818b;

    public /* synthetic */ l2(LoginActivity loginActivity, int i) {
        this.f1817a = i;
        this.f1818b = loginActivity;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        int i = this.f1817a;
        LoginActivity loginActivity = this.f1818b;
        animation.getClass();
        switch (i) {
            case 0:
                int i6 = LoginActivity.W;
                ((LinearLayout) loginActivity.G0().f10133l.f5273q).setVisibility(8);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setInterpolator(new AccelerateInterpolator());
                alphaAnimation.setDuration(200L);
                alphaAnimation.setAnimationListener(new l2(loginActivity, 3));
                ((LinearLayout) loginActivity.G0().f10134m.f8817b).setVisibility(0);
                ((LinearLayout) loginActivity.G0().f10134m.f8817b).startAnimation(alphaAnimation);
                break;
            case 1:
                int i10 = LoginActivity.W;
                ((LinearLayout) loginActivity.G0().f10134m.f8817b).setVisibility(8);
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation2.setInterpolator(new AccelerateInterpolator());
                alphaAnimation2.setDuration(200L);
                alphaAnimation2.setAnimationListener(new l2(loginActivity, 2));
                ((LinearLayout) loginActivity.G0().f10133l.f5273q).setVisibility(0);
                ((LinearLayout) loginActivity.G0().f10133l.f5273q).startAnimation(alphaAnimation2);
                break;
            case 2:
                int i11 = LoginActivity.W;
                ((LinearLayout) loginActivity.G0().f10133l.f5273q).setVisibility(0);
                loginActivity.G0().f10136o.setText(R.string.title_login);
                break;
            default:
                int i12 = LoginActivity.W;
                ((LinearLayout) loginActivity.G0().f10134m.f8817b).setVisibility(0);
                loginActivity.G0().f10136o.setText(R.string.title_sign_up);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i = this.f1817a;
        animation.getClass();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        int i = this.f1817a;
        animation.getClass();
    }
}
