package t4;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f9678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f9679b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View f9680l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final RecyclerView f9681m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Toolbar f9682n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f9683o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f9684p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f9685q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f9686r;

    public d(RelativeLayout relativeLayout, ImageView imageView, View view, RecyclerView recyclerView, Toolbar toolbar, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f9678a = relativeLayout;
        this.f9679b = imageView;
        this.f9680l = view;
        this.f9681m = recyclerView;
        this.f9682n = toolbar;
        this.f9683o = textView;
        this.f9684p = textView2;
        this.f9685q = textView3;
        this.f9686r = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f9678a;
    }
}
