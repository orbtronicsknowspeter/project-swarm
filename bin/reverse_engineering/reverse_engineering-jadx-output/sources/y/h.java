package y;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import r.p;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class h implements d, z.c, c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final o.c f11586o = new o.c("proto");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f11587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q2.e f11588b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final q2.e f11589l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a f11590m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m6.a f11591n;

    public h(q2.e eVar, q2.e eVar2, a aVar, j jVar, m6.a aVar2) {
        this.f11587a = jVar;
        this.f11588b = eVar;
        this.f11589l = eVar2;
        this.f11590m = aVar;
        this.f11591n = aVar2;
    }

    public static Long c(SQLiteDatabase sQLiteDatabase, p pVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        r.j jVar = (r.j) pVar;
        ArrayList arrayList = new ArrayList(Arrays.asList(jVar.f8831a, String.valueOf(b0.a.a(jVar.f8833c))));
        byte[] bArr = jVar.f8832b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public static String i(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((b) it.next()).f11579a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object j(Cursor cursor, f fVar) {
        try {
            return fVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase b() {
        j jVar = this.f11587a;
        Objects.requireNonNull(jVar);
        q2.e eVar = this.f11589l;
        long jF = eVar.f();
        while (true) {
            try {
                return jVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e10) {
                if (eVar.f() >= ((long) this.f11590m.f11576c) + jF) {
                    throw new z.a("Timed out while trying to open db.", e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f11587a.close();
    }

    public final Object d(f fVar) {
        SQLiteDatabase sQLiteDatabaseB = b();
        sQLiteDatabaseB.beginTransaction();
        try {
            Object objApply = fVar.apply(sQLiteDatabaseB);
            sQLiteDatabaseB.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseB.endTransaction();
        }
    }

    public final ArrayList e(SQLiteDatabase sQLiteDatabase, r.j jVar, int i) {
        ArrayList arrayList = new ArrayList();
        Long lC = c(sQLiteDatabase, jVar);
        if (lC == null) {
            return arrayList;
        }
        j(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lC.toString()}, null, null, null, String.valueOf(i)), new androidx.transition.a(this, arrayList, jVar, 5));
        return arrayList;
    }

    public final void f(long j, u.c cVar, String str) {
        d(new v1.a(j, str, cVar));
    }

    public final Object h(z.b bVar) {
        SQLiteDatabase sQLiteDatabaseB = b();
        q2.e eVar = this.f11589l;
        long jF = eVar.f();
        while (true) {
            try {
                sQLiteDatabaseB.beginTransaction();
                try {
                    Object objExecute = bVar.execute();
                    sQLiteDatabaseB.setTransactionSuccessful();
                    return objExecute;
                } finally {
                    sQLiteDatabaseB.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e10) {
                if (eVar.f() >= ((long) this.f11590m.f11576c) + jF) {
                    throw new z.a("Timed out while trying to acquire the lock.", e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
