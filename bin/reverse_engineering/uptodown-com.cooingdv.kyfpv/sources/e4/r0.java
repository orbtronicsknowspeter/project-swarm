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
public final class r0 extends m5.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.c f4671b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageView f4672l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ProgressBar f4673m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f4674n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f4675o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f4676p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f4677q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f4678r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final LinearLayout f4679s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s0 f4680t;

    /* JADX WARN: Illegal instructions before constructor call */
    public r0(s0 s0Var, View view, w4.c cVar) {
        cVar.getClass();
        this.f4680t = s0Var;
        Context context = view.getContext();
        context.getClass();
        super(view, context);
        this.f4671b = cVar;
        View viewFindViewById = view.findViewById(R.id.iv_logo_card_top_download);
        viewFindViewById.getClass();
        this.f4672l = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.pb_progress_card_top_download);
        viewFindViewById2.getClass();
        this.f4673m = (ProgressBar) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.tv_titulo_card_top_download);
        viewFindViewById3.getClass();
        TextView textView = (TextView) viewFindViewById3;
        this.f4674n = textView;
        View viewFindViewById4 = view.findViewById(R.id.tv_number_card_top_download);
        viewFindViewById4.getClass();
        TextView textView2 = (TextView) viewFindViewById4;
        this.f4675o = textView2;
        View viewFindViewById5 = view.findViewById(R.id.tv_resumen_card_top_download);
        viewFindViewById5.getClass();
        TextView textView3 = (TextView) viewFindViewById5;
        this.f4676p = textView3;
        View viewFindViewById6 = view.findViewById(R.id.tv_status_card_top_download);
        viewFindViewById6.getClass();
        TextView textView4 = (TextView) viewFindViewById6;
        this.f4677q = textView4;
        View viewFindViewById7 = view.findViewById(R.id.tv_progress_card_top_download);
        viewFindViewById7.getClass();
        TextView textView5 = (TextView) viewFindViewById7;
        this.f4678r = textView5;
        View viewFindViewById8 = view.findViewById(R.id.tv_verified_card_top_download);
        viewFindViewById8.getClass();
        View viewFindViewById9 = view.findViewById(R.id.ll_progress_card_top_download);
        viewFindViewById9.getClass();
        this.f4679s = (LinearLayout) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.rl_card_details_top_download);
        viewFindViewById10.getClass();
        textView2.setTypeface(f4.c.f4883w);
        textView.setTypeface(f4.c.f4883w);
        textView3.setTypeface(f4.c.f4884x);
        textView4.setTypeface(f4.c.f4884x);
        textView5.setTypeface(f4.c.f4884x);
        ((TextView) viewFindViewById8).setTypeface(f4.c.f4884x);
    }
}
