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
    public final RelativeLayout f9999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f10000b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RecyclerView f10001l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final SwitchCompat f10002m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Toolbar f10003n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f10004o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f10005p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f10006q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f10007r;

    public m0(RelativeLayout relativeLayout, View view, RecyclerView recyclerView, SwitchCompat switchCompat, Toolbar toolbar, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f9999a = relativeLayout;
        this.f10000b = view;
        this.f10001l = recyclerView;
        this.f10002m = switchCompat;
        this.f10003n = toolbar;
        this.f10004o = textView;
        this.f10005p = textView2;
        this.f10006q = textView3;
        this.f10007r = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f9999a;
    }
}
