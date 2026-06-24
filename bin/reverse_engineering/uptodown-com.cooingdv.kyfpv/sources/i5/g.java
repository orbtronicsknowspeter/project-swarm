package i5;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.leanback.widget.Presenter;
import com.uptodown.R;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends Presenter.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f5688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f5689b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f5690l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f5691m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f5692n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ProgressBar f5693o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f5694p;

    public g(View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.rl_tv_old_version_item);
        viewFindViewById.getClass();
        this.f5688a = (RelativeLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.iv_icono_version);
        viewFindViewById2.getClass();
        this.f5689b = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.tv_name_version);
        viewFindViewById3.getClass();
        TextView textView = (TextView) viewFindViewById3;
        this.f5690l = textView;
        View viewFindViewById4 = view.findViewById(R.id.tv_size_version);
        viewFindViewById4.getClass();
        TextView textView2 = (TextView) viewFindViewById4;
        this.f5691m = textView2;
        View viewFindViewById5 = view.findViewById(R.id.tv_version);
        viewFindViewById5.getClass();
        TextView textView3 = (TextView) viewFindViewById5;
        this.f5692n = textView3;
        View viewFindViewById6 = view.findViewById(R.id.progressbar_downloading_version);
        viewFindViewById6.getClass();
        this.f5693o = (ProgressBar) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.tv_action_old_version_item);
        viewFindViewById7.getClass();
        TextView textView4 = (TextView) viewFindViewById7;
        this.f5694p = textView4;
        textView.setTypeface(f4.c.f4884x);
        textView2.setTypeface(f4.c.f4884x);
        textView3.setTypeface(f4.c.f4884x);
        textView4.setTypeface(f4.c.f4884x);
    }
}
