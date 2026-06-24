package t4;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class m implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f9994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g4.v f9995b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View f9996l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final RecyclerView f9997m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Toolbar f9998n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f9999o;

    public m(RelativeLayout relativeLayout, g4.v vVar, View view, RecyclerView recyclerView, Toolbar toolbar, TextView textView) {
        this.f9994a = relativeLayout;
        this.f9995b = vVar;
        this.f9996l = view;
        this.f9997m = recyclerView;
        this.f9998n = toolbar;
        this.f9999o = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f9994a;
    }
}
