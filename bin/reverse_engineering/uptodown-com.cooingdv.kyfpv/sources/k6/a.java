package k6;

import a4.x;
import com.google.android.gms.internal.measurement.i5;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6980d;

    public a(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.f6977a = str;
        this.f6978b = str2;
        this.f6979c = str3;
        this.f6980d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f6977a, aVar.f6977a) && l.a(this.f6978b, aVar.f6978b) && l.a(this.f6979c, aVar.f6979c) && l.a(this.f6980d, aVar.f6980d);
    }

    public final int hashCode() {
        return this.f6980d.hashCode() + i5.b(i5.b(this.f6977a.hashCode() * 31, this.f6978b), this.f6979c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Banner(title=");
        sb.append(this.f6977a);
        sb.append(", sectionTitle=");
        sb.append(this.f6978b);
        sb.append(", description=");
        sb.append(this.f6979c);
        sb.append(", confirm=");
        return x.m(sb, this.f6980d, ')');
    }

    public /* synthetic */ a(int i, String str, String str2) {
        this((i & 1) != 0 ? "" : str, "", (i & 4) != 0 ? "" : str2, "");
    }
}
