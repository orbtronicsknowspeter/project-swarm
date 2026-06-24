package c4;

import com.uptodown.activities.WishlistActivity;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class ud extends kotlin.jvm.internal.m implements d7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WishlistActivity f2188b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ud(WishlistActivity wishlistActivity, int i) {
        super(0);
        this.f2187a = i;
        this.f2188b = wishlistActivity;
    }

    @Override // d7.a
    public final Object invoke() {
        switch (this.f2187a) {
            case 0:
                return this.f2188b.getViewModelStore();
            default:
                return this.f2188b.getDefaultViewModelCreationExtras();
        }
    }
}
