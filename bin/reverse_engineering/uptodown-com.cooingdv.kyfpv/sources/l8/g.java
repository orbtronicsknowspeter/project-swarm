package l8;

import com.inmobi.cmp.core.model.portalconfig.GBCConsentValue;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GBCConsentValue f7196b;

    public g(int i, GBCConsentValue gBCConsentValue) {
        gBCConsentValue.getClass();
        this.f7195a = i;
        this.f7196b = gBCConsentValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f7195a == gVar.f7195a && this.f7196b == gVar.f7196b;
    }

    public final int hashCode() {
        return this.f7196b.hashCode() + (this.f7195a * 31);
    }

    public final String toString() {
        return "GBCApplicablePurpose(id=" + this.f7195a + ", defaultValue=" + this.f7196b + ')';
    }
}
