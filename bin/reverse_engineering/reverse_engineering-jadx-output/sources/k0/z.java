package k0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class z extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0.b f6939a;

    public z(h0.b bVar) {
        y.a("ResolvableConnectionException can only be created with a connection result containing a resolution.", (bVar.f5395b == 0 || bVar.f5396l == null) ? false : true);
        this.f6939a = bVar;
    }
}
