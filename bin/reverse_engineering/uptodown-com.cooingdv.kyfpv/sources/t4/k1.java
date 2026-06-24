package t4;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class k1 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f9949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f9950b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RecyclerView f9951l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Toolbar f9952m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f9953n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f9954o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f9955p;

    public k1(RelativeLayout relativeLayout, View view, RecyclerView recyclerView, Toolbar toolbar, TextView textView, TextView textView2, TextView textView3) {
        this.f9949a = relativeLayout;
        this.f9950b = view;
        this.f9951l = recyclerView;
        this.f9952m = toolbar;
        this.f9953n = textView;
        this.f9954o = textView2;
        this.f9955p = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f9949a;
    }
}
