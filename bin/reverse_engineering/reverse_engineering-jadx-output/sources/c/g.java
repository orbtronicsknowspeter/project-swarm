package c;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class g extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f1146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f1147b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Integer f1148l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Integer f1149m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f1150n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final n9.a f1151o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f1152p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final SwitchCompat f1153q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final View f1154r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(View view, b bVar, Integer num, Integer num2, Integer num3, Integer num4, n9.a aVar) {
        super(view);
        bVar.getClass();
        this.f1146a = bVar;
        this.f1147b = num;
        this.f1148l = num2;
        this.f1149m = num3;
        this.f1150n = num4;
        this.f1151o = aVar;
        View viewFindViewById = view.findViewById(2131364348);
        viewFindViewById.getClass();
        this.f1152p = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(2131363486);
        viewFindViewById2.getClass();
        this.f1153q = (SwitchCompat) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(2131362611);
        viewFindViewById3.getClass();
        this.f1154r = viewFindViewById3;
    }
}
