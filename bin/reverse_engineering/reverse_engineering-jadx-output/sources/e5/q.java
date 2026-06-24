package e5;

import a4.g0;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.leanback.widget.Presenter;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class q extends Presenter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4754a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4755b = -1;

    @Override // androidx.leanback.widget.Presenter
    public final void onBindViewHolder(Presenter.ViewHolder viewHolder, Object obj) {
        viewHolder.getClass();
        if (obj == null) {
            return;
        }
        g0.d().e(((x4.g) obj).e()).e(((i5.h) viewHolder).f5694a, null);
    }

    @Override // androidx.leanback.widget.Presenter
    public final Presenter.ViewHolder onCreateViewHolder(ViewGroup viewGroup) {
        View viewS = androidx.lifecycle.l.s(viewGroup, 2131558851, viewGroup, false);
        this.f4755b = ContextCompat.getColor(viewGroup.getContext(), 2131100500);
        this.f4754a = ContextCompat.getColor(viewGroup.getContext(), 2131100502);
        viewS.setFocusable(true);
        viewS.setFocusableInTouchMode(true);
        viewS.setOnFocusChangeListener(new com.google.android.material.datepicker.c(this, 2));
        viewS.setBackgroundColor(this.f4755b);
        return new i5.h(viewS);
    }

    @Override // androidx.leanback.widget.Presenter
    public final void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
        viewHolder.getClass();
    }
}
