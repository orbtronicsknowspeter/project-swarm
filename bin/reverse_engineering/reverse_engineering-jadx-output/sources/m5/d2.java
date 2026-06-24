package m5;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c4.ra;
import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d2 extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f7368a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(View view, ra raVar) {
        super(view);
        raVar.getClass();
        View viewFindViewById = view.findViewById(2131362694);
        viewFindViewById.getClass();
        this.f7368a = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(2131364092);
        viewFindViewById2.getClass();
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(2131363890);
        viewFindViewById3.getClass();
        TextView textView2 = (TextView) viewFindViewById3;
        textView.setTypeface(f4.c.f4883x);
        ConcurrentHashMap concurrentHashMap = j5.t.f6708a;
        textView.setText(j5.t.a(view.getContext().getString(2131952043)));
        textView2.setTypeface(f4.c.f4882w);
        textView2.setOnClickListener(new u0(raVar, 6));
    }
}
