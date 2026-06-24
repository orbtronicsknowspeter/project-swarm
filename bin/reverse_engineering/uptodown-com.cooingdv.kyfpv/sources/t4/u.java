package t4;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class u implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f10131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f10132b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g4.u f10133l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r.h f10134m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Toolbar f10135n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f10136o;

    public u(RelativeLayout relativeLayout, View view, g4.u uVar, r.h hVar, Toolbar toolbar, TextView textView) {
        this.f10131a = relativeLayout;
        this.f10132b = view;
        this.f10133l = uVar;
        this.f10134m = hVar;
        this.f10135n = toolbar;
        this.f10136o = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f10131a;
    }
}
