package t4;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c1 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RelativeLayout f9673b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageView f9674l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ImageView f9675m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f9676n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f9677o;

    public /* synthetic */ c1(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, int i) {
        this.f9672a = i;
        this.f9673b = relativeLayout;
        this.f9674l = imageView;
        this.f9675m = imageView2;
        this.f9676n = textView;
        this.f9677o = textView2;
    }

    public static c1 a(View view) {
        int i = R.id.iv_device_user_device_item;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_device_user_device_item);
        if (imageView != null) {
            i = R.id.iv_enter_user_device_item;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_enter_user_device_item);
            if (imageView2 != null) {
                i = R.id.ll_info_user_device_item;
                if (((LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_info_user_device_item)) != null) {
                    i = R.id.tv_last_update_user_device_item;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_last_update_user_device_item);
                    if (textView != null) {
                        i = R.id.tv_name_user_device_item;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_name_user_device_item);
                        if (textView2 != null) {
                            return new c1((RelativeLayout) view, imageView, imageView2, textView, textView2, 1);
                        }
                    }
                }
            }
        }
        com.google.gson.internal.a.i("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f9672a) {
        }
        return this.f9673b;
    }
}
