package t4;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class o implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f10017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f10018b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RecyclerView f10019l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f10020m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f10021n;

    public o(FrameLayout frameLayout, View view, RecyclerView recyclerView, TextView textView, TextView textView2) {
        this.f10017a = frameLayout;
        this.f10018b = view;
        this.f10019l = recyclerView;
        this.f10020m = textView;
        this.f10021n = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f10017a;
    }
}
