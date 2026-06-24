package y1;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f11680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n1.f f11681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f11682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j1.i f11683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11684e;
    public boolean f;
    public Boolean g;
    public final j1.i h;

    public t(n1.f fVar) {
        Boolean boolValueOf;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Object obj = new Object();
        this.f11682c = obj;
        this.f11683d = new j1.i();
        this.f11684e = false;
        this.f = false;
        this.h = new j1.i();
        fVar.a();
        Context context = fVar.f7909a;
        this.f11681b = fVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        this.f11680a = sharedPreferences;
        if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
            this.f = false;
            boolValueOf = Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            boolValueOf = null;
        }
        if (boolValueOf == null) {
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException e10) {
                Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", e10);
            }
            Boolean boolValueOf2 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            if (boolValueOf2 == null) {
                this.f = false;
                boolValueOf = null;
            } else {
                this.f = true;
                boolValueOf = Boolean.valueOf(Boolean.TRUE.equals(boolValueOf2));
            }
        }
        this.g = boolValueOf;
        synchronized (obj) {
            try {
                if (a()) {
                    this.f11683d.c(null);
                    this.f11684e = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized boolean a() {
        boolean zH;
        Boolean bool = this.g;
        if (bool != null) {
            zH = bool.booleanValue();
        } else {
            try {
                zH = this.f11681b.h();
            } catch (IllegalStateException unused) {
                zH = false;
            }
        }
        b(zH);
        return zH;
    }

    public final void b(boolean z9) {
        String str = "Crashlytics automatic data collection " + (z9 ? "ENABLED" : "DISABLED") + " by " + (this.g == null ? "global Firebase setting" : this.f ? "firebase_crashlytics_collection_enabled manifest flag" : "API") + ".";
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }
}
