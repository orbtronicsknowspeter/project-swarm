package androidx.collection;

import a3.b;
import a4.x;
import androidx.privacysandbox.ads.adservices.customaudience.a;
import d7.l;
import d7.p;
import kotlin.jvm.internal.g;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public abstract class LongLongMap {
    public int _capacity;
    public int _size;
    public long[] keys;
    public long[] metadata;
    public long[] values;

    private LongLongMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = LongSetKt.getEmptyLongArray();
        this.values = LongSetKt.getEmptyLongArray();
    }

    public static /* synthetic */ String joinToString$default(LongLongMap longLongMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, p pVar, int i6, Object obj) {
        long[] jArr;
        long[] jArr2;
        int i10;
        if (obj != null) {
            b.r("Super calls with default arguments not supported in this target, function: joinToString");
            return null;
        }
        CharSequence charSequence5 = (i6 & 1) != 0 ? ", " : charSequence;
        CharSequence charSequence6 = (i6 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence7 = (i6 & 4) == 0 ? charSequence3 : "";
        int i11 = (i6 & 8) != 0 ? -1 : i;
        CharSequence charSequence8 = (i6 & 16) != 0 ? "..." : charSequence4;
        StringBuilder sbR = x.r(charSequence5, charSequence6, charSequence7, charSequence8, pVar);
        sbR.append(charSequence6);
        long[] jArr3 = longLongMap.keys;
        long[] jArr4 = longLongMap.values;
        long[] jArr5 = longLongMap.metadata;
        int length = jArr5.length - 2;
        if (length >= 0) {
            int i12 = 0;
            int i13 = 0;
            loop0: while (true) {
                long j = jArr5[i12];
                int i14 = i12;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8;
                    int i16 = 8 - ((~(i14 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j & 255) < 128) {
                            int i18 = (i14 << 3) + i17;
                            long j6 = jArr3[i18];
                            long j10 = jArr4[i18];
                            if (i13 == i11) {
                                sbR.append(charSequence8);
                                break loop0;
                            }
                            if (i13 != 0) {
                                sbR.append(charSequence5);
                            }
                            i10 = i15;
                            jArr2 = jArr5;
                            sbR.append((CharSequence) pVar.invoke(Long.valueOf(j6), Long.valueOf(j10)));
                            i13++;
                        } else {
                            jArr2 = jArr5;
                            i10 = i15;
                        }
                        j >>= i10;
                        i17++;
                        i15 = i10;
                        jArr5 = jArr2;
                    }
                    jArr = jArr5;
                    if (i16 != i15) {
                        break;
                    }
                } else {
                    jArr = jArr5;
                }
                if (i14 == length) {
                    break;
                }
                i12 = i14 + 1;
                jArr5 = jArr;
            }
            sbR.append(charSequence7);
        } else {
            sbR.append(charSequence7);
        }
        return sbR.toString();
    }

    public final boolean all(p pVar) {
        pVar.getClass();
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr3[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8 - ((~(i - length)) >>> 31);
                for (int i10 = 0; i10 < i6; i10++) {
                    if ((255 & j) < 128) {
                        int i11 = (i << 3) + i10;
                        if (!((Boolean) pVar.invoke(Long.valueOf(jArr[i11]), Long.valueOf(jArr2[i11]))).booleanValue()) {
                            return false;
                        }
                    }
                    j >>= 8;
                }
                if (i6 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean any(p pVar) {
        pVar.getClass();
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr3[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i - length)) >>> 31);
                    for (int i10 = 0; i10 < i6; i10++) {
                        if ((255 & j) < 128) {
                            int i11 = (i << 3) + i10;
                            if (((Boolean) pVar.invoke(Long.valueOf(jArr[i11]), Long.valueOf(jArr2[i11]))).booleanValue()) {
                                return true;
                            }
                        }
                        j >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    public final boolean contains(long j) {
        return findKeyIndex(j) >= 0;
    }

    public final boolean containsKey(long j) {
        return findKeyIndex(j) >= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean containsValue(long r15) {
        /*
            r14 = this;
            long[] r0 = r14.values
            long[] r1 = r14.metadata
            int r2 = r1.length
            int r2 = r2 + (-2)
            r3 = 0
            if (r2 < 0) goto L46
            r4 = r3
        Lb:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L41
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L25:
            if (r9 >= r7) goto L3f
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3b
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            int r10 = (r15 > r10 ? 1 : (r15 == r10 ? 0 : -1))
            if (r10 != 0) goto L3b
            r0 = 1
            return r0
        L3b:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L25
        L3f:
            if (r7 != r8) goto L46
        L41:
            if (r4 == r2) goto L46
            int r4 = r4 + 1
            goto Lb
        L46:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongLongMap.containsValue(long):boolean");
    }

    public final int count(p pVar) {
        pVar.getClass();
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i6 = 0;
        while (true) {
            long j = jArr3[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j) < 128) {
                        int i12 = (i << 3) + i11;
                        if (((Boolean) pVar.invoke(Long.valueOf(jArr[i12]), Long.valueOf(jArr2[i12]))).booleanValue()) {
                            i6++;
                        }
                    }
                    j >>= 8;
                }
                if (i10 != 8) {
                    return i6;
                }
            }
            if (i == length) {
                return i6;
            }
            i++;
        }
    }

    public boolean equals(Object obj) {
        boolean z9;
        long[] jArr;
        boolean z10;
        long[] jArr2;
        boolean z11 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LongLongMap)) {
            return false;
        }
        LongLongMap longLongMap = (LongLongMap) obj;
        if (longLongMap.getSize() != getSize()) {
            return false;
        }
        long[] jArr3 = this.keys;
        long[] jArr4 = this.values;
        long[] jArr5 = this.metadata;
        int length = jArr5.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr5[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8 - ((~(i - length)) >>> 31);
                int i10 = 0;
                while (i10 < i6) {
                    if ((255 & j) < 128) {
                        int i11 = (i << 3) + i10;
                        z10 = z11;
                        jArr2 = jArr3;
                        if (jArr4[i11] != longLongMap.get(jArr2[i11])) {
                            return false;
                        }
                    } else {
                        z10 = z11;
                        jArr2 = jArr3;
                    }
                    j >>= 8;
                    i10++;
                    z11 = z10;
                    jArr3 = jArr2;
                }
                z9 = z11;
                jArr = jArr3;
                if (i6 != 8) {
                    return z9;
                }
            } else {
                z9 = z11;
                jArr = jArr3;
            }
            if (i == length) {
                return z9;
            }
            i++;
            z11 = z9;
            jArr3 = jArr;
        }
    }

    public final int findKeyIndex(long j) {
        int i = ((int) ((j >>> 32) ^ j)) * ScatterMapKt.MurmurHashC1;
        int i6 = i ^ (i << 16);
        int i10 = i6 & 127;
        int i11 = this._capacity;
        int i12 = (i6 >>> 7) & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j6 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j10 = (((long) i10) * ScatterMapKt.BitmaskLsb) ^ j6;
            for (long j11 = (~j10) & (j10 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i12) & i11;
                if (this.keys[iNumberOfTrailingZeros] == j) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j6 & ((~j6) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    public final void forEach(p pVar) {
        pVar.getClass();
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr3[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8 - ((~(i - length)) >>> 31);
                for (int i10 = 0; i10 < i6; i10++) {
                    if ((255 & j) < 128) {
                        int i11 = (i << 3) + i10;
                        pVar.invoke(Long.valueOf(jArr[i11]), Long.valueOf(jArr2[i11]));
                    }
                    j >>= 8;
                }
                if (i6 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void forEachIndexed(l lVar) {
        lVar.getClass();
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8 - ((~(i - length)) >>> 31);
                for (int i10 = 0; i10 < i6; i10++) {
                    if ((255 & j) < 128) {
                        x.x(i << 3, i10, lVar);
                    }
                    j >>= 8;
                }
                if (i6 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void forEachKey(l lVar) {
        lVar.getClass();
        long[] jArr = this.keys;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8 - ((~(i - length)) >>> 31);
                for (int i10 = 0; i10 < i6; i10++) {
                    if ((255 & j) < 128) {
                        lVar.invoke(Long.valueOf(jArr[(i << 3) + i10]));
                    }
                    j >>= 8;
                }
                if (i6 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void forEachValue(l lVar) {
        lVar.getClass();
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8 - ((~(i - length)) >>> 31);
                for (int i10 = 0; i10 < i6; i10++) {
                    if ((255 & j) < 128) {
                        lVar.invoke(Long.valueOf(jArr[(i << 3) + i10]));
                    }
                    j >>= 8;
                }
                if (i6 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final long get(long j) {
        int iFindKeyIndex = findKeyIndex(j);
        if (iFindKeyIndex >= 0) {
            return this.values[iFindKeyIndex];
        }
        a.s(x.h(j, "Cannot find value for key "));
        return 0L;
    }

    public final int getCapacity() {
        return this._capacity;
    }

    public final long getOrDefault(long j, long j6) {
        int iFindKeyIndex = findKeyIndex(j);
        return iFindKeyIndex >= 0 ? this.values[iFindKeyIndex] : j6;
    }

    public final long getOrElse(long j, d7.a aVar) {
        aVar.getClass();
        int iFindKeyIndex = findKeyIndex(j);
        return iFindKeyIndex < 0 ? ((Number) aVar.invoke()).longValue() : this.values[iFindKeyIndex];
    }

    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        int i;
        int i6;
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            long j = jArr3[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                int i13 = 0;
                while (i13 < i12) {
                    if ((255 & j) < 128) {
                        int i14 = (i10 << 3) + i13;
                        long j6 = jArr[i14];
                        long j10 = jArr2[i14];
                        i6 = i10;
                        i11 += ((int) (j10 ^ (j10 >>> 32))) ^ ((int) (j6 ^ (j6 >>> 32)));
                    } else {
                        i6 = i10;
                    }
                    j >>= 8;
                    i13++;
                    i10 = i6;
                }
                i = i10;
                if (i12 != 8) {
                    return i11;
                }
            } else {
                i = i10;
            }
            if (i == length) {
                return i11;
            }
            i10 = i + 1;
        }
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4) {
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        long[] jArr4;
        long j;
        int i6;
        StringBuilder sbS = x.s(charSequence, charSequence2, charSequence3, charSequence4, charSequence2);
        long[] jArr5 = this.keys;
        long[] jArr6 = this.values;
        long[] jArr7 = this.metadata;
        int length = jArr7.length - 2;
        if (length >= 0) {
            int i10 = 0;
            int i11 = 0;
            loop0: while (true) {
                long j6 = jArr7[i10];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i10 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j6 & 255) < 128) {
                            int i15 = (i10 << 3) + i14;
                            jArr3 = jArr6;
                            jArr4 = jArr7;
                            long j10 = jArr5[i15];
                            j = j6;
                            long j11 = jArr3[i15];
                            i6 = i12;
                            if (i11 == i) {
                                sbS.append(charSequence4);
                                break loop0;
                            }
                            if (i11 != 0) {
                                sbS.append(charSequence);
                            }
                            sbS.append(j10);
                            sbS.append('=');
                            sbS.append(j11);
                            i11++;
                        } else {
                            jArr3 = jArr6;
                            jArr4 = jArr7;
                            j = j6;
                            i6 = i12;
                        }
                        j6 = j >> i6;
                        i14++;
                        i12 = i6;
                        jArr6 = jArr3;
                        jArr7 = jArr4;
                    }
                    jArr = jArr6;
                    jArr2 = jArr7;
                    if (i13 != i12) {
                        break;
                    }
                } else {
                    jArr = jArr6;
                    jArr2 = jArr7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                jArr6 = jArr;
                jArr7 = jArr2;
            }
            sbS.append(charSequence3);
        } else {
            sbS.append(charSequence3);
        }
        return sbS.toString();
    }

    public final boolean none() {
        return this._size == 0;
    }

    public String toString() {
        int i;
        int i6;
        int i10;
        int i11;
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                long j = jArr3[i12];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8;
                    int i15 = 8 - ((~(i12 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((255 & j) < 128) {
                            int i17 = (i12 << 3) + i16;
                            i6 = i12;
                            long j6 = jArr[i17];
                            i10 = i14;
                            i11 = i16;
                            long j10 = jArr2[i17];
                            sb.append(j6);
                            sb.append("=");
                            sb.append(j10);
                            i13++;
                            if (i13 < this._size) {
                                sb.append(", ");
                            }
                        } else {
                            i6 = i12;
                            i10 = i14;
                            i11 = i16;
                        }
                        j >>= i10;
                        i16 = i11 + 1;
                        i12 = i6;
                        i14 = i10;
                    }
                    int i18 = i12;
                    if (i15 != i14) {
                        break;
                    }
                    i = i18;
                } else {
                    i = i12;
                }
                if (i == length) {
                    break;
                }
                i12 = i + 1;
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public static /* synthetic */ void getKeys$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public static /* synthetic */ void getValues$annotations() {
    }

    public static /* synthetic */ void get_capacity$collection$annotations() {
    }

    public static /* synthetic */ void get_size$collection$annotations() {
    }

    public /* synthetic */ LongLongMap(g gVar) {
        this();
    }

    public final boolean any() {
        return this._size != 0;
    }

    public final int count() {
        return getSize();
    }

    public final String joinToString(CharSequence charSequence) {
        charSequence.getClass();
        return joinToString$default(this, charSequence, null, null, 0, null, 30, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        return joinToString$default(this, charSequence, charSequence2, null, 0, null, 28, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        x.A(charSequence, charSequence2, charSequence3);
        return joinToString$default(this, charSequence, charSequence2, charSequence3, 0, null, 24, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i) {
        x.A(charSequence, charSequence2, charSequence3);
        return joinToString$default(this, charSequence, charSequence2, charSequence3, i, null, 16, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, p pVar) {
        int i6;
        CharSequence charSequence4 = charSequence;
        StringBuilder sbQ = x.q(charSequence4, charSequence2, charSequence3, pVar, charSequence2);
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i10 = 0;
            int i11 = 0;
            loop0: while (true) {
                long j = jArr3[i10];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i10 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j & 255) < 128) {
                            int i15 = (i10 << 3) + i14;
                            long j6 = jArr[i15];
                            long j10 = jArr2[i15];
                            i6 = i12;
                            if (i11 == i) {
                                sbQ.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i11 != 0) {
                                sbQ.append(charSequence4);
                            }
                            sbQ.append((CharSequence) pVar.invoke(Long.valueOf(j6), Long.valueOf(j10)));
                            i11++;
                        } else {
                            i6 = i12;
                        }
                        j >>= i6;
                        i14++;
                        charSequence4 = charSequence;
                        i12 = i6;
                    }
                    if (i13 != i12) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                charSequence4 = charSequence;
            }
            sbQ.append(charSequence3);
        } else {
            sbQ.append(charSequence3);
        }
        return sbQ.toString();
    }

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0081 A[PHI: r12
      0x0081: PHI (r12v2 int) = (r12v1 int), (r12v3 int) binds: [B:6:0x0032, B:19:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String joinToString(java.lang.CharSequence r23, java.lang.CharSequence r24, java.lang.CharSequence r25, int r26, java.lang.CharSequence r27, d7.p r28) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r27
            r5 = r28
            java.lang.StringBuilder r6 = a4.x.r(r1, r2, r3, r4, r5)
            r6.append(r2)
            long[] r2 = r0.keys
            long[] r7 = r0.values
            long[] r8 = r0.metadata
            int r9 = r8.length
            int r9 = r9 + (-2)
            if (r9 < 0) goto L8a
            r11 = 0
            r12 = 0
        L20:
            r13 = r8[r11]
            r15 = r11
            long r10 = ~r13
            r16 = 7
            long r10 = r10 << r16
            long r10 = r10 & r13
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r16
            int r10 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r10 == 0) goto L81
            int r11 = r15 - r9
            int r10 = ~r11
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r16 = r11
            r11 = 0
        L40:
            if (r11 >= r10) goto L7d
            r17 = 255(0xff, double:1.26E-321)
            long r17 = r13 & r17
            r19 = 128(0x80, double:6.3E-322)
            int r17 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r17 >= 0) goto L74
            int r17 = r15 << 3
            int r17 = r17 + r11
            r18 = r2[r17]
            r20 = r7[r17]
            r0 = r26
            if (r12 != r0) goto L5c
            r6.append(r4)
            goto L8d
        L5c:
            if (r12 == 0) goto L61
            r6.append(r1)
        L61:
            java.lang.Long r0 = java.lang.Long.valueOf(r18)
            java.lang.Long r1 = java.lang.Long.valueOf(r20)
            java.lang.Object r0 = r5.invoke(r0, r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r6.append(r0)
            int r12 = r12 + 1
        L74:
            long r13 = r13 >> r16
            int r11 = r11 + 1
            r0 = r22
            r1 = r23
            goto L40
        L7d:
            r0 = r16
            if (r10 != r0) goto L8a
        L81:
            if (r15 == r9) goto L8a
            int r11 = r15 + 1
            r0 = r22
            r1 = r23
            goto L20
        L8a:
            r6.append(r3)
        L8d:
            java.lang.String r0 = r6.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongLongMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, d7.p):java.lang.String");
    }

    public static /* synthetic */ String joinToString$default(LongLongMap longLongMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i6, Object obj) {
        if (obj != null) {
            b.r("Super calls with default arguments not supported in this target, function: joinToString");
            return null;
        }
        if ((i6 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i6 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i6 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i6 & 8) != 0) {
            i = -1;
        }
        if ((i6 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence3;
        return longLongMap.joinToString(charSequence, charSequence2, charSequence6, i, charSequence5);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007e A[PHI: r11
      0x007e: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:6:0x002c, B:20:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String joinToString(java.lang.CharSequence r22, java.lang.CharSequence r23, java.lang.CharSequence r24, d7.p r25) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r24
            r3 = r23
            r4 = r25
            java.lang.StringBuilder r3 = a4.x.q(r1, r3, r2, r4, r3)
            long[] r5 = r0.keys
            long[] r6 = r0.values
            long[] r7 = r0.metadata
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L85
            r10 = 0
            r11 = 0
        L1b:
            r12 = r7[r10]
            long r14 = ~r12
            r16 = 7
            long r14 = r14 << r16
            long r14 = r14 & r12
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r16
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 == 0) goto L7e
            int r14 = r10 - r8
            int r14 = ~r14
            int r14 = r14 >>> 31
            r15 = 8
            int r14 = 8 - r14
            r9 = 0
        L38:
            if (r9 >= r14) goto L7b
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r12 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L70
            int r16 = r10 << 3
            int r16 = r16 + r9
            r17 = r5[r16]
            r19 = r6[r16]
            r16 = r15
            r15 = -1
            if (r11 != r15) goto L57
            java.lang.String r1 = "..."
            r3.append(r1)
            goto L88
        L57:
            if (r11 == 0) goto L5c
            r3.append(r1)
        L5c:
            java.lang.Long r15 = java.lang.Long.valueOf(r17)
            java.lang.Long r0 = java.lang.Long.valueOf(r19)
            java.lang.Object r0 = r4.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r3.append(r0)
            int r11 = r11 + 1
            goto L72
        L70:
            r16 = r15
        L72:
            long r12 = r12 >> r16
            int r9 = r9 + 1
            r0 = r21
            r15 = r16
            goto L38
        L7b:
            r0 = r15
            if (r14 != r0) goto L85
        L7e:
            if (r10 == r8) goto L85
            int r10 = r10 + 1
            r0 = r21
            goto L1b
        L85:
            r3.append(r2)
        L88:
            java.lang.String r0 = r3.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongLongMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, d7.p):java.lang.String");
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, p pVar) {
        int i;
        charSequence.getClass();
        charSequence2.getClass();
        pVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i6 = 0;
            int i10 = 0;
            loop0: while (true) {
                long j = jArr3[i6];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8;
                    int i12 = 8 - ((~(i6 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((255 & j) < 128) {
                            int i14 = (i6 << 3) + i13;
                            long j6 = jArr[i14];
                            long j10 = jArr2[i14];
                            if (i10 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i10 != 0) {
                                sb.append(charSequence);
                            }
                            i = i11;
                            sb.append((CharSequence) pVar.invoke(Long.valueOf(j6), Long.valueOf(j10)));
                            i10++;
                        } else {
                            i = i11;
                        }
                        j >>= i;
                        i13++;
                        i11 = i;
                    }
                    if (i12 != i11) {
                        break;
                    }
                }
                if (i6 == length) {
                    break;
                }
                i6++;
            }
            sb.append((CharSequence) "");
        } else {
            sb.append((CharSequence) "");
        }
        return sb.toString();
    }

    public final String joinToString(CharSequence charSequence, p pVar) {
        int i;
        charSequence.getClass();
        pVar.getClass();
        StringBuilder sb = new StringBuilder("");
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i6 = 0;
            int i10 = 0;
            loop0: while (true) {
                long j = jArr3[i6];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8;
                    int i12 = 8 - ((~(i6 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((255 & j) < 128) {
                            int i14 = (i6 << 3) + i13;
                            long j6 = jArr[i14];
                            long j10 = jArr2[i14];
                            if (i10 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i10 != 0) {
                                sb.append(charSequence);
                            }
                            Long lValueOf = Long.valueOf(j6);
                            i = i11;
                            sb.append((CharSequence) pVar.invoke(lValueOf, Long.valueOf(j10)));
                            i10++;
                        } else {
                            i = i11;
                        }
                        j >>= i;
                        i13++;
                        i11 = i;
                    }
                    if (i12 != i11) {
                        break;
                    }
                }
                if (i6 == length) {
                    break;
                }
                i6++;
            }
            sb.append((CharSequence) "");
        } else {
            sb.append((CharSequence) "");
        }
        return sb.toString();
    }

    public final String joinToString(p pVar) {
        int i;
        pVar.getClass();
        StringBuilder sb = new StringBuilder("");
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i6 = 0;
            int i10 = 0;
            loop0: while (true) {
                long j = jArr3[i6];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8;
                    int i12 = 8 - ((~(i6 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((255 & j) < 128) {
                            int i14 = (i6 << 3) + i13;
                            long j6 = jArr[i14];
                            long j10 = jArr2[i14];
                            if (i10 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i10 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            i = i11;
                            sb.append((CharSequence) pVar.invoke(Long.valueOf(j6), Long.valueOf(j10)));
                            i10++;
                        } else {
                            i = i11;
                        }
                        j >>= i;
                        i13++;
                        i11 = i;
                    }
                    if (i12 != i11) {
                        break;
                    }
                }
                if (i6 == length) {
                    break;
                }
                i6++;
            }
            sb.append((CharSequence) "");
        } else {
            sb.append((CharSequence) "");
        }
        return sb.toString();
    }
}
