package c4;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.lifecycle.ViewModelKt;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class z5 extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2394b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b6 f2395l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z5(Context context, b6 b6Var, t6.c cVar, int i) {
        super(2, cVar);
        this.f2393a = i;
        this.f2394b = context;
        this.f2395l = b6Var;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f2393a) {
            case 0:
                return new z5(this.f2394b, this.f2395l, cVar, 0);
            default:
                return new z5(this.f2394b, this.f2395l, cVar, 1);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f2393a) {
            case 0:
                z5 z5Var = (z5) create(a0Var, cVar);
                p6.x xVar = p6.x.f8464a;
                z5Var.invokeSuspend(xVar);
                return xVar;
            default:
                z5 z5Var2 = (z5) create(a0Var, cVar);
                p6.x xVar2 = p6.x.f8464a;
                z5Var2.invokeSuspend(xVar2);
                return xVar2;
        }
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        Cursor cursorQuery;
        int i = this.f2393a;
        p6.x xVar = p6.x.f8464a;
        b6 b6Var = this.f2395l;
        t6.c cVar = null;
        Context context = this.f2394b;
        switch (i) {
            case 0:
                p6.a.e(obj);
                j5.g gVarL = j5.g.D.l(context);
                gVarL.b();
                SQLiteDatabase sQLiteDatabase = gVarL.f6674a;
                sQLiteDatabase.getClass();
                sQLiteDatabase.delete("notifications", null, null);
                gVarL.c();
                o7.a0 viewModelScope = ViewModelKt.getViewModelScope(b6Var);
                v7.e eVar = o7.m0.f8289a;
                o7.c0.s(viewModelScope, v7.d.f10885a, null, new z5(context, b6Var, cVar, 1), 2);
                break;
            default:
                p6.a.e(obj);
                j5.g gVarL2 = j5.g.D.l(context);
                gVarL2.b();
                ArrayList arrayList = new ArrayList();
                try {
                    SQLiteDatabase sQLiteDatabase2 = gVarL2.f6674a;
                    sQLiteDatabase2.getClass();
                    cursorQuery = sQLiteDatabase2.query("notifications", gVarL2.f6683s, null, null, null, null, "id DESC");
                } catch (Exception e10) {
                    e = e10;
                    cursorQuery = null;
                }
                try {
                    if (cursorQuery.moveToFirst()) {
                        x4.s1 s1Var = new x4.s1();
                        s1Var.a(cursorQuery);
                        arrayList.add(s1Var);
                    }
                    while (cursorQuery.moveToNext()) {
                        x4.s1 s1Var2 = new x4.s1();
                        s1Var2.a(cursorQuery);
                        arrayList.add(s1Var2);
                    }
                    cursorQuery.close();
                } catch (Exception e11) {
                    e = e11;
                    e.printStackTrace();
                    if (cursorQuery != null && !cursorQuery.isClosed()) {
                        cursorQuery.close();
                    }
                }
                gVarL2.c();
                r7.o0 o0Var = b6Var.f1420a;
                j5.r rVar = new j5.r(new y5(arrayList));
                o0Var.getClass();
                o0Var.g(null, rVar);
                break;
        }
        return xVar;
    }
}
