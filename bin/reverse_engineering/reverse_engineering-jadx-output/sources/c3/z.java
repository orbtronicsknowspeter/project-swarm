package c3;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z implements d8.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f1354a;
    private static final b8.e descriptor;

    static {
        z zVar = new z();
        f1354a = zVar;
        d8.q0 q0Var = new d8.q0("com.google.firebase.sessions.ProcessData", zVar, 2);
        q0Var.j("pid", false);
        q0Var.j("uuid", false);
        descriptor = q0Var;
    }

    @Override // d8.x
    public final z7.b[] childSerializers() {
        return new z7.b[]{d8.c0.f3624a, d8.b1.f3621a};
    }

    @Override // z7.a
    public final Object deserialize(c8.e eVar) {
        int iDecodeIntElement;
        String strDecodeStringElement;
        int i;
        eVar.getClass();
        b8.e eVar2 = descriptor;
        c8.c cVarBeginStructure = eVar.beginStructure(eVar2);
        if (cVarBeginStructure.decodeSequentially()) {
            iDecodeIntElement = cVarBeginStructure.decodeIntElement(eVar2, 0);
            strDecodeStringElement = cVarBeginStructure.decodeStringElement(eVar2, 1);
            i = 3;
        } else {
            String strDecodeStringElement2 = null;
            boolean z9 = true;
            iDecodeIntElement = 0;
            int i6 = 0;
            while (z9) {
                int iDecodeElementIndex = cVarBeginStructure.decodeElementIndex(eVar2);
                if (iDecodeElementIndex == -1) {
                    z9 = false;
                } else if (iDecodeElementIndex == 0) {
                    iDecodeIntElement = cVarBeginStructure.decodeIntElement(eVar2, 0);
                    i6 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new f8.l(iDecodeElementIndex);
                    }
                    strDecodeStringElement2 = cVarBeginStructure.decodeStringElement(eVar2, 1);
                    i6 |= 2;
                }
            }
            strDecodeStringElement = strDecodeStringElement2;
            i = i6;
        }
        cVarBeginStructure.endStructure(eVar2);
        return new b0(i, iDecodeIntElement, strDecodeStringElement);
    }

    @Override // z7.h, z7.a
    public final b8.e getDescriptor() {
        return descriptor;
    }

    @Override // z7.h
    public final void serialize(c8.f fVar, Object obj) {
        b0 b0Var = (b0) obj;
        b0Var.getClass();
        b8.e eVar = descriptor;
        c8.d dVarBeginStructure = fVar.beginStructure(eVar);
        dVarBeginStructure.encodeIntElement(eVar, 0, b0Var.f1195a);
        dVarBeginStructure.encodeStringElement(eVar, 1, b0Var.f1196b);
        dVarBeginStructure.endStructure(eVar);
    }

    @Override // d8.x
    public final z7.b[] typeParametersSerializers() {
        return d8.o0.f3684b;
    }
}
