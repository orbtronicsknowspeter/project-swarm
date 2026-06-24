package t4;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;
import com.uptodown.util.views.UsernameTextView;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class p0 implements ViewBinding {
    public final TextView A;
    public final UsernameTextView B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f10044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f10045b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageView f10046l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ImageView f10047m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ImageView f10048n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ImageView f10049o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ImageView f10050p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ImageView f10051q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ImageView f10052r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ImageView f10053s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinearLayout f10054t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final LinearLayout f10055u;
    public final TextView v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextView f10056w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final TextView f10057x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final TextView f10058y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final TextView f10059z;

    public p0(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8, ImageView imageView9, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, UsernameTextView usernameTextView) {
        this.f10044a = relativeLayout;
        this.f10045b = imageView;
        this.f10046l = imageView2;
        this.f10047m = imageView3;
        this.f10048n = imageView4;
        this.f10049o = imageView5;
        this.f10050p = imageView6;
        this.f10051q = imageView7;
        this.f10052r = imageView8;
        this.f10053s = imageView9;
        this.f10054t = linearLayout;
        this.f10055u = linearLayout2;
        this.v = textView;
        this.f10056w = textView2;
        this.f10057x = textView3;
        this.f10058y = textView4;
        this.f10059z = textView5;
        this.A = textView6;
        this.B = usernameTextView;
    }

    public static p0 a(View view) {
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
                                            if (((ImageView) ViewBindings.findChildViewById(view, R.id.iv_turbo_mark_review)) != null) {
                                                i = R.id.ll_likes_review;
                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_likes_review);
                                                if (linearLayout != null) {
                                                    i = R.id.ll_reviews_counter_review;
                                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_reviews_counter_review);
                                                    if (linearLayout2 != null) {
                                                        i = R.id.ll_stars_review;
                                                        if (((LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_stars_review)) != null) {
                                                            i = R.id.ll_username_review;
                                                            if (((LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_username_review)) != null) {
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
                                                                                            return new p0((RelativeLayout) view, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, linearLayout, linearLayout2, textView, textView2, textView3, textView4, textView5, textView6, usernameTextView);
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
        return this.f10044a;
    }
}
