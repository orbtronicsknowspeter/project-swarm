package e4;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w4.j f4639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w4.a f4640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f4641c;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f4641c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        TextView textView;
        LinearLayout linearLayout;
        m5.c cVar = (m5.c) viewHolder;
        cVar.getClass();
        Object obj = this.f4641c.get(i);
        obj.getClass();
        x4.g gVar = (x4.g) obj;
        RelativeLayout relativeLayout = cVar.f7326m;
        m5.e.b(relativeLayout, cVar.f7324b, gVar);
        relativeLayout.setOnLongClickListener(new d4.d(cVar, gVar, i, 6));
        TextView textView2 = cVar.f7328o;
        TextView textView3 = cVar.f7329p;
        m5.e.f(gVar, textView2, textView3);
        cVar.e(cVar.f7327n, gVar.i());
        ProgressBar progressBar = cVar.f7331r;
        if (progressBar == null || (textView = cVar.f7332s) == null || (linearLayout = cVar.f7333t) == null) {
            cVar.d(gVar.F, cVar.f7330q, textView3);
        } else {
            cVar.c(gVar, progressBar, cVar.f7327n, cVar.f7329p, textView, cVar.f7330q, linearLayout);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewS = androidx.lifecycle.l.s(viewGroup, R.layout.app_info_item_small, viewGroup, false);
        viewS.getClass();
        return new m5.c(viewS, this.f4639a, this.f4640b);
    }
}
