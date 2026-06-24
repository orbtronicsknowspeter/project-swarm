package m8;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f7674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f7676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f7677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile i f7678e;

    public a0(y2.s sVar) {
        this.f7674a = (u) sVar.f11757l;
        this.f7675b = (String) sVar.f11756b;
        g5.f fVar = (g5.f) sVar.f11758m;
        fVar.getClass();
        this.f7676c = new s(fVar);
        Object obj = sVar.f11759n;
        this.f7677d = obj == null ? this : obj;
    }

    public final y2.s a() {
        y2.s sVar = new y2.s(false);
        sVar.f11757l = this.f7674a;
        sVar.f11756b = this.f7675b;
        sVar.f11759n = this.f7677d;
        sVar.f11758m = this.f7676c.c();
        return sVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.f7675b);
        sb.append(", url=");
        sb.append(this.f7674a);
        sb.append(", tag=");
        Object obj = this.f7677d;
        if (obj == this) {
            obj = null;
        }
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }
}
