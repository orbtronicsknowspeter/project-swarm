package c4;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;
import com.uptodown.activities.PreregistrationActivity;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z6 implements d7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PreregistrationActivity f2397b;

    public /* synthetic */ z6(PreregistrationActivity preregistrationActivity, int i) {
        this.f2396a = i;
        this.f2397b = preregistrationActivity;
    }

    @Override // d7.a
    public final Object invoke() {
        int i = this.f2396a;
        PreregistrationActivity preregistrationActivity = this.f2397b;
        switch (i) {
            case 0:
                int i6 = PreregistrationActivity.T;
                View viewInflate = preregistrationActivity.getLayoutInflater().inflate(R.layout.preregistration_activity, (ViewGroup) null, false);
                int i10 = R.id.fl_top_by_cat_upcoming_releases;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.fl_top_by_cat_upcoming_releases);
                if (frameLayout != null) {
                    i10 = R.id.ll_upcoming_releases;
                    if (((LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.ll_upcoming_releases)) != null) {
                        i10 = R.id.loading_view_upcoming_releases;
                        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.loading_view_upcoming_releases);
                        if (viewFindChildViewById != null) {
                            i10 = R.id.nsv_upcoming_releases;
                            if (((NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.nsv_upcoming_releases)) != null) {
                                i10 = R.id.rv_upcoming_releases;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.rv_upcoming_releases);
                                if (recyclerView != null) {
                                    i10 = R.id.toolbar_upcoming_releases;
                                    Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(viewInflate, R.id.toolbar_upcoming_releases);
                                    if (toolbar != null) {
                                        i10 = R.id.tv_discover_upcoming_releases;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_discover_upcoming_releases);
                                        if (textView != null) {
                                            i10 = R.id.tv_no_items_upcoming_releases;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_no_items_upcoming_releases);
                                            if (textView2 != null) {
                                                i10 = R.id.tv_title_upcoming_releases;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_title_upcoming_releases);
                                                if (textView3 != null) {
                                                    return new t4.j0((RelativeLayout) viewInflate, frameLayout, viewFindChildViewById, recyclerView, toolbar, textView, textView2, textView3);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
                return null;
            default:
                int i11 = PreregistrationActivity.T;
                e7 e7Var = (e7) preregistrationActivity.O.getValue();
                e7Var.getClass();
                o7.a0 viewModelScope = ViewModelKt.getViewModelScope(e7Var);
                v7.e eVar = o7.m0.f8289a;
                o7.c0.s(viewModelScope, v7.d.f10885a, null, new b.f(e7Var, true, preregistrationActivity, (t6.c) null), 2);
                preregistrationActivity.setResult(2);
                return p6.x.f8464a;
        }
    }
}
