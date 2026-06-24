package e4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class v extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w4.c f4706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f4707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f4708c;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f4708c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        u uVar = (u) viewHolder;
        uVar.getClass();
        boolean zA = kotlin.jvm.internal.l.a(this.f4708c.get(i), q6.l.y0(this.f4708c));
        ArrayList arrayList = this.f4708c;
        if (zA) {
            Object obj = arrayList.get(i);
            obj.getClass();
            uVar.g((x4.g) obj, true);
        } else {
            Object obj2 = arrayList.get(i);
            obj2.getClass();
            uVar.g((x4.g) obj2, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        return new u(this, g4.v.f(LayoutInflater.from(viewGroup.getContext()), viewGroup), this.f4706a, this.f4707b);
    }
}
