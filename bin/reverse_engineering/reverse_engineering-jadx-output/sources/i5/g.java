package i5;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.leanback.widget.Presenter;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends Presenter.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f5687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f5688b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f5689l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f5690m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f5691n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ProgressBar f5692o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f5693p;

    public g(View view) {
        super(view);
        View viewFindViewById = view.findViewById(2131363274);
        viewFindViewById.getClass();
        this.f5687a = (RelativeLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(2131362394);
        viewFindViewById2.getClass();
        this.f5688b = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(2131364063);
        viewFindViewById3.getClass();
        TextView textView = (TextView) viewFindViewById3;
        this.f5689l = textView;
        View viewFindViewById4 = view.findViewById(2131364316);
        viewFindViewById4.getClass();
        TextView textView2 = (TextView) viewFindViewById4;
        this.f5690m = textView2;
        View viewFindViewById5 = view.findViewById(2131364556);
        viewFindViewById5.getClass();
        TextView textView3 = (TextView) viewFindViewById5;
        this.f5691n = textView3;
        View viewFindViewById6 = view.findViewById(2131363052);
        viewFindViewById6.getClass();
        this.f5692o = (ProgressBar) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(2131363622);
        viewFindViewById7.getClass();
        TextView textView4 = (TextView) viewFindViewById7;
        this.f5693p = textView4;
        textView.setTypeface(f4.c.f4883x);
        textView2.setTypeface(f4.c.f4883x);
        textView3.setTypeface(f4.c.f4883x);
        textView4.setTypeface(f4.c.f4883x);
    }
}
