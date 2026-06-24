package e4;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.ArrayList;
import x4.k2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f4561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f4562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w4.m f4563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4564d;

    public i0(ArrayList arrayList, Context context, w4.m mVar) {
        mVar.getClass();
        this.f4561a = arrayList;
        this.f4562b = context;
        this.f4563c = mVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f4561a.size() + (this.f4564d ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        ArrayList arrayList = this.f4561a;
        if (i == arrayList.size()) {
            return 2;
        }
        return ((k2) arrayList.get(i)).b() ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        viewHolder.getClass();
        if (viewHolder instanceof m5.t0) {
            Object obj = this.f4561a.get(i);
            obj.getClass();
            k2 k2Var = (k2) obj;
            if (!k2Var.b()) {
                m5.t0 t0Var = (m5.t0) viewHolder;
                t0Var.a(k2Var, i);
                ImageView imageView = t0Var.v;
                Context context = t0Var.f7583a;
                imageView.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_on));
                ImageView imageView2 = t0Var.f7595w;
                imageView2.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_off));
                ImageView imageView3 = t0Var.f7596x;
                imageView3.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_off));
                ImageView imageView4 = t0Var.f7597y;
                imageView4.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_off));
                ImageView imageView5 = t0Var.f7598z;
                imageView5.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_off));
                if (k2Var.f11265p >= 2) {
                    imageView2.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_on));
                }
                if (k2Var.f11265p >= 3) {
                    imageView3.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_on));
                }
                if (k2Var.f11265p >= 4) {
                    imageView4.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_on));
                }
                if (k2Var.f11265p == 5) {
                    imageView5.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_on));
                    return;
                }
                return;
            }
            m5.t0 t0Var2 = (m5.t0) viewHolder;
            t0Var2.a(k2Var, i);
            ImageView imageView6 = t0Var2.v;
            Context context2 = t0Var2.f7583a;
            imageView6.setImageDrawable(ContextCompat.getDrawable(context2, R.drawable.vector_star_on_turbo));
            ImageView imageView7 = t0Var2.f7595w;
            imageView7.setImageDrawable(ContextCompat.getDrawable(context2, R.drawable.vector_star_off_turbo));
            ImageView imageView8 = t0Var2.f7596x;
            imageView8.setImageDrawable(ContextCompat.getDrawable(context2, R.drawable.vector_star_off_turbo));
            ImageView imageView9 = t0Var2.f7597y;
            imageView9.setImageDrawable(ContextCompat.getDrawable(context2, R.drawable.vector_star_off_turbo));
            ImageView imageView10 = t0Var2.f7598z;
            imageView10.setImageDrawable(ContextCompat.getDrawable(context2, R.drawable.vector_star_off_turbo));
            if (k2Var.f11265p >= 2) {
                imageView7.setImageDrawable(ContextCompat.getDrawable(context2, R.drawable.vector_star_on_turbo));
            }
            if (k2Var.f11265p >= 3) {
                imageView8.setImageDrawable(ContextCompat.getDrawable(context2, R.drawable.vector_star_on_turbo));
            }
            if (k2Var.f11265p >= 4) {
                imageView9.setImageDrawable(ContextCompat.getDrawable(context2, R.drawable.vector_star_on_turbo));
            }
            if (k2Var.f11265p == 5) {
                imageView10.setImageDrawable(ContextCompat.getDrawable(context2, R.drawable.vector_star_on_turbo));
            }
            t0Var2.A.setVisibility(0);
            ImageView imageView11 = t0Var2.f7585l;
            imageView11.getClass();
            int dimension = (int) imageView11.getContext().getResources().getDimension(R.dimen.border_radius_xs);
            imageView11.setForeground(ContextCompat.getDrawable(imageView11.getContext(), R.drawable.shape_stroke_review_avatar_turbo));
            imageView11.setPadding(dimension, dimension, dimension, dimension);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        w4.m mVar = this.f4563c;
        Context context = this.f4562b;
        return i != 1 ? i != 2 ? new m5.t0(androidx.lifecycle.l.E(viewGroup, R.layout.review, viewGroup, false), context, mVar) : new m5.c0(androidx.lifecycle.l.E(viewGroup, R.layout.pb_loading_more_content, viewGroup, false)) : new m5.t0(androidx.lifecycle.l.E(viewGroup, R.layout.review_turbo, viewGroup, false), context, mVar);
    }
}
