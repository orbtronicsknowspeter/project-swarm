package d0;

import android.support.v4.media.g;
import java.util.Arrays;
import k0.y;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements i0.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c f3536l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3538b;

    static {
        g gVar = new g(5, false);
        gVar.f247b = Boolean.FALSE;
        f3536l = new c(gVar);
    }

    public c(g gVar) {
        this.f3537a = ((Boolean) gVar.f247b).booleanValue();
        this.f3538b = (String) gVar.f248l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return y.j(null, null) && this.f3537a == cVar.f3537a && y.j(this.f3538b, cVar.f3538b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f3537a), this.f3538b});
    }
}
