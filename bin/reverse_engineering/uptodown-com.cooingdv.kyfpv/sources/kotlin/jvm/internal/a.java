package kotlin.jvm.internal;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements i, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7012b = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f7013l = 2;

    public a(Object obj) {
        this.f7011a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f7012b == aVar.f7012b && this.f7013l == aVar.f7013l && l.a(this.f7011a, aVar.f7011a) && AtomicReference.class.equals(AtomicReference.class);
    }

    @Override // kotlin.jvm.internal.i
    public final int getArity() {
        return 2;
    }

    public final int hashCode() {
        return ((((((((((AtomicReference.class.hashCode() + ((this.f7011a != null ? r0.hashCode() : 0) * 31)) * 31) + 113762) * 31) - 869290769) * 31) + (this.f7012b ? 1231 : 1237)) * 31) + 2) * 31) + this.f7013l;
    }

    public final String toString() {
        y.f7026a.getClass();
        return z.a(this);
    }
}
