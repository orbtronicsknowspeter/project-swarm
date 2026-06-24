package i5;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.leanback.widget.Presenter;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends Presenter.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f5683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f5684b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f5685l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ProgressBar f5686m;

    public f(View view) {
        super(view);
        View viewFindViewById = view.findViewById(2131364093);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        this.f5683a = textView;
        View viewFindViewById2 = view.findViewById(2131364301);
        viewFindViewById2.getClass();
        TextView textView2 = (TextView) viewFindViewById2;
        this.f5684b = textView2;
        View viewFindViewById3 = view.findViewById(2131363744);
        viewFindViewById3.getClass();
        TextView textView3 = (TextView) viewFindViewById3;
        this.f5685l = textView3;
        View viewFindViewById4 = view.findViewById(2131363051);
        viewFindViewById4.getClass();
        this.f5686m = (ProgressBar) viewFindViewById4;
        textView.setTypeface(f4.c.f4883x);
        textView2.setTypeface(f4.c.f4883x);
        textView3.setTypeface(f4.c.f4883x);
    }
}
