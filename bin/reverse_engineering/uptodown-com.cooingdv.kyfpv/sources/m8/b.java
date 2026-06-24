package m8;

import java.lang.ref.Reference;
import java.net.Socket;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f7679a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f7680b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f7681c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f7682d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static b f7683e;

    public static Socket a(m mVar, a aVar, p8.e eVar) {
        for (p8.a aVar2 : mVar.f7761d) {
            if (aVar2.g(aVar, null) && aVar2.h != null && aVar2 != eVar.a()) {
                if (eVar.f8493l != null || eVar.i.f8477n.size() != 1) {
                    throw new IllegalStateException();
                }
                Reference reference = (Reference) eVar.i.f8477n.get(0);
                Socket socketB = eVar.b(true, false, false);
                eVar.i = aVar2;
                aVar2.f8477n.add(reference);
                return socketB;
            }
        }
        return null;
    }

    public static void b(m mVar, a aVar, p8.e eVar, f0 f0Var) {
        for (p8.a aVar2 : mVar.f7761d) {
            if (aVar2.g(aVar, f0Var)) {
                if (eVar.i != null) {
                    throw new IllegalStateException();
                }
                eVar.i = aVar2;
                eVar.j = true;
                aVar2.f8477n.add(new p8.d(eVar, eVar.f));
                return;
            }
        }
    }
}
