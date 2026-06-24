package t4;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class s0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f10109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f10110b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RecyclerView f10111l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Toolbar f10112m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f10113n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f10114o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f10115p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f10116q;

    public s0(RelativeLayout relativeLayout, View view, RecyclerView recyclerView, Toolbar toolbar, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f10109a = relativeLayout;
        this.f10110b = view;
        this.f10111l = recyclerView;
        this.f10112m = toolbar;
        this.f10113n = textView;
        this.f10114o = textView2;
        this.f10115p = textView3;
        this.f10116q = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f10109a;
    }
}
