package w8;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f10983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f10984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f10985e;
    public final Long f;
    public final Map g = q6.a0.l0(q6.u.f8726a);

    public n(boolean z9, boolean z10, Long l10, Long l11, Long l12, Long l13) {
        this.f10981a = z9;
        this.f10982b = z10;
        this.f10983c = l10;
        this.f10984d = l11;
        this.f10985e = l12;
        this.f = l13;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f10981a) {
            arrayList.add("isRegularFile");
        }
        if (this.f10982b) {
            arrayList.add("isDirectory");
        }
        Long l10 = this.f10983c;
        if (l10 != null) {
            arrayList.add("byteCount=" + l10);
        }
        Long l11 = this.f10984d;
        if (l11 != null) {
            arrayList.add("createdAt=" + l11);
        }
        Long l12 = this.f10985e;
        if (l12 != null) {
            arrayList.add("lastModifiedAt=" + l12);
        }
        Long l13 = this.f;
        if (l13 != null) {
            arrayList.add("lastAccessedAt=" + l13);
        }
        Map map = this.g;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return q6.l.x0(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }
}
