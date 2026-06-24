package m5;

import android.content.Context;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.i5;
import com.google.android.gms.internal.measurement.z3;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class y0 extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t4.v0 f7639b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w4.c f7640l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w4.d f7641m;

    /* JADX WARN: Illegal instructions before constructor call */
    public y0(t4.v0 v0Var, w4.c cVar, w4.d dVar) {
        cVar.getClass();
        dVar.getClass();
        RelativeLayout relativeLayout = v0Var.f10159a;
        relativeLayout.getClass();
        Context context = relativeLayout.getContext();
        context.getClass();
        super(relativeLayout, context);
        this.f7639b = v0Var;
        this.f7640l = cVar;
        this.f7641m = dVar;
        v0Var.f10166q.setTypeface(f4.c.f4882w);
        v0Var.f10165p.setTypeface(f4.c.f4883x);
        v0Var.f10168s.setTypeface(f4.c.f4883x);
        v0Var.f10164o.setTypeface(f4.c.f4882w);
        v0Var.f10167r.setTypeface(f4.c.f4883x);
        v0Var.f10169t.setTypeface(f4.c.f4883x);
    }

    public final void g() {
        t4.v0 v0Var = this.f7639b;
        t0.f.s(v0Var.f10162m, v0Var.f10161l);
        v0Var.f10163n.setVisibility(8);
        v0Var.f10169t.setVisibility(8);
        v0Var.f10165p.setVisibility(0);
        v0Var.f10164o.setVisibility(0);
    }

    public final void h(String str) {
        g();
        t4.v0 v0Var = this.f7639b;
        v0Var.f10164o.setText(str);
        z3.J(v0Var.f10164o);
    }

    public final void i(int i, long j) {
        t4.v0 v0Var = this.f7639b;
        ProgressBar progressBar = v0Var.f10162m;
        ProgressBar progressBar2 = v0Var.f10162m;
        t0.f.I(progressBar, v0Var.f10161l);
        v0Var.f10164o.setVisibility(8);
        TextView textView = v0Var.f10165p;
        textView.setVisibility(0);
        v0Var.f10160b.setVisibility(0);
        v0Var.f10163n.setVisibility(0);
        v0Var.f10169t.setVisibility(0);
        TextView textView2 = v0Var.f10167r;
        if (i == 0) {
            textView2.setVisibility(0);
            textView2.setText(this.itemView.getContext().getString(2131952625));
            Context context = this.itemView.getContext();
            Context context2 = this.itemView.getContext();
            context2.getClass();
            textView.setText(context.getString(2131952467, 0, i5.H(context2, j)));
            progressBar2.setIndeterminate(true);
            return;
        }
        textView2.setVisibility(8);
        Context context3 = this.itemView.getContext();
        Integer numValueOf = Integer.valueOf(i);
        Context context4 = this.itemView.getContext();
        context4.getClass();
        textView.setText(context3.getString(2131952467, numValueOf, i5.H(context4, j)));
        progressBar2.setProgress(i);
        progressBar2.setIndeterminate(false);
    }

    public final void j(x4.g gVar, int i) {
        g();
        t4.v0 v0Var = this.f7639b;
        v0Var.f10164o.setText(2131952428);
        TextView textView = v0Var.f10164o;
        textView.setOnClickListener(new x0(this, gVar, i, 1));
        z3.J(textView);
    }

    public final void k() {
        t4.v0 v0Var = this.f7639b;
        t0.f.I(v0Var.f10162m, v0Var.f10161l);
        v0Var.f10164o.setVisibility(8);
        v0Var.f10165p.setVisibility(8);
        v0Var.f10160b.setVisibility(0);
        TextView textView = v0Var.f10167r;
        textView.setVisibility(0);
        v0Var.f10169t.setVisibility(0);
        textView.setText(this.itemView.getContext().getString(2131952095));
        v0Var.f10162m.setIndeterminate(true);
    }
}
