package j8;

import java.util.ArrayList;
import kotlin.jvm.internal.l;
import q6.t;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f6721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f6722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f6723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k6.a f6724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f6725e;
    public Object f;
    public final boolean g;

    public b(Integer num, Boolean bool, k6.a aVar, ArrayList arrayList, boolean z9) {
        Boolean bool2 = Boolean.FALSE;
        this.f6721a = num;
        this.f6722b = bool;
        this.f6723c = bool2;
        this.f6724d = aVar;
        this.f6725e = arrayList;
        this.f = t.f8725a;
        this.g = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f6721a.equals(bVar.f6721a) && this.f6722b.equals(bVar.f6722b) && l.a(this.f6723c, bVar.f6723c) && this.f6724d.equals(bVar.f6724d) && this.f6725e.equals(bVar.f6725e) && l.a(this.f, bVar.f) && this.g == bVar.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v15 */
    public final int hashCode() {
        int iHashCode = (this.f6722b.hashCode() + (this.f6721a.hashCode() * 961)) * 31;
        Boolean bool = this.f6723c;
        int iHashCode2 = (this.f6725e.hashCode() + ((this.f6724d.hashCode() + ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31)) * 31)) * 31;
        Object obj = this.f;
        int iHashCode3 = (iHashCode2 + (obj != null ? obj.hashCode() : 0)) * 31;
        boolean z9 = this.g;
        ?? r02 = z9;
        if (z9) {
            r02 = 1;
        }
        return iHashCode3 + r02;
    }

    public final String toString() {
        return "MSPAPurpose(id=" + this.f6721a + ", category=, defaultValue=" + this.f6722b + ", value=" + this.f6723c + ", consentBanner=" + this.f6724d + ", purposes=" + this.f6725e + ", applicableSensitivePurposes=" + this.f + ", noticeOnly=" + this.g + ')';
    }
}
