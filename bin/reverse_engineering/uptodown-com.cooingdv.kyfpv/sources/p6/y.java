package p6;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class y implements f, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d7.a f8465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f8466b;

    @Override // p6.f
    public final Object getValue() {
        if (this.f8466b == u.f8461a) {
            d7.a aVar = this.f8465a;
            aVar.getClass();
            this.f8466b = aVar.invoke();
            this.f8465a = null;
        }
        return this.f8466b;
    }

    @Override // p6.f
    public final boolean isInitialized() {
        return this.f8466b != u.f8461a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
