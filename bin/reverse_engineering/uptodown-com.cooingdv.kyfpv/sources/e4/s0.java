package e4;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class s0 extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w4.c f4686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.a f4687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f4688c;

    public s0(w4.j jVar, w4.a aVar) {
        jVar.getClass();
        aVar.getClass();
        this.f4686a = jVar;
        this.f4687b = aVar;
        this.f4688c = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f4688c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        viewHolder.getClass();
        r0 r0Var = (r0) viewHolder;
        Object obj = this.f4688c.get(i);
        obj.getClass();
        x4.g gVar = (x4.g) obj;
        int i6 = i + 1;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (i6 == 1) {
            new RelativeLayout.LayoutParams(-2, -2).setMarginStart((int) r0Var.itemView.getContext().getResources().getDimension(R.dimen.margin_m));
        }
        View view = r0Var.itemView;
        Context context = view.getContext();
        context.getClass();
        m5.e.a(layoutParams, context, i6, 20);
        view.setLayoutParams(layoutParams);
        r0Var.f4675o.setText(String.valueOf(i6));
        View view2 = r0Var.itemView;
        view2.getClass();
        m5.e.b(view2, r0Var.f4671b, gVar);
        r0Var.itemView.setOnLongClickListener(new d4.d(r0Var.f4680t, gVar, i, 4));
        m5.e.f(gVar, r0Var.f4674n, r0Var.f4676p);
        r0Var.e(r0Var.f4672l, gVar.h());
        r0Var.c(gVar, r0Var.f4673m, r0Var.f4672l, r0Var.f4676p, r0Var.f4678r, r0Var.f4677q, r0Var.f4679s);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewS = androidx.lifecycle.l.s(viewGroup, R.layout.card_top_download, viewGroup, false);
        viewS.getClass();
        return new r0(this, viewS, this.f4686a);
    }
}
