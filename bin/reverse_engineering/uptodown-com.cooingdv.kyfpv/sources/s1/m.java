package s1;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class m implements s2.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f9141c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f9142a = f9141c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile s2.b f9143b;

    public m(s2.b bVar) {
        this.f9143b = bVar;
    }

    @Override // s2.b
    public final Object get() {
        Object obj;
        Object obj2 = this.f9142a;
        Object obj3 = f9141c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f9142a;
                if (obj == obj3) {
                    obj = this.f9143b.get();
                    this.f9142a = obj;
                    this.f9143b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
