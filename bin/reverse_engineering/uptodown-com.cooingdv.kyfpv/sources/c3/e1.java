package c3;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e1 implements d8.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e1 f1236a;
    private static final b8.e descriptor;

    static {
        e1 e1Var = new e1();
        f1236a = e1Var;
        d8.q0 q0Var = new d8.q0("com.google.firebase.sessions.Time", e1Var, 3);
        q0Var.j("ms", false);
        q0Var.j("us", true);
        q0Var.j("seconds", true);
        descriptor = q0Var;
    }

    @Override // d8.x
    public final z7.b[] childSerializers() {
        d8.i0 i0Var = d8.i0.f3656a;
        return new z7.b[]{i0Var, i0Var, i0Var};
    }

    @Override // z7.a
    public final Object deserialize(c8.e eVar) {
        int i;
        long jDecodeLongElement;
        long j;
        long j6;
        eVar.getClass();
        b8.e eVar2 = descriptor;
        c8.c cVarBeginStructure = eVar.beginStructure(eVar2);
        if (cVarBeginStructure.decodeSequentially()) {
            long jDecodeLongElement2 = cVarBeginStructure.decodeLongElement(eVar2, 0);
            long jDecodeLongElement3 = cVarBeginStructure.decodeLongElement(eVar2, 1);
            jDecodeLongElement = cVarBeginStructure.decodeLongElement(eVar2, 2);
            i = 7;
            j = jDecodeLongElement2;
            j6 = jDecodeLongElement3;
        } else {
            long jDecodeLongElement4 = 0;
            boolean z9 = true;
            int i6 = 0;
            long jDecodeLongElement5 = 0;
            long jDecodeLongElement6 = 0;
            while (z9) {
                int iDecodeElementIndex = cVarBeginStructure.decodeElementIndex(eVar2);
                if (iDecodeElementIndex == -1) {
                    z9 = false;
                } else if (iDecodeElementIndex == 0) {
                    jDecodeLongElement5 = cVarBeginStructure.decodeLongElement(eVar2, 0);
                    i6 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    jDecodeLongElement6 = cVarBeginStructure.decodeLongElement(eVar2, 1);
                    i6 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new f8.l(iDecodeElementIndex);
                    }
                    jDecodeLongElement4 = cVarBeginStructure.decodeLongElement(eVar2, 2);
                    i6 |= 4;
                }
            }
            i = i6;
            jDecodeLongElement = jDecodeLongElement4;
            j = jDecodeLongElement5;
            j6 = jDecodeLongElement6;
        }
        cVarBeginStructure.endStructure(eVar2);
        return new g1(i, j, j6, jDecodeLongElement);
    }

    @Override // z7.h, z7.a
    public final b8.e getDescriptor() {
        return descriptor;
    }

    @Override // z7.h
    public final void serialize(c8.f fVar, Object obj) {
        g1 g1Var = (g1) obj;
        g1Var.getClass();
        b8.e eVar = descriptor;
        c8.d dVarBeginStructure = fVar.beginStructure(eVar);
        long j = g1Var.f1247a;
        long j6 = g1Var.f1249c;
        long j10 = g1Var.f1248b;
        dVarBeginStructure.encodeLongElement(eVar, 0, j);
        if (dVarBeginStructure.shouldEncodeElementDefault(eVar, 1) || j10 != ((long) 1000) * j) {
            dVarBeginStructure.encodeLongElement(eVar, 1, j10);
        }
        if (dVarBeginStructure.shouldEncodeElementDefault(eVar, 2) || j6 != j / ((long) 1000)) {
            dVarBeginStructure.encodeLongElement(eVar, 2, j6);
        }
        dVarBeginStructure.endStructure(eVar);
    }

    @Override // d8.x
    public final z7.b[] typeParametersSerializers() {
        return d8.o0.f3685b;
    }
}
