package r;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class j extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f8832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o.d f8833c;

    public j(String str, byte[] bArr, o.d dVar) {
        this.f8831a = str;
        this.f8832b = bArr;
        this.f8833c = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            j jVar = (j) pVar;
            if (this.f8831a.equals(jVar.f8831a)) {
                if (Arrays.equals(this.f8832b, pVar instanceof j ? ((j) pVar).f8832b : jVar.f8832b) && this.f8833c.equals(jVar.f8833c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8831a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f8832b)) * 1000003) ^ this.f8833c.hashCode();
    }
}
