package d8;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class m1 extends t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m1 f3677c = new m1(n1.f3681a);

    @Override // d8.a
    public final int e(Object obj) {
        return ((p6.w) obj).f8463a.length;
    }

    @Override // d8.o, d8.a
    public final void h(c8.c cVar, int i, Object obj) {
        l1 l1Var = (l1) obj;
        l1Var.getClass();
        short sDecodeShort = cVar.decodeInlineElement(this.f3711b, i).decodeShort();
        l1Var.b(l1Var.d() + 1);
        short[] sArr = l1Var.f3672a;
        int i6 = l1Var.f3673b;
        l1Var.f3673b = i6 + 1;
        sArr[i6] = sDecodeShort;
    }

    @Override // d8.a
    public final Object i(Object obj) {
        short[] sArr = ((p6.w) obj).f8463a;
        l1 l1Var = new l1();
        l1Var.f3672a = sArr;
        l1Var.f3673b = sArr.length;
        l1Var.b(10);
        return l1Var;
    }

    @Override // d8.t0
    public final Object l() {
        return new p6.w(new short[0]);
    }

    @Override // d8.t0
    public final void m(c8.d dVar, Object obj, int i) {
        short[] sArr = ((p6.w) obj).f8463a;
        dVar.getClass();
        for (int i6 = 0; i6 < i; i6++) {
            dVar.encodeInlineElement(this.f3711b, i6).encodeShort(sArr[i6]);
        }
    }
}
