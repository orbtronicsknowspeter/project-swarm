package g5;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.uptodown.UptodownApp;
import com.uptodown.tv.ui.fragment.TvAppDetailFragment;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5299a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x4.r f5300b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TvAppDetailFragment f5301l;

    public /* synthetic */ c(TvAppDetailFragment tvAppDetailFragment, x4.r rVar) {
        this.f5301l = tvAppDetailFragment;
        this.f5300b = rVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i6 = this.f5299a;
        TvAppDetailFragment tvAppDetailFragment = this.f5301l;
        x4.r rVar = this.f5300b;
        switch (i6) {
            case 0:
                dialogInterface.getClass();
                tvAppDetailFragment.i(rVar);
                dialogInterface.dismiss();
                break;
            default:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                File fileG = rVar.g();
                if (fileG != null) {
                    float f = UptodownApp.I;
                    FragmentActivity fragmentActivityRequireActivity = tvAppDetailFragment.requireActivity();
                    fragmentActivityRequireActivity.getClass();
                    b4.d.r(fragmentActivityRequireActivity, fileG);
                }
                break;
        }
    }

    public /* synthetic */ c(x4.r rVar, TvAppDetailFragment tvAppDetailFragment) {
        this.f5300b = rVar;
        this.f5301l = tvAppDetailFragment;
    }
}
