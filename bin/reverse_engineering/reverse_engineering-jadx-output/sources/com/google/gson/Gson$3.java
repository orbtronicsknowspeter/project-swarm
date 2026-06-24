package com.google.gson;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
class Gson$3 extends i {
    @Override // com.google.gson.i
    public final Object b(k3.a aVar) throws IOException {
        if (aVar.H() != 9) {
            return Long.valueOf(aVar.A());
        }
        aVar.D();
        return null;
    }

    @Override // com.google.gson.i
    public final void c(k3.b bVar, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            bVar.n();
        } else {
            bVar.C(number.toString());
        }
    }
}
