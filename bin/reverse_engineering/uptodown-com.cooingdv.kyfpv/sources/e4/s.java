package e4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class s extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x4.g f4681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x4.e f4682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f4683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f0.i f4684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4685e;
    public int f;

    public s(x4.g gVar, x4.e eVar, Context context, f0.i iVar, int i) {
        iVar.getClass();
        this.f4681a = gVar;
        this.f4682b = eVar;
        this.f4683c = context;
        this.f4684d = iVar;
        this.f4685e = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList arrayList = this.f4681a.E0;
        return (arrayList != null ? arrayList.size() : 0) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        ArrayList arrayList = this.f4681a.E0;
        return i < (arrayList != null ? arrayList.size() : 0) ? 1 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c2  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r21, int r22) {
        /*
            Method dump skipped, instruction units count: 864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.s.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        Context context = this.f4683c;
        if (i == 0) {
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.header_installed_app, viewGroup, false);
            viewInflate.getClass();
            return new m5.t(viewInflate, context);
        }
        if (i != 1) {
            View viewInflate2 = LayoutInflater.from(context).inflate(R.layout.load_more_versions, viewGroup, false);
            viewInflate2.getClass();
            return new m5.b0(viewInflate2);
        }
        View viewInflate3 = LayoutInflater.from(context).inflate(R.layout.old_version_item, viewGroup, false);
        viewInflate3.getClass();
        return new m5.l0(viewInflate3, this.f4684d);
    }
}
