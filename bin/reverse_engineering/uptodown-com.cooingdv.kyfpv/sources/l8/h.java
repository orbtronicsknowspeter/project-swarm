package l8;

import java.util.List;
import q6.t;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7198b;

    public h(List list, boolean z9) {
        this.f7197a = z9;
        this.f7198b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f7197a == hVar.f7197a && kotlin.jvm.internal.l.a(this.f7198b, hVar.f7198b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final int hashCode() {
        boolean z9 = this.f7197a;
        ?? r02 = z9;
        if (z9) {
            r02 = 1;
        }
        return this.f7198b.hashCode() + (r02 * 31);
    }

    public final String toString() {
        return "GBCPortalConfig(gbcApplicable=" + this.f7197a + ", applicablePurposes=" + this.f7198b + ')';
    }

    public /* synthetic */ h() {
        this(t.f8725a, false);
    }
}
