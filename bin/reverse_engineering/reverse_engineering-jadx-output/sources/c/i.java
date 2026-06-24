package c;

import com.google.android.gms.internal.measurement.i5;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h8.d f1160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f1161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f1164e;
    public final String f;
    public final Integer g;

    public i(h8.d dVar, Boolean bool, int i, int i6, String str, Integer num, int i10) {
        dVar = (i10 & 1) != 0 ? new h8.d() : dVar;
        bool = (i10 & 2) != 0 ? null : bool;
        i = (i10 & 4) != 0 ? 1 : i;
        i6 = (i10 & 8) != 0 ? 1 : i6;
        boolean z9 = (i10 & 16) != 0;
        str = (i10 & 32) != 0 ? "" : str;
        num = (i10 & 64) != 0 ? null : num;
        dVar.getClass();
        if (i == 0 || i6 == 0) {
            throw null;
        }
        str.getClass();
        this.f1160a = dVar;
        this.f1161b = bool;
        this.f1162c = i;
        this.f1163d = i6;
        this.f1164e = z9;
        this.f = str;
        this.g = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return l.a(this.f1160a, iVar.f1160a) && l.a(this.f1161b, iVar.f1161b) && this.f1162c == iVar.f1162c && this.f1163d == iVar.f1163d && this.f1164e == iVar.f1164e && l.a(this.f, iVar.f) && l.a(this.g, iVar.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    public final int hashCode() {
        int iHashCode = this.f1160a.hashCode() * 31;
        Boolean bool = this.f1161b;
        int iC = (j.c(this.f1163d) + ((j.c(this.f1162c) + ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31)) * 31)) * 31;
        boolean z9 = this.f1164e;
        ?? r12 = z9;
        if (z9) {
            r12 = 1;
        }
        int iB = i5.b((iC + r12) * 31, this.f);
        Integer num = this.g;
        return iB + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SwitchItemData(value=");
        sb.append(this.f1160a);
        sb.append(", selectedState=");
        sb.append(this.f1161b);
        sb.append(", viewType=");
        int i = this.f1162c;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "NON_SWITCH" : "LABEL" : "DESCRIPTION" : "NORMAL");
        sb.append(", itemType=");
        sb.append(j.d(this.f1163d));
        sb.append(", isTagEnabled=");
        sb.append(this.f1164e);
        sb.append(", text=");
        sb.append(this.f);
        sb.append(", counter=");
        sb.append(this.g);
        sb.append(')');
        return sb.toString();
    }
}
