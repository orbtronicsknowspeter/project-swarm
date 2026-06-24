package f1;

import android.content.Context;
import android.util.Log;
import g0.m;
import h0.f;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f4814a = f.f5410b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f4815b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f4816c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f4817d = false;

    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e6 A[Catch: all -> 0x0066, TryCatch #1 {, blocks: (B:12:0x0054, B:15:0x005b, B:22:0x007e, B:23:0x0083, B:20:0x006a, B:25:0x0085, B:27:0x008a, B:33:0x0096, B:35:0x009a, B:38:0x00d6, B:41:0x00e6, B:42:0x00eb, B:44:0x00ed, B:45:0x00f9), top: B:50:0x0054, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ed A[Catch: all -> 0x0066, TryCatch #1 {, blocks: (B:12:0x0054, B:15:0x005b, B:22:0x007e, B:23:0x0083, B:20:0x006a, B:25:0x0085, B:27:0x008a, B:33:0x0096, B:35:0x009a, B:38:0x00d6, B:41:0x00e6, B:42:0x00eb, B:44:0x00ed, B:45:0x00f9), top: B:50:0x0054, inners: #0, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r13) throws g0.m {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.a.a(android.content.Context):void");
    }

    public static void b(Context context, String str) throws m {
        try {
            if (f4816c == null) {
                f4816c = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            f4816c.invoke(null, context);
        } catch (Exception e10) {
            Throwable cause = e10.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e10.toString() : cause.toString())));
            }
            throw new m();
        }
    }
}
