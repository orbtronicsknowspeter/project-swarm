package e4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.google.android.gms.internal.measurement.z3;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import java.util.ArrayList;
import java.util.Iterator;
import x4.x1;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0.i f4510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f4511c;

    public d0(ArrayList arrayList, Context context, f0.i iVar) {
        arrayList.getClass();
        iVar.getClass();
        this.f4509a = context;
        this.f4510b = iVar;
        this.f4511c = new ArrayList();
        a(arrayList);
    }

    public final void a(ArrayList arrayList) {
        this.f4511c = new ArrayList();
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            this.f4511c.add((x1) next);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f4511c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return i == this.f4511c.size() ? 4 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        viewHolder.getClass();
        if (!(viewHolder instanceof m5.o0)) {
            if (viewHolder instanceof m5.b1) {
                ((m5.b1) viewHolder).a();
                return;
            } else {
                if (viewHolder instanceof m5.c0) {
                    return;
                }
                com.google.gson.internal.a.p("ViewHolder unknown!!");
                return;
            }
        }
        m5.o0 o0Var = (m5.o0) viewHolder;
        Object obj = this.f4511c.get(i);
        obj.getClass();
        x1 x1Var = (x1) obj;
        a4.l0 l0VarE = a4.g0.d().e(x1Var.f11451c);
        float f = UptodownApp.I;
        Context context = o0Var.f7492b;
        l0VarE.g(b4.d.f(context));
        l0VarE.h(b4.d.x(context));
        g4.v vVar = o0Var.f7491a;
        ImageView imageView = (ImageView) vVar.f5280o;
        TextView textView = (TextView) vVar.f5276b;
        l0VarE.e(imageView, null);
        ((TextView) vVar.f5278m).setText(x1Var.f11450b);
        ((TextView) vVar.f5277l).setText(x1Var.f11452d);
        if (!o0Var.f7494m) {
            textView.setText(context.getString(R.string.pre_registration_title));
            z3.J(textView);
        } else {
            textView.setText(context.getString(R.string.cancel_registration));
            textView.setVisibility(0);
            textView.setBackground(ContextCompat.getDrawable(textView.getContext(), R.drawable.ripple_cancel_button));
            textView.setTextColor(ContextCompat.getColor(textView.getContext(), R.color.white));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        if (i != 0) {
            if (i != 4) {
                com.google.gson.internal.a.p("viewType unknown");
                return null;
            }
            View viewB = c.j.b(viewGroup, R.layout.pb_loading_more_content, viewGroup, false);
            viewB.getClass();
            return new m5.c0(viewB);
        }
        Context context = this.f4509a;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.preregistration_item, viewGroup, false);
        int i6 = R.id.iv_icon_upcoming_release_item;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.iv_icon_upcoming_release_item);
        if (imageView != null) {
            i6 = R.id.ll_upcoming_release;
            if (((LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.ll_upcoming_release)) != null) {
                i6 = R.id.rl_container_upcoming_release_item;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(viewInflate, R.id.rl_container_upcoming_release_item);
                if (relativeLayout != null) {
                    i6 = R.id.tv_action_upcoming_release_item;
                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_action_upcoming_release_item);
                    if (textView != null) {
                        i6 = R.id.tv_author_upcoming_release_item;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_author_upcoming_release_item);
                        if (textView2 != null) {
                            i6 = R.id.tv_name_upcoming_release_item;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_name_upcoming_release_item);
                            if (textView3 != null) {
                                return new m5.o0(new g4.v((RelativeLayout) viewInflate, imageView, relativeLayout, textView, textView2, textView3, 6), context, this.f4510b);
                            }
                        }
                    }
                }
            }
        }
        com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i6)));
        return null;
    }
}
