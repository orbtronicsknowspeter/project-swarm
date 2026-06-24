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
public final class t0 extends m5.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.c f4691b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageView f4692l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ProgressBar f4693m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f4694n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f4695o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f4696p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final LinearLayout f4697q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f4698r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u0 f4699s;

    /* JADX WARN: Illegal instructions before constructor call */
    public t0(u0 u0Var, View view, w4.c cVar) {
        cVar.getClass();
        this.f4699s = u0Var;
        Context context = view.getContext();
        context.getClass();
        super(view, context);
        this.f4691b = cVar;
        View viewFindViewById = view.findViewById(R.id.iv_logo_card);
        viewFindViewById.getClass();
        this.f4692l = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.pb_progress_card);
        viewFindViewById2.getClass();
        this.f4693m = (ProgressBar) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.tv_titulo_card);
        viewFindViewById3.getClass();
        TextView textView = (TextView) viewFindViewById3;
        this.f4694n = textView;
        View viewFindViewById4 = view.findViewById(R.id.tv_resumen_card);
        viewFindViewById4.getClass();
        TextView textView2 = (TextView) viewFindViewById4;
        this.f4695o = textView2;
        View viewFindViewById5 = view.findViewById(R.id.tv_progress_card);
        viewFindViewById5.getClass();
        TextView textView3 = (TextView) viewFindViewById5;
        this.f4696p = textView3;
        View viewFindViewById6 = view.findViewById(R.id.tv_verified_card);
        viewFindViewById6.getClass();
        View viewFindViewById7 = view.findViewById(R.id.ll_progress_card);
        viewFindViewById7.getClass();
        this.f4697q = (LinearLayout) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.tv_status_card);
        viewFindViewById8.getClass();
        TextView textView4 = (TextView) viewFindViewById8;
        this.f4698r = textView4;
        textView.setTypeface(f4.c.f4883w);
        textView2.setTypeface(f4.c.f4884x);
        textView4.setTypeface(f4.c.f4884x);
        textView3.setTypeface(f4.c.f4884x);
        ((TextView) viewFindViewById6).setTypeface(f4.c.f4884x);
    }
}
