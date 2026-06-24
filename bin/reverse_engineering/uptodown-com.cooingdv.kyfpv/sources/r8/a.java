package r8;

import java.io.IOException;
import w8.g0;
import w8.h;
import w8.i0;
import w8.r;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f9083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9084b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f9085l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f9086m;

    public a(g gVar) {
        this.f9086m = gVar;
        this.f9083a = new r(gVar.f9102c.a());
    }

    @Override // w8.g0
    public final i0 a() {
        return this.f9083a;
    }

    public final void b(boolean z9, IOException iOException) {
        g gVar = this.f9086m;
        int i = gVar.f9104e;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            com.google.gson.internal.a.f(gVar.f9104e, "state: ");
            return;
        }
        r rVar = this.f9083a;
        i0 i0Var = rVar.f10989e;
        rVar.f10989e = i0.f10963d;
        i0Var.a();
        i0Var.b();
        gVar.f9104e = 6;
        p8.e eVar = gVar.f9101b;
        if (eVar != null) {
            eVar.h(!z9, gVar, iOException);
        }
    }

    @Override // w8.g0
    public long p(h hVar, long j) throws IOException {
        try {
            long jP = this.f9086m.f9102c.p(hVar, j);
            if (jP <= 0) {
                return jP;
            }
            this.f9085l += jP;
            return jP;
        } catch (IOException e10) {
            b(false, e10);
            throw e10;
        }
    }
}
