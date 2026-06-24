package j8;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.l;
import q6.t;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f6719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f6720d;

    public a(int i, String str, ArrayList arrayList) {
        str = (i & 1) != 0 ? "" : str;
        int i6 = i & 4;
        t tVar = t.f8725a;
        List list = i6 != 0 ? tVar : arrayList;
        this.f6717a = str;
        this.f6718b = "";
        this.f6719c = list;
        this.f6720d = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f6717a, aVar.f6717a) && l.a(this.f6718b, aVar.f6718b) && l.a(this.f6719c, aVar.f6719c) && l.a(this.f6720d, aVar.f6720d);
    }

    public final int hashCode() {
        String str = this.f6717a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f6718b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f6719c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Object obj = this.f6720d;
        return iHashCode3 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        return "MSPAConfig(jurisdiction=" + ((Object) this.f6717a) + ", state=" + ((Object) this.f6718b) + ", purposes=" + this.f6719c + ", applicablePurposes=" + this.f6720d + ')';
    }
}
