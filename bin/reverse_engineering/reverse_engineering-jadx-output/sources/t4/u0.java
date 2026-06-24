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
    public final RelativeLayout f10136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y2.s f10137b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View f10138l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final RecyclerView f10139m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f10140n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f10141o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f10142p;

    public u0(RelativeLayout relativeLayout, y2.s sVar, View view, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3) {
        this.f10136a = relativeLayout;
        this.f10137b = sVar;
        this.f10138l = view;
        this.f10139m = recyclerView;
        this.f10140n = textView;
        this.f10141o = textView2;
        this.f10142p = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f10136a;
    }
}
