package o2;

import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f8136a;

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i6) {
        int i10;
        if (i < 0 || i > bArr.length || i6 < 0 || (i10 = i + i6) > bArr.length || i10 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f8136a += (long) i6;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f8136a += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f8136a++;
    }
}
