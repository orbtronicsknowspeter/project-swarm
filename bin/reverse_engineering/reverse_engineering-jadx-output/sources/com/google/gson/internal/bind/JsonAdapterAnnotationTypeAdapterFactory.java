package com.google.gson.internal.bind;

import com.google.gson.i;
import com.google.gson.internal.f;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements j {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final j f3144l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3.d f3145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f3146b = new ConcurrentHashMap();

    static {
        int i = 0;
        f3144l = new DummyTypeAdapterFactory(i);
        new DummyTypeAdapterFactory(i);
    }

    public JsonAdapterAnnotationTypeAdapterFactory(a3.d dVar) {
        this.f3145a = dVar;
    }

    @Override // com.google.gson.j
    public final i a(com.google.gson.b bVar, TypeToken typeToken) {
        h3.a aVar = (h3.a) typeToken.f3266a.getAnnotation(h3.a.class);
        if (aVar == null) {
            return null;
        }
        return b(this.f3145a, bVar, typeToken, aVar, true);
    }

    public final i b(a3.d dVar, com.google.gson.b bVar, TypeToken typeToken, h3.a aVar, boolean z9) {
        i iVarA;
        Object objD = dVar.B(new TypeToken(aVar.value()), true).d();
        boolean zNullSafe = aVar.nullSafe();
        if (objD instanceof i) {
            iVarA = (i) objD;
        } else {
            if (!(objD instanceof j)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objD.getClass().getName() + " as a @JsonAdapter for " + f.k(typeToken.f3267b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            j jVar = (j) objD;
            if (z9) {
                j jVar2 = (j) this.f3146b.putIfAbsent(typeToken.f3266a, jVar);
                if (jVar2 != null) {
                    jVar = jVar2;
                }
            }
            iVarA = jVar.a(bVar, typeToken);
        }
        return (iVarA == null || !zNullSafe) ? iVarA : iVarA.a();
    }

    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    public static class DummyTypeAdapterFactory implements j {
        private DummyTypeAdapterFactory() {
        }

        @Override // com.google.gson.j
        public final i a(com.google.gson.b bVar, TypeToken typeToken) {
            throw new AssertionError("Factory should not be used");
        }

        public /* synthetic */ DummyTypeAdapterFactory(int i) {
            this();
        }
    }
}
