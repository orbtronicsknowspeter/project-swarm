package t4;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class w0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f10210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f10211b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LinearLayout f10212l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final RecyclerView f10213m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Toolbar f10214n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f10215o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f10216p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f10217q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f10218r;

    public w0(RelativeLayout relativeLayout, View view, LinearLayout linearLayout, RecyclerView recyclerView, Toolbar toolbar, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f10210a = relativeLayout;
        this.f10211b = view;
        this.f10212l = linearLayout;
        this.f10213m = recyclerView;
        this.f10214n = toolbar;
        this.f10215o = textView;
        this.f10216p = textView2;
        this.f10217q = textView3;
        this.f10218r = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f10210a;
    }
}
