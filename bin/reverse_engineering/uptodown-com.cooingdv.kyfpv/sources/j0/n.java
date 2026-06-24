package j0;

import java.util.Arrays;
import k0.y;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f6518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0.d f6519b;

    public /* synthetic */ n(a aVar, h0.d dVar) {
        this.f6518a = aVar;
        this.f6519b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return y.j(this.f6518a, nVar.f6518a) && y.j(this.f6519b, nVar.f6519b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6518a, this.f6519b});
    }

    public final String toString() {
        android.support.v4.media.g gVar = new android.support.v4.media.g(this);
        gVar.p(this.f6518a, "key");
        gVar.p(this.f6519b, "feature");
        return gVar.toString();
    }
}
