package f3;

import d8.c0;
import d8.i0;
import d8.o0;
import d8.q0;
import d8.r;
import d8.x;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f4846a;
    private static final b8.e descriptor;

    static {
        e eVar = new e();
        f4846a = eVar;
        q0 q0Var = new q0("com.google.firebase.sessions.settings.SessionConfigs", eVar, 5);
        q0Var.j("sessionsEnabled", false);
        q0Var.j("sessionSamplingRate", false);
        q0Var.j("sessionTimeoutSeconds", false);
        q0Var.j("cacheDurationSeconds", false);
        q0Var.j("cacheUpdatedTimeSeconds", false);
        descriptor = q0Var;
    }

    @Override // d8.x
    public final z7.b[] childSerializers() {
        z7.b bVarY = t0.f.y(d8.g.f3645a);
        z7.b bVarY2 = t0.f.y(r.f3701a);
        c0 c0Var = c0.f3625a;
        return new z7.b[]{bVarY, bVarY2, t0.f.y(c0Var), t0.f.y(c0Var), t0.f.y(i0.f3656a)};
    }

    @Override // z7.a
    public final Object deserialize(c8.e eVar) {
        int i;
        Boolean bool;
        Double d10;
        Integer num;
        Integer num2;
        Long l10;
        eVar.getClass();
        b8.e eVar2 = descriptor;
        c8.c cVarBeginStructure = eVar.beginStructure(eVar2);
        Boolean bool2 = null;
        if (cVarBeginStructure.decodeSequentially()) {
            Boolean bool3 = (Boolean) cVarBeginStructure.decodeNullableSerializableElement(eVar2, 0, d8.g.f3645a, null);
            Double d11 = (Double) cVarBeginStructure.decodeNullableSerializableElement(eVar2, 1, r.f3701a, null);
            c0 c0Var = c0.f3625a;
            Integer num3 = (Integer) cVarBeginStructure.decodeNullableSerializableElement(eVar2, 2, c0Var, null);
            bool = bool3;
            num2 = (Integer) cVarBeginStructure.decodeNullableSerializableElement(eVar2, 3, c0Var, null);
            l10 = (Long) cVarBeginStructure.decodeNullableSerializableElement(eVar2, 4, i0.f3656a, null);
            num = num3;
            d10 = d11;
            i = 31;
        } else {
            boolean z9 = true;
            int i6 = 0;
            Double d12 = null;
            Integer num4 = null;
            Integer num5 = null;
            Long l11 = null;
            while (z9) {
                int iDecodeElementIndex = cVarBeginStructure.decodeElementIndex(eVar2);
                if (iDecodeElementIndex == -1) {
                    z9 = false;
                } else if (iDecodeElementIndex == 0) {
                    bool2 = (Boolean) cVarBeginStructure.decodeNullableSerializableElement(eVar2, 0, d8.g.f3645a, bool2);
                    i6 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    d12 = (Double) cVarBeginStructure.decodeNullableSerializableElement(eVar2, 1, r.f3701a, d12);
                    i6 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    num4 = (Integer) cVarBeginStructure.decodeNullableSerializableElement(eVar2, 2, c0.f3625a, num4);
                    i6 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    num5 = (Integer) cVarBeginStructure.decodeNullableSerializableElement(eVar2, 3, c0.f3625a, num5);
                    i6 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new f8.l(iDecodeElementIndex);
                    }
                    l11 = (Long) cVarBeginStructure.decodeNullableSerializableElement(eVar2, 4, i0.f3656a, l11);
                    i6 |= 16;
                }
            }
            i = i6;
            bool = bool2;
            d10 = d12;
            num = num4;
            num2 = num5;
            l10 = l11;
        }
        cVarBeginStructure.endStructure(eVar2);
        return new g(i, bool, d10, num, num2, l10);
    }

    @Override // z7.h, z7.a
    public final b8.e getDescriptor() {
        return descriptor;
    }

    @Override // z7.h
    public final void serialize(c8.f fVar, Object obj) {
        g gVar = (g) obj;
        gVar.getClass();
        b8.e eVar = descriptor;
        c8.d dVarBeginStructure = fVar.beginStructure(eVar);
        dVarBeginStructure.encodeNullableSerializableElement(eVar, 0, d8.g.f3645a, gVar.f4847a);
        dVarBeginStructure.encodeNullableSerializableElement(eVar, 1, r.f3701a, gVar.f4848b);
        c0 c0Var = c0.f3625a;
        dVarBeginStructure.encodeNullableSerializableElement(eVar, 2, c0Var, gVar.f4849c);
        dVarBeginStructure.encodeNullableSerializableElement(eVar, 3, c0Var, gVar.f4850d);
        dVarBeginStructure.encodeNullableSerializableElement(eVar, 4, i0.f3656a, gVar.f4851e);
        dVarBeginStructure.endStructure(eVar);
    }

    @Override // d8.x
    public final z7.b[] typeParametersSerializers() {
        return o0.f3685b;
    }
}
