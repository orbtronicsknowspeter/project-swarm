package r;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class j extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f8833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o.d f8834c;

    public j(String str, byte[] bArr, o.d dVar) {
        this.f8832a = str;
        this.f8833b = bArr;
        this.f8834c = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            j jVar = (j) pVar;
            if (this.f8832a.equals(jVar.f8832a)) {
                if (Arrays.equals(this.f8833b, pVar instanceof j ? ((j) pVar).f8833b : jVar.f8833b) && this.f8834c.equals(jVar.f8834c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8832a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f8833b)) * 1000003) ^ this.f8834c.hashCode();
    }
}
