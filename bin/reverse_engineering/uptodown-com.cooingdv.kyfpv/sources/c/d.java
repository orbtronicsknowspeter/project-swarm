package c;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class d extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f1135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f1136b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n9.a f1137l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f1138m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final View f1139n;

    public d(View view, Integer num, Integer num2, n9.a aVar) {
        super(view);
        this.f1135a = num;
        this.f1136b = num2;
        this.f1137l = aVar;
        View viewFindViewById = view.findViewById(R.id.tv_switch_label);
        viewFindViewById.getClass();
        this.f1138m = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.item_divider);
        viewFindViewById2.getClass();
        this.f1139n = viewFindViewById2;
    }
}
