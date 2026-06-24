package u4;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c1 extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LinearLayoutManager f10441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1 f10442b;

    public c1(LinearLayoutManager linearLayoutManager, f1 f1Var) {
        this.f10441a = linearLayoutManager;
        this.f10442b = f1Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i6) {
        recyclerView.getClass();
        if (i6 > 0) {
            LinearLayoutManager linearLayoutManager = this.f10441a;
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int childCount = linearLayoutManager.getChildCount();
            int itemCount = linearLayoutManager.getItemCount();
            f1 f1Var = this.f10442b;
            if (f1Var.b().g || !f1Var.b().f || childCount + iFindFirstVisibleItemPosition < itemCount) {
                return;
            }
            e4.c cVar = f1Var.f10490l;
            if (cVar != null) {
                cVar.a(true);
            }
            c4.t0 t0VarB = f1Var.b();
            Context contextRequireContext = f1Var.requireContext();
            contextRequireContext.getClass();
            t0VarB.a(contextRequireContext);
        }
    }
}
