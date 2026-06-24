package t4;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class s implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f10104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f10105b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RecyclerView f10106l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Toolbar f10107m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f10108n;

    public s(RelativeLayout relativeLayout, View view, RecyclerView recyclerView, Toolbar toolbar, TextView textView) {
        this.f10104a = relativeLayout;
        this.f10105b = view;
        this.f10106l = recyclerView;
        this.f10107m = toolbar;
        this.f10108n = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f10104a;
    }
}
