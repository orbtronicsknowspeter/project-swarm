package m5;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class j1 extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w4.j f7436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RelativeLayout f7437b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f7438l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4.m f7439m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(View view, w4.j jVar, w4.a aVar) {
        super(view);
        jVar.getClass();
        aVar.getClass();
        this.f7436a = jVar;
        View viewFindViewById = view.findViewById(R.id.rl_title_home_recycler_view_top);
        viewFindViewById.getClass();
        this.f7437b = (RelativeLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.tv_title_home_recycler_view_top);
        viewFindViewById2.getClass();
        TextView textView = (TextView) viewFindViewById2;
        this.f7438l = textView;
        e4.m mVar = new e4.m(jVar, aVar);
        this.f7439m = mVar;
        View viewFindViewById3 = view.findViewById(R.id.rv_home_recycler_view_top);
        viewFindViewById3.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById3;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext(), 0, false);
        textView.setTypeface(f4.c.f4883w);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(mVar);
    }
}
