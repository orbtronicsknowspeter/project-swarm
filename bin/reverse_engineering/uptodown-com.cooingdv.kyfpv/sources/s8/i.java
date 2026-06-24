package s8;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends n8.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9409b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f9410l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q f9411m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(q qVar, Object[] objArr, int i, long j) {
        super("OkHttp Window Update %s stream %d", objArr);
        this.f9411m = qVar;
        this.f9409b = i;
        this.f9410l = j;
    }

    @Override // n8.a
    public final void a() {
        q qVar = this.f9411m;
        try {
            qVar.A.r(this.f9409b, this.f9410l);
        } catch (IOException unused) {
            qVar.c();
        }
    }
}
