package p6;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class m implements f, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d7.a f8449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f8450b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f8451l;

    public m(d7.a aVar) {
        aVar.getClass();
        this.f8449a = aVar;
        this.f8450b = u.f8461a;
        this.f8451l = this;
    }

    @Override // p6.f
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.f8450b;
        u uVar = u.f8461a;
        if (obj != uVar) {
            return obj;
        }
        synchronized (this.f8451l) {
            objInvoke = this.f8450b;
            if (objInvoke == uVar) {
                d7.a aVar = this.f8449a;
                aVar.getClass();
                objInvoke = aVar.invoke();
                this.f8450b = objInvoke;
                this.f8449a = null;
            }
        }
        return objInvoke;
    }

    @Override // p6.f
    public final boolean isInitialized() {
        return this.f8450b != u.f8461a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
