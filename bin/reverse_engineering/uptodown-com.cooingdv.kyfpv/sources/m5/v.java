package m5;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.location.LocationRequestCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class v extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w4.j f7607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f7608b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RecyclerView f7609l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4.j f7610m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LinearLayout f7611n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l5.b f7612o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f7613p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f7614q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(View view, w4.j jVar, w4.a aVar, w4.l lVar) {
        super(view);
        aVar.getClass();
        lVar.getClass();
        this.f7607a = jVar;
        View viewFindViewById = view.findViewById(R.id.tv_title_header);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        this.f7608b = textView;
        View viewFindViewById2 = view.findViewById(R.id.rv_home_features);
        viewFindViewById2.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        this.f7609l = recyclerView;
        e4.j jVar2 = new e4.j(jVar, aVar);
        this.f7610m = jVar2;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext(), 0, false);
        View viewFindViewById3 = view.findViewById(R.id.ll_categories);
        viewFindViewById3.getClass();
        this.f7611n = (LinearLayout) viewFindViewById3;
        l5.b bVar = new l5.b();
        this.f7612o = bVar;
        this.f7614q = LocationRequestCompat.QUALITY_BALANCED_POWER_ACCURACY;
        textView.setTypeface(f4.c.f4883w);
        bVar.attachToRecyclerView(recyclerView);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(jVar2);
        recyclerView.addOnScrollListener(new u(this, lVar));
        recyclerView.post(new androidx.browser.trusted.c(18, this, lVar));
    }
}
