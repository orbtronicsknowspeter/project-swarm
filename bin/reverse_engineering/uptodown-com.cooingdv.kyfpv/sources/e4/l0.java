package e4;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class l0 extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f4603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.c f4604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w4.d f4605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4606d;

    public l0(ArrayList arrayList, w4.c cVar, w4.d dVar) {
        cVar.getClass();
        dVar.getClass();
        this.f4603a = arrayList;
        this.f4604b = cVar;
        this.f4605c = dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f4603a.size() + (this.f4606d ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return i == this.f4603a.size() ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014b  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r11, int r12) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.l0.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        if (i != 0) {
            if (i != 1) {
                com.google.gson.internal.a.p("viewType unknown");
                return null;
            }
            View viewB = c.j.b(viewGroup, R.layout.pb_loading_more_content, viewGroup, false);
            viewB.getClass();
            return new m5.c0(viewB);
        }
        View viewB2 = c.j.b(viewGroup, R.layout.search_app_info_item, null, false);
        int i6 = R.id.iv_cancel_search_item;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewB2, R.id.iv_cancel_search_item);
        if (imageView != null) {
            i6 = R.id.iv_icon_search_app_item;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewB2, R.id.iv_icon_search_app_item);
            if (imageView2 != null) {
                i6 = R.id.pb_progress_search_app_item;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(viewB2, R.id.pb_progress_search_app_item);
                if (progressBar != null) {
                    i6 = R.id.rl_actions_search_item;
                    if (((RelativeLayout) ViewBindings.findChildViewById(viewB2, R.id.rl_actions_search_item)) != null) {
                        RelativeLayout relativeLayout = (RelativeLayout) viewB2;
                        i6 = R.id.rl_cancel_search_item;
                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(viewB2, R.id.rl_cancel_search_item);
                        if (relativeLayout2 != null) {
                            i6 = R.id.rl_icon_progress_search_app_item;
                            if (((RelativeLayout) ViewBindings.findChildViewById(viewB2, R.id.rl_icon_progress_search_app_item)) != null) {
                                i6 = R.id.tv_action_search_item;
                                TextView textView = (TextView) ViewBindings.findChildViewById(viewB2, R.id.tv_action_search_item);
                                if (textView != null) {
                                    i6 = R.id.tv_desc_search_app_item;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewB2, R.id.tv_desc_search_app_item);
                                    if (textView2 != null) {
                                        i6 = R.id.tv_name_search_app_item;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(viewB2, R.id.tv_name_search_app_item);
                                        if (textView3 != null) {
                                            i6 = R.id.tv_pending_search_item;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(viewB2, R.id.tv_pending_search_item);
                                            if (textView4 != null) {
                                                i6 = R.id.tv_status_search_app_item;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(viewB2, R.id.tv_status_search_app_item);
                                                if (textView5 != null) {
                                                    i6 = R.id.tv_verified_by_uptodown_search_app_item;
                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(viewB2, R.id.tv_verified_by_uptodown_search_app_item);
                                                    if (textView6 != null) {
                                                        return new m5.y0(new t4.v0(relativeLayout, imageView, imageView2, progressBar, relativeLayout2, textView, textView2, textView3, textView4, textView5, textView6), this.f4604b, this.f4605c);
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
        com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewB2.getResources().getResourceName(i6)));
        return null;
    }
}
