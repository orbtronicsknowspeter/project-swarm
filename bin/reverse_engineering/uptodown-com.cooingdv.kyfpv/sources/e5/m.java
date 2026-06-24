package e5;

import android.content.Context;
import androidx.leanback.widget.ImageCardView;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends ImageCardView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f4746a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, Context context) {
        super(context);
        this.f4746a = nVar;
    }

    @Override // androidx.leanback.widget.BaseCardView, android.view.View
    public void setSelected(boolean z9) {
        this.f4746a.a(this, z9);
        super.setSelected(z9);
    }
}
