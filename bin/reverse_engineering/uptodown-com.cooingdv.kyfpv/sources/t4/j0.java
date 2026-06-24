package t4;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class j0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f9903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f9904b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View f9905l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final RecyclerView f9906m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Toolbar f9907n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f9908o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f9909p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f9910q;

    public j0(RelativeLayout relativeLayout, FrameLayout frameLayout, View view, RecyclerView recyclerView, Toolbar toolbar, TextView textView, TextView textView2, TextView textView3) {
        this.f9903a = relativeLayout;
        this.f9904b = frameLayout;
        this.f9905l = view;
        this.f9906m = recyclerView;
        this.f9907n = toolbar;
        this.f9908o = textView;
        this.f9909p = textView2;
        this.f9910q = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f9903a;
    }
}
