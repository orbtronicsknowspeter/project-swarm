package c4;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.uptodown.activities.FreeUpSpaceActivity;
import com.uptodown.activities.MyApps;
import com.uptodown.activities.Updates;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c1 extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1453b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f1454l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1455m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(String str, String str2, long j, t6.c cVar) {
        super(2, cVar);
        this.f1452a = 4;
        this.f1453b = str;
        this.f1455m = str2;
        this.f1454l = j;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f1452a) {
            case 0:
                return new c1((FreeUpSpaceActivity) this.f1455m, this.f1453b, this.f1454l, cVar, 0);
            case 1:
                return new c1((MyApps) this.f1455m, this.f1453b, this.f1454l, cVar, 1);
            case 2:
                return new c1((Updates) this.f1455m, this.f1453b, this.f1454l, cVar, 2);
            case 3:
                return new c1((Context) this.f1455m, this.f1453b, this.f1454l, cVar, 3);
            default:
                return new c1(this.f1453b, (String) this.f1455m, this.f1454l, cVar);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f1452a) {
            case 0:
                c1 c1Var = (c1) create(a0Var, cVar);
                p6.x xVar = p6.x.f8464a;
                c1Var.invokeSuspend(xVar);
                return xVar;
            case 1:
                c1 c1Var2 = (c1) create(a0Var, cVar);
                p6.x xVar2 = p6.x.f8464a;
                c1Var2.invokeSuspend(xVar2);
                return xVar2;
            case 2:
                c1 c1Var3 = (c1) create(a0Var, cVar);
                p6.x xVar3 = p6.x.f8464a;
                c1Var3.invokeSuspend(xVar3);
                return xVar3;
            case 3:
                c1 c1Var4 = (c1) create(a0Var, cVar);
                p6.x xVar4 = p6.x.f8464a;
                c1Var4.invokeSuspend(xVar4);
                return xVar4;
            default:
                c1 c1Var5 = (c1) create(a0Var, cVar);
                p6.x xVar5 = p6.x.f8464a;
                c1Var5.invokeSuspend(xVar5);
                return xVar5;
        }
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        e4.p pVar;
        int i;
        e4.x0 x0Var;
        int i6 = this.f1452a;
        Cursor cursorQuery = null;
        p6.x xVar = p6.x.f8464a;
        final long j = this.f1454l;
        Object obj2 = this.f1455m;
        String str = this.f1453b;
        switch (i6) {
            case 0:
                p6.a.e(obj);
                FreeUpSpaceActivity freeUpSpaceActivity = (FreeUpSpaceActivity) obj2;
                int iY0 = FreeUpSpaceActivity.y0(freeUpSpaceActivity, str);
                if (iY0 >= 0) {
                    e4.e eVar = freeUpSpaceActivity.Q;
                    ArrayList arrayListA = eVar != null ? eVar.a() : null;
                    arrayListA.getClass();
                    ((x4.e) arrayListA.get(iY0)).f11134w = j;
                    e4.e eVar2 = freeUpSpaceActivity.Q;
                    if (eVar2 != null) {
                        eVar2.notifyItemChanged(FreeUpSpaceActivity.y0(freeUpSpaceActivity, str));
                    }
                }
                break;
            case 1:
                p6.a.e(obj);
                MyApps myApps = (MyApps) obj2;
                int i10 = MyApps.f3329g0;
                int iQ0 = myApps.Q0(str);
                if (iQ0 >= 0 && (pVar = myApps.f3331c0) != null && (pVar.f4655d.get(iQ0) instanceof x4.e)) {
                    e4.p pVar2 = myApps.f3331c0;
                    ArrayList arrayList = pVar2 != null ? pVar2.f4655d : null;
                    arrayList.getClass();
                    Object obj3 = arrayList.get(iQ0);
                    obj3.getClass();
                    ((x4.e) obj3).f11134w = j;
                    e4.p pVar3 = myApps.f3331c0;
                    if (pVar3 != null) {
                        pVar3.notifyItemChanged(myApps.Q0(str));
                    }
                }
                break;
            case 2:
                p6.a.e(obj);
                Updates updates = (Updates) obj2;
                e4.x0 x0Var2 = updates.f3357c0;
                ArrayList arrayListA2 = x0Var2 != null ? x0Var2.a() : null;
                if (arrayListA2 == null || arrayListA2.isEmpty()) {
                    i = -1;
                } else {
                    e4.x0 x0Var3 = updates.f3357c0;
                    ArrayList arrayListA3 = x0Var3 != null ? x0Var3.a() : null;
                    arrayListA3.getClass();
                    i = 0;
                    for (Object obj4 : arrayListA3) {
                        int i11 = i + 1;
                        if (!(obj4 instanceof e4.v0) || !l7.u.m0(((e4.v0) obj4).f4709a.f11124l, str, true)) {
                            i = i11;
                        }
                    }
                    i = -1;
                }
                if (i >= 0 && (x0Var = updates.f3357c0) != null && (x0Var.a().get(i) instanceof e4.v0)) {
                    e4.x0 x0Var4 = updates.f3357c0;
                    ArrayList arrayListA4 = x0Var4 != null ? x0Var4.a() : null;
                    arrayListA4.getClass();
                    Object obj5 = arrayListA4.get(i);
                    obj5.getClass();
                    ((e4.v0) obj5).f4709a.f11134w = j;
                    e4.x0 x0Var5 = updates.f3357c0;
                    if (x0Var5 != null) {
                        x0Var5.notifyItemChanged(i);
                    }
                }
                break;
            case 3:
                p6.a.e(obj);
                j5.g gVarL = j5.g.D.l((Context) obj2);
                gVarL.b();
                str.getClass();
                ArrayList arrayList2 = new ArrayList();
                try {
                    SQLiteDatabase sQLiteDatabase = gVarL.f6674a;
                    sQLiteDatabase.getClass();
                    cursorQuery = sQLiteDatabase.query("downloads", gVarL.f6678n, "packagename=?", new String[]{str}, null, null, null);
                    while (cursorQuery.moveToNext()) {
                        x4.r rVarI0 = j5.g.i0(cursorQuery);
                        int i12 = rVarI0.f11355a;
                        if (i12 >= 0) {
                            rVarI0.F = gVarL.N(i12);
                        }
                        arrayList2.add(rVarI0);
                    }
                    cursorQuery.close();
                } catch (Exception e10) {
                    e10.printStackTrace();
                    if (cursorQuery != null && !cursorQuery.isClosed()) {
                        cursorQuery.close();
                    }
                }
                Iterator it = arrayList2.iterator();
                it.getClass();
                while (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    x4.r rVar = (x4.r) next;
                    if (rVar.f11359n != j) {
                        rVar.d();
                        gVarL.j(rVar);
                    }
                }
                gVarL.c();
                break;
            default:
                p6.a.e(obj);
                Activity activity = f4.c.f4876o;
                if (activity != null && (activity instanceof k0)) {
                    final k0 k0Var = (k0) activity;
                    k0Var.H(a4.x.k(str, "\n", (String) obj2), new d7.a() { // from class: c4.q
                        @Override // d7.a
                        public final Object invoke() {
                            k0 k0Var2 = k0Var;
                            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(k0Var2);
                            v7.e eVar3 = o7.m0.f8289a;
                            o7.c0.s(lifecycleScope, t7.n.f10349a, null, new x(k0Var2, j, null, 0), 2);
                            return p6.x.f8464a;
                        }
                    });
                }
                break;
        }
        return xVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(Context context, String str, long j, t6.c cVar, int i) {
        super(2, cVar);
        this.f1452a = i;
        this.f1455m = context;
        this.f1453b = str;
        this.f1454l = j;
    }
}
