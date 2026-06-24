package i5;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.leanback.widget.Presenter;
import com.uptodown.R;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends Presenter.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f5684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f5685b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f5686l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ProgressBar f5687m;

    public f(View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.tv_nombre_app);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        this.f5684a = textView;
        View viewFindViewById2 = view.findViewById(R.id.tv_size_download);
        viewFindViewById2.getClass();
        TextView textView2 = (TextView) viewFindViewById2;
        this.f5685b = textView2;
        View viewFindViewById3 = view.findViewById(R.id.tv_date_download);
        viewFindViewById3.getClass();
        TextView textView3 = (TextView) viewFindViewById3;
        this.f5686l = textView3;
        View viewFindViewById4 = view.findViewById(R.id.progressbar_downloading);
        viewFindViewById4.getClass();
        this.f5687m = (ProgressBar) viewFindViewById4;
        textView.setTypeface(f4.c.f4884x);
        textView2.setTypeface(f4.c.f4884x);
        textView3.setTypeface(f4.c.f4884x);
    }
}
