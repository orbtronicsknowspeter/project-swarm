package com.google.gson.internal.bind;

import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.Enum;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import s1.o;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
class EnumTypeAdapter<T extends Enum<T>> extends i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f3140d = new j() { // from class: com.google.gson.internal.bind.EnumTypeAdapter.1
        @Override // com.google.gson.j
        public final i a(com.google.gson.b bVar, TypeToken typeToken) {
            Class superclass = typeToken.f3266a;
            if (!Enum.class.isAssignableFrom(superclass) || superclass == Enum.class) {
                return null;
            }
            if (!superclass.isEnum()) {
                superclass = superclass.getSuperclass();
            }
            return new EnumTypeAdapter(superclass);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3141a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f3142b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f3143c = new HashMap();

    public EnumTypeAdapter(Class cls) {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i] = field;
                    i++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r42 = (Enum) field2.get(null);
                String strName = r42.name();
                String string = r42.toString();
                h3.b bVar = (h3.b) field2.getAnnotation(h3.b.class);
                if (bVar != null) {
                    strName = bVar.value();
                    for (String str : bVar.alternate()) {
                        this.f3141a.put(str, r42);
                    }
                }
                this.f3141a.put(strName, r42);
                this.f3142b.put(string, r42);
                this.f3143c.put(r42, strName);
            }
        } catch (IllegalAccessException e10) {
            o.j(e10);
            throw null;
        }
    }

    @Override // com.google.gson.i
    public final Object b(k3.a aVar) throws IOException {
        if (aVar.H() == 9) {
            aVar.D();
            return null;
        }
        String strF = aVar.F();
        Enum r02 = (Enum) this.f3141a.get(strF);
        return r02 == null ? (Enum) this.f3142b.get(strF) : r02;
    }

    @Override // com.google.gson.i
    public final void c(k3.b bVar, Object obj) throws IOException {
        Enum r32 = (Enum) obj;
        bVar.C(r32 == null ? null : (String) this.f3143c.get(r32));
    }
}
