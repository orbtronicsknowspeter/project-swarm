package n6;

import a4.x;
import androidx.lifecycle.l;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8108c;

    public a(int i, String str, String str2) {
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? "" : str2;
        this.f8106a = str;
        this.f8107b = str2;
        this.f8108c = "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f8106a.equals(aVar.f8106a) && this.f8107b.equals(aVar.f8107b) && this.f8108c.equals(aVar.f8108c);
    }

    public final int hashCode() {
        return this.f8108c.hashCode() + l.o(this.f8106a.hashCode() * 31, 31, this.f8107b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GeoIP(country=");
        sb.append(this.f8106a);
        sb.append(", region=");
        sb.append(this.f8107b);
        sb.append(", city=");
        return x.m(sb, this.f8108c, ')');
    }
}
