package com.google.gson.internal.bind;

import a4.x;
import com.google.android.gms.internal.measurement.z3;
import com.google.gson.i;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.f;
import com.google.gson.internal.m;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class ReflectiveTypeAdapterFactory implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3.d f3159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3160b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Excluder f3161l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f3162m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f3163n;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    class AnonymousClass1 extends i {
        @Override // com.google.gson.i
        public final Object b(k3.a aVar) throws IOException {
            aVar.N();
            return null;
        }

        @Override // com.google.gson.i
        public final void c(k3.b bVar, Object obj) throws IOException {
            bVar.n();
        }

        public final String toString() {
            return "AnonymousOrNonStaticLocalClassAdapter";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    public static abstract class Adapter<T, A> extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f3164a;

        public Adapter(d dVar) {
            this.f3164a = dVar;
        }

        @Override // com.google.gson.i
        public final Object b(k3.a aVar) throws IOException {
            if (aVar.H() == 9) {
                aVar.D();
                return null;
            }
            Object objD = d();
            Map map = this.f3164a.f3190a;
            try {
                aVar.c();
                while (aVar.n()) {
                    c cVar = (c) map.get(aVar.B());
                    if (cVar == null) {
                        aVar.N();
                    } else {
                        f(objD, aVar, cVar);
                    }
                }
                aVar.h();
                return e(objD);
            } catch (IllegalAccessException e10) {
                z3 z3Var = j3.c.f6566a;
                androidx.privacysandbox.ads.adservices.customaudience.a.m("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
                return null;
            } catch (IllegalStateException e11) {
                throw new com.google.gson.e(e11);
            }
        }

        @Override // com.google.gson.i
        public final void c(k3.b bVar, Object obj) throws IOException {
            if (obj == null) {
                bVar.n();
                return;
            }
            bVar.d();
            try {
                Iterator it = this.f3164a.f3191b.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).a(bVar, obj);
                }
                bVar.h();
            } catch (IllegalAccessException e10) {
                z3 z3Var = j3.c.f6566a;
                androidx.privacysandbox.ads.adservices.customaudience.a.m("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
            }
        }

        public abstract Object d();

        public abstract Object e(Object obj);

        public abstract void f(Object obj, k3.a aVar, c cVar);
    }

    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    public static final class RecordAdapter<T> extends Adapter<T, Object[]> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final HashMap f3166e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Constructor f3167b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object[] f3168c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final HashMap f3169d;

        static {
            HashMap map = new HashMap();
            map.put(Byte.TYPE, (byte) 0);
            map.put(Short.TYPE, (short) 0);
            map.put(Integer.TYPE, 0);
            map.put(Long.TYPE, 0L);
            map.put(Float.TYPE, Float.valueOf(0.0f));
            map.put(Double.TYPE, Double.valueOf(0.0d));
            map.put(Character.TYPE, (char) 0);
            map.put(Boolean.TYPE, Boolean.FALSE);
            f3166e = map;
        }

        public RecordAdapter(Class cls, d dVar) {
            super(dVar);
            this.f3169d = new HashMap();
            z3 z3Var = j3.c.f6566a;
            Constructor constructorQ = z3Var.q(cls);
            this.f3167b = constructorQ;
            j3.c.f(constructorQ);
            String[] strArrV = z3Var.v(cls);
            for (int i = 0; i < strArrV.length; i++) {
                this.f3169d.put(strArrV[i], Integer.valueOf(i));
            }
            Class<?>[] parameterTypes = this.f3167b.getParameterTypes();
            this.f3168c = new Object[parameterTypes.length];
            for (int i6 = 0; i6 < parameterTypes.length; i6++) {
                this.f3168c[i6] = f3166e.get(parameterTypes[i6]);
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object d() {
            return (Object[]) this.f3168c.clone();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object e(Object obj) {
            Object[] objArr = (Object[]) obj;
            Constructor constructor = this.f3167b;
            try {
                return constructor.newInstance(objArr);
            } catch (IllegalAccessException e10) {
                z3 z3Var = j3.c.f6566a;
                androidx.privacysandbox.ads.adservices.customaudience.a.m("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
                return null;
            } catch (IllegalArgumentException e11) {
                e = e11;
                throw new RuntimeException("Failed to invoke constructor '" + j3.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
            } catch (InstantiationException e12) {
                e = e12;
                throw new RuntimeException("Failed to invoke constructor '" + j3.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
            } catch (InvocationTargetException e13) {
                androidx.privacysandbox.ads.adservices.customaudience.a.m("Failed to invoke constructor '" + j3.c.b(constructor) + "' with args " + Arrays.toString(objArr), e13.getCause());
                return null;
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final void f(Object obj, k3.a aVar, c cVar) {
            Object[] objArr = (Object[]) obj;
            String str = cVar.f3186c;
            Integer num = (Integer) this.f3169d.get(str);
            if (num == null) {
                androidx.privacysandbox.ads.adservices.customaudience.a.k("Could not find the index in the constructor '", j3.c.b(this.f3167b), "' for field with name '", str, "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
                return;
            }
            int iIntValue = num.intValue();
            Object objB = cVar.f.b(aVar);
            if (objB != null || !cVar.g) {
                objArr[iIntValue] = objB;
            } else {
                StringBuilder sbV = x.v("null is not allowed as value for record component '", str, "' of primitive type; at path ");
                sbV.append(aVar.j(false));
                throw new a1.b(sbV.toString());
            }
        }
    }

    public ReflectiveTypeAdapterFactory(a3.d dVar, int i, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        List list = Collections.EMPTY_LIST;
        this.f3159a = dVar;
        this.f3160b = i;
        this.f3161l = excluder;
        this.f3162m = jsonAdapterAnnotationTypeAdapterFactory;
        this.f3163n = list;
    }

    public static void b(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + j3.c.c(field) + " and " + j3.c.c(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    @Override // com.google.gson.j
    public final i a(com.google.gson.b bVar, TypeToken typeToken) {
        Class cls = typeToken.f3266a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        z3 z3Var = j3.c.f6566a;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new AnonymousClass1();
        }
        List list = Collections.EMPTY_LIST;
        f.e();
        return j3.c.f6566a.A(cls) ? new RecordAdapter(cls, c(bVar, typeToken, cls, true)) : new FieldReflectionAdapter(this.f3159a.B(typeToken, true), c(bVar, typeToken, cls, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c7  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r29v0, types: [com.google.gson.internal.bind.ReflectiveTypeAdapterFactory] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.gson.internal.bind.d c(com.google.gson.b r30, com.google.gson.reflect.TypeToken r31, java.lang.Class r32, boolean r33) {
        /*
            Method dump skipped, instruction units count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.c(com.google.gson.b, com.google.gson.reflect.TypeToken, java.lang.Class, boolean):com.google.gson.internal.bind.d");
    }

    public final boolean d(Field field, boolean z9) {
        boolean z10;
        Excluder excluder = this.f3161l;
        excluder.getClass();
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || excluder.b(field.getType(), z9)) {
            z10 = true;
        } else {
            List list = z9 ? excluder.f3121a : excluder.f3122b;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    com.google.gson.internal.a.o();
                    return false;
                }
            }
            z10 = false;
        }
        return !z10;
    }

    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    public static final class FieldReflectionAdapter<T> extends Adapter<T, T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final m f3165b;

        public FieldReflectionAdapter(m mVar, d dVar) {
            super(dVar);
            this.f3165b = mVar;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object d() {
            return this.f3165b.d();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final void f(Object obj, k3.a aVar, c cVar) throws IllegalAccessException {
            Field field = cVar.f3185b;
            Object objB = cVar.f.b(aVar);
            if (objB == null && cVar.g) {
                return;
            }
            if (cVar.h) {
                throw new com.google.gson.e("Cannot set value of 'static final' ".concat(j3.c.d(field, false)));
            }
            field.set(obj, objB);
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object e(Object obj) {
            return obj;
        }
    }
}
