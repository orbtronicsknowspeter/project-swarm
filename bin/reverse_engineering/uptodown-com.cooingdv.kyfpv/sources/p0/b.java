package p0;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import h0.g;
import h0.h;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f8405a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f8406b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Boolean f8407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Boolean f8408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Boolean f8409e;
    public static Boolean f;

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean b(Context context, int i) {
        if (d(context, i, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                h hVarA = h.a(context);
                hVarA.getClass();
                if (packageInfo != null) {
                    if (!h.c(packageInfo, false)) {
                        if (h.c(packageInfo, true)) {
                            if (!g.a(hVarA.f5417a)) {
                                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                            }
                        }
                    }
                    return true;
                }
                return false;
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        return false;
    }

    public static boolean c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f8407c == null) {
            f8407c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (f8407c.booleanValue() && Build.VERSION.SDK_INT < 24) {
            return true;
        }
        if (f8408d == null) {
            f8408d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (f8408d.booleanValue()) {
            return !a() || Build.VERSION.SDK_INT >= 30;
        }
        return false;
    }

    public static boolean d(Context context, int i, String str) {
        r0.b bVarA = r0.c.a(context);
        bVarA.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) bVarA.f8856a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
