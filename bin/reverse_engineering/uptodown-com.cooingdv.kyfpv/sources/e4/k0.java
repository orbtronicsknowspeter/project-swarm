package e4;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.views.FullHeightImageView;
import java.util.ArrayList;
import x4.d3;
import x4.l2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class k0 extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f4587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y2.s f4588b;

    public k0(ArrayList arrayList, y2.s sVar) {
        this.f4587a = arrayList;
        this.f4588b = sVar;
    }

    public final void a(Object obj) {
        ArrayList arrayList = this.f4587a;
        Integer numValueOf = arrayList != null ? Integer.valueOf(arrayList.indexOf(obj)) : null;
        if (numValueOf == null || numValueOf.intValue() == -1) {
            return;
        }
        if (arrayList != null) {
            arrayList.remove(numValueOf.intValue());
        }
        notifyItemRemoved(numValueOf.intValue());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList arrayList = this.f4587a;
        if (arrayList == null) {
            return 0;
        }
        arrayList.getClass();
        return arrayList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        ArrayList arrayList = this.f4587a;
        return (arrayList != null ? arrayList.get(i) : null) instanceof d3 ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Object obj;
        m5.w0 w0Var = (m5.w0) viewHolder;
        w0Var.getClass();
        ArrayList arrayList = this.f4587a;
        if ((arrayList != null ? arrayList.get(i) : null) instanceof d3) {
            obj = arrayList != null ? arrayList.get(i) : null;
            obj.getClass();
            d3 d3Var = (d3) obj;
            w0Var.itemView.setOnClickListener(new g4.b0(14, w0Var, d3Var));
            a4.l0 l0VarE = a4.g0.d().e(d3Var.a());
            float f = UptodownApp.I;
            Context context = w0Var.itemView.getContext();
            context.getClass();
            l0VarE.h(b4.d.w(context));
            View view = w0Var.itemView;
            view.getClass();
            l0VarE.e((FullHeightImageView) view, new android.support.v4.media.g(29, w0Var, d3Var));
            return;
        }
        obj = arrayList != null ? arrayList.get(i) : null;
        obj.getClass();
        l2 l2Var = (l2) obj;
        w0Var.itemView.setOnClickListener(new g4.b0(15, w0Var, l2Var));
        View view2 = w0Var.itemView;
        view2.getClass();
        ((FullHeightImageView) view2).setMinimumWidth(w0Var.f7627b);
        a4.l0 l0VarE2 = a4.g0.d().e(l2Var.a());
        float f10 = UptodownApp.I;
        Context context2 = w0Var.itemView.getContext();
        context2.getClass();
        n5.g gVar = UptodownApp.X;
        if (gVar == null) {
            gVar = new n5.g((int) context2.getResources().getDimension(R.dimen.border_radius_s));
        }
        l0VarE2.h(gVar);
        View view3 = w0Var.itemView;
        view3.getClass();
        l0VarE2.e((FullHeightImageView) view3, new android.support.v4.media.g(28, w0Var, l2Var));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewS = androidx.lifecycle.l.s(viewGroup, R.layout.screenshot_item, viewGroup, false);
        viewS.getClass();
        y2.s sVar = this.f4588b;
        sVar.getClass();
        m5.w0 w0Var = new m5.w0(viewS);
        w0Var.f7626a = sVar;
        return w0Var;
    }
}
