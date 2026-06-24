package w5;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f10931a;

    public f(ArrayList arrayList) {
        this.f10931a = arrayList;
    }

    public final boolean equals(Object obj) {
        Object obj2 = 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        Object obj3 = Boolean.TRUE;
        return obj3.equals(obj3) && obj2.equals(obj2) && this.f10931a.equals(fVar.f10931a);
    }

    public final int hashCode() {
        Integer num = 2;
        return this.f10931a.hashCode() + ((num.hashCode() + (Boolean.TRUE.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "EncodingOptions(isForVendors=" + Boolean.TRUE + ", version=" + ((Object) 2) + ", segments=" + this.f10931a + ')';
    }
}
