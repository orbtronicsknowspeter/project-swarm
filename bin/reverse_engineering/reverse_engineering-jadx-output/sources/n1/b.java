package n1;

import a4.d0;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.core.content.ContextCompat;
import q2.i;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements s2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7901c;

    public /* synthetic */ b(Context context, String str) {
        this.f7899a = 1;
        this.f7900b = context;
        this.f7901c = str;
    }

    @Override // s2.b
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.f7899a) {
            case 0:
                f fVar = (f) this.f7901c;
                Context contextCreateDeviceProtectedStorageContext = (Context) this.f7900b;
                String strD = fVar.d();
                x2.a aVar = new x2.a();
                if (Build.VERSION.SDK_INT >= 24) {
                    contextCreateDeviceProtectedStorageContext = ContextCompat.createDeviceProtectedStorageContext(contextCreateDeviceProtectedStorageContext);
                }
                SharedPreferences sharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:".concat(strD), 0);
                boolean z9 = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z9 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = contextCreateDeviceProtectedStorageContext.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextCreateDeviceProtectedStorageContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z9 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                        break;
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                aVar.f11037a = z9;
                return aVar;
            case 1:
                return new i((Context) this.f7900b, (String) this.f7901c);
            default:
                s1.f fVar2 = (s1.f) this.f7901c;
                s1.a aVar2 = (s1.a) this.f7900b;
                return aVar2.f.c(new d0(aVar2, fVar2));
        }
    }

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.f7899a = i;
        this.f7901c = obj;
        this.f7900b = obj2;
    }
}
