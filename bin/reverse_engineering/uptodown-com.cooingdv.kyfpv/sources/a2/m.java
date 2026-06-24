package a2;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class m implements Closeable {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Logger f30p = Logger.getLogger(m.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RandomAccessFile f31a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f32b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f33l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public j f34m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public j f35n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final byte[] f36o;

    public m(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.f36o = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i = 0;
                for (int i6 = 0; i6 < 4; i6++) {
                    z(i, iArr[i6], bArr2);
                    i += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    com.google.gson.internal.a.n("Rename failed!");
                    throw null;
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f31a = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int i10 = i(0, bArr);
        this.f32b = i10;
        if (i10 <= randomAccessFile2.length()) {
            this.f33l = i(4, bArr);
            int i11 = i(8, bArr);
            int i12 = i(12, bArr);
            this.f34m = h(i11);
            this.f35n = h(i12);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f32b + ", Actual length: " + randomAccessFile2.length());
    }

    public static int i(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    public static void z(int i, int i6, byte[] bArr) {
        bArr[i] = (byte) (i6 >> 24);
        bArr[i + 1] = (byte) (i6 >> 16);
        bArr[i + 2] = (byte) (i6 >> 8);
        bArr[i + 3] = (byte) i6;
    }

    public final void b(byte[] bArr) {
        int iU;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    d(length);
                    boolean zF = f();
                    if (zF) {
                        iU = 16;
                    } else {
                        j jVar = this.f35n;
                        iU = u(jVar.f25a + 4 + jVar.f26b);
                    }
                    j jVar2 = new j(iU, length);
                    z(0, length, this.f36o);
                    r(iU, 4, this.f36o);
                    r(iU + 4, length, bArr);
                    y(this.f32b, this.f33l + 1, zF ? iU : this.f34m.f25a, iU);
                    this.f35n = jVar2;
                    this.f33l++;
                    if (zF) {
                        this.f34m = jVar2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public final synchronized void c() {
        y(4096, 0, 0, 0);
        this.f33l = 0;
        j jVar = j.f24c;
        this.f34m = jVar;
        this.f35n = jVar;
        if (this.f32b > 4096) {
            RandomAccessFile randomAccessFile = this.f31a;
            randomAccessFile.setLength(4096);
            randomAccessFile.getChannel().force(true);
        }
        this.f32b = 4096;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f31a.close();
    }

    public final void d(int i) throws IOException {
        int i6 = i + 4;
        int iS = this.f32b - s();
        if (iS >= i6) {
            return;
        }
        int i10 = this.f32b;
        do {
            iS += i10;
            i10 <<= 1;
        } while (iS < i6);
        RandomAccessFile randomAccessFile = this.f31a;
        randomAccessFile.setLength(i10);
        randomAccessFile.getChannel().force(true);
        j jVar = this.f35n;
        int iU = u(jVar.f25a + 4 + jVar.f26b);
        if (iU < this.f34m.f25a) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.f32b);
            long j = iU - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                s1.o.j("Copied insufficient number of bytes!");
                return;
            }
        }
        int i11 = this.f35n.f25a;
        int i12 = this.f34m.f25a;
        if (i11 < i12) {
            int i13 = (this.f32b + i11) - 16;
            y(i10, this.f33l, i12, i13);
            this.f35n = new j(i13, this.f35n.f26b);
        } else {
            y(i10, this.f33l, i12, i11);
        }
        this.f32b = i10;
    }

    public final synchronized void e(l lVar) {
        int iU = this.f34m.f25a;
        for (int i = 0; i < this.f33l; i++) {
            j jVarH = h(iU);
            lVar.a(new k(this, jVarH), jVarH.f26b);
            iU = u(jVarH.f25a + 4 + jVarH.f26b);
        }
    }

    public final synchronized boolean f() {
        return this.f33l == 0;
    }

    public final j h(int i) throws IOException {
        if (i == 0) {
            return j.f24c;
        }
        RandomAccessFile randomAccessFile = this.f31a;
        randomAccessFile.seek(i);
        return new j(i, randomAccessFile.readInt());
    }

    public final synchronized void j() {
        try {
            if (f()) {
                throw new NoSuchElementException();
            }
            if (this.f33l == 1) {
                c();
            } else {
                j jVar = this.f34m;
                int iU = u(jVar.f25a + 4 + jVar.f26b);
                n(iU, this.f36o, 0, 4);
                int i = i(0, this.f36o);
                y(this.f32b, this.f33l - 1, iU, this.f35n.f25a);
                this.f33l--;
                this.f34m = new j(iU, i);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void n(int i, byte[] bArr, int i6, int i10) throws IOException {
        int iU = u(i);
        int i11 = iU + i10;
        int i12 = this.f32b;
        RandomAccessFile randomAccessFile = this.f31a;
        if (i11 <= i12) {
            randomAccessFile.seek(iU);
            randomAccessFile.readFully(bArr, i6, i10);
            return;
        }
        int i13 = i12 - iU;
        randomAccessFile.seek(iU);
        randomAccessFile.readFully(bArr, i6, i13);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i6 + i13, i10 - i13);
    }

    public final void r(int i, int i6, byte[] bArr) throws IOException {
        int iU = u(i);
        int i10 = iU + i6;
        int i11 = this.f32b;
        RandomAccessFile randomAccessFile = this.f31a;
        if (i10 <= i11) {
            randomAccessFile.seek(iU);
            randomAccessFile.write(bArr, 0, i6);
            return;
        }
        int i12 = i11 - iU;
        randomAccessFile.seek(iU);
        randomAccessFile.write(bArr, 0, i12);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i12, i6 - i12);
    }

    public final int s() {
        if (this.f33l == 0) {
            return 16;
        }
        j jVar = this.f35n;
        int i = jVar.f25a;
        int i6 = this.f34m.f25a;
        return i >= i6 ? (i - i6) + 4 + jVar.f26b + 16 : (((i + 4) + jVar.f26b) + this.f32b) - i6;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m.class.getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.f32b);
        sb.append(", size=");
        sb.append(this.f33l);
        sb.append(", first=");
        sb.append(this.f34m);
        sb.append(", last=");
        sb.append(this.f35n);
        sb.append(", element lengths=[");
        try {
            e(new i(sb));
        } catch (IOException e10) {
            f30p.log(Level.WARNING, "read error", (Throwable) e10);
        }
        sb.append("]]");
        return sb.toString();
    }

    public final int u(int i) {
        int i6 = this.f32b;
        return i < i6 ? i : (i + 16) - i6;
    }

    public final void y(int i, int i6, int i10, int i11) throws IOException {
        int[] iArr = {i, i6, i10, i11};
        int i12 = 0;
        int i13 = 0;
        while (true) {
            byte[] bArr = this.f36o;
            if (i12 >= 4) {
                RandomAccessFile randomAccessFile = this.f31a;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            } else {
                z(i13, iArr[i12], bArr);
                i13 += 4;
                i12++;
            }
        }
    }
}
