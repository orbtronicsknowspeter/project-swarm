package s8;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends n8.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9406b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f9407l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q f9408m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(q qVar, Object[] objArr, int i, int i6) {
        super("OkHttp %s stream %d", objArr);
        this.f9408m = qVar;
        this.f9406b = i;
        this.f9407l = i6;
    }

    @Override // n8.a
    public final void a() {
        q qVar = this.f9408m;
        try {
            qVar.A.i(this.f9406b, this.f9407l);
        } catch (IOException unused) {
            qVar.c();
        }
    }
}
