package t1;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements g, z.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9508b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f9509l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f9510m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f9511n;

    public /* synthetic */ b(x.g gVar, Iterable iterable, r.j jVar, long j) {
        this.f9507a = 2;
        this.f9508b = gVar;
        this.f9511n = iterable;
        this.f9510m = jVar;
        this.f9509l = j;
    }

    @Override // t1.g
    public ScheduledFuture a(g5.g gVar) {
        switch (this.f9507a) {
            case 0:
                f fVar = (f) this.f9508b;
                Runnable runnable = (Runnable) this.f9511n;
                return fVar.f9526b.schedule(new e(fVar, runnable, gVar, 1), this.f9509l, (TimeUnit) this.f9510m);
            default:
                f fVar2 = (f) this.f9508b;
                Callable callable = (Callable) this.f9511n;
                return fVar2.f9526b.schedule(new androidx.work.impl.b(fVar2, callable, gVar, 1), this.f9509l, (TimeUnit) this.f9510m);
        }
    }

    @Override // z.b
    public Object execute() {
        x.g gVar = (x.g) this.f9508b;
        Iterable iterable = (Iterable) this.f9511n;
        r.j jVar = (r.j) this.f9510m;
        y.h hVar = (y.h) gVar.f11031c;
        hVar.getClass();
        if (iterable.iterator().hasNext()) {
            String strConcat = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(y.h.i(iterable));
            SQLiteDatabase sQLiteDatabaseB = hVar.b();
            sQLiteDatabaseB.beginTransaction();
            try {
                sQLiteDatabaseB.compileStatement(strConcat).execute();
                Cursor cursorRawQuery = sQLiteDatabaseB.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        hVar.f(cursorRawQuery.getInt(0), u.c.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabaseB.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseB.setTransactionSuccessful();
            } finally {
                sQLiteDatabaseB.endTransaction();
            }
        }
        hVar.d(new y.e(gVar.g.f() + this.f9509l, jVar));
        return null;
    }

    public /* synthetic */ b(f fVar, Object obj, long j, TimeUnit timeUnit, int i) {
        this.f9507a = i;
        this.f9508b = fVar;
        this.f9511n = obj;
        this.f9509l = j;
        this.f9510m = timeUnit;
    }
}
