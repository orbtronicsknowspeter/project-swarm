package y1;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.work.WorkRequest;
import b2.t1;
import j$.util.Objects;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class x {
    public static final Pattern g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2.a f11690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f11691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t2.d f11693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f11694e;
    public c f;

    public x(Context context, String str, t2.d dVar, t tVar) {
        if (context == null) {
            com.google.gson.internal.a.p("appContext must not be null");
            throw null;
        }
        if (str == null) {
            com.google.gson.internal.a.p("appIdentifier must not be null");
            throw null;
        }
        this.f11691b = context;
        this.f11692c = str;
        this.f11693d = dVar;
        this.f11694e = tVar;
        this.f11690a = new g2.a();
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final w b(boolean z9) {
        String str;
        String str2 = null;
        if (!((Boolean) new z1.c(0, z1.e.f11908d, z1.d.class, "isNotMainThread", "isNotMainThread()Z", 0, 2).invoke()).booleanValue()) {
            String str3 = "Must not be called on a main thread, was called on " + Thread.currentThread().getName() + '.';
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str3, null);
            }
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        t2.d dVar = this.f11693d;
        if (z9) {
            try {
                str = ((t2.a) t1.k(((t2.c) dVar).e(), WorkRequest.MIN_BACKOFF_MILLIS, timeUnit)).f9537a;
            } catch (Exception e10) {
                Log.w("FirebaseCrashlytics", "Error getting Firebase authentication token.", e10);
                str = null;
            }
        } else {
            str = null;
        }
        try {
            str2 = (String) t1.k(((t2.c) dVar).d(), WorkRequest.MIN_BACKOFF_MILLIS, timeUnit);
        } catch (Exception e11) {
            Log.w("FirebaseCrashlytics", "Error getting Firebase installation id.", e11);
        }
        return new w(str2, str);
    }

    public final synchronized c c() {
        String str;
        c cVar = this.f;
        if (cVar != null && (cVar.f11609b != null || !this.f11694e.a())) {
            return this.f;
        }
        v1.c cVar2 = v1.c.f10792a;
        cVar2.c("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f11691b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        cVar2.c("Cached Firebase Installation ID: " + string);
        if (this.f11694e.a()) {
            w wVarB = b(false);
            cVar2.c("Fetched Firebase Installation ID: " + wVarB.f11688a);
            if (wVarB.f11688a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                wVarB = new w(str, null);
            }
            if (Objects.equals(wVarB.f11688a, string)) {
                this.f = new c(sharedPreferences.getString("crashlytics.installation.id", null), wVarB.f11688a, wVarB.f11689b);
            } else {
                this.f = new c(a(sharedPreferences, wVarB.f11688a), wVarB.f11688a, wVarB.f11689b);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f = new c(a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
        } else {
            this.f = new c(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        }
        cVar2.c("Install IDs: " + this.f);
        return this.f;
    }

    public final String d() {
        String str;
        g2.a aVar = this.f11690a;
        Context context = this.f11691b;
        synchronized (aVar) {
            try {
                if (aVar.f5108a == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    aVar.f5108a = installerPackageName;
                }
                str = "".equals(aVar.f5108a) ? null : aVar.f5108a;
            } finally {
            }
        }
        return str;
    }
}
