package y1;

import android.util.Log;
import b2.t1;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f11627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f11628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Thread f11629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g2.e f11630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f11631e;

    public j(l lVar, long j, Throwable th, Thread thread, g2.e eVar) {
        this.f11631e = lVar;
        this.f11627a = j;
        this.f11628b = th;
        this.f11629c = thread;
        this.f11630d = eVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        long j = this.f11627a;
        long j6 = j / 1000;
        l lVar = this.f11631e;
        String strE = lVar.e();
        if (strE == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return t1.x(null);
        }
        lVar.f11638c.d();
        e2.d dVar = lVar.f11643m;
        dVar.getClass();
        String strConcat = "Persisting fatal event for session ".concat(strE);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strConcat, null);
        }
        dVar.k(this.f11628b, this.f11629c, "crash", new a2.c(strE, j6, q6.u.f8725a), true);
        try {
            e2.d dVar2 = lVar.g;
            String str = ".ae" + j;
            dVar2.getClass();
            if (!new File((File) dVar2.f4468m, str).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e10);
        }
        g2.e eVar = this.f11630d;
        lVar.b(false, eVar, false);
        lVar.c(new e().f11615a, Boolean.FALSE);
        return !lVar.f11637b.a() ? t1.x(null) : ((j1.i) ((AtomicReference) eVar.f5126s).get()).f6539a.j(lVar.f11640e.f11908a, new g5.f(this, strE));
    }
}
