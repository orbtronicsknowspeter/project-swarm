package r0;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f8857b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f8858a;

    static {
        c cVar = new c();
        cVar.f8858a = null;
        f8857b = cVar;
    }

    public static b a(Context context) {
        b bVar;
        c cVar = f8857b;
        synchronized (cVar) {
            try {
                if (cVar.f8858a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    cVar.f8858a = new b(context);
                }
                bVar = cVar.f8858a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }
}
