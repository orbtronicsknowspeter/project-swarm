package androidx.emoji2.text.flatbuffer;

import androidx.emoji2.text.flatbuffer.Utf8;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class Utf8Safe extends Utf8 {

    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i, int i6) {
            super("Unpaired surrogate at index " + i + " of " + i6);
        }
    }

    private static int computeEncodedLength(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int iEncodedLengthGeneral = length;
        while (true) {
            if (i < length) {
                char cCharAt = charSequence.charAt(i);
                if (cCharAt >= 2048) {
                    iEncodedLengthGeneral += encodedLengthGeneral(charSequence, i);
                    break;
                }
                iEncodedLengthGeneral += (127 - cCharAt) >>> 31;
                i++;
            } else {
                break;
            }
        }
        if (iEncodedLengthGeneral >= length) {
            return iEncodedLengthGeneral;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iEncodedLengthGeneral) + 4294967296L));
    }

    public static String decodeUtf8Array(byte[] bArr, int i, int i6) {
        if ((i | i6 | ((bArr.length - i) - i6)) < 0) {
            androidx.core.view.contentcapture.a.l("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i6)});
            return null;
        }
        int i10 = i + i6;
        char[] cArr = new char[i6];
        int i11 = 0;
        while (i < i10) {
            byte b7 = bArr[i];
            if (!Utf8.DecodeUtil.isOneByte(b7)) {
                break;
            }
            i++;
            Utf8.DecodeUtil.handleOneByte(b7, cArr, i11);
            i11++;
        }
        int i12 = i11;
        while (i < i10) {
            int i13 = i + 1;
            byte b10 = bArr[i];
            if (Utf8.DecodeUtil.isOneByte(b10)) {
                int i14 = i12 + 1;
                Utf8.DecodeUtil.handleOneByte(b10, cArr, i12);
                while (i13 < i10) {
                    byte b11 = bArr[i13];
                    if (!Utf8.DecodeUtil.isOneByte(b11)) {
                        break;
                    }
                    i13++;
                    Utf8.DecodeUtil.handleOneByte(b11, cArr, i14);
                    i14++;
                }
                i12 = i14;
                i = i13;
            } else if (Utf8.DecodeUtil.isTwoBytes(b10)) {
                if (i13 >= i10) {
                    com.google.gson.internal.a.p("Invalid UTF-8");
                    return null;
                }
                i += 2;
                Utf8.DecodeUtil.handleTwoBytes(b10, bArr[i13], cArr, i12);
                i12++;
            } else if (Utf8.DecodeUtil.isThreeBytes(b10)) {
                if (i13 >= i10 - 1) {
                    com.google.gson.internal.a.p("Invalid UTF-8");
                    return null;
                }
                int i15 = i + 2;
                i += 3;
                Utf8.DecodeUtil.handleThreeBytes(b10, bArr[i13], bArr[i15], cArr, i12);
                i12++;
            } else {
                if (i13 >= i10 - 2) {
                    com.google.gson.internal.a.p("Invalid UTF-8");
                    return null;
                }
                byte b12 = bArr[i13];
                int i16 = i + 3;
                byte b13 = bArr[i + 2];
                i += 4;
                Utf8.DecodeUtil.handleFourBytes(b10, b12, b13, bArr[i16], cArr, i12);
                i12 += 2;
            }
        }
        return new String(cArr, 0, i12);
    }

    public static String decodeUtf8Buffer(ByteBuffer byteBuffer, int i, int i6) {
        if ((i | i6 | ((byteBuffer.limit() - i) - i6)) < 0) {
            androidx.core.view.contentcapture.a.l("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i6)});
            return null;
        }
        int i10 = i + i6;
        char[] cArr = new char[i6];
        int i11 = 0;
        while (i < i10) {
            byte b7 = byteBuffer.get(i);
            if (!Utf8.DecodeUtil.isOneByte(b7)) {
                break;
            }
            i++;
            Utf8.DecodeUtil.handleOneByte(b7, cArr, i11);
            i11++;
        }
        int i12 = i11;
        while (i < i10) {
            int i13 = i + 1;
            byte b10 = byteBuffer.get(i);
            if (Utf8.DecodeUtil.isOneByte(b10)) {
                int i14 = i12 + 1;
                Utf8.DecodeUtil.handleOneByte(b10, cArr, i12);
                while (i13 < i10) {
                    byte b11 = byteBuffer.get(i13);
                    if (!Utf8.DecodeUtil.isOneByte(b11)) {
                        break;
                    }
                    i13++;
                    Utf8.DecodeUtil.handleOneByte(b11, cArr, i14);
                    i14++;
                }
                i12 = i14;
                i = i13;
            } else if (Utf8.DecodeUtil.isTwoBytes(b10)) {
                if (i13 >= i10) {
                    com.google.gson.internal.a.p("Invalid UTF-8");
                    return null;
                }
                i += 2;
                Utf8.DecodeUtil.handleTwoBytes(b10, byteBuffer.get(i13), cArr, i12);
                i12++;
            } else if (Utf8.DecodeUtil.isThreeBytes(b10)) {
                if (i13 >= i10 - 1) {
                    com.google.gson.internal.a.p("Invalid UTF-8");
                    return null;
                }
                int i15 = i + 2;
                i += 3;
                Utf8.DecodeUtil.handleThreeBytes(b10, byteBuffer.get(i13), byteBuffer.get(i15), cArr, i12);
                i12++;
            } else {
                if (i13 >= i10 - 2) {
                    com.google.gson.internal.a.p("Invalid UTF-8");
                    return null;
                }
                byte b12 = byteBuffer.get(i13);
                int i16 = i + 3;
                byte b13 = byteBuffer.get(i + 2);
                i += 4;
                Utf8.DecodeUtil.handleFourBytes(b10, b12, b13, byteBuffer.get(i16), cArr, i12);
                i12 += 2;
            }
        }
        return new String(cArr, 0, i12);
    }

    private static int encodeUtf8Array(CharSequence charSequence, byte[] bArr, int i, int i6) {
        int i10;
        int i11;
        char cCharAt;
        int length = charSequence.length();
        int i12 = i6 + i;
        int i13 = 0;
        while (i13 < length && (i11 = i13 + i) < i12 && (cCharAt = charSequence.charAt(i13)) < 128) {
            bArr[i11] = (byte) cCharAt;
            i13++;
        }
        if (i13 == length) {
            return i + length;
        }
        int i14 = i + i13;
        while (i13 < length) {
            char cCharAt2 = charSequence.charAt(i13);
            if (cCharAt2 < 128 && i14 < i12) {
                bArr[i14] = (byte) cCharAt2;
                i14++;
            } else if (cCharAt2 < 2048 && i14 <= i12 - 2) {
                int i15 = i14 + 1;
                bArr[i14] = (byte) ((cCharAt2 >>> 6) | 960);
                i14 += 2;
                bArr[i15] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i14 > i12 - 3) {
                    if (i14 > i12 - 4) {
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i10 = i13 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i10)))) {
                            throw new UnpairedSurrogateException(i13, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i14);
                    }
                    int i16 = i13 + 1;
                    if (i16 != charSequence.length()) {
                        char cCharAt3 = charSequence.charAt(i16);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i14] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i14 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i17 = i14 + 3;
                            bArr[i14 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i14 += 4;
                            bArr[i17] = (byte) ((codePoint & 63) | 128);
                            i13 = i16;
                        } else {
                            i13 = i16;
                        }
                    }
                    throw new UnpairedSurrogateException(i13 - 1, length);
                }
                bArr[i14] = (byte) ((cCharAt2 >>> '\f') | 480);
                int i18 = i14 + 2;
                bArr[i14 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                i14 += 3;
                bArr[i18] = (byte) ((cCharAt2 & '?') | 128);
            }
            i13++;
        }
        return i14;
    }

    private static void encodeUtf8Buffer(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i;
        int length = charSequence.length();
        int iPosition = byteBuffer.position();
        int i6 = 0;
        while (i6 < length) {
            try {
                char cCharAt = charSequence.charAt(i6);
                if (cCharAt >= 128) {
                    break;
                }
                byteBuffer.put(iPosition + i6, (byte) cCharAt);
                i6++;
            } catch (IndexOutOfBoundsException unused) {
                androidx.core.view.contentcapture.a.e(charSequence.charAt(i6), Math.max(i6, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position());
                return;
            }
        }
        if (i6 == length) {
            byteBuffer.position(iPosition + i6);
            return;
        }
        iPosition += i6;
        while (i6 < length) {
            char cCharAt2 = charSequence.charAt(i6);
            if (cCharAt2 < 128) {
                byteBuffer.put(iPosition, (byte) cCharAt2);
            } else if (cCharAt2 < 2048) {
                int i10 = iPosition + 1;
                try {
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> 6) | 192));
                    byteBuffer.put(i10, (byte) ((cCharAt2 & '?') | 128));
                    iPosition = i10;
                } catch (IndexOutOfBoundsException unused2) {
                    iPosition = i10;
                    androidx.core.view.contentcapture.a.e(charSequence.charAt(i6), Math.max(i6, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position());
                    return;
                }
            } else {
                if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                    int i11 = i6 + 1;
                    if (i11 != length) {
                        try {
                            char cCharAt3 = charSequence.charAt(i11);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                int i12 = iPosition + 1;
                                try {
                                    byteBuffer.put(iPosition, (byte) ((codePoint >>> 18) | 240));
                                    i = iPosition + 2;
                                } catch (IndexOutOfBoundsException unused3) {
                                    iPosition = i12;
                                    i6 = i11;
                                    androidx.core.view.contentcapture.a.e(charSequence.charAt(i6), Math.max(i6, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position());
                                    return;
                                }
                                try {
                                    byteBuffer.put(i12, (byte) (((codePoint >>> 12) & 63) | 128));
                                    iPosition += 3;
                                    byteBuffer.put(i, (byte) (((codePoint >>> 6) & 63) | 128));
                                    byteBuffer.put(iPosition, (byte) ((codePoint & 63) | 128));
                                    i6 = i11;
                                } catch (IndexOutOfBoundsException unused4) {
                                    i6 = i11;
                                    iPosition = i;
                                    androidx.core.view.contentcapture.a.e(charSequence.charAt(i6), Math.max(i6, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position());
                                    return;
                                }
                            } else {
                                i6 = i11;
                            }
                        } catch (IndexOutOfBoundsException unused5) {
                        }
                    }
                    throw new UnpairedSurrogateException(i6, length);
                }
                int i13 = iPosition + 1;
                byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> '\f') | 224));
                iPosition += 2;
                byteBuffer.put(i13, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                byteBuffer.put(iPosition, (byte) ((cCharAt2 & '?') | 128));
            }
            i6++;
            iPosition++;
        }
        byteBuffer.position(iPosition);
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i6 = 0;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt < 2048) {
                i6 += (127 - cCharAt) >>> 31;
            } else {
                i6 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i) < 65536) {
                        throw new UnpairedSurrogateException(i, length);
                    }
                    i++;
                }
            }
            i++;
        }
        return i6;
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public String decodeUtf8(ByteBuffer byteBuffer, int i, int i6) throws IllegalArgumentException {
        return byteBuffer.hasArray() ? decodeUtf8Array(byteBuffer.array(), byteBuffer.arrayOffset() + i, i6) : decodeUtf8Buffer(byteBuffer, i, i6);
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            encodeUtf8Buffer(charSequence, byteBuffer);
        } else {
            int iArrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(encodeUtf8Array(charSequence, byteBuffer.array(), byteBuffer.position() + iArrayOffset, byteBuffer.remaining()) - iArrayOffset);
        }
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public int encodedLength(CharSequence charSequence) {
        return computeEncodedLength(charSequence);
    }
}
