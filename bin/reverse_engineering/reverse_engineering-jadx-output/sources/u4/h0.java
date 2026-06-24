package u4;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f10499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f10500b;

    public h0(ArrayList arrayList, ArrayList arrayList2) {
        this.f10499a = arrayList;
        this.f10500b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return kotlin.jvm.internal.l.a(this.f10499a, h0Var.f10499a) && kotlin.jvm.internal.l.a(this.f10500b, h0Var.f10500b);
    }

    public final int hashCode() {
        ArrayList arrayList = this.f10499a;
        int iHashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        ArrayList arrayList2 = this.f10500b;
        return iHashCode + (arrayList2 != null ? arrayList2.hashCode() : 0);
    }

    public final String toString() {
        return "AppRelatedCategoriesData(appTopByCategories=" + this.f10499a + ", appCategories=" + this.f10500b + ")";
    }
}
