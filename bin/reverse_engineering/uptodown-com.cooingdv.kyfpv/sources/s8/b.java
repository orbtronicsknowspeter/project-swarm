package s8;

import com.google.android.gms.internal.measurement.z3;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w8.k f9382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final w8.k f9383e;
    public static final w8.k f;
    public static final w8.k g;
    public static final w8.k h;
    public static final w8.k i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w8.k f9384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w8.k f9385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9386c;

    static {
        w8.k kVar = w8.k.f10971m;
        f9382d = z3.m(":");
        f9383e = z3.m(":status");
        f = z3.m(":method");
        g = z3.m(":path");
        h = z3.m(":scheme");
        i = z3.m(":authority");
    }

    public b(w8.k kVar, w8.k kVar2) {
        this.f9384a = kVar;
        this.f9385b = kVar2;
        this.f9386c = kVar2.f() + kVar.f() + 32;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f9384a.equals(bVar.f9384a) && this.f9385b.equals(bVar.f9385b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f9385b.hashCode() + ((this.f9384a.hashCode() + 527) * 31);
    }

    public final String toString() {
        String strT = this.f9384a.t();
        String strT2 = this.f9385b.t();
        byte[] bArr = n8.c.f8115a;
        Locale locale = Locale.US;
        return a4.x.k(strT, ": ", strT2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(w8.k kVar, String str) {
        this(kVar, z3.m(str));
        w8.k kVar2 = w8.k.f10971m;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(String str, String str2) {
        this(z3.m(str), z3.m(str2));
        w8.k kVar = w8.k.f10971m;
    }
}
