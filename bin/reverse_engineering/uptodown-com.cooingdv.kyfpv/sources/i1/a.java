package i1;

import a4.f;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.location.LocationRequestCompat;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import k0.y;
import p0.d;
import p0.e;
import r0.c;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static volatile ScheduledExecutorService f5624n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Object f5625o = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f5627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ScheduledFuture f5629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f5630e;
    public final HashSet f;
    public boolean g;
    public a1.a h;
    public final p0.a i;
    public final String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap f5631k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicInteger f5632l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ScheduledExecutorService f5633m;

    public a(Context context) {
        String packageName = context.getPackageName();
        this.f5626a = new Object();
        this.f5628c = 0;
        this.f = new HashSet();
        this.g = true;
        this.i = p0.a.f8404a;
        this.f5631k = new HashMap();
        this.f5632l = new AtomicInteger(0);
        y.e("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.h = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.j = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new a1.b(sb.toString());
        }
        this.f5627b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        if (e.a(context)) {
            int i = d.f8413a;
            packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfoA = c.a(context).a(0, packageName);
                    if (applicationInfoA == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i6 = applicationInfoA.uid;
                        workSource = new WorkSource();
                        Method method = e.f8415b;
                        if (method != null) {
                            try {
                                method.invoke(workSource, Integer.valueOf(i6), packageName);
                            } catch (Exception e10) {
                                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                            }
                        } else {
                            Method method2 = e.f8414a;
                            if (method2 != null) {
                                try {
                                    method2.invoke(workSource, Integer.valueOf(i6));
                                } catch (Exception e11) {
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e11);
                                }
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                }
            }
            if (workSource != null) {
                try {
                    this.f5627b.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e12) {
                    Log.wtf("WakeLock", e12.toString());
                }
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f5624n;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f5625o) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = f5624n;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f5624n = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.f5633m = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    public final void a() {
        this.f5632l.incrementAndGet();
        long j = LocationRequestCompat.PASSIVE_INTERVAL;
        long jMin = Math.min(60000L, Math.max(Math.min(LocationRequestCompat.PASSIVE_INTERVAL, 31622400000L), 1L));
        synchronized (this.f5626a) {
            try {
                if (!b()) {
                    this.h = a1.a.f1a;
                    this.f5627b.acquire();
                    this.i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f5628c++;
                if (this.g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f5631k.get(null);
                if (bVar == null) {
                    bVar = new b();
                    this.f5631k.put(null, bVar);
                }
                bVar.f5634a++;
                this.i.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (LocationRequestCompat.PASSIVE_INTERVAL - jElapsedRealtime > jMin) {
                    j = jElapsedRealtime + jMin;
                }
                if (j > this.f5630e) {
                    this.f5630e = j;
                    ScheduledFuture scheduledFuture = this.f5629d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f5629d = this.f5633m.schedule(new f(this, 14), jMin, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        boolean z9;
        synchronized (this.f5626a) {
            z9 = this.f5628c > 0;
        }
        return z9;
    }

    public final void c() {
        if (this.f5632l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f5626a) {
            try {
                if (this.g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f5631k.containsKey(null)) {
                    b bVar = (b) this.f5631k.get(null);
                    if (bVar != null) {
                        int i = bVar.f5634a - 1;
                        bVar.f5634a = i;
                        if (i == 0) {
                            this.f5631k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        com.google.gson.internal.a.o();
    }

    public final void e() {
        synchronized (this.f5626a) {
            try {
                if (b()) {
                    if (this.g) {
                        int i = this.f5628c - 1;
                        this.f5628c = i;
                        if (i > 0) {
                            return;
                        }
                    } else {
                        this.f5628c = 0;
                    }
                    d();
                    Iterator it = this.f5631k.values().iterator();
                    while (it.hasNext()) {
                        ((b) it.next()).f5634a = 0;
                    }
                    this.f5631k.clear();
                    ScheduledFuture scheduledFuture = this.f5629d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.f5629d = null;
                        this.f5630e = 0L;
                    }
                    if (this.f5627b.isHeld()) {
                        try {
                            try {
                                this.f5627b.release();
                                if (this.h != null) {
                                    this.h = null;
                                }
                            } catch (RuntimeException e10) {
                                if (!e10.getClass().equals(RuntimeException.class)) {
                                    throw e10;
                                }
                                Log.e("WakeLock", String.valueOf(this.j).concat(" failed to release!"), e10);
                                if (this.h != null) {
                                    this.h = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.h != null) {
                                this.h = null;
                            }
                            throw th;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.j).concat(" should be held!"));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
