package l5;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7141d;

    public i(int i, int i6, int i10, int i11) {
        this.f7138a = i;
        this.f7139b = i6;
        this.f7140c = i10;
        this.f7141d = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.getClass();
        view.getClass();
        recyclerView.getClass();
        state.getClass();
        rect.left = this.f7138a;
        rect.right = this.f7139b;
        rect.bottom = this.f7140c;
        rect.top = this.f7141d;
        if (recyclerView.getChildLayoutPosition(view) > 0) {
            rect.top = 0;
        }
    }
}
