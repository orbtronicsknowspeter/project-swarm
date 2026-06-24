package i5;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.leanback.widget.Presenter;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends Presenter.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f5661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f5662b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f5663l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f5664m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f5665n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f5666o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ProgressBar f5667p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final LinearLayout f5668q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final RelativeLayout f5669r;

    public b(View view) {
        super(view);
        View viewFindViewById = view.findViewById(2131364026);
        viewFindViewById.getClass();
        this.f5661a = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(2131364284);
        viewFindViewById2.getClass();
        this.f5662b = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(2131363783);
        viewFindViewById3.getClass();
        this.f5663l = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(2131364157);
        viewFindViewById4.getClass();
        this.f5664m = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(2131364556);
        viewFindViewById5.getClass();
        this.f5665n = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(2131363669);
        viewFindViewById6.getClass();
        this.f5666o = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(2131362996);
        viewFindViewById7.getClass();
        this.f5667p = (ProgressBar) viewFindViewById7;
        this.f5668q = (LinearLayout) view.findViewById(2131362732);
        View viewFindViewById8 = view.findViewById(2131363141);
        viewFindViewById8.getClass();
        this.f5669r = (RelativeLayout) viewFindViewById8;
    }

    public final void a(int i) {
        TextView textView = this.f5664m;
        ProgressBar progressBar = this.f5667p;
        if (i <= 0) {
            progressBar.setVisibility(8);
            textView.setVisibility(8);
        } else {
            progressBar.setVisibility(0);
            progressBar.setProgress(i);
            textView.setVisibility(0);
            textView.setText(String.format("%s%%", Arrays.copyOf(new Object[]{String.valueOf(i)}, 1)));
        }
    }
}
