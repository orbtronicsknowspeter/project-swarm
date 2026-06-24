package com.google.gson;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i {
    public final i a() {
        return !(this instanceof TypeAdapter$NullSafeTypeAdapter) ? new i() { // from class: com.google.gson.TypeAdapter$NullSafeTypeAdapter
            @Override // com.google.gson.i
            public final Object b(k3.a aVar) throws IOException {
                if (aVar.H() != 9) {
                    return this.f3102a.b(aVar);
                }
                aVar.D();
                return null;
            }

            @Override // com.google.gson.i
            public final void c(k3.b bVar, Object obj) throws IOException {
                if (obj == null) {
                    bVar.n();
                } else {
                    this.f3102a.c(bVar, obj);
                }
            }

            public final String toString() {
                return "NullSafeTypeAdapter[" + this.f3102a + "]";
            }
        } : this;
    }

    public abstract Object b(k3.a aVar);

    public abstract void c(k3.b bVar, Object obj);
}
