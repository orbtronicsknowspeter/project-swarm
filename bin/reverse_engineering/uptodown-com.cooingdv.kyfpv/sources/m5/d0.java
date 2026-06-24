package m5;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.uptodown.R;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.j f7345b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w4.a f7346l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ProgressBar f7347m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ImageView f7348n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ImageView f7349o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f7350p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f7351q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f7352r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextView f7353s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinearLayout f7354t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f7355u;

    /* JADX WARN: Illegal instructions before constructor call */
    public d0(View view, w4.j jVar, w4.a aVar) {
        jVar.getClass();
        aVar.getClass();
        Context context = view.getContext();
        context.getClass();
        super(view, context);
        this.f7345b = jVar;
        this.f7346l = aVar;
        View viewFindViewById = view.findViewById(R.id.pb_progress_gallery_featured_item);
        viewFindViewById.getClass();
        this.f7347m = (ProgressBar) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.iv_logo_gallery_featured_item);
        viewFindViewById2.getClass();
        this.f7348n = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.iv_feature_gallery_featured_item);
        viewFindViewById3.getClass();
        this.f7349o = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.tv_name_gallery_featured_item);
        viewFindViewById4.getClass();
        TextView textView = (TextView) viewFindViewById4;
        this.f7350p = textView;
        View viewFindViewById5 = view.findViewById(R.id.tv_desc_gallery_featured_item);
        viewFindViewById5.getClass();
        TextView textView2 = (TextView) viewFindViewById5;
        this.f7351q = textView2;
        View viewFindViewById6 = view.findViewById(R.id.tv_status_gallery_featured_item);
        viewFindViewById6.getClass();
        TextView textView3 = (TextView) viewFindViewById6;
        this.f7352r = textView3;
        View viewFindViewById7 = view.findViewById(R.id.tv_progress_gallery_featured_item);
        viewFindViewById7.getClass();
        TextView textView4 = (TextView) viewFindViewById7;
        this.f7353s = textView4;
        View viewFindViewById8 = view.findViewById(R.id.tv_verified_gallery_featured_item);
        viewFindViewById8.getClass();
        View viewFindViewById9 = view.findViewById(R.id.ll_progress_gallery_featured_item);
        viewFindViewById9.getClass();
        this.f7354t = (LinearLayout) viewFindViewById9;
        textView.setTypeface(f4.c.f4883w);
        textView2.setTypeface(f4.c.f4884x);
        textView4.setTypeface(f4.c.f4884x);
        ((TextView) viewFindViewById8).setTypeface(f4.c.f4884x);
        textView3.setTypeface(f4.c.f4884x);
    }
}
