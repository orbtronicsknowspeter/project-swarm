package p6;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class m implements f, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d7.a f8448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f8449b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f8450l;

    public m(d7.a aVar) {
        aVar.getClass();
        this.f8448a = aVar;
        this.f8449b = u.f8460a;
        this.f8450l = this;
    }

    @Override // p6.f
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.f8449b;
        u uVar = u.f8460a;
        if (obj != uVar) {
            return obj;
        }
        synchronized (this.f8450l) {
            objInvoke = this.f8449b;
            if (objInvoke == uVar) {
                d7.a aVar = this.f8448a;
                aVar.getClass();
                objInvoke = aVar.invoke();
                this.f8449b = objInvoke;
                this.f8448a = null;
            }
        }
        return objInvoke;
    }

    @Override // p6.f
    public final boolean isInitialized() {
        return this.f8449b != u.f8460a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
