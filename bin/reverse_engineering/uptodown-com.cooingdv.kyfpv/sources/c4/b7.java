package c4;

import com.uptodown.activities.PreregistrationActivity;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b7 extends kotlin.jvm.internal.m implements d7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PreregistrationActivity f1422a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7(PreregistrationActivity preregistrationActivity) {
        super(0);
        this.f1422a = preregistrationActivity;
    }

    @Override // d7.a
    public final Object invoke() {
        return this.f1422a.getDefaultViewModelProviderFactory();
    }
}
