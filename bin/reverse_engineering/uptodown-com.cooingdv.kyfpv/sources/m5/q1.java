package m5;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class q1 extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f7538s = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3.d f7539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f7540b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageView f7541l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f7542m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f7543n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final RelativeLayout f7544o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ImageView f7545p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f7546q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f7547r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(View view, a3.d dVar) {
        super(view);
        dVar.getClass();
        this.f7539a = dVar;
        View viewFindViewById = view.findViewById(R.id.ll_uptodown_protect);
        viewFindViewById.getClass();
        this.f7540b = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.tv_uptodown_protect);
        viewFindViewById2.getClass();
        View viewFindViewById3 = view.findViewById(R.id.iv_shield);
        viewFindViewById3.getClass();
        this.f7541l = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.tv_title);
        viewFindViewById4.getClass();
        TextView textView = (TextView) viewFindViewById4;
        this.f7542m = textView;
        View viewFindViewById5 = view.findViewById(R.id.tv_msg);
        viewFindViewById5.getClass();
        TextView textView2 = (TextView) viewFindViewById5;
        this.f7543n = textView2;
        View viewFindViewById6 = view.findViewById(R.id.rl_reload);
        viewFindViewById6.getClass();
        this.f7544o = (RelativeLayout) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.iv_reload);
        viewFindViewById7.getClass();
        this.f7545p = (ImageView) viewFindViewById7;
        this.f7546q = 600;
        ((TextView) viewFindViewById2).setTypeface(f4.c.f4883w);
        textView.setTypeface(f4.c.f4884x);
        textView2.setTypeface(f4.c.f4884x);
    }
}
