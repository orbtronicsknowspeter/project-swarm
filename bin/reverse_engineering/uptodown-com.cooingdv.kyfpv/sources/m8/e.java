package m8;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o8.e f7709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w8.a0 f7710b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f7711l;

    public e(o8.e eVar, String str) {
        this.f7709a = eVar;
        this.f7711l = str;
        this.f7710b = new w8.a0(new d(eVar.f8354l[1], eVar));
    }

    @Override // m8.e0
    public final long b() {
        try {
            String str = this.f7711l;
            if (str != null) {
                return Long.parseLong(str);
            }
            return -1L;
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @Override // m8.e0
    public final w8.j c() {
        return this.f7710b;
    }
}
