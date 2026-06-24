package e4;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.MainActivity;
import java.util.ArrayList;
import x4.x1;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0.i f4501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f4503d;

    public c0(MainActivity mainActivity, f0.i iVar) {
        mainActivity.getClass();
        iVar.getClass();
        this.f4500a = mainActivity;
        this.f4501b = iVar;
        this.f4503d = new ArrayList();
    }

    public final void a(int i) {
        if (i > -1) {
            ArrayList arrayList = this.f4503d;
            if (i < arrayList.size()) {
                arrayList.remove(i);
                this.f4502c--;
                notifyDataSetChanged();
                c4.k0 k0Var = (c4.k0) this.f4501b.f4812b;
                if (k0Var.J.isEmpty()) {
                    return;
                }
                Object objRemove = k0Var.J.remove(0);
                objRemove.getClass();
                LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(k0Var);
                v7.e eVar = o7.m0.f8289a;
                o7.c0.s(lifecycleScope, t7.n.f10349a, null, new b.n(k0Var, (x1) objRemove, (t6.c) null, 11), 2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f4503d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        viewHolder.getClass();
        int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
        Object obj = this.f4503d.get(absoluteAdapterPosition);
        obj.getClass();
        x1 x1Var = (x1) obj;
        if (viewHolder instanceof m5.p) {
            m5.p pVar = (m5.p) viewHolder;
            pVar.f7500a.setText(x1Var.f11450b);
            a4.l0 l0VarE = a4.g0.d().e(x1Var.f11451c);
            float f = UptodownApp.I;
            Context context = this.f4500a;
            l0VarE.g(b4.d.f(context));
            l0VarE.h(b4.d.x(context));
            l0VarE.e(pVar.f7502l, null);
            pVar.f7501b.setText(context.getString(R.string.preregister_available_to_download));
            pVar.f7503m.setText(context.getString(R.string.updates_button_download_app));
        }
        if (absoluteAdapterPosition > this.f4502c) {
            Context context2 = viewHolder.itemView.getContext();
            context2.getClass();
            View view = viewHolder.itemView;
            view.getClass();
            float f10 = UptodownApp.I;
            boolean z9 = true;
            try {
                SharedPreferences sharedPreferences = context2.getSharedPreferences("SettingsPreferences", 0);
                if (sharedPreferences.contains("animations")) {
                    z9 = sharedPreferences.getBoolean("animations", true);
                }
            } catch (Exception unused) {
            }
            if (z9) {
                float f11 = UptodownApp.I;
                view.startAnimation(AnimationUtils.loadAnimation(context2, R.anim.slide_in_bottom));
                view.setVisibility(0);
            } else {
                view.setVisibility(0);
            }
            this.f4502c = absoluteAdapterPosition;
        }
        viewHolder.itemView.setOnClickListener(new c.e(26, this, x1Var));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(this.f4500a).inflate(R.layout.floating_notification, viewGroup, false);
        viewInflate.getClass();
        return new m5.p(viewInflate);
    }
}
