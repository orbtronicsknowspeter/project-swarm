package s8;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends n8.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9415b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ w8.h f9416l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f9417m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q f9418n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(q qVar, Object[] objArr, int i, w8.h hVar, int i6, boolean z9) {
        super("OkHttp %s Push Data[%s]", objArr);
        this.f9418n = qVar;
        this.f9415b = i;
        this.f9416l = hVar;
        this.f9417m = i6;
    }

    @Override // n8.a
    public final void a() {
        try {
            z zVar = this.f9418n.f9437s;
            w8.h hVar = this.f9416l;
            int i = this.f9417m;
            zVar.getClass();
            hVar.skip(i);
            this.f9418n.A.i(this.f9415b, 6);
            synchronized (this.f9418n) {
                this.f9418n.C.remove(Integer.valueOf(this.f9415b));
            }
        } catch (IOException unused) {
        }
    }
}
