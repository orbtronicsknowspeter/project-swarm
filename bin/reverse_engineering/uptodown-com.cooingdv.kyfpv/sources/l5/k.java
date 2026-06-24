package l5;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import e4.q0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends RecyclerView.ItemDecoration {
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.getClass();
        view.getClass();
        recyclerView.getClass();
        state.getClass();
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        rect.top = recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.margin_m);
        if (!(adapter instanceof q0)) {
            rect.left = recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.margin_m);
            rect.right = recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.margin_m);
            return;
        }
        int itemViewType = ((q0) adapter).getItemViewType(childAdapterPosition);
        if (itemViewType == 3) {
            rect.left = 0;
            rect.right = 0;
        } else if (itemViewType != 6) {
            rect.left = recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.margin_m);
            rect.right = recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.margin_m);
        } else {
            rect.left = 0;
            rect.right = 0;
        }
    }
}
