package t4;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class x implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f10220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b5.m f10221b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View f10222l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final NestedScrollView f10223m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final RecyclerView f10224n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final SearchView f10225o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Toolbar f10226p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f10227q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f10228r;

    public x(RelativeLayout relativeLayout, b5.m mVar, View view, NestedScrollView nestedScrollView, RecyclerView recyclerView, SearchView searchView, Toolbar toolbar, TextView textView, TextView textView2) {
        this.f10220a = relativeLayout;
        this.f10221b = mVar;
        this.f10222l = view;
        this.f10223m = nestedScrollView;
        this.f10224n = recyclerView;
        this.f10225o = searchView;
        this.f10226p = toolbar;
        this.f10227q = textView;
        this.f10228r = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f10220a;
    }
}
