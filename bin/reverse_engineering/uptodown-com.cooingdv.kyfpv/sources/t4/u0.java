package t4;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class u0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f10137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y2.s f10138b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View f10139l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final RecyclerView f10140m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f10141n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f10142o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f10143p;

    public u0(RelativeLayout relativeLayout, y2.s sVar, View view, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3) {
        this.f10137a = relativeLayout;
        this.f10138b = sVar;
        this.f10139l = view;
        this.f10140m = recyclerView;
        this.f10141n = textView;
        this.f10142o = textView2;
        this.f10143p = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f10137a;
    }
}
