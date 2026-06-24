package i4;

import android.view.ViewGroup;
import androidx.lifecycle.l;
import androidx.recyclerview.widget.RecyclerView;
import f0.i;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f5655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f5656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean[] f5658d;

    public b(i iVar) {
        iVar.getClass();
        this.f5655a = iVar;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        if (this.f5656b != null) {
            boolean[] zArr = this.f5658d;
            zArr.getClass();
            int length = zArr.length;
            for (int i = 0; i < length; i++) {
                if (zArr[i]) {
                    ArrayList arrayList2 = this.f5656b;
                    arrayList2.getClass();
                    arrayList.add(arrayList2.get(i));
                }
            }
        }
        return arrayList;
    }

    public final void b(int i) {
        boolean[] zArr = this.f5658d;
        zArr.getClass();
        this.f5658d.getClass();
        zArr[i] = !r1[i];
        notifyItemChanged(i);
    }

    public final void c(boolean z9) {
        this.f5657c = z9;
        if (!z9) {
            ArrayList arrayList = this.f5656b;
            if (arrayList != null) {
                this.f5658d = new boolean[arrayList.size()];
            } else {
                this.f5658d = new boolean[0];
            }
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList arrayList = this.f5656b;
        if (arrayList == null) {
            return 0;
        }
        arrayList.getClass();
        return arrayList.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b6  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r13, int r14) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.b.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        return new r4.b(l.E(viewGroup, 2131558554, viewGroup, false), this.f5655a);
    }
}
