package d3;

import kotlin.jvm.internal.l;
import x7.g;
import y1.i;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f3541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f3542b = null;

    public a(g gVar) {
        this.f3541a = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f3541a.equals(aVar.f3541a) && l.a(this.f3542b, aVar.f3542b);
    }

    public final int hashCode() {
        int iHashCode = this.f3541a.hashCode() * 31;
        i iVar = this.f3542b;
        return iHashCode + (iVar == null ? 0 : iVar.hashCode());
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f3541a + ", subscriber=" + this.f3542b + ')';
    }
}
