package m5;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.uptodown.R;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class g1 extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.c f7399b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w4.a f7400l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f7401m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final RelativeLayout f7402n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ImageView f7403o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ProgressBar f7404p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f7405q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f7406r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextView f7407s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f7408t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView f7409u;
    public final LinearLayout v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ImageView f7410w;

    /* JADX WARN: Illegal instructions before constructor call */
    public g1(View view, w4.c cVar, w4.a aVar, boolean z9) {
        cVar.getClass();
        Context context = view.getContext();
        context.getClass();
        super(view, context);
        this.f7399b = cVar;
        this.f7400l = aVar;
        this.f7401m = z9;
        View viewFindViewById = view.findViewById(R.id.rl_app_info_top_by_cat_small_item);
        viewFindViewById.getClass();
        this.f7402n = (RelativeLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.iv_logo_app_info_top_by_cat_small_item);
        viewFindViewById2.getClass();
        this.f7403o = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.pb_progress_app_info_top_by_cat_small_item);
        viewFindViewById3.getClass();
        this.f7404p = (ProgressBar) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.tv_name_app_info_top_by_cat_small_item);
        viewFindViewById4.getClass();
        TextView textView = (TextView) viewFindViewById4;
        this.f7405q = textView;
        TextView textView2 = (TextView) view.findViewById(R.id.tv_number_app_info_top_by_cat_small_item);
        this.f7406r = textView2;
        View viewFindViewById5 = view.findViewById(R.id.tv_desc_app_info_top_by_cat_small_item);
        viewFindViewById5.getClass();
        TextView textView3 = (TextView) viewFindViewById5;
        this.f7407s = textView3;
        View viewFindViewById6 = view.findViewById(R.id.tv_status_app_info_top_by_cat_small_item);
        viewFindViewById6.getClass();
        TextView textView4 = (TextView) viewFindViewById6;
        this.f7408t = textView4;
        View viewFindViewById7 = view.findViewById(R.id.tv_progress_app_info_top_by_cat_small_item);
        viewFindViewById7.getClass();
        TextView textView5 = (TextView) viewFindViewById7;
        this.f7409u = textView5;
        View viewFindViewById8 = view.findViewById(R.id.tv_verified_app_info_top_by_cat_small_item);
        viewFindViewById8.getClass();
        TextView textView6 = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.ll_progress_app_info_top_by_cat_small_item);
        viewFindViewById9.getClass();
        this.v = (LinearLayout) viewFindViewById9;
        this.f7410w = (ImageView) view.findViewById(R.id.iv_alternative_compare);
        textView.setTypeface(f4.c.f4883w);
        if (textView2 != null) {
            textView2.setTypeface(f4.c.f4883w);
        }
        textView3.setTypeface(f4.c.f4884x);
        textView4.setTypeface(f4.c.f4884x);
        textView5.setTypeface(f4.c.f4884x);
        textView6.setTypeface(f4.c.f4884x);
    }

    public final void g(x4.g gVar, int i) {
        gVar.getClass();
        w4.c cVar = this.f7399b;
        RelativeLayout relativeLayout = this.f7402n;
        e.b(relativeLayout, cVar, gVar);
        relativeLayout.setOnLongClickListener(new d4.d(this, gVar, i, 10));
        TextView textView = this.f7406r;
        if (i > 0) {
            if (textView != null) {
                textView.setText(this.itemView.getContext().getResources().getString(R.string.top_index_format, String.valueOf(i)));
            }
            if (textView != null) {
                textView.setVisibility(0);
            }
        } else if (textView != null) {
            textView.setVisibility(8);
        }
        ImageView imageView = this.f7410w;
        if (imageView != null) {
            imageView.setVisibility(this.f7401m ? 0 : 8);
        }
        if (imageView != null) {
            imageView.setOnClickListener(new g4.b0(this, gVar, i));
        }
        e.f(gVar, this.f7405q, this.f7407s);
        e(this.f7403o, gVar.i());
        c(gVar, this.f7404p, this.f7403o, this.f7407s, this.f7409u, this.f7408t, this.v);
    }
}
