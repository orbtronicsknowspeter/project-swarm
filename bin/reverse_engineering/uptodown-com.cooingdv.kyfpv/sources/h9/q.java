package h9;

import a4.x;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5598b;

    public q(String str, String str2) {
        this.f5597a = str;
        this.f5598b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f5597a.equals(qVar.f5597a) && this.f5598b.equals(qVar.f5598b);
    }

    public final int hashCode() {
        return this.f5598b.hashCode() + (this.f5597a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PublisherCustomLink(label=");
        sb.append(this.f5597a);
        sb.append(", link=");
        return x.m(sb, this.f5598b, ')');
    }
}
