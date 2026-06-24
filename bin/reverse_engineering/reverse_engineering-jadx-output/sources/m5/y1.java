package m5;

import android.content.Context;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.android.gms.internal.measurement.i5;
import com.google.android.gms.internal.measurement.z3;
import com.uptodown.UptodownApp;
import com.uptodown.activities.PublicListActivity;
import com.uptodown.activities.RecommendedActivity;
import com.uptodown.activities.WishlistActivity;
import x4.a3;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class y1 extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t4.g1 f7642b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f7643l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f0.i f7644m;

    /* JADX WARN: Illegal instructions before constructor call */
    public y1(t4.g1 g1Var, Context context, f0.i iVar) {
        context.getClass();
        RelativeLayout relativeLayout = g1Var.f9821a;
        relativeLayout.getClass();
        super(relativeLayout);
        this.f7642b = g1Var;
        this.f7643l = context;
        this.f7644m = iVar;
        RelativeLayout relativeLayout2 = g1Var.f9829r;
        final int i = 0;
        relativeLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: m5.x1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y1 f7637b;

            {
                this.f7637b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int bindingAdapterPosition;
                e4.e1 e1Var;
                e4.e1 e1Var2;
                e4.e1 e1Var3;
                e4.e1 e1Var4;
                int i6 = i;
                y1 y1Var = this.f7637b;
                switch (i6) {
                    case 0:
                        f0.i iVar2 = y1Var.f7644m;
                        if (iVar2 != null && (bindingAdapterPosition = y1Var.getBindingAdapterPosition()) != -1) {
                            iVar2.b(bindingAdapterPosition);
                            break;
                        }
                        break;
                    case 1:
                        f0.i iVar3 = y1Var.f7644m;
                        if (iVar3 != null) {
                            int bindingAdapterPosition2 = y1Var.getBindingAdapterPosition();
                            t6.c cVar = null;
                            int i10 = 2;
                            switch (iVar3.f4810a) {
                                case 11:
                                    PublicListActivity publicListActivity = (PublicListActivity) iVar3.f4811b;
                                    e4.e1 e1Var5 = publicListActivity.f3336c0;
                                    if (e1Var5 != null && !e1Var5.f4519a.isEmpty()) {
                                        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(publicListActivity);
                                        v7.e eVar = o7.m0.f8288a;
                                        o7.c0.s(lifecycleScope, t7.n.f10348a, null, new b.e(publicListActivity, bindingAdapterPosition2, cVar, i10), 2);
                                        break;
                                    }
                                    break;
                                case 12:
                                    RecommendedActivity recommendedActivity = (RecommendedActivity) iVar3.f4811b;
                                    float f = UptodownApp.I;
                                    if (b4.d.t() && (e1Var = recommendedActivity.f3340c0) != null && !e1Var.f4519a.isEmpty()) {
                                        LifecycleCoroutineScope lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(recommendedActivity);
                                        v7.e eVar2 = o7.m0.f8288a;
                                        o7.c0.s(lifecycleScope2, t7.n.f10348a, null, new b.e(recommendedActivity, bindingAdapterPosition2, cVar, 3), 2);
                                        break;
                                    }
                                    break;
                                default:
                                    WishlistActivity wishlistActivity = (WishlistActivity) iVar3.f4811b;
                                    e4.e1 e1Var6 = wishlistActivity.f3369c0;
                                    if (e1Var6 != null && !e1Var6.f4519a.isEmpty()) {
                                        LifecycleCoroutineScope lifecycleScope3 = LifecycleOwnerKt.getLifecycleScope(wishlistActivity);
                                        v7.e eVar3 = o7.m0.f8288a;
                                        o7.c0.s(lifecycleScope3, t7.n.f10348a, null, new b.e(wishlistActivity, bindingAdapterPosition2, cVar, 4), 2);
                                        break;
                                    }
                                    break;
                            }
                        }
                        break;
                    default:
                        f0.i iVar4 = y1Var.f7644m;
                        if (iVar4 != null) {
                            int bindingAdapterPosition3 = y1Var.getBindingAdapterPosition();
                            switch (iVar4.f4810a) {
                                case 11:
                                    PublicListActivity publicListActivity2 = (PublicListActivity) iVar4.f4811b;
                                    float f10 = UptodownApp.I;
                                    if (b4.d.t() && (e1Var2 = publicListActivity2.f3336c0) != null && !e1Var2.f4519a.isEmpty()) {
                                        e4.e1 e1Var7 = publicListActivity2.f3336c0;
                                        e1Var7.getClass();
                                        Object obj = e1Var7.f4519a.get(bindingAdapterPosition3);
                                        obj.getClass();
                                        a3 a3Var = (a3) obj;
                                        d0.b.t(a3Var.f11046a, publicListActivity2, a3Var.f11049d);
                                        e4.e1 e1Var8 = publicListActivity2.f3336c0;
                                        if (e1Var8 != null) {
                                            e1Var8.notifyItemChanged(bindingAdapterPosition3);
                                        }
                                        break;
                                    }
                                    break;
                                case 12:
                                    RecommendedActivity recommendedActivity2 = (RecommendedActivity) iVar4.f4811b;
                                    float f11 = UptodownApp.I;
                                    if (b4.d.t() && (e1Var3 = recommendedActivity2.f3340c0) != null && !e1Var3.f4519a.isEmpty()) {
                                        e4.e1 e1Var9 = recommendedActivity2.f3340c0;
                                        e1Var9.getClass();
                                        Object obj2 = e1Var9.f4519a.get(bindingAdapterPosition3);
                                        obj2.getClass();
                                        a3 a3Var2 = (a3) obj2;
                                        d0.b.t(a3Var2.f11046a, recommendedActivity2, a3Var2.f11049d);
                                        e4.e1 e1Var10 = recommendedActivity2.f3340c0;
                                        if (e1Var10 != null) {
                                            e1Var10.notifyItemChanged(bindingAdapterPosition3);
                                        }
                                        break;
                                    }
                                    break;
                                default:
                                    WishlistActivity wishlistActivity2 = (WishlistActivity) iVar4.f4811b;
                                    float f12 = UptodownApp.I;
                                    if (b4.d.t() && (e1Var4 = wishlistActivity2.f3369c0) != null && !e1Var4.f4519a.isEmpty()) {
                                        e4.e1 e1Var11 = wishlistActivity2.f3369c0;
                                        e1Var11.getClass();
                                        Object obj3 = e1Var11.f4519a.get(bindingAdapterPosition3);
                                        obj3.getClass();
                                        a3 a3Var3 = (a3) obj3;
                                        d0.b.t(a3Var3.f11046a, wishlistActivity2, a3Var3.f11049d);
                                        e4.e1 e1Var12 = wishlistActivity2.f3369c0;
                                        if (e1Var12 != null) {
                                            e1Var12.notifyItemChanged(bindingAdapterPosition3);
                                        }
                                        break;
                                    }
                                    break;
                            }
                        }
                        break;
                }
            }
        });
        final int i6 = 1;
        relativeLayout2.setOnLongClickListener(new h(this, i6));
        g1Var.f9827p.setOnClickListener(new View.OnClickListener(this) { // from class: m5.x1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y1 f7637b;

            {
                this.f7637b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int bindingAdapterPosition;
                e4.e1 e1Var;
                e4.e1 e1Var2;
                e4.e1 e1Var3;
                e4.e1 e1Var4;
                int i62 = i6;
                y1 y1Var = this.f7637b;
                switch (i62) {
                    case 0:
                        f0.i iVar2 = y1Var.f7644m;
                        if (iVar2 != null && (bindingAdapterPosition = y1Var.getBindingAdapterPosition()) != -1) {
                            iVar2.b(bindingAdapterPosition);
                            break;
                        }
                        break;
                    case 1:
                        f0.i iVar3 = y1Var.f7644m;
                        if (iVar3 != null) {
                            int bindingAdapterPosition2 = y1Var.getBindingAdapterPosition();
                            t6.c cVar = null;
                            int i10 = 2;
                            switch (iVar3.f4810a) {
                                case 11:
                                    PublicListActivity publicListActivity = (PublicListActivity) iVar3.f4811b;
                                    e4.e1 e1Var5 = publicListActivity.f3336c0;
                                    if (e1Var5 != null && !e1Var5.f4519a.isEmpty()) {
                                        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(publicListActivity);
                                        v7.e eVar = o7.m0.f8288a;
                                        o7.c0.s(lifecycleScope, t7.n.f10348a, null, new b.e(publicListActivity, bindingAdapterPosition2, cVar, i10), 2);
                                        break;
                                    }
                                    break;
                                case 12:
                                    RecommendedActivity recommendedActivity = (RecommendedActivity) iVar3.f4811b;
                                    float f = UptodownApp.I;
                                    if (b4.d.t() && (e1Var = recommendedActivity.f3340c0) != null && !e1Var.f4519a.isEmpty()) {
                                        LifecycleCoroutineScope lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(recommendedActivity);
                                        v7.e eVar2 = o7.m0.f8288a;
                                        o7.c0.s(lifecycleScope2, t7.n.f10348a, null, new b.e(recommendedActivity, bindingAdapterPosition2, cVar, 3), 2);
                                        break;
                                    }
                                    break;
                                default:
                                    WishlistActivity wishlistActivity = (WishlistActivity) iVar3.f4811b;
                                    e4.e1 e1Var6 = wishlistActivity.f3369c0;
                                    if (e1Var6 != null && !e1Var6.f4519a.isEmpty()) {
                                        LifecycleCoroutineScope lifecycleScope3 = LifecycleOwnerKt.getLifecycleScope(wishlistActivity);
                                        v7.e eVar3 = o7.m0.f8288a;
                                        o7.c0.s(lifecycleScope3, t7.n.f10348a, null, new b.e(wishlistActivity, bindingAdapterPosition2, cVar, 4), 2);
                                        break;
                                    }
                                    break;
                            }
                        }
                        break;
                    default:
                        f0.i iVar4 = y1Var.f7644m;
                        if (iVar4 != null) {
                            int bindingAdapterPosition3 = y1Var.getBindingAdapterPosition();
                            switch (iVar4.f4810a) {
                                case 11:
                                    PublicListActivity publicListActivity2 = (PublicListActivity) iVar4.f4811b;
                                    float f10 = UptodownApp.I;
                                    if (b4.d.t() && (e1Var2 = publicListActivity2.f3336c0) != null && !e1Var2.f4519a.isEmpty()) {
                                        e4.e1 e1Var7 = publicListActivity2.f3336c0;
                                        e1Var7.getClass();
                                        Object obj = e1Var7.f4519a.get(bindingAdapterPosition3);
                                        obj.getClass();
                                        a3 a3Var = (a3) obj;
                                        d0.b.t(a3Var.f11046a, publicListActivity2, a3Var.f11049d);
                                        e4.e1 e1Var8 = publicListActivity2.f3336c0;
                                        if (e1Var8 != null) {
                                            e1Var8.notifyItemChanged(bindingAdapterPosition3);
                                        }
                                        break;
                                    }
                                    break;
                                case 12:
                                    RecommendedActivity recommendedActivity2 = (RecommendedActivity) iVar4.f4811b;
                                    float f11 = UptodownApp.I;
                                    if (b4.d.t() && (e1Var3 = recommendedActivity2.f3340c0) != null && !e1Var3.f4519a.isEmpty()) {
                                        e4.e1 e1Var9 = recommendedActivity2.f3340c0;
                                        e1Var9.getClass();
                                        Object obj2 = e1Var9.f4519a.get(bindingAdapterPosition3);
                                        obj2.getClass();
                                        a3 a3Var2 = (a3) obj2;
                                        d0.b.t(a3Var2.f11046a, recommendedActivity2, a3Var2.f11049d);
                                        e4.e1 e1Var10 = recommendedActivity2.f3340c0;
                                        if (e1Var10 != null) {
                                            e1Var10.notifyItemChanged(bindingAdapterPosition3);
                                        }
                                        break;
                                    }
                                    break;
                                default:
                                    WishlistActivity wishlistActivity2 = (WishlistActivity) iVar4.f4811b;
                                    float f12 = UptodownApp.I;
                                    if (b4.d.t() && (e1Var4 = wishlistActivity2.f3369c0) != null && !e1Var4.f4519a.isEmpty()) {
                                        e4.e1 e1Var11 = wishlistActivity2.f3369c0;
                                        e1Var11.getClass();
                                        Object obj3 = e1Var11.f4519a.get(bindingAdapterPosition3);
                                        obj3.getClass();
                                        a3 a3Var3 = (a3) obj3;
                                        d0.b.t(a3Var3.f11046a, wishlistActivity2, a3Var3.f11049d);
                                        e4.e1 e1Var12 = wishlistActivity2.f3369c0;
                                        if (e1Var12 != null) {
                                            e1Var12.notifyItemChanged(bindingAdapterPosition3);
                                        }
                                        break;
                                    }
                                    break;
                            }
                        }
                        break;
                }
            }
        });
        final int i10 = 2;
        g1Var.f9822b.setOnClickListener(new View.OnClickListener(this) { // from class: m5.x1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y1 f7637b;

            {
                this.f7637b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int bindingAdapterPosition;
                e4.e1 e1Var;
                e4.e1 e1Var2;
                e4.e1 e1Var3;
                e4.e1 e1Var4;
                int i62 = i10;
                y1 y1Var = this.f7637b;
                switch (i62) {
                    case 0:
                        f0.i iVar2 = y1Var.f7644m;
                        if (iVar2 != null && (bindingAdapterPosition = y1Var.getBindingAdapterPosition()) != -1) {
                            iVar2.b(bindingAdapterPosition);
                            break;
                        }
                        break;
                    case 1:
                        f0.i iVar3 = y1Var.f7644m;
                        if (iVar3 != null) {
                            int bindingAdapterPosition2 = y1Var.getBindingAdapterPosition();
                            t6.c cVar = null;
                            int i102 = 2;
                            switch (iVar3.f4810a) {
                                case 11:
                                    PublicListActivity publicListActivity = (PublicListActivity) iVar3.f4811b;
                                    e4.e1 e1Var5 = publicListActivity.f3336c0;
                                    if (e1Var5 != null && !e1Var5.f4519a.isEmpty()) {
                                        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(publicListActivity);
                                        v7.e eVar = o7.m0.f8288a;
                                        o7.c0.s(lifecycleScope, t7.n.f10348a, null, new b.e(publicListActivity, bindingAdapterPosition2, cVar, i102), 2);
                                        break;
                                    }
                                    break;
                                case 12:
                                    RecommendedActivity recommendedActivity = (RecommendedActivity) iVar3.f4811b;
                                    float f = UptodownApp.I;
                                    if (b4.d.t() && (e1Var = recommendedActivity.f3340c0) != null && !e1Var.f4519a.isEmpty()) {
                                        LifecycleCoroutineScope lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(recommendedActivity);
                                        v7.e eVar2 = o7.m0.f8288a;
                                        o7.c0.s(lifecycleScope2, t7.n.f10348a, null, new b.e(recommendedActivity, bindingAdapterPosition2, cVar, 3), 2);
                                        break;
                                    }
                                    break;
                                default:
                                    WishlistActivity wishlistActivity = (WishlistActivity) iVar3.f4811b;
                                    e4.e1 e1Var6 = wishlistActivity.f3369c0;
                                    if (e1Var6 != null && !e1Var6.f4519a.isEmpty()) {
                                        LifecycleCoroutineScope lifecycleScope3 = LifecycleOwnerKt.getLifecycleScope(wishlistActivity);
                                        v7.e eVar3 = o7.m0.f8288a;
                                        o7.c0.s(lifecycleScope3, t7.n.f10348a, null, new b.e(wishlistActivity, bindingAdapterPosition2, cVar, 4), 2);
                                        break;
                                    }
                                    break;
                            }
                        }
                        break;
                    default:
                        f0.i iVar4 = y1Var.f7644m;
                        if (iVar4 != null) {
                            int bindingAdapterPosition3 = y1Var.getBindingAdapterPosition();
                            switch (iVar4.f4810a) {
                                case 11:
                                    PublicListActivity publicListActivity2 = (PublicListActivity) iVar4.f4811b;
                                    float f10 = UptodownApp.I;
                                    if (b4.d.t() && (e1Var2 = publicListActivity2.f3336c0) != null && !e1Var2.f4519a.isEmpty()) {
                                        e4.e1 e1Var7 = publicListActivity2.f3336c0;
                                        e1Var7.getClass();
                                        Object obj = e1Var7.f4519a.get(bindingAdapterPosition3);
                                        obj.getClass();
                                        a3 a3Var = (a3) obj;
                                        d0.b.t(a3Var.f11046a, publicListActivity2, a3Var.f11049d);
                                        e4.e1 e1Var8 = publicListActivity2.f3336c0;
                                        if (e1Var8 != null) {
                                            e1Var8.notifyItemChanged(bindingAdapterPosition3);
                                        }
                                        break;
                                    }
                                    break;
                                case 12:
                                    RecommendedActivity recommendedActivity2 = (RecommendedActivity) iVar4.f4811b;
                                    float f11 = UptodownApp.I;
                                    if (b4.d.t() && (e1Var3 = recommendedActivity2.f3340c0) != null && !e1Var3.f4519a.isEmpty()) {
                                        e4.e1 e1Var9 = recommendedActivity2.f3340c0;
                                        e1Var9.getClass();
                                        Object obj2 = e1Var9.f4519a.get(bindingAdapterPosition3);
                                        obj2.getClass();
                                        a3 a3Var2 = (a3) obj2;
                                        d0.b.t(a3Var2.f11046a, recommendedActivity2, a3Var2.f11049d);
                                        e4.e1 e1Var10 = recommendedActivity2.f3340c0;
                                        if (e1Var10 != null) {
                                            e1Var10.notifyItemChanged(bindingAdapterPosition3);
                                        }
                                        break;
                                    }
                                    break;
                                default:
                                    WishlistActivity wishlistActivity2 = (WishlistActivity) iVar4.f4811b;
                                    float f12 = UptodownApp.I;
                                    if (b4.d.t() && (e1Var4 = wishlistActivity2.f3369c0) != null && !e1Var4.f4519a.isEmpty()) {
                                        e4.e1 e1Var11 = wishlistActivity2.f3369c0;
                                        e1Var11.getClass();
                                        Object obj3 = e1Var11.f4519a.get(bindingAdapterPosition3);
                                        obj3.getClass();
                                        a3 a3Var3 = (a3) obj3;
                                        d0.b.t(a3Var3.f11046a, wishlistActivity2, a3Var3.f11049d);
                                        e4.e1 e1Var12 = wishlistActivity2.f3369c0;
                                        if (e1Var12 != null) {
                                            e1Var12.notifyItemChanged(bindingAdapterPosition3);
                                        }
                                        break;
                                    }
                                    break;
                            }
                        }
                        break;
                }
            }
        });
        g1Var.f9830s.setTypeface(f4.c.f4882w);
        g1Var.f9832u.setTypeface(f4.c.f4882w);
        g1Var.f9831t.setTypeface(f4.c.f4883x);
        g1Var.v.setTypeface(f4.c.f4883x);
    }

    public final void c(String str) {
        t4.g1 g1Var = this.f7642b;
        a(g1Var.f9826o, g1Var.f9824m);
        TextView textView = g1Var.f9830s;
        z3.J(textView);
        textView.setText(str);
        g1Var.f9828q.setVisibility(8);
    }

    public final void d(x4.r rVar) {
        t4.g1 g1Var = this.f7642b;
        b(g1Var.f9826o, g1Var.f9824m);
        TextView textView = g1Var.v;
        textView.setVisibility(8);
        g1Var.f9831t.setText(this.itemView.getContext().getString(2131952467, Integer.valueOf(rVar.i()), i5.H(this.f7643l, rVar.k())));
        ProgressBar progressBar = g1Var.f9826o;
        int i = rVar.i();
        progressBar.setIndeterminate(false);
        progressBar.setProgress(i);
        g1Var.f9828q.setVisibility(0);
        g1Var.f9822b.setVisibility(0);
        textView.setVisibility(8);
        g1Var.f9830s.setVisibility(8);
    }

    public final void e() {
        t4.g1 g1Var = this.f7642b;
        b(g1Var.f9826o, g1Var.f9824m);
        g1Var.f9826o.setIndeterminate(true);
        TextView textView = g1Var.f9830s;
        Context context = this.f7643l;
        textView.setBackground(ContextCompat.getDrawable(context, 2131230859));
        textView.setTextColor(ContextCompat.getColor(context, 2131099813));
        g1Var.f9828q.setVisibility(0);
        g1Var.v.setText(context.getString(2131952095));
    }
}
