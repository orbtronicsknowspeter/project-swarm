package y1;

import b2.b0;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f11605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f11607c;

    public b(b0 b0Var, String str, File file) {
        this.f11605a = b0Var;
        if (str == null) {
            com.google.gson.internal.a.i("Null sessionId");
            throw null;
        }
        this.f11606b = str;
        this.f11607c = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f11605a.equals(bVar.f11605a) && this.f11606b.equals(bVar.f11606b) && this.f11607c.equals(bVar.f11607c);
    }

    public final int hashCode() {
        return ((((this.f11605a.hashCode() ^ 1000003) * 1000003) ^ this.f11606b.hashCode()) * 1000003) ^ this.f11607c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f11605a + ", sessionId=" + this.f11606b + ", reportFile=" + this.f11607c + "}";
    }
}
