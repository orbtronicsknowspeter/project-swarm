package j0;

import a4.c0;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import androidx.collection.ArraySet;
import androidx.core.app.PendingIntentCompat;
import androidx.work.WorkRequest;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import k0.k0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements Handler.Callback {
    public static e A;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Status f6488x = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Status f6489y = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Object f6490z = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f6491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6492b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public k0.n f6493l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public m0.b f6494m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Context f6495n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final h0.e f6496o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final android.support.v4.media.g f6497p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AtomicInteger f6498q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AtomicInteger f6499r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ConcurrentHashMap f6500s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArraySet f6501t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArraySet f6502u;
    public final c0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile boolean f6503w;

    public e(Context context, Looper looper) {
        h0.e eVar = h0.e.f5408d;
        this.f6491a = WorkRequest.MIN_BACKOFF_MILLIS;
        this.f6492b = false;
        this.f6498q = new AtomicInteger(1);
        this.f6499r = new AtomicInteger(0);
        this.f6500s = new ConcurrentHashMap(5, 0.75f, 1);
        this.f6501t = new ArraySet();
        this.f6502u = new ArraySet();
        this.f6503w = true;
        this.f6495n = context;
        c0 c0Var = new c0(looper, this, 4);
        Looper.getMainLooper();
        this.v = c0Var;
        this.f6496o = eVar;
        this.f6497p = new android.support.v4.media.g(25);
        PackageManager packageManager = context.getPackageManager();
        if (p0.b.f == null) {
            p0.b.f = Boolean.valueOf(p0.b.a() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (p0.b.f.booleanValue()) {
            this.f6503w = false;
        }
        c0Var.sendMessage(c0Var.obtainMessage(6));
    }

    public static Status b(a aVar, h0.b bVar) {
        return new Status(17, "API: " + ((String) aVar.f6480b.f248l) + " is not available on this device. Connection failed with: " + String.valueOf(bVar), bVar.f5397l, bVar);
    }

    public static e d(Context context) {
        e eVar;
        synchronized (f6490z) {
            try {
                if (A == null) {
                    Looper looper = k0.b().getLooper();
                    Context applicationContext = context.getApplicationContext();
                    Object obj = h0.e.f5407c;
                    A = new e(applicationContext, looper);
                }
                eVar = A;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public final boolean a(h0.b bVar, int i) {
        h0.e eVar = this.f6496o;
        eVar.getClass();
        Context context = this.f6495n;
        if (!r0.a.a(context)) {
            int i6 = bVar.f5396b;
            PendingIntent activity = bVar.f5397l;
            if (!((i6 == 0 || activity == null) ? false : true)) {
                activity = null;
                Intent intentA = eVar.a(context, i6, null);
                if (intentA != null) {
                    activity = PendingIntentCompat.getActivity(context, 0, intentA, 134217728, false);
                }
            }
            if (activity != null) {
                int i10 = GoogleApiActivity.f2465b;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                eVar.f(context, i6, PendingIntent.getActivity(context, 0, intent, x0.d.f11037a | 134217728));
                return true;
            }
        }
        return false;
    }

    public final m c(i0.d dVar) {
        a aVar = dVar.f5619e;
        ConcurrentHashMap concurrentHashMap = this.f6500s;
        m mVar = (m) concurrentHashMap.get(aVar);
        if (mVar == null) {
            mVar = new m(this, dVar);
            concurrentHashMap.put(aVar, mVar);
        }
        if (mVar.j.l()) {
            this.f6502u.add(aVar);
        }
        mVar.m();
        return mVar;
    }

    public final void e(h0.b bVar, int i) {
        if (a(bVar, i)) {
            return;
        }
        c0 c0Var = this.v;
        c0Var.sendMessage(c0Var.obtainMessage(5, i, 0, bVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x0306  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r17) {
        /*
            Method dump skipped, instruction units count: 1086
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.e.handleMessage(android.os.Message):boolean");
    }
}
