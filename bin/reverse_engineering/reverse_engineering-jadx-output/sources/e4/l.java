package e4;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.uptodown.UptodownApp;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends m5.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.c f4591b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w4.a f4592l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ImageView f4593m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ProgressBar f4594n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ImageView f4595o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f4596p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f4597q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f4598r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextView f4599s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinearLayout f4600t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView f4601u;

    /* JADX WARN: Illegal instructions before constructor call */
    public l(View view, w4.c cVar, w4.a aVar) {
        cVar.getClass();
        aVar.getClass();
        Context context = view.getContext();
        context.getClass();
        super(view, context);
        this.f4591b = cVar;
        this.f4592l = aVar;
        this.f4593m = (ImageView) view.findViewById(2131362371);
        View viewFindViewById = view.findViewById(2131363015);
        viewFindViewById.getClass();
        this.f4594n = (ProgressBar) viewFindViewById;
        this.f4595o = (ImageView) view.findViewById(2131362427);
        TextView textView = (TextView) view.findViewById(2131364049);
        this.f4596p = textView;
        TextView textView2 = (TextView) view.findViewById(2131364109);
        this.f4597q = textView2;
        TextView textView3 = (TextView) view.findViewById(2131363775);
        this.f4598r = textView3;
        View viewFindViewById2 = view.findViewById(2131364196);
        viewFindViewById2.getClass();
        TextView textView4 = (TextView) viewFindViewById2;
        this.f4599s = textView4;
        View viewFindViewById3 = view.findViewById(2131364553);
        viewFindViewById3.getClass();
        View viewFindViewById4 = view.findViewById(2131362717);
        viewFindViewById4.getClass();
        this.f4600t = (LinearLayout) viewFindViewById4;
        this.f4601u = (TextView) view.findViewById(2131364338);
        textView.setTypeface(f4.c.f4882w);
        textView2.setTypeface(f4.c.f4882w);
        textView3.setTypeface(f4.c.f4883x);
        textView4.setTypeface(f4.c.f4883x);
        ((TextView) viewFindViewById3).setTypeface(f4.c.f4883x);
    }

    public final void g(x4.g gVar, int i, int i6, boolean z9) {
        int dimension = (int) this.itemView.getContext().getResources().getDimension(2131166251);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (z9) {
            layoutParams.setMargins(dimension, 0, dimension, dimension);
        } else {
            layoutParams.setMargins(dimension, 0, 0, dimension);
        }
        ImageView imageView = this.f4593m;
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        layoutParams2.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        if (i == 1) {
            marginLayoutParams.setMarginStart((int) this.itemView.getContext().getResources().getDimension(2131166251));
        }
        imageView.setLayoutParams(marginLayoutParams);
        this.itemView.setLayoutParams(layoutParams);
        this.f4597q.setText(String.valueOf(i));
        String strE = gVar.e();
        if (strE == null || strE.length() == 0) {
            androidx.lifecycle.l.A(this.itemView, 2131231216, imageView);
        } else {
            a4.l0 l0VarE = a4.g0.d().e(gVar.f());
            float f = UptodownApp.I;
            Context context = this.itemView.getContext();
            context.getClass();
            l0VarE.h(b4.d.w(context));
            a4.k0 k0Var = l0VarE.f135b;
            k0Var.f = true;
            k0Var.g = 17;
            l0VarE.f136c = true;
            Context context2 = imageView.getContext();
            context2.getClass();
            l0VarE.g(b4.d.f(context2));
            l0VarE.e(imageView, null);
        }
        View view = this.itemView;
        view.getClass();
        m5.e.b(view, this.f4591b, gVar);
        this.itemView.setOnLongClickListener(new d4.d(this, gVar, i6, 3));
        TextView textView = this.f4596p;
        textView.getClass();
        TextView textView2 = this.f4598r;
        textView2.getClass();
        m5.e.f(gVar, textView, textView2);
        ImageView imageView2 = this.f4595o;
        imageView2.getClass();
        e(imageView2, gVar.i());
        c(gVar, this.f4594n, imageView2, textView2, this.f4599s, this.f4601u, this.f4600t);
    }
}
