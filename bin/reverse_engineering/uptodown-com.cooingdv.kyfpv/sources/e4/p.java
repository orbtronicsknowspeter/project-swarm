package e4;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import m5.p1;
import x4.q2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class p extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w4.b f4652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.n f4653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w4.k f4654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f4655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4656e;

    public p(w4.b bVar, w4.n nVar, w4.k kVar) {
        bVar.getClass();
        kVar.getClass();
        this.f4652a = bVar;
        this.f4653b = nVar;
        this.f4654c = kVar;
        this.f4655d = new ArrayList();
        this.f4656e = -1;
    }

    public final void a(Context context, File file) {
        x4.e eVar;
        String str;
        file.getClass();
        j5.g gVarL = j5.g.D.l(context);
        gVarL.b();
        Iterator it = this.f4655d.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            int i6 = i + 1;
            Object next = it.next();
            if ((next instanceof x4.e) && (str = (eVar = (x4.e) next).f11124l) != null && str.length() != 0) {
                String str2 = eVar.f11124l;
                str2.getClass();
                q2 q2VarY = gVarL.Y(str2);
                x4.r rVarA = q2VarY != null ? q2VarY.a(context) : null;
                if (rVarA != null && rVarA.F.size() == 1 && l7.u.m0(((x4.j0) rVarA.F.get(0)).f11241q, file.getAbsolutePath(), true)) {
                    break;
                }
            }
            i = i6;
        }
        gVarL.c();
        if (i >= 0) {
            notifyItemChanged(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f4655d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        Object obj = this.f4655d.get(i);
        obj.getClass();
        if (obj instanceof v0) {
            return 1;
        }
        if (obj instanceof x4.e) {
            return 0;
        }
        if (!(obj instanceof String)) {
            s1.o.n();
            return 0;
        }
        String str = (String) obj;
        int iHashCode = str.hashCode();
        if (iHashCode != 1477891299) {
            if (iHashCode != 1692569964) {
                if (iHashCode == 2032679000 && str.equals("title_system_app")) {
                    return 2;
                }
            } else if (str.equals("title_system_service")) {
                return 3;
            }
        } else if (str.equals("title_disable_app")) {
            return 4;
        }
        s1.o.n();
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        viewHolder.getClass();
        if (viewHolder instanceof m5.d) {
            Object obj = this.f4655d.get(i);
            obj.getClass();
            ((m5.d) viewHolder).a((x4.e) obj);
            return;
        }
        if (viewHolder instanceof p1) {
            p1 p1Var = (p1) viewHolder;
            Object obj2 = this.f4655d.get(i);
            obj2.getClass();
            p1Var.a((v0) obj2, this.f4656e == i, false);
            return;
        }
        if (!(viewHolder instanceof m5.f0)) {
            com.google.gson.internal.a.p("ViewHolder unknown!!");
            return;
        }
        m5.f0 f0Var = (m5.f0) viewHolder;
        ImageView imageView = f0Var.f7379l;
        f0Var.f7378b.setVisibility(0);
        if (f0Var.f7377a == null) {
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        } else {
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            if (imageView != null) {
                imageView.setOnClickListener(new m5.e0(f0Var, 1));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        if (i == 0) {
            return new m5.d(androidx.lifecycle.l.E(viewGroup, R.layout.installed_app_item, viewGroup, false), this.f4652a);
        }
        if (i == 1) {
            return new p1(androidx.lifecycle.l.E(viewGroup, R.layout.update_item, viewGroup, false), this.f4653b);
        }
        if (i == 2) {
            View viewE = androidx.lifecycle.l.E(viewGroup, R.layout.tv_myappsupdates_title, viewGroup, false);
            String string = viewE.getContext().getString(R.string.system_apps_title);
            string.getClass();
            return new m5.f0(viewE, string, null);
        }
        if (i == 3) {
            View viewE2 = androidx.lifecycle.l.E(viewGroup, R.layout.tv_myappsupdates_title, viewGroup, false);
            String string2 = viewE2.getContext().getString(R.string.menu_item_title_system_services);
            string2.getClass();
            return new m5.f0(viewE2, string2, null);
        }
        if (i != 4) {
            com.google.gson.internal.a.p("viewType unknown");
            return null;
        }
        View viewE3 = androidx.lifecycle.l.E(viewGroup, R.layout.tv_myappsupdates_title, viewGroup, false);
        String string3 = viewE3.getContext().getString(R.string.disabled_apps);
        string3.getClass();
        return new m5.f0(viewE3, string3, this.f4654c);
    }
}
