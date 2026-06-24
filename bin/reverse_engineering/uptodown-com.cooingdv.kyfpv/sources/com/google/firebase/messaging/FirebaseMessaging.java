package com.google.firebase.messaging;

import a2.t;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import b2.t1;
import com.google.firebase.messaging.FirebaseMessaging;
import e1.x2;
import g0.h;
import g0.n;
import g4.v;
import g5.g;
import j1.p;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k0.y;
import n1.f;
import p2.c;
import q0.a;
import s1.e;
import s2.b;
import s4.s;
import t2.d;
import x4.h2;
import y2.a0;
import y2.j;
import y2.l;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseMessaging {
    public static g j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static b f3083k = new e(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f3084l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f3085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f3086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f3087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f3088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f3089e;
    public final ScheduledThreadPoolExecutor f;
    public final ThreadPoolExecutor g;
    public final s h;
    public boolean i;

    public FirebaseMessaging(f fVar, b bVar, b bVar2, d dVar, b bVar3, c cVar) {
        fVar.a();
        Context context = fVar.f7909a;
        final s sVar = new s(context);
        final v vVar = new v(fVar, sVar, bVar, bVar2, dVar);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new a("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new a("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a("Firebase-Messaging-File-Io"));
        this.i = false;
        f3083k = bVar3;
        this.f3085a = fVar;
        this.f3089e = new t(this, cVar);
        fVar.a();
        final Context context2 = fVar.f7909a;
        this.f3086b = context2;
        x2 x2Var = new x2();
        this.h = sVar;
        this.f3087c = vVar;
        this.f3088d = new j(executorServiceNewSingleThreadExecutor);
        this.f = scheduledThreadPoolExecutor;
        this.g = threadPoolExecutor;
        fVar.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(x2Var);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        final int i = 0;
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: y2.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f11742b;

            {
                this.f11742b = this;
            }

            private final void a() {
                FirebaseMessaging firebaseMessaging = this.f11742b;
                if (firebaseMessaging.f3089e.i() && firebaseMessaging.i(firebaseMessaging.d())) {
                    synchronized (firebaseMessaging) {
                        if (!firebaseMessaging.i) {
                            firebaseMessaging.h(0L);
                        }
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                j1.p pVarW;
                int i6;
                switch (i) {
                    case 0:
                        a();
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging = this.f11742b;
                        final Context context3 = firebaseMessaging.f3086b;
                        p.a(context3);
                        g4.v vVar2 = firebaseMessaging.f3087c;
                        final boolean zG = firebaseMessaging.g();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences sharedPreferencesE = a0.e(context3);
                            if (!sharedPreferencesE.contains("proxy_retention") || sharedPreferencesE.getBoolean("proxy_retention", false) != zG) {
                                g0.b bVar4 = (g0.b) vVar2.f5278m;
                                if (bVar4.f5071c.a() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", zG);
                                    g0.n nVarA = g0.n.a(bVar4.f5070b);
                                    synchronized (nVarA) {
                                        i6 = nVarA.f5102d;
                                        nVarA.f5102d = i6 + 1;
                                    }
                                    pVarW = nVarA.b(new g0.l(i6, 4, bundle, 0));
                                } else {
                                    pVarW = t1.w(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                pVarW.c(new androidx.arch.core.executor.a(2), new j1.f() { // from class: y2.q
                                    @Override // j1.f
                                    public final void c(Object obj) {
                                        SharedPreferences.Editor editorEdit = a0.e(context3).edit();
                                        editorEdit.putBoolean("proxy_retention", zG);
                                        editorEdit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging.g()) {
                            firebaseMessaging.e();
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new a("Firebase-Messaging-Topics-Io"));
        t1.q(scheduledThreadPoolExecutor2, new Callable() { // from class: y2.w
            @Override // java.util.concurrent.Callable
            public final Object call() {
                v vVar2;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                s4.s sVar2 = sVar;
                g4.v vVar3 = vVar;
                synchronized (v.class) {
                    try {
                        WeakReference weakReference = v.f11768d;
                        vVar2 = weakReference != null ? (v) weakReference.get() : null;
                        if (vVar2 == null) {
                            v vVar4 = new v(context3.getSharedPreferences("com.google.android.gms.appid", 0), scheduledThreadPoolExecutor3);
                            vVar4.b();
                            v.f11768d = new WeakReference(vVar4);
                            vVar2 = vVar4;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new x(firebaseMessaging, sVar2, vVar2, vVar3, context3, scheduledThreadPoolExecutor3);
            }
        }).c(scheduledThreadPoolExecutor, new l(this, 0));
        final int i6 = 1;
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: y2.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f11742b;

            {
                this.f11742b = this;
            }

            private final void a() {
                FirebaseMessaging firebaseMessaging = this.f11742b;
                if (firebaseMessaging.f3089e.i() && firebaseMessaging.i(firebaseMessaging.d())) {
                    synchronized (firebaseMessaging) {
                        if (!firebaseMessaging.i) {
                            firebaseMessaging.h(0L);
                        }
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                j1.p pVarW;
                int i62;
                switch (i6) {
                    case 0:
                        a();
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging = this.f11742b;
                        final Context context3 = firebaseMessaging.f3086b;
                        p.a(context3);
                        g4.v vVar2 = firebaseMessaging.f3087c;
                        final boolean zG = firebaseMessaging.g();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences sharedPreferencesE = a0.e(context3);
                            if (!sharedPreferencesE.contains("proxy_retention") || sharedPreferencesE.getBoolean("proxy_retention", false) != zG) {
                                g0.b bVar4 = (g0.b) vVar2.f5278m;
                                if (bVar4.f5071c.a() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", zG);
                                    g0.n nVarA = g0.n.a(bVar4.f5070b);
                                    synchronized (nVarA) {
                                        i62 = nVarA.f5102d;
                                        nVarA.f5102d = i62 + 1;
                                    }
                                    pVarW = nVarA.b(new g0.l(i62, 4, bundle, 0));
                                } else {
                                    pVarW = t1.w(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                pVarW.c(new androidx.arch.core.executor.a(2), new j1.f() { // from class: y2.q
                                    @Override // j1.f
                                    public final void c(Object obj) {
                                        SharedPreferences.Editor editorEdit = a0.e(context3).edit();
                                        editorEdit.putBoolean("proxy_retention", zG);
                                        editorEdit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging.g()) {
                            firebaseMessaging.e();
                            return;
                        }
                        return;
                }
            }
        });
    }

    public static void b(Runnable runnable, long j6) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f3084l == null) {
                    f3084l = new ScheduledThreadPoolExecutor(1, new a("TAG"));
                }
                f3084l.schedule(runnable, j6, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized g c(Context context) {
        try {
            if (j == null) {
                j = new g(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return j;
    }

    @NonNull
    @Keep
    public static synchronized FirebaseMessaging getInstance(@NonNull f fVar) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) fVar.b(FirebaseMessaging.class);
        y.h(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String a() {
        p pVarE;
        h2 h2VarD = d();
        if (!i(h2VarD)) {
            return h2VarD.f11212a;
        }
        String strD = s.d(this.f3085a);
        j jVar = this.f3088d;
        synchronized (jVar) {
            pVarE = (p) ((ArrayMap) jVar.f11740b).get(strD);
            if (pVarE == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + strD);
                }
                v vVar = this.f3087c;
                pVarE = vVar.d(vVar.k(s.d((f) vVar.f5276b), "*", new Bundle())).j(this.g, new androidx.transition.a(this, strD, h2VarD, 7)).e((Executor) jVar.f11739a, new a3.e(jVar, strD));
                ((ArrayMap) jVar.f11740b).put(strD, pVarE);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + strD);
            }
        }
        try {
            return (String) t1.j(pVarE);
        } catch (InterruptedException | ExecutionException e10) {
            throw new IOException(e10);
        }
    }

    public final h2 d() {
        h2 h2VarD;
        g gVarC = c(this.f3086b);
        f fVar = this.f3085a;
        fVar.a();
        String strD = "[DEFAULT]".equals(fVar.f7910b) ? "" : fVar.d();
        String strD2 = s.d(this.f3085a);
        synchronized (gVarC) {
            h2VarD = h2.d(((SharedPreferences) gVarC.f5316b).getString(strD + "|T|" + strD2 + "|*", null));
        }
        return h2VarD;
    }

    public final void e() {
        p pVarW;
        int i;
        g0.b bVar = (g0.b) this.f3087c.f5278m;
        if (bVar.f5071c.a() >= 241100000) {
            n nVarA = n.a(bVar.f5070b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (nVarA) {
                i = nVarA.f5102d;
                nVarA.f5102d = i + 1;
            }
            pVarW = nVarA.b(new g0.l(i, 5, bundle, 1)).d(h.f5082l, g0.d.f5076l);
        } else {
            pVarW = t1.w(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        pVarW.c(this.f, new l(this, 1));
    }

    public final synchronized void f(boolean z9) {
        this.i = z9;
    }

    public final boolean g() {
        Context context = this.f3086b;
        y2.p.a(context);
        if (!y2.p.b(context)) {
            return false;
        }
        if (this.f3085a.b(p1.a.class) != null) {
            return true;
        }
        return a0.d() && f3083k != null;
    }

    public final synchronized void h(long j6) {
        b(new y2.t(this, Math.min(Math.max(30L, 2 * j6), 28800L)), j6);
        this.i = true;
    }

    public final boolean i(h2 h2Var) {
        if (h2Var != null) {
            return System.currentTimeMillis() > h2Var.f11214c + 604800000 || !this.h.b().equals((String) h2Var.f11213b);
        }
        return true;
    }
}
