package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class CorePalette {

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public TonalPalette f2969a1;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public TonalPalette f2970a2;

    /* JADX INFO: renamed from: a3, reason: collision with root package name */
    public TonalPalette f2971a3;
    public TonalPalette error;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public TonalPalette f2972n1;

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    public TonalPalette f2973n2;

    private CorePalette(int i, boolean z9) {
        Hct hctFromInt = Hct.fromInt(i);
        double hue = hctFromInt.getHue();
        double chroma = hctFromInt.getChroma();
        if (z9) {
            this.f2969a1 = TonalPalette.fromHueAndChroma(hue, chroma);
            this.f2970a2 = TonalPalette.fromHueAndChroma(hue, chroma / 3.0d);
            this.f2971a3 = TonalPalette.fromHueAndChroma(60.0d + hue, chroma / 2.0d);
            this.f2972n1 = TonalPalette.fromHueAndChroma(hue, Math.min(chroma / 12.0d, 4.0d));
            this.f2973n2 = TonalPalette.fromHueAndChroma(hue, Math.min(chroma / 6.0d, 8.0d));
        } else {
            this.f2969a1 = TonalPalette.fromHueAndChroma(hue, Math.max(48.0d, chroma));
            this.f2970a2 = TonalPalette.fromHueAndChroma(hue, 16.0d);
            this.f2971a3 = TonalPalette.fromHueAndChroma(60.0d + hue, 24.0d);
            this.f2972n1 = TonalPalette.fromHueAndChroma(hue, 4.0d);
            this.f2973n2 = TonalPalette.fromHueAndChroma(hue, 8.0d);
        }
        this.error = TonalPalette.fromHueAndChroma(25.0d, 84.0d);
    }

    public static CorePalette contentOf(int i) {
        return new CorePalette(i, true);
    }

    public static CorePalette of(int i) {
        return new CorePalette(i, false);
    }
}
