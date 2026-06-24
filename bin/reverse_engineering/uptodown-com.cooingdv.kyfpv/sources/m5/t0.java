package m5;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import com.uptodown.util.views.UsernameTextView;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class t0 extends RecyclerView.ViewHolder {
    public final ImageView A;
    public final ImageView B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.m f7584b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageView f7585l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final UsernameTextView f7586m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ImageView f7587n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f7588o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f7589p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f7590q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f7591r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ImageView f7592s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinearLayout f7593t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final LinearLayout f7594u;
    public final ImageView v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ImageView f7595w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ImageView f7596x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ImageView f7597y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ImageView f7598z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(View view, Context context, w4.m mVar) {
        super(view);
        context.getClass();
        mVar.getClass();
        this.f7583a = context;
        this.f7584b = mVar;
        View viewFindViewById = view.findViewById(R.id.iv_avatar_review);
        viewFindViewById.getClass();
        this.f7585l = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.tv_username_review);
        viewFindViewById2.getClass();
        UsernameTextView usernameTextView = (UsernameTextView) viewFindViewById2;
        this.f7586m = usernameTextView;
        View viewFindViewById3 = view.findViewById(R.id.iv_author_verified_review);
        viewFindViewById3.getClass();
        this.f7587n = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.tv_date_review);
        viewFindViewById4.getClass();
        TextView textView = (TextView) viewFindViewById4;
        this.f7588o = textView;
        View viewFindViewById5 = view.findViewById(R.id.tv_body_review);
        viewFindViewById5.getClass();
        TextView textView2 = (TextView) viewFindViewById5;
        this.f7589p = textView2;
        View viewFindViewById6 = view.findViewById(R.id.tv_reviews_counter_review);
        viewFindViewById6.getClass();
        TextView textView3 = (TextView) viewFindViewById6;
        this.f7590q = textView3;
        View viewFindViewById7 = view.findViewById(R.id.tv_likes_counter_review);
        viewFindViewById7.getClass();
        TextView textView4 = (TextView) viewFindViewById7;
        this.f7591r = textView4;
        View viewFindViewById8 = view.findViewById(R.id.iv_likes_counter_review);
        viewFindViewById8.getClass();
        this.f7592s = (ImageView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.ll_reviews_counter_review);
        viewFindViewById9.getClass();
        this.f7593t = (LinearLayout) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.ll_likes_review);
        viewFindViewById10.getClass();
        this.f7594u = (LinearLayout) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.iv_star1_review);
        viewFindViewById11.getClass();
        this.v = (ImageView) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.iv_star2_review);
        viewFindViewById12.getClass();
        this.f7595w = (ImageView) viewFindViewById12;
        View viewFindViewById13 = view.findViewById(R.id.iv_star3_review);
        viewFindViewById13.getClass();
        this.f7596x = (ImageView) viewFindViewById13;
        View viewFindViewById14 = view.findViewById(R.id.iv_star4_review);
        viewFindViewById14.getClass();
        this.f7597y = (ImageView) viewFindViewById14;
        View viewFindViewById15 = view.findViewById(R.id.iv_star5_review);
        viewFindViewById15.getClass();
        this.f7598z = (ImageView) viewFindViewById15;
        View viewFindViewById16 = view.findViewById(R.id.iv_turbo_mark_review);
        viewFindViewById16.getClass();
        ImageView imageView = (ImageView) viewFindViewById16;
        this.A = imageView;
        View viewFindViewById17 = view.findViewById(R.id.iv_follow_user_review);
        viewFindViewById17.getClass();
        this.B = (ImageView) viewFindViewById17;
        usernameTextView.setTypeface(f4.c.f4883w);
        textView.setTypeface(f4.c.f4884x);
        textView2.setTypeface(f4.c.f4884x);
        textView3.setTypeface(f4.c.f4884x);
        textView4.setTypeface(f4.c.f4884x);
        imageView.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(x4.k2 r9, final int r10) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.t0.a(x4.k2, int):void");
    }
}
