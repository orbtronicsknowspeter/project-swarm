package v4;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import b2.t1;
import com.uptodown.UptodownApp;
import j1.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledFuture;
import r.p;
import s1.o;
import t4.n0;
import x.g;
import y.c;
import y.h;
import y1.j;
import y2.a0;
import y2.c0;
import y2.s;
import z.b;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements d, b, j1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10852b;

    public /* synthetic */ a(Object obj, int i) {
        this.f10851a = i;
        this.f10852b = obj;
    }

    @Override // z.b
    public Object execute() {
        SQLiteDatabase sQLiteDatabaseB;
        int i = this.f10851a;
        Object obj = this.f10852b;
        switch (i) {
            case 1:
                h hVar = (h) ((c) obj);
                hVar.getClass();
                int i6 = u.a.f10370e;
                s sVar = new s(18);
                sVar.f11757l = null;
                sVar.f11758m = new ArrayList();
                sVar.f11759n = null;
                sVar.f11756b = "";
                HashMap map = new HashMap();
                sQLiteDatabaseB = hVar.b();
                sQLiteDatabaseB.beginTransaction();
                try {
                    u.a aVar = (u.a) h.j(sQLiteDatabaseB.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new androidx.transition.a(hVar, map, sVar, 6));
                    sQLiteDatabaseB.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            case 2:
                h hVar2 = (h) ((y.d) obj);
                long jF = hVar2.f11589b.f() - hVar2.f11591m.f11578d;
                sQLiteDatabaseB = hVar2.b();
                sQLiteDatabaseB.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(jF)};
                    Cursor cursorRawQuery = sQLiteDatabaseB.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            hVar2.f(cursorRawQuery.getInt(0), u.c.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                        } catch (Throwable th) {
                            cursorRawQuery.close();
                            throw th;
                        }
                    }
                    cursorRawQuery.close();
                    int iDelete = sQLiteDatabaseB.delete("events", "timestamp_ms < ?", strArr);
                    sQLiteDatabaseB.setTransactionSuccessful();
                    sQLiteDatabaseB.endTransaction();
                    return Integer.valueOf(iDelete);
                } finally {
                }
            case 3:
                h hVar3 = (h) ((g) obj).i;
                sQLiteDatabaseB = hVar3.b();
                sQLiteDatabaseB.beginTransaction();
                try {
                    sQLiteDatabaseB.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseB.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + hVar3.f11589b.f()).execute();
                    sQLiteDatabaseB.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                s sVar2 = (s) obj;
                sQLiteDatabaseB = ((h) ((y.d) sVar2.f11757l)).b();
                sQLiteDatabaseB.beginTransaction();
                try {
                    List list = (List) h.j(sQLiteDatabaseB.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new o(23));
                    sQLiteDatabaseB.setTransactionSuccessful();
                    sQLiteDatabaseB.endTransaction();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((n0) sVar2.f11758m).e((p) it.next(), 1, false);
                    }
                    return null;
                } finally {
                }
        }
    }

    @Override // j1.a
    public Object g(j1.p pVar) {
        switch (this.f10851a) {
            case 5:
                ((CountDownLatch) this.f10852b).countDown();
                return null;
            case 9:
                return (j1.p) ((j) this.f10852b).call();
            default:
                ((Runnable) this.f10852b).run();
                return t1.x(null);
        }
    }

    @Override // j1.d
    public void s(j1.p pVar) {
        switch (this.f10851a) {
            case 0:
                UptodownApp uptodownApp = (UptodownApp) this.f10852b;
                pVar.getClass();
                if (pVar.i()) {
                    String str = (String) pVar.g();
                    SharedPreferences sharedPreferences = uptodownApp.getSharedPreferences("SettingsPreferences", 0);
                    sharedPreferences.getClass();
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putString("fcmToken", str);
                    editorEdit.apply();
                    break;
                }
                break;
            case 6:
                a0.c((Intent) this.f10852b);
                break;
            case 7:
                ((c0) this.f10852b).f11717b.c(null);
                break;
            default:
                ((ScheduledFuture) this.f10852b).cancel(false);
                break;
        }
    }
}
