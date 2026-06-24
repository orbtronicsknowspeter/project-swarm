package m5;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a2 extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b2 f7308a;

    public a2(b2 b2Var) {
        this.f7308a = b2Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        recyclerView.getClass();
        super.onScrollStateChanged(recyclerView, i);
        b2 b2Var = this.f7308a;
        LinearLayoutManager linearLayoutManager = b2Var.f7322m;
        e4.m1 m1Var = b2Var.f7323n;
        if (!m1Var.f) {
            m1Var.f = true;
        }
        if (i == 0) {
            int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
            int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
            int i6 = m1Var.f4634k;
            if (iFindLastCompletelyVisibleItemPosition == linearLayoutManager.getItemCount() - 1 && iFindLastCompletelyVisibleItemPosition != m1Var.f4634k) {
                m1Var.f4634k = iFindLastCompletelyVisibleItemPosition;
                ArrayList arrayList = ((x4.g) m1Var.f4633e.get(i6)).Y;
                if (arrayList != null && !arrayList.isEmpty()) {
                    m1Var.notifyItemChanged(i6);
                }
                ArrayList arrayList2 = ((x4.g) m1Var.f4633e.get(iFindLastCompletelyVisibleItemPosition)).Y;
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    return;
                }
                m1Var.notifyItemChanged(iFindLastCompletelyVisibleItemPosition);
                return;
            }
            if (iFindFirstCompletelyVisibleItemPosition == -1 || iFindFirstCompletelyVisibleItemPosition == m1Var.f4634k) {
                return;
            }
            m1Var.f4634k = iFindFirstCompletelyVisibleItemPosition;
            ArrayList arrayList3 = ((x4.g) m1Var.f4633e.get(i6)).Y;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                m1Var.notifyItemChanged(i6);
            }
            ArrayList arrayList4 = ((x4.g) m1Var.f4633e.get(iFindFirstCompletelyVisibleItemPosition)).Y;
            if (arrayList4 == null || arrayList4.isEmpty()) {
                return;
            }
            m1Var.notifyItemChanged(iFindFirstCompletelyVisibleItemPosition);
        }
    }
}
