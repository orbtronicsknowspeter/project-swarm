package e8;

import f8.a0;
import f8.c0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f4761d = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f4762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g8.f f4763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a3.d f4764c;

    public b() {
        h hVar = new h();
        g8.d dVar = g8.i.f5388a;
        this.f4762a = hVar;
        this.f4763b = dVar;
        this.f4764c = new a3.d(27);
    }

    public final Object a(z7.a aVar, String str) {
        aVar.getClass();
        this.f4762a.getClass();
        a0 a0Var = new a0(str);
        Object objDecodeSerializableValue = new f8.x(this, c0.f4942l, a0Var, aVar.getDescriptor(), null).decodeSerializableValue(aVar);
        if (a0Var.i() == 10) {
            return objDecodeSerializableValue;
        }
        a0.p(a0Var, "Expected EOF after parsing, but had " + str.charAt(a0Var.f4931b - 1) + " instead", 0, null, 6);
        throw null;
    }

    public final String b(z7.h hVar, Object obj) {
        char[] cArr;
        hVar.getClass();
        f8.q qVar = new f8.q(0);
        f8.c cVar = f8.c.f4939c;
        synchronized (cVar) {
            q6.i iVar = cVar.f4940a;
            cArr = null;
            char[] cArr2 = (char[]) (iVar.isEmpty() ? null : iVar.removeLast());
            if (cArr2 != null) {
                cVar.f4941b -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        qVar.f4966c = cArr;
        try {
            c0 c0Var = c0.f4942l;
            f8.y[] yVarArr = new f8.y[c0.f4947q.size()];
            this.f4762a.getClass();
            new f8.y(new a2.i(qVar), this, c0Var, yVarArr).encodeSerializableValue(hVar, obj);
            return qVar.toString();
        } finally {
            qVar.g();
        }
    }
}
