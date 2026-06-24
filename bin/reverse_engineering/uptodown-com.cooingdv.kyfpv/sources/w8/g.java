package w8;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f10960b;

    public /* synthetic */ g(i iVar, int i) {
        this.f10959a = i;
        this.f10960b = iVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f10959a) {
            case 0:
                break;
            default:
                ((z) this.f10960b).close();
                break;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        switch (this.f10959a) {
            case 0:
                break;
            default:
                z zVar = (z) this.f10960b;
                if (!zVar.f11009l) {
                    zVar.flush();
                }
                break;
        }
    }

    public final String toString() {
        switch (this.f10959a) {
            case 0:
                return ((h) this.f10960b) + ".outputStream()";
            default:
                return ((z) this.f10960b) + ".outputStream()";
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i6) throws IOException {
        int i10 = this.f10959a;
        bArr.getClass();
        switch (i10) {
            case 0:
                ((h) this.f10960b).write(bArr, i, i6);
                break;
            default:
                z zVar = (z) this.f10960b;
                if (!zVar.f11009l) {
                    zVar.f11008b.write(bArr, i, i6);
                    zVar.b();
                } else {
                    com.google.gson.internal.a.n("closed");
                }
                break;
        }
    }

    private final void b() {
    }

    private final void c() {
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        switch (this.f10959a) {
            case 0:
                ((h) this.f10960b).A(i);
                break;
            default:
                z zVar = (z) this.f10960b;
                if (!zVar.f11009l) {
                    zVar.f11008b.A((byte) i);
                    zVar.b();
                } else {
                    com.google.gson.internal.a.n("closed");
                }
                break;
        }
    }
}
