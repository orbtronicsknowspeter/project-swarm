package t4;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class p implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f10038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f10039b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View f10040l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final RecyclerView f10041m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f10042n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f10043o;

    public p(FrameLayout frameLayout, LinearLayout linearLayout, View view, RecyclerView recyclerView, TextView textView, TextView textView2) {
        this.f10038a = frameLayout;
        this.f10039b = linearLayout;
        this.f10040l = view;
        this.f10041m = recyclerView;
        this.f10042n = textView;
        this.f10043o = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f10038a;
    }
}
