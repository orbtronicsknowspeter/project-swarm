package m5;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class u extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f7601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w4.l f7602b;

    public u(v vVar, w4.l lVar) {
        this.f7601a = vVar;
        this.f7602b = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        View viewFindSnapView;
        int childAdapterPosition;
        v vVar = this.f7601a;
        e4.j jVar = vVar.f7610m;
        recyclerView.getClass();
        super.onScrollStateChanged(recyclerView, i);
        if (i != 0 || (viewFindSnapView = vVar.f7612o.findSnapView(recyclerView.getLayoutManager())) == null || (childAdapterPosition = vVar.f7609l.getChildAdapterPosition(viewFindSnapView) % jVar.f4570c.size()) == -1 || childAdapterPosition == vVar.f7614q) {
            return;
        }
        vVar.f7614q = childAdapterPosition;
        Object obj = jVar.f4570c.get(childAdapterPosition);
        obj.getClass();
        x4.g gVar = (x4.g) obj;
        if (!gVar.m() || vVar.f7613p) {
            return;
        }
        this.f7602b.c(gVar);
        vVar.f7613p = true;
    }
}
