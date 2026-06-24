package g4;

import com.uptodown.core.activities.InstallerActivity;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class o0 extends v6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public kotlin.jvm.internal.x f5235b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f5236l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InstallerActivity f5237m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f5238n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(InstallerActivity installerActivity, v6.c cVar) {
        super(cVar);
        this.f5237m = installerActivity;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        this.f5236l = obj;
        this.f5238n |= Integer.MIN_VALUE;
        return this.f5237m.O(0, this);
    }
}
