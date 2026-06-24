package m5;

import android.animation.ValueAnimator;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f7435b;

    public /* synthetic */ j0(l0 l0Var, int i) {
        this.f7434a = i;
        this.f7435b = l0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f7434a) {
            case 0:
                valueAnimator.getClass();
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                float fFloatValue = ((Float) animatedValue).floatValue();
                TextView textView = this.f7435b.f7458m;
                textView.setScaleX(fFloatValue);
                textView.setScaleY(fFloatValue);
                int i = (int) ((1 - fFloatValue) * 10);
                textView.setPadding(i, i, i, i);
                break;
            default:
                valueAnimator.getClass();
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                animatedValue2.getClass();
                float fFloatValue2 = ((Float) animatedValue2).floatValue();
                TextView textView2 = this.f7435b.f7458m;
                textView2.setScaleX(fFloatValue2);
                textView2.setScaleY(fFloatValue2);
                int i6 = (int) ((1 - fFloatValue2) * 10);
                textView2.setPadding(i6, i6, i6, i6);
                break;
        }
    }
}
