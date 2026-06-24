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
public final class c extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.c f7324b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w4.a f7325l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final RelativeLayout f7326m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ImageView f7327n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f7328o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f7329p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f7330q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ProgressBar f7331r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextView f7332s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinearLayout f7333t;

    /* JADX WARN: Illegal instructions before constructor call */
    public c(View view, w4.c cVar, w4.a aVar) {
        cVar.getClass();
        Context context = view.getContext();
        context.getClass();
        super(view, context);
        this.f7324b = cVar;
        this.f7325l = aVar;
        View viewFindViewById = view.findViewById(R.id.rl_app_info_item);
        viewFindViewById.getClass();
        this.f7326m = (RelativeLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.iv_logo_app_info_item);
        viewFindViewById2.getClass();
        this.f7327n = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.tv_name_app_info_item);
        viewFindViewById3.getClass();
        TextView textView = (TextView) viewFindViewById3;
        this.f7328o = textView;
        View viewFindViewById4 = view.findViewById(R.id.tv_desc_app_info_item);
        viewFindViewById4.getClass();
        TextView textView2 = (TextView) viewFindViewById4;
        this.f7329p = textView2;
        View viewFindViewById5 = view.findViewById(R.id.tv_status_app_info_item);
        viewFindViewById5.getClass();
        TextView textView3 = (TextView) viewFindViewById5;
        this.f7330q = textView3;
        this.f7331r = (ProgressBar) view.findViewById(R.id.pb_progress_app_info_item);
        TextView textView4 = (TextView) view.findViewById(R.id.tv_progress_app_info_item);
        this.f7332s = textView4;
        TextView textView5 = (TextView) view.findViewById(R.id.tv_verified_app_info_item);
        this.f7333t = (LinearLayout) view.findViewById(R.id.ll_progress_app_info_item);
        textView.setTypeface(f4.c.f4883w);
        textView2.setTypeface(f4.c.f4884x);
        textView3.setTypeface(f4.c.f4884x);
        if (textView4 != null) {
            textView4.setTypeface(f4.c.f4884x);
        }
        if (textView5 != null) {
            textView5.setTypeface(f4.c.f4884x);
        }
    }
}
