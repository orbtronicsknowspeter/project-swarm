package e4;

import android.content.Context;
import android.text.SpannableStringBuilder;
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
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import u4.o1;
import u4.p1;
import x4.o2;
import x4.p2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class q0 extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w4.c f4661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.d f4662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w4.a f4663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p1 f4664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f4665e;
    public final o2 f;
    public final ArrayList g;
    public final String h;
    public final boolean i;
    public final w4.e j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p1 f4666k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f4667l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4668m;

    public q0(w4.c cVar, w4.d dVar, w4.a aVar, p1 p1Var, String str, o2 o2Var, ArrayList arrayList, String str2, boolean z9, o1 o1Var, p1 p1Var2) {
        cVar.getClass();
        dVar.getClass();
        aVar.getClass();
        this.f4661a = cVar;
        this.f4662b = dVar;
        this.f4663c = aVar;
        this.f4664d = p1Var;
        this.f4665e = str;
        this.f = o2Var;
        this.g = arrayList;
        this.h = str2;
        this.i = z9;
        this.j = o1Var;
        this.f4666k = p1Var2;
        this.f4667l = new ArrayList();
    }

    public final void a(p2 p2Var) {
        this.f4667l = new ArrayList();
        x4.j jVar = p2Var.f11330a;
        int i = jVar.f11225a;
        if (i == -3 || i == -2) {
            Iterator it = p2Var.f11331b.iterator();
            it.getClass();
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                o0 o0Var = new o0();
                o0Var.f4649a = (x4.g) next;
                o0Var.f4650b = 0;
                o0Var.f4651c = 0;
                this.f4667l.add(o0Var);
            }
        } else {
            String str = jVar.f11227l;
            if (str != null && str.length() != 0) {
                o0 o0Var2 = new o0();
                o0Var2.f4650b = 5;
                this.f4667l.add(o0Var2);
                o0 o0Var3 = new o0();
                o0Var3.f4650b = 2;
                this.f4667l.add(o0Var3);
            }
            int i6 = 0;
            int i10 = 0;
            for (x4.g gVar : p2Var.f11331b) {
                int i11 = i6 + 1;
                o0 o0Var4 = new o0();
                o0Var4.f4649a = gVar;
                if (gVar.m()) {
                    o0Var4.f4650b = 3;
                    o0Var4.f4651c = 0;
                } else {
                    i10++;
                    o0Var4.f4651c = i10;
                    if (i6 >= 10) {
                        o0Var4.f4650b = 0;
                    } else if (p2Var.f11330a.f11225a == 1090) {
                        o0Var4.f4650b = 4;
                    } else {
                        o0Var4.f4650b = 1;
                    }
                }
                this.f4668m = i10;
                this.f4667l.add(o0Var4);
                i6 = i11;
            }
        }
        String str2 = p2Var.f11330a.f11227l;
        int i12 = (str2 == null || str2.length() == 0) ? 20 : 22;
        ArrayList arrayList = this.g;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        o0 o0Var5 = new o0();
        o0Var5.f4649a = arrayList;
        o0Var5.f4650b = 6;
        o0Var5.f4651c = 0;
        int size = this.f4667l.size();
        ArrayList arrayList2 = this.f4667l;
        if (size > i12) {
            arrayList2.add(i12, o0Var5);
        } else {
            arrayList2.add(o0Var5);
        }
    }

    public final void b(x4.g gVar) {
        gVar.getClass();
        Iterator it = this.f4667l.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i6 = i + 1;
            Object obj = ((o0) it.next()).f4649a;
            if (obj instanceof x4.g) {
                obj.getClass();
                if (((x4.g) obj).f11159a == gVar.f11159a) {
                    notifyItemChanged(i);
                    return;
                }
            }
            i = i6;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f4667l.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((o0) this.f4667l.get(i)).f4650b;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ee  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r26, final int r27) {
        /*
            Method dump skipped, instruction units count: 1251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.q0.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        char c9;
        o2 o2Var;
        String str;
        viewGroup.getClass();
        w4.a aVar = this.f4663c;
        w4.c cVar = this.f4661a;
        switch (i) {
            case 0:
                return new m5.g1(androidx.lifecycle.l.E(viewGroup, R.layout.app_info_top_by_cat_item_small, viewGroup, false), cVar, aVar, this.i);
            case 1:
                return new m5.f1(androidx.lifecycle.l.E(viewGroup, R.layout.app_info_top_by_cat_item, viewGroup, false), this.f4661a, this.f4662b, this.f4663c, this.i, this.f4666k);
            case 2:
                View viewB = c.j.b(viewGroup, R.layout.top_by_category_description_view, null, false);
                int i6 = R.id.iv_top_by_category_linkedin;
                if (((ImageView) ViewBindings.findChildViewById(viewB, R.id.iv_top_by_category_linkedin)) != null) {
                    i6 = R.id.iv_top_by_category_twitter;
                    if (((ImageView) ViewBindings.findChildViewById(viewB, R.id.iv_top_by_category_twitter)) != null) {
                        i6 = R.id.iv_top_category_autor_avatar;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewB, R.id.iv_top_category_autor_avatar);
                        if (imageView != null) {
                            i6 = R.id.ll_top_by_category_autor_socials;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewB, R.id.ll_top_by_category_autor_socials);
                            if (linearLayout != null) {
                                i6 = R.id.rl_autor_top_by_cat;
                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(viewB, R.id.rl_autor_top_by_cat);
                                if (relativeLayout != null) {
                                    i6 = R.id.tv_top_by_category_apps_counter;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(viewB, R.id.tv_top_by_category_apps_counter);
                                    if (textView != null) {
                                        i6 = R.id.tv_top_by_category_autor;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewB, R.id.tv_top_by_category_autor);
                                        if (textView2 != null) {
                                            i6 = R.id.tv_top_by_category_created_by;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(viewB, R.id.tv_top_by_category_created_by);
                                            if (textView3 != null) {
                                                i6 = R.id.tv_top_by_category_description;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(viewB, R.id.tv_top_by_category_description);
                                                if (textView4 != null) {
                                                    i6 = R.id.tv_top_by_category_last_update;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(viewB, R.id.tv_top_by_category_last_update);
                                                    if (textView5 != null) {
                                                        RelativeLayout relativeLayout2 = (RelativeLayout) viewB;
                                                        m5.h1 h1Var = new m5.h1(relativeLayout2);
                                                        o2 o2Var2 = this.f;
                                                        if (o2Var2 != null) {
                                                            textView3.setTypeface(f4.c.f4884x);
                                                            textView2.setTypeface(f4.c.f4883w);
                                                            textView2.setText(o2Var2.f11311d);
                                                            textView5.setTypeface(f4.c.f4884x);
                                                            Context context = h1Var.itemView.getContext();
                                                            long j = o2Var2.f11308a;
                                                            if (j <= 0) {
                                                                c9 = 0;
                                                                o2Var = o2Var2;
                                                                str = null;
                                                            } else {
                                                                c9 = 0;
                                                                o2Var = o2Var2;
                                                                str = new SimpleDateFormat("dd MMM yyyy", Locale.getDefault()).format(new Date(j * ((long) 1000)));
                                                            }
                                                            Object[] objArr = new Object[1];
                                                            objArr[c9] = str;
                                                            textView5.setText(context.getString(R.string.brakets_placeholder, objArr));
                                                            o2 o2Var3 = o2Var;
                                                            a4.l0 l0VarE = a4.g0.d().e(o2Var3.f11312e);
                                                            float f = UptodownApp.I;
                                                            Context context2 = h1Var.itemView.getContext();
                                                            context2.getClass();
                                                            l0VarE.h(b4.d.x(context2));
                                                            l0VarE.e(imageView, null);
                                                            textView.setTypeface(f4.c.f4883w);
                                                            Context context3 = relativeLayout2.getContext();
                                                            Object[] objArr2 = new Object[1];
                                                            objArr2[c9] = String.valueOf(o2Var3.f11309b);
                                                            textView.setText(context3.getString(R.string.apps_count, objArr2));
                                                        } else {
                                                            c9 = 0;
                                                            relativeLayout.setVisibility(8);
                                                            linearLayout.setVisibility(8);
                                                            textView.setVisibility(8);
                                                        }
                                                        String str2 = this.f4665e;
                                                        if (str2 == null || str2.length() == 0) {
                                                            h1Var.itemView.setVisibility(8);
                                                            return h1Var;
                                                        }
                                                        textView4.setTypeface(f4.c.f4884x);
                                                        p1 p1Var = this.f4664d;
                                                        if (p1Var == null) {
                                                            textView4.setText(str2);
                                                            return h1Var;
                                                        }
                                                        textView4.setOnTouchListener(new l5.e());
                                                        Context context4 = h1Var.itemView.getContext();
                                                        context4.getClass();
                                                        boolean z9 = c9;
                                                        String strO0 = l7.u.o0(l7.u.o0(str2, "<br />", "\n", z9), "<br/>", "\n", z9);
                                                        List<x4.o> listW = a.a.w(strO0);
                                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strO0);
                                                        int length = 0;
                                                        for (x4.o oVar : listW) {
                                                            int i10 = oVar.f11301a;
                                                            String str3 = oVar.f11305e;
                                                            String str4 = oVar.f11304d;
                                                            int i11 = i10 - length;
                                                            int length2 = str4.length() + i11;
                                                            str3.getClass();
                                                            spannableStringBuilder = spannableStringBuilder.replace(i11, str3.length() + i11, (CharSequence) str4);
                                                            spannableStringBuilder.getClass();
                                                            String str5 = oVar.f11302b;
                                                            switch (str5.hashCode()) {
                                                                case 116079:
                                                                    if (str5.equals("url")) {
                                                                        spannableStringBuilder.setSpan(new x4.m(oVar, p1Var, context4, 3), i11, length2, 33);
                                                                    }
                                                                    break;
                                                                case 93028092:
                                                                    if (str5.equals("appID")) {
                                                                        spannableStringBuilder.setSpan(new x4.m(oVar, p1Var, context4, 0), i11, length2, 33);
                                                                    }
                                                                    break;
                                                                case 1296531097:
                                                                    if (str5.equals("categoryID")) {
                                                                        spannableStringBuilder.setSpan(new x4.m(oVar, p1Var, context4, 2), i11, length2, 33);
                                                                    }
                                                                    break;
                                                                case 1524339519:
                                                                    if (str5.equals("floatingCategoryID")) {
                                                                        spannableStringBuilder.setSpan(new x4.m(oVar, p1Var, context4, 1), i11, length2, 33);
                                                                    }
                                                                    break;
                                                            }
                                                            length = (str3.length() + length) - str4.length();
                                                        }
                                                        textView4.setText(spannableStringBuilder);
                                                        return h1Var;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewB.getResources().getResourceName(i6)));
                return null;
            case 3:
                return new m5.f1(androidx.lifecycle.l.E(viewGroup, R.layout.app_info_promoted_top_by_cat_item, viewGroup, false), this.f4661a, this.f4662b, this.f4663c, this.i, this.f4666k);
            case 4:
                return new m5.d1(androidx.lifecycle.l.E(viewGroup, R.layout.app_info_top_by_cat_item, viewGroup, false), cVar, this.f4662b, aVar);
            case 5:
                View viewB2 = c.j.b(viewGroup, R.layout.top_by_category_title_view, null, false);
                if (viewB2 == null) {
                    com.google.gson.internal.a.i("rootView");
                    return null;
                }
                TextView textView6 = (TextView) viewB2;
                m5.i1 i1Var = new m5.i1(textView6);
                textView6.setTypeface(f4.c.f4883w);
                textView6.setText(this.h);
                return i1Var;
            case 6:
                return new m5.o(androidx.lifecycle.l.E(viewGroup, R.layout.floating_categories, viewGroup, false), new p0(this));
            default:
                com.google.gson.internal.a.p("viewType unknown");
                return null;
        }
    }
}
