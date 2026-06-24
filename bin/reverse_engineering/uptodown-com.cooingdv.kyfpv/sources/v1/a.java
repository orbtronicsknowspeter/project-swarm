package v1;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import b2.k1;
import k0.k;
import r.j;
import x.g;
import y.e;
import y.f;
import y.h;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements s2.a, z.b, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f10786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10787b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f10788l;

    public /* synthetic */ a(long j, Object obj, Object obj2) {
        this.f10787b = obj;
        this.f10788l = obj2;
        this.f10786a = j;
    }

    @Override // y.f
    public Object apply(Object obj) {
        String str = (String) this.f10787b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((u.c) this.f10788l).f10384a;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
        try {
            boolean z9 = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j = this.f10786a;
            if (z9) {
                sQLiteDatabase.execSQL(k.g(j, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    @Override // s2.a
    public void b(s2.b bVar) {
        ((b) bVar.get()).d((String) this.f10787b, this.f10786a, (k1) this.f10788l);
    }

    @Override // z.b
    public Object execute() {
        g gVar = (g) this.f10787b;
        j jVar = (j) this.f10788l;
        y.d dVar = gVar.f11031c;
        long jF = gVar.g.f() + this.f10786a;
        h hVar = (h) dVar;
        hVar.getClass();
        hVar.d(new e(jF, jVar));
        return null;
    }

    public /* synthetic */ a(String str, long j, k1 k1Var) {
        this.f10787b = str;
        this.f10786a = j;
        this.f10788l = k1Var;
    }
}
