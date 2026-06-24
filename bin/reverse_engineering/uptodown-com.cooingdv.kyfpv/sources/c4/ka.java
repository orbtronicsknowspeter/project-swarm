package c4;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;
import com.uptodown.activities.Updates;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ka implements d7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Updates f1799b;

    public /* synthetic */ ka(Updates updates, int i) {
        this.f1798a = i;
        this.f1799b = updates;
    }

    @Override // d7.a
    public final Object invoke() {
        int i = this.f1798a;
        Updates updates = this.f1799b;
        switch (i) {
            case 0:
                int i6 = Updates.n0;
                View viewInflate = updates.getLayoutInflater().inflate(R.layout.updates, (ViewGroup) null, false);
                int i10 = R.id.loading_view_updates;
                View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.loading_view_updates);
                if (viewFindChildViewById != null) {
                    i10 = R.id.pb_update_all;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(viewInflate, R.id.pb_update_all);
                    if (progressBar != null) {
                        i10 = R.id.rl_bottom_box_download_button_updates;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(viewInflate, R.id.rl_bottom_box_download_button_updates);
                        if (relativeLayout != null) {
                            i10 = R.id.rl_bottom_box_shadow;
                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(viewInflate, R.id.rl_bottom_box_shadow);
                            if (relativeLayout2 != null) {
                                i10 = R.id.rl_update_all_progress_bottom;
                                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(viewInflate, R.id.rl_update_all_progress_bottom);
                                if (relativeLayout3 != null) {
                                    i10 = R.id.rv_updates;
                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.rv_updates);
                                    if (recyclerView != null) {
                                        i10 = R.id.srl_updates;
                                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ViewBindings.findChildViewById(viewInflate, R.id.srl_updates);
                                        if (swipeRefreshLayout != null) {
                                            i10 = R.id.toolbar_updates;
                                            Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(viewInflate, R.id.toolbar_updates);
                                            if (toolbar != null) {
                                                i10 = R.id.tv_cancel_update_all;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_cancel_update_all);
                                                if (textView != null) {
                                                    i10 = R.id.tv_description_update_all;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_description_update_all);
                                                    if (textView2 != null) {
                                                        i10 = R.id.tv_install_all_updates;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_install_all_updates);
                                                        if (textView3 != null) {
                                                            i10 = R.id.tv_toolbar_title_updates;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_toolbar_title_updates);
                                                            if (textView4 != null) {
                                                                return new t4.y0((RelativeLayout) viewInflate, viewFindChildViewById, progressBar, relativeLayout, relativeLayout2, relativeLayout3, recyclerView, swipeRefreshLayout, toolbar, textView, textView2, textView3, textView4);
                                                            }
                                                        }
                                                    }
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
                updates.f3359e0 = true;
                updates.Y0();
                return p6.x.f8464a;
        }
    }
}
