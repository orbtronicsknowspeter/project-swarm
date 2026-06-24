package c4;

import android.graphics.Bitmap;
import android.widget.ProgressBar;
import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p1 f1934a;

    public o1(p1 p1Var) {
        this.f1934a = p1Var;
    }

    public final void a(Bitmap bitmap, int i) {
        bitmap.getClass();
        if (i == 0) {
            throw null;
        }
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCopy = bitmap.copy(config, true);
        p1 p1Var = this.f1934a;
        ((SubsamplingScaleImageView) p1Var.f1976a.f1062l).setImage(ImageSource.bitmap(bitmapCopy));
        ((ProgressBar) p1Var.f1976a.f1063m).setVisibility(8);
    }
}
