package o8;

import java.io.IOException;
import w8.g0;
import w8.h;
import w8.i0;
import w8.j;
import w8.z;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f8337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f8338b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f9.b f8339l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z f8340m;

    public a(j jVar, f9.b bVar, z zVar) {
        this.f8338b = jVar;
        this.f8339l = bVar;
        this.f8340m = zVar;
    }

    @Override // w8.g0
    public final i0 a() {
        return this.f8338b.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        boolean zP;
        if (!this.f8337a) {
            try {
                zP = n8.c.p(this, 100);
            } catch (IOException unused) {
                zP = false;
            }
            if (!zP) {
                this.f8337a = true;
                this.f8339l.b();
            }
        }
        this.f8338b.close();
    }

    @Override // w8.g0
    public final long p(h hVar, long j) throws IOException {
        try {
            long jP = this.f8338b.p(hVar, j);
            z zVar = this.f8340m;
            if (jP != -1) {
                hVar.b(zVar.f11007b, hVar.f10961b - jP, jP);
                zVar.b();
                return jP;
            }
            if (!this.f8337a) {
                this.f8337a = true;
                zVar.close();
            }
            return -1L;
        } catch (IOException e10) {
            if (this.f8337a) {
                throw e10;
            }
            this.f8337a = true;
            this.f8339l.b();
            throw e10;
        }
    }
}
