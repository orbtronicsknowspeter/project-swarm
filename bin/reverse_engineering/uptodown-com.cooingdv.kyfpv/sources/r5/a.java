package r5;

import com.inmobi.cmp.model.ChoiceError;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChoiceError f8909a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ChoiceError choiceError) {
        super(choiceError.getMessage());
        choiceError.getClass();
        this.f8909a = choiceError;
    }
}
