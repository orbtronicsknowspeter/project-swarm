package com.google.android.material.color.utilities;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2989a;

    public /* synthetic */ f(int i) {
        this.f2989a = i;
    }

    public /* synthetic */ Function andThen(Function function) {
        int i = this.f2989a;
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f2989a) {
            case 0:
                return MaterialDynamicColors.lambda$secondaryFixed$118((DynamicScheme) obj);
            case 1:
                return ((DynamicScheme) obj).primaryPalette;
            case 2:
                return MaterialDynamicColors.lambda$onPrimaryFixedVariant$114((DynamicScheme) obj);
            case 3:
                return ((DynamicScheme) obj).tertiaryPalette;
            case 4:
                return MaterialDynamicColors.lambda$tertiaryFixedDim$135((DynamicScheme) obj);
            case 5:
                return ((DynamicScheme) obj).errorPalette;
            case 6:
                return MaterialDynamicColors.lambda$onError$95((DynamicScheme) obj);
            case 7:
                return ((DynamicScheme) obj).neutralPalette;
            case 8:
                return MaterialDynamicColors.lambda$textPrimaryInverseDisableOnly$157((DynamicScheme) obj);
            case 9:
                return ((DynamicScheme) obj).primaryPalette;
            case 10:
                return ((DynamicScheme) obj).secondaryPalette;
            case 11:
                return MaterialDynamicColors.lambda$secondaryFixedDim$121((DynamicScheme) obj);
            case 12:
                return ((DynamicScheme) obj).neutralPalette;
            case 13:
                return ((DynamicScheme) obj).neutralVariantPalette;
            case 14:
                return MaterialDynamicColors.lambda$surfaceVariant$34((DynamicScheme) obj);
            case 15:
                return ((DynamicScheme) obj).neutralVariantPalette;
            case 16:
                return MaterialDynamicColors.lambda$neutralVariantPaletteKeyColor$9((DynamicScheme) obj);
            case 17:
                return ((DynamicScheme) obj).neutralPalette;
            case 18:
                return MaterialDynamicColors.lambda$textHintInverse$161((DynamicScheme) obj);
            case 19:
                return ((DynamicScheme) obj).neutralPalette;
            case 20:
                return MaterialDynamicColors.lambda$shadow$47((DynamicScheme) obj);
            case 21:
                return ((DynamicScheme) obj).neutralPalette;
            case 22:
                return MaterialDynamicColors.lambda$onSurface$32((DynamicScheme) obj);
            case 23:
                return MaterialDynamicColors.lambda$surfaceContainerHighest$30((DynamicScheme) obj);
            case 24:
                return ((DynamicScheme) obj).primaryPalette;
            case 25:
                return MaterialDynamicColors.lambda$primaryFixed$104((DynamicScheme) obj);
            case 26:
                return ((DynamicScheme) obj).primaryPalette;
            case 27:
                return MaterialDynamicColors.lambda$primaryFixedDim$107((DynamicScheme) obj);
            case 28:
                return ((DynamicScheme) obj).tertiaryPalette;
            default:
                return (Character) ((Object[]) obj)[0];
        }
    }

    public /* synthetic */ Function compose(Function function) {
        int i = this.f2989a;
        return Function$CC.$default$compose(this, function);
    }
}
