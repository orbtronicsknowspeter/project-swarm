package r4;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import f0.i;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f8901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f8902b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f8903l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f8904m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f8905n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CheckBox f8906o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(View view, i iVar) {
        super(view);
        iVar.getClass();
        this.f8901a = iVar;
        View viewFindViewById = view.findViewById(2131362378);
        viewFindViewById.getClass();
        this.f8902b = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(2131364041);
        viewFindViewById2.getClass();
        TextView textView = (TextView) viewFindViewById2;
        this.f8903l = textView;
        View viewFindViewById3 = view.findViewById(2131363746);
        viewFindViewById3.getClass();
        TextView textView2 = (TextView) viewFindViewById3;
        this.f8904m = textView2;
        View viewFindViewById4 = view.findViewById(2131364304);
        viewFindViewById4.getClass();
        TextView textView3 = (TextView) viewFindViewById4;
        this.f8905n = textView3;
        View viewFindViewById5 = view.findViewById(2131362001);
        viewFindViewById5.getClass();
        this.f8906o = (CheckBox) viewFindViewById5;
        textView.setTypeface(f4.c.f4883x);
        textView2.setTypeface(f4.c.f4883x);
        textView3.setTypeface(f4.c.f4882w);
    }
}
