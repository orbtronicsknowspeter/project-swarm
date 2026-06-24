package c;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class a extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f1126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f1127b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n9.a f1128l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f1129m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final View f1130n;

    public a(View view, Integer num, Integer num2, n9.a aVar) {
        super(view);
        this.f1126a = num;
        this.f1127b = num2;
        this.f1128l = aVar;
        View viewFindViewById = view.findViewById(R.id.tv_non_switch_label);
        viewFindViewById.getClass();
        this.f1129m = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.item_divider);
        viewFindViewById2.getClass();
        this.f1130n = viewFindViewById2;
    }
}
