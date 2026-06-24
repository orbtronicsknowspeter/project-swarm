package e1;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class v1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c5 f4324b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c2 f4325l;

    public /* synthetic */ v1(c2 c2Var, c5 c5Var, int i) {
        this.f4323a = i;
        this.f4324b = c5Var;
        this.f4325l = c2Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f4323a) {
            case 0:
                c2 c2Var = this.f4325l;
                c2Var.i.B();
                c2Var.i.Y(this.f4324b);
                break;
            case 1:
                c2 c2Var2 = this.f4325l;
                c2Var2.i.B();
                u4 u4Var = c2Var2.i;
                u4Var.b().g();
                u4Var.l0();
                c5 c5Var = this.f4324b;
                k0.y.g(c5Var);
                String str = c5Var.f3851a;
                k0.y.d(str);
                int i = 0;
                if (u4Var.e0().q(null, f0.A0)) {
                    u4Var.f().getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int iO = u4Var.e0().o(null, f0.f3934j0);
                    u4Var.e0();
                    long jLongValue = jCurrentTimeMillis - ((Long) f0.f3923e.a(null)).longValue();
                    while (i < iO && u4Var.I(jLongValue, null)) {
                        i++;
                    }
                } else {
                    u4Var.e0();
                    long jIntValue = ((Integer) f0.f3939l.a(null)).intValue();
                    while (i < jIntValue && u4Var.I(0L, str)) {
                        i++;
                    }
                }
                if (u4Var.e0().q(null, f0.B0)) {
                    u4Var.b().g();
                    u4Var.H();
                }
                r4 r4Var = u4Var.f4315s;
                int iJ = androidx.lifecycle.l.j(c5Var.N);
                r4Var.g();
                if (iJ == 2 && !r4.j(str)) {
                    m1 m1Var = r4Var.f4093b.f4306a;
                    u4.U(m1Var);
                    com.google.android.gms.internal.measurement.f2 f2VarS = m1Var.s(str);
                    if (f2VarS != null && f2VarS.C() && !f2VarS.D().p().isEmpty()) {
                        u4Var.a().f4347w.c(str, "[sgtm] Going background, trigger client side upload. appId");
                        u4Var.f().getClass();
                        u4Var.r(System.currentTimeMillis(), str);
                        break;
                    }
                }
                break;
            case 2:
                c2 c2Var3 = this.f4325l;
                c2Var3.i.B();
                u4 u4Var2 = c2Var3.i;
                u4Var2.b().g();
                u4Var2.l0();
                c5 c5Var2 = this.f4324b;
                k0.y.d(c5Var2.f3851a);
                u4Var2.c0(c5Var2);
                break;
            case 3:
                c2 c2Var4 = this.f4325l;
                c2Var4.i.B();
                u4 u4Var3 = c2Var4.i;
                if (u4Var3.H != null) {
                    ArrayList arrayList = new ArrayList();
                    u4Var3.I = arrayList;
                    arrayList.addAll(u4Var3.H);
                }
                m mVar = u4Var3.f4308l;
                u4.U(mVar);
                t1 t1Var = mVar.f3876a;
                c5 c5Var3 = this.f4324b;
                String str2 = c5Var3.f3851a;
                k0.y.g(str2);
                k0.y.d(str2);
                mVar.g();
                mVar.h();
                try {
                    SQLiteDatabase sQLiteDatabaseV = mVar.V();
                    String[] strArr = {str2};
                    int iDelete = sQLiteDatabaseV.delete("apps", "app_id=?", strArr) + sQLiteDatabaseV.delete("events", "app_id=?", strArr) + sQLiteDatabaseV.delete("events_snapshot", "app_id=?", strArr) + sQLiteDatabaseV.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseV.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseV.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseV.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseV.delete("queue", "app_id=?", strArr) + sQLiteDatabaseV.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseV.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseV.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseV.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseV.delete("upload_queue", "app_id=?", strArr);
                    if (t1Var.f4263m.q(null, f0.f3933i1)) {
                        iDelete += sQLiteDatabaseV.delete("no_data_mode_events", "app_id=?", strArr);
                    }
                    if (iDelete > 0) {
                        w0 w0Var = t1Var.f4265o;
                        t1.m(w0Var);
                        w0Var.f4347w.d(str2, "Reset analytics data. app, records", Integer.valueOf(iDelete));
                    }
                } catch (SQLiteException e10) {
                    w0 w0Var2 = t1Var.f4265o;
                    t1.m(w0Var2);
                    w0Var2.f4340o.d(w0.o(str2), "Error resetting analytics data. appId, error", e10);
                }
                if (c5Var3.f3858q) {
                    u4Var3.Y(c5Var3);
                }
                break;
            case 4:
                c2 c2Var5 = this.f4325l;
                c2Var5.i.B();
                u4 u4Var4 = c2Var5.i;
                u4Var4.b().g();
                u4Var4.l0();
                c5 c5Var4 = this.f4324b;
                k0.y.d(c5Var4.f3851a);
                u4Var4.m0(c5Var4);
                u4Var4.n0(c5Var4);
                break;
            case 5:
                u4 u4Var5 = this.f4325l.i;
                u4Var5.B();
                u4Var5.n0(this.f4324b);
                break;
            default:
                u4 u4Var6 = this.f4325l.i;
                u4Var6.B();
                u4Var6.m0(this.f4324b);
                break;
        }
    }
}
