package m5;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.location.LocationRequestCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class v extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w4.j f7606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f7607b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RecyclerView f7608l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4.j f7609m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LinearLayout f7610n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l5.b f7611o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f7612p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f7613q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(View view, w4.j jVar, w4.a aVar, w4.l lVar) {
        super(view);
        aVar.getClass();
        lVar.getClass();
        this.f7606a = jVar;
        View viewFindViewById = view.findViewById(2131364400);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        this.f7607b = textView;
        View viewFindViewById2 = view.findViewById(2131363326);
        viewFindViewById2.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        this.f7608l = recyclerView;
        e4.j jVar2 = new e4.j(jVar, aVar);
        this.f7609m = jVar2;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext(), 0, false);
        View viewFindViewById3 = view.findViewById(2131362631);
        viewFindViewById3.getClass();
        this.f7610n = (LinearLayout) viewFindViewById3;
        l5.b bVar = new l5.b();
        this.f7611o = bVar;
        this.f7613q = LocationRequestCompat.QUALITY_BALANCED_POWER_ACCURACY;
        textView.setTypeface(f4.c.f4882w);
        bVar.attachToRecyclerView(recyclerView);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(jVar2);
        recyclerView.addOnScrollListener(new u(this, lVar));
        recyclerView.post(new androidx.browser.trusted.c(18, this, lVar));
    }
}
