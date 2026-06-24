package t4;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f9568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f9569b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Toolbar f9570l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f9571m;

    public a(LinearLayout linearLayout, LinearLayout linearLayout2, Toolbar toolbar, TextView textView) {
        this.f9568a = linearLayout;
        this.f9569b = linearLayout2;
        this.f9570l = toolbar;
        this.f9571m = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f9568a;
    }
}
