package j5;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends MetricAffectingSpan {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f6667m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f6668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Typeface f6669b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f6670l;

    public e(float f, Typeface typeface, int i) {
        this.f6668a = f;
        this.f6669b = typeface;
        this.f6670l = i;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.getClass();
        textPaint.setTextSize(this.f6668a);
        textPaint.setTypeface(this.f6669b);
        textPaint.setColor(this.f6670l);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.getClass();
        textPaint.setTextSize(this.f6668a);
        textPaint.setTypeface(this.f6669b);
        textPaint.setColor(this.f6670l);
    }
}
