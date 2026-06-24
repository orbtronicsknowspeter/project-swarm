package s4;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f9199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9201c;

    public f0(ArrayList arrayList, int i, boolean z9) {
        this.f9199a = arrayList;
        this.f9200b = z9;
        this.f9201c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f9199a.equals(f0Var.f9199a) && this.f9200b == f0Var.f9200b && this.f9201c == f0Var.f9201c;
    }

    public final int hashCode() {
        return (((this.f9199a.hashCode() * 31) + (this.f9200b ? 1231 : 1237)) * 31) + this.f9201c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecommendedAppsData(recommendedApps=");
        sb.append(this.f9199a);
        sb.append(", isPrivate=");
        sb.append(this.f9200b);
        sb.append(", countApps=");
        return androidx.lifecycle.l.x(sb, ")", this.f9201c);
    }
}
