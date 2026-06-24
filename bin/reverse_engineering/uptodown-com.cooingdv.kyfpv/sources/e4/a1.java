package e4;

import android.content.Context;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a1 extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f4480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0.i f4481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f4484e;
    public int f;

    public a1(ArrayList arrayList, f0.i iVar, int i, int i6, boolean z9, int i10) {
        i6 = (i10 & 8) != 0 ? 0 : i6;
        z9 = (i10 & 16) != 0 ? false : z9;
        iVar.getClass();
        this.f4480a = arrayList;
        this.f4481b = iVar;
        this.f4482c = i;
        this.f4483d = i6;
        this.f4484e = z9;
        this.f = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f4480a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        viewHolder.getClass();
        Object obj = this.f4480a.get(i);
        obj.getClass();
        x4.i iVar = (x4.i) obj;
        if (!(viewHolder instanceof z0)) {
            if (viewHolder instanceof y0) {
                y0 y0Var = (y0) viewHolder;
                boolean z9 = this.f == i;
                a4.l0 l0VarE = a4.g0.d().e(iVar.a());
                float f = UptodownApp.I;
                Context context = y0Var.f4726l;
                l0VarE.h(b4.d.x(context));
                l0VarE.g(b4.d.f(context));
                a4.d0 d0Var = y0Var.f4724a;
                ImageView imageView = (ImageView) d0Var.f82l;
                ImageView imageView2 = (ImageView) d0Var.f83m;
                l0VarE.e(imageView, null);
                ((ImageView) d0Var.f82l).setOnClickListener(new e0(y0Var, iVar, i, i));
                RelativeLayout relativeLayout = (RelativeLayout) d0Var.f85o;
                if (z9) {
                    relativeLayout.setBackground(ContextCompat.getDrawable(context, R.drawable.shape_avatar_selected_turbo_item));
                    imageView2.setVisibility(0);
                } else {
                    relativeLayout.setBackground(null);
                    imageView2.setVisibility(8);
                }
                boolean z10 = y0Var.f4727m.f4484e;
                ImageView imageView3 = (ImageView) d0Var.f84n;
                if (z10) {
                    imageView3.setVisibility(8);
                    return;
                } else {
                    imageView3.setVisibility(0);
                    return;
                }
            }
            return;
        }
        z0 z0Var = (z0) viewHolder;
        i = this.f != i ? 0 : 1;
        a4.l0 l0VarE2 = a4.g0.d().e(iVar.a());
        float f10 = UptodownApp.I;
        Context context2 = z0Var.f4733l;
        l0VarE2.h(b4.d.x(context2));
        l0VarE2.g(b4.d.f(context2));
        y2.s sVar = z0Var.f4731a;
        ImageView imageView4 = (ImageView) sVar.f11757l;
        RelativeLayout relativeLayout2 = (RelativeLayout) sVar.f11759n;
        ImageView imageView5 = (ImageView) sVar.f11758m;
        RelativeLayout relativeLayout3 = (RelativeLayout) sVar.f11756b;
        l0VarE2.e(imageView4, null);
        ((ImageView) sVar.f11757l).setOnClickListener(new e0(z0Var, iVar, i, 2));
        int i6 = this.f4483d;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i6, i6);
        int dimension = (int) context2.getResources().getDimension(R.dimen.margin_m);
        if (i != 0) {
            layoutParams.setMargins(dimension, dimension, dimension, dimension);
            relativeLayout3.setLayoutParams(layoutParams);
            relativeLayout3.animate().scaleX(1.2f).scaleY(1.2f).setDuration(200L).start();
            imageView5.setVisibility(0);
            relativeLayout2.setBackground(ContextCompat.getDrawable(context2, R.drawable.shape_avatar_selected_item));
            return;
        }
        layoutParams.setMargins(dimension, dimension, dimension, dimension);
        relativeLayout3.setLayoutParams(layoutParams);
        relativeLayout3.animate().scaleX(1.0f).scaleY(1.0f).setDuration(200L).start();
        relativeLayout2.setBackground(null);
        imageView5.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062 A[PHI: r6
      0x0062: PHI (r6v2 int) = (r6v0 int), (r6v3 int) binds: [B:9:0x0034, B:11:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r18, int r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r1.getClass()
            r2 = 0
            java.lang.String r3 = "Missing required view with ID: "
            f0.i r4 = r0.f4481b
            r5 = 2131363256(0x7f0a05b8, float:1.8346316E38)
            r6 = 2131362321(0x7f0a0211, float:1.834442E38)
            r7 = 2131362303(0x7f0a01ff, float:1.8344383E38)
            r8 = 0
            int r9 = r0.f4482c
            if (r9 == 0) goto L7b
            r10 = 1
            if (r9 != r10) goto L75
            r9 = 2131558866(0x7f0d01d2, float:1.874306E38)
            android.view.View r8 = c.j.b(r1, r9, r1, r8)
            android.view.View r9 = androidx.viewbinding.ViewBindings.findChildViewById(r8, r7)
            r12 = r9
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            if (r12 == 0) goto L64
            android.view.View r7 = androidx.viewbinding.ViewBindings.findChildViewById(r8, r6)
            r13 = r7
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            if (r13 == 0) goto L62
            r6 = 2131362409(0x7f0a0269, float:1.8344598E38)
            android.view.View r7 = androidx.viewbinding.ViewBindings.findChildViewById(r8, r6)
            r14 = r7
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            if (r14 == 0) goto L62
            android.view.View r6 = androidx.viewbinding.ViewBindings.findChildViewById(r8, r5)
            r15 = r6
            android.widget.RelativeLayout r15 = (android.widget.RelativeLayout) r15
            if (r15 == 0) goto L65
            a4.d0 r10 = new a4.d0
            r11 = r8
            android.widget.RelativeLayout r11 = (android.widget.RelativeLayout) r11
            r16 = 11
            r10.<init>(r11, r12, r13, r14, r15, r16)
            e4.y0 r2 = new e4.y0
            android.content.Context r1 = r1.getContext()
            r1.getClass()
            r2.<init>(r0, r10, r4, r1)
            return r2
        L62:
            r5 = r6
            goto L65
        L64:
            r5 = r7
        L65:
            android.content.res.Resources r1 = r8.getResources()
            java.lang.String r1 = r1.getResourceName(r5)
            java.lang.String r1 = r3.concat(r1)
            com.google.gson.internal.a.i(r1)
            return r2
        L75:
            java.lang.String r1 = "ViewHolder unknown!!"
            com.google.gson.internal.a.p(r1)
            return r2
        L7b:
            r9 = 2131558864(0x7f0d01d0, float:1.8743056E38)
            android.view.View r8 = c.j.b(r1, r9, r1, r8)
            android.view.View r9 = androidx.viewbinding.ViewBindings.findChildViewById(r8, r7)
            r12 = r9
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            if (r12 == 0) goto Lb6
            android.view.View r7 = androidx.viewbinding.ViewBindings.findChildViewById(r8, r6)
            r13 = r7
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            if (r13 == 0) goto Lb4
            android.view.View r6 = androidx.viewbinding.ViewBindings.findChildViewById(r8, r5)
            r14 = r6
            android.widget.RelativeLayout r14 = (android.widget.RelativeLayout) r14
            if (r14 == 0) goto Lb7
            y2.s r10 = new y2.s
            r11 = r8
            android.widget.RelativeLayout r11 = (android.widget.RelativeLayout) r11
            r15 = 16
            r10.<init>(r11, r12, r13, r14, r15)
            e4.z0 r2 = new e4.z0
            android.content.Context r1 = r1.getContext()
            r1.getClass()
            r2.<init>(r10, r4, r1)
            return r2
        Lb4:
            r5 = r6
            goto Lb7
        Lb6:
            r5 = r7
        Lb7:
            android.content.res.Resources r1 = r8.getResources()
            java.lang.String r1 = r1.getResourceName(r5)
            java.lang.String r1 = r3.concat(r1)
            com.google.gson.internal.a.i(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.a1.onCreateViewHolder(android.view.ViewGroup, int):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }
}
