package m5;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.j f7344b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w4.a f7345l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ProgressBar f7346m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ImageView f7347n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ImageView f7348o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f7349p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f7350q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f7351r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextView f7352s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinearLayout f7353t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f7354u;

    /* JADX WARN: Illegal instructions before constructor call */
    public d0(View view, w4.j jVar, w4.a aVar) {
        jVar.getClass();
        aVar.getClass();
        Context context = view.getContext();
        context.getClass();
        super(view, context);
        this.f7344b = jVar;
        this.f7345l = aVar;
        View viewFindViewById = view.findViewById(2131363013);
        viewFindViewById.getClass();
        this.f7346m = (ProgressBar) viewFindViewById;
        View viewFindViewById2 = view.findViewById(2131362423);
        viewFindViewById2.getClass();
        this.f7347n = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(2131362355);
        viewFindViewById3.getClass();
        this.f7348o = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(2131364044);
        viewFindViewById4.getClass();
        TextView textView = (TextView) viewFindViewById4;
        this.f7349p = textView;
        View viewFindViewById5 = view.findViewById(2131363771);
        viewFindViewById5.getClass();
        TextView textView2 = (TextView) viewFindViewById5;
        this.f7350q = textView2;
        View viewFindViewById6 = view.findViewById(2131364335);
        viewFindViewById6.getClass();
        TextView textView3 = (TextView) viewFindViewById6;
        this.f7351r = textView3;
        View viewFindViewById7 = view.findViewById(2131364194);
        viewFindViewById7.getClass();
        TextView textView4 = (TextView) viewFindViewById7;
        this.f7352s = textView4;
        View viewFindViewById8 = view.findViewById(2131364551);
        viewFindViewById8.getClass();
        View viewFindViewById9 = view.findViewById(2131362715);
        viewFindViewById9.getClass();
        this.f7353t = (LinearLayout) viewFindViewById9;
        textView.setTypeface(f4.c.f4882w);
        textView2.setTypeface(f4.c.f4883x);
        textView4.setTypeface(f4.c.f4883x);
        ((TextView) viewFindViewById8).setTypeface(f4.c.f4883x);
        textView3.setTypeface(f4.c.f4883x);
    }
}
