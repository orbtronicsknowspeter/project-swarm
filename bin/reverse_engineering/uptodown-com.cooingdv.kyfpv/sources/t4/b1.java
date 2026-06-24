package t4;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b1 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f9646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f9647b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RecyclerView f9648l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Toolbar f9649m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f9650n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f9651o;

    public b1(RelativeLayout relativeLayout, View view, RecyclerView recyclerView, Toolbar toolbar, TextView textView, TextView textView2) {
        this.f9646a = relativeLayout;
        this.f9647b = view;
        this.f9648l = recyclerView;
        this.f9649m = toolbar;
        this.f9650n = textView;
        this.f9651o = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f9646a;
    }
}
