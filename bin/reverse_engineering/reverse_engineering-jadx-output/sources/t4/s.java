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
    public final RelativeLayout f10103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f10104b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RecyclerView f10105l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Toolbar f10106m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f10107n;

    public s(RelativeLayout relativeLayout, View view, RecyclerView recyclerView, Toolbar toolbar, TextView textView) {
        this.f10103a = relativeLayout;
        this.f10104b = view;
        this.f10105l = recyclerView;
        this.f10106m = toolbar;
        this.f10107n = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f10103a;
    }
}
