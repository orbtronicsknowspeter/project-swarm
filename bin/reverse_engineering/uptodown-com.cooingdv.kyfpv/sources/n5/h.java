package n5;

import android.animation.ValueAnimator;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageView f8090b;

    public /* synthetic */ h(ImageView imageView, int i) {
        this.f8089a = i;
        this.f8090b = imageView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8089a) {
            case 0:
                valueAnimator.getClass();
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                float fFloatValue = ((Float) animatedValue).floatValue();
                ImageView imageView = this.f8090b;
                imageView.setScaleX(fFloatValue);
                imageView.setScaleY(fFloatValue);
                int i = (int) ((1 - fFloatValue) * 10);
                imageView.setPadding(i, i, i, i);
                break;
            default:
                valueAnimator.getClass();
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                animatedValue2.getClass();
                float fFloatValue2 = ((Float) animatedValue2).floatValue();
                ImageView imageView2 = this.f8090b;
                imageView2.setScaleX(fFloatValue2);
                imageView2.setScaleY(fFloatValue2);
                int i6 = (int) ((1 - fFloatValue2) * 10);
                imageView2.setPadding(i6, i6, i6, i6);
                break;
        }
    }
}
