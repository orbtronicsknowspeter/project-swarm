package e4;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.uptodown.R;
import com.uptodown.UptodownApp;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class u extends m5.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g4.v f4700b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w4.c f4701l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f4702m;

    /* JADX WARN: Illegal instructions before constructor call */
    public u(v vVar, g4.v vVar2, w4.c cVar, Context context) {
        cVar.getClass();
        context.getClass();
        this.f4702m = vVar;
        RelativeLayout relativeLayout = (RelativeLayout) vVar2.f5279n;
        relativeLayout.getClass();
        super(relativeLayout, context);
        this.f4700b = vVar2;
        this.f4701l = cVar;
        ((TextView) vVar2.f5277l).setTypeface(f4.c.f4883w);
        ((TextView) vVar2.f5276b).setTypeface(f4.c.f4884x);
        ((TextView) vVar2.f5278m).setTypeface(f4.c.f4884x);
    }

    public final void g(x4.g gVar, boolean z9) {
        Context context = this.f4702m.f4707b;
        int dimension = (int) context.getResources().getDimension(R.dimen.margin_m);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (z9) {
            layoutParams.setMargins(dimension, 0, dimension, dimension);
        } else {
            layoutParams.setMargins(dimension, 0, 0, dimension);
        }
        this.itemView.setLayoutParams(layoutParams);
        String strE = gVar.e();
        g4.v vVar = this.f4700b;
        if (strE != null && strE.length() != 0) {
            a4.l0 l0VarE = a4.g0.d().e(gVar.f());
            float f = UptodownApp.I;
            l0VarE.h(b4.d.w(context));
            a4.k0 k0Var = l0VarE.f135b;
            k0Var.f = true;
            k0Var.g = 17;
            l0VarE.f136c = true;
            l0VarE.g(b4.d.f(context));
            l0VarE.e((ImageView) vVar.f5280o, null);
        }
        View view = this.itemView;
        view.getClass();
        m5.e.b(view, this.f4701l, gVar);
        TextView textView = (TextView) vVar.f5277l;
        TextView textView2 = (TextView) vVar.f5276b;
        m5.e.f(gVar, textView, textView2);
        d(gVar.F, (TextView) vVar.f5278m, textView2);
        e((ImageView) vVar.f5281p, gVar.i());
    }
}
