package e4;

import android.content.Context;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends m5.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g4.v f4527b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w4.b f4528l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g0 f4529m;

    /* JADX WARN: Illegal instructions before constructor call */
    public f0(g0 g0Var, g4.v vVar, w4.b bVar) {
        bVar.getClass();
        this.f4529m = g0Var;
        RelativeLayout relativeLayout = (RelativeLayout) vVar.f5278n;
        relativeLayout.getClass();
        Context context = relativeLayout.getContext();
        context.getClass();
        super(relativeLayout, context);
        this.f4527b = vVar;
        this.f4528l = bVar;
        ((TextView) vVar.f5276l).setTypeface(f4.c.f4882w);
        ((TextView) vVar.f5275b).setTypeface(f4.c.f4883x);
    }
}
