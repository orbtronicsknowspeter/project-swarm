package e4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import java.util.ArrayList;
import java.util.Iterator;
import m5.b2;
import x4.p2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w4.j f4541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.a f4542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w4.l f4543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f4545e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4546k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f4547l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4548m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4549n;

    public h(w4.j jVar, w4.a aVar, w4.l lVar, String str) {
        jVar.getClass();
        aVar.getClass();
        lVar.getClass();
        this.f4541a = jVar;
        this.f4542b = aVar;
        this.f4543c = lVar;
        this.f4544d = str;
        this.f4545e = new ArrayList();
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.f4546k = -1;
        this.f4547l = -1;
        this.f4548m = -1;
        this.f4549n = -1;
    }

    public final void a(ArrayList arrayList, int i) {
        Iterator it = arrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            p2 p2Var = (p2) next;
            if (p2Var.f11330a.f11225a == i) {
                b(p2Var);
                arrayList.remove(p2Var);
                return;
            }
        }
    }

    public final void b(p2 p2Var) {
        if (p2Var != null) {
            g gVar = new g();
            gVar.f4533a = p2Var;
            gVar.f4534b = p2Var.f11332c;
            this.f4545e.add(gVar);
            notifyItemInserted(this.f4545e.size() - 1);
        }
    }

    public final void c(p2 p2Var, int i) {
        if (i < 0 || i >= this.f4545e.size()) {
            return;
        }
        g gVar = new g();
        gVar.f4533a = p2Var;
        gVar.f4534b = p2Var.f11332c;
        this.f4545e.set(i, gVar);
        notifyItemChanged(i);
    }

    public final void d(String str, RecyclerView recyclerView) {
        str.getClass();
        recyclerView.getClass();
        int size = this.f4545e.size();
        for (int i = 0; i < size; i++) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
            Object obj = null;
            if (viewHolderFindViewHolderForAdapterPosition instanceof m5.x) {
                u0 u0Var = ((m5.x) viewHolderFindViewHolderForAdapterPosition).f7633m;
                ArrayList arrayList = u0Var.f4705c;
                int size2 = arrayList.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size2) {
                        break;
                    }
                    Object obj2 = arrayList.get(i6);
                    i6++;
                    if (kotlin.jvm.internal.l.a(((x4.g) obj2).F, str)) {
                        obj = obj2;
                        break;
                    }
                }
                u0Var.notifyItemChanged(q6.l.u0(u0Var.f4705c, (x4.g) obj));
            } else if (viewHolderFindViewHolderForAdapterPosition instanceof m5.w) {
                s0 s0Var = ((m5.w) viewHolderFindViewHolderForAdapterPosition).f7625m;
                ArrayList arrayList2 = s0Var.f4688c;
                int size3 = arrayList2.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size3) {
                        break;
                    }
                    Object obj3 = arrayList2.get(i10);
                    i10++;
                    if (kotlin.jvm.internal.l.a(((x4.g) obj3).F, str)) {
                        obj = obj3;
                        break;
                    }
                }
                s0Var.notifyItemChanged(q6.l.u0(s0Var.f4688c, (x4.g) obj));
            } else if (viewHolderFindViewHolderForAdapterPosition instanceof m5.d0) {
                if (kotlin.jvm.internal.l.a(((m5.d0) viewHolderFindViewHolderForAdapterPosition).f7355u, str)) {
                    notifyItemChanged(this.h);
                }
            } else if (viewHolderFindViewHolderForAdapterPosition instanceof b2) {
                m1 m1Var = ((b2) viewHolderFindViewHolderForAdapterPosition).f7323n;
                ArrayList arrayList3 = m1Var.f4633e;
                int size4 = arrayList3.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size4) {
                        break;
                    }
                    Object obj4 = arrayList3.get(i11);
                    i11++;
                    if (kotlin.jvm.internal.l.a(((x4.g) obj4).F, str)) {
                        obj = obj4;
                        break;
                    }
                }
                m1Var.notifyItemChanged(q6.l.u0(m1Var.f4633e, (x4.g) obj));
            } else if (viewHolderFindViewHolderForAdapterPosition instanceof m5.j1) {
                m mVar = ((m5.j1) viewHolderFindViewHolderForAdapterPosition).f7439m;
                ArrayList arrayList4 = mVar.f4624c;
                int size5 = arrayList4.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size5) {
                        break;
                    }
                    Object obj5 = arrayList4.get(i12);
                    i12++;
                    if (kotlin.jvm.internal.l.a(((x4.g) obj5).F, str)) {
                        obj = obj5;
                        break;
                    }
                }
                mVar.notifyItemChanged(q6.l.u0(mVar.f4624c, (x4.g) obj));
            } else if (viewHolderFindViewHolderForAdapterPosition instanceof m5.z) {
                n nVar = ((m5.z) viewHolderFindViewHolderForAdapterPosition).f7650n;
                ArrayList arrayList5 = nVar.f4641c;
                int size6 = arrayList5.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size6) {
                        break;
                    }
                    Object obj6 = arrayList5.get(i13);
                    i13++;
                    if (kotlin.jvm.internal.l.a(((x4.g) obj6).F, str)) {
                        obj = obj6;
                        break;
                    }
                }
                nVar.notifyItemChanged(q6.l.u0(nVar.f4641c, (x4.g) obj));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f4545e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        g gVar = (g) this.f4545e.get(i);
        if (gVar != null) {
            return gVar.f4534b;
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Object objA;
        viewHolder.getClass();
        if (viewHolder instanceof m5.j) {
            return;
        }
        int i6 = 7;
        if (viewHolder instanceof m5.v) {
            m5.v vVar = (m5.v) viewHolder;
            g gVar = (g) this.f4545e.get(i);
            Object objA2 = gVar != null ? gVar.a() : null;
            objA2.getClass();
            f fVar = (f) objA2;
            ViewGroup viewGroup = vVar.f7611n;
            RecyclerView recyclerView = vVar.f7609l;
            TextView textView = vVar.f7608b;
            String str = fVar.f4527c;
            if (str == null) {
                kotlin.jvm.internal.l.i("title");
                throw null;
            }
            textView.setText(str);
            ArrayList arrayList = fVar.f4525a;
            if (arrayList == null) {
                kotlin.jvm.internal.l.i("homeFeatures");
                throw null;
            }
            if (!arrayList.isEmpty()) {
                recyclerView.scrollToPosition(vVar.f7614q);
                recyclerView.smoothScrollBy(1, 0);
                j jVar = vVar.f7610m;
                ArrayList arrayList2 = fVar.f4525a;
                if (arrayList2 == null) {
                    kotlin.jvm.internal.l.i("homeFeatures");
                    throw null;
                }
                jVar.getClass();
                ArrayList arrayList3 = jVar.f4570c;
                arrayList3.clear();
                arrayList3.addAll(arrayList2);
                jVar.notifyDataSetChanged();
            }
            if (viewGroup.getChildCount() == 0) {
                ArrayList arrayList4 = fVar.f4526b;
                if (arrayList4 == null) {
                    kotlin.jvm.internal.l.i("categories");
                    throw null;
                }
                Iterator it = arrayList4.iterator();
                it.getClass();
                while (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    x4.j jVar2 = (x4.j) next;
                    View viewInflate = LayoutInflater.from(vVar.itemView.getContext()).inflate(R.layout.chip_category, viewGroup, false);
                    viewInflate.getClass();
                    TextView textView2 = (TextView) viewInflate;
                    textView2.setTypeface(f4.c.f4883w);
                    textView2.setText(jVar2.f11226b);
                    if (jVar2.equals(q6.l.y0(arrayList4))) {
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams.setMargins((int) vVar.itemView.getContext().getResources().getDimension(R.dimen.margin_m), 0, (int) vVar.itemView.getContext().getResources().getDimension(R.dimen.margin_m), 0);
                        textView2.setLayoutParams(layoutParams);
                    }
                    textView2.setOnClickListener(new g4.b0(i6, vVar, jVar2));
                    viewGroup.addView(textView2);
                }
                return;
            }
            return;
        }
        int i10 = 8;
        if (viewHolder instanceof m5.x) {
            g gVar2 = (g) this.f4545e.get(i);
            if ((gVar2 != null ? gVar2.a() : null) instanceof p2) {
                m5.x xVar = (m5.x) viewHolder;
                g gVar3 = (g) this.f4545e.get(i);
                objA = gVar3 != null ? gVar3.a() : null;
                objA.getClass();
                p2 p2Var = (p2) objA;
                if (p2Var.f11331b.isEmpty()) {
                    xVar.itemView.setVisibility(8);
                    return;
                }
                xVar.f7631b.setOnClickListener(new g4.b0(9, xVar, p2Var));
                xVar.f7632l.setText(p2Var.f11330a.f11226b);
                xVar.f7633m.a(p2Var.f11331b);
                return;
            }
            return;
        }
        if (viewHolder instanceof m5.w) {
            g gVar4 = (g) this.f4545e.get(i);
            if ((gVar4 != null ? gVar4.a() : null) instanceof p2) {
                m5.w wVar = (m5.w) viewHolder;
                g gVar5 = (g) this.f4545e.get(i);
                objA = gVar5 != null ? gVar5.a() : null;
                objA.getClass();
                p2 p2Var2 = (p2) objA;
                wVar.f7623b.setOnClickListener(new g4.b0(i10, wVar, p2Var2));
                wVar.f7624l.setText(p2Var2.f11330a.f11226b);
                s0 s0Var = wVar.f7625m;
                ArrayList arrayList5 = p2Var2.f11331b;
                s0Var.getClass();
                arrayList5.getClass();
                ArrayList arrayList6 = s0Var.f4688c;
                arrayList6.clear();
                arrayList6.addAll(arrayList5);
                s0Var.notifyDataSetChanged();
                return;
            }
            return;
        }
        if (viewHolder instanceof m5.d0) {
            m5.d0 d0Var = (m5.d0) viewHolder;
            g gVar6 = (g) this.f4545e.get(i);
            Object objA3 = gVar6 != null ? gVar6.a() : null;
            objA3.getClass();
            x4.g gVar7 = (x4.g) objA3;
            d0Var.f7355u = gVar7.F;
            View view = d0Var.itemView;
            view.getClass();
            view.setOnClickListener(new g4.b0(12, d0Var, gVar7));
            d0Var.itemView.setOnLongClickListener(new d4.d(i6, d0Var, gVar7));
            a4.l0 l0VarE = a4.g0.d().e(gVar7.e());
            l0VarE.f(R.color.main_blue);
            float f = UptodownApp.I;
            Context context = d0Var.itemView.getContext();
            context.getClass();
            l0VarE.h(b4.d.w(context));
            l0VarE.e(d0Var.f7349o, null);
            m5.e.f(gVar7, d0Var.f7350p, d0Var.f7351q);
            d0Var.e(d0Var.f7348n, gVar7.i());
            d0Var.c(gVar7, d0Var.f7347m, d0Var.f7348n, d0Var.f7351q, d0Var.f7353s, d0Var.f7352r, d0Var.f7354t);
            return;
        }
        if (viewHolder instanceof b2) {
            b2 b2Var = (b2) viewHolder;
            g gVar8 = (g) this.f4545e.get(i);
            objA = gVar8 != null ? gVar8.a() : null;
            objA.getClass();
            p2 p2Var3 = (p2) objA;
            b2Var.f7320b.setOnClickListener(new g4.b0(20, b2Var, p2Var3));
            b2Var.f7321l.setText(p2Var3.f11330a.f11226b);
            m1 m1Var = b2Var.f7323n;
            ArrayList arrayList7 = p2Var3.f11331b;
            m1Var.getClass();
            arrayList7.getClass();
            ArrayList arrayList8 = m1Var.f4633e;
            arrayList8.clear();
            arrayList8.addAll(arrayList7);
            return;
        }
        if (viewHolder instanceof m5.j1) {
            m5.j1 j1Var = (m5.j1) viewHolder;
            g gVar9 = (g) this.f4545e.get(i);
            objA = gVar9 != null ? gVar9.a() : null;
            objA.getClass();
            p2 p2Var4 = (p2) objA;
            j1Var.f7437b.setOnClickListener(new g4.b0(17, j1Var, p2Var4));
            j1Var.f7438l.setText(p2Var4.f11330a.f11226b);
            boolean zA = kotlin.jvm.internal.l.a(p2Var4.f11330a.f11226b, j1Var.itemView.getContext().getResources().getString(R.string.top_downloads_title));
            m mVar = j1Var.f7439m;
            ArrayList arrayList9 = p2Var4.f11331b;
            if (zA) {
                mVar.getClass();
                arrayList9.getClass();
                mVar.f4625d = true;
                mVar.f4624c = arrayList9;
                mVar.notifyDataSetChanged();
                return;
            }
            mVar.getClass();
            arrayList9.getClass();
            mVar.f4625d = false;
            mVar.f4624c = arrayList9;
            mVar.notifyDataSetChanged();
            return;
        }
        if (!(viewHolder instanceof m5.z)) {
            if (!(viewHolder instanceof m5.o)) {
                com.google.gson.internal.a.p("ViewHolder unknown!!");
                return;
            }
            m5.o oVar = (m5.o) viewHolder;
            g gVar10 = (g) this.f4545e.get(i);
            objA = gVar10 != null ? gVar10.a() : null;
            objA.getClass();
            oVar.a((ArrayList) objA);
            return;
        }
        m5.z zVar = (m5.z) viewHolder;
        g gVar11 = (g) this.f4545e.get(i);
        objA = gVar11 != null ? gVar11.a() : null;
        objA.getClass();
        p2 p2Var5 = (p2) objA;
        zVar.f7647b.setOnClickListener(new g4.b0(10, zVar, p2Var5));
        zVar.f7648l.setText(p2Var5.f11330a.f11226b);
        n nVar = zVar.f7650n;
        ArrayList arrayList10 = p2Var5.f11331b;
        nVar.getClass();
        arrayList10.getClass();
        ArrayList arrayList11 = nVar.f4641c;
        arrayList11.clear();
        arrayList11.addAll(arrayList10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        w4.a aVar = this.f4542b;
        w4.j jVar = this.f4541a;
        switch (i) {
            case -1:
                return new m5.j(androidx.lifecycle.l.E(viewGroup, R.layout.empty_view, viewGroup, false));
            case 0:
                return new m5.v(androidx.lifecycle.l.E(viewGroup, R.layout.home_fragment_header, viewGroup, false), jVar, aVar, this.f4543c);
            case 1:
                return new m5.x(androidx.lifecycle.l.E(viewGroup, R.layout.home_recycler_view_top, viewGroup, false), jVar, aVar);
            case 2:
            default:
                com.google.gson.internal.a.p("viewType unknown");
                return null;
            case 3:
                return new m5.d0(androidx.lifecycle.l.E(viewGroup, R.layout.home_gallery_featured, viewGroup, false), jVar, aVar);
            case 4:
                return new b2(androidx.lifecycle.l.E(viewGroup, R.layout.home_recycler_view_top, viewGroup, false), jVar, aVar, this.f4544d);
            case 5:
                return new m5.j1(androidx.lifecycle.l.E(viewGroup, R.layout.home_recycler_view_top, viewGroup, false), jVar, aVar);
            case 6:
                View viewE = androidx.lifecycle.l.E(viewGroup, R.layout.home_recycler_view_top, viewGroup, false);
                jVar.getClass();
                aVar.getClass();
                m5.z zVar = new m5.z(viewE);
                zVar.f7646a = jVar;
                View viewFindViewById = viewE.findViewById(R.id.rl_title_home_recycler_view_top);
                viewFindViewById.getClass();
                zVar.f7647b = (RelativeLayout) viewFindViewById;
                View viewFindViewById2 = viewE.findViewById(R.id.tv_title_home_recycler_view_top);
                viewFindViewById2.getClass();
                TextView textView = (TextView) viewFindViewById2;
                zVar.f7648l = textView;
                View viewFindViewById3 = viewE.findViewById(R.id.rv_home_recycler_view_top);
                viewFindViewById3.getClass();
                RecyclerView recyclerView = (RecyclerView) viewFindViewById3;
                GridLayoutManager gridLayoutManager = new GridLayoutManager(viewE.getContext(), 3, 0, false);
                zVar.f7649m = gridLayoutManager;
                n nVar = new n();
                nVar.f4639a = jVar;
                nVar.f4640b = aVar;
                nVar.f4641c = new ArrayList();
                zVar.f7650n = nVar;
                textView.setTypeface(f4.c.f4883w);
                recyclerView.setLayoutManager(gridLayoutManager);
                recyclerView.setAdapter(nVar);
                recyclerView.setItemAnimator(null);
                recyclerView.addItemDecoration(new m5.y(zVar));
                return zVar;
            case 7:
                return new m5.o(androidx.lifecycle.l.E(viewGroup, R.layout.floating_categories, viewGroup, false), jVar);
            case 8:
                return new m5.w(androidx.lifecycle.l.E(viewGroup, R.layout.home_recycler_view_top, viewGroup, false), jVar, aVar);
        }
    }
}
