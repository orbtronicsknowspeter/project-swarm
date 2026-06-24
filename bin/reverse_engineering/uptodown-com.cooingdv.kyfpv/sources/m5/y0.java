package m5;

import android.content.Context;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.i5;
import com.google.android.gms.internal.measurement.z3;
import com.uptodown.R;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class y0 extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t4.v0 f7640b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w4.c f7641l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w4.d f7642m;

    /* JADX WARN: Illegal instructions before constructor call */
    public y0(t4.v0 v0Var, w4.c cVar, w4.d dVar) {
        cVar.getClass();
        dVar.getClass();
        RelativeLayout relativeLayout = v0Var.f10160a;
        relativeLayout.getClass();
        Context context = relativeLayout.getContext();
        context.getClass();
        super(relativeLayout, context);
        this.f7640b = v0Var;
        this.f7641l = cVar;
        this.f7642m = dVar;
        v0Var.f10167q.setTypeface(f4.c.f4883w);
        v0Var.f10166p.setTypeface(f4.c.f4884x);
        v0Var.f10169s.setTypeface(f4.c.f4884x);
        v0Var.f10165o.setTypeface(f4.c.f4883w);
        v0Var.f10168r.setTypeface(f4.c.f4884x);
        v0Var.f10170t.setTypeface(f4.c.f4884x);
    }

    public final void g() {
        t4.v0 v0Var = this.f7640b;
        t0.f.s(v0Var.f10163m, v0Var.f10162l);
        v0Var.f10164n.setVisibility(8);
        v0Var.f10170t.setVisibility(8);
        v0Var.f10166p.setVisibility(0);
        v0Var.f10165o.setVisibility(0);
    }

    public final void h(String str) {
        g();
        t4.v0 v0Var = this.f7640b;
        v0Var.f10165o.setText(str);
        z3.J(v0Var.f10165o);
    }

    public final void i(int i, long j) {
        t4.v0 v0Var = this.f7640b;
        ProgressBar progressBar = v0Var.f10163m;
        ProgressBar progressBar2 = v0Var.f10163m;
        t0.f.I(progressBar, v0Var.f10162l);
        v0Var.f10165o.setVisibility(8);
        TextView textView = v0Var.f10166p;
        textView.setVisibility(0);
        v0Var.f10161b.setVisibility(0);
        v0Var.f10164n.setVisibility(0);
        v0Var.f10170t.setVisibility(0);
        TextView textView2 = v0Var.f10168r;
        if (i == 0) {
            textView2.setVisibility(0);
            textView2.setText(this.itemView.getContext().getString(R.string.status_download_update_pending));
            Context context = this.itemView.getContext();
            Context context2 = this.itemView.getContext();
            context2.getClass();
            textView.setText(context.getString(R.string.percent_of_total_size, 0, i5.H(context2, j)));
            progressBar2.setIndeterminate(true);
            return;
        }
        textView2.setVisibility(8);
        Context context3 = this.itemView.getContext();
        Integer numValueOf = Integer.valueOf(i);
        Context context4 = this.itemView.getContext();
        context4.getClass();
        textView.setText(context3.getString(R.string.percent_of_total_size, numValueOf, i5.H(context4, j)));
        progressBar2.setProgress(i);
        progressBar2.setIndeterminate(false);
    }

    public final void j(x4.g gVar, int i) {
        g();
        t4.v0 v0Var = this.f7640b;
        v0Var.f10165o.setText(R.string.option_button_install);
        TextView textView = v0Var.f10165o;
        textView.setOnClickListener(new x0(this, gVar, i, 1));
        z3.J(textView);
    }

    public final void k() {
        t4.v0 v0Var = this.f7640b;
        t0.f.I(v0Var.f10163m, v0Var.f10162l);
        v0Var.f10165o.setVisibility(8);
        v0Var.f10166p.setVisibility(8);
        v0Var.f10161b.setVisibility(0);
        TextView textView = v0Var.f10168r;
        textView.setVisibility(0);
        v0Var.f10170t.setVisibility(0);
        textView.setText(this.itemView.getContext().getString(R.string.installing));
        v0Var.f10163m.setIndeterminate(true);
    }
}
