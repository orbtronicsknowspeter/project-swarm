package e4;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k1 implements View.OnLongClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f4590b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x4.g f4591l;

    public /* synthetic */ k1(l1 l1Var, x4.g gVar, int i, int i6) {
        this.f4589a = i6;
        this.f4590b = l1Var;
        this.f4591l = gVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.f4589a) {
            case 0:
                this.f4590b.f4608l.e(this.f4591l);
                break;
            default:
                this.f4590b.f4608l.e(this.f4591l);
                break;
        }
        return true;
    }
}
