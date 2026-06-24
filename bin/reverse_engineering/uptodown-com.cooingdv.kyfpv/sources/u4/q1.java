package u4;

import android.content.Context;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class q1 extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z1 f10583a;

    public q1(z1 z1Var) {
        this.f10583a = z1Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i6) {
        recyclerView.getClass();
        z1 z1Var = this.f10583a;
        String str = z1Var.f10684m.f11227l;
        if (str != null && str.length() != 0) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                if (linearLayoutManager.findFirstVisibleItemPosition() == 0) {
                    z1Var.a().f10237r.setVisibility(4);
                } else {
                    z1Var.a().f10237r.setVisibility(0);
                }
            }
        }
        if (i6 <= 0 || z1Var.d().f10463e || recyclerView.getLayoutManager() == null) {
            return;
        }
        RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
        layoutManager2.getClass();
        int childCount = layoutManager2.getChildCount();
        RecyclerView.LayoutManager layoutManager3 = recyclerView.getLayoutManager();
        layoutManager3.getClass();
        int itemCount = layoutManager3.getItemCount();
        RecyclerView.LayoutManager layoutManager4 = recyclerView.getLayoutManager();
        layoutManager4.getClass();
        int iFindFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager4).findFirstVisibleItemPosition();
        if (z1Var.d().f || childCount + iFindFirstVisibleItemPosition < itemCount - 10 || z1Var.getContext() == null) {
            return;
        }
        d2 d2VarD = z1Var.d();
        Context contextRequireContext = z1Var.requireContext();
        contextRequireContext.getClass();
        x4.j jVar = z1Var.f10684m;
        d2VarD.getClass();
        jVar.getClass();
        o7.a0 viewModelScope = ViewModelKt.getViewModelScope(d2VarD);
        v7.e eVar = o7.m0.f8289a;
        o7.c0.s(viewModelScope, v7.d.f10885a, null, new c2(d2VarD, contextRequireContext, jVar, null, 1), 2);
    }
}
