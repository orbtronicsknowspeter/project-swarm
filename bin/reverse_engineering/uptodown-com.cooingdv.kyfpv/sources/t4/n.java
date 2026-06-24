package t4;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f10009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f10010b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RelativeLayout f10011l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f10012m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ViewPager2 f10013n;

    public n(RelativeLayout relativeLayout, ImageView imageView, RelativeLayout relativeLayout2, TextView textView, ViewPager2 viewPager2) {
        this.f10009a = relativeLayout;
        this.f10010b = imageView;
        this.f10011l = relativeLayout2;
        this.f10012m = textView;
        this.f10013n = viewPager2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f10009a;
    }
}
