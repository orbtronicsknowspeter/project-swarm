package l8;

import java.util.List;
import q6.t;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f7222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f7223e;
    public final Object f;

    public k(String str, boolean z9, String str2, boolean z10, List list, List list2) {
        this.f7219a = str;
        this.f7220b = z9;
        this.f7221c = str2;
        this.f7222d = z10;
        this.f7223e = list;
        this.f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kotlin.jvm.internal.l.a(this.f7219a, kVar.f7219a) && this.f7220b == kVar.f7220b && kotlin.jvm.internal.l.a(this.f7221c, kVar.f7221c) && this.f7222d == kVar.f7222d && kotlin.jvm.internal.l.a(this.f7223e, kVar.f7223e) && kotlin.jvm.internal.l.a(this.f, kVar.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final int hashCode() {
        String str = this.f7219a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z9 = this.f7220b;
        ?? r32 = z9;
        if (z9) {
            r32 = 1;
        }
        int i = (iHashCode + r32) * 31;
        String str2 = this.f7221c;
        int iHashCode2 = (i + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z10 = this.f7222d;
        return this.f.hashCode() + j8.e.a((iHashCode2 + (z10 ? 1 : z10)) * 31, this.f7223e);
    }

    public final String toString() {
        return "MSPAPortalConfig(mspaJurisdiction=" + ((Object) this.f7219a) + ", isCoveredTransaction=" + this.f7220b + ", mspaSignalMode=" + ((Object) this.f7221c) + ", mspaAutoPopUp=" + this.f7222d + ", mspaOptOutPurposeIds=" + this.f7223e + ", mspaSensitiveDataPurposeIds=" + this.f + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ k() {
        t tVar = t.f8725a;
        this("", false, "", false, tVar, tVar);
    }
}
