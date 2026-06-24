package t4;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f9668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f9669b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RecyclerView f9670l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f9671m;

    public c0(RelativeLayout relativeLayout, View view, RecyclerView recyclerView, TextView textView) {
        this.f9668a = relativeLayout;
        this.f9669b = view;
        this.f9670l = recyclerView;
        this.f9671m = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f9668a;
    }
}
