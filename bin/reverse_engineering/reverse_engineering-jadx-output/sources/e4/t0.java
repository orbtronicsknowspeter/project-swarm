package e4;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class t0 extends m5.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.c f4690b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageView f4691l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ProgressBar f4692m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f4693n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f4694o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f4695p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final LinearLayout f4696q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f4697r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u0 f4698s;

    /* JADX WARN: Illegal instructions before constructor call */
    public t0(u0 u0Var, View view, w4.c cVar) {
        cVar.getClass();
        this.f4698s = u0Var;
        Context context = view.getContext();
        context.getClass();
        super(view, context);
        this.f4690b = cVar;
        View viewFindViewById = view.findViewById(2131362421);
        viewFindViewById.getClass();
        this.f4691l = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(2131363010);
        viewFindViewById2.getClass();
        this.f4692m = (ProgressBar) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(2131364431);
        viewFindViewById3.getClass();
        TextView textView = (TextView) viewFindViewById3;
        this.f4693n = textView;
        View viewFindViewById4 = view.findViewById(2131364239);
        viewFindViewById4.getClass();
        TextView textView2 = (TextView) viewFindViewById4;
        this.f4694o = textView2;
        View viewFindViewById5 = view.findViewById(2131364191);
        viewFindViewById5.getClass();
        TextView textView3 = (TextView) viewFindViewById5;
        this.f4695p = textView3;
        View viewFindViewById6 = view.findViewById(2131364549);
        viewFindViewById6.getClass();
        View viewFindViewById7 = view.findViewById(2131362713);
        viewFindViewById7.getClass();
        this.f4696q = (LinearLayout) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(2131364332);
        viewFindViewById8.getClass();
        TextView textView4 = (TextView) viewFindViewById8;
        this.f4697r = textView4;
        textView.setTypeface(f4.c.f4882w);
        textView2.setTypeface(f4.c.f4883x);
        textView4.setTypeface(f4.c.f4883x);
        textView3.setTypeface(f4.c.f4883x);
        ((TextView) viewFindViewById6).setTypeface(f4.c.f4883x);
    }
}
