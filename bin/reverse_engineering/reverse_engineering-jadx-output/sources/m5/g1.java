package m5;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class g1 extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.c f7398b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w4.a f7399l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f7400m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final RelativeLayout f7401n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ImageView f7402o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ProgressBar f7403p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f7404q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f7405r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextView f7406s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f7407t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView f7408u;
    public final LinearLayout v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ImageView f7409w;

    /* JADX WARN: Illegal instructions before constructor call */
    public g1(View view, w4.c cVar, w4.a aVar, boolean z9) {
        cVar.getClass();
        Context context = view.getContext();
        context.getClass();
        super(view, context);
        this.f7398b = cVar;
        this.f7399l = aVar;
        this.f7400m = z9;
        View viewFindViewById = view.findViewById(2131363115);
        viewFindViewById.getClass();
        this.f7401n = (RelativeLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(2131362419);
        viewFindViewById2.getClass();
        this.f7402o = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(2131363009);
        viewFindViewById3.getClass();
        this.f7403p = (ProgressBar) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(2131364034);
        viewFindViewById4.getClass();
        TextView textView = (TextView) viewFindViewById4;
        this.f7404q = textView;
        TextView textView2 = (TextView) view.findViewById(2131364107);
        this.f7405r = textView2;
        View viewFindViewById5 = view.findViewById(2131363767);
        viewFindViewById5.getClass();
        TextView textView3 = (TextView) viewFindViewById5;
        this.f7406s = textView3;
        View viewFindViewById6 = view.findViewById(2131364331);
        viewFindViewById6.getClass();
        TextView textView4 = (TextView) viewFindViewById6;
        this.f7407t = textView4;
        View viewFindViewById7 = view.findViewById(2131364190);
        viewFindViewById7.getClass();
        TextView textView5 = (TextView) viewFindViewById7;
        this.f7408u = textView5;
        View viewFindViewById8 = view.findViewById(2131364545);
        viewFindViewById8.getClass();
        TextView textView6 = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(2131362712);
        viewFindViewById9.getClass();
        this.v = (LinearLayout) viewFindViewById9;
        this.f7409w = (ImageView) view.findViewById(2131362290);
        textView.setTypeface(f4.c.f4882w);
        if (textView2 != null) {
            textView2.setTypeface(f4.c.f4882w);
        }
        textView3.setTypeface(f4.c.f4883x);
        textView4.setTypeface(f4.c.f4883x);
        textView5.setTypeface(f4.c.f4883x);
        textView6.setTypeface(f4.c.f4883x);
    }

    public final void g(x4.g gVar, int i) {
        gVar.getClass();
        w4.c cVar = this.f7398b;
        RelativeLayout relativeLayout = this.f7401n;
        e.b(relativeLayout, cVar, gVar);
        relativeLayout.setOnLongClickListener(new d4.d(this, gVar, i, 10));
        TextView textView = this.f7405r;
        if (i > 0) {
            if (textView != null) {
                textView.setText(this.itemView.getContext().getResources().getString(2131952659, String.valueOf(i)));
            }
            if (textView != null) {
                textView.setVisibility(0);
            }
        } else if (textView != null) {
            textView.setVisibility(8);
        }
        ImageView imageView = this.f7409w;
        if (imageView != null) {
            imageView.setVisibility(this.f7400m ? 0 : 8);
        }
        if (imageView != null) {
            imageView.setOnClickListener(new g4.b0(this, gVar, i));
        }
        e.f(gVar, this.f7404q, this.f7406s);
        e(this.f7402o, gVar.i());
        c(gVar, this.f7403p, this.f7402o, this.f7406s, this.f7408u, this.f7407t, this.v);
    }
}
