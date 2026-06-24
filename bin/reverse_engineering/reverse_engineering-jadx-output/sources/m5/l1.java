package m5;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c4.ra;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class l1 extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra f7464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f7465b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LinearLayout f7466l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f7467m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f7468n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(View view, ra raVar) {
        super(view);
        raVar.getClass();
        this.f7464a = raVar;
        View viewFindViewById = view.findViewById(2131364502);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        this.f7465b = textView;
        View viewFindViewById2 = view.findViewById(2131362693);
        viewFindViewById2.getClass();
        this.f7466l = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(2131363942);
        viewFindViewById3.getClass();
        TextView textView2 = (TextView) viewFindViewById3;
        this.f7467m = textView2;
        View viewFindViewById4 = view.findViewById(2131363716);
        viewFindViewById4.getClass();
        TextView textView3 = (TextView) viewFindViewById4;
        this.f7468n = textView3;
        textView.setTypeface(f4.c.f4882w);
        textView2.setTypeface(f4.c.f4883x);
        textView3.setTypeface(f4.c.f4882w);
    }
}
