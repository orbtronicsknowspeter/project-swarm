package i5;

import android.view.View;
import android.widget.ImageView;
import androidx.leanback.widget.Presenter;
import com.uptodown.R;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends Presenter.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f5695a;

    public h(View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.iv_feature_program_day);
        viewFindViewById.getClass();
        this.f5695a = (ImageView) viewFindViewById;
    }
}
