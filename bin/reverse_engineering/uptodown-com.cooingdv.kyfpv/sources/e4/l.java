package e4;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.uptodown.R;
import com.uptodown.UptodownApp;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends m5.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.c f4592b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w4.a f4593l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ImageView f4594m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ProgressBar f4595n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ImageView f4596o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f4597p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f4598q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f4599r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextView f4600s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinearLayout f4601t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView f4602u;

    /* JADX WARN: Illegal instructions before constructor call */
    public l(View view, w4.c cVar, w4.a aVar) {
        cVar.getClass();
        aVar.getClass();
        Context context = view.getContext();
        context.getClass();
        super(view, context);
        this.f4592b = cVar;
        this.f4593l = aVar;
        this.f4594m = (ImageView) view.findViewById(R.id.iv_home_top_card_featured_item);
        View viewFindViewById = view.findViewById(R.id.pb_progress_home_card_top_featured_item);
        viewFindViewById.getClass();
        this.f4595n = (ProgressBar) viewFindViewById;
        this.f4596o = (ImageView) view.findViewById(R.id.iv_logo_home_card_top_featured_item);
        TextView textView = (TextView) view.findViewById(R.id.tv_name_home_card_top_featured_item);
        this.f4597p = textView;
        TextView textView2 = (TextView) view.findViewById(R.id.tv_number_card_top_featured_download);
        this.f4598q = textView2;
        TextView textView3 = (TextView) view.findViewById(R.id.tv_desc_home_card_top_featured_item);
        this.f4599r = textView3;
        View viewFindViewById2 = view.findViewById(R.id.tv_progress_home_card_top_featured_item);
        viewFindViewById2.getClass();
        TextView textView4 = (TextView) viewFindViewById2;
        this.f4600s = textView4;
        View viewFindViewById3 = view.findViewById(R.id.tv_verified_home_card_top_featured_item);
        viewFindViewById3.getClass();
        View viewFindViewById4 = view.findViewById(R.id.ll_progress_home_card_top_featured_item);
        viewFindViewById4.getClass();
        this.f4601t = (LinearLayout) viewFindViewById4;
        this.f4602u = (TextView) view.findViewById(R.id.tv_status_home_card_top_featured_item);
        textView.setTypeface(f4.c.f4883w);
        textView2.setTypeface(f4.c.f4883w);
        textView3.setTypeface(f4.c.f4884x);
        textView4.setTypeface(f4.c.f4884x);
        ((TextView) viewFindViewById3).setTypeface(f4.c.f4884x);
    }

    public final void g(x4.g gVar, int i, int i6, boolean z9) {
        int dimension = (int) this.itemView.getContext().getResources().getDimension(R.dimen.margin_m);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (z9) {
            layoutParams.setMargins(dimension, 0, dimension, dimension);
        } else {
            layoutParams.setMargins(dimension, 0, 0, dimension);
        }
        ImageView imageView = this.f4594m;
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        layoutParams2.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        if (i == 1) {
            marginLayoutParams.setMarginStart((int) this.itemView.getContext().getResources().getDimension(R.dimen.margin_m));
        }
        imageView.setLayoutParams(marginLayoutParams);
        this.itemView.setLayoutParams(layoutParams);
        this.f4598q.setText(String.valueOf(i));
        String strE = gVar.e();
        if (strE == null || strE.length() == 0) {
            androidx.lifecycle.l.A(this.itemView, R.drawable.shape_bg_placeholder, imageView);
        } else {
            a4.l0 l0VarE = a4.g0.d().e(gVar.f());
            float f = UptodownApp.I;
            Context context = this.itemView.getContext();
            context.getClass();
            l0VarE.h(b4.d.w(context));
            a4.k0 k0Var = l0VarE.f135b;
            k0Var.f = true;
            k0Var.g = 17;
            l0VarE.f136c = true;
            Context context2 = imageView.getContext();
            context2.getClass();
            l0VarE.g(b4.d.f(context2));
            l0VarE.e(imageView, null);
        }
        View view = this.itemView;
        view.getClass();
        m5.e.b(view, this.f4592b, gVar);
        this.itemView.setOnLongClickListener(new d4.d(this, gVar, i6, 3));
        TextView textView = this.f4597p;
        textView.getClass();
        TextView textView2 = this.f4599r;
        textView2.getClass();
        m5.e.f(gVar, textView, textView2);
        ImageView imageView2 = this.f4596o;
        imageView2.getClass();
        e(imageView2, gVar.i());
        c(gVar, this.f4595n, imageView2, textView2, this.f4600s, this.f4602u, this.f4601t);
    }
}
