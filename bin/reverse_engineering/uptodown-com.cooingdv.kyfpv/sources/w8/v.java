package w8;

import com.google.android.gms.internal.measurement.i5;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public class v extends o {
    @Override // w8.o
    public void a(y yVar, y yVar2) throws IOException {
        yVar2.getClass();
        if (yVar.toFile().renameTo(yVar2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + yVar + " to " + yVar2);
    }

    @Override // w8.o
    public final void b(y yVar) throws IOException {
        if (yVar.toFile().mkdir()) {
            return;
        }
        n nVarE = e(yVar);
        if (nVarE == null || !nVarE.f10982b) {
            s1.o.k(yVar, "failed to create directory: ");
        }
    }

    @Override // w8.o
    public final void c(y yVar) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = yVar.toFile();
        if (file.delete() || !file.exists()) {
            return;
        }
        s1.o.k(yVar, "failed to delete ");
    }

    @Override // w8.o
    public n e(y yVar) {
        yVar.getClass();
        File file = yVar.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || file.exists()) {
            return new n(zIsFile, zIsDirectory, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
        }
        return null;
    }

    @Override // w8.o
    public final u f(y yVar) {
        return new u(false, new RandomAccessFile(yVar.toFile(), "r"));
    }

    @Override // w8.o
    public final u g(y yVar) {
        return new u(true, new RandomAccessFile(yVar.toFile(), "rw"));
    }

    @Override // w8.o
    public final g0 h(y yVar) {
        yVar.getClass();
        return i5.L(yVar.toFile());
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
