package p9;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s5.c f8543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f8544b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Integer f8545l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n9.a f8546m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ConstraintLayout f8547n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ImageView f8548o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f8549p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f8550q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final View f8551r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(View view, s5.c cVar, Integer num, Integer num2, n9.a aVar) {
        super(view);
        cVar.getClass();
        this.f8543a = cVar;
        this.f8544b = num;
        this.f8545l = num2;
        this.f8546m = aVar;
        View viewFindViewById = view.findViewById(R.id.cl_item_container);
        viewFindViewById.getClass();
        this.f8547n = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.iv_stack_more_info);
        viewFindViewById2.getClass();
        this.f8548o = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.tv_stack_selected_state);
        viewFindViewById3.getClass();
        this.f8549p = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.tv_stack_name);
        viewFindViewById4.getClass();
        this.f8550q = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.line_item);
        viewFindViewById5.getClass();
        this.f8551r = viewFindViewById5;
    }
}
