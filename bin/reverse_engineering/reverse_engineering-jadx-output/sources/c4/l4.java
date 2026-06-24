package c4;

import com.uptodown.activities.MyApps;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class l4 extends kotlin.jvm.internal.m implements d7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MyApps f1823a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(MyApps myApps) {
        super(0);
        this.f1823a = myApps;
    }

    @Override // d7.a
    public final Object invoke() {
        return this.f1823a.getDefaultViewModelProviderFactory();
    }
}
