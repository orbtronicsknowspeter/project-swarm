package o8;

import a2.t;
import java.io.EOFException;
import java.io.IOException;
import w8.h;
import w8.p;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8344b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8345l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f8346m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, w8.b bVar, int i) {
        super(bVar);
        this.f8345l = i;
        this.f8346m = obj;
    }

    public final void b() {
        switch (this.f8345l) {
            case 0:
                ((f) this.f8346m).v = true;
                return;
            default:
                synchronized (((f) ((t) this.f8346m).f55d)) {
                    ((t) this.f8346m).e();
                    break;
                }
                return;
        }
    }

    @Override // w8.p, w8.e0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f8344b) {
            return;
        }
        try {
            super.close();
        } catch (IOException unused) {
            this.f8344b = true;
            b();
        }
    }

    @Override // w8.p, w8.e0, java.io.Flushable
    public final void flush() {
        if (this.f8344b) {
            return;
        }
        try {
            super.flush();
        } catch (IOException unused) {
            this.f8344b = true;
            b();
        }
    }

    @Override // w8.p, w8.e0
    public final void l(h hVar, long j) throws EOFException {
        if (this.f8344b) {
            hVar.skip(j);
            return;
        }
        try {
            this.f10987a.l(hVar, j);
        } catch (IOException unused) {
            this.f8344b = true;
            b();
        }
    }
}
