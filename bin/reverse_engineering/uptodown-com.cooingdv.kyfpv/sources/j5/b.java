package j5;

import android.graphics.LinearGradient;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearGradient f6664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f6665b;

    public b(LinearGradient linearGradient, float f) {
        this.f6664a = linearGradient;
        this.f6665b = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.getClass();
        textPaint.setShader(this.f6664a);
        textPaint.setTextSize(this.f6665b);
        textPaint.setColor(textPaint.linkColor);
    }
}
