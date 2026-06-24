package r7;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class p0 extends s7.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f9042a = new AtomicReference(null);

    @Override // s7.d
    public final boolean a(s7.b bVar) {
        AtomicReference atomicReference = this.f9042a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(k0.f9007b);
        return true;
    }

    @Override // s7.d
    public final t6.c[] b(s7.b bVar) {
        this.f9042a.set(null);
        return s7.c.f9349a;
    }
}
