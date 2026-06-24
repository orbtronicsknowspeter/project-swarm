package com.google.gson.internal.bind;

import com.google.gson.i;
import com.google.gson.internal.f;
import com.google.gson.internal.m;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import e1.c0;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class MapTypeAdapterFactory implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3.d f3148a;

    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    public final class Adapter<K, V> extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f3149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i f3150b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final m f3151c;

        public Adapter(MapTypeAdapterFactory mapTypeAdapterFactory, i iVar, i iVar2, m mVar) {
            this.f3149a = iVar;
            this.f3150b = iVar2;
            this.f3151c = mVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.i
        public final Object b(k3.a aVar) throws IOException {
            int iH = aVar.H();
            if (iH == 9) {
                aVar.D();
                return null;
            }
            Map map = (Map) this.f3151c.d();
            if (iH == 1) {
                aVar.b();
                while (aVar.n()) {
                    aVar.b();
                    Object objB = ((TypeAdapterRuntimeTypeWrapper) this.f3149a).f3171b.b(aVar);
                    if (map.put(objB, ((TypeAdapterRuntimeTypeWrapper) this.f3150b).f3171b.b(aVar)) != null) {
                        throw new com.google.gson.e("duplicate key: " + objB);
                    }
                    aVar.f();
                }
                aVar.f();
                return map;
            }
            aVar.c();
            while (aVar.n()) {
                c0.f3841r.getClass();
                int iE = aVar.f6956p;
                if (iE == 0) {
                    iE = aVar.e();
                }
                if (iE == 13) {
                    aVar.f6956p = 9;
                } else if (iE == 12) {
                    aVar.f6956p = 8;
                } else {
                    if (iE != 14) {
                        throw aVar.P("a name");
                    }
                    aVar.f6956p = 10;
                }
                Object objB2 = ((TypeAdapterRuntimeTypeWrapper) this.f3149a).f3171b.b(aVar);
                if (map.put(objB2, ((TypeAdapterRuntimeTypeWrapper) this.f3150b).f3171b.b(aVar)) != null) {
                    throw new com.google.gson.e("duplicate key: " + objB2);
                }
            }
            aVar.h();
            return map;
        }

        @Override // com.google.gson.i
        public final void c(k3.b bVar, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map == null) {
                bVar.n();
                return;
            }
            bVar.d();
            for (Map.Entry<K, V> entry : map.entrySet()) {
                bVar.i(String.valueOf(entry.getKey()));
                this.f3150b.c(bVar, entry.getValue());
            }
            bVar.h();
        }
    }

    public MapTypeAdapterFactory(a3.d dVar) {
        this.f3148a = dVar;
    }

    @Override // com.google.gson.j
    public final i a(com.google.gson.b bVar, TypeToken typeToken) {
        Type[] actualTypeArguments;
        Type type = typeToken.f3267b;
        Class cls = typeToken.f3266a;
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (Properties.class.isAssignableFrom(cls)) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            Type typeH = f.h(type, cls, Map.class);
            actualTypeArguments = typeH instanceof ParameterizedType ? ((ParameterizedType) typeH).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = actualTypeArguments[0];
        Type type3 = actualTypeArguments[1];
        return new Adapter(this, new TypeAdapterRuntimeTypeWrapper(bVar, (type2 == Boolean.TYPE || type2 == Boolean.class) ? e.f3194c : bVar.c(new TypeToken(type2)), type2), new TypeAdapterRuntimeTypeWrapper(bVar, bVar.c(new TypeToken(type3)), type3), this.f3148a.B(typeToken, false));
    }
}
