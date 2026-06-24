package s8;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends n8.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9420b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f9421l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f9422m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q f9423n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, boolean z9, int i, int i6) {
        super("OkHttp %s ping %08x%08x", qVar.f9431m, Integer.valueOf(i), Integer.valueOf(i6));
        this.f9423n = qVar;
        this.f9420b = z9;
        this.f9421l = i;
        this.f9422m = i6;
    }

    @Override // n8.a
    public final void a() {
        boolean z9;
        q qVar = this.f9423n;
        boolean z10 = this.f9420b;
        int i = this.f9421l;
        int i6 = this.f9422m;
        if (!z10) {
            synchronized (qVar) {
                z9 = qVar.f9438t;
                qVar.f9438t = true;
            }
            if (z9) {
                qVar.c();
                return;
            }
        }
        try {
            qVar.A.h(i, i6, z10);
        } catch (IOException unused) {
            qVar.c();
        }
    }
}
