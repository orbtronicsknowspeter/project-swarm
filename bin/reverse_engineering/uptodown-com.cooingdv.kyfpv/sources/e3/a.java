package e3;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Object f4474l = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile b f4475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f4476b;

    public static c a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.f4476b = f4474l;
        aVar.f4475a = bVar;
        return aVar;
    }

    @Override // m6.a
    public final Object get() {
        Object obj;
        Object obj2 = this.f4476b;
        Object obj3 = f4474l;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f4476b;
                if (obj == obj3) {
                    obj = this.f4475a.get();
                    Object obj4 = this.f4476b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f4476b = obj;
                    this.f4475a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
