package t4;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f9773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f9774b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RecyclerView f9775l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f9776m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f9777n;

    public f(FrameLayout frameLayout, View view, RecyclerView recyclerView, TextView textView, TextView textView2) {
        this.f9773a = frameLayout;
        this.f9774b = view;
        this.f9775l = recyclerView;
        this.f9776m = textView;
        this.f9777n = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f9773a;
    }
}
