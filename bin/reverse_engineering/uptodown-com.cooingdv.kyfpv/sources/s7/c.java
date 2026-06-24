package s7;

import f8.w;
import kotlin.jvm.internal.a0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t6.c[] f9349a = new t6.c[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w f9350b = new w("NULL");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f9351c = new w("UNINITIALIZED");

    public static /* synthetic */ r7.h a(i iVar, t6.h hVar, int i, q7.a aVar, int i6) {
        if ((i6 & 1) != 0) {
            hVar = t6.i.f10315a;
        }
        if ((i6 & 2) != 0) {
            i = -3;
        }
        if ((i6 & 4) != 0) {
            aVar = q7.a.f8730a;
        }
        return iVar.a(hVar, i, aVar);
    }

    public static final Object b(t6.h hVar, Object obj, Object obj2, d7.p pVar, t6.c cVar) {
        Object objInvoke;
        Object objL = t7.a.l(hVar, obj2);
        try {
            p pVar2 = new p(cVar, hVar);
            if (androidx.lifecycle.l.D(pVar)) {
                a0.b(2, pVar);
                objInvoke = pVar.invoke(obj, pVar2);
            } else {
                objInvoke = d0.b.Q(pVar, obj, pVar2);
            }
            t7.a.g(hVar, objL);
            if (objInvoke == u6.a.f10763a) {
                cVar.getClass();
            }
            return objInvoke;
        } catch (Throwable th) {
            t7.a.g(hVar, objL);
            throw th;
        }
    }
}
