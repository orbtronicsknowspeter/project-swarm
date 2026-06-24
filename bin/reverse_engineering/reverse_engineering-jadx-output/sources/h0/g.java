package h0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f5411b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f5412c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f5414e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f5410a = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f5413d = new AtomicBoolean();

    public static boolean a(Context context) {
        try {
            if (!f5412c) {
                try {
                    PackageInfo packageInfoB = r0.c.a(context).b(Build.VERSION.SDK_INT >= 28 ? 134217792 : 64, "com.google.android.gms");
                    h.a(context);
                    if (packageInfoB == null || h.c(packageInfoB, false) || !h.c(packageInfoB, true)) {
                        f5411b = false;
                    } else {
                        f5411b = true;
                    }
                    f5412c = true;
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
                    f5412c = true;
                }
            }
            return f5411b || !"user".equals(Build.TYPE);
        } catch (Throwable th) {
            f5412c = true;
            throw th;
        }
    }
}
