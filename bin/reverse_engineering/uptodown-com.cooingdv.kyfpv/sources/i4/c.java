package i4;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.lifecycle.l;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import g4.b0;
import java.util.ArrayList;
import l4.n;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k4.b f5660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f5661b;

    public c(ArrayList arrayList, k4.b bVar) {
        this.f5660a = bVar;
        this.f5661b = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList arrayList = this.f5661b;
        arrayList.getClass();
        return arrayList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        r4.c cVar = (r4.c) viewHolder;
        cVar.getClass();
        CheckBox checkBox = cVar.f8908a;
        ArrayList arrayList = this.f5661b;
        arrayList.getClass();
        checkBox.setText(((n) arrayList.get(i)).f7125e);
        checkBox.setChecked(((n) arrayList.get(i)).f7122b);
        checkBox.setEnabled(((n) arrayList.get(i)).f7124d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewS = l.s(viewGroup, R.layout.split_item, viewGroup, false);
        viewS.getClass();
        k4.b bVar = this.f5660a;
        bVar.getClass();
        r4.c cVar = new r4.c(viewS);
        View viewFindViewById = viewS.findViewById(R.id.cb_split_item);
        viewFindViewById.getClass();
        CheckBox checkBox = (CheckBox) viewFindViewById;
        cVar.f8908a = checkBox;
        viewS.setOnClickListener(new b0(29, cVar, bVar));
        checkBox.setTypeface(f4.c.f4884x);
        return cVar;
    }
}
