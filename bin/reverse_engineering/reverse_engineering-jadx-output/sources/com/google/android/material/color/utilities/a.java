package com.google.android.material.color.utilities;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2983b;

    public /* synthetic */ a(Object obj, int i) {
        this.f2982a = i;
        this.f2983b = obj;
    }

    public /* synthetic */ Function andThen(Function function) {
        int i = this.f2982a;
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f2982a) {
            case 0:
                return DynamicColor.lambda$fromArgb$0((TonalPalette) this.f2983b, (DynamicScheme) obj);
            case 1:
                return DynamicColor.lambda$fromArgb$1((Hct) this.f2983b, (DynamicScheme) obj);
            default:
                return ((TemperatureCache) this.f2983b).lambda$getHctsByTemp$0((Hct) obj);
        }
    }

    public /* synthetic */ Function compose(Function function) {
        int i = this.f2982a;
        return Function$CC.$default$compose(this, function);
    }
}
