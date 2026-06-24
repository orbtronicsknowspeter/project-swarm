package e4;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import m5.u1;
import x4.y2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c1 extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f4504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.b f4505b;

    public c1(ArrayList arrayList, w4.b bVar) {
        arrayList.getClass();
        bVar.getClass();
        this.f4504a = arrayList;
        this.f4505b = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f4504a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        u1 u1Var = (u1) viewHolder;
        u1Var.getClass();
        Object obj = this.f4504a.get(i);
        obj.getClass();
        y2 y2Var = (y2) obj;
        t4.c1 c1Var = u1Var.f7605a;
        c1Var.f9677o.setText(y2Var.f11473a);
        TextView textView = c1Var.f9676n;
        long j = y2Var.f11475c;
        textView.setText(j <= 0 ? null : new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(new Date(j)));
        a4.l0 l0VarE = a4.g0.d().e(y2Var.f11476d);
        float f = UptodownApp.I;
        Context context = u1Var.itemView.getContext();
        context.getClass();
        l0VarE.h(b4.d.x(context));
        Context context2 = u1Var.itemView.getContext();
        context2.getClass();
        l0VarE.g(b4.d.f(context2));
        l0VarE.e(c1Var.f9675m, null);
        c1Var.f9674l.setVisibility(y2Var.f11477e == 1 ? 0 : 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewS = androidx.lifecycle.l.s(viewGroup, R.layout.user_device_app_item, viewGroup, false);
        int i6 = R.id.iv_action_user_device_app_item;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewS, R.id.iv_action_user_device_app_item);
        if (imageView != null) {
            i6 = R.id.iv_icon_user_device_app_item;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewS, R.id.iv_icon_user_device_app_item);
            if (imageView2 != null) {
                i6 = R.id.ll_info_user_device_app_item;
                if (((LinearLayout) ViewBindings.findChildViewById(viewS, R.id.ll_info_user_device_app_item)) != null) {
                    i6 = R.id.rl_container_user_device_app_item;
                    if (((RelativeLayout) ViewBindings.findChildViewById(viewS, R.id.rl_container_user_device_app_item)) != null) {
                        i6 = R.id.tv_last_update_user_device_app_item;
                        TextView textView = (TextView) ViewBindings.findChildViewById(viewS, R.id.tv_last_update_user_device_app_item);
                        if (textView != null) {
                            i6 = R.id.tv_name_user_device_app_item;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewS, R.id.tv_name_user_device_app_item);
                            if (textView2 != null) {
                                return new u1(new t4.c1((RelativeLayout) viewS, imageView, imageView2, textView, textView2, 0), this.f4505b);
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
