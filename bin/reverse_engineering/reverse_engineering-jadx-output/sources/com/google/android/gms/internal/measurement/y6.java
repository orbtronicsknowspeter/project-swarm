package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class y6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2919a = 0;

    static {
        if (w6.f2890e && w6.f2889d) {
            int i = u4.f2819a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0076 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x007a A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(int r6, int r7, byte[] r8) {
        /*
        L0:
            if (r6 >= r7) goto L9
            r0 = r8[r6]
            if (r0 < 0) goto L9
            int r6 = r6 + 1
            goto L0
        L9:
            if (r6 < r7) goto Ld
            goto L7a
        Ld:
            if (r6 >= r7) goto L7a
            int r0 = r6 + 1
            r1 = r8[r6]
            if (r1 >= 0) goto L78
            r2 = -32
            r3 = -65
            if (r1 >= r2) goto L29
            if (r0 < r7) goto L1e
            goto L57
        L1e:
            r2 = -62
            if (r1 < r2) goto L76
            int r6 = r6 + 2
            r0 = r8[r0]
            if (r0 <= r3) goto Ld
            goto L76
        L29:
            r4 = -16
            if (r1 >= r4) goto L4f
            int r4 = r7 + (-1)
            if (r0 < r4) goto L36
            int r1 = d(r0, r7, r8)
            goto L57
        L36:
            int r4 = r6 + 2
            r0 = r8[r0]
            if (r0 > r3) goto L76
            r5 = -96
            if (r1 != r2) goto L42
            if (r0 < r5) goto L76
        L42:
            r2 = -19
            if (r1 != r2) goto L48
            if (r0 >= r5) goto L76
        L48:
            int r6 = r6 + 3
            r0 = r8[r4]
            if (r0 <= r3) goto Ld
            goto L76
        L4f:
            int r2 = r7 + (-2)
            if (r0 < r2) goto L5a
            int r1 = d(r0, r7, r8)
        L57:
            if (r1 == 0) goto L7a
            goto L76
        L5a:
            int r2 = r6 + 2
            r0 = r8[r0]
            if (r0 > r3) goto L76
            int r1 = r1 << 28
            int r0 = r0 + 112
            int r0 = r0 + r1
            int r0 = r0 >> 30
            if (r0 != 0) goto L76
            int r0 = r6 + 3
            r1 = r8[r2]
            if (r1 > r3) goto L76
            int r6 = r6 + 4
            r0 = r8[r0]
            if (r0 > r3) goto L76
            goto Ld
        L76:
            r6 = 0
            return r6
        L78:
            r6 = r0
            goto Ld
        L7a:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.y6.a(int, int, byte[]):boolean");
    }

    public static int b(String str) {
        int length = str.length();
        int i = 0;
        int i6 = 0;
        while (i6 < length && str.charAt(i6) < 128) {
            i6++;
        }
        int i10 = length;
        while (true) {
            if (i6 >= length) {
                break;
            }
            char cCharAt = str.charAt(i6);
            if (cCharAt < 2048) {
                i10 += (127 - cCharAt) >>> 31;
                i6++;
            } else {
                int length2 = str.length();
                while (i6 < length2) {
                    char cCharAt2 = str.charAt(i6);
                    if (cCharAt2 < 2048) {
                        i += (127 - cCharAt2) >>> 31;
                    } else {
                        i += 2;
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i6) < 65536) {
                                throw new x6(i6, length2);
                            }
                            i6++;
                        }
                    }
                    i6++;
                }
                i10 += i;
            }
        }
        if (i10 >= length) {
            return i10;
        }
        long j = ((long) i10) + 4294967296L;
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 34);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    public static int c(String str, byte[] bArr, int i, int i6) {
        int i10;
        int i11;
        int i12;
        char cCharAt;
        int length = str.length();
        int i13 = 0;
        while (true) {
            i10 = i + i6;
            if (i13 >= length || (i12 = i13 + i) >= i10 || (cCharAt = str.charAt(i13)) >= 128) {
                break;
            }
            bArr[i12] = (byte) cCharAt;
            i13++;
        }
        if (i13 == length) {
            return i + length;
        }
        int i14 = i + i13;
        while (i13 < length) {
            char cCharAt2 = str.charAt(i13);
            if (cCharAt2 < 128 && i14 < i10) {
                bArr[i14] = (byte) cCharAt2;
                i14++;
            } else if (cCharAt2 < 2048 && i14 <= i10 - 2) {
                bArr[i14] = (byte) ((cCharAt2 >>> 6) | 960);
                bArr[i14 + 1] = (byte) ((cCharAt2 & '?') | 128);
                i14 += 2;
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i14 > i10 - 3) {
                    if (i14 > i10 - 4) {
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i11 = i13 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i11)))) {
                            throw new x6(i13, length);
                        }
                        StringBuilder sb = new StringBuilder(String.valueOf(cCharAt2).length() + 25 + String.valueOf(i14).length());
                        sb.append("Failed writing ");
                        sb.append(cCharAt2);
                        sb.append(" at index ");
                        sb.append(i14);
                        throw new ArrayIndexOutOfBoundsException(sb.toString());
                    }
                    int i15 = i13 + 1;
                    if (i15 != str.length()) {
                        char cCharAt3 = str.charAt(i15);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int i16 = i14 + 3;
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i14] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i14 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i14 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i14 += 4;
                            bArr[i16] = (byte) ((codePoint & 63) | 128);
                            i13 = i15;
                        } else {
                            i13 = i15;
                        }
                    }
                    throw new x6(i13 - 1, length);
                }
                bArr[i14] = (byte) ((cCharAt2 >>> '\f') | 480);
                bArr[i14 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                bArr[i14 + 2] = (byte) ((cCharAt2 & '?') | 128);
                i14 += 3;
            }
            i13++;
        }
        return i14;
    }

    public static /* synthetic */ int d(int i, int i6, byte[] bArr) {
        int i10 = i6 - i;
        byte b7 = bArr[i - 1];
        if (i10 == 0) {
            if (b7 <= -12) {
                return b7;
            }
            return -1;
        }
        if (i10 == 1) {
            byte b10 = bArr[i];
            if (b7 > -12 || b10 > -65) {
                return -1;
            }
            return (b10 << 8) ^ b7;
        }
        if (i10 != 2) {
            throw new AssertionError();
        }
        byte b11 = bArr[i];
        byte b12 = bArr[i + 1];
        if (b7 > -12 || b11 > -65 || b12 > -65) {
            return -1;
        }
        return (b12 << 16) ^ ((b11 << 8) ^ b7);
    }
}
