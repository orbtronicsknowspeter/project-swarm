package l8;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f7248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f7249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f7250c;

    public /* synthetic */ o() {
        this(new ArrayList(), new ArrayList(), new ArrayList());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return kotlin.jvm.internal.l.a(this.f7248a, oVar.f7248a) && kotlin.jvm.internal.l.a(this.f7249b, oVar.f7249b) && kotlin.jvm.internal.l.a(this.f7250c, oVar.f7250c);
    }

    public final int hashCode() {
        return this.f7250c.hashCode() + j8.e.a(this.f7248a.hashCode() * 31, this.f7249b);
    }

    public final String toString() {
        return "PremiumProperties(vendorBlacklist=" + this.f7248a + ", vendorWhitelist=" + this.f7249b + ", googleWhitelist=" + this.f7250c + ')';
    }

    public o(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f7248a = arrayList;
        this.f7249b = arrayList2;
        this.f7250c = arrayList3;
    }
}
