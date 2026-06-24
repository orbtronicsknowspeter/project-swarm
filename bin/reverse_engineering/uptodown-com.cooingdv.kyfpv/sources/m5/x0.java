package m5;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0 f7635b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x4.g f7636l;

    public /* synthetic */ x0(y0 y0Var, x4.g gVar, int i, int i6) {
        this.f7634a = i6;
        this.f7635b = y0Var;
        this.f7636l = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f7634a) {
            case 0:
                this.f7635b.f7642m.b(this.f7636l);
                break;
            default:
                x4.g gVar = this.f7636l;
                y0 y0Var = this.f7635b;
                y0Var.f7642m.b(gVar);
                y0Var.k();
                break;
        }
    }
}
