package d8;

import com.google.android.gms.internal.measurement.z3;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class p1 implements z7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p1 f3691a = new p1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u0 f3692b = new u0("kotlin.uuid.Uuid", b8.d.f1111p);

    @Override // z7.a
    public final Object deserialize(c8.e eVar) {
        eVar.getClass();
        String strDecodeString = eVar.decodeString();
        strDecodeString.getClass();
        int length = strDecodeString.length();
        if (length == 32) {
            long jB = l7.c.b(0, 16, strDecodeString);
            long jB2 = l7.c.b(16, 32, strDecodeString);
            if (jB != 0 || jB2 != 0) {
                return new n7.a(jB, jB2);
            }
        } else {
            if (length != 36) {
                StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                sb.append(strDecodeString.length() <= 64 ? strDecodeString : strDecodeString.substring(0, 64).concat("..."));
                sb.append("\" of length ");
                sb.append(strDecodeString.length());
                throw new IllegalArgumentException(sb.toString());
            }
            long jB3 = l7.c.b(0, 8, strDecodeString);
            z3.i(8, strDecodeString);
            long jB4 = l7.c.b(9, 13, strDecodeString);
            z3.i(13, strDecodeString);
            long jB5 = l7.c.b(14, 18, strDecodeString);
            z3.i(18, strDecodeString);
            long jB6 = l7.c.b(19, 23, strDecodeString);
            z3.i(23, strDecodeString);
            long j = (jB4 << 16) | (jB3 << 32) | jB5;
            long jB7 = l7.c.b(24, 36, strDecodeString) | (jB6 << 48);
            if (j != 0 || jB7 != 0) {
                return new n7.a(j, jB7);
            }
        }
        return n7.a.f8108l;
    }

    @Override // z7.h, z7.a
    public final b8.e getDescriptor() {
        return f3692b;
    }

    @Override // z7.h
    public final void serialize(c8.f fVar, Object obj) {
        n7.a aVar = (n7.a) obj;
        aVar.getClass();
        fVar.encodeString(aVar.toString());
    }
}
