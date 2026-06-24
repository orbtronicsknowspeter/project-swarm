package c2;

import android.util.JsonReader;
import b2.a2;
import b2.b0;
import b2.b1;
import b2.b2;
import b2.c0;
import b2.c1;
import b2.c2;
import b2.d0;
import b2.d2;
import b2.e;
import b2.e0;
import b2.e1;
import b2.e2;
import b2.f0;
import b2.f1;
import b2.f2;
import b2.g;
import b2.g0;
import b2.g1;
import b2.g2;
import b2.h;
import b2.h0;
import b2.h2;
import b2.i;
import b2.i1;
import b2.i2;
import b2.j;
import b2.j0;
import b2.j1;
import b2.j2;
import b2.k;
import b2.k0;
import b2.k2;
import b2.l;
import b2.l0;
import b2.l2;
import b2.m;
import b2.m2;
import b2.n;
import b2.n0;
import b2.n2;
import b2.o;
import b2.o1;
import b2.p;
import b2.p0;
import b2.p1;
import b2.q;
import b2.q0;
import b2.q1;
import b2.r;
import b2.r0;
import b2.r1;
import b2.s;
import b2.s0;
import b2.s1;
import b2.t;
import b2.t0;
import b2.t1;
import b2.u;
import b2.u0;
import b2.u1;
import b2.v;
import b2.v0;
import b2.v1;
import b2.w;
import b2.w0;
import b2.w1;
import b2.x;
import b2.x0;
import b2.x1;
import b2.y;
import b2.y0;
import b2.y1;
import b2.z;
import b2.z0;
import b2.z1;
import g5.f;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import n2.d;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f1184a;

    static {
        d dVar = new d();
        b2.d dVar2 = b2.d.f754a;
        dVar.a(n2.class, dVar2);
        dVar.a(b0.class, dVar2);
        j jVar = j.f822a;
        dVar.a(m2.class, jVar);
        dVar.a(j0.class, jVar);
        g gVar = g.f789a;
        dVar.a(u1.class, gVar);
        dVar.a(k0.class, gVar);
        h hVar = h.f797a;
        dVar.a(t1.class, hVar);
        dVar.a(l0.class, hVar);
        z zVar = z.f986a;
        dVar.a(l2.class, zVar);
        dVar.a(j1.class, zVar);
        y yVar = y.f976a;
        dVar.a(k2.class, yVar);
        dVar.a(i1.class, yVar);
        i iVar = i.f805a;
        dVar.a(v1.class, iVar);
        dVar.a(n0.class, iVar);
        t tVar = t.f935a;
        dVar.a(j2.class, tVar);
        dVar.a(p0.class, tVar);
        k kVar = k.f838a;
        dVar.a(d2.class, kVar);
        dVar.a(q0.class, kVar);
        m mVar = m.f861a;
        dVar.a(b2.class, mVar);
        dVar.a(r0.class, mVar);
        p pVar = p.f897a;
        dVar.a(a2.class, pVar);
        dVar.a(v0.class, pVar);
        q qVar = q.f906a;
        dVar.a(z1.class, qVar);
        dVar.a(x0.class, qVar);
        n nVar = n.f876a;
        dVar.a(x1.class, nVar);
        dVar.a(t0.class, nVar);
        b2.b bVar = b2.b.f728a;
        dVar.a(p1.class, bVar);
        dVar.a(d0.class, bVar);
        b2.a aVar = b2.a.f711a;
        dVar.a(o1.class, aVar);
        dVar.a(e0.class, aVar);
        o oVar = o.f888a;
        dVar.a(y1.class, oVar);
        dVar.a(u0.class, oVar);
        l lVar = l.f851a;
        dVar.a(w1.class, lVar);
        dVar.a(s0.class, lVar);
        b2.c cVar = b2.c.f745a;
        dVar.a(q1.class, cVar);
        dVar.a(f0.class, cVar);
        r rVar = r.f916a;
        dVar.a(c2.class, rVar);
        dVar.a(z0.class, rVar);
        s sVar = s.f926a;
        dVar.a(e2.class, sVar);
        dVar.a(b1.class, sVar);
        u uVar = u.f948a;
        dVar.a(f2.class, uVar);
        dVar.a(c1.class, uVar);
        x xVar = x.f969a;
        dVar.a(i2.class, xVar);
        dVar.a(g1.class, xVar);
        v vVar = v.f953a;
        dVar.a(h2.class, vVar);
        dVar.a(e1.class, vVar);
        w wVar = w.f961a;
        dVar.a(g2.class, wVar);
        dVar.a(f1.class, wVar);
        e eVar = e.f772a;
        dVar.a(s1.class, eVar);
        dVar.a(g0.class, eVar);
        b2.f fVar = b2.f.f782a;
        dVar.a(r1.class, fVar);
        dVar.a(h0.class, fVar);
        dVar.f7930d = true;
        f1184a = new f(dVar, 10);
    }

    public static x0 a(JsonReader jsonReader) throws IOException {
        w0 w0Var = new w0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    w0Var.f967d = jsonReader.nextLong();
                    w0Var.f = (byte) (w0Var.f | 2);
                    break;
                case "symbol":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        com.google.gson.internal.a.i("Null symbol");
                        return null;
                    }
                    w0Var.f965b = strNextString;
                    break;
                    break;
                case "pc":
                    w0Var.f964a = jsonReader.nextLong();
                    w0Var.f = (byte) (w0Var.f | 1);
                    break;
                case "file":
                    w0Var.f966c = jsonReader.nextString();
                    break;
                case "importance":
                    w0Var.f968e = jsonReader.nextInt();
                    w0Var.f = (byte) (w0Var.f | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return w0Var.a();
    }

    public static f0 b(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("key")) {
                strNextString = jsonReader.nextString();
                if (strNextString == null) {
                    com.google.gson.internal.a.i("Null key");
                    return null;
                }
            } else if (strNextName.equals("value")) {
                strNextString2 = jsonReader.nextString();
                if (strNextString2 == null) {
                    com.google.gson.internal.a.i("Null value");
                    return null;
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (strNextString != null && strNextString2 != null) {
            return new f0(strNextString, strNextString2);
        }
        StringBuilder sb = new StringBuilder();
        if (strNextString == null) {
            sb.append(" key");
        }
        if (strNextString2 == null) {
            sb.append(" value");
        }
        androidx.privacysandbox.ads.adservices.customaudience.a.i(k0.k.h("Missing required properties:", sb));
        return null;
    }

    public static d0 c(JsonReader jsonReader) throws IOException {
        c0 c0Var = new c0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    c0Var.i = d(jsonReader, new androidx.privacysandbox.ads.adservices.customaudience.a(28));
                    break;
                case "pid":
                    c0Var.f748a = jsonReader.nextInt();
                    c0Var.j = (byte) (c0Var.j | 1);
                    break;
                case "pss":
                    c0Var.f752e = jsonReader.nextLong();
                    c0Var.j = (byte) (c0Var.j | 8);
                    break;
                case "rss":
                    c0Var.f = jsonReader.nextLong();
                    c0Var.j = (byte) (c0Var.j | 16);
                    break;
                case "timestamp":
                    c0Var.g = jsonReader.nextLong();
                    c0Var.j = (byte) (c0Var.j | 32);
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        com.google.gson.internal.a.i("Null processName");
                        return null;
                    }
                    c0Var.f749b = strNextString;
                    break;
                    break;
                case "reasonCode":
                    c0Var.f750c = jsonReader.nextInt();
                    c0Var.j = (byte) (c0Var.j | 2);
                    break;
                case "traceFile":
                    c0Var.h = jsonReader.nextString();
                    break;
                case "importance":
                    c0Var.f751d = jsonReader.nextInt();
                    c0Var.j = (byte) (c0Var.j | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c0Var.a();
    }

    public static List d(JsonReader jsonReader, b bVar) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(bVar.a(jsonReader));
        }
        jsonReader.endArray();
        return DesugarCollections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x028a, code lost:
    
        r0 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x028f, code lost:
    
        if (r5 != 0) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0291, code lost:
    
        r0.append(" name");
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0296, code lost:
    
        if (r6 != 0) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0298, code lost:
    
        r0.append(" code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x029f, code lost:
    
        if ((r4 & 1) != 0) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x02a1, code lost:
    
        r0.append(" address");
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x02a6, code lost:
    
        androidx.privacysandbox.ads.adservices.customaudience.a.i(k0.k.h("Missing required properties:", r0));
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Type inference failed for: r22v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Type inference failed for: r22v5 */
    /* JADX WARN: Type inference failed for: r23v1, types: [b2.t0] */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r23v6 */
    /* JADX WARN: Type inference failed for: r23v7 */
    /* JADX WARN: Type inference failed for: r23v8 */
    /* JADX WARN: Type inference failed for: r23v9 */
    /* JADX WARN: Type inference failed for: r24v1, types: [b2.p1] */
    /* JADX WARN: Type inference failed for: r24v2, types: [b2.d0] */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r25v1, types: [b2.u0] */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r26v6 */
    /* JADX WARN: Type inference failed for: r26v7 */
    /* JADX WARN: Type inference failed for: r26v8 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static b2.p0 e(android.util.JsonReader r29) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.c.e(android.util.JsonReader):b2.p0");
    }

    public static t0 f(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        byte b7 = 0;
        int iNextInt = 0;
        String strNextString = null;
        String strNextString2 = null;
        List listD = null;
        t0 t0VarF = null;
        while (true) {
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (b7 == 1 && strNextString != null && listD != null) {
                    return new t0(strNextString, strNextString2, listD, t0VarF, iNextInt);
                }
                StringBuilder sb = new StringBuilder();
                if (strNextString == null) {
                    sb.append(" type");
                }
                if (listD == null) {
                    sb.append(" frames");
                }
                if ((b7 & 1) == 0) {
                    sb.append(" overflowCount");
                }
                androidx.privacysandbox.ads.adservices.customaudience.a.i(k0.k.h("Missing required properties:", sb));
                return null;
            }
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    listD = d(jsonReader, new a(3));
                    if (listD == null) {
                        com.google.gson.internal.a.i("Null frames");
                        return null;
                    }
                    break;
                    break;
                case "reason":
                    strNextString2 = jsonReader.nextString();
                    break;
                case "type":
                    strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        com.google.gson.internal.a.i("Null type");
                        return null;
                    }
                    break;
                    break;
                case "causedBy":
                    t0VarF = f(jsonReader);
                    break;
                case "overflowCount":
                    iNextInt = jsonReader.nextInt();
                    b7 = (byte) (b7 | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
    }

    public static z0 g(JsonReader jsonReader) throws IOException {
        y0 y0Var = new y0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "pid":
                    y0Var.f982b = jsonReader.nextInt();
                    y0Var.f985e = (byte) (y0Var.f985e | 1);
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        com.google.gson.internal.a.i("Null processName");
                        return null;
                    }
                    y0Var.f981a = strNextString;
                    break;
                    break;
                case "defaultProcess":
                    y0Var.f984d = jsonReader.nextBoolean();
                    y0Var.f985e = (byte) (y0Var.f985e | 4);
                    break;
                case "importance":
                    y0Var.f983c = jsonReader.nextInt();
                    y0Var.f985e = (byte) (y0Var.f985e | 2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return y0Var.a();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0256  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static b2.b0 h(android.util.JsonReader r30) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.c.h(android.util.JsonReader):b2.b0");
    }

    public static b0 i(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                b0 b0VarH = h(jsonReader);
                jsonReader.close();
                return b0VarH;
            } finally {
            }
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }
}
