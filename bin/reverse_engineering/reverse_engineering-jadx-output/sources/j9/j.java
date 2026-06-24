package j9;

import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.core.model.Vector;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l9.a f6768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChoiceCmpCallback f6769b;

    public j(l9.a aVar, ChoiceCmpCallback choiceCmpCallback) {
        aVar.getClass();
        this.f6768a = aVar;
        this.f6769b = choiceCmpCallback;
    }

    public final void a() {
        if (l.g.f7044a) {
            Vector vector = l.g.f7045b;
            vector.unsetAllOwnedItems();
            l9.a aVar = this.f6768a;
            Vector vectorK = aVar.k(40);
            if (vectorK != null) {
                vectorK.forEach(new l.e(0, vector));
            }
            aVar.e(40, vector);
            ChoiceCmpCallback choiceCmpCallback = this.f6769b;
            if (choiceCmpCallback == null) {
                return;
            }
            choiceCmpCallback.onGoogleBasicConsentChange(l.g.a());
        }
    }
}
