package j8;

import java.util.ArrayList;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f6726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f6727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f6729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f6730e;
    public final ArrayList f;

    public c(Integer num, Integer num2, String str, String str2, ArrayList arrayList) {
        Boolean bool = Boolean.FALSE;
        this.f6726a = num;
        this.f6727b = num2;
        this.f6728c = str;
        this.f6729d = bool;
        this.f6730e = str2;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f6726a.equals(cVar.f6726a) && this.f6727b.equals(cVar.f6727b) && l.a(this.f6728c, cVar.f6728c) && l.a(this.f6729d, cVar.f6729d) && l.a(this.f6730e, cVar.f6730e) && this.f.equals(cVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.f6727b.hashCode() + (this.f6726a.hashCode() * 31)) * 31;
        String str = this.f6728c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f6729d;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f6730e;
        return this.f.hashCode() + ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "MSPASensitivePurpose(id=" + this.f6726a + ", order=" + this.f6727b + ", title=" + ((Object) this.f6728c) + ", value=" + this.f6729d + ", description=" + ((Object) this.f6730e) + ", nationalIds=" + this.f + ')';
    }
}
