package m5;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import com.uptodown.util.views.UsernameTextView;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class q0 extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3.d f7527b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageView f7528l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final UsernameTextView f7529m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ImageView f7530n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f7531o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f7532p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final LinearLayout f7533q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ImageView f7534r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextView f7535s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ImageView f7536t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ImageView f7537u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(a3.d dVar, Context context, View view) {
        super(view);
        context.getClass();
        dVar.getClass();
        this.f7526a = context;
        this.f7527b = dVar;
        View viewFindViewById = view.findViewById(R.id.iv_avatar_review);
        viewFindViewById.getClass();
        this.f7528l = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.tv_username_review);
        viewFindViewById2.getClass();
        UsernameTextView usernameTextView = (UsernameTextView) viewFindViewById2;
        this.f7529m = usernameTextView;
        View viewFindViewById3 = view.findViewById(R.id.iv_author_verified_review);
        viewFindViewById3.getClass();
        this.f7530n = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.tv_date_review);
        viewFindViewById4.getClass();
        TextView textView = (TextView) viewFindViewById4;
        this.f7531o = textView;
        View viewFindViewById5 = view.findViewById(R.id.tv_body_review);
        viewFindViewById5.getClass();
        TextView textView2 = (TextView) viewFindViewById5;
        this.f7532p = textView2;
        View viewFindViewById6 = view.findViewById(R.id.ll_likes_review);
        viewFindViewById6.getClass();
        this.f7533q = (LinearLayout) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.iv_likes_counter_review);
        viewFindViewById7.getClass();
        this.f7534r = (ImageView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.tv_likes_counter_review);
        viewFindViewById8.getClass();
        TextView textView3 = (TextView) viewFindViewById8;
        this.f7535s = textView3;
        View viewFindViewById9 = view.findViewById(R.id.iv_turbo_mark_review);
        viewFindViewById9.getClass();
        ImageView imageView = (ImageView) viewFindViewById9;
        this.f7536t = imageView;
        View viewFindViewById10 = view.findViewById(R.id.iv_follow_user_review);
        viewFindViewById10.getClass();
        this.f7537u = (ImageView) viewFindViewById10;
        usernameTextView.setTypeface(f4.c.f4883w);
        textView.setTypeface(f4.c.f4884x);
        textView2.setTypeface(f4.c.f4884x);
        textView3.setTypeface(f4.c.f4884x);
        imageView.setVisibility(8);
    }
}
