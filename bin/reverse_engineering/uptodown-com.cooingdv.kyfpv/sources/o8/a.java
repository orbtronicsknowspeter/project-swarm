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
    public boolean f8338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f8339b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f9.b f8340l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z f8341m;

    public a(j jVar, f9.b bVar, z zVar) {
        this.f8339b = jVar;
        this.f8340l = bVar;
        this.f8341m = zVar;
    }

    @Override // w8.g0
    public final i0 a() {
        return this.f8339b.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        boolean zP;
        if (!this.f8338a) {
            try {
                zP = n8.c.p(this, 100);
            } catch (IOException unused) {
                zP = false;
            }
            if (!zP) {
                this.f8338a = true;
                this.f8340l.b();
            }
        }
        this.f8339b.close();
    }

    @Override // w8.g0
    public final long p(h hVar, long j) throws IOException {
        try {
            long jP = this.f8339b.p(hVar, j);
            z zVar = this.f8341m;
            if (jP != -1) {
                hVar.b(zVar.f11008b, hVar.f10962b - jP, jP);
                zVar.b();
                return jP;
            }
            if (!this.f8338a) {
                this.f8338a = true;
                zVar.close();
            }
            return -1L;
        } catch (IOException e10) {
            if (this.f8338a) {
                throw e10;
            }
            this.f8338a = true;
            this.f8340l.b();
            throw e10;
        }
    }
}
