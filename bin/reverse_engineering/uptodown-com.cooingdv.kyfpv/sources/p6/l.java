package p6;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements f, Serializable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8446l = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "b");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile d7.a f8447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f8448b;

    @Override // p6.f
    public final Object getValue() {
        Object obj = this.f8448b;
        u uVar = u.f8461a;
        if (obj != uVar) {
            return obj;
        }
        d7.a aVar = this.f8447a;
        if (aVar != null) {
            Object objInvoke = aVar.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8446l;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != uVar) {
                }
            }
            this.f8447a = null;
            return objInvoke;
        }
        return this.f8448b;
    }

    @Override // p6.f
    public final boolean isInitialized() {
        return this.f8448b != u.f8461a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
