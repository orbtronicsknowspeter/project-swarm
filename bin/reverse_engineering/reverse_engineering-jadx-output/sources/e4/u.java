package e4;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.uptodown.UptodownApp;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class u extends m5.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g4.v f4699b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w4.c f4700l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f4701m;

    /* JADX WARN: Illegal instructions before constructor call */
    public u(v vVar, g4.v vVar2, w4.c cVar, Context context) {
        cVar.getClass();
        context.getClass();
        this.f4701m = vVar;
        RelativeLayout relativeLayout = (RelativeLayout) vVar2.f5278n;
        relativeLayout.getClass();
        super(relativeLayout, context);
        this.f4699b = vVar2;
        this.f4700l = cVar;
        ((TextView) vVar2.f5276l).setTypeface(f4.c.f4882w);
        ((TextView) vVar2.f5275b).setTypeface(f4.c.f4883x);
        ((TextView) vVar2.f5277m).setTypeface(f4.c.f4883x);
    }

    public final void g(x4.g gVar, boolean z9) {
        Context context = this.f4701m.f4706b;
        int dimension = (int) context.getResources().getDimension(2131166251);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (z9) {
            layoutParams.setMargins(dimension, 0, dimension, dimension);
        } else {
            layoutParams.setMargins(dimension, 0, 0, dimension);
        }
        this.itemView.setLayoutParams(layoutParams);
        String strE = gVar.e();
        g4.v vVar = this.f4699b;
        if (strE != null && strE.length() != 0) {
            a4.l0 l0VarE = a4.g0.d().e(gVar.f());
            float f = UptodownApp.I;
            l0VarE.h(b4.d.w(context));
            a4.k0 k0Var = l0VarE.f135b;
            k0Var.f = true;
            k0Var.g = 17;
            l0VarE.f136c = true;
            l0VarE.g(b4.d.f(context));
            l0VarE.e((ImageView) vVar.f5279o, null);
        }
        View view = this.itemView;
        view.getClass();
        m5.e.b(view, this.f4700l, gVar);
        TextView textView = (TextView) vVar.f5276l;
        TextView textView2 = (TextView) vVar.f5275b;
        m5.e.f(gVar, textView, textView2);
        d(gVar.F, (TextView) vVar.f5277m, textView2);
        e((ImageView) vVar.f5280p, gVar.i());
    }
}
