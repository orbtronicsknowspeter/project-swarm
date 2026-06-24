package m8;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7707b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w8.j f7708l;

    public /* synthetic */ d0(long j, w8.j jVar, int i) {
        this.f7706a = i;
        this.f7707b = j;
        this.f7708l = jVar;
    }

    @Override // m8.e0
    public final long b() {
        switch (this.f7706a) {
        }
        return this.f7707b;
    }

    @Override // m8.e0
    public final w8.j c() {
        switch (this.f7706a) {
            case 0:
                return (w8.h) this.f7708l;
            default:
                return (w8.a0) this.f7708l;
        }
    }
}
