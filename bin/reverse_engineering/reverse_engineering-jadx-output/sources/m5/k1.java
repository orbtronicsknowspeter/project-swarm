package m5;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class k1 extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w4.b f7444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f7445b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f7446l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f7447m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f7448n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f7449o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f7450p;

    public k1(View view, w4.b bVar) {
        super(view);
        this.f7444a = bVar;
        View viewFindViewById = view.findViewById(2131362381);
        viewFindViewById.getClass();
        this.f7445b = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(2131364051);
        viewFindViewById2.getClass();
        TextView textView = (TextView) viewFindViewById2;
        this.f7446l = textView;
        View viewFindViewById3 = view.findViewById(2131364567);
        viewFindViewById3.getClass();
        TextView textView2 = (TextView) viewFindViewById3;
        this.f7447m = textView2;
        View viewFindViewById4 = view.findViewById(2131364306);
        viewFindViewById4.getClass();
        TextView textView3 = (TextView) viewFindViewById4;
        this.f7448n = textView3;
        View viewFindViewById5 = view.findViewById(2131363946);
        viewFindViewById5.getClass();
        TextView textView4 = (TextView) viewFindViewById5;
        this.f7449o = textView4;
        View viewFindViewById6 = view.findViewById(2131363859);
        viewFindViewById6.getClass();
        TextView textView5 = (TextView) viewFindViewById6;
        this.f7450p = textView5;
        View viewFindViewById7 = view.findViewById(2131363204);
        viewFindViewById7.getClass();
        textView.setTypeface(f4.c.f4882w);
        textView2.setTypeface(f4.c.f4882w);
        textView3.setTypeface(f4.c.f4883x);
        textView4.setTypeface(f4.c.f4883x);
        textView5.setTypeface(f4.c.f4882w);
        ((RelativeLayout) viewFindViewById7).setOnClickListener(new u0(this, 1));
    }
}
