package r0;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f8854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f8855b;

    public static synchronized boolean a(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f8854a;
        if (context2 != null && (bool = f8855b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f8855b = null;
        if (p0.b.a()) {
            f8855b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f8855b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f8855b = Boolean.FALSE;
            }
        }
        f8854a = applicationContext;
        return f8855b.booleanValue();
    }
}
