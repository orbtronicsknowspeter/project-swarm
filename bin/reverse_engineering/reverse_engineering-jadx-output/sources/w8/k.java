package w8;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public class k implements Serializable, Comparable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final k f10970m = new k(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f10971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient int f10972b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public transient String f10973l;

    public k(byte[] bArr) {
        bArr.getClass();
        this.f10971a = bArr;
    }

    public static final k c(String str) {
        int i;
        char cCharAt;
        str.getClass();
        byte[] bArr = a.f10932a;
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i6 = (int) ((((long) length) * 6) / 8);
        byte[] bArrCopyOf = new byte[i6];
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i10 < length) {
                char cCharAt2 = str.charAt(i10);
                if ('A' <= cCharAt2 && cCharAt2 < '[') {
                    i = cCharAt2 - 'A';
                } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                    i = cCharAt2 - 'G';
                } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                    i = cCharAt2 + 4;
                } else if (cCharAt2 != '+' && cCharAt2 != '-') {
                    if (cCharAt2 != '/' && cCharAt2 != '_') {
                        if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                            break;
                        }
                        i10++;
                    } else {
                        i = 63;
                    }
                } else {
                    i = 62;
                }
                i12 = (i12 << 6) | i;
                i11++;
                if (i11 % 4 == 0) {
                    bArrCopyOf[i13] = (byte) (i12 >> 16);
                    int i14 = i13 + 2;
                    bArrCopyOf[i13 + 1] = (byte) (i12 >> 8);
                    i13 += 3;
                    bArrCopyOf[i14] = (byte) i12;
                }
                i10++;
            } else {
                int i15 = i11 % 4;
                if (i15 != 1) {
                    if (i15 == 2) {
                        bArrCopyOf[i13] = (byte) ((i12 << 12) >> 16);
                        i13++;
                    } else if (i15 == 3) {
                        int i16 = i12 << 6;
                        int i17 = i13 + 1;
                        bArrCopyOf[i13] = (byte) (i16 >> 16);
                        i13 += 2;
                        bArrCopyOf[i17] = (byte) (i16 >> 8);
                    }
                    if (i13 != i6) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, i13);
                    }
                }
            }
        }
        bArrCopyOf = null;
        if (bArrCopyOf != null) {
            return new k(bArrCopyOf);
        }
        return null;
    }

    public static final void d(String str) {
        if (str.length() % 2 != 0) {
            s1.o.o("Unexpected hex string: ".concat(str));
            return;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i6 = i * 2;
            bArr[i] = (byte) (x8.b.a(str.charAt(i6 + 1)) + (x8.b.a(str.charAt(i6)) << 4));
        }
        new k(bArr);
    }

    public static int i(k kVar, k kVar2) {
        kVar.getClass();
        kVar2.getClass();
        return kVar.h(0, kVar2.j());
    }

    public static int m(k kVar, k kVar2) {
        kVar.getClass();
        kVar2.getClass();
        return kVar.l(kVar2.j());
    }

    public static final k n(byte... bArr) {
        bArr.getClass();
        return new k(Arrays.copyOf(bArr, bArr.length));
    }

    public static /* synthetic */ k r(k kVar, int i, int i6, int i10) {
        if ((i10 & 1) != 0) {
            i = 0;
        }
        if ((i10 & 2) != 0) {
            i6 = -1234567890;
        }
        return kVar.q(i, i6);
    }

    public String a() {
        byte[] bArr = a.f10932a;
        byte[] bArr2 = this.f10971a;
        bArr2.getClass();
        bArr.getClass();
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i = 0;
        int i6 = 0;
        while (i < length) {
            byte b7 = bArr2[i];
            int i10 = i + 2;
            byte b10 = bArr2[i + 1];
            i += 3;
            byte b11 = bArr2[i10];
            bArr3[i6] = bArr[(b7 & 255) >> 2];
            bArr3[i6 + 1] = bArr[((b7 & 3) << 4) | ((b10 & 255) >> 4)];
            int i11 = i6 + 3;
            bArr3[i6 + 2] = bArr[((b10 & 15) << 2) | ((b11 & 255) >> 6)];
            i6 += 4;
            bArr3[i11] = bArr[b11 & 63];
        }
        int length2 = bArr2.length - length;
        if (length2 == 1) {
            byte b12 = bArr2[i];
            bArr3[i6] = bArr[(b12 & 255) >> 2];
            bArr3[i6 + 1] = bArr[(b12 & 3) << 4];
            bArr3[i6 + 2] = 61;
            bArr3[i6 + 3] = 61;
        } else if (length2 == 2) {
            int i12 = i + 1;
            byte b13 = bArr2[i];
            byte b14 = bArr2[i12];
            bArr3[i6] = bArr[(b13 & 255) >> 2];
            bArr3[i6 + 1] = bArr[((b13 & 3) << 4) | ((b14 & 255) >> 4)];
            bArr3[i6 + 2] = bArr[(b14 & 15) << 2];
            bArr3[i6 + 3] = 61;
        }
        return new String(bArr3, l7.a.f7151a);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(k kVar) {
        kVar.getClass();
        int iF = f();
        int iF2 = kVar.f();
        int iMin = Math.min(iF, iF2);
        for (int i = 0; i < iMin; i++) {
            int iK = k(i) & 255;
            int iK2 = kVar.k(i) & 255;
            if (iK != iK2) {
                return iK < iK2 ? -1 : 1;
            }
        }
        if (iF == iF2) {
            return 0;
        }
        return iF < iF2 ? -1 : 1;
    }

    public k e(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f10971a, 0, f());
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return new k(bArrDigest);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            int iF = kVar.f();
            byte[] bArr = this.f10971a;
            if (iF == bArr.length && kVar.p(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int f() {
        return this.f10971a.length;
    }

    public String g() {
        byte[] bArr = this.f10971a;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b7 : bArr) {
            int i6 = i + 1;
            char[] cArr2 = x8.b.f11546a;
            cArr[i] = cArr2[(b7 >> 4) & 15];
            i += 2;
            cArr[i6] = cArr2[b7 & 15];
        }
        return new String(cArr);
    }

    public int h(int i, byte[] bArr) {
        bArr.getClass();
        byte[] bArr2 = this.f10971a;
        int length = bArr2.length - bArr.length;
        int iMax = Math.max(i, 0);
        if (iMax > length) {
            return -1;
        }
        while (!a.a.k(bArr2, iMax, bArr, 0, bArr.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public int hashCode() {
        int i = this.f10972b;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f10971a);
        this.f10972b = iHashCode;
        return iHashCode;
    }

    public byte[] j() {
        return this.f10971a;
    }

    public byte k(int i) {
        return this.f10971a[i];
    }

    public int l(byte[] bArr) {
        bArr.getClass();
        int iF = f();
        byte[] bArr2 = this.f10971a;
        for (int iMin = Math.min(iF, bArr2.length - bArr.length); -1 < iMin; iMin--) {
            if (a.a.k(bArr2, iMin, bArr, 0, bArr.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public boolean o(int i, k kVar, int i6) {
        kVar.getClass();
        return kVar.p(0, this.f10971a, i, i6);
    }

    public boolean p(int i, byte[] bArr, int i6, int i10) {
        bArr.getClass();
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.f10971a;
        return i <= bArr2.length - i10 && i6 >= 0 && i6 <= bArr.length - i10 && a.a.k(bArr2, i, bArr, i6, i10);
    }

    public k q(int i, int i6) {
        if (i6 == -1234567890) {
            i6 = f();
        }
        if (i < 0) {
            com.google.gson.internal.a.p("beginIndex < 0");
            return null;
        }
        byte[] bArr = this.f10971a;
        if (i6 > bArr.length) {
            s1.o.f(bArr.length, 41, "endIndex > length(");
            return null;
        }
        if (i6 - i < 0) {
            com.google.gson.internal.a.p("endIndex < beginIndex");
            return null;
        }
        if (i == 0 && i6 == bArr.length) {
            return this;
        }
        t0.f.m(i6, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i6);
        bArrCopyOfRange.getClass();
        return new k(bArrCopyOfRange);
    }

    public k s() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f10971a;
            if (i >= bArr.length) {
                return this;
            }
            byte b7 = bArr[i];
            if (b7 >= 65 && b7 <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                bArrCopyOf[i] = (byte) (b7 + 32);
                for (int i6 = i + 1; i6 < bArrCopyOf.length; i6++) {
                    byte b10 = bArrCopyOf[i6];
                    if (b10 >= 65 && b10 <= 90) {
                        bArrCopyOf[i6] = (byte) (b10 + 32);
                    }
                }
                return new k(bArrCopyOf);
            }
            i++;
        }
    }

    public final String t() {
        String str = this.f10973l;
        if (str != null) {
            return str;
        }
        byte[] bArrJ = j();
        bArrJ.getClass();
        String str2 = new String(bArrJ, l7.a.f7151a);
        this.f10973l = str2;
        return str2;
    }

    public String toString() {
        k kVar;
        byte b7;
        int i;
        byte[] bArr = this.f10971a;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i6 = 0;
        int i10 = 0;
        int i11 = 0;
        loop0: while (true) {
            if (i6 >= length) {
                break;
            }
            byte b10 = bArr[i6];
            if (b10 >= 0) {
                int i12 = i11 + 1;
                if (i11 == 64) {
                    break;
                }
                if ((b10 != 10 && b10 != 13 && ((b10 >= 0 && b10 < 32) || (127 <= b10 && b10 < 160))) || b10 == 65533) {
                    break;
                }
                i10 += b10 < 65536 ? 1 : 2;
                i6++;
                while (true) {
                    i11 = i12;
                    if (i6 < length && (b7 = bArr[i6]) >= 0) {
                        i6++;
                        i12 = i11 + 1;
                        if (i11 == 64) {
                            break loop0;
                        }
                        if ((b7 != 10 && b7 != 13 && ((b7 >= 0 && b7 < 32) || (127 <= b7 && b7 < 160))) || b7 == 65533) {
                            break loop0;
                        }
                        i10 += b7 < 65536 ? 1 : 2;
                    } else {
                        break;
                    }
                }
            } else if ((b10 >> 5) == -2) {
                int i13 = i6 + 1;
                if (length > i13) {
                    byte b11 = bArr[i13];
                    if ((b11 & 192) == 128) {
                        int i14 = (b11 ^ 3968) ^ (b10 << 6);
                        if (i14 >= 128) {
                            i = i11 + 1;
                            if (i11 == 64) {
                                break;
                            }
                            if ((i14 != 10 && i14 != 13 && ((i14 >= 0 && i14 < 32) || (127 <= i14 && i14 < 160))) || i14 == 65533) {
                                break;
                            }
                            i10 += i14 < 65536 ? 1 : 2;
                            i6 += 2;
                            i11 = i;
                        } else if (i11 != 64) {
                            break;
                        }
                    } else if (i11 != 64) {
                        break;
                    }
                } else if (i11 != 64) {
                    break;
                }
            } else if ((b10 >> 4) == -2) {
                int i15 = i6 + 2;
                if (length > i15) {
                    byte b12 = bArr[i6 + 1];
                    if ((b12 & 192) == 128) {
                        byte b13 = bArr[i15];
                        if ((b13 & 192) == 128) {
                            int i16 = ((b13 ^ (-123008)) ^ (b12 << 6)) ^ (b10 << 12);
                            if (i16 < 2048) {
                                if (i11 != 64) {
                                    break;
                                }
                            } else if (55296 > i16 || i16 >= 57344) {
                                i = i11 + 1;
                                if (i11 == 64) {
                                    break;
                                }
                                if ((i16 != 10 && i16 != 13 && ((i16 >= 0 && i16 < 32) || (127 <= i16 && i16 < 160))) || i16 == 65533) {
                                    break;
                                }
                                i10 += i16 < 65536 ? 1 : 2;
                                i6 += 3;
                                i11 = i;
                            } else if (i11 != 64) {
                                break;
                            }
                        } else if (i11 != 64) {
                            break;
                        }
                    } else if (i11 != 64) {
                        break;
                    }
                } else if (i11 != 64) {
                    break;
                }
            } else if ((b10 >> 3) == -2) {
                int i17 = i6 + 3;
                if (length > i17) {
                    byte b14 = bArr[i6 + 1];
                    if ((b14 & 192) == 128) {
                        byte b15 = bArr[i6 + 2];
                        if ((b15 & 192) == 128) {
                            byte b16 = bArr[i17];
                            if ((b16 & 192) == 128) {
                                int i18 = (((b16 ^ 3678080) ^ (b15 << 6)) ^ (b14 << 12)) ^ (b10 << 18);
                                if (i18 > 1114111) {
                                    if (i11 != 64) {
                                        break;
                                    }
                                } else if (55296 > i18 || i18 >= 57344) {
                                    if (i18 >= 65536) {
                                        i = i11 + 1;
                                        if (i11 == 64) {
                                            break;
                                        }
                                        if ((i18 != 10 && i18 != 13 && ((i18 >= 0 && i18 < 32) || (127 <= i18 && i18 < 160))) || i18 == 65533) {
                                            break;
                                        }
                                        i10 += i18 < 65536 ? 1 : 2;
                                        i6 += 4;
                                        i11 = i;
                                    } else if (i11 != 64) {
                                        break;
                                    }
                                } else if (i11 != 64) {
                                    break;
                                }
                            } else if (i11 != 64) {
                                break;
                            }
                        } else if (i11 != 64) {
                            break;
                        }
                    } else if (i11 != 64) {
                        break;
                    }
                } else if (i11 != 64) {
                    break;
                }
            } else if (i11 != 64) {
                break;
            }
        }
        i10 = -1;
        if (i10 != -1) {
            String strT = t();
            String strO0 = l7.u.o0(l7.u.o0(l7.u.o0(strT.substring(0, i10), "\\", "\\\\", false), "\n", "\\n", false), "\r", "\\r", false);
            if (i10 >= strT.length()) {
                return "[text=" + strO0 + ']';
            }
            return "[size=" + bArr.length + " text=" + strO0 + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + g() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 > bArr.length) {
            s1.o.f(bArr.length, 41, "endIndex > length(");
            return null;
        }
        if (64 == bArr.length) {
            kVar = this;
        } else {
            t0.f.m(64, bArr.length);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 64);
            bArrCopyOfRange.getClass();
            kVar = new k(bArrCopyOfRange);
        }
        sb.append(kVar.g());
        sb.append("…]");
        return sb.toString();
    }

    public void u(h hVar, int i) {
        hVar.write(this.f10971a, 0, i);
    }
}
