package l8;

import a4.x;
import com.google.android.gms.internal.measurement.i5;
import java.util.List;
import q6.t;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7231c;

    public m(String str, String str2, List list) {
        this.f7229a = list;
        this.f7230b = str;
        this.f7231c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.l.a(this.f7229a, mVar.f7229a) && kotlin.jvm.internal.l.a(this.f7230b, mVar.f7230b) && kotlin.jvm.internal.l.a(this.f7231c, mVar.f7231c);
    }

    public final int hashCode() {
        return this.f7231c.hashCode() + i5.b(this.f7229a.hashCode() * 31, this.f7230b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NonIabVendorsInfo(nonIabVendorList=");
        sb.append(this.f7229a);
        sb.append(", updateAt=");
        sb.append(this.f7230b);
        sb.append(", nonIabVendorsHash=");
        return x.m(sb, this.f7231c, ')');
    }

    public /* synthetic */ m() {
        this("", "", t.f8725a);
    }
}
