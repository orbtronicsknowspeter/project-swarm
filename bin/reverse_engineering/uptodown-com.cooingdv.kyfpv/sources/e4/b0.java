package e4;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.google.android.gms.internal.measurement.i5;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.views.FullWidthImageView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a3.d f4490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f4491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f4492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4493d;

    public final void a(boolean z9) {
        this.f4493d = z9;
        if (z9) {
            notifyItemInserted(getItemCount());
        } else {
            notifyItemRemoved(getItemCount());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f4492c.size() + (this.f4493d ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        if (i == this.f4492c.size()) {
            return 6;
        }
        return ((t) this.f4492c.get(i)).f4690b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        viewHolder.getClass();
        if (!(viewHolder instanceof x)) {
            if (viewHolder instanceof a0) {
                ArrayList arrayList = (ArrayList) ((t) this.f4492c.get(i)).a();
                z zVar = ((a0) viewHolder).f4479b;
                zVar.getClass();
                zVar.f4730c = arrayList;
                zVar.notifyDataSetChanged();
                return;
            }
            if (viewHolder instanceof w) {
                ArrayList arrayList2 = (ArrayList) ((t) this.f4492c.get(i)).a();
                v vVar = ((w) viewHolder).f4711b;
                vVar.getClass();
                vVar.f4708c = arrayList2;
                vVar.notifyDataSetChanged();
                return;
            }
            if (viewHolder instanceof m5.g1) {
                ((m5.g1) viewHolder).g((x4.g) ((t) this.f4492c.get(i)).a(), i);
                return;
            } else {
                if (viewHolder instanceof m5.b1) {
                    ((m5.b1) viewHolder).a();
                    return;
                }
                return;
            }
        }
        x xVar = (x) viewHolder;
        x4.g gVar = (x4.g) ((t) this.f4492c.get(i)).a();
        Context context = xVar.f4715m;
        t4.e0 e0Var = xVar.f4713b;
        String strE = gVar.e();
        PackageInfo packageInfoE = null;
        if (strE == null || strE.length() == 0) {
            e0Var.f9752b.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.shape_bg_placeholder));
        } else {
            a4.l0 l0VarE = a4.g0.d().e(gVar.e());
            float f = UptodownApp.I;
            l0VarE.h(b4.d.w(context));
            l0VarE.e(e0Var.f9752b, null);
        }
        View view = xVar.itemView;
        view.getClass();
        m5.e.b(view, xVar.f4714l, gVar);
        TextView textView = e0Var.f9760s;
        ImageView imageView = e0Var.f9753l;
        TextView textView2 = e0Var.f9757p;
        m5.e.f(gVar, textView, textView2);
        e0Var.v.setText(String.valueOf(((double) gVar.f11195y) / 10.0d));
        e0Var.f9759r.setText(context.getString(R.string.downloads_counter_multiple, i5.D(gVar.f11182r)));
        xVar.e(imageView, gVar.i());
        String str = gVar.F;
        if (str != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    packageInfoE = n4.i.e(packageManager, str, 0);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        TextView textView3 = e0Var.f9758q;
        if (packageInfoE != null) {
            textView3.setVisibility(8);
        } else {
            textView3.setOnClickListener(new c.e(25, xVar, gVar));
        }
        xVar.c(gVar, e0Var.f9755n, imageView, textView2, e0Var.f9756o, e0Var.f9761t, e0Var.f9754m);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        a3.d dVar = this.f4490a;
        viewGroup.getClass();
        switch (i) {
            case 1:
                View viewB = c.j.b(viewGroup, R.layout.organization_main_app_card, viewGroup, false);
                int i6 = R.id.iv_top_app_feature_organization;
                FullWidthImageView fullWidthImageView = (FullWidthImageView) ViewBindings.findChildViewById(viewB, R.id.iv_top_app_feature_organization);
                if (fullWidthImageView != null) {
                    i6 = R.id.iv_top_app_logo_organization;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewB, R.id.iv_top_app_logo_organization);
                    if (imageView != null) {
                        i6 = R.id.ll_progress_top_organization;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewB, R.id.ll_progress_top_organization);
                        if (linearLayout != null) {
                            i6 = R.id.ll_top_app_desc_organization;
                            if (((LinearLayout) ViewBindings.findChildViewById(viewB, R.id.ll_top_app_desc_organization)) != null) {
                                i6 = R.id.pb_progress_logo_organization;
                                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(viewB, R.id.pb_progress_logo_organization);
                                if (progressBar != null) {
                                    i6 = R.id.rl_logo_organization;
                                    if (((RelativeLayout) ViewBindings.findChildViewById(viewB, R.id.rl_logo_organization)) != null) {
                                        i6 = R.id.tv_progress_top_organization;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(viewB, R.id.tv_progress_top_organization);
                                        if (textView != null) {
                                            i6 = R.id.tv_top_app_desc_organization;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewB, R.id.tv_top_app_desc_organization);
                                            if (textView2 != null) {
                                                i6 = R.id.tv_top_app_download_organization;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(viewB, R.id.tv_top_app_download_organization);
                                                if (textView3 != null) {
                                                    i6 = R.id.tv_top_app_downloads_counter_organization;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(viewB, R.id.tv_top_app_downloads_counter_organization);
                                                    if (textView4 != null) {
                                                        i6 = R.id.tv_top_app_name_organization;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(viewB, R.id.tv_top_app_name_organization);
                                                        if (textView5 != null) {
                                                            i6 = R.id.tv_top_app_status_organization;
                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(viewB, R.id.tv_top_app_status_organization);
                                                            if (textView6 != null) {
                                                                i6 = R.id.tv_top_app_title_organization;
                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(viewB, R.id.tv_top_app_title_organization);
                                                                if (textView7 != null) {
                                                                    i6 = R.id.tv_top_app_valoration_organization;
                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(viewB, R.id.tv_top_app_valoration_organization);
                                                                    if (textView8 != null) {
                                                                        i6 = R.id.tv_verified_top_organization;
                                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(viewB, R.id.tv_verified_top_organization);
                                                                        if (textView9 != null) {
                                                                            t4.e0 e0Var = new t4.e0((RelativeLayout) viewB, fullWidthImageView, imageView, linearLayout, progressBar, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
                                                                            Context context = viewGroup.getContext();
                                                                            context.getClass();
                                                                            return new x(e0Var, dVar, context);
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
                        }
                    }
                }
                com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewB.getResources().getResourceName(i6)));
                return null;
            case 2:
                View viewB2 = c.j.b(viewGroup, R.layout.organization_top_download_rv, viewGroup, false);
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewB2, R.id.rv_top_downloads_organization);
                if (recyclerView == null) {
                    com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewB2.getResources().getResourceName(R.id.rv_top_downloads_organization)));
                    return null;
                }
                m8.q qVar = new m8.q(13, (LinearLayout) viewB2, recyclerView);
                Context context2 = viewGroup.getContext();
                context2.getClass();
                return new a0(this, qVar, dVar, context2);
            case 3:
                View viewB3 = c.j.b(viewGroup, R.layout.organization_carousel_apps_rv, viewGroup, false);
                int i10 = R.id.rv_most_popular_apps_organization;
                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(viewB3, R.id.rv_most_popular_apps_organization);
                if (recyclerView2 != null) {
                    i10 = R.id.tv_most_popular_apps_organization;
                    TextView textView10 = (TextView) ViewBindings.findChildViewById(viewB3, R.id.tv_most_popular_apps_organization);
                    if (textView10 != null) {
                        b5.m mVar = new b5.m((LinearLayout) viewB3, recyclerView2, textView10, 28);
                        a3.d dVar2 = this.f4490a;
                        Context context3 = viewGroup.getContext();
                        context3.getClass();
                        return new w(this, mVar, dVar2, context3, this.f4491b);
                    }
                }
                com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewB3.getResources().getResourceName(i10)));
                return null;
            case 4:
                View viewB4 = c.j.b(viewGroup, R.layout.title_organization_apps, viewGroup, false);
                viewB4.getClass();
                String string = viewGroup.getContext().getString(R.string.organization_more_apps_title, this.f4491b);
                string.getClass();
                return new m5.b1(viewB4, string);
            case 5:
                View viewB5 = c.j.b(viewGroup, R.layout.app_info_vertical_top_item, viewGroup, false);
                viewB5.getClass();
                return new m5.g1(viewB5, dVar, null, false);
            case 6:
                View viewB6 = c.j.b(viewGroup, R.layout.pb_loading_more_content, viewGroup, false);
                viewB6.getClass();
                return new m5.c0(viewB6);
            default:
                com.google.gson.internal.a.p("viewType unknown");
                return null;
        }
    }
}
