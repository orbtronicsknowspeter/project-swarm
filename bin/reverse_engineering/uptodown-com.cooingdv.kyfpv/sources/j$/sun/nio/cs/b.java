package j$.sun.nio.cs;

import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends CharsetEncoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f5729a;

    @Override // java.nio.charset.CharsetEncoder
    public final boolean canEncode(char c9) {
        return c9 <= 255;
    }

    @Override // java.nio.charset.CharsetEncoder
    public final boolean isLegalReplacement(byte[] bArr) {
        return true;
    }

    public b(c cVar) {
        super(cVar, 1.0f, 1.0f);
        e eVar = new e();
        eVar.f5732a = CoderResult.UNDERFLOW;
        this.f5729a = eVar;
    }

    public static int a(char[] cArr, int i, byte[] bArr, int i6, int i10) {
        int i11 = 0;
        if (i10 <= 0) {
            return 0;
        }
        Objects.requireNonNull(cArr);
        Objects.requireNonNull(bArr);
        if (i < 0 || i >= cArr.length) {
            throw new ArrayIndexOutOfBoundsException(i);
        }
        if (i6 < 0 || i6 >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i6);
        }
        int i12 = (i + i10) - 1;
        if (i12 < 0 || i12 >= cArr.length) {
            throw new ArrayIndexOutOfBoundsException(i12);
        }
        int i13 = (i6 + i10) - 1;
        if (i13 < 0 || i13 >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i13);
        }
        while (i11 < i10) {
            int i14 = i + 1;
            char c9 = cArr[i];
            if (c9 > 255) {
                break;
            }
            bArr[i6] = (byte) c9;
            i11++;
            i = i14;
            i6++;
        }
        return i11;
    }

    @Override // java.nio.charset.CharsetEncoder
    public final CoderResult encodeLoop(CharBuffer charBuffer, ByteBuffer byteBuffer) {
        CoderResult coderResultUnmappableForLength;
        CoderResult coderResultUnmappableForLength2;
        int i = 2;
        if (!charBuffer.hasArray() || !byteBuffer.hasArray()) {
            int iPosition = charBuffer.position();
            while (true) {
                try {
                    if (!charBuffer.hasRemaining()) {
                        coderResultUnmappableForLength = CoderResult.UNDERFLOW;
                        break;
                    }
                    char c9 = charBuffer.get();
                    if (c9 > 255) {
                        int iA = this.f5729a.a(c9, charBuffer);
                        e eVar = this.f5729a;
                        if (iA < 0) {
                            coderResultUnmappableForLength = eVar.f5732a;
                        } else {
                            if (!eVar.f5733b) {
                                i = 1;
                            }
                            coderResultUnmappableForLength = CoderResult.unmappableForLength(i);
                        }
                    } else {
                        if (!byteBuffer.hasRemaining()) {
                            coderResultUnmappableForLength = CoderResult.OVERFLOW;
                            break;
                        }
                        byteBuffer.put((byte) c9);
                        iPosition++;
                    }
                } finally {
                }
            }
            return coderResultUnmappableForLength;
        }
        char[] cArrArray = charBuffer.array();
        int iArrayOffset = charBuffer.arrayOffset();
        int iPosition2 = charBuffer.position() + iArrayOffset;
        int iLimit = charBuffer.limit() + iArrayOffset;
        if (iPosition2 > iLimit) {
            iPosition2 = iLimit;
        }
        byte[] bArrArray = byteBuffer.array();
        int iArrayOffset2 = byteBuffer.arrayOffset();
        int iPosition3 = byteBuffer.position() + iArrayOffset2;
        int iLimit2 = byteBuffer.limit() + iArrayOffset2;
        if (iPosition3 > iLimit2) {
            iPosition3 = iLimit2;
        }
        int i6 = iLimit2 - iPosition3;
        int i10 = iLimit - iPosition2;
        if (i6 >= i10) {
            i6 = i10;
        }
        try {
            int iA2 = a(cArrArray, iPosition2, bArrArray, iPosition3, i6);
            int i11 = iPosition2 + iA2;
            int i12 = iPosition3 + iA2;
            if (iA2 != i6) {
                int iB = this.f5729a.b(cArrArray[i11], cArrArray, i11, iLimit);
                e eVar2 = this.f5729a;
                if (iB < 0) {
                    coderResultUnmappableForLength2 = eVar2.f5732a;
                } else {
                    if (!eVar2.f5733b) {
                        i = 1;
                    }
                    coderResultUnmappableForLength2 = CoderResult.unmappableForLength(i);
                }
            } else {
                coderResultUnmappableForLength2 = i6 < i10 ? CoderResult.OVERFLOW : CoderResult.UNDERFLOW;
            }
            return coderResultUnmappableForLength2;
        } catch (Throwable th) {
            throw th;
        }
    }
}
