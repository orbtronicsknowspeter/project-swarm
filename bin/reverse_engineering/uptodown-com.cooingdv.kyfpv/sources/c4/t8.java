package c4;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class t8 extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2127a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2128b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2129l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f2130m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f2131n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2132o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8(Context context, String str, int i, int i6, long j, t6.c cVar) {
        super(2, cVar);
        this.f2128b = context;
        this.f2132o = str;
        this.f2129l = i;
        this.f2130m = i6;
        this.f2131n = j;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f2127a) {
            case 0:
                return new t8((v8) this.f2132o, this.f2128b, this.f2131n, this.f2130m, cVar);
            default:
                return new t8(this.f2128b, (String) this.f2132o, this.f2129l, this.f2130m, this.f2131n, cVar);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f2127a) {
            case 0:
                return ((t8) create(a0Var, cVar)).invokeSuspend(p6.x.f8464a);
            default:
                t8 t8Var = (t8) create(a0Var, cVar);
                p6.x xVar = p6.x.f8464a;
                t8Var.invokeSuspend(xVar);
                return xVar;
        }
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objC;
        int i = this.f2127a;
        p6.x xVar = p6.x.f8464a;
        Object obj2 = this.f2132o;
        Cursor cursorQuery = null;
        switch (i) {
            case 0:
                v8 v8Var = (v8) obj2;
                int i6 = this.f2129l;
                if (i6 == 0) {
                    p6.a.e(obj);
                    this.f2129l = 1;
                    v7.e eVar = o7.m0.f8289a;
                    objC = o7.c0.C(new j0(v8Var, this.f2128b, this.f2131n, this.f2130m, (t6.c) null), v7.d.f10885a, this);
                    u6.a aVar = u6.a.f10763a;
                    if (objC == aVar) {
                        return aVar;
                    }
                } else {
                    if (i6 != 1) {
                        androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p6.a.e(obj);
                    objC = obj;
                }
                ArrayList arrayList = (ArrayList) objC;
                boolean zIsEmpty = arrayList.isEmpty();
                r7.o0 o0Var = v8Var.f2213a;
                if (zIsEmpty) {
                    o0Var.getClass();
                    o0Var.g(null, j5.q.f6707a);
                    return xVar;
                }
                j5.r rVar = new j5.r(new r8(arrayList, true));
                o0Var.getClass();
                o0Var.g(null, rVar);
                return xVar;
            default:
                p6.a.e(obj);
                j5.g gVarL = j5.g.D.l(this.f2128b);
                gVarL.b();
                String str = (String) obj2;
                int i10 = this.f2129l;
                int i11 = this.f2130m;
                long j = this.f2131n;
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("date", str);
                    contentValues.put(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, Integer.valueOf(i10));
                    contentValues.put("connection_type", Integer.valueOf(i11));
                    contentValues.put("bytes", Long.valueOf(j));
                    SQLiteDatabase sQLiteDatabase = gVarL.f6674a;
                    sQLiteDatabase.getClass();
                    if (sQLiteDatabase.insertWithOnConflict("data_usage", null, contentValues, 4) == -1) {
                        String[] strArr = {str, String.valueOf(i10), String.valueOf(i11)};
                        try {
                            SQLiteDatabase sQLiteDatabase2 = gVarL.f6674a;
                            sQLiteDatabase2.getClass();
                            cursorQuery = sQLiteDatabase2.query("data_usage", new String[]{"bytes"}, "date=? AND type=? AND connection_type=?", strArr, null, null, null);
                            if (cursorQuery.moveToFirst()) {
                                long j6 = cursorQuery.getLong(0);
                                ContentValues contentValues2 = new ContentValues();
                                contentValues2.put("bytes", Long.valueOf(j6 + j));
                                SQLiteDatabase sQLiteDatabase3 = gVarL.f6674a;
                                sQLiteDatabase3.getClass();
                                sQLiteDatabase3.update("data_usage", contentValues2, "date=? AND type=? AND connection_type=?", strArr);
                            }
                            if (!cursorQuery.isClosed()) {
                                cursorQuery.close();
                            }
                        } catch (Throwable th) {
                            if (cursorQuery != null && !cursorQuery.isClosed()) {
                                cursorQuery.close();
                            }
                            throw th;
                        }
                    }
                    break;
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                gVarL.c();
                return xVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8(v8 v8Var, Context context, long j, int i, t6.c cVar) {
        super(2, cVar);
        this.f2132o = v8Var;
        this.f2128b = context;
        this.f2131n = j;
        this.f2130m = i;
    }
}
