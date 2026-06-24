package m5;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class s1 extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3.d f7563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f7564b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f7565l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ImageView f7566m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f7567n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f7568o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f7569p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f7570q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final LinearLayout f7571r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final LinearLayout f7572s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f7573t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ImageView f7574u;
    public final ImageView v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ImageView f7575w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ImageView f7576x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ImageView f7577y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ImageView f7578z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(a3.d dVar, Context context, View view) {
        super(view);
        dVar.getClass();
        this.f7563a = dVar;
        this.f7564b = context;
        View viewFindViewById = view.findViewById(R.id.tv_username_review);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        this.f7565l = textView;
        View viewFindViewById2 = view.findViewById(R.id.iv_avatar_review);
        viewFindViewById2.getClass();
        this.f7566m = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.tv_date_review);
        viewFindViewById3.getClass();
        TextView textView2 = (TextView) viewFindViewById3;
        this.f7567n = textView2;
        View viewFindViewById4 = view.findViewById(R.id.tv_body_review);
        viewFindViewById4.getClass();
        TextView textView3 = (TextView) viewFindViewById4;
        this.f7568o = textView3;
        View viewFindViewById5 = view.findViewById(R.id.tv_show_more_review);
        viewFindViewById5.getClass();
        this.f7569p = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.tv_likes_counter_review);
        viewFindViewById6.getClass();
        TextView textView4 = (TextView) viewFindViewById6;
        this.f7570q = textView4;
        View viewFindViewById7 = view.findViewById(R.id.ll_likes_review);
        viewFindViewById7.getClass();
        this.f7571r = (LinearLayout) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.ll_reviews_counter_review);
        viewFindViewById8.getClass();
        this.f7572s = (LinearLayout) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.tv_reviews_counter_review);
        viewFindViewById9.getClass();
        TextView textView5 = (TextView) viewFindViewById9;
        this.f7573t = textView5;
        View viewFindViewById10 = view.findViewById(R.id.iv_likes_counter_review);
        viewFindViewById10.getClass();
        this.f7574u = (ImageView) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.iv_star1_review);
        viewFindViewById11.getClass();
        this.v = (ImageView) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.iv_star2_review);
        viewFindViewById12.getClass();
        this.f7575w = (ImageView) viewFindViewById12;
        View viewFindViewById13 = view.findViewById(R.id.iv_star3_review);
        viewFindViewById13.getClass();
        this.f7576x = (ImageView) viewFindViewById13;
        View viewFindViewById14 = view.findViewById(R.id.iv_star4_review);
        viewFindViewById14.getClass();
        this.f7577y = (ImageView) viewFindViewById14;
        View viewFindViewById15 = view.findViewById(R.id.iv_star5_review);
        viewFindViewById15.getClass();
        this.f7578z = (ImageView) viewFindViewById15;
        View viewFindViewById16 = view.findViewById(R.id.iv_follow_user_review);
        viewFindViewById16.getClass();
        textView.setTypeface(f4.c.f4883w);
        textView2.setTypeface(f4.c.f4884x);
        textView3.setTypeface(f4.c.f4884x);
        textView4.setTypeface(f4.c.f4884x);
        textView5.setTypeface(f4.c.f4884x);
        ((ImageView) viewFindViewById16).setVisibility(8);
    }
}
