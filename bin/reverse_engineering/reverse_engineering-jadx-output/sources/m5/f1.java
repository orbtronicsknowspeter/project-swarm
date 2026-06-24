package m5;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.google.android.gms.internal.measurement.i5;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f1 extends e {
    public final ProgressBar A;
    public final ImageView B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.c f7379b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w4.d f7380l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w4.a f7381m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f7382n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final u4.p1 f7383o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RelativeLayout f7384p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ImageView f7385q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f7386r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextView f7387s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f7388t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView f7389u;
    public final TextView v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextView f7390w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final LinearLayout f7391x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final LinearLayout f7392y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final TextView f7393z;

    /* JADX WARN: Illegal instructions before constructor call */
    public f1(View view, w4.c cVar, w4.d dVar, w4.a aVar, boolean z9, u4.p1 p1Var) {
        cVar.getClass();
        dVar.getClass();
        aVar.getClass();
        Context context = view.getContext();
        context.getClass();
        super(view, context);
        this.f7379b = cVar;
        this.f7380l = dVar;
        this.f7381m = aVar;
        this.f7382n = z9;
        this.f7383o = p1Var;
        View viewFindViewById = view.findViewById(2131363114);
        viewFindViewById.getClass();
        this.f7384p = (RelativeLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(2131362418);
        viewFindViewById2.getClass();
        this.f7385q = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(2131364033);
        viewFindViewById3.getClass();
        TextView textView = (TextView) viewFindViewById3;
        this.f7386r = textView;
        TextView textView2 = (TextView) view.findViewById(2131364106);
        this.f7387s = textView2;
        View viewFindViewById4 = view.findViewById(2131363766);
        viewFindViewById4.getClass();
        TextView textView3 = (TextView) viewFindViewById4;
        this.f7388t = textView3;
        View viewFindViewById5 = view.findViewById(2131363616);
        viewFindViewById5.getClass();
        TextView textView4 = (TextView) viewFindViewById5;
        this.f7389u = textView4;
        TextView textView5 = (TextView) view.findViewById(2131364538);
        this.v = textView5;
        TextView textView6 = (TextView) view.findViewById(2131363840);
        this.f7390w = textView6;
        this.f7391x = (LinearLayout) view.findViewById(2131362668);
        View viewFindViewById6 = view.findViewById(2131362646);
        viewFindViewById6.getClass();
        this.f7392y = (LinearLayout) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(2131364189);
        viewFindViewById7.getClass();
        TextView textView7 = (TextView) viewFindViewById7;
        this.f7393z = textView7;
        View viewFindViewById8 = view.findViewById(2131363008);
        viewFindViewById8.getClass();
        this.A = (ProgressBar) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(2131364544);
        viewFindViewById9.getClass();
        TextView textView8 = (TextView) viewFindViewById9;
        TextView textView9 = (TextView) view.findViewById(2131363675);
        this.B = (ImageView) view.findViewById(2131362290);
        textView.setTypeface(f4.c.f4882w);
        if (textView2 != null) {
            textView2.setTypeface(f4.c.f4882w);
        }
        if (textView5 != null) {
            textView5.setTypeface(f4.c.f4883x);
        }
        if (textView6 != null) {
            textView6.setTypeface(f4.c.f4883x);
        }
        textView3.setTypeface(f4.c.f4883x);
        textView4.setTypeface(f4.c.f4882w);
        textView8.setTypeface(f4.c.f4883x);
        textView7.setTypeface(f4.c.f4883x);
        if (textView9 != null) {
            textView9.setTypeface(f4.c.f4883x);
        }
    }

    public final void g(x4.g gVar, int i) {
        t0.f.s(this.A, this.f7385q);
        e1 e1Var = new e1(this, gVar, i, 3);
        TextView textView = this.f7389u;
        textView.setOnClickListener(e1Var);
        this.f7392y.setVisibility(8);
        this.f7388t.setVisibility(0);
        textView.setVisibility(0);
    }

    public final void h(x4.r rVar, x4.g gVar, int i) {
        ImageView imageView = this.f7385q;
        ProgressBar progressBar = this.A;
        t0.f.I(progressBar, imageView);
        LinearLayout linearLayout = this.f7391x;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        TextView textView = this.f7389u;
        textView.setText(2131952425);
        textView.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), 2131231158));
        textView.setTextColor(ContextCompat.getColor(this.itemView.getContext(), 2131099713));
        textView.setOnClickListener(new g4.a(i, this, 3, gVar));
        this.f7388t.setVisibility(8);
        this.f7392y.setVisibility(0);
        int i6 = rVar.i();
        TextView textView2 = this.f7393z;
        if (i6 == 0) {
            textView2.setText(this.itemView.getContext().getString(2131952625));
            progressBar.setIndeterminate(true);
            return;
        }
        progressBar.setIndeterminate(false);
        Context context = this.itemView.getContext();
        Integer numValueOf = Integer.valueOf(rVar.i());
        long jK = rVar.k();
        Context context2 = this.itemView.getContext();
        context2.getClass();
        textView2.setText(context.getString(2131952467, numValueOf, i5.H(context2, jK)));
        progressBar.setProgress(rVar.i());
    }

    public final void i() {
        ImageView imageView = this.f7385q;
        ProgressBar progressBar = this.A;
        t0.f.I(progressBar, imageView);
        LinearLayout linearLayout = this.f7391x;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        this.f7389u.setVisibility(8);
        this.f7388t.setVisibility(8);
        this.f7392y.setVisibility(0);
        this.f7393z.setText(this.itemView.getContext().getString(2131952095));
        progressBar.setIndeterminate(true);
    }
}
