package c3;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l0 implements d8.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0 f1284a;
    private static final b8.e descriptor;

    static {
        l0 l0Var = new l0();
        f1284a = l0Var;
        d8.q0 q0Var = new d8.q0("com.google.firebase.sessions.SessionDetails", l0Var, 4);
        q0Var.j("sessionId", false);
        q0Var.j("firstSessionId", false);
        q0Var.j("sessionIndex", false);
        q0Var.j("sessionStartTimestampUs", false);
        descriptor = q0Var;
    }

    @Override // d8.x
    public final z7.b[] childSerializers() {
        d8.b1 b1Var = d8.b1.f3621a;
        return new z7.b[]{b1Var, b1Var, d8.c0.f3624a, d8.i0.f3655a};
    }

    @Override // z7.a
    public final Object deserialize(c8.e eVar) {
        String strDecodeStringElement;
        int i;
        int iDecodeIntElement;
        String str;
        long jDecodeLongElement;
        eVar.getClass();
        b8.e eVar2 = descriptor;
        c8.c cVarBeginStructure = eVar.beginStructure(eVar2);
        if (cVarBeginStructure.decodeSequentially()) {
            strDecodeStringElement = cVarBeginStructure.decodeStringElement(eVar2, 0);
            String strDecodeStringElement2 = cVarBeginStructure.decodeStringElement(eVar2, 1);
            i = 15;
            iDecodeIntElement = cVarBeginStructure.decodeIntElement(eVar2, 2);
            str = strDecodeStringElement2;
            jDecodeLongElement = cVarBeginStructure.decodeLongElement(eVar2, 3);
        } else {
            strDecodeStringElement = null;
            String strDecodeStringElement3 = null;
            boolean z9 = true;
            long jDecodeLongElement2 = 0;
            int i6 = 0;
            int iDecodeIntElement2 = 0;
            while (z9) {
                int iDecodeElementIndex = cVarBeginStructure.decodeElementIndex(eVar2);
                if (iDecodeElementIndex == -1) {
                    z9 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = cVarBeginStructure.decodeStringElement(eVar2, 0);
                    i6 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement3 = cVarBeginStructure.decodeStringElement(eVar2, 1);
                    i6 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    iDecodeIntElement2 = cVarBeginStructure.decodeIntElement(eVar2, 2);
                    i6 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new f8.l(iDecodeElementIndex);
                    }
                    jDecodeLongElement2 = cVarBeginStructure.decodeLongElement(eVar2, 3);
                    i6 |= 8;
                }
            }
            i = i6;
            iDecodeIntElement = iDecodeIntElement2;
            str = strDecodeStringElement3;
            jDecodeLongElement = jDecodeLongElement2;
        }
        String str2 = strDecodeStringElement;
        cVarBeginStructure.endStructure(eVar2);
        return new n0(i, iDecodeIntElement, jDecodeLongElement, str2, str);
    }

    @Override // z7.h, z7.a
    public final b8.e getDescriptor() {
        return descriptor;
    }

    @Override // z7.h
    public final void serialize(c8.f fVar, Object obj) {
        n0 n0Var = (n0) obj;
        n0Var.getClass();
        b8.e eVar = descriptor;
        c8.d dVarBeginStructure = fVar.beginStructure(eVar);
        dVarBeginStructure.encodeStringElement(eVar, 0, n0Var.f1290a);
        dVarBeginStructure.encodeStringElement(eVar, 1, n0Var.f1291b);
        dVarBeginStructure.encodeIntElement(eVar, 2, n0Var.f1292c);
        dVarBeginStructure.encodeLongElement(eVar, 3, n0Var.f1293d);
        dVarBeginStructure.endStructure(eVar);
    }

    @Override // d8.x
    public final z7.b[] typeParametersSerializers() {
        return d8.o0.f3684b;
    }
}
