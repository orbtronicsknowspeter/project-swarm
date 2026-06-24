package m5;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class p extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f7499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f7500b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageView f7501l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f7502m;

    public p(View view) {
        super(view);
        View viewFindViewById = view.findViewById(2131364029);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        this.f7499a = textView;
        View viewFindViewById2 = view.findViewById(2131363764);
        viewFindViewById2.getClass();
        TextView textView2 = (TextView) viewFindViewById2;
        this.f7500b = textView2;
        View viewFindViewById3 = view.findViewById(2131362415);
        viewFindViewById3.getClass();
        this.f7501l = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(2131363910);
        viewFindViewById4.getClass();
        TextView textView3 = (TextView) viewFindViewById4;
        this.f7502m = textView3;
        textView.setTypeface(f4.c.f4882w);
        textView2.setTypeface(f4.c.f4883x);
        textView3.setTypeface(f4.c.f4882w);
    }
}
