package e5;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.leanback.widget.Presenter;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends Presenter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4744b;

    @Override // androidx.leanback.widget.Presenter
    public final void onBindViewHolder(Presenter.ViewHolder viewHolder, Object obj) {
        viewHolder.getClass();
        if (obj == null) {
            return;
        }
        c5.b bVar = (c5.b) obj;
        i5.e eVar = (i5.e) viewHolder;
        eVar.f5682b.setText(bVar.f2415b);
        eVar.f5681a.setImageResource(bVar.f2416c);
    }

    @Override // androidx.leanback.widget.Presenter
    public final Presenter.ViewHolder onCreateViewHolder(ViewGroup viewGroup) {
        View viewS = androidx.lifecycle.l.s(viewGroup, 2131558845, viewGroup, false);
        this.f4744b = ContextCompat.getColor(viewGroup.getContext(), 2131100500);
        this.f4743a = ContextCompat.getColor(viewGroup.getContext(), 2131100502);
        viewS.setFocusable(true);
        viewS.setFocusableInTouchMode(true);
        viewS.setOnFocusChangeListener(new com.google.android.material.datepicker.c(this, 1));
        viewS.setBackgroundColor(this.f4744b);
        return new i5.e(viewS);
    }

    @Override // androidx.leanback.widget.Presenter
    public final void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
        viewHolder.getClass();
    }
}
