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
public final class c extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.c f7323b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w4.a f7324l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final RelativeLayout f7325m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ImageView f7326n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f7327o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f7328p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f7329q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ProgressBar f7330r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextView f7331s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinearLayout f7332t;

    /* JADX WARN: Illegal instructions before constructor call */
    public c(View view, w4.c cVar, w4.a aVar) {
        cVar.getClass();
        Context context = view.getContext();
        context.getClass();
        super(view, context);
        this.f7323b = cVar;
        this.f7324l = aVar;
        View viewFindViewById = view.findViewById(2131363112);
        viewFindViewById.getClass();
        this.f7325m = (RelativeLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(2131362416);
        viewFindViewById2.getClass();
        this.f7326n = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(2131364030);
        viewFindViewById3.getClass();
        TextView textView = (TextView) viewFindViewById3;
        this.f7327o = textView;
        View viewFindViewById4 = view.findViewById(2131363765);
        viewFindViewById4.getClass();
        TextView textView2 = (TextView) viewFindViewById4;
        this.f7328p = textView2;
        View viewFindViewById5 = view.findViewById(2131364330);
        viewFindViewById5.getClass();
        TextView textView3 = (TextView) viewFindViewById5;
        this.f7329q = textView3;
        this.f7330r = (ProgressBar) view.findViewById(2131363006);
        TextView textView4 = (TextView) view.findViewById(2131364187);
        this.f7331s = textView4;
        TextView textView5 = (TextView) view.findViewById(2131364542);
        this.f7332t = (LinearLayout) view.findViewById(2131362711);
        textView.setTypeface(f4.c.f4882w);
        textView2.setTypeface(f4.c.f4883x);
        textView3.setTypeface(f4.c.f4883x);
        if (textView4 != null) {
            textView4.setTypeface(f4.c.f4883x);
        }
        if (textView5 != null) {
            textView5.setTypeface(f4.c.f4883x);
        }
    }
}
