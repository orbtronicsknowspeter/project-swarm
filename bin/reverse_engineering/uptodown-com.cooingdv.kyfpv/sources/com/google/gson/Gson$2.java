package com.google.gson;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
class Gson$2 extends i {
    @Override // com.google.gson.i
    public final Object b(k3.a aVar) throws IOException {
        if (aVar.H() != 9) {
            return Float.valueOf((float) aVar.y());
        }
        aVar.D();
        return null;
    }

    @Override // com.google.gson.i
    public final void c(k3.b bVar, Object obj) throws IOException {
        Number numberValueOf = (Number) obj;
        if (numberValueOf == null) {
            bVar.n();
            return;
        }
        float fFloatValue = numberValueOf.floatValue();
        b.a(fFloatValue);
        if (!(numberValueOf instanceof Float)) {
            numberValueOf = Float.valueOf(fFloatValue);
        }
        bVar.B(numberValueOf);
    }
}
