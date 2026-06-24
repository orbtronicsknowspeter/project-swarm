package m8;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends w8.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a2.t f7691b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f9.b f7692l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f9.b bVar, w8.e0 e0Var, a2.t tVar) {
        super(e0Var);
        this.f7692l = bVar;
        this.f7691b = tVar;
    }

    @Override // w8.p, w8.e0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (((g) this.f7692l.f4997e)) {
            try {
                f9.b bVar = this.f7692l;
                if (bVar.f4993a) {
                    return;
                }
                bVar.f4993a = true;
                super.close();
                this.f7691b.c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
