package k7;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f6986a;

    public a(f fVar) {
        this.f6986a = new AtomicReference(fVar);
    }

    @Override // k7.f
    public final Iterator iterator() {
        f fVar = (f) this.f6986a.getAndSet(null);
        if (fVar != null) {
            return fVar.iterator();
        }
        androidx.privacysandbox.ads.adservices.customaudience.a.i("This sequence can be consumed only once.");
        return null;
    }
}
