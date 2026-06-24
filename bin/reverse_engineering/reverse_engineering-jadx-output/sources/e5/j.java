package e5;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.widget.Presenter;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends Presenter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f4742a;

    @Override // androidx.leanback.widget.Presenter
    public final void onBindViewHolder(Presenter.ViewHolder viewHolder, Object obj) {
        viewHolder.getClass();
        if (!(viewHolder instanceof i5.d) || obj == null) {
            return;
        }
        ((i5.d) viewHolder).b(obj);
    }

    @Override // androidx.leanback.widget.Presenter
    public final Presenter.ViewHolder onCreateViewHolder(ViewGroup viewGroup) {
        View viewS = androidx.lifecycle.l.s(viewGroup, 2131558843, viewGroup, false);
        viewS.getClass();
        return new i5.d(viewS, this.f4742a);
    }

    @Override // androidx.leanback.widget.Presenter
    public final void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
        viewHolder.getClass();
        if (viewHolder instanceof i5.d) {
            ((i5.d) viewHolder).d();
        }
    }
}
