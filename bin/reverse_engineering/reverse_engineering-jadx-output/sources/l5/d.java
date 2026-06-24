package l5;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return (float) ((Math.cos(10.0d * ((double) f)) * Math.pow(2.718281828459045d, ((double) (-f)) / 0.2d) * ((double) (-1))) + ((double) 1));
    }
}
