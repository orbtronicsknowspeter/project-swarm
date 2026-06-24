package m8;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e0 implements Closeable {
    public abstract long b();

    public abstract w8.j c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        n8.c.c(c());
    }
}
