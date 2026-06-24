package f8;

import b2.t1;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends c8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f4954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g8.f f4955b;

    public g(a0 a0Var, e8.b bVar) {
        bVar.getClass();
        this.f4954a = a0Var;
        this.f4955b = bVar.f4763b;
    }

    @Override // c8.a, c8.e
    public final byte decodeByte() {
        p6.o oVar;
        a0 a0Var = this.f4954a;
        String strN = a0Var.n();
        try {
            strN.getClass();
            p6.q qVarO = t1.O(strN);
            if (qVarO != null) {
                int i = qVarO.f8457a;
                oVar = Integer.compare(Integer.MIN_VALUE ^ i, -2147483393) > 0 ? null : new p6.o((byte) i);
            }
            if (oVar != null) {
                return oVar.f8455a;
            }
            l7.t.g0(strN);
            throw null;
        } catch (IllegalArgumentException unused) {
            a0.p(a0Var, "Failed to parse type 'UByte' for input '" + strN + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // c8.c
    public final int decodeElementIndex(b8.e eVar) {
        eVar.getClass();
        throw new IllegalStateException("unsupported");
    }

    @Override // c8.a, c8.e
    public final int decodeInt() {
        a0 a0Var = this.f4954a;
        String strN = a0Var.n();
        try {
            strN.getClass();
            p6.q qVarO = t1.O(strN);
            if (qVarO != null) {
                return qVarO.f8457a;
            }
            l7.t.g0(strN);
            throw null;
        } catch (IllegalArgumentException unused) {
            a0.p(a0Var, "Failed to parse type 'UInt' for input '" + strN + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // c8.a, c8.e
    public final long decodeLong() {
        a0 a0Var = this.f4954a;
        String strN = a0Var.n();
        try {
            strN.getClass();
            p6.s sVarP = t1.P(strN);
            if (sVarP != null) {
                return sVarP.f8459a;
            }
            l7.t.g0(strN);
            throw null;
        } catch (IllegalArgumentException unused) {
            a0.p(a0Var, "Failed to parse type 'ULong' for input '" + strN + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // c8.a, c8.e
    public final short decodeShort() {
        p6.v vVar;
        a0 a0Var = this.f4954a;
        String strN = a0Var.n();
        try {
            strN.getClass();
            p6.q qVarO = t1.O(strN);
            if (qVarO != null) {
                int i = qVarO.f8457a;
                vVar = Integer.compare(Integer.MIN_VALUE ^ i, -2147418113) > 0 ? null : new p6.v((short) i);
            }
            if (vVar != null) {
                return vVar.f8462a;
            }
            l7.t.g0(strN);
            throw null;
        } catch (IllegalArgumentException unused) {
            a0.p(a0Var, "Failed to parse type 'UShort' for input '" + strN + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // c8.c
    public final g8.f getSerializersModule() {
        return this.f4955b;
    }
}
