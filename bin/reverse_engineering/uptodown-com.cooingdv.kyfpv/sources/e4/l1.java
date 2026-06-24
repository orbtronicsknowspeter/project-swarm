package e4;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import com.uptodown.R;
import com.uptodown.UptodownApp;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class l1 extends m5.e {
    public final /* synthetic */ m1 A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.j f4607b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w4.a f4608l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Context f4609m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f4610n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ImageView f4611o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RelativeLayout f4612p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ProgressBar f4613q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ImageView f4614r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextView f4615s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f4616t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView f4617u;
    public final TextView v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LinearLayout f4618w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final CardView f4619x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final View f4620y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f4621z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(m1 m1Var, View view, w4.j jVar, w4.a aVar, Context context, String str) {
        super(view, context);
        jVar.getClass();
        aVar.getClass();
        context.getClass();
        str.getClass();
        this.A = m1Var;
        this.f4607b = jVar;
        this.f4608l = aVar;
        this.f4609m = context;
        this.f4610n = str;
        View viewFindViewById = view.findViewById(R.id.iv_image_video_featured_item);
        viewFindViewById.getClass();
        this.f4611o = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.rl_video_card_info);
        viewFindViewById2.getClass();
        this.f4612p = (RelativeLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.pb_progress_video_featured_item);
        viewFindViewById3.getClass();
        this.f4613q = (ProgressBar) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.iv_logo_video_featured_item);
        viewFindViewById4.getClass();
        this.f4614r = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.tv_name_video_featured_item);
        viewFindViewById5.getClass();
        TextView textView = (TextView) viewFindViewById5;
        this.f4615s = textView;
        View viewFindViewById6 = view.findViewById(R.id.tv_desc_video_featured_item);
        viewFindViewById6.getClass();
        TextView textView2 = (TextView) viewFindViewById6;
        this.f4616t = textView2;
        View viewFindViewById7 = view.findViewById(R.id.tv_status_video_featured_item);
        viewFindViewById7.getClass();
        this.f4617u = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.tv_progress_video_featured_item);
        viewFindViewById8.getClass();
        TextView textView3 = (TextView) viewFindViewById8;
        this.v = textView3;
        View viewFindViewById9 = view.findViewById(R.id.tv_verified_video_featured_item);
        viewFindViewById9.getClass();
        View viewFindViewById10 = view.findViewById(R.id.ll_progress_video_featured_item);
        viewFindViewById10.getClass();
        this.f4618w = (LinearLayout) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.cv_youtube_player_view);
        viewFindViewById11.getClass();
        this.f4619x = (CardView) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.v_player_controller);
        viewFindViewById12.getClass();
        this.f4620y = viewFindViewById12;
        this.f4621z = UptodownApp.Y;
        textView.setTypeface(f4.c.f4883w);
        textView2.setTypeface(f4.c.f4884x);
        textView3.setTypeface(f4.c.f4884x);
        ((TextView) viewFindViewById9).setTypeface(f4.c.f4884x);
    }

    public static void h(ImageView imageView, x4.g gVar) {
        n5.g gVar2 = new n5.g((int) imageView.getContext().getResources().getDimension(R.dimen.border_radius_m));
        String strE = gVar.e();
        if (strE == null || strE.length() == 0) {
            imageView.setImageDrawable(ContextCompat.getDrawable(imageView.getContext(), R.drawable.shape_bg_placeholder));
            return;
        }
        if (UptodownApp.U <= 0) {
            imageView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            a4.l0 l0VarE = a4.g0.d().e(gVar.d());
            l0VarE.f136c = true;
            l0VarE.h(gVar2);
            l0VarE.e(imageView, null);
            return;
        }
        imageView.setLayoutParams(new RelativeLayout.LayoutParams(-1, UptodownApp.U));
        a4.l0 l0VarE2 = a4.g0.d().e(gVar.d());
        l0VarE2.f135b.e(UptodownApp.V, UptodownApp.U);
        l0VarE2.h(gVar2);
        l0VarE2.e(imageView, null);
    }

    public final void g(x4.g gVar, int i) {
        this.f4619x.setVisibility(8);
        this.f4620y.setVisibility(8);
        ImageView imageView = this.f4611o;
        imageView.setVisibility(0);
        m5.e.f(gVar, this.f4615s, this.f4616t);
        RelativeLayout relativeLayout = this.f4612p;
        w4.j jVar = this.f4607b;
        m5.e.b(relativeLayout, jVar, gVar);
        h(imageView, gVar);
        e(this.f4614r, gVar.i());
        c(gVar, this.f4613q, this.f4614r, this.f4616t, this.v, this.f4617u, this.f4618w);
        relativeLayout.setOnLongClickListener(new k1(this, gVar, i, 1));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.f4621z, -1);
        View view = this.itemView;
        m5.e.a(layoutParams, this.f4609m, i, this.A.f4638o);
        view.setLayoutParams(layoutParams);
        m5.e.b(imageView, jVar, gVar);
    }
}
