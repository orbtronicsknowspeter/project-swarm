package e1;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f3978b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f3979l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public f f3980m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Boolean f3981n;

    public final boolean h(String str) {
        return "1".equals(this.f3980m.d(str, "gaia_collection_enabled"));
    }

    public final boolean i(String str) {
        return "1".equals(this.f3980m.d(str, "measurement.event_sampling_enabled"));
    }

    public final boolean j() {
        if (this.f3978b == null) {
            Boolean boolS = s("app_measurement_lite");
            this.f3978b = boolS;
            if (boolS == null) {
                this.f3978b = Boolean.FALSE;
            }
        }
        return this.f3978b.booleanValue() || !this.f3876a.f4261b;
    }

    public final String k(String str) {
        t1 t1Var = this.f3876a;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            k0.y.g(str2);
            return str2;
        } catch (ClassNotFoundException e10) {
            w0 w0Var = t1Var.f4265o;
            t1.m(w0Var);
            w0Var.f4340o.c(e10, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e11) {
            w0 w0Var2 = t1Var.f4265o;
            t1.m(w0Var2);
            w0Var2.f4340o.c(e11, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e12) {
            w0 w0Var3 = t1Var.f4265o;
            t1.m(w0Var3);
            w0Var3.f4340o.c(e12, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e13) {
            w0 w0Var4 = t1Var.f4265o;
            t1.m(w0Var4);
            w0Var4.f4340o.c(e13, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    public final void l() {
        this.f3876a.getClass();
    }

    public final String m(String str, e0 e0Var) {
        return TextUtils.isEmpty(str) ? (String) e0Var.a(null) : (String) e0Var.a(this.f3980m.d(str, e0Var.f3894a));
    }

    public final long n(String str, e0 e0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) e0Var.a(null)).longValue();
        }
        String strD = this.f3980m.d(str, e0Var.f3894a);
        if (TextUtils.isEmpty(strD)) {
            return ((Long) e0Var.a(null)).longValue();
        }
        try {
            return ((Long) e0Var.a(Long.valueOf(Long.parseLong(strD)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) e0Var.a(null)).longValue();
        }
    }

    public final int o(String str, e0 e0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) e0Var.a(null)).intValue();
        }
        String strD = this.f3980m.d(str, e0Var.f3894a);
        if (TextUtils.isEmpty(strD)) {
            return ((Integer) e0Var.a(null)).intValue();
        }
        try {
            return ((Integer) e0Var.a(Integer.valueOf(Integer.parseInt(strD)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) e0Var.a(null)).intValue();
        }
    }

    public final double p(String str, e0 e0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) e0Var.a(null)).doubleValue();
        }
        String strD = this.f3980m.d(str, e0Var.f3894a);
        if (TextUtils.isEmpty(strD)) {
            return ((Double) e0Var.a(null)).doubleValue();
        }
        try {
            return ((Double) e0Var.a(Double.valueOf(Double.parseDouble(strD)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) e0Var.a(null)).doubleValue();
        }
    }

    public final boolean q(String str, e0 e0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) e0Var.a(null)).booleanValue();
        }
        String strD = this.f3980m.d(str, e0Var.f3894a);
        return TextUtils.isEmpty(strD) ? ((Boolean) e0Var.a(null)).booleanValue() : ((Boolean) e0Var.a(Boolean.valueOf("1".equals(strD)))).booleanValue();
    }

    public final Bundle r() {
        t1 t1Var = this.f3876a;
        try {
            Context context = t1Var.f4260a;
            Context context2 = t1Var.f4260a;
            w0 w0Var = t1Var.f4265o;
            if (context.getPackageManager() == null) {
                t1.m(w0Var);
                w0Var.f4340o.b("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoA = r0.c.a(context2).a(128, context2.getPackageName());
            if (applicationInfoA != null) {
                return applicationInfoA.metaData;
            }
            t1.m(w0Var);
            w0Var.f4340o.b("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            w0 w0Var2 = t1Var.f4265o;
            t1.m(w0Var2);
            w0Var2.f4340o.c(e10, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final Boolean s(String str) {
        k0.y.d(str);
        Bundle bundleR = r();
        if (bundleR != null) {
            if (bundleR.containsKey(str)) {
                return Boolean.valueOf(bundleR.getBoolean(str));
            }
            return null;
        }
        w0 w0Var = this.f3876a.f4265o;
        t1.m(w0Var);
        w0Var.f4340o.b("Failed to load metadata: Metadata bundle is null");
        return null;
    }

    public final boolean t() {
        this.f3876a.getClass();
        Boolean boolS = s("firebase_analytics_collection_deactivated");
        return boolS != null && boolS.booleanValue();
    }

    public final boolean u() {
        Boolean boolS = s("google_analytics_automatic_screen_reporting_enabled");
        return boolS == null || boolS.booleanValue();
    }

    public final g2 v(String str, boolean z9) {
        Object obj;
        k0.y.d(str);
        Bundle bundleR = r();
        t1 t1Var = this.f3876a;
        if (bundleR == null) {
            w0 w0Var = t1Var.f4265o;
            t1.m(w0Var);
            w0Var.f4340o.b("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleR.get(str);
        }
        g2 g2Var = g2.UNINITIALIZED;
        if (obj == null) {
            return g2Var;
        }
        if (Boolean.TRUE.equals(obj)) {
            return g2.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return g2.DENIED;
        }
        if (z9 && "eu_consent_policy".equals(obj)) {
            return g2.POLICY;
        }
        w0 w0Var2 = t1Var.f4265o;
        t1.m(w0Var2);
        w0Var2.f4343r.c(str, "Invalid manifest metadata for");
        return g2Var;
    }
}
