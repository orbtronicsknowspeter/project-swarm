package q2;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f8644b;

    public a(String str, ArrayList arrayList) {
        if (str == null) {
            com.google.gson.internal.a.i("Null userAgent");
            throw null;
        }
        this.f8643a = str;
        this.f8644b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f8643a.equals(aVar.f8643a) && this.f8644b.equals(aVar.f8644b);
    }

    public final int hashCode() {
        return ((this.f8643a.hashCode() ^ 1000003) * 1000003) ^ this.f8644b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f8643a + ", usedDates=" + this.f8644b + "}";
    }
}
