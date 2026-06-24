package j5;

import c4.k0;
import com.uptodown.UptodownApp;
import p6.x;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements d7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f6697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x4.g f6698b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k0 f6699l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w4.g f6700m;

    public /* synthetic */ k(boolean z9, x4.g gVar, k0 k0Var, w4.g gVar2) {
        this.f6697a = z9;
        this.f6698b = gVar;
        this.f6699l = k0Var;
        this.f6700m = gVar2;
    }

    @Override // d7.a
    public final Object invoke() {
        x4.r rVarD;
        if (this.f6697a) {
            float f = UptodownApp.I;
            rVarD = b4.d.D(this.f6698b, this.f6699l);
        } else {
            rVarD = null;
        }
        this.f6700m.u(rVarD);
        return x.f8464a;
    }
}
