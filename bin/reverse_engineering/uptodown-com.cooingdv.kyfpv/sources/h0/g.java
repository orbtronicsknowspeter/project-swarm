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
    public static boolean f5412b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f5413c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f5415e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f5411a = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f5414d = new AtomicBoolean();

    public static boolean a(Context context) {
        try {
            if (!f5413c) {
                try {
                    PackageInfo packageInfoB = r0.c.a(context).b(Build.VERSION.SDK_INT >= 28 ? 134217792 : 64, "com.google.android.gms");
                    h.a(context);
                    if (packageInfoB == null || h.c(packageInfoB, false) || !h.c(packageInfoB, true)) {
                        f5412b = false;
                    } else {
                        f5412b = true;
                    }
                    f5413c = true;
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
                    f5413c = true;
                }
            }
            return f5412b || !"user".equals(Build.TYPE);
        } catch (Throwable th) {
            f5413c = true;
            throw th;
        }
    }
}
