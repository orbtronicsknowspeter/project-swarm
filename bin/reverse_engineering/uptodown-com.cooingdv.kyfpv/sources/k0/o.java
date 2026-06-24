package k0;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class o implements i0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f6916b = new o(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6917a;

    public /* synthetic */ o(String str) {
        this.f6917a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            return y.j(this.f6917a, ((o) obj).f6917a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6917a});
    }
}
