package e4;

import android.content.Context;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.util.views.UsernameTextView;
import java.util.ArrayList;
import x4.k2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class j1 extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f4574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b5.m f4575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4576c;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f4574a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        int i6;
        final i1 i1Var = (i1) viewHolder;
        i1Var.getClass();
        Object obj = this.f4574a.get(i);
        obj.getClass();
        k2 k2Var = (k2) obj;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        t4.g gVar = i1Var.f4565b;
        RelativeLayout relativeLayout = gVar.f9802b;
        TextView textView = (TextView) gVar.f9816z;
        UsernameTextView usernameTextView = (UsernameTextView) gVar.f9815y;
        ImageView imageView = gVar.f9803l;
        LinearLayout linearLayout = gVar.f9808q;
        LinearLayout linearLayout2 = (LinearLayout) gVar.f9814x;
        TextView textView2 = gVar.f9809r;
        Context context = i1Var.itemView.getContext();
        context.getClass();
        m5.e.a(layoutParams, context, i, i1Var.f4567m.f4576c);
        relativeLayout.setLayoutParams(layoutParams);
        androidx.lifecycle.l.A(i1Var.itemView, R.drawable.vector_star_on, gVar.f9805n);
        ImageView imageView2 = gVar.f9806o;
        androidx.lifecycle.l.A(i1Var.itemView, R.drawable.vector_star_off, imageView2);
        ImageView imageView3 = gVar.f9807p;
        androidx.lifecycle.l.A(i1Var.itemView, R.drawable.vector_star_off, imageView3);
        ImageView imageView4 = (ImageView) gVar.v;
        androidx.lifecycle.l.A(i1Var.itemView, R.drawable.vector_star_off, imageView4);
        ImageView imageView5 = (ImageView) gVar.f9813w;
        androidx.lifecycle.l.A(i1Var.itemView, R.drawable.vector_star_off, imageView5);
        if (k2Var.f11265p >= 2) {
            View view = i1Var.itemView;
            i6 = R.drawable.vector_star_on;
            androidx.lifecycle.l.A(view, R.drawable.vector_star_on, imageView2);
        } else {
            i6 = R.drawable.vector_star_on;
        }
        if (k2Var.f11265p >= 3) {
            androidx.lifecycle.l.A(i1Var.itemView, i6, imageView3);
        }
        if (k2Var.f11265p >= 4) {
            androidx.lifecycle.l.A(i1Var.itemView, i6, imageView4);
        }
        if (k2Var.f11265p == 5) {
            androidx.lifecycle.l.A(i1Var.itemView, i6, imageView5);
        }
        String str = k2Var.f11262m;
        if (str == null || str.length() == 0) {
            a4.l0 l0VarF = a4.g0.d().f();
            float f = UptodownApp.I;
            Context context2 = i1Var.itemView.getContext();
            context2.getClass();
            l0VarF.h(b4.d.y(context2));
            l0VarF.e(imageView, null);
        } else {
            a4.g0 g0VarD = a4.g0.d();
            String str2 = k2Var.f11262m;
            a4.l0 l0VarE = g0VarD.e(str2 != null ? a4.x.k(str2, UptodownApp.K, ":webp") : null);
            float f10 = UptodownApp.I;
            Context context3 = i1Var.itemView.getContext();
            context3.getClass();
            l0VarE.h(b4.d.x(context3));
            Context context4 = i1Var.itemView.getContext();
            context4.getClass();
            l0VarE.g(b4.d.f(context4));
            l0VarE.e(imageView, null);
        }
        String str3 = k2Var.f11270u;
        if (str3 != null && str3.length() != 0) {
            usernameTextView.setText(k2Var.f11270u);
        }
        final int i10 = 0;
        usernameTextView.setOnClickListener(new View.OnClickListener() { // from class: e4.g1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        i1Var.f4566l.g(i);
                        break;
                    case 1:
                        i1Var.f4566l.g(i);
                        break;
                    default:
                        i1Var.f4566l.q(i);
                        break;
                }
            }
        });
        final int i11 = 1;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: e4.g1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        i1Var.f4566l.g(i);
                        break;
                    case 1:
                        i1Var.f4566l.g(i);
                        break;
                    default:
                        i1Var.f4566l.q(i);
                        break;
                }
            }
        });
        boolean zContains = j5.t.f6710b.contains(Long.valueOf(k2Var.f11259a));
        ImageView imageView6 = gVar.f9804m;
        View view2 = i1Var.itemView;
        if (zContains) {
            androidx.lifecycle.l.A(view2, R.drawable.vector_heart_red, imageView6);
        } else {
            androidx.lifecycle.l.A(view2, R.drawable.vector_heart, imageView6);
        }
        String str4 = k2Var.f11267r;
        if (str4 != null) {
            gVar.f9810s.setText(str4);
        }
        Spanned spannedA = k2Var.a();
        if (spannedA == null || spannedA.length() == 0) {
            textView.setVisibility(8);
            textView2.setVisibility(4);
            linearLayout2.setVisibility(4);
            linearLayout.setVisibility(4);
            return;
        }
        Spanned spannedA2 = k2Var.a();
        textView2.setText(spannedA2 != null ? l7.m.K0(spannedA2) : null);
        textView2.setVisibility(0);
        textView2.getViewTreeObserver().addOnPreDrawListener(new h1(i1Var, 0));
        final int i12 = 2;
        textView.setOnClickListener(new View.OnClickListener() { // from class: e4.g1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view22) {
                switch (i12) {
                    case 0:
                        i1Var.f4566l.g(i);
                        break;
                    case 1:
                        i1Var.f4566l.g(i);
                        break;
                    default:
                        i1Var.f4566l.q(i);
                        break;
                }
            }
        });
        linearLayout2.setTag(Integer.valueOf(i));
        linearLayout2.setOnClickListener(new c4.d(i1Var, 16));
        int i13 = k2Var.f11266q;
        TextView textView3 = gVar.f9812u;
        if (i13 > 0) {
            textView3.setText(String.valueOf(i13));
        } else {
            textView3.setText(i1Var.itemView.getContext().getString(R.string.reply));
        }
        gVar.f9811t.setText(String.valueOf(k2Var.f11268s));
        linearLayout.setTag(Integer.valueOf(i));
        linearLayout.setOnClickListener(new c.e(27, i1Var, k2Var));
        linearLayout2.setVisibility(0);
        linearLayout.setVisibility(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewS = androidx.lifecycle.l.s(viewGroup, R.layout.review_mini, null, false);
        int i6 = R.id.iv_avatar_review;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewS, R.id.iv_avatar_review);
        if (imageView != null) {
            i6 = R.id.iv_likes_counter_review;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewS, R.id.iv_likes_counter_review);
            if (imageView2 != null) {
                i6 = R.id.iv_star1_review;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(viewS, R.id.iv_star1_review);
                if (imageView3 != null) {
                    i6 = R.id.iv_star2_review;
                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(viewS, R.id.iv_star2_review);
                    if (imageView4 != null) {
                        i6 = R.id.iv_star3_review;
                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(viewS, R.id.iv_star3_review);
                        if (imageView5 != null) {
                            i6 = R.id.iv_star4_review;
                            ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(viewS, R.id.iv_star4_review);
                            if (imageView6 != null) {
                                i6 = R.id.iv_star5_review;
                                ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(viewS, R.id.iv_star5_review);
                                if (imageView7 != null) {
                                    i6 = R.id.ll_likes_review;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewS, R.id.ll_likes_review);
                                    if (linearLayout != null) {
                                        i6 = R.id.ll_reviews_counter_review;
                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(viewS, R.id.ll_reviews_counter_review);
                                        if (linearLayout2 != null) {
                                            i6 = R.id.ll_stars_review;
                                            if (((LinearLayout) ViewBindings.findChildViewById(viewS, R.id.ll_stars_review)) != null) {
                                                i6 = R.id.tv_app_name_review;
                                                UsernameTextView usernameTextView = (UsernameTextView) ViewBindings.findChildViewById(viewS, R.id.tv_app_name_review);
                                                if (usernameTextView != null) {
                                                    i6 = R.id.tv_body_review;
                                                    TextView textView = (TextView) ViewBindings.findChildViewById(viewS, R.id.tv_body_review);
                                                    if (textView != null) {
                                                        i6 = R.id.tv_date_review;
                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewS, R.id.tv_date_review);
                                                        if (textView2 != null) {
                                                            i6 = R.id.tv_likes_counter_review;
                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(viewS, R.id.tv_likes_counter_review);
                                                            if (textView3 != null) {
                                                                i6 = R.id.tv_replies_counter_review;
                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(viewS, R.id.tv_replies_counter_review);
                                                                if (textView4 != null) {
                                                                    i6 = R.id.tv_show_more_review;
                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(viewS, R.id.tv_show_more_review);
                                                                    if (textView5 != null) {
                                                                        return new i1(this, new t4.g((RelativeLayout) viewS, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, linearLayout, linearLayout2, usernameTextView, textView, textView2, textView3, textView4, textView5), this.f4575b);
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
        }
        com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewS.getResources().getResourceName(i6)));
        return null;
    }
}
