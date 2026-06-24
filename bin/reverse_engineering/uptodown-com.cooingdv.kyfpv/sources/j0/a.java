package j0;

import java.util.Arrays;
import k0.y;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.support.v4.media.g f6480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0.a f6481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6482d;

    public a(android.support.v4.media.g gVar, i0.a aVar, String str) {
        this.f6480b = gVar;
        this.f6481c = aVar;
        this.f6482d = str;
        this.f6479a = Arrays.hashCode(new Object[]{gVar, aVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return y.j(this.f6480b, aVar.f6480b) && y.j(this.f6481c, aVar.f6481c) && y.j(this.f6482d, aVar.f6482d);
    }

    public final int hashCode() {
        return this.f6479a;
    }
}
