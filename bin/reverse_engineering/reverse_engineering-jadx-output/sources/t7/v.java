package t7;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class v implements t6.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadLocal f10359b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w f10360l;

    public v(ThreadLocal threadLocal, Object obj) {
        this.f10358a = obj;
        this.f10359b = threadLocal;
        this.f10360l = new w(threadLocal);
    }

    @Override // t6.h
    public final Object fold(Object obj, d7.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // t6.h
    public final t6.f get(t6.g gVar) {
        if (this.f10360l.equals(gVar)) {
            return this;
        }
        return null;
    }

    @Override // t6.f
    public final t6.g getKey() {
        return this.f10360l;
    }

    @Override // t6.h
    public final t6.h minusKey(t6.g gVar) {
        return this.f10360l.equals(gVar) ? t6.i.f10314a : this;
    }

    @Override // t6.h
    public final t6.h plus(t6.h hVar) {
        return a.a.L(this, hVar);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.f10358a + ", threadLocal = " + this.f10359b + ')';
    }
}
