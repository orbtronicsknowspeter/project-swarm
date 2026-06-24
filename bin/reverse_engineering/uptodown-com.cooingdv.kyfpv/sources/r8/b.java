package r8;

import w8.e0;
import w8.h;
import w8.i;
import w8.i0;
import w8.r;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f9087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9088b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f9089l;

    public b(g gVar) {
        this.f9089l = gVar;
        this.f9087a = new r(gVar.f9103d.a());
    }

    @Override // w8.e0
    public final i0 a() {
        return this.f9087a;
    }

    @Override // w8.e0, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f9088b) {
            return;
        }
        this.f9088b = true;
        this.f9089l.f9103d.m("0\r\n\r\n");
        r rVar = this.f9087a;
        i0 i0Var = rVar.f10989e;
        rVar.f10989e = i0.f10963d;
        i0Var.a();
        i0Var.b();
        this.f9089l.f9104e = 3;
    }

    @Override // w8.e0, java.io.Flushable
    public final synchronized void flush() {
        if (this.f9088b) {
            return;
        }
        this.f9089l.f9103d.flush();
    }

    @Override // w8.e0
    public final void l(h hVar, long j) {
        i iVar = this.f9089l.f9103d;
        if (this.f9088b) {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("closed");
        } else {
            if (j == 0) {
                return;
            }
            iVar.o(j);
            iVar.m("\r\n");
            iVar.l(hVar, j);
            iVar.m("\r\n");
        }
    }
}
