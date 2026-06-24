package p9;

import android.app.Dialog;
import android.content.Context;
import com.uptodown.R;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f8533a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, k kVar) {
        super(context, R.style.CmpActivityTheme);
        this.f8533a = kVar;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f8533a.a();
    }
}
