package d8;

import com.google.android.gms.internal.measurement.i5;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements z7.b {
    @Override // z7.a
    public final Object deserialize(c8.e eVar) {
        Object objDecodeSerializableElement;
        eVar.getClass();
        z7.e eVar2 = (z7.e) this;
        b8.e descriptor = eVar2.getDescriptor();
        c8.c cVarBeginStructure = eVar.beginStructure(descriptor);
        if (cVarBeginStructure.decodeSequentially()) {
            objDecodeSerializableElement = cVarBeginStructure.decodeSerializableElement(eVar2.getDescriptor(), 1, i5.t(this, cVarBeginStructure, cVarBeginStructure.decodeStringElement(eVar2.getDescriptor(), 0)), null);
        } else {
            Object objDecodeSerializableElement2 = null;
            String strDecodeStringElement = null;
            while (true) {
                int iDecodeElementIndex = cVarBeginStructure.decodeElementIndex(eVar2.getDescriptor());
                if (iDecodeElementIndex != -1) {
                    if (iDecodeElementIndex == 0) {
                        strDecodeStringElement = cVarBeginStructure.decodeStringElement(eVar2.getDescriptor(), iDecodeElementIndex);
                    } else {
                        if (iDecodeElementIndex != 1) {
                            StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                            if (strDecodeStringElement == null) {
                                strDecodeStringElement = "unknown class";
                            }
                            sb.append(strDecodeStringElement);
                            sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                            sb.append(iDecodeElementIndex);
                            throw new z7.g(sb.toString());
                        }
                        if (strDecodeStringElement == null) {
                            com.google.gson.internal.a.p("Cannot read polymorphic value before its type token");
                            return null;
                        }
                        objDecodeSerializableElement2 = cVarBeginStructure.decodeSerializableElement(eVar2.getDescriptor(), iDecodeElementIndex, i5.t(this, cVarBeginStructure, strDecodeStringElement), null);
                    }
                } else {
                    if (objDecodeSerializableElement2 == null) {
                        s1.o.o(a4.x.j("Polymorphic value has not been read for class ", strDecodeStringElement));
                        return null;
                    }
                    objDecodeSerializableElement = objDecodeSerializableElement2;
                }
            }
        }
        cVarBeginStructure.endStructure(descriptor);
        return objDecodeSerializableElement;
    }

    @Override // z7.h
    public final void serialize(c8.f fVar, Object obj) {
        obj.getClass();
        z7.h hVarU = i5.u(this, (c8.b) fVar, obj);
        z7.e eVar = (z7.e) this;
        b8.e descriptor = eVar.getDescriptor();
        c8.d dVarBeginStructure = fVar.beginStructure(descriptor);
        dVarBeginStructure.encodeStringElement(eVar.getDescriptor(), 0, hVarU.getDescriptor().a());
        dVarBeginStructure.encodeSerializableElement(eVar.getDescriptor(), 1, hVarU, obj);
        dVarBeginStructure.endStructure(descriptor);
    }
}
