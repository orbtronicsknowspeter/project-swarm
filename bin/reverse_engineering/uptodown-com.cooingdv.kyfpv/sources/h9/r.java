package h9;

import a4.x;
import com.google.android.gms.internal.measurement.i5;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5601c;

    public r(String str, int i, String str2) {
        str.getClass();
        str2.getClass();
        this.f5599a = i;
        this.f5600b = str;
        this.f5601c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f5599a == rVar.f5599a && kotlin.jvm.internal.l.a(this.f5600b, rVar.f5600b) && kotlin.jvm.internal.l.a(this.f5601c, rVar.f5601c);
    }

    public final int hashCode() {
        return this.f5601c.hashCode() + i5.b(this.f5599a * 31, this.f5600b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StackInfo(id=");
        sb.append(this.f5599a);
        sb.append(", label=");
        sb.append(this.f5600b);
        sb.append(", state=");
        return x.m(sb, this.f5601c, ')');
    }
}
