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
public final class d1 extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.c f7355b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w4.d f7356l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w4.a f7357m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final RelativeLayout f7358n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ImageView f7359o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f7360p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f7361q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f7362r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextView f7363s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f7364t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView f7365u;
    public final LinearLayout v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LinearLayout f7366w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ProgressBar f7367x;

    /* JADX WARN: Illegal instructions before constructor call */
    public d1(View view, w4.c cVar, w4.d dVar, w4.a aVar) {
        cVar.getClass();
        dVar.getClass();
        aVar.getClass();
        Context context = view.getContext();
        context.getClass();
        super(view, context);
        this.f7355b = cVar;
        this.f7356l = dVar;
        this.f7357m = aVar;
        View viewFindViewById = view.findViewById(2131363114);
        viewFindViewById.getClass();
        this.f7358n = (RelativeLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(2131362418);
        viewFindViewById2.getClass();
        this.f7359o = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(2131364033);
        viewFindViewById3.getClass();
        TextView textView = (TextView) viewFindViewById3;
        this.f7360p = textView;
        TextView textView2 = (TextView) view.findViewById(2131364106);
        this.f7361q = textView2;
        View viewFindViewById4 = view.findViewById(2131363766);
        viewFindViewById4.getClass();
        TextView textView3 = (TextView) viewFindViewById4;
        this.f7362r = textView3;
        View viewFindViewById5 = view.findViewById(2131363616);
        viewFindViewById5.getClass();
        TextView textView4 = (TextView) viewFindViewById5;
        this.f7363s = textView4;
        TextView textView5 = (TextView) view.findViewById(2131364538);
        this.f7364t = textView5;
        TextView textView6 = (TextView) view.findViewById(2131363840);
        this.f7365u = textView6;
        this.v = (LinearLayout) view.findViewById(2131362668);
        View viewFindViewById6 = view.findViewById(2131362646);
        viewFindViewById6.getClass();
        this.f7366w = (LinearLayout) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(2131364189);
        viewFindViewById7.getClass();
        TextView textView7 = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(2131363008);
        viewFindViewById8.getClass();
        this.f7367x = (ProgressBar) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(2131364544);
        viewFindViewById9.getClass();
        TextView textView8 = (TextView) viewFindViewById9;
        TextView textView9 = (TextView) view.findViewById(2131363675);
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
}
