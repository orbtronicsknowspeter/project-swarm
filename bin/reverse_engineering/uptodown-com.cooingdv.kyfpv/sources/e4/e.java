package e4;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.measurement.i5;
import com.uptodown.R;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.b f4515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f4516c;

    public e(ArrayList arrayList, Context context, w4.b bVar) {
        bVar.getClass();
        this.f4514a = context;
        this.f4515b = bVar;
        this.f4516c = arrayList;
        notifyDataSetChanged();
    }

    public final ArrayList a() {
        ArrayList arrayList = this.f4516c;
        if (arrayList != null) {
            return arrayList;
        }
        kotlin.jvm.internal.l.i("data");
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return a().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        viewHolder.getClass();
        if (!(viewHolder instanceof m5.s)) {
            com.google.gson.internal.a.p("ViewHolder unknown!!");
            return;
        }
        m5.s sVar = (m5.s) viewHolder;
        Object obj = a().get(i);
        obj.getClass();
        x4.e eVar = (x4.e) obj;
        sVar.f7559n.setText(eVar.f11123b);
        TextView textView = sVar.f7560o;
        Context context = sVar.f7557l;
        context.getClass();
        textView.setText(i5.H(context, eVar.f11134w));
        ConcurrentHashMap concurrentHashMap = j5.t.f6709a;
        sVar.f7558m.setImageDrawable(j5.t.b(context, eVar.f11124l));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewS = androidx.lifecycle.l.s(viewGroup, R.layout.free_up_item, viewGroup, false);
        viewS.getClass();
        return new m5.s(viewS, this.f4515b, this.f4514a);
    }
}
