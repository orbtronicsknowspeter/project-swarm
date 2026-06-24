package m5;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class u extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f7600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w4.l f7601b;

    public u(v vVar, w4.l lVar) {
        this.f7600a = vVar;
        this.f7601b = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        View viewFindSnapView;
        int childAdapterPosition;
        v vVar = this.f7600a;
        e4.j jVar = vVar.f7609m;
        recyclerView.getClass();
        super.onScrollStateChanged(recyclerView, i);
        if (i != 0 || (viewFindSnapView = vVar.f7611o.findSnapView(recyclerView.getLayoutManager())) == null || (childAdapterPosition = vVar.f7608l.getChildAdapterPosition(viewFindSnapView) % jVar.f4569c.size()) == -1 || childAdapterPosition == vVar.f7613q) {
            return;
        }
        vVar.f7613q = childAdapterPosition;
        Object obj = jVar.f4569c.get(childAdapterPosition);
        obj.getClass();
        x4.g gVar = (x4.g) obj;
        if (!gVar.m() || vVar.f7612p) {
            return;
        }
        this.f7601b.c(gVar);
        vVar.f7612p = true;
    }
}
