package y1;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f11660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m8.q f11661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m8.q f11663e;
    public m8.q f;
    public l g;
    public final x h;
    public final e2.d i;
    public final u1.a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u1.a f11664k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f11665l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final v1.b f11666m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g5.f f11667n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final z1.e f11668o;

    public q(n1.f fVar, x xVar, v1.b bVar, t tVar, u1.a aVar, u1.a aVar2, e2.d dVar, i iVar, g5.f fVar2, z1.e eVar) {
        this.f11660b = tVar;
        fVar.a();
        this.f11659a = fVar.f7908a;
        this.h = xVar;
        this.f11666m = bVar;
        this.j = aVar;
        this.f11664k = aVar2;
        this.i = dVar;
        this.f11665l = iVar;
        this.f11667n = fVar2;
        this.f11668o = eVar;
        this.f11662d = System.currentTimeMillis();
        this.f11661c = new m8.q(25);
    }

    public final void a(g2.e eVar) {
        z1.e.a();
        z1.e.a();
        this.f11663e.d();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                this.j.a(new o(this));
                this.g.g();
                if (!eVar.b().f5113b.f5108a) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                    }
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.g.d(eVar)) {
                    Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                }
                this.g.h(((j1.i) ((AtomicReference) eVar.f5126s).get()).f6539a);
                c();
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e10);
                c();
            }
        } catch (Throwable th) {
            c();
            throw th;
        }
    }

    public final void b(g2.e eVar) {
        Future<?> futureSubmit = this.f11668o.f11908a.f11903a.submit(new m(this, eVar, 1));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e10);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e11) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e11);
        } catch (TimeoutException e12) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e12);
        }
    }

    public final void c() {
        z1.e.a();
        try {
            m8.q qVar = this.f11663e;
            e2.d dVar = (e2.d) qVar.f7781l;
            String str = (String) qVar.f7780b;
            dVar.getClass();
            if (new File((File) dVar.f4468m, str).delete()) {
                return;
            }
            Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
        } catch (Exception e10) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e10);
        }
    }
}
