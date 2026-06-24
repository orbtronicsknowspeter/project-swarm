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
public final class d1 extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.c f7356b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w4.d f7357l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w4.a f7358m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final RelativeLayout f7359n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ImageView f7360o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f7361p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f7362q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f7363r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextView f7364s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f7365t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView f7366u;
    public final LinearLayout v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LinearLayout f7367w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ProgressBar f7368x;

    /* JADX WARN: Illegal instructions before constructor call */
    public d1(View view, w4.c cVar, w4.d dVar, w4.a aVar) {
        cVar.getClass();
        dVar.getClass();
        aVar.getClass();
        Context context = view.getContext();
        context.getClass();
        super(view, context);
        this.f7356b = cVar;
        this.f7357l = dVar;
        this.f7358m = aVar;
        View viewFindViewById = view.findViewById(R.id.rl_app_info_top_by_cat_item);
        viewFindViewById.getClass();
        this.f7359n = (RelativeLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.iv_logo_app_info_top_by_cat_item);
        viewFindViewById2.getClass();
        this.f7360o = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.tv_name_app_info_top_by_cat_item);
        viewFindViewById3.getClass();
        TextView textView = (TextView) viewFindViewById3;
        this.f7361p = textView;
        TextView textView2 = (TextView) view.findViewById(R.id.tv_number_app_info_top_by_cat_item);
        this.f7362q = textView2;
        View viewFindViewById4 = view.findViewById(R.id.tv_desc_app_info_top_by_cat_item);
        viewFindViewById4.getClass();
        TextView textView3 = (TextView) viewFindViewById4;
        this.f7363r = textView3;
        View viewFindViewById5 = view.findViewById(R.id.tv_action_app_info_top_by_cat_info_item);
        viewFindViewById5.getClass();
        TextView textView4 = (TextView) viewFindViewById5;
        this.f7364s = textView4;
        TextView textView5 = (TextView) view.findViewById(R.id.tv_valoration_app_info_top_by_cat_info_item);
        this.f7365t = textView5;
        TextView textView6 = (TextView) view.findViewById(R.id.tv_downloads_counter_app_info_top_by_cat_info_item);
        this.f7366u = textView6;
        this.v = (LinearLayout) view.findViewById(R.id.ll_info_app_info_top_by_cat_info_item);
        View viewFindViewById6 = view.findViewById(R.id.ll_download_app_info_top_by_cat_info_item);
        viewFindViewById6.getClass();
        this.f7367w = (LinearLayout) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.tv_progress_app_info_top_by_cat_info_item);
        viewFindViewById7.getClass();
        TextView textView7 = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.pb_progress_app_info_top_by_cat_item);
        viewFindViewById8.getClass();
        this.f7368x = (ProgressBar) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.tv_verified_app_info_top_by_cat_info_item);
        viewFindViewById9.getClass();
        TextView textView8 = (TextView) viewFindViewById9;
        TextView textView9 = (TextView) view.findViewById(R.id.tv_badge_promoted);
        textView.setTypeface(f4.c.f4883w);
        if (textView2 != null) {
            textView2.setTypeface(f4.c.f4883w);
        }
        if (textView5 != null) {
            textView5.setTypeface(f4.c.f4884x);
        }
        if (textView6 != null) {
            textView6.setTypeface(f4.c.f4884x);
        }
        textView3.setTypeface(f4.c.f4884x);
        textView4.setTypeface(f4.c.f4883w);
        textView8.setTypeface(f4.c.f4884x);
        textView7.setTypeface(f4.c.f4884x);
        if (textView9 != null) {
            textView9.setTypeface(f4.c.f4884x);
        }
    }
}
