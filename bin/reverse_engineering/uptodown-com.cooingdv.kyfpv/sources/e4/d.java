package e4;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.google.android.gms.internal.measurement.i5;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.util.views.UsernameTextView;
import java.util.ArrayList;
import x4.w2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f4506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0.i f4507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4508c;

    public d(ArrayList arrayList, f0.i iVar) {
        arrayList.getClass();
        iVar.getClass();
        this.f4506a = arrayList;
        this.f4507b = iVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f4506a.size() + (this.f4508c ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return i == this.f4506a.size() ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        viewHolder.getClass();
        if (viewHolder instanceof m5.q) {
            m5.q qVar = (m5.q) viewHolder;
            Object obj = this.f4506a.get(i);
            obj.getClass();
            w2 w2Var = (w2) obj;
            Context context = qVar.f7525l;
            a4.d0 d0Var = qVar.f7523a;
            a4.g0 g0VarD = a4.g0.d();
            String str = w2Var.f11434l;
            a4.l0 l0VarE = g0VarD.e(str != null ? a4.x.k(str, UptodownApp.R, ":webp") : null);
            float f = UptodownApp.I;
            context.getClass();
            l0VarE.h(b4.d.x(context));
            l0VarE.g(b4.d.f(context));
            ImageView imageView = (ImageView) d0Var.f82l;
            UsernameTextView usernameTextView = (UsernameTextView) d0Var.f85o;
            ImageView imageView2 = (ImageView) d0Var.f83m;
            TextView textView = (TextView) d0Var.f84n;
            l0VarE.e(imageView, null);
            ((RelativeLayout) d0Var.f81b).setOnClickListener(new g4.b0(6, qVar, w2Var));
            boolean zD = w2Var.d();
            ImageView imageView3 = (ImageView) d0Var.f82l;
            if (zD) {
                int dimension = (int) imageView3.getContext().getResources().getDimension(R.dimen.border_radius_xs);
                imageView3.setForeground(ContextCompat.getDrawable(imageView3.getContext(), R.drawable.shape_stroke_review_avatar_turbo));
                imageView3.setPadding(dimension, dimension, dimension, dimension);
                imageView2.setVisibility(0);
            } else {
                imageView3.setForeground(null);
                imageView3.setPadding(0, 0, 0, 0);
                imageView2.setVisibility(8);
            }
            usernameTextView.setText(w2Var.f11435m);
            int i6 = UsernameTextView.f3453s;
            i5.g(usernameTextView, w2Var.d(), w2Var.f11437o);
            textView.setOnClickListener(new g4.a(i, qVar, 1, w2Var));
            int i10 = w2Var.f11440r;
            if (i10 == 1) {
                textView.setVisibility(0);
                textView.setText(context.getString(R.string.following));
                textView.setBackground(ContextCompat.getDrawable(context, R.drawable.ripple_open_button));
                textView.setTextColor(ContextCompat.getColor(context, R.color.blue_primary));
                return;
            }
            if (i10 != 0) {
                if (i10 == -1) {
                    textView.setVisibility(8);
                }
            } else {
                textView.setVisibility(0);
                textView.setText(context.getString(R.string.follow));
                textView.setBackground(ContextCompat.getDrawable(context, R.drawable.ripple_blue_primary_button));
                textView.setTextColor(ContextCompat.getColor(context, R.color.white));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        if (i != 0) {
            if (i != 1) {
                com.google.gson.internal.a.p("viewType unknown");
                return null;
            }
            View viewB = c.j.b(viewGroup, R.layout.pb_loading_more_content, viewGroup, false);
            viewB.getClass();
            return new m5.c0(viewB);
        }
        View viewB2 = c.j.b(viewGroup, R.layout.follow_list_item, viewGroup, false);
        int i6 = R.id.iv_avatar_follow_list_item;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewB2, R.id.iv_avatar_follow_list_item);
        if (imageView != null) {
            i6 = R.id.iv_turbo_mark_follow_list_item;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewB2, R.id.iv_turbo_mark_follow_list_item);
            if (imageView2 != null) {
                i6 = R.id.tv_action_follow_list_item;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewB2, R.id.tv_action_follow_list_item);
                if (textView != null) {
                    i6 = R.id.tv_username_follow_list_item;
                    UsernameTextView usernameTextView = (UsernameTextView) ViewBindings.findChildViewById(viewB2, R.id.tv_username_follow_list_item);
                    if (usernameTextView != null) {
                        return new m5.q(new a4.d0((RelativeLayout) viewB2, imageView, imageView2, textView, usernameTextView, 8), this.f4507b);
                    }
                }
            }
        }
        com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewB2.getResources().getResourceName(i6)));
        return null;
    }
}
