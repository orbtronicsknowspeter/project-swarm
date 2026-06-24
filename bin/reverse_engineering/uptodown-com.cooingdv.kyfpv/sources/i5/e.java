package i5;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.leanback.widget.Presenter;
import com.uptodown.R;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends Presenter.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f5682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f5683b;

    public e(View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.iv_icon);
        viewFindViewById.getClass();
        this.f5682a = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.tv_name);
        viewFindViewById2.getClass();
        TextView textView = (TextView) viewFindViewById2;
        this.f5683b = textView;
        textView.setTypeface(f4.c.f4883w);
    }
}
