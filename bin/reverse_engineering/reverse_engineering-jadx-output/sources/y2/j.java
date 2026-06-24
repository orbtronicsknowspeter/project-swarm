package y2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import b2.t1;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f11736c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static d0 f11737d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11739b;

    public j(g5.f fVar) {
        this.f11738a = fVar.L("gcm.n.title");
        fVar.I("gcm.n.title");
        Object[] objArrH = fVar.H("gcm.n.title");
        if (objArrH != null) {
            String[] strArr = new String[objArrH.length];
            for (int i = 0; i < objArrH.length; i++) {
                strArr[i] = String.valueOf(objArrH[i]);
            }
        }
        this.f11739b = fVar.L("gcm.n.body");
        fVar.I("gcm.n.body");
        Object[] objArrH2 = fVar.H("gcm.n.body");
        if (objArrH2 != null) {
            String[] strArr2 = new String[objArrH2.length];
            for (int i6 = 0; i6 < objArrH2.length; i6++) {
                strArr2[i6] = String.valueOf(objArrH2[i6]);
            }
        }
        fVar.L("gcm.n.icon");
        if (TextUtils.isEmpty(fVar.L("gcm.n.sound2"))) {
            fVar.L("gcm.n.sound");
        }
        fVar.L("gcm.n.tag");
        fVar.L("gcm.n.color");
        fVar.L("gcm.n.click_action");
        fVar.L("gcm.n.android_channel_id");
        String strL = fVar.L("gcm.n.link_android");
        strL = TextUtils.isEmpty(strL) ? fVar.L("gcm.n.link") : strL;
        if (!TextUtils.isEmpty(strL)) {
            Uri.parse(strL);
        }
        fVar.L("gcm.n.image");
        fVar.L("gcm.n.ticker");
        fVar.E("gcm.n.notification_priority");
        fVar.E("gcm.n.visibility");
        fVar.E("gcm.n.notification_count");
        fVar.D("gcm.n.sticky");
        fVar.D("gcm.n.local_only");
        fVar.D("gcm.n.default_sound");
        fVar.D("gcm.n.default_vibrate_timings");
        fVar.D("gcm.n.default_light_settings");
        fVar.J();
        fVar.G();
        fVar.M();
    }

    public static j1.p a(Context context, Intent intent, boolean z9) {
        d0 d0Var;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f11736c) {
            try {
                if (f11737d == null) {
                    f11737d = new d0(context);
                }
                d0Var = f11737d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z9) {
            return d0Var.b(intent).d(new androidx.arch.core.executor.a(2), new s1.o(27));
        }
        if (s.t().v(context)) {
            a0.h(context, d0Var, intent);
        } else {
            d0Var.b(intent);
        }
        return t1.x(-1);
    }

    public j1.p b(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = (Context) this.f11738a;
        androidx.arch.core.executor.a aVar = (androidx.arch.core.executor.a) this.f11739b;
        boolean z9 = p0.b.a() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z10 = (intent.getFlags() & 268435456) != 0;
        return (!z9 || z10) ? t1.q(aVar, new Callable() { // from class: y2.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                ServiceInfo serviceInfo;
                String str2;
                int i;
                ComponentName componentNameStartService;
                Context context2 = context;
                Intent intent2 = intent;
                s sVarT = s.t();
                sVarT.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) sVarT.f11758n).offer(intent2);
                Intent intent3 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent3.setPackage(context2.getPackageName());
                synchronized (sVarT) {
                    try {
                        str = (String) sVarT.f11755b;
                        if (str == null) {
                            ResolveInfo resolveInfoResolveService = context2.getPackageManager().resolveService(intent3, 0);
                            if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                                Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                            } else {
                                if (context2.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                                    if (str2.startsWith(".")) {
                                        sVarT.f11755b = context2.getPackageName() + serviceInfo.name;
                                    } else {
                                        sVarT.f11755b = serviceInfo.name;
                                    }
                                    str = (String) sVarT.f11755b;
                                }
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                            }
                            str = null;
                        }
                    } finally {
                    }
                }
                if (str != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str));
                    }
                    intent3.setClassName(context2.getPackageName(), str);
                }
                try {
                    if (sVarT.v(context2)) {
                        componentNameStartService = a0.j(context2, intent3);
                    } else {
                        componentNameStartService = context2.startService(intent3);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (componentNameStartService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i = 404;
                    } else {
                        i = -1;
                    }
                } catch (IllegalStateException e10) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e10);
                    i = TypedValues.CycleType.TYPE_VISIBILITY;
                } catch (SecurityException e11) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e11);
                    i = TypedValues.CycleType.TYPE_CURVE_FIT;
                }
                return Integer.valueOf(i);
            }
        }).e(aVar, new j1.a() { // from class: y2.i
            @Override // j1.a
            public final Object g(j1.p pVar) {
                return (p0.b.a() && ((Integer) pVar.g()).intValue() == 402) ? j.a(context, intent, z10).d(new androidx.arch.core.executor.a(2), new s1.o(26)) : pVar;
            }
        }) : a(context, intent, z10);
    }

    public j(Context context) {
        this.f11738a = context;
        this.f11739b = new androidx.arch.core.executor.a(2);
    }

    public j(ExecutorService executorService) {
        this.f11739b = new ArrayMap();
        this.f11738a = executorService;
    }
}
