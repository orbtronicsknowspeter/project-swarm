package m5;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class y extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f7639a;

    public y(z zVar) {
        this.f7639a = zVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.getClass();
        view.getClass();
        recyclerView.getClass();
        state.getClass();
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int itemCount = state.getItemCount();
        z zVar = this.f7639a;
        int spanCount = zVar.f7649m.getSpanCount();
        if (itemCount <= 0 || childAdapterPosition < ((itemCount - 1) / spanCount) * spanCount) {
            return;
        }
        rect.right = zVar.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.margin_m);
    }
}
