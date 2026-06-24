package f8;

import com.google.android.gms.internal.measurement.z3;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.annotation.Annotation;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f4958a = new n();

    public static final h a(Number number, String str, String str2) {
        str.getClass();
        str2.getClass();
        return d(-1, "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) k(-1, str2)));
    }

    public static final k b(Number number, String str) {
        return new k("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) k(-1, str)));
    }

    public static final k c(b8.e eVar) {
        return new k("Value of type '" + eVar.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + eVar.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final h d(int i, String str) {
        if (i >= 0) {
            str = "Unexpected JSON token at offset " + i + ": " + str;
        }
        return new h(str);
    }

    public static final h e(String str, CharSequence charSequence, int i) {
        charSequence.getClass();
        return d(i, str + "\nJSON input: " + ((Object) k(i, charSequence)));
    }

    public static final b8.e f(b8.e eVar, g8.f fVar) {
        b8.e eVarF;
        eVar.getClass();
        fVar.getClass();
        if (!kotlin.jvm.internal.l.a(eVar.getKind(), b8.g.h)) {
            return eVar.isInline() ? f(eVar.h(0), fVar) : eVar;
        }
        j7.c cVarA = a.a.A(eVar);
        b8.e descriptor = null;
        if (cVarA != null) {
            g8.c cVar = (g8.c) ((g8.d) fVar).f5377a.get(cVarA);
            z7.b bVarA = cVar != null ? cVar.a(q6.t.f8725a) : null;
            z7.b bVar = bVarA instanceof z7.b ? bVarA : null;
            if (bVar != null) {
                descriptor = bVar.getDescriptor();
            }
        }
        return (descriptor == null || (eVarF = f(descriptor, fVar)) == null) ? eVar : eVarF;
    }

    public static final byte g(char c9) {
        if (c9 < '~') {
            return d.f4951b[c9];
        }
        return (byte) 0;
    }

    public static final String h(b8.e eVar, e8.b bVar) {
        eVar.getClass();
        bVar.getClass();
        for (Annotation annotation : eVar.getAnnotations()) {
            if (annotation instanceof e8.g) {
                return ((e8.g) annotation).discriminator();
            }
        }
        return bVar.f4762a.f4773c;
    }

    public static final int i(b8.e eVar, e8.b bVar, String str) {
        eVar.getClass();
        bVar.getClass();
        str.getClass();
        e8.h hVar = bVar.f4762a;
        hVar.getClass();
        l(eVar, bVar);
        int iD = eVar.d(str);
        if (iD != -3 || !hVar.f4774d) {
            return iD;
        }
        a3.d dVar = bVar.f4764c;
        androidx.work.impl.utils.c cVar = new androidx.work.impl.utils.c(8, eVar, bVar);
        dVar.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) dVar.f63b;
        Map map = (Map) concurrentHashMap.get(eVar);
        n nVar = f4958a;
        Object obj = map != null ? map.get(nVar) : null;
        Object objInvoke = obj != null ? obj : null;
        if (objInvoke == null) {
            objInvoke = cVar.invoke();
            Object concurrentHashMap2 = concurrentHashMap.get(eVar);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(eVar, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(nVar, objInvoke);
        }
        Integer num = (Integer) ((Map) objInvoke).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final void j(a0 a0Var, String str) {
        a0Var.o(a0Var.f4931b - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final CharSequence k(int i, CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i6 = i - 30;
                int i10 = i + 30;
                String str = i6 <= 0 ? "" : ".....";
                String str2 = i10 >= charSequence.length() ? "" : ".....";
                StringBuilder sbT = a4.x.t(str);
                if (i6 < 0) {
                    i6 = 0;
                }
                int length = charSequence.length();
                if (i10 > length) {
                    i10 = length;
                }
                sbT.append(charSequence.subSequence(i6, i10).toString());
                sbT.append(str2);
                return sbT.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final void l(b8.e eVar, e8.b bVar) {
        eVar.getClass();
        bVar.getClass();
        if (kotlin.jvm.internal.l.a(eVar.getKind(), b8.i.h)) {
            bVar.f4762a.getClass();
        }
    }

    public static final Object m(e8.b bVar, String str, e8.t tVar, z7.a aVar) {
        bVar.getClass();
        str.getClass();
        return new r(bVar, tVar, str, aVar.getDescriptor()).decodeSerializableValue(aVar);
    }

    public static final c0 n(b8.e eVar, e8.b bVar) {
        eVar.getClass();
        z3 kind = eVar.getKind();
        if (kind instanceof b8.c) {
            return c0.f4945o;
        }
        if (kotlin.jvm.internal.l.a(kind, b8.i.i)) {
            return c0.f4943m;
        }
        if (!kotlin.jvm.internal.l.a(kind, b8.i.j)) {
            return c0.f4942l;
        }
        b8.e eVarF = f(eVar.h(0), bVar.f4763b);
        z3 kind2 = eVarF.getKind();
        if ((kind2 instanceof b8.d) || kotlin.jvm.internal.l.a(kind2, b8.h.h)) {
            return c0.f4944n;
        }
        bVar.f4762a.getClass();
        throw c(eVarF);
    }

    public static final void o(a0 a0Var, Number number) {
        a0.p(a0Var, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final String p(byte b7) {
        return b7 == 1 ? "quotation mark '\"'" : b7 == 2 ? "string escape sequence '\\'" : b7 == 4 ? "comma ','" : b7 == 5 ? "colon ':'" : b7 == 6 ? "start of the object '{'" : b7 == 7 ? "end of the object '}'" : b7 == 8 ? "start of the array '['" : b7 == 9 ? "end of the array ']'" : b7 == 10 ? "end of the input" : b7 == 127 ? "invalid token" : "valid token";
    }
}
