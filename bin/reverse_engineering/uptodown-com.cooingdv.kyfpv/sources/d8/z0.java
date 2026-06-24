package d8;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class z0 extends t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z0 f3727c = new z0(a1.f3619a);

    @Override // d8.a
    public final int e(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return sArr.length;
    }

    @Override // d8.o, d8.a
    public final void h(c8.c cVar, int i, Object obj) {
        y0 y0Var = (y0) obj;
        y0Var.getClass();
        short sDecodeShortElement = cVar.decodeShortElement(this.f3711b, i);
        y0Var.b(y0Var.d() + 1);
        short[] sArr = y0Var.f3724a;
        int i6 = y0Var.f3725b;
        y0Var.f3725b = i6 + 1;
        sArr[i6] = sDecodeShortElement;
    }

    @Override // d8.a
    public final Object i(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        y0 y0Var = new y0();
        y0Var.f3724a = sArr;
        y0Var.f3725b = sArr.length;
        y0Var.b(10);
        return y0Var;
    }

    @Override // d8.t0
    public final Object l() {
        return new short[0];
    }

    @Override // d8.t0
    public final void m(c8.d dVar, Object obj, int i) {
        short[] sArr = (short[]) obj;
        dVar.getClass();
        sArr.getClass();
        for (int i6 = 0; i6 < i; i6++) {
            dVar.encodeShortElement(this.f3711b, i6, sArr[i6]);
        }
    }
}
