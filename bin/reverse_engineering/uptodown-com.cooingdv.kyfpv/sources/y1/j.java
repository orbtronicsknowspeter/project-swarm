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
    public final /* synthetic */ long f11628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f11629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Thread f11630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g2.e f11631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f11632e;

    public j(l lVar, long j, Throwable th, Thread thread, g2.e eVar) {
        this.f11632e = lVar;
        this.f11628a = j;
        this.f11629b = th;
        this.f11630c = thread;
        this.f11631d = eVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        long j = this.f11628a;
        long j6 = j / 1000;
        l lVar = this.f11632e;
        String strE = lVar.e();
        if (strE == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return t1.x(null);
        }
        lVar.f11639c.d();
        e2.d dVar = lVar.f11644m;
        dVar.getClass();
        String strConcat = "Persisting fatal event for session ".concat(strE);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strConcat, null);
        }
        dVar.k(this.f11629b, this.f11630c, "crash", new a2.c(strE, j6, q6.u.f8726a), true);
        try {
            e2.d dVar2 = lVar.g;
            String str = ".ae" + j;
            dVar2.getClass();
            if (!new File((File) dVar2.f4469m, str).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e10);
        }
        g2.e eVar = this.f11631d;
        lVar.b(false, eVar, false);
        lVar.c(new e().f11616a, Boolean.FALSE);
        return !lVar.f11638b.a() ? t1.x(null) : ((j1.i) ((AtomicReference) eVar.f5127s).get()).f6540a.j(lVar.f11641e.f11909a, new g5.f(this, strE));
    }
}
