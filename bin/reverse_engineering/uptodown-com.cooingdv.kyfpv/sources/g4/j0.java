package g4;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class j0 implements k4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a4.d0 f5198b;

    public /* synthetic */ j0(a4.d0 d0Var, int i) {
        this.f5197a = i;
        this.f5198b = d0Var;
    }

    @Override // k4.b
    public final void a(int i) {
        switch (this.f5197a) {
            case 0:
                ((l4.n) ((ArrayList) this.f5198b.f83m).get(i)).f7122b = !((l4.n) ((ArrayList) r0.f83m).get(i)).f7122b;
                break;
            default:
                ((l4.n) ((ArrayList) this.f5198b.f84n).get(i)).f7122b = !((l4.n) ((ArrayList) r0.f84n).get(i)).f7122b;
                break;
        }
    }
}
