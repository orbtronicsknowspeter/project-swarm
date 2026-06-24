package u4;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f10500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f10501b;

    public h0(ArrayList arrayList, ArrayList arrayList2) {
        this.f10500a = arrayList;
        this.f10501b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return kotlin.jvm.internal.l.a(this.f10500a, h0Var.f10500a) && kotlin.jvm.internal.l.a(this.f10501b, h0Var.f10501b);
    }

    public final int hashCode() {
        ArrayList arrayList = this.f10500a;
        int iHashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        ArrayList arrayList2 = this.f10501b;
        return iHashCode + (arrayList2 != null ? arrayList2.hashCode() : 0);
    }

    public final String toString() {
        return "AppRelatedCategoriesData(appTopByCategories=" + this.f10500a + ", appCategories=" + this.f10501b + ")";
    }
}
