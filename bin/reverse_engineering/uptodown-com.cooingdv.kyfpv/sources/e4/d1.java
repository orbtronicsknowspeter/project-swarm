package e4;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import m5.w1;
import x4.z2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d1 extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f4512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.support.v4.media.g f4513b;

    public d1(ArrayList arrayList, android.support.v4.media.g gVar) {
        this.f4512a = arrayList;
        this.f4513b = gVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f4512a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        w1 w1Var = (w1) viewHolder;
        w1Var.getClass();
        Object obj = this.f4512a.get(i);
        obj.getClass();
        z2 z2Var = (z2) obj;
        t4.c1 c1Var = w1Var.f7628a;
        TextView textView = c1Var.f9677o;
        ImageView imageView = c1Var.f9674l;
        textView.setText(z2Var.f11484l);
        TextView textView2 = c1Var.f9676n;
        long j = z2Var.f11489q;
        textView2.setText(j <= 0 ? null : new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(new Date(j)));
        int i6 = z2Var.f11487o;
        if (i6 == 0) {
            androidx.lifecycle.l.A(w1Var.itemView, R.drawable.vector_user_device_mobile_item, imageView);
        } else if (i6 == 1) {
            androidx.lifecycle.l.A(w1Var.itemView, R.drawable.vector_user_device_tablet_item, imageView);
        } else {
            if (i6 != 2) {
                return;
            }
            androidx.lifecycle.l.A(w1Var.itemView, R.drawable.vector_user_device_tv_item, imageView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        return new w1(t4.c1.a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.user_device_item, viewGroup, false)), this.f4513b);
    }
}
