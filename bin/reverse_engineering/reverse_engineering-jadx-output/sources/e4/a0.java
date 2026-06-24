package e4;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends m5.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f4478b;

    /* JADX WARN: Illegal instructions before constructor call */
    public a0(b0 b0Var, m8.q qVar, a3.d dVar, Context context) {
        dVar.getClass();
        LinearLayout linearLayout = (LinearLayout) qVar.f7780b;
        linearLayout.getClass();
        super(linearLayout, context);
        z zVar = new z();
        zVar.f4727a = dVar;
        zVar.f4728b = context;
        zVar.f4729c = new ArrayList();
        this.f4478b = zVar;
        RecyclerView recyclerView = (RecyclerView) qVar.f7781l;
        recyclerView.setLayoutManager(new LinearLayoutManager(this.itemView.getContext(), 1, false));
        recyclerView.setAdapter(zVar);
    }
}
