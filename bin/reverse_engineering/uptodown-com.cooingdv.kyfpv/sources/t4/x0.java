package t4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class x0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f10229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f10230b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageView f10231l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final View f10232m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final RecyclerView f10233n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Toolbar f10234o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f10235p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f10236q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f10237r;

    public x0(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, View view, RecyclerView recyclerView, Toolbar toolbar, TextView textView, TextView textView2, TextView textView3) {
        this.f10229a = relativeLayout;
        this.f10230b = imageView;
        this.f10231l = imageView2;
        this.f10232m = view;
        this.f10233n = recyclerView;
        this.f10234o = toolbar;
        this.f10235p = textView;
        this.f10236q = textView2;
        this.f10237r = textView3;
    }

    public static x0 a(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.top_by_category_fragment, (ViewGroup) null, false);
        int i = R.id.iv_fav_top_by_cat;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.iv_fav_top_by_cat);
        if (imageView != null) {
            i = R.id.iv_share_top_by_cat;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.iv_share_top_by_cat);
            if (imageView2 != null) {
                i = R.id.loading_view_top_by_cat_fragment;
                View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.loading_view_top_by_cat_fragment);
                if (viewFindChildViewById != null) {
                    i = R.id.recyclerview_top_cat;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recyclerview_top_cat);
                    if (recyclerView != null) {
                        i = R.id.toolbar_top_by_cat;
                        Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(viewInflate, R.id.toolbar_top_by_cat);
                        if (toolbar != null) {
                            i = R.id.tv_no_data_top_cat;
                            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_no_data_top_cat);
                            if (textView != null) {
                                i = R.id.tv_reload_top_by_category_fragment;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_reload_top_by_category_fragment);
                                if (textView2 != null) {
                                    i = R.id.tv_toolbar_title_top_by_cat;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_toolbar_title_top_by_cat);
                                    if (textView3 != null) {
                                        return new x0((RelativeLayout) viewInflate, imageView, imageView2, viewFindChildViewById, recyclerView, toolbar, textView, textView2, textView3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f10229a;
    }
}
