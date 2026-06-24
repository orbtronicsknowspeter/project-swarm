package c4;

import com.uptodown.activities.SecurityActivity;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class ha extends kotlin.jvm.internal.m implements d7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SecurityActivity f1691a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha(SecurityActivity securityActivity) {
        super(0);
        this.f1691a = securityActivity;
    }

    @Override // d7.a
    public final Object invoke() {
        return this.f1691a.getDefaultViewModelProviderFactory();
    }
}
