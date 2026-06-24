package m5;

import android.animation.ValueAnimator;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n1 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f7487b;

    public /* synthetic */ n1(p1 p1Var, int i) {
        this.f7486a = i;
        this.f7487b = p1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f7486a) {
            case 0:
                valueAnimator.getClass();
                ImageView imageView = this.f7487b.f7508b;
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                int iIntValue = ((Integer) animatedValue).intValue();
                imageView.setPadding(iIntValue, iIntValue, iIntValue, iIntValue);
                break;
            default:
                valueAnimator.getClass();
                ImageView imageView2 = this.f7487b.f7508b;
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                animatedValue2.getClass();
                int iIntValue2 = ((Integer) animatedValue2).intValue();
                imageView2.setPadding(iIntValue2, iIntValue2, iIntValue2, iIntValue2);
                break;
        }
    }
}
