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
public final class y implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f10238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f10239b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g4.v f10240l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final NestedScrollView f10241m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final RecyclerView f10242n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final SearchView f10243o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Toolbar f10244p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f10245q;

    public y(RelativeLayout relativeLayout, View view, g4.v vVar, NestedScrollView nestedScrollView, RecyclerView recyclerView, SearchView searchView, Toolbar toolbar, TextView textView) {
        this.f10238a = relativeLayout;
        this.f10239b = view;
        this.f10240l = vVar;
        this.f10241m = nestedScrollView;
        this.f10242n = recyclerView;
        this.f10243o = searchView;
        this.f10244p = toolbar;
        this.f10245q = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f10238a;
    }
}
