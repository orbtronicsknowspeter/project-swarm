package t4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class h0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9841a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RelativeLayout f9842b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageView f9843l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f9844m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f9845n;

    public h0(RelativeLayout relativeLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.f9842b = relativeLayout;
        this.f9843l = imageView;
        this.f9844m = textView;
        this.f9845n = textView2;
    }

    public static h0 a(View view) {
        int i = R.id.iv_preference_item;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_preference_item);
        if (imageView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            int i6 = R.id.tv_preference_item_description;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_preference_item_description);
            if (textView != null) {
                i6 = R.id.tv_preference_item_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_preference_item_title);
                if (textView2 != null) {
                    return new h0(relativeLayout, imageView, textView, textView2);
                }
            }
            i = i6;
        }
        com.google.gson.internal.a.i("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static h0 b(LayoutInflater layoutInflater) {
        return a(layoutInflater.inflate(R.layout.preference_item, (ViewGroup) null, false));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f9841a) {
        }
        return this.f9842b;
    }

    public h0(RelativeLayout relativeLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f9842b = relativeLayout;
        this.f9843l = imageView;
        this.f9844m = textView;
        this.f9845n = textView2;
    }
}
