package t4;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;
import com.uptodown.util.views.UsernameTextView;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class q0 implements ViewBinding {
    public final TextView A;
    public final TextView B;
    public final UsernameTextView C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f10063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f10064b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageView f10065l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ImageView f10066m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ImageView f10067n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ImageView f10068o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ImageView f10069p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ImageView f10070q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ImageView f10071r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ImageView f10072s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ImageView f10073t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final LinearLayout f10074u;
    public final LinearLayout v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextView f10075w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final TextView f10076x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final TextView f10077y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final TextView f10078z;

    public q0(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8, ImageView imageView9, ImageView imageView10, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, UsernameTextView usernameTextView) {
        this.f10063a = relativeLayout;
        this.f10064b = imageView;
        this.f10065l = imageView2;
        this.f10066m = imageView3;
        this.f10067n = imageView4;
        this.f10068o = imageView5;
        this.f10069p = imageView6;
        this.f10070q = imageView7;
        this.f10071r = imageView8;
        this.f10072s = imageView9;
        this.f10073t = imageView10;
        this.f10074u = linearLayout;
        this.v = linearLayout2;
        this.f10075w = textView;
        this.f10076x = textView2;
        this.f10077y = textView3;
        this.f10078z = textView4;
        this.A = textView5;
        this.B = textView6;
        this.C = usernameTextView;
    }

    public static q0 a(View view) {
        int i = R.id.iv_author_verified_review;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_author_verified_review);
        if (imageView != null) {
            i = R.id.iv_avatar_review;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_avatar_review);
            if (imageView2 != null) {
                i = R.id.iv_follow_user_review;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_follow_user_review);
                if (imageView3 != null) {
                    i = R.id.iv_likes_counter_review;
                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_likes_counter_review);
                    if (imageView4 != null) {
                        i = R.id.iv_star1_review;
                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_star1_review);
                        if (imageView5 != null) {
                            i = R.id.iv_star2_review;
                            ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_star2_review);
                            if (imageView6 != null) {
                                i = R.id.iv_star3_review;
                                ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_star3_review);
                                if (imageView7 != null) {
                                    i = R.id.iv_star4_review;
                                    ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_star4_review);
                                    if (imageView8 != null) {
                                        i = R.id.iv_star5_review;
                                        ImageView imageView9 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_star5_review);
                                        if (imageView9 != null) {
                                            i = R.id.iv_turbo_mark_review;
                                            ImageView imageView10 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_turbo_mark_review);
                                            if (imageView10 != null) {
                                                i = R.id.ll_likes_review;
                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_likes_review);
                                                if (linearLayout != null) {
                                                    i = R.id.ll_reviews_counter_review;
                                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_reviews_counter_review);
                                                    if (linearLayout2 != null) {
                                                        i = R.id.ll_stars_review;
                                                        if (((LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_stars_review)) != null) {
                                                            i = R.id.ll_user_marks_review;
                                                            if (((LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_user_marks_review)) != null) {
                                                                i = R.id.ll_username_review;
                                                                if (((ConstraintLayout) ViewBindings.findChildViewById(view, R.id.ll_username_review)) != null) {
                                                                    i = R.id.tv_body_review;
                                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_body_review);
                                                                    if (textView != null) {
                                                                        i = R.id.tv_date_review;
                                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_date_review);
                                                                        if (textView2 != null) {
                                                                            i = R.id.tv_likes_counter_review;
                                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_likes_counter_review);
                                                                            if (textView3 != null) {
                                                                                i = R.id.tv_reply_review;
                                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_reply_review);
                                                                                if (textView4 != null) {
                                                                                    i = R.id.tv_reviews_counter_review;
                                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_reviews_counter_review);
                                                                                    if (textView5 != null) {
                                                                                        i = R.id.tv_show_more_review;
                                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_show_more_review);
                                                                                        if (textView6 != null) {
                                                                                            i = R.id.tv_username_review;
                                                                                            UsernameTextView usernameTextView = (UsernameTextView) ViewBindings.findChildViewById(view, R.id.tv_username_review);
                                                                                            if (usernameTextView != null) {
                                                                                                i = R.id.v_marks_review;
                                                                                                if (ViewBindings.findChildViewById(view, R.id.v_marks_review) != null) {
                                                                                                    return new q0((RelativeLayout) view, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10, linearLayout, linearLayout2, textView, textView2, textView3, textView4, textView5, textView6, usernameTextView);
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
                                }
                            }
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
        return this.f10063a;
    }
}
