package e4;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class l0 extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f4602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.c f4603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w4.d f4604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4605d;

    public l0(ArrayList arrayList, w4.c cVar, w4.d dVar) {
        cVar.getClass();
        dVar.getClass();
        this.f4602a = arrayList;
        this.f4603b = cVar;
        this.f4604c = dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f4602a.size() + (this.f4605d ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return i == this.f4602a.size() ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014b  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r11, int r12) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.l0.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
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
        View viewB2 = c.j.b(viewGroup, 2131558812, null, false);
        int i6 = 2131362317;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewB2, 2131362317);
        if (imageView != null) {
            i6 = 2131362386;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewB2, 2131362386);
            if (imageView2 != null) {
                i6 = 2131363018;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(viewB2, 2131363018);
                if (progressBar != null) {
                    i6 = 2131363104;
                    if (((RelativeLayout) ViewBindings.findChildViewById(viewB2, 2131363104)) != null) {
                        RelativeLayout relativeLayout = (RelativeLayout) viewB2;
                        i6 = 2131363133;
                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(viewB2, 2131363133);
                        if (relativeLayout2 != null) {
                            i6 = 2131363200;
                            if (((RelativeLayout) ViewBindings.findChildViewById(viewB2, 2131363200)) != null) {
                                i6 = 2131363623;
                                TextView textView = (TextView) ViewBindings.findChildViewById(viewB2, 2131363623);
                                if (textView != null) {
                                    i6 = 2131363777;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewB2, 2131363777);
                                    if (textView2 != null) {
                                        i6 = 2131364056;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(viewB2, 2131364056);
                                        if (textView3 != null) {
                                            i6 = 2131364154;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(viewB2, 2131364154);
                                            if (textView4 != null) {
                                                i6 = 2131364340;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(viewB2, 2131364340);
                                                if (textView5 != null) {
                                                    i6 = 2131364547;
                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(viewB2, 2131364547);
                                                    if (textView6 != null) {
                                                        return new m5.y0(new t4.v0(relativeLayout, imageView, imageView2, progressBar, relativeLayout2, textView, textView2, textView3, textView4, textView5, textView6), this.f4603b, this.f4604c);
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
        com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewB2.getResources().getResourceName(i6)));
        return null;
    }
}
