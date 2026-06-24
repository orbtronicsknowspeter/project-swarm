package e4;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.uptodown.R;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends m5.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.c f4577b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w4.a f4578l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ImageView f4579m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ImageView f4580n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ProgressBar f4581o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f4582p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f4583q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f4584r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextView f4585s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinearLayout f4586t;

    /* JADX WARN: Illegal instructions before constructor call */
    public k(View view, w4.c cVar, w4.a aVar) {
        cVar.getClass();
        aVar.getClass();
        Context context = view.getContext();
        context.getClass();
        super(view, context);
        this.f4577b = cVar;
        this.f4578l = aVar;
        this.f4579m = (ImageView) view.findViewById(R.id.iv_home_card_featured_item);
        this.f4580n = (ImageView) view.findViewById(R.id.iv_logo_home_card_featured_item);
        View viewFindViewById = view.findViewById(R.id.pb_progress_home_card_featured_item);
        viewFindViewById.getClass();
        this.f4581o = (ProgressBar) viewFindViewById;
        TextView textView = (TextView) view.findViewById(R.id.tv_name_home_card_featured_item);
        this.f4582p = textView;
        TextView textView2 = (TextView) view.findViewById(R.id.tv_desc_home_card_featured_item);
        this.f4583q = textView2;
        this.f4584r = (TextView) view.findViewById(R.id.tv_status_home_card_featured_item);
        View viewFindViewById2 = view.findViewById(R.id.tv_progress_home_card_featured_item);
        viewFindViewById2.getClass();
        TextView textView3 = (TextView) viewFindViewById2;
        this.f4585s = textView3;
        View viewFindViewById3 = view.findViewById(R.id.tv_verified_home_card_featured_item);
        viewFindViewById3.getClass();
        View viewFindViewById4 = view.findViewById(R.id.ll_progress_home_card_featured_item);
        viewFindViewById4.getClass();
        this.f4586t = (LinearLayout) viewFindViewById4;
        textView.setTypeface(f4.c.f4883w);
        textView2.setTypeface(f4.c.f4884x);
        textView3.setTypeface(f4.c.f4884x);
        ((TextView) viewFindViewById3).setTypeface(f4.c.f4884x);
    }
}
