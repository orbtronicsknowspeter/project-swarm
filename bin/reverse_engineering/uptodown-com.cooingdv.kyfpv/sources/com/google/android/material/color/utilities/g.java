package com.google.android.material.color.utilities;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialDynamicColors f2991b;

    public /* synthetic */ g(MaterialDynamicColors materialDynamicColors, int i) {
        this.f2990a = i;
        this.f2991b = materialDynamicColors;
    }

    public /* synthetic */ Function andThen(Function function) {
        int i = this.f2990a;
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f2990a) {
            case 0:
                return this.f2991b.lambda$secondaryFixed$119((DynamicScheme) obj);
            case 1:
                return this.f2991b.lambda$onPrimaryFixedVariant$115((DynamicScheme) obj);
            case 2:
                return this.f2991b.lambda$onPrimaryFixedVariant$116((DynamicScheme) obj);
            case 3:
                return this.f2991b.lambda$tertiaryFixedDim$136((DynamicScheme) obj);
            case 4:
                return this.f2991b.lambda$onTertiary$84((DynamicScheme) obj);
            case 5:
                return this.f2991b.lambda$onError$96((DynamicScheme) obj);
            case 6:
                return this.f2991b.lambda$onPrimaryContainer$62((DynamicScheme) obj);
            case 7:
                return this.f2991b.lambda$onPrimaryContainer$63((DynamicScheme) obj);
            case 8:
                return this.f2991b.lambda$secondaryFixedDim$122((DynamicScheme) obj);
            case 9:
                return this.f2991b.lambda$primaryFixed$105((DynamicScheme) obj);
            case 10:
                return this.f2991b.lambda$primaryFixedDim$108((DynamicScheme) obj);
            case 11:
                return this.f2991b.lambda$tertiaryContainer$86((DynamicScheme) obj);
            case 12:
                return this.f2991b.lambda$tertiaryContainer$87((DynamicScheme) obj);
            default:
                return this.f2991b.highestSurface((DynamicScheme) obj);
        }
    }

    public /* synthetic */ Function compose(Function function) {
        int i = this.f2990a;
        return Function$CC.$default$compose(this, function);
    }
}
