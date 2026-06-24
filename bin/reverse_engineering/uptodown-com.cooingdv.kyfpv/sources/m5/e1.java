package m5;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e1 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1 f7374b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x4.g f7375l;

    public /* synthetic */ e1(f1 f1Var, x4.g gVar, int i, int i6) {
        this.f7373a = i6;
        this.f7374b = f1Var;
        this.f7375l = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f7373a) {
            case 0:
                this.f7374b.f7381l.b(this.f7375l);
                break;
            case 1:
                this.f7374b.f7382m.f(this.f7375l);
                break;
            case 2:
                x4.g gVar = this.f7375l;
                f1 f1Var = this.f7374b;
                f1Var.f7381l.b(gVar);
                f1Var.i();
                break;
            default:
                this.f7374b.f7381l.b(this.f7375l);
                break;
        }
    }
}
