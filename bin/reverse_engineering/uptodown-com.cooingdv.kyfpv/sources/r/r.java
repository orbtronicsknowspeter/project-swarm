package r;

import android.content.Context;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import y2.s;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile l f8849e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q2.e f8850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q2.e f8851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w.a f8852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x.g f8853d;

    public r(q2.e eVar, q2.e eVar2, w.a aVar, x.g gVar, s sVar) {
        this.f8850a = eVar;
        this.f8851b = eVar2;
        this.f8852c = aVar;
        this.f8853d = gVar;
        ((Executor) sVar.f11756b).execute(new a2.s(sVar, 17));
    }

    public static r a() {
        l lVar = f8849e;
        if (lVar != null) {
            return (r) lVar.f8841o.get();
        }
        androidx.privacysandbox.ads.adservices.customaudience.a.i("Not initialized!");
        return null;
    }

    public static void b(Context context) {
        if (f8849e == null) {
            synchronized (r.class) {
                try {
                    if (f8849e == null) {
                        k kVar = new k();
                        context.getClass();
                        kVar.f8835a = context;
                        f8849e = kVar.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final q c(p.a aVar) {
        byte[] bytes;
        Set setUnmodifiableSet = aVar instanceof p.a ? DesugarCollections.unmodifiableSet(p.a.f8392d) : Collections.singleton(new o.c("proto"));
        aVar.getClass();
        String str = aVar.f8394a;
        String str2 = aVar.f8395b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = ("1$" + str + "\\" + str2).getBytes(Charset.forName("UTF-8"));
        }
        return new q(setUnmodifiableSet, new j("cct", bytes, o.d.f8127a), this);
    }
}
