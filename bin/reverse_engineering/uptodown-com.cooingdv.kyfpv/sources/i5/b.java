package i5;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.leanback.widget.Presenter;
import com.uptodown.R;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends Presenter.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f5662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f5663b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f5664l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f5665m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f5666n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f5667o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ProgressBar f5668p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final LinearLayout f5669q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final RelativeLayout f5670r;

    public b(View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.tv_name);
        viewFindViewById.getClass();
        this.f5662a = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.tv_short_desc);
        viewFindViewById2.getClass();
        this.f5663b = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.tv_description);
        viewFindViewById3.getClass();
        this.f5664l = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.tv_percent);
        viewFindViewById4.getClass();
        this.f5665m = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.tv_version);
        viewFindViewById5.getClass();
        this.f5666n = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.tv_autor);
        viewFindViewById6.getClass();
        this.f5667o = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.pb_download);
        viewFindViewById7.getClass();
        this.f5668p = (ProgressBar) viewFindViewById7;
        this.f5669q = (LinearLayout) view.findViewById(R.id.ll_screenshots);
        View viewFindViewById8 = view.findViewById(R.id.rl_contaier_valoration_tv_app_detail);
        viewFindViewById8.getClass();
        this.f5670r = (RelativeLayout) viewFindViewById8;
    }

    public final void a(int i) {
        TextView textView = this.f5665m;
        ProgressBar progressBar = this.f5668p;
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
