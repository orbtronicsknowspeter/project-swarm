package i4;

import android.net.nsd.NsdServiceInfo;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.l;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import f0.i;
import g4.b0;
import java.util.ArrayList;
import l7.m;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f5654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f5655b;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList arrayList = this.f5654a;
        arrayList.getClass();
        return arrayList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        r4.a aVar = (r4.a) viewHolder;
        aVar.getClass();
        TextView textView = aVar.f8901a;
        ArrayList arrayList = this.f5654a;
        arrayList.getClass();
        String serviceName = ((NsdServiceInfo) arrayList.get(i)).getServiceName();
        serviceName.getClass();
        textView.setText(serviceName.substring(0, m.y0(serviceName, "_d:_", 0, false, 6)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View viewE = l.E(viewGroup, R.layout.device_item, viewGroup, false);
        i iVar = this.f5655b;
        r4.a aVar = new r4.a(viewE);
        View viewFindViewById = viewE.findViewById(R.id.tv_device_name);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        aVar.f8901a = textView;
        viewE.setOnClickListener(new b0(27, iVar, aVar));
        textView.setTypeface(f4.c.f4884x);
        return aVar;
    }
}
