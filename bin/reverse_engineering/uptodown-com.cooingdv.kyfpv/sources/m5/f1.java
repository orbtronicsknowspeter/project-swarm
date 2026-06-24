package m5;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.google.android.gms.internal.measurement.i5;
import com.uptodown.R;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f1 extends e {
    public final ProgressBar A;
    public final ImageView B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.c f7380b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w4.d f7381l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w4.a f7382m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f7383n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final u4.p1 f7384o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RelativeLayout f7385p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ImageView f7386q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f7387r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextView f7388s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f7389t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView f7390u;
    public final TextView v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextView f7391w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final LinearLayout f7392x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final LinearLayout f7393y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final TextView f7394z;

    /* JADX WARN: Illegal instructions before constructor call */
    public f1(View view, w4.c cVar, w4.d dVar, w4.a aVar, boolean z9, u4.p1 p1Var) {
        cVar.getClass();
        dVar.getClass();
        aVar.getClass();
        Context context = view.getContext();
        context.getClass();
        super(view, context);
        this.f7380b = cVar;
        this.f7381l = dVar;
        this.f7382m = aVar;
        this.f7383n = z9;
        this.f7384o = p1Var;
        View viewFindViewById = view.findViewById(R.id.rl_app_info_top_by_cat_item);
        viewFindViewById.getClass();
        this.f7385p = (RelativeLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.iv_logo_app_info_top_by_cat_item);
        viewFindViewById2.getClass();
        this.f7386q = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.tv_name_app_info_top_by_cat_item);
        viewFindViewById3.getClass();
        TextView textView = (TextView) viewFindViewById3;
        this.f7387r = textView;
        TextView textView2 = (TextView) view.findViewById(R.id.tv_number_app_info_top_by_cat_item);
        this.f7388s = textView2;
        View viewFindViewById4 = view.findViewById(R.id.tv_desc_app_info_top_by_cat_item);
        viewFindViewById4.getClass();
        TextView textView3 = (TextView) viewFindViewById4;
        this.f7389t = textView3;
        View viewFindViewById5 = view.findViewById(R.id.tv_action_app_info_top_by_cat_info_item);
        viewFindViewById5.getClass();
        TextView textView4 = (TextView) viewFindViewById5;
        this.f7390u = textView4;
        TextView textView5 = (TextView) view.findViewById(R.id.tv_valoration_app_info_top_by_cat_info_item);
        this.v = textView5;
        TextView textView6 = (TextView) view.findViewById(R.id.tv_downloads_counter_app_info_top_by_cat_info_item);
        this.f7391w = textView6;
        this.f7392x = (LinearLayout) view.findViewById(R.id.ll_info_app_info_top_by_cat_info_item);
        View viewFindViewById6 = view.findViewById(R.id.ll_download_app_info_top_by_cat_info_item);
        viewFindViewById6.getClass();
        this.f7393y = (LinearLayout) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.tv_progress_app_info_top_by_cat_info_item);
        viewFindViewById7.getClass();
        TextView textView7 = (TextView) viewFindViewById7;
        this.f7394z = textView7;
        View viewFindViewById8 = view.findViewById(R.id.pb_progress_app_info_top_by_cat_item);
        viewFindViewById8.getClass();
        this.A = (ProgressBar) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.tv_verified_app_info_top_by_cat_info_item);
        viewFindViewById9.getClass();
        TextView textView8 = (TextView) viewFindViewById9;
        TextView textView9 = (TextView) view.findViewById(R.id.tv_badge_promoted);
        this.B = (ImageView) view.findViewById(R.id.iv_alternative_compare);
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

    public final void g(x4.g gVar, int i) {
        t0.f.s(this.A, this.f7386q);
        e1 e1Var = new e1(this, gVar, i, 3);
        TextView textView = this.f7390u;
        textView.setOnClickListener(e1Var);
        this.f7393y.setVisibility(8);
        this.f7389t.setVisibility(0);
        textView.setVisibility(0);
    }

    public final void h(x4.r rVar, x4.g gVar, int i) {
        ImageView imageView = this.f7386q;
        ProgressBar progressBar = this.A;
        t0.f.I(progressBar, imageView);
        LinearLayout linearLayout = this.f7392x;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        TextView textView = this.f7390u;
        textView.setText(R.string.option_button_cancel);
        textView.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.ripple_stroke_blue_primary));
        textView.setTextColor(ContextCompat.getColor(this.itemView.getContext(), R.color.blue_primary));
        textView.setOnClickListener(new g4.a(i, this, 3, gVar));
        this.f7389t.setVisibility(8);
        this.f7393y.setVisibility(0);
        int i6 = rVar.i();
        TextView textView2 = this.f7394z;
        if (i6 == 0) {
            textView2.setText(this.itemView.getContext().getString(R.string.status_download_update_pending));
            progressBar.setIndeterminate(true);
            return;
        }
        progressBar.setIndeterminate(false);
        Context context = this.itemView.getContext();
        Integer numValueOf = Integer.valueOf(rVar.i());
        long jK = rVar.k();
        Context context2 = this.itemView.getContext();
        context2.getClass();
        textView2.setText(context.getString(R.string.percent_of_total_size, numValueOf, i5.H(context2, jK)));
        progressBar.setProgress(rVar.i());
    }

    public final void i() {
        ImageView imageView = this.f7386q;
        ProgressBar progressBar = this.A;
        t0.f.I(progressBar, imageView);
        LinearLayout linearLayout = this.f7392x;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        this.f7390u.setVisibility(8);
        this.f7389t.setVisibility(8);
        this.f7393y.setVisibility(0);
        this.f7394z.setText(this.itemView.getContext().getString(R.string.installing));
        progressBar.setIndeterminate(true);
    }
}
