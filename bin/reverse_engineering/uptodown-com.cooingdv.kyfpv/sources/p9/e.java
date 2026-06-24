package p9;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b2.t1;
import com.uptodown.R;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8516a;

    public e(List list) {
        list.getClass();
        this.f8516a = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f8516a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        h hVar = (h) viewHolder;
        hVar.getClass();
        TextView textView = hVar.f8523b;
        g gVar = (g) this.f8516a.get(i);
        gVar.getClass();
        TextView textView2 = hVar.f8532t;
        textView2.setText(gVar.f8517a);
        TextView textView3 = hVar.f8531s;
        textView3.setText(gVar.f8518b);
        TextView textView4 = hVar.f8530r;
        textView4.setText(gVar.f8519l);
        TextView textView5 = hVar.f8529q;
        textView5.setText(gVar.f8520m);
        TextView textView6 = hVar.f8528p;
        textView6.setText(gVar.f8521n);
        h9.d dVar = m9.c.f7861d;
        if (dVar != null) {
            Integer num = dVar.i;
            if (num != null) {
                int iIntValue = num.intValue();
                textView2.setTextColor(iIntValue);
                hVar.f8527o.setTextColor(iIntValue);
                textView3.setTextColor(iIntValue);
                hVar.f8526n.setTextColor(iIntValue);
                textView4.setTextColor(iIntValue);
                hVar.f8525m.setTextColor(iIntValue);
                textView5.setTextColor(iIntValue);
                hVar.f8524l.setTextColor(iIntValue);
                textView6.setTextColor(iIntValue);
                textView.setTextColor(iIntValue);
            }
            Integer num2 = dVar.f5496a;
            if (num2 != null) {
                hVar.f8522a.setBackgroundColor(num2.intValue());
            }
        }
        t1.f(o6.e.f8228d, hVar.f8532t, hVar.f8527o, hVar.f8531s, hVar.f8526n, hVar.f8530r, hVar.f8525m, hVar.f8529q, hVar.f8524l, hVar.f8528p);
        t1.f(o6.e.f8227c, textView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewS = androidx.lifecycle.l.s(viewGroup, R.layout.list_item_disclosure, viewGroup, false);
        viewS.getClass();
        return new h(viewS);
    }
}
