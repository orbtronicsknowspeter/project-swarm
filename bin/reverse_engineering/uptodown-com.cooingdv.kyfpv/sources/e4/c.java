package e4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
import x4.u2;
import x4.w2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f4497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.h f4498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4499c;

    public c(ArrayList arrayList, w4.h hVar) {
        arrayList.getClass();
        hVar.getClass();
        this.f4497a = arrayList;
        this.f4498b = hVar;
    }

    public final void a(boolean z9) {
        this.f4499c = z9;
        if (z9) {
            notifyItemInserted(getItemCount());
        } else {
            notifyItemRemoved(getItemCount());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f4497a.size() + (this.f4499c ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        ArrayList arrayList = this.f4497a;
        if (i == arrayList.size()) {
            return 2;
        }
        Object obj = arrayList.get(i);
        obj.getClass();
        return kotlin.jvm.internal.l.a(((x4.d1) obj).f11093b, "subscription") ? 1 : 0;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        viewHolder.getClass();
        boolean z9 = viewHolder instanceof m5.l;
        ArrayList arrayList = this.f4497a;
        if (!z9) {
            if (viewHolder instanceof m5.n) {
                final m5.n nVar = (m5.n) viewHolder;
                Object obj = arrayList.get(i);
                obj.getClass();
                final x4.d1 d1Var = (x4.d1) obj;
                a4.g0 g0VarD = a4.g0.d();
                String str = d1Var.f11099q;
                a4.l0 l0VarE = g0VarD.e(str != null ? a4.x.k(str, UptodownApp.R, ":webp") : null);
                float f = UptodownApp.I;
                Context context = nVar.f7483l;
                context.getClass();
                l0VarE.h(b4.d.x(context));
                g2.e eVar = nVar.f7481a;
                ImageView imageView = (ImageView) eVar.f5120l;
                ImageView imageView2 = (ImageView) eVar.f5121m;
                TextView textView = (TextView) eVar.f5125q;
                UsernameTextView usernameTextView = (UsernameTextView) eVar.f5127s;
                l0VarE.e(imageView, null);
                ((ImageView) eVar.f5122n).setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_feed_subscription));
                final int i6 = 0;
                ((RelativeLayout) eVar.f5123o).setOnClickListener(new View.OnClickListener() { // from class: m5.m
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i6) {
                            case 0:
                                nVar.f7482b.j(d1Var.f11094l);
                                break;
                            default:
                                nVar.f7482b.j(d1Var.f11094l);
                                break;
                        }
                    }
                });
                int i10 = d1Var.f11098p;
                ImageView imageView3 = (ImageView) eVar.f5120l;
                if (i10 == 1) {
                    int dimension = (int) imageView3.getContext().getResources().getDimension(R.dimen.border_radius_xs);
                    imageView3.setForeground(ContextCompat.getDrawable(imageView3.getContext(), R.drawable.shape_stroke_review_avatar_turbo));
                    imageView3.setPadding(dimension, dimension, dimension, dimension);
                    imageView2.setVisibility(0);
                } else {
                    imageView3.setForeground(null);
                    imageView3.setPadding(0, 0, 0, 0);
                    imageView2.setVisibility(8);
                }
                usernameTextView.setText(d1Var.f11095m);
                int i11 = UsernameTextView.f3453s;
                final int i12 = 1;
                i5.g(usernameTextView, d1Var.f11098p == 1, d1Var.f11101s);
                usernameTextView.setOnClickListener(new View.OnClickListener() { // from class: m5.m
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i12) {
                            case 0:
                                nVar.f7482b.j(d1Var.f11094l);
                                break;
                            default:
                                nVar.f7482b.j(d1Var.f11094l);
                                break;
                        }
                    }
                });
                ((TextView) eVar.f5124p).setText(d1Var.f11097o);
                ((TextView) eVar.f5126r).setText(d1Var.f11100r);
                w2 w2VarH = u2.h(context);
                if (w2VarH == null || !w2VarH.d()) {
                    textView.setVisibility(8);
                    return;
                } else {
                    textView.setOnClickListener(new c4.d(nVar, 27));
                    textView.setVisibility(0);
                    return;
                }
            }
            return;
        }
        final m5.l lVar = (m5.l) viewHolder;
        Object obj2 = arrayList.get(i);
        obj2.getClass();
        final x4.d1 d1Var2 = (x4.d1) obj2;
        Context context2 = lVar.f7454l;
        g2.e eVar2 = lVar.f7452a;
        a4.g0 g0VarD2 = a4.g0.d();
        String str2 = d1Var2.f11099q;
        a4.l0 l0VarE2 = g0VarD2.e(str2 != null ? a4.x.k(str2, UptodownApp.J, ":webp") : null);
        float f10 = UptodownApp.I;
        context2.getClass();
        l0VarE2.g(b4.d.f(context2));
        l0VarE2.h(b4.d.y(context2));
        ImageView imageView4 = (ImageView) eVar2.f5121m;
        ImageView imageView5 = (ImageView) eVar2.f5122n;
        ImageView imageView6 = (ImageView) eVar2.f5124p;
        FrameLayout frameLayout = (FrameLayout) eVar2.f5120l;
        UsernameTextView usernameTextView2 = (UsernameTextView) eVar2.f5127s;
        l0VarE2.e(imageView4, null);
        final int i13 = 4;
        ((ImageView) eVar2.f5121m).setOnClickListener(new View.OnClickListener() { // from class: m5.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        w4.h hVar = lVar.f7453b;
                        x4.d1 d1Var3 = d1Var2;
                        hVar.z(d1Var3.B, d1Var3.D);
                        break;
                    case 1:
                        lVar.f7453b.v(d1Var2);
                        break;
                    case 2:
                        w4.h hVar2 = lVar.f7453b;
                        x4.d1 d1Var4 = d1Var2;
                        hVar2.z(d1Var4.B, d1Var4.D);
                        break;
                    case 3:
                        w4.h hVar3 = lVar.f7453b;
                        x4.d1 d1Var5 = d1Var2;
                        hVar3.t(d1Var5.f11094l, d1Var5.f11095m);
                        break;
                    case 4:
                        lVar.f7453b.j(d1Var2.f11094l);
                        break;
                    case 5:
                        lVar.f7453b.j(d1Var2.f11094l);
                        break;
                    case 6:
                        lVar.f7453b.w(d1Var2.f11094l);
                        break;
                    default:
                        w4.h hVar4 = lVar.f7453b;
                        x4.d1 d1Var6 = d1Var2;
                        hVar4.z(d1Var6.B, d1Var6.D);
                        break;
                }
            }
        });
        int i14 = d1Var2.f11098p;
        ImageView imageView7 = (ImageView) eVar2.f5123o;
        if (i14 == 1) {
            imageView7.setVisibility(0);
        } else {
            imageView7.setVisibility(8);
        }
        usernameTextView2.setText(d1Var2.f11095m);
        int i15 = UsernameTextView.f3453s;
        i5.g(usernameTextView2, d1Var2.f11098p == 1, d1Var2.f11101s);
        final int i16 = 5;
        usernameTextView2.setOnClickListener(new View.OnClickListener() { // from class: m5.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        w4.h hVar = lVar.f7453b;
                        x4.d1 d1Var3 = d1Var2;
                        hVar.z(d1Var3.B, d1Var3.D);
                        break;
                    case 1:
                        lVar.f7453b.v(d1Var2);
                        break;
                    case 2:
                        w4.h hVar2 = lVar.f7453b;
                        x4.d1 d1Var4 = d1Var2;
                        hVar2.z(d1Var4.B, d1Var4.D);
                        break;
                    case 3:
                        w4.h hVar3 = lVar.f7453b;
                        x4.d1 d1Var5 = d1Var2;
                        hVar3.t(d1Var5.f11094l, d1Var5.f11095m);
                        break;
                    case 4:
                        lVar.f7453b.j(d1Var2.f11094l);
                        break;
                    case 5:
                        lVar.f7453b.j(d1Var2.f11094l);
                        break;
                    case 6:
                        lVar.f7453b.w(d1Var2.f11094l);
                        break;
                    default:
                        w4.h hVar4 = lVar.f7453b;
                        x4.d1 d1Var6 = d1Var2;
                        hVar4.z(d1Var6.B, d1Var6.D);
                        break;
                }
            }
        });
        ((TextView) eVar2.f5125q).setText(d1Var2.f11097o);
        ((TextView) eVar2.f5126r).setText(d1Var2.f11100r);
        frameLayout.setVisibility(0);
        imageView5.setVisibility(8);
        frameLayout.removeAllViews();
        String str3 = d1Var2.f11093b;
        if (str3 != null) {
            switch (str3.hashCode()) {
                case -1268958287:
                    if (str3.equals("follow")) {
                        imageView6.setImageDrawable(ContextCompat.getDrawable(context2, R.drawable.vector_feed_follow));
                        frameLayout.setVisibility(8);
                        imageView5.setVisibility(0);
                        final int i17 = 6;
                        imageView5.setOnClickListener(new View.OnClickListener() { // from class: m5.k
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i17) {
                                    case 0:
                                        w4.h hVar = lVar.f7453b;
                                        x4.d1 d1Var3 = d1Var2;
                                        hVar.z(d1Var3.B, d1Var3.D);
                                        break;
                                    case 1:
                                        lVar.f7453b.v(d1Var2);
                                        break;
                                    case 2:
                                        w4.h hVar2 = lVar.f7453b;
                                        x4.d1 d1Var4 = d1Var2;
                                        hVar2.z(d1Var4.B, d1Var4.D);
                                        break;
                                    case 3:
                                        w4.h hVar3 = lVar.f7453b;
                                        x4.d1 d1Var5 = d1Var2;
                                        hVar3.t(d1Var5.f11094l, d1Var5.f11095m);
                                        break;
                                    case 4:
                                        lVar.f7453b.j(d1Var2.f11094l);
                                        break;
                                    case 5:
                                        lVar.f7453b.j(d1Var2.f11094l);
                                        break;
                                    case 6:
                                        lVar.f7453b.w(d1Var2.f11094l);
                                        break;
                                    default:
                                        w4.h hVar4 = lVar.f7453b;
                                        x4.d1 d1Var6 = d1Var2;
                                        hVar4.z(d1Var6.B, d1Var6.D);
                                        break;
                                }
                            }
                        });
                        break;
                    }
                    break;
                case -938102371:
                    if (str3.equals("rating")) {
                        g2.e eVarC = g2.e.c(LayoutInflater.from(context2));
                        TextView textView2 = (TextView) eVarC.f5126r;
                        RelativeLayout relativeLayout = (RelativeLayout) eVarC.f5119b;
                        a4.g0 g0VarD3 = a4.g0.d();
                        String str4 = d1Var2.F;
                        a4.l0 l0VarE3 = g0VarD3.e(str4 != null ? a4.x.k(str4, UptodownApp.K, ":webp") : null);
                        l0VarE3.g(b4.d.f(context2));
                        l0VarE3.h(b4.d.x(context2));
                        l0VarE3.e((ImageView) eVarC.f5120l, null);
                        imageView6.setImageDrawable(ContextCompat.getDrawable(context2, R.drawable.vector_feed_review));
                        final int i18 = 7;
                        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: m5.k
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i18) {
                                    case 0:
                                        w4.h hVar = lVar.f7453b;
                                        x4.d1 d1Var3 = d1Var2;
                                        hVar.z(d1Var3.B, d1Var3.D);
                                        break;
                                    case 1:
                                        lVar.f7453b.v(d1Var2);
                                        break;
                                    case 2:
                                        w4.h hVar2 = lVar.f7453b;
                                        x4.d1 d1Var4 = d1Var2;
                                        hVar2.z(d1Var4.B, d1Var4.D);
                                        break;
                                    case 3:
                                        w4.h hVar3 = lVar.f7453b;
                                        x4.d1 d1Var5 = d1Var2;
                                        hVar3.t(d1Var5.f11094l, d1Var5.f11095m);
                                        break;
                                    case 4:
                                        lVar.f7453b.j(d1Var2.f11094l);
                                        break;
                                    case 5:
                                        lVar.f7453b.j(d1Var2.f11094l);
                                        break;
                                    case 6:
                                        lVar.f7453b.w(d1Var2.f11094l);
                                        break;
                                    default:
                                        w4.h hVar4 = lVar.f7453b;
                                        x4.d1 d1Var6 = d1Var2;
                                        hVar4.z(d1Var6.B, d1Var6.D);
                                        break;
                                }
                            }
                        });
                        textView2.setTypeface(f4.c.f4883w);
                        textView2.setText(d1Var2.C);
                        ((TextView) eVarC.f5127s).setVisibility(8);
                        lVar.a(d1Var2, eVarC);
                        frameLayout.addView(relativeLayout);
                        break;
                    }
                    break;
                case 950398559:
                    if (str3.equals("comment")) {
                        g2.e eVarC2 = g2.e.c(LayoutInflater.from(context2));
                        RelativeLayout relativeLayout2 = (RelativeLayout) eVarC2.f5119b;
                        TextView textView3 = (TextView) eVarC2.f5127s;
                        TextView textView4 = (TextView) eVarC2.f5126r;
                        ImageView imageView8 = (ImageView) eVarC2.f5120l;
                        a4.g0 g0VarD4 = a4.g0.d();
                        String str5 = d1Var2.F;
                        a4.l0 l0VarE4 = g0VarD4.e(str5 != null ? a4.x.k(str5, UptodownApp.K, ":webp") : null);
                        l0VarE4.g(b4.d.f(context2));
                        l0VarE4.h(b4.d.x(context2));
                        l0VarE4.e(imageView8, null);
                        imageView6.setImageDrawable(ContextCompat.getDrawable(context2, R.drawable.vector_feed_review));
                        final int i19 = 0;
                        imageView8.setOnClickListener(new View.OnClickListener() { // from class: m5.k
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i19) {
                                    case 0:
                                        w4.h hVar = lVar.f7453b;
                                        x4.d1 d1Var3 = d1Var2;
                                        hVar.z(d1Var3.B, d1Var3.D);
                                        break;
                                    case 1:
                                        lVar.f7453b.v(d1Var2);
                                        break;
                                    case 2:
                                        w4.h hVar2 = lVar.f7453b;
                                        x4.d1 d1Var4 = d1Var2;
                                        hVar2.z(d1Var4.B, d1Var4.D);
                                        break;
                                    case 3:
                                        w4.h hVar3 = lVar.f7453b;
                                        x4.d1 d1Var5 = d1Var2;
                                        hVar3.t(d1Var5.f11094l, d1Var5.f11095m);
                                        break;
                                    case 4:
                                        lVar.f7453b.j(d1Var2.f11094l);
                                        break;
                                    case 5:
                                        lVar.f7453b.j(d1Var2.f11094l);
                                        break;
                                    case 6:
                                        lVar.f7453b.w(d1Var2.f11094l);
                                        break;
                                    default:
                                        w4.h hVar4 = lVar.f7453b;
                                        x4.d1 d1Var6 = d1Var2;
                                        hVar4.z(d1Var6.B, d1Var6.D);
                                        break;
                                }
                            }
                        });
                        textView4.setTypeface(f4.c.f4883w);
                        textView4.setText(d1Var2.C);
                        textView3.setTypeface(f4.c.f4884x);
                        textView3.setText(d1Var2.f11103u);
                        final int i20 = 1;
                        relativeLayout2.setOnClickListener(new View.OnClickListener() { // from class: m5.k
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i20) {
                                    case 0:
                                        w4.h hVar = lVar.f7453b;
                                        x4.d1 d1Var3 = d1Var2;
                                        hVar.z(d1Var3.B, d1Var3.D);
                                        break;
                                    case 1:
                                        lVar.f7453b.v(d1Var2);
                                        break;
                                    case 2:
                                        w4.h hVar2 = lVar.f7453b;
                                        x4.d1 d1Var4 = d1Var2;
                                        hVar2.z(d1Var4.B, d1Var4.D);
                                        break;
                                    case 3:
                                        w4.h hVar3 = lVar.f7453b;
                                        x4.d1 d1Var5 = d1Var2;
                                        hVar3.t(d1Var5.f11094l, d1Var5.f11095m);
                                        break;
                                    case 4:
                                        lVar.f7453b.j(d1Var2.f11094l);
                                        break;
                                    case 5:
                                        lVar.f7453b.j(d1Var2.f11094l);
                                        break;
                                    case 6:
                                        lVar.f7453b.w(d1Var2.f11094l);
                                        break;
                                    default:
                                        w4.h hVar4 = lVar.f7453b;
                                        x4.d1 d1Var6 = d1Var2;
                                        hVar4.z(d1Var6.B, d1Var6.D);
                                        break;
                                }
                            }
                        });
                        lVar.a(d1Var2, eVarC2);
                        frameLayout.addView(relativeLayout2);
                        break;
                    }
                    break;
                case 1345968512:
                    if (str3.equals("list_add")) {
                        View viewInflate = LayoutInflater.from(context2).inflate(R.layout.feed_item_add_list, (ViewGroup) null, false);
                        int i21 = R.id.iv_icon_feed_item;
                        ImageView imageView9 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.iv_icon_feed_item);
                        if (imageView9 != null) {
                            i21 = R.id.tv_app_name_feed_item;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_app_name_feed_item);
                            if (textView5 != null) {
                                i21 = R.id.tv_app_short_description_feed_item;
                                TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_app_short_description_feed_item);
                                if (textView6 != null) {
                                    i21 = R.id.tv_list_feed_item;
                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_list_feed_item);
                                    if (textView7 != null) {
                                        RelativeLayout relativeLayout3 = (RelativeLayout) viewInflate;
                                        a4.g0 g0VarD5 = a4.g0.d();
                                        String str6 = d1Var2.F;
                                        a4.l0 l0VarE5 = g0VarD5.e(str6 != null ? a4.x.k(str6, UptodownApp.K, ":webp") : null);
                                        l0VarE5.h(b4.d.x(context2));
                                        l0VarE5.g(b4.d.f(context2));
                                        l0VarE5.e(imageView9, null);
                                        imageView6.setImageDrawable(ContextCompat.getDrawable(context2, R.drawable.vector_feed_recommended));
                                        final int i22 = 2;
                                        relativeLayout3.setOnClickListener(new View.OnClickListener() { // from class: m5.k
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                switch (i22) {
                                                    case 0:
                                                        w4.h hVar = lVar.f7453b;
                                                        x4.d1 d1Var3 = d1Var2;
                                                        hVar.z(d1Var3.B, d1Var3.D);
                                                        break;
                                                    case 1:
                                                        lVar.f7453b.v(d1Var2);
                                                        break;
                                                    case 2:
                                                        w4.h hVar2 = lVar.f7453b;
                                                        x4.d1 d1Var4 = d1Var2;
                                                        hVar2.z(d1Var4.B, d1Var4.D);
                                                        break;
                                                    case 3:
                                                        w4.h hVar3 = lVar.f7453b;
                                                        x4.d1 d1Var5 = d1Var2;
                                                        hVar3.t(d1Var5.f11094l, d1Var5.f11095m);
                                                        break;
                                                    case 4:
                                                        lVar.f7453b.j(d1Var2.f11094l);
                                                        break;
                                                    case 5:
                                                        lVar.f7453b.j(d1Var2.f11094l);
                                                        break;
                                                    case 6:
                                                        lVar.f7453b.w(d1Var2.f11094l);
                                                        break;
                                                    default:
                                                        w4.h hVar4 = lVar.f7453b;
                                                        x4.d1 d1Var6 = d1Var2;
                                                        hVar4.z(d1Var6.B, d1Var6.D);
                                                        break;
                                                }
                                            }
                                        });
                                        textView7.setTypeface(f4.c.f4883w);
                                        final int i23 = 3;
                                        textView7.setOnClickListener(new View.OnClickListener() { // from class: m5.k
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                switch (i23) {
                                                    case 0:
                                                        w4.h hVar = lVar.f7453b;
                                                        x4.d1 d1Var3 = d1Var2;
                                                        hVar.z(d1Var3.B, d1Var3.D);
                                                        break;
                                                    case 1:
                                                        lVar.f7453b.v(d1Var2);
                                                        break;
                                                    case 2:
                                                        w4.h hVar2 = lVar.f7453b;
                                                        x4.d1 d1Var4 = d1Var2;
                                                        hVar2.z(d1Var4.B, d1Var4.D);
                                                        break;
                                                    case 3:
                                                        w4.h hVar3 = lVar.f7453b;
                                                        x4.d1 d1Var5 = d1Var2;
                                                        hVar3.t(d1Var5.f11094l, d1Var5.f11095m);
                                                        break;
                                                    case 4:
                                                        lVar.f7453b.j(d1Var2.f11094l);
                                                        break;
                                                    case 5:
                                                        lVar.f7453b.j(d1Var2.f11094l);
                                                        break;
                                                    case 6:
                                                        lVar.f7453b.w(d1Var2.f11094l);
                                                        break;
                                                    default:
                                                        w4.h hVar4 = lVar.f7453b;
                                                        x4.d1 d1Var6 = d1Var2;
                                                        hVar4.z(d1Var6.B, d1Var6.D);
                                                        break;
                                                }
                                            }
                                        });
                                        textView5.setTypeface(f4.c.f4883w);
                                        textView5.setText(d1Var2.C);
                                        textView6.setTypeface(f4.c.f4884x);
                                        textView6.setText(d1Var2.E);
                                        frameLayout.addView(relativeLayout3);
                                    }
                                }
                            }
                        }
                        com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i21)));
                        break;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8 A[PHI: r1
      0x00b8: PHI (r1v18 int) = (r1v17 int), (r1v22 int) binds: [B:19:0x0071, B:25:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0152 A[PHI: r1
      0x0152: PHI (r1v3 int) = (r1v2 int), (r1v5 int) binds: [B:42:0x00e5, B:46:0x00fc] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r26, int r27) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.c.onCreateViewHolder(android.view.ViewGroup, int):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }
}
