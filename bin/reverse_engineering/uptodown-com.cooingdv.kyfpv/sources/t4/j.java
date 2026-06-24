package t4;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f9897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f9898b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RecyclerView f9899l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Toolbar f9900m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f9901n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f9902o;

    public j(RelativeLayout relativeLayout, View view, RecyclerView recyclerView, Toolbar toolbar, TextView textView, TextView textView2) {
        this.f9897a = relativeLayout;
        this.f9898b = view;
        this.f9899l = recyclerView;
        this.f9900m = toolbar;
        this.f9901n = textView;
        this.f9902o = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f9897a;
    }
}
