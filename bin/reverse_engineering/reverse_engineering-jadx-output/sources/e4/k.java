package e4;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends m5.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.c f4576b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w4.a f4577l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ImageView f4578m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ImageView f4579n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ProgressBar f4580o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f4581p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f4582q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f4583r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextView f4584s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinearLayout f4585t;

    /* JADX WARN: Illegal instructions before constructor call */
    public k(View view, w4.c cVar, w4.a aVar) {
        cVar.getClass();
        aVar.getClass();
        Context context = view.getContext();
        context.getClass();
        super(view, context);
        this.f4576b = cVar;
        this.f4577l = aVar;
        this.f4578m = (ImageView) view.findViewById(2131362369);
        this.f4579n = (ImageView) view.findViewById(2131362425);
        View viewFindViewById = view.findViewById(2131363014);
        viewFindViewById.getClass();
        this.f4580o = (ProgressBar) viewFindViewById;
        TextView textView = (TextView) view.findViewById(2131364046);
        this.f4581p = textView;
        TextView textView2 = (TextView) view.findViewById(2131363772);
        this.f4582q = textView2;
        this.f4583r = (TextView) view.findViewById(2131364336);
        View viewFindViewById2 = view.findViewById(2131364195);
        viewFindViewById2.getClass();
        TextView textView3 = (TextView) viewFindViewById2;
        this.f4584s = textView3;
        View viewFindViewById3 = view.findViewById(2131364552);
        viewFindViewById3.getClass();
        View viewFindViewById4 = view.findViewById(2131362716);
        viewFindViewById4.getClass();
        this.f4585t = (LinearLayout) viewFindViewById4;
        textView.setTypeface(f4.c.f4882w);
        textView2.setTypeface(f4.c.f4883x);
        textView3.setTypeface(f4.c.f4883x);
        ((TextView) viewFindViewById3).setTypeface(f4.c.f4883x);
    }
}
