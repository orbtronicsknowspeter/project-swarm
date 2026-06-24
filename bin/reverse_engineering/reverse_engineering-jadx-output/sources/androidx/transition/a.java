package androidx.transition;

import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.os.CancellationSignal;
import androidx.work.ListenableFutureKt;
import b2.t1;
import com.google.firebase.messaging.FirebaseMessaging;
import d7.p;
import j$.util.DesugarCollections;
import j1.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import o7.b0;
import r.i;
import r.j;
import r.m;
import u.d;
import u.e;
import u.g;
import x4.h2;
import y.f;
import y2.s;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements CancellationSignal.OnCancelListener, CallbackToFutureAdapter.Resolver, z.b, f, h, j1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f518b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f519l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f520m;

    public /* synthetic */ a(Runnable runnable, Transition transition, Runnable runnable2) {
        this.f517a = 0;
        this.f518b = runnable;
        this.f520m = transition;
        this.f519l = runnable2;
    }

    @Override // y.f
    public Object apply(Object obj) throws Throwable {
        long jInsert;
        Cursor cursor;
        u.c cVar;
        u.c cVar2;
        int i = this.f517a;
        int i6 = 5;
        int i10 = 4;
        int i11 = 3;
        u.c cVar3 = u.c.CACHE_FULL;
        int i12 = 2;
        int i13 = 1;
        Object obj2 = this.f520m;
        Object obj3 = this.f519l;
        Object obj4 = this.f518b;
        int i14 = 0;
        switch (i) {
            case 4:
                y.h hVar = (y.h) obj4;
                i iVar = (i) obj3;
                m mVar = iVar.f8828c;
                String str = iVar.f8826a;
                j jVar = (j) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long jSimpleQueryForLong = hVar.b().compileStatement("PRAGMA page_size").simpleQueryForLong() * hVar.b().compileStatement("PRAGMA page_count").simpleQueryForLong();
                y.a aVar = hVar.f11590m;
                if (jSimpleQueryForLong >= aVar.f11574a) {
                    hVar.f(1L, cVar3, str);
                    return -1L;
                }
                Long lC = y.h.c(sQLiteDatabase, jVar);
                if (lC != null) {
                    jInsert = lC.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", jVar.f8831a);
                    contentValues.put("priority", Integer.valueOf(b0.a.a(jVar.f8833c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = jVar.f8832b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i15 = aVar.f11578e;
                byte[] bArr2 = mVar.f8842b;
                boolean z9 = bArr2.length <= i15;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(iVar.f8829d));
                contentValues2.put("uptime_ms", Long.valueOf(iVar.f8830e));
                contentValues2.put("payload_encoding", mVar.f8841a.f8125a);
                contentValues2.put("code", iVar.f8827b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z9));
                contentValues2.put("payload", z9 ? bArr2 : new byte[0]);
                contentValues2.put("product_id", iVar.g);
                contentValues2.put("pseudonymous_id", iVar.h);
                contentValues2.put("experiment_ids_clear_blob", iVar.i);
                contentValues2.put("experiment_ids_encrypted_blob", iVar.j);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z9) {
                    int iCeil = (int) Math.ceil(((double) bArr2.length) / ((double) i15));
                    for (int i16 = 1; i16 <= iCeil; i16++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i16 - 1) * i15, Math.min(i16 * i15, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i16));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : DesugarCollections.unmodifiableMap(iVar.f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            case 5:
                y.h hVar2 = (y.h) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                j jVar2 = (j) obj2;
                Cursor cursor2 = (Cursor) obj;
                while (true) {
                    if (cursor2.moveToNext()) {
                        long j = cursor2.getLong(0);
                        int i17 = cursor2.getInt(7) != 0 ? i13 : 0;
                        r.h hVar3 = new r.h();
                        hVar3.f8823r = new HashMap();
                        String string = cursor2.getString(i13);
                        if (string != null) {
                            hVar3.f8816b = string;
                            hVar3.f8821p = Long.valueOf(cursor2.getLong(i12));
                            hVar3.f8822q = Long.valueOf(cursor2.getLong(3));
                            if (i17 != 0) {
                                String string2 = cursor2.getString(4);
                                hVar3.f8820o = new m(string2 == null ? y.h.f11586o : new o.c(string2), cursor2.getBlob(5));
                            } else {
                                String string3 = cursor2.getString(4);
                                o.c cVar4 = string3 == null ? y.h.f11586o : new o.c(string3);
                                Cursor cursorQuery = hVar2.b().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                                try {
                                    ArrayList arrayList2 = new ArrayList();
                                    int length = 0;
                                    while (cursorQuery.moveToNext()) {
                                        byte[] blob = cursorQuery.getBlob(0);
                                        arrayList2.add(blob);
                                        length += blob.length;
                                        break;
                                    }
                                    byte[] bArr3 = new byte[length];
                                    int i18 = 0;
                                    int length2 = 0;
                                    while (i18 < arrayList2.size()) {
                                        byte[] bArr4 = (byte[]) arrayList2.get(i18);
                                        cursor = cursorQuery;
                                        try {
                                            ArrayList arrayList3 = arrayList2;
                                            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
                                            length2 += bArr4.length;
                                            i18++;
                                            cursorQuery = cursor;
                                            arrayList2 = arrayList3;
                                        } catch (Throwable th) {
                                            th = th;
                                            cursor.close();
                                            throw th;
                                        }
                                    }
                                    cursorQuery.close();
                                    hVar3.f8820o = new m(cVar4, bArr3);
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor = cursorQuery;
                                }
                            }
                            if (!cursor2.isNull(6)) {
                                hVar3.f8818m = Integer.valueOf(cursor2.getInt(6));
                            }
                            if (!cursor2.isNull(8)) {
                                hVar3.f8819n = Integer.valueOf(cursor2.getInt(8));
                            }
                            if (!cursor2.isNull(9)) {
                                hVar3.f8817l = cursor2.getString(9);
                            }
                            if (!cursor2.isNull(10)) {
                                hVar3.f8824s = cursor2.getBlob(10);
                            }
                            if (!cursor2.isNull(11)) {
                                hVar3.f8825t = cursor2.getBlob(11);
                            }
                            arrayList.add(new y.b(j, jVar2, hVar3.b()));
                            i12 = 2;
                            i13 = 1;
                        } else {
                            com.google.gson.internal.a.i("Null transportName");
                        }
                    }
                }
                return null;
            default:
                y.h hVar4 = (y.h) obj4;
                HashMap map = (HashMap) obj3;
                s sVar = (s) obj2;
                ArrayList arrayList4 = (ArrayList) sVar.f11757m;
                Cursor cursor3 = (Cursor) obj;
                hVar4.getClass();
                while (cursor3.moveToNext()) {
                    String string4 = cursor3.getString(i14);
                    int i19 = cursor3.getInt(1);
                    u.c cVar5 = u.c.REASON_UNKNOWN;
                    if (i19 != 0) {
                        if (i19 == 1) {
                            cVar5 = u.c.MESSAGE_TOO_OLD;
                        } else if (i19 == 2) {
                            cVar = cVar3;
                            cVar2 = cVar;
                        } else if (i19 == i11) {
                            cVar5 = u.c.PAYLOAD_TOO_BIG;
                        } else if (i19 == i10) {
                            cVar5 = u.c.MAX_RETRIES_REACHED;
                        } else if (i19 == i6) {
                            cVar5 = u.c.INVALID_PAYLOD;
                        } else if (i19 == 6) {
                            cVar5 = u.c.SERVER_ERROR;
                        } else {
                            a.a.u("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i19));
                        }
                        cVar2 = cVar3;
                        cVar = cVar5;
                    } else {
                        cVar2 = cVar3;
                        cVar = cVar5;
                    }
                    long j6 = cursor3.getLong(2);
                    if (!map.containsKey(string4)) {
                        map.put(string4, new ArrayList());
                    }
                    ((List) map.get(string4)).add(new d(j6, cVar));
                    cVar3 = cVar2;
                    i6 = 5;
                    i10 = 4;
                    i11 = 3;
                    i14 = 0;
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    int i20 = e.f10386c;
                    new ArrayList();
                    arrayList4.add(new e((String) entry2.getKey(), DesugarCollections.unmodifiableList((List) entry2.getValue())));
                }
                long jF = hVar4.f11588b.f();
                SQLiteDatabase sQLiteDatabaseB = hVar4.b();
                sQLiteDatabaseB.beginTransaction();
                try {
                    Cursor cursorRawQuery = sQLiteDatabaseB.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        cursorRawQuery.moveToNext();
                        g gVar = new g(cursorRawQuery.getLong(0), jF);
                        cursorRawQuery.close();
                        sQLiteDatabaseB.setTransactionSuccessful();
                        sQLiteDatabaseB.endTransaction();
                        sVar.f11756l = gVar;
                        sVar.f11758n = new u.b(new u.f(hVar4.b().compileStatement("PRAGMA page_size").simpleQueryForLong() * hVar4.b().compileStatement("PRAGMA page_count").simpleQueryForLong(), y.a.f.f11574a));
                        sVar.f11755b = (String) hVar4.f11591n.get();
                        return new u.a((g) sVar.f11756l, DesugarCollections.unmodifiableList(arrayList4), (u.b) sVar.f11758n, (String) sVar.f11755b);
                    } catch (Throwable th3) {
                        cursorRawQuery.close();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    sQLiteDatabaseB.endTransaction();
                    throw th4;
                }
        }
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f517a) {
            case 1:
                return ListenableFutureKt.executeAsync$lambda$4((Executor) this.f518b, (String) this.f519l, (d7.a) this.f520m, completer);
            default:
                return ListenableFutureKt.launchFuture$lambda$1((t6.h) this.f518b, (b0) this.f519l, (p) this.f520m, completer);
        }
    }

    @Override // z.b
    public Object execute() {
        w.a aVar = (w.a) this.f518b;
        j jVar = (j) this.f519l;
        i iVar = (i) this.f520m;
        y.h hVar = (y.h) aVar.f10908d;
        hVar.getClass();
        o.d dVar = jVar.f8833c;
        String str = iVar.f8826a;
        String str2 = jVar.f8831a;
        String strD = a.a.D("SQLiteEventStore");
        if (Log.isLoggable(strD, 3)) {
            Log.d(strD, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) hVar.d(new a(hVar, iVar, jVar, 4))).longValue();
        aVar.f10905a.e(jVar, 1, false);
        return null;
    }

    @Override // j1.a
    public Object g(j1.p pVar) {
        j1.i iVar = (j1.i) this.f518b;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f519l;
        g5.g gVar = (g5.g) this.f520m;
        if (pVar.i()) {
            iVar.c(pVar.g());
        } else if (pVar.f() != null) {
            iVar.b(pVar.f());
        } else if (atomicBoolean.getAndSet(true)) {
            ((j1.p) ((g5.f) gVar.f5315b).f5309b).l(null);
        }
        return t1.x(null);
    }

    @Override // androidx.core.os.CancellationSignal.OnCancelListener
    public void onCancel() {
        FragmentTransitionSupport.lambda$setListenerForTransitionEnd$0((Runnable) this.f518b, (Transition) this.f520m, (Runnable) this.f519l);
    }

    @Override // j1.h
    public j1.p q(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f518b;
        String str = (String) this.f519l;
        h2 h2Var = (h2) this.f520m;
        String str2 = (String) obj;
        g5.g gVarC = FirebaseMessaging.c(firebaseMessaging.f3086b);
        n1.f fVar = firebaseMessaging.f3085a;
        fVar.a();
        String strD = "[DEFAULT]".equals(fVar.f7909b) ? "" : fVar.d();
        String strB = firebaseMessaging.h.b();
        synchronized (gVarC) {
            String strB2 = h2.b(System.currentTimeMillis(), str2, strB);
            if (strB2 != null) {
                SharedPreferences.Editor editorEdit = ((SharedPreferences) gVarC.f5315b).edit();
                editorEdit.putString(strD + "|T|" + str + "|*", strB2);
                editorEdit.commit();
            }
        }
        if (h2Var == null || !str2.equals(h2Var.f11211a)) {
            n1.f fVar2 = firebaseMessaging.f3085a;
            fVar2.a();
            if ("[DEFAULT]".equals(fVar2.f7909b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb = new StringBuilder("Invoking onNewToken for app: ");
                    fVar2.a();
                    sb.append(fVar2.f7909b);
                    Log.d("FirebaseMessaging", sb.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new y2.j(firebaseMessaging.f3086b).b(intent);
            }
        }
        return t1.x(str2);
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i) {
        this.f517a = i;
        this.f518b = obj;
        this.f519l = obj2;
        this.f520m = obj3;
    }
}
