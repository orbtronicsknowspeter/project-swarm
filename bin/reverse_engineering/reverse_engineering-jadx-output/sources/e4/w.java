package e4;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class w extends m5.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f4710b;

    /* JADX WARN: Illegal instructions before constructor call */
    public w(b0 b0Var, b5.m mVar, a3.d dVar, Context context, String str) {
        dVar.getClass();
        str.getClass();
        LinearLayout linearLayout = (LinearLayout) mVar.f1061b;
        linearLayout.getClass();
        super(linearLayout, context);
        v vVar = new v();
        vVar.f4705a = dVar;
        vVar.f4706b = context;
        vVar.f4707c = new ArrayList();
        this.f4710b = vVar;
        RecyclerView recyclerView = (RecyclerView) mVar.f1062l;
        recyclerView.setLayoutManager(new LinearLayoutManager(this.itemView.getContext(), 0, false));
        recyclerView.setAdapter(vVar);
        TextView textView = (TextView) mVar.f1063m;
        textView.setTypeface(f4.c.f4882w);
        textView.setText(context.getString(2131952441, str));
    }
}
