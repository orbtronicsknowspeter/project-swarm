package e8;

import b2.t1;
import d8.k1;
import d8.u0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class o implements z7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f4780a = new o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u0 f4781b = t1.a("kotlinx.serialization.json.JsonLiteral", b8.d.f1111p);

    @Override // z7.a
    public final Object deserialize(c8.e eVar) {
        eVar.getClass();
        k kVarA = d0.b.m(eVar).a();
        if (kVarA instanceof n) {
            return (n) kVarA;
        }
        throw f8.m.e("Unexpected JSON element, expected JsonLiteral, had " + kotlin.jvm.internal.y.a(kVarA.getClass()), kVarA.toString(), -1);
    }

    @Override // z7.h, z7.a
    public final b8.e getDescriptor() {
        return f4781b;
    }

    @Override // z7.h
    public final void serialize(c8.f fVar, Object obj) {
        n nVar = (n) obj;
        nVar.getClass();
        String str = nVar.f4779b;
        d0.b.i(fVar);
        if (nVar.f4778a) {
            fVar.encodeString(str);
            return;
        }
        Long lI0 = l7.t.i0(str);
        if (lI0 != null) {
            fVar.encodeLong(lI0.longValue());
            return;
        }
        p6.s sVarP = t1.P(str);
        if (sVarP != null) {
            fVar.encodeInline(k1.f3666b).encodeLong(sVarP.f8458a);
            return;
        }
        Boolean bool = null;
        Double dValueOf = l7.s.f0(str) ? Double.valueOf(Double.parseDouble(str)) : null;
        if (dValueOf != null) {
            fVar.encodeDouble(dValueOf.doubleValue());
            return;
        }
        if (str.equals("true")) {
            bool = Boolean.TRUE;
        } else if (str.equals("false")) {
            bool = Boolean.FALSE;
        }
        if (bool != null) {
            fVar.encodeBoolean(bool.booleanValue());
        } else {
            fVar.encodeString(str);
        }
    }
}
