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
    public final RelativeLayout f10219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b5.m f10220b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View f10221l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final NestedScrollView f10222m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final RecyclerView f10223n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final SearchView f10224o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Toolbar f10225p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f10226q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f10227r;

    public x(RelativeLayout relativeLayout, b5.m mVar, View view, NestedScrollView nestedScrollView, RecyclerView recyclerView, SearchView searchView, Toolbar toolbar, TextView textView, TextView textView2) {
        this.f10219a = relativeLayout;
        this.f10220b = mVar;
        this.f10221l = view;
        this.f10222m = nestedScrollView;
        this.f10223n = recyclerView;
        this.f10224o = searchView;
        this.f10225p = toolbar;
        this.f10226q = textView;
        this.f10227r = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f10219a;
    }
}
