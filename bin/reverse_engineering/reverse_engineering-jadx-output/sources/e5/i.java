package e5;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.leanback.widget.Presenter;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends Presenter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f4741a;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb  */
    @Override // androidx.leanback.widget.Presenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.leanback.widget.Presenter.ViewHolder r17, java.lang.Object r18) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.i.onBindViewHolder(androidx.leanback.widget.Presenter$ViewHolder, java.lang.Object):void");
    }

    @Override // androidx.leanback.widget.Presenter
    public final Presenter.ViewHolder onCreateViewHolder(ViewGroup viewGroup) {
        View viewS = androidx.lifecycle.l.s(viewGroup, 2131558842, viewGroup, false);
        viewS.getClass();
        Context context = this.f4741a;
        context.getClass();
        i5.c cVar = new i5.c(viewS);
        cVar.f5670a = context;
        View viewFindViewById = viewS.findViewById(2131362369);
        viewFindViewById.getClass();
        cVar.f5671b = (ImageView) viewFindViewById;
        View viewFindViewById2 = viewS.findViewById(2131362425);
        viewFindViewById2.getClass();
        cVar.f5672l = (ImageView) viewFindViewById2;
        View viewFindViewById3 = viewS.findViewById(2131364046);
        viewFindViewById3.getClass();
        TextView textView = (TextView) viewFindViewById3;
        cVar.f5673m = textView;
        View viewFindViewById4 = viewS.findViewById(2131363772);
        viewFindViewById4.getClass();
        TextView textView2 = (TextView) viewFindViewById4;
        cVar.f5674n = textView2;
        View viewFindViewById5 = viewS.findViewById(2131364336);
        viewFindViewById5.getClass();
        TextView textView3 = (TextView) viewFindViewById5;
        cVar.f5675o = textView3;
        textView.setTypeface(f4.c.f4882w);
        textView2.setTypeface(f4.c.f4883x);
        textView3.setTypeface(f4.c.f4883x);
        return cVar;
    }

    @Override // androidx.leanback.widget.Presenter
    public final void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
        viewHolder.getClass();
        if (viewHolder instanceof i5.c) {
            i5.c cVar = (i5.c) viewHolder;
            cVar.f5671b.setImageDrawable(null);
            cVar.f5672l.setImageDrawable(null);
            cVar.f5673m.setText((CharSequence) null);
            cVar.f5674n.setText((CharSequence) null);
            cVar.f5675o.setText((CharSequence) null);
        }
    }
}
