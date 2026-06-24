package t4;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class e1 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f9764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f9765b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final NestedScrollView f9766l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final RecyclerView f9767m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Toolbar f9768n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f9769o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f9770p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f9771q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c1 f9772r;

    public e1(RelativeLayout relativeLayout, View view, NestedScrollView nestedScrollView, RecyclerView recyclerView, Toolbar toolbar, TextView textView, TextView textView2, TextView textView3, c1 c1Var) {
        this.f9764a = relativeLayout;
        this.f9765b = view;
        this.f9766l = nestedScrollView;
        this.f9767m = recyclerView;
        this.f9768n = toolbar;
        this.f9769o = textView;
        this.f9770p = textView2;
        this.f9771q = textView3;
        this.f9772r = c1Var;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f9764a;
    }
}
