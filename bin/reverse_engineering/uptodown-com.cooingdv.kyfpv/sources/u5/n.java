package u5;

import a4.x;
import com.google.android.gms.internal.measurement.i5;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10759b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f10760l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, String str2) {
        super("invalid value " + str2 + " passed for " + str + " ");
        str2.getClass();
        this.f10758a = str;
        this.f10759b = str2;
        this.f10760l = "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return kotlin.jvm.internal.l.a(this.f10758a, nVar.f10758a) && kotlin.jvm.internal.l.a(this.f10759b, nVar.f10759b) && kotlin.jvm.internal.l.a(this.f10760l, nVar.f10760l);
    }

    public final int hashCode() {
        return this.f10760l.hashCode() + i5.b(this.f10758a.hashCode() * 31, this.f10759b);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("TCModelError(fieldName=");
        sb.append(this.f10758a);
        sb.append(", fieldValue=");
        sb.append(this.f10759b);
        sb.append(", msg=");
        return x.m(sb, this.f10760l, ')');
    }
}
