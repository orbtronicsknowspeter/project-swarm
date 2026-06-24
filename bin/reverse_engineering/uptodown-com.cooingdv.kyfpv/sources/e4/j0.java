package e4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.measurement.i5;
import com.uptodown.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class j0 extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f4571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f4572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w4.b f4573c;

    public j0(ArrayList arrayList, Context context, w4.b bVar) {
        bVar.getClass();
        this.f4571a = arrayList;
        this.f4572b = context;
        this.f4573c = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f4571a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        m5.v0 v0Var = (m5.v0) viewHolder;
        v0Var.getClass();
        Object obj = this.f4571a.get(i);
        obj.getClass();
        x4.e eVar = (x4.e) obj;
        ImageView imageView = v0Var.f7619n;
        Context context = this.f4572b;
        context.getClass();
        try {
            PackageManager packageManager = context.getPackageManager();
            packageManager.getClass();
            String str = eVar.f11124l;
            str.getClass();
            ApplicationInfo applicationInfo = n4.i.e(packageManager, str, 0).applicationInfo;
            if (applicationInfo != null) {
                imageView.setImageDrawable(applicationInfo.loadIcon(context.getPackageManager()));
            }
        } catch (Exception e10) {
            imageView.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_uptodown_logo_disabled));
            e10.printStackTrace();
        }
        v0Var.f7616b.setText(eVar.f11123b);
        v0Var.f7617l.setText(eVar.f11126n);
        v0Var.f7618m.setText(i5.H(context, eVar.f11134w));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(this.f4572b).inflate(R.layout.rollback_item, viewGroup, false);
        viewInflate.getClass();
        return new m5.v0(viewInflate, this.f4573c);
    }
}
