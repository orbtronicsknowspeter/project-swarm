package p9;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s5.c f8542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f8543b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Integer f8544l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n9.a f8545m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ConstraintLayout f8546n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ImageView f8547o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f8548p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f8549q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final View f8550r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(View view, s5.c cVar, Integer num, Integer num2, n9.a aVar) {
        super(view);
        cVar.getClass();
        this.f8542a = cVar;
        this.f8543b = num;
        this.f8544l = num2;
        this.f8545m = aVar;
        View viewFindViewById = view.findViewById(2131362030);
        viewFindViewById.getClass();
        this.f8546n = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(2131362482);
        viewFindViewById2.getClass();
        this.f8547o = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(2131364326);
        viewFindViewById3.getClass();
        this.f8548p = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(2131364325);
        viewFindViewById4.getClass();
        this.f8549q = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(2131362611);
        viewFindViewById5.getClass();
        this.f8550r = viewFindViewById5;
    }
}
