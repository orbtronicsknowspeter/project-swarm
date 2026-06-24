package f8;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class x extends c8.a implements e8.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e8.b f4981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f4982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f4983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g8.f f4984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4985e;
    public w f;
    public final e8.h g;
    public final j h;

    public x(e8.b bVar, c0 c0Var, a0 a0Var, b8.e eVar, w wVar) {
        eVar.getClass();
        this.f4981a = bVar;
        this.f4982b = c0Var;
        this.f4983c = a0Var;
        this.f4984d = bVar.f4762b;
        this.f4985e = -1;
        this.f = wVar;
        e8.h hVar = bVar.f4761a;
        this.g = hVar;
        this.h = hVar.f4770a ? null : new j(eVar);
    }

    @Override // e8.i
    public final e8.k a() {
        return new q(this.f4981a.f4761a, this.f4983c).d();
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.Serializable, java.lang.Object[]] */
    @Override // c8.a, c8.e
    public final c8.c beginStructure(b8.e eVar) {
        eVar.getClass();
        e8.b bVar = this.f4981a;
        c0 c0VarN = m.n(eVar, bVar);
        a0 a0Var = this.f4983c;
        o oVar = (o) a0Var.f4931l;
        int i = oVar.f4961c + 1;
        oVar.f4961c = i;
        Object[] objArr = (Object[]) oVar.f4960b;
        if (i == objArr.length) {
            int i6 = i * 2;
            oVar.f4960b = Arrays.copyOf(objArr, i6);
            oVar.f4962d = Arrays.copyOf((int[]) oVar.f4962d, i6);
        }
        ((Object[]) oVar.f4960b)[i] = eVar;
        a0Var.k(c0VarN.f4947a);
        if (a0Var.t() != 4) {
            int iOrdinal = c0VarN.ordinal();
            return (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) ? new x(bVar, c0VarN, a0Var, eVar, this.f) : (this.f4982b == c0VarN && bVar.f4761a.f4770a) ? this : new x(bVar, c0VarN, a0Var, eVar, this.f);
        }
        a0.p(a0Var, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    @Override // c8.a, c8.e
    public final boolean decodeBoolean() {
        boolean z9;
        boolean z10;
        a0 a0Var = this.f4983c;
        int iW = a0Var.w();
        String str = (String) a0Var.f4933n;
        if (iW == str.length()) {
            a0.p(a0Var, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iW) == '\"') {
            iW++;
            z9 = true;
        } else {
            z9 = false;
        }
        int iV = a0Var.v(iW);
        if (iV >= str.length() || iV == -1) {
            a0.p(a0Var, "EOF", 0, null, 6);
            throw null;
        }
        int i = iV + 1;
        int iCharAt = str.charAt(iV) | ' ';
        if (iCharAt == 102) {
            a0Var.f(i, "alse");
            z10 = false;
        } else {
            if (iCharAt != 116) {
                a0.p(a0Var, "Expected valid boolean literal prefix, but had '" + a0Var.n() + '\'', 0, null, 6);
                throw null;
            }
            a0Var.f(i, "rue");
            z10 = true;
        }
        if (!z9) {
            return z10;
        }
        if (a0Var.f4930b == str.length()) {
            a0.p(a0Var, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(a0Var.f4930b) == '\"') {
            a0Var.f4930b++;
            return z10;
        }
        a0.p(a0Var, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // c8.a, c8.e
    public final byte decodeByte() {
        a0 a0Var = this.f4983c;
        long jL = a0Var.l();
        byte b7 = (byte) jL;
        if (jL == b7) {
            return b7;
        }
        a0.p(a0Var, "Failed to parse byte for input '" + jL + '\'', 0, null, 6);
        throw null;
    }

    @Override // c8.a, c8.e
    public final char decodeChar() {
        a0 a0Var = this.f4983c;
        String strN = a0Var.n();
        if (strN.length() == 1) {
            return strN.charAt(0);
        }
        a0.p(a0Var, "Expected single char, but got '" + strN + '\'', 0, null, 6);
        throw null;
    }

    @Override // c8.a, c8.e
    public final double decodeDouble() {
        a0 a0Var = this.f4983c;
        String strN = a0Var.n();
        try {
            double d10 = Double.parseDouble(strN);
            this.f4981a.f4761a.getClass();
            if (!Double.isInfinite(d10) && !Double.isNaN(d10)) {
                return d10;
            }
            m.o(a0Var, Double.valueOf(d10));
            throw null;
        } catch (IllegalArgumentException unused) {
            a0.p(a0Var, "Failed to parse type 'double' for input '" + strN + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // c8.c
    public final int decodeElementIndex(b8.e eVar) {
        String strG;
        e8.b bVar = this.f4981a;
        e8.h hVar = bVar.f4761a;
        a0 a0Var = this.f4983c;
        o oVar = (o) a0Var.f4931l;
        String str = (String) a0Var.f4933n;
        eVar.getClass();
        c0 c0Var = this.f4982b;
        int iOrdinal = c0Var.ordinal();
        char c9 = ':';
        boolean zX = false;
        byte b7 = 1;
        int i = -1;
        if (iOrdinal == 0) {
            boolean zX2 = a0Var.x();
            while (true) {
                boolean zD = a0Var.d();
                j jVar = this.h;
                if (zD) {
                    this.g.getClass();
                    strG = a0Var.g();
                    a0Var.k(c9);
                    int i6 = m.i(eVar, bVar, strG);
                    byte b10 = b7;
                    if (i6 != -3) {
                        if (jVar != null) {
                            d8.t tVar = jVar.f4955a;
                            if (i6 < 64) {
                                tVar.f3708c |= 1 << i6;
                            } else {
                                int i10 = (i6 >>> 6) - 1;
                                long[] jArr = tVar.f3709d;
                                jArr[i10] = jArr[i10] | (1 << (i6 & 63));
                            }
                        }
                        i = i6;
                    } else {
                        w wVar = this.f;
                        if (wVar == null || !kotlin.jvm.internal.l.a(wVar.f4980b, strG)) {
                            break;
                        }
                        wVar.f4980b = null;
                        ArrayList arrayList = new ArrayList();
                        byte bT = a0Var.t();
                        if (bT == 8 || bT == 6) {
                            while (true) {
                                byte bT2 = a0Var.t();
                                b7 = b10;
                                if (bT2 == b7) {
                                    a0Var.g();
                                } else {
                                    if (bT2 == 8 || bT2 == 6) {
                                        arrayList.add(Byte.valueOf(bT2));
                                    } else if (bT2 == 9) {
                                        if (((Number) q6.l.y0(arrayList)).byteValue() != 8) {
                                            throw m.e("found ] instead of } at path: " + oVar, str, a0Var.f4930b);
                                        }
                                        q6.r.n0(arrayList);
                                    } else if (bT2 == 7) {
                                        if (((Number) q6.l.y0(arrayList)).byteValue() != 6) {
                                            throw m.e("found } instead of ] at path: " + oVar, str, a0Var.f4930b);
                                        }
                                        q6.r.n0(arrayList);
                                    } else if (bT2 == 10) {
                                        a0.p(a0Var, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                        throw null;
                                    }
                                    a0Var.i();
                                    if (arrayList.size() == 0) {
                                        break;
                                    }
                                }
                                b10 = b7;
                            }
                        } else {
                            a0Var.n();
                            b7 = b10;
                        }
                        zX2 = a0Var.x();
                        c9 = ':';
                    }
                } else {
                    int i11 = 0;
                    if (zX2) {
                        hVar.getClass();
                        m.j(a0Var, "object");
                        throw null;
                    }
                    if (jVar != null) {
                        d8.t tVar2 = jVar.f4955a;
                        i iVar = tVar2.f3707b;
                        b8.e eVar2 = tVar2.f3706a;
                        int iE = eVar2.e();
                        while (true) {
                            long j = tVar2.f3708c;
                            long j6 = -1;
                            if (j != -1) {
                                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
                                tVar2.f3708c |= 1 << iNumberOfTrailingZeros;
                                if (((Boolean) iVar.invoke(eVar2, Integer.valueOf(iNumberOfTrailingZeros))).booleanValue()) {
                                    i = iNumberOfTrailingZeros;
                                    break;
                                }
                            } else if (iE > 64) {
                                long[] jArr2 = tVar2.f3709d;
                                int length = jArr2.length;
                                loop3: while (i11 < length) {
                                    int i12 = i11 + 1;
                                    int i13 = i12 * 64;
                                    long j10 = jArr2[i11];
                                    while (j10 != j6) {
                                        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j10);
                                        j10 |= 1 << iNumberOfTrailingZeros2;
                                        int i14 = iNumberOfTrailingZeros2 + i13;
                                        if (((Boolean) iVar.invoke(eVar2, Integer.valueOf(i14))).booleanValue()) {
                                            jArr2[i11] = j10;
                                            i = i14;
                                            break loop3;
                                        }
                                        j6 = -1;
                                    }
                                    jArr2[i11] = j10;
                                    i11 = i12;
                                    j6 = -1;
                                }
                            }
                        }
                    } else {
                        i = -1;
                    }
                }
            }
            a0Var.o(l7.m.A0(strG, str.subSequence(0, a0Var.f4930b).toString(), 6), "Encountered an unknown key '" + strG + '\'', "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
            throw null;
        }
        if (iOrdinal != 2) {
            boolean zX3 = a0Var.x();
            if (a0Var.d()) {
                int i15 = this.f4985e;
                if (i15 != -1 && !zX3) {
                    a0.p(a0Var, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                i = i15 + 1;
                this.f4985e = i;
            } else if (zX3) {
                hVar.getClass();
                m.j(a0Var, "array");
                throw null;
            }
        } else {
            int i16 = this.f4985e;
            boolean z9 = i16 % 2 != 0;
            if (!z9) {
                a0Var.k(':');
            } else if (i16 != -1) {
                zX = a0Var.x();
            }
            if (a0Var.d()) {
                if (z9) {
                    int i17 = this.f4985e;
                    int i18 = a0Var.f4930b;
                    if (i17 == -1) {
                        if (zX) {
                            a0.p(a0Var, "Unexpected leading comma", i18, null, 4);
                            throw null;
                        }
                    } else if (!zX) {
                        a0.p(a0Var, "Expected comma after the key-value pair", i18, null, 4);
                        throw null;
                    }
                }
                i = this.f4985e + 1;
                this.f4985e = i;
            } else if (zX) {
                hVar.getClass();
                m.j(a0Var, "object");
                throw null;
            }
        }
        if (c0Var != c0.f4943n) {
            ((int[]) oVar.f4962d)[oVar.f4961c] = i;
        }
        return i;
    }

    @Override // c8.a
    public final int decodeEnum(b8.e eVar) {
        eVar.getClass();
        String strDecodeString = decodeString();
        String strConcat = " at path ".concat(((o) this.f4983c.f4931l).c());
        eVar.getClass();
        e8.b bVar = this.f4981a;
        bVar.getClass();
        strDecodeString.getClass();
        int i = m.i(eVar, bVar, strDecodeString);
        if (i != -3) {
            return i;
        }
        throw new z7.g(eVar.a() + " does not contain element with name '" + strDecodeString + '\'' + strConcat);
    }

    @Override // c8.a, c8.e
    public final float decodeFloat() {
        a0 a0Var = this.f4983c;
        String strN = a0Var.n();
        try {
            float f = Float.parseFloat(strN);
            this.f4981a.f4761a.getClass();
            if (!Float.isInfinite(f) && !Float.isNaN(f)) {
                return f;
            }
            m.o(a0Var, Float.valueOf(f));
            throw null;
        } catch (IllegalArgumentException unused) {
            a0.p(a0Var, "Failed to parse type 'float' for input '" + strN + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // c8.a, c8.e
    public final c8.e decodeInline(b8.e eVar) {
        eVar.getClass();
        return z.a(eVar) ? new g(this.f4983c, this.f4981a) : super.decodeInline(eVar);
    }

    @Override // c8.a, c8.e
    public final int decodeInt() {
        a0 a0Var = this.f4983c;
        long jL = a0Var.l();
        int i = (int) jL;
        if (jL == i) {
            return i;
        }
        a0.p(a0Var, "Failed to parse int for input '" + jL + '\'', 0, null, 6);
        throw null;
    }

    @Override // c8.a, c8.e
    public final long decodeLong() {
        return this.f4983c.l();
    }

    @Override // c8.a, c8.e
    public final boolean decodeNotNullMark() {
        j jVar = this.h;
        if (!(jVar != null ? jVar.f4956b : false)) {
            a0 a0Var = this.f4983c;
            int iV = a0Var.v(a0Var.w());
            String str = (String) a0Var.f4933n;
            int length = str.length() - iV;
            boolean z9 = false;
            if (length >= 4 && iV != -1) {
                int i = 0;
                while (true) {
                    if (i < 4) {
                        if ("null".charAt(i) != str.charAt(iV + i)) {
                            break;
                        }
                        i++;
                    } else if (length <= 4 || m.g(str.charAt(iV + 4)) != 0) {
                        z9 = true;
                        a0Var.f4930b = iV + 4;
                    }
                }
            }
            if (!z9) {
                return true;
            }
        }
        return false;
    }

    @Override // c8.a, c8.e
    public final Void decodeNull() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r9v10, types: [java.io.Serializable, java.lang.Object[]] */
    @Override // c8.a, c8.c
    public final Object decodeSerializableElement(b8.e eVar, int i, z7.a aVar, Object obj) {
        o oVar = (o) this.f4983c.f4931l;
        eVar.getClass();
        aVar.getClass();
        boolean z9 = this.f4982b == c0.f4943n && (i & 1) == 0;
        if (z9) {
            int[] iArr = (int[]) oVar.f4962d;
            int i6 = oVar.f4961c;
            if (iArr[i6] == -2) {
                ((Object[]) oVar.f4960b)[i6] = n.f4958a;
            }
        }
        Object objDecodeSerializableElement = super.decodeSerializableElement(eVar, i, aVar, obj);
        if (z9) {
            int[] iArr2 = (int[]) oVar.f4962d;
            int i10 = oVar.f4961c;
            if (iArr2[i10] != -2) {
                int i11 = i10 + 1;
                oVar.f4961c = i11;
                Object[] objArr = (Object[]) oVar.f4960b;
                if (i11 == objArr.length) {
                    int i12 = i11 * 2;
                    oVar.f4960b = Arrays.copyOf(objArr, i12);
                    oVar.f4962d = Arrays.copyOf((int[]) oVar.f4962d, i12);
                }
            }
            Object[] objArr2 = (Object[]) oVar.f4960b;
            int i13 = oVar.f4961c;
            objArr2[i13] = objDecodeSerializableElement;
            ((int[]) oVar.f4962d)[i13] = -2;
        }
        return objDecodeSerializableElement;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0148  */
    @Override // c8.a, c8.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object decodeSerializableValue(z7.a r11) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f8.x.decodeSerializableValue(z7.a):java.lang.Object");
    }

    @Override // c8.a, c8.e
    public final short decodeShort() {
        a0 a0Var = this.f4983c;
        long jL = a0Var.l();
        short s6 = (short) jL;
        if (jL == s6) {
            return s6;
        }
        a0.p(a0Var, "Failed to parse short for input '" + jL + '\'', 0, null, 6);
        throw null;
    }

    @Override // c8.a, c8.e
    public final String decodeString() {
        this.g.getClass();
        return this.f4983c.m();
    }

    @Override // c8.a, c8.c
    public final void endStructure(b8.e eVar) {
        eVar.getClass();
        e8.h hVar = this.f4981a.f4761a;
        hVar.getClass();
        a0 a0Var = this.f4983c;
        if (a0Var.x()) {
            hVar.getClass();
            m.j(a0Var, "");
            throw null;
        }
        a0Var.k(this.f4982b.f4948b);
        o oVar = (o) a0Var.f4931l;
        int i = oVar.f4961c;
        int[] iArr = (int[]) oVar.f4962d;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            oVar.f4961c = i - 1;
        }
        int i6 = oVar.f4961c;
        if (i6 != -1) {
            oVar.f4961c = i6 - 1;
        }
    }

    @Override // c8.c
    public final g8.f getSerializersModule() {
        return this.f4984d;
    }
}
