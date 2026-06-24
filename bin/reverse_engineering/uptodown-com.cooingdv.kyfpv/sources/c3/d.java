package c3;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements l2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f1212a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l2.c f1213b = l2.c.a("appId");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l2.c f1214c = l2.c.a("deviceModel");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l2.c f1215d = l2.c.a("sessionSdkVersion");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l2.c f1216e = l2.c.a("osVersion");
    public static final l2.c f = l2.c.a("logEnvironment");
    public static final l2.c g = l2.c.a("androidAppInfo");

    @Override // l2.a
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        l2.e eVar = (l2.e) obj2;
        eVar.a(f1213b, bVar.f1193a);
        eVar.a(f1214c, Build.MODEL);
        eVar.a(f1215d, "3.0.4");
        eVar.a(f1216e, Build.VERSION.RELEASE);
        eVar.a(f, y.LOG_ENVIRONMENT_PROD);
        eVar.a(g, bVar.f1194b);
    }
}
