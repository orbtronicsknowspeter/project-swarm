package e4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import x4.s1;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class q extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f4658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f4659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a3.d f4660c;

    public q(ArrayList arrayList, Context context, a3.d dVar) {
        dVar.getClass();
        this.f4658a = arrayList;
        this.f4659b = context;
        this.f4660c = dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f4658a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        m5.h0 h0Var = (m5.h0) viewHolder;
        h0Var.getClass();
        Object obj = this.f4658a.get(i);
        obj.getClass();
        s1 s1Var = (s1) obj;
        h0Var.f7414b.setText(s1Var.f11387c);
        h0Var.f7415l.setText(s1Var.f11388d);
        String str = s1Var.f11386b;
        str.getClass();
        Date date = new Date(Long.parseLong(str));
        h0Var.f7418o.setText(DateFormat.getDateTimeInstance().format(Long.valueOf(date.getTime())));
        String str2 = s1Var.f11389e;
        TextView textView = h0Var.f7416m;
        textView.setVisibility(8);
        TextView textView2 = h0Var.f7417n;
        textView2.setVisibility(8);
        if (str2 == null || l7.m.q0(str2, "no_action", false)) {
            return;
        }
        List listG0 = l7.m.G0(str2, new String[]{";"});
        int size = listG0.size();
        if (size == 1) {
            textView.setText(h0Var.a((String) listG0.get(0)));
            textView.setVisibility(0);
        } else {
            if (size != 2) {
                return;
            }
            textView.setText(h0Var.a((String) listG0.get(0)));
            textView2.setText(h0Var.a((String) listG0.get(1)));
            textView.setVisibility(0);
            textView2.setVisibility(0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(this.f4659b).inflate(R.layout.notification_registry_item, viewGroup, false);
        viewInflate.getClass();
        return new m5.h0(viewInflate, this.f4660c);
    }
}
