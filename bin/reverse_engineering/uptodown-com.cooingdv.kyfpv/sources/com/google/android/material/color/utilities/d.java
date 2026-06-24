package com.google.android.material.color.utilities;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2987a;

    public /* synthetic */ d(int i) {
        this.f2987a = i;
    }

    public /* synthetic */ Function andThen(Function function) {
        int i = this.f2987a;
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        DynamicScheme dynamicScheme = (DynamicScheme) obj;
        switch (this.f2987a) {
            case 0:
                return dynamicScheme.neutralPalette;
            case 1:
                return MaterialDynamicColors.lambda$inverseSurface$38(dynamicScheme);
            case 2:
                return MaterialDynamicColors.lambda$surfaceDim$18(dynamicScheme);
            case 3:
                return dynamicScheme.errorPalette;
            case 4:
                return MaterialDynamicColors.lambda$onErrorContainer$101(dynamicScheme);
            case 5:
                return dynamicScheme.neutralVariantPalette;
            case 6:
                return MaterialDynamicColors.lambda$textSecondaryAndTertiaryInverse$155(dynamicScheme);
            case 7:
                return dynamicScheme.errorPalette;
            case 8:
                return MaterialDynamicColors.lambda$errorContainer$98(dynamicScheme);
            case 9:
                return dynamicScheme.tertiaryPalette;
            case 10:
                return MaterialDynamicColors.lambda$tertiaryFixed$132(dynamicScheme);
            case 11:
                return dynamicScheme.neutralVariantPalette;
            case 12:
                return dynamicScheme.primaryPalette;
            case 13:
                return MaterialDynamicColors.lambda$primary$53(dynamicScheme);
            case 14:
                return dynamicScheme.neutralPalette;
            case 15:
                return MaterialDynamicColors.lambda$scrim$49(dynamicScheme);
            case 16:
                return dynamicScheme.secondaryPalette;
            case 17:
                return MaterialDynamicColors.lambda$onSecondaryFixedVariant$128(dynamicScheme);
            case 18:
                return MaterialDynamicColors.lambda$controlNormal$148(dynamicScheme);
            case 19:
                return dynamicScheme.tertiaryPalette;
            case 20:
                return MaterialDynamicColors.lambda$tertiary$80(dynamicScheme);
            case 21:
                return dynamicScheme.primaryPalette;
            case 22:
                return MaterialDynamicColors.lambda$controlActivated$146(dynamicScheme);
            case 23:
                return dynamicScheme.primaryPalette;
            case 24:
                return MaterialDynamicColors.lambda$primaryPaletteKeyColor$1(dynamicScheme);
            case 25:
                return MaterialDynamicColors.lambda$surface$16(dynamicScheme);
            case 26:
                return dynamicScheme.tertiaryPalette;
            case 27:
                return MaterialDynamicColors.lambda$onTertiaryFixedVariant$142(dynamicScheme);
            case 28:
                return dynamicScheme.secondaryPalette;
            default:
                return MaterialDynamicColors.lambda$secondaryPaletteKeyColor$3(dynamicScheme);
        }
    }

    public /* synthetic */ Function compose(Function function) {
        int i = this.f2987a;
        return Function$CC.$default$compose(this, function);
    }
}
