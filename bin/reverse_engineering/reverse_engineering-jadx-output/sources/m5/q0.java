package m5;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.util.views.UsernameTextView;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class q0 extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3.d f7526b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageView f7527l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final UsernameTextView f7528m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ImageView f7529n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f7530o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f7531p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final LinearLayout f7532q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ImageView f7533r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextView f7534s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ImageView f7535t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ImageView f7536u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(a3.d dVar, Context context, View view) {
        super(view);
        context.getClass();
        dVar.getClass();
        this.f7525a = context;
        this.f7526b = dVar;
        View viewFindViewById = view.findViewById(2131362304);
        viewFindViewById.getClass();
        this.f7527l = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(2131364527);
        viewFindViewById2.getClass();
        UsernameTextView usernameTextView = (UsernameTextView) viewFindViewById2;
        this.f7528m = usernameTextView;
        View viewFindViewById3 = view.findViewById(2131362299);
        viewFindViewById3.getClass();
        this.f7529n = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(2131363751);
        viewFindViewById4.getClass();
        TextView textView = (TextView) viewFindViewById4;
        this.f7530o = textView;
        View viewFindViewById5 = view.findViewById(2131363682);
        viewFindViewById5.getClass();
        TextView textView2 = (TextView) viewFindViewById5;
        this.f7531p = textView2;
        View viewFindViewById6 = view.findViewById(2131362678);
        viewFindViewById6.getClass();
        this.f7532q = (LinearLayout) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(2131362404);
        viewFindViewById7.getClass();
        this.f7533r = (ImageView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(2131363960);
        viewFindViewById8.getClass();
        TextView textView3 = (TextView) viewFindViewById8;
        this.f7534s = textView3;
        View viewFindViewById9 = view.findViewById(2131362528);
        viewFindViewById9.getClass();
        ImageView imageView = (ImageView) viewFindViewById9;
        this.f7535t = imageView;
        View viewFindViewById10 = view.findViewById(2131362363);
        viewFindViewById10.getClass();
        this.f7536u = (ImageView) viewFindViewById10;
        usernameTextView.setTypeface(f4.c.f4882w);
        textView.setTypeface(f4.c.f4883x);
        textView2.setTypeface(f4.c.f4883x);
        textView3.setTypeface(f4.c.f4883x);
        imageView.setVisibility(8);
    }
}
