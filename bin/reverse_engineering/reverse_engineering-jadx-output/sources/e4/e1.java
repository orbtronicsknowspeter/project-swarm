package e4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import m5.y1;
import x4.a3;
import x4.q2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class e1 extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f4519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f4520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f0.i f4521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4523e;

    public e1(ArrayList arrayList, Context context, f0.i iVar) {
        arrayList.getClass();
        context.getClass();
        iVar.getClass();
        this.f4519a = arrayList;
        this.f4520b = context;
        this.f4521c = iVar;
        this.f4523e = -1;
    }

    public final void a(Context context, File file) {
        file.getClass();
        j5.g gVarL = j5.g.D.l(context);
        gVarL.b();
        Iterator it = this.f4519a.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            int i6 = i + 1;
            a3 a3Var = (a3) it.next();
            String str = a3Var.f11049d;
            if (str != null && str.length() != 0) {
                String str2 = a3Var.f11049d;
                str2.getClass();
                q2 q2VarY = gVarL.Y(str2);
                x4.r rVarA = q2VarY != null ? q2VarY.a(context) : null;
                if (rVarA != null && rVarA.F.size() == 1 && l7.u.m0(((x4.j0) rVarA.F.get(0)).f11240q, file.getAbsolutePath(), true)) {
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

    public final void b() {
        this.f4523e = -1;
        notifyDataSetChanged();
    }

    public final void c(Context context, File file) {
        j5.g gVarL = j5.g.D.l(context);
        gVarL.b();
        Iterator it = this.f4519a.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int i6 = i + 1;
            a3 a3Var = (a3) it.next();
            String str = a3Var.f11049d;
            if (str != null && str.length() != 0) {
                String str2 = a3Var.f11049d;
                str2.getClass();
                q2 q2VarY = gVarL.Y(str2);
                x4.r rVarA = q2VarY != null ? q2VarY.a(context) : null;
                if (rVarA != null && rVarA.F.size() == 1 && l7.u.m0(((x4.j0) rVarA.F.get(0)).f11240q, file.getAbsolutePath(), true)) {
                    this.f4523e = i;
                    break;
                }
            }
            i = i6;
        }
        gVarL.c();
        int i10 = this.f4523e;
        if (i10 >= 0) {
            notifyItemChanged(i10);
        }
    }

    public final void d(boolean z9) {
        this.f4522d = z9;
        if (z9) {
            notifyItemInserted(getItemCount());
        } else {
            notifyItemRemoved(getItemCount());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f4519a.size() + (this.f4522d ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return i == this.f4519a.size() ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0177  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r20, int r21) {
        /*
            Method dump skipped, instruction units count: 635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.e1.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        if (i != 0) {
            if (i != 1) {
                com.google.gson.internal.a.p("viewType unknown");
                return null;
            }
            View viewB = c.j.b(viewGroup, 2131558768, viewGroup, false);
            viewB.getClass();
            return new m5.c0(viewB);
        }
        Context context = this.f4520b;
        View viewInflate = LayoutInflater.from(context).inflate(2131558873, viewGroup, false);
        int i6 = 2131362255;
        if (((HorizontalScrollView) ViewBindings.findChildViewById(viewInflate, 2131362255)) != null) {
            i6 = 2131362319;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, 2131362319);
            if (imageView != null) {
                i6 = 2131362382;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, 2131362382);
                if (imageView2 != null) {
                    i6 = 2131362392;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(viewInflate, 2131362392);
                    if (imageView3 != null) {
                        i6 = 2131362673;
                        if (((LinearLayout) ViewBindings.findChildViewById(viewInflate, 2131362673)) != null) {
                            i6 = 2131362764;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, 2131362764);
                            if (linearLayout != null) {
                                i6 = 2131363020;
                                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(viewInflate, 2131363020);
                                if (progressBar != null) {
                                    i6 = 2131363106;
                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(viewInflate, 2131363106);
                                    if (relativeLayout != null) {
                                        i6 = 2131363135;
                                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(viewInflate, 2131363135);
                                        if (relativeLayout2 != null) {
                                            i6 = 2131363153;
                                            RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(viewInflate, 2131363153);
                                            if (relativeLayout3 != null) {
                                                i6 = 2131363202;
                                                if (((RelativeLayout) ViewBindings.findChildViewById(viewInflate, 2131363202)) != null) {
                                                    i6 = 2131363626;
                                                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, 2131363626);
                                                    if (textView != null) {
                                                        i6 = 2131363752;
                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131363752);
                                                        if (textView2 != null) {
                                                            i6 = 2131364062;
                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131364062);
                                                            if (textView3 != null) {
                                                                i6 = 2131364156;
                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131364156);
                                                                if (textView4 != null) {
                                                                    i6 = 2131364627;
                                                                    View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, 2131364627);
                                                                    if (viewFindChildViewById != null) {
                                                                        return new y1(new t4.g1((RelativeLayout) viewInflate, imageView, imageView2, imageView3, linearLayout, progressBar, relativeLayout, relativeLayout2, relativeLayout3, textView, textView2, textView3, textView4), context, this.f4521c);
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
