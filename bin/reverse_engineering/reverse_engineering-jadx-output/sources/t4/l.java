package t4;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f9955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f9956b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RecyclerView f9957l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Toolbar f9958m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f9959n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f9960o;

    public l(RelativeLayout relativeLayout, View view, RecyclerView recyclerView, Toolbar toolbar, TextView textView, TextView textView2) {
        this.f9955a = relativeLayout;
        this.f9956b = view;
        this.f9957l = recyclerView;
        this.f9958m = toolbar;
        this.f9959n = textView;
        this.f9960o = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f9955a;
    }
}
