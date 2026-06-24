package m5;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class q1 extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f7537s = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3.d f7538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f7539b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageView f7540l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f7541m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f7542n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final RelativeLayout f7543o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ImageView f7544p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f7545q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f7546r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(View view, a3.d dVar) {
        super(view);
        dVar.getClass();
        this.f7538a = dVar;
        View viewFindViewById = view.findViewById(2131362761);
        viewFindViewById.getClass();
        this.f7539b = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(2131364512);
        viewFindViewById2.getClass();
        View viewFindViewById3 = view.findViewById(2131362475);
        viewFindViewById3.getClass();
        this.f7540l = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(2131364363);
        viewFindViewById4.getClass();
        TextView textView = (TextView) viewFindViewById4;
        this.f7541m = textView;
        View viewFindViewById5 = view.findViewById(2131364010);
        viewFindViewById5.getClass();
        TextView textView2 = (TextView) viewFindViewById5;
        this.f7542n = textView2;
        View viewFindViewById6 = view.findViewById(2131363248);
        viewFindViewById6.getClass();
        this.f7543o = (RelativeLayout) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(2131362459);
        viewFindViewById7.getClass();
        this.f7544p = (ImageView) viewFindViewById7;
        this.f7545q = 600;
        ((TextView) viewFindViewById2).setTypeface(f4.c.f4882w);
        textView.setTypeface(f4.c.f4883x);
        textView2.setTypeface(f4.c.f4883x);
    }
}
