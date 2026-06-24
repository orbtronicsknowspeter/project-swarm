package k1;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements d, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6949a;

    public g(Object obj) {
        this.f6949a = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        Object obj2 = ((g) obj).f6949a;
        Object obj3 = this.f6949a;
        return obj3 == obj2 || obj3.equals(obj2);
    }

    @Override // k1.d
    public final Object get() {
        return this.f6949a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6949a});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f6949a);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }
}
