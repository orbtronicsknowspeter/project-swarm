package c4;

import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.activities.PublicListActivity;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f7 extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LinearLayoutManager f1596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PublicListActivity f1597b;

    public f7(LinearLayoutManager linearLayoutManager, PublicListActivity publicListActivity) {
        this.f1596a = linearLayoutManager;
        this.f1597b = publicListActivity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i6) {
        recyclerView.getClass();
        if (i6 > 0) {
            LinearLayoutManager linearLayoutManager = this.f1596a;
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int childCount = linearLayoutManager.getChildCount();
            int itemCount = linearLayoutManager.getItemCount();
            int i10 = PublicListActivity.f3335e0;
            PublicListActivity publicListActivity = this.f1597b;
            if (publicListActivity.O0().f1724e || publicListActivity.O0().f1723d || childCount + iFindFirstVisibleItemPosition < itemCount) {
                return;
            }
            e4.e1 e1Var = publicListActivity.f3337c0;
            e1Var.getClass();
            e1Var.d(true);
            i7 i7VarO0 = publicListActivity.O0();
            i7VarO0.getClass();
            o7.a0 viewModelScope = ViewModelKt.getViewModelScope(i7VarO0);
            v7.e eVar = o7.m0.f8289a;
            o7.c0.s(viewModelScope, v7.d.f10885a, null, new b.n(i7VarO0, publicListActivity, (t6.c) null, 24), 2);
        }
    }
}
