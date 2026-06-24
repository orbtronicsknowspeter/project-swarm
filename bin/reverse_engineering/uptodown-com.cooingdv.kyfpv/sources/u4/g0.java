package u4;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f10495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f10496b;

    public g0(ArrayList arrayList, ArrayList arrayList2) {
        this.f10495a = arrayList;
        this.f10496b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f10495a.equals(g0Var.f10495a) && this.f10496b.equals(g0Var.f10496b);
    }

    public final int hashCode() {
        return this.f10496b.hashCode() + (this.f10495a.hashCode() * 31);
    }

    public final String toString() {
        return "AppMediaData(appScreenshot=" + this.f10495a + ", appVideos=" + this.f10496b + ")";
    }
}
