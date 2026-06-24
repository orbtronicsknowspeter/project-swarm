package r;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o.c f8842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f8843b;

    public m(o.c cVar, byte[] bArr) {
        if (cVar == null) {
            com.google.gson.internal.a.i("encoding is null");
            throw null;
        }
        if (bArr == null) {
            com.google.gson.internal.a.i("bytes is null");
            throw null;
        }
        this.f8842a = cVar;
        this.f8843b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f8842a.equals(mVar.f8842a)) {
            return Arrays.equals(this.f8843b, mVar.f8843b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f8842a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f8843b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f8842a + ", bytes=[...]}";
    }
}
