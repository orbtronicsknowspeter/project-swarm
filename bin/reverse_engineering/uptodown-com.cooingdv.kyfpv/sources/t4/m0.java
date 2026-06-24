package t4;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class m0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f10000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f10001b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RecyclerView f10002l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final SwitchCompat f10003m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Toolbar f10004n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f10005o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f10006p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f10007q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f10008r;

    public m0(RelativeLayout relativeLayout, View view, RecyclerView recyclerView, SwitchCompat switchCompat, Toolbar toolbar, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f10000a = relativeLayout;
        this.f10001b = view;
        this.f10002l = recyclerView;
        this.f10003m = switchCompat;
        this.f10004n = toolbar;
        this.f10005o = textView;
        this.f10006p = textView2;
        this.f10007q = textView3;
        this.f10008r = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f10000a;
    }
}
