package e4;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.google.android.gms.internal.measurement.i5;
import com.uptodown.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class z extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w4.c f4728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f4729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f4730c;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f4730c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        y yVar = (y) viewHolder;
        yVar.getClass();
        Object obj = this.f4730c.get(i);
        obj.getClass();
        x4.g gVar = (x4.g) obj;
        View view = yVar.itemView;
        view.getClass();
        m5.e.b(view, yVar.f4722l, gVar);
        e2.d dVar = yVar.f4721b;
        TextView textView = (TextView) dVar.f4471o;
        TextView textView2 = (TextView) dVar.f4469m;
        m5.e.f(gVar, textView, textView2);
        yVar.d(gVar.F, (TextView) dVar.f4472p, textView2);
        yVar.e((ImageView) dVar.f4468l, gVar.h());
        ((TextView) dVar.f4473q).setText(String.valueOf(((double) gVar.f11195y) / 10.0d));
        ((TextView) dVar.f4470n).setText(yVar.f4723m.f4729b.getString(R.string.downloads_counter_multiple, i5.D(gVar.f11182r)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewS = androidx.lifecycle.l.s(viewGroup, R.layout.organization_top_item_card, viewGroup, false);
        int i6 = R.id.iv_top_app_logo_organization;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewS, R.id.iv_top_app_logo_organization);
        if (imageView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) viewS;
            i6 = R.id.tv_top_app_desc_organization;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewS, R.id.tv_top_app_desc_organization);
            if (textView != null) {
                i6 = R.id.tv_top_app_downloads_counter_organization;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewS, R.id.tv_top_app_downloads_counter_organization);
                if (textView2 != null) {
                    i6 = R.id.tv_top_app_name_organization;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(viewS, R.id.tv_top_app_name_organization);
                    if (textView3 != null) {
                        i6 = R.id.tv_top_app_status_organization;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(viewS, R.id.tv_top_app_status_organization);
                        if (textView4 != null) {
                            i6 = R.id.tv_top_app_valoration_organization;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(viewS, R.id.tv_top_app_valoration_organization);
                            if (textView5 != null) {
                                return new y(this, new e2.d(relativeLayout, imageView, textView, textView2, textView3, textView4, textView5, 9), this.f4728a, this.f4729b);
                            }
                        }
                    }
                }
            }
        }
        com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewS.getResources().getResourceName(i6)));
        return null;
    }
}
