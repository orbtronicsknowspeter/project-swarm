package t4;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class t implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f10117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f10118b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e2.d f10119l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e2.d f10120m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e2.d f10121n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final View f10122o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Toolbar f10123p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f10124q;

    public t(RelativeLayout relativeLayout, LinearLayout linearLayout, e2.d dVar, e2.d dVar2, e2.d dVar3, View view, Toolbar toolbar, TextView textView) {
        this.f10117a = relativeLayout;
        this.f10118b = linearLayout;
        this.f10119l = dVar;
        this.f10120m = dVar2;
        this.f10121n = dVar3;
        this.f10122o = view;
        this.f10123p = toolbar;
        this.f10124q = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f10117a;
    }
}
