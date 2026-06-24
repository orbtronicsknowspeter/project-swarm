package g4;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s0 f5247b;

    public /* synthetic */ q0(s0 s0Var, int i) {
        this.f5246a = i;
        this.f5247b = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f5246a) {
            case 0:
                this.f5247b.E();
                m4.b bVar = f4.c.f4886z;
                bVar.getClass();
                bVar.d(false);
                break;
            case 1:
                this.f5247b.E();
                m4.b bVar2 = f4.c.f4886z;
                bVar2.getClass();
                bVar2.e();
                break;
            case 2:
                this.f5247b.E();
                break;
            case 3:
                this.f5247b.E();
                break;
            default:
                this.f5247b.E();
                break;
        }
    }
}
