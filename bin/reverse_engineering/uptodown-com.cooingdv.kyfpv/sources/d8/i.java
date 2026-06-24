package d8;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f3655c = new i(j.f3660a);

    @Override // d8.a
    public final int e(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return bArr.length;
    }

    @Override // d8.o, d8.a
    public final void h(c8.c cVar, int i, Object obj) {
        h hVar = (h) obj;
        hVar.getClass();
        byte bDecodeByteElement = cVar.decodeByteElement(this.f3711b, i);
        hVar.b(hVar.d() + 1);
        byte[] bArr = hVar.f3650a;
        int i6 = hVar.f3651b;
        hVar.f3651b = i6 + 1;
        bArr[i6] = bDecodeByteElement;
    }

    @Override // d8.a
    public final Object i(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        h hVar = new h();
        hVar.f3650a = bArr;
        hVar.f3651b = bArr.length;
        hVar.b(10);
        return hVar;
    }

    @Override // d8.t0
    public final Object l() {
        return new byte[0];
    }

    @Override // d8.t0
    public final void m(c8.d dVar, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        dVar.getClass();
        bArr.getClass();
        for (int i6 = 0; i6 < i; i6++) {
            dVar.encodeByteElement(this.f3711b, i6, bArr[i6]);
        }
    }
}
