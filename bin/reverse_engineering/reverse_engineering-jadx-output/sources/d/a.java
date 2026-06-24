package d;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import s1.o;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class a extends InputStream implements DataInput {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ByteOrder f3497n = ByteOrder.LITTLE_ENDIAN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ByteOrder f3498o = ByteOrder.BIG_ENDIAN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataInputStream f3499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteOrder f3500b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f3501l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3502m;

    public a(InputStream inputStream) throws IOException {
        this.f3500b = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f3499a = dataInputStream;
        int iAvailable = dataInputStream.available();
        this.f3501l = iAvailable;
        this.f3502m = 0;
        dataInputStream.mark(iAvailable);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f3499a.available();
    }

    public final void b(long j) {
        int i = this.f3502m;
        if (i > j) {
            this.f3502m = 0;
            DataInputStream dataInputStream = this.f3499a;
            dataInputStream.reset();
            dataInputStream.mark(this.f3501l);
        } else {
            j -= (long) i;
        }
        int i6 = (int) j;
        if (skipBytes(i6) == i6) {
            return;
        }
        com.google.gson.internal.a.n("Couldn't seek up to the byteCount");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f3502m++;
        return this.f3499a.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f3502m++;
        return this.f3499a.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        int i = this.f3502m + 1;
        this.f3502m = i;
        if (i > this.f3501l) {
            o.d();
            return (byte) 0;
        }
        int i6 = this.f3499a.read();
        if (i6 >= 0) {
            return (byte) i6;
        }
        o.d();
        return (byte) 0;
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f3502m += 2;
        return this.f3499a.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        int length = this.f3502m + bArr.length;
        this.f3502m = length;
        if (length > this.f3501l) {
            o.d();
            return;
        }
        if (this.f3499a.read(bArr, 0, bArr.length) == bArr.length) {
            return;
        }
        com.google.gson.internal.a.n("Couldn't read up to the length of buffer");
    }

    @Override // java.io.DataInput
    public final int readInt() {
        int i = this.f3502m + 4;
        this.f3502m = i;
        if (i > this.f3501l) {
            o.d();
            return 0;
        }
        DataInputStream dataInputStream = this.f3499a;
        int i6 = dataInputStream.read();
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        if ((i6 | i10 | i11 | i12) < 0) {
            o.d();
            return 0;
        }
        ByteOrder byteOrder = this.f3500b;
        if (byteOrder == f3497n) {
            return (i12 << 24) + (i11 << 16) + (i10 << 8) + i6;
        }
        if (byteOrder == f3498o) {
            return (i6 << 24) + (i10 << 16) + (i11 << 8) + i12;
        }
        androidx.core.content.pm.a.k(this.f3500b, "Invalid byte order: ");
        return 0;
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        long j;
        long j6;
        int i = this.f3502m + 8;
        this.f3502m = i;
        if (i > this.f3501l) {
            o.d();
            return 0L;
        }
        DataInputStream dataInputStream = this.f3499a;
        int i6 = dataInputStream.read();
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        int i13 = dataInputStream.read();
        int i14 = dataInputStream.read();
        int i15 = dataInputStream.read();
        int i16 = dataInputStream.read();
        if ((i6 | i10 | i11 | i12 | i13 | i14 | i15 | i16) < 0) {
            o.d();
            return 0L;
        }
        ByteOrder byteOrder = this.f3500b;
        if (byteOrder == f3497n) {
            j = (((long) i16) << 56) + (((long) i15) << 48) + (((long) i14) << 40) + (((long) i13) << 32) + (((long) i12) << 24) + (((long) i11) << 16) + (((long) i10) << 8);
            j6 = i6;
        } else {
            if (byteOrder != f3498o) {
                androidx.core.content.pm.a.k(this.f3500b, "Invalid byte order: ");
                return 0L;
            }
            j = (((long) i6) << 56) + (((long) i10) << 48) + (((long) i11) << 40) + (((long) i12) << 32) + (((long) i13) << 24) + (((long) i14) << 16) + (((long) i15) << 8);
            j6 = i16;
        }
        return j + j6;
    }

    @Override // java.io.DataInput
    public final short readShort() {
        int i = this.f3502m + 2;
        this.f3502m = i;
        if (i > this.f3501l) {
            o.d();
            return (short) 0;
        }
        DataInputStream dataInputStream = this.f3499a;
        int i6 = dataInputStream.read();
        int i10 = dataInputStream.read();
        if ((i6 | i10) < 0) {
            o.d();
            return (short) 0;
        }
        ByteOrder byteOrder = this.f3500b;
        if (byteOrder == f3497n) {
            return (short) ((i10 << 8) + i6);
        }
        if (byteOrder == f3498o) {
            return (short) ((i6 << 8) + i10);
        }
        androidx.core.content.pm.a.k(this.f3500b, "Invalid byte order: ");
        return (short) 0;
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f3502m += 2;
        return this.f3499a.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f3502m++;
        return this.f3499a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        int i = this.f3502m + 2;
        this.f3502m = i;
        if (i > this.f3501l) {
            o.d();
            return 0;
        }
        DataInputStream dataInputStream = this.f3499a;
        int i6 = dataInputStream.read();
        int i10 = dataInputStream.read();
        if ((i6 | i10) < 0) {
            o.d();
            return 0;
        }
        ByteOrder byteOrder = this.f3500b;
        if (byteOrder == f3497n) {
            return (i10 << 8) + i6;
        }
        if (byteOrder == f3498o) {
            return (i6 << 8) + i10;
        }
        androidx.core.content.pm.a.k(this.f3500b, "Invalid byte order: ");
        return 0;
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        int iMin = Math.min(i, this.f3501l - this.f3502m);
        int iSkipBytes = 0;
        while (iSkipBytes < iMin) {
            iSkipBytes += this.f3499a.skipBytes(iMin - iSkipBytes);
        }
        this.f3502m += iSkipBytes;
        return iSkipBytes;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i6) throws IOException {
        int i10 = this.f3499a.read(bArr, i, i6);
        this.f3502m += i10;
        return i10;
    }

    public a(byte[] bArr) {
        this(new ByteArrayInputStream(bArr));
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i6) throws IOException {
        int i10 = this.f3502m + i6;
        this.f3502m = i10;
        if (i10 <= this.f3501l) {
            if (this.f3499a.read(bArr, i, i6) == i6) {
                return;
            }
            com.google.gson.internal.a.n("Couldn't read up to the length of buffer");
            return;
        }
        o.d();
    }
}
