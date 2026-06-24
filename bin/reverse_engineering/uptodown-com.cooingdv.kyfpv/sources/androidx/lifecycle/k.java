package androidx.lifecycle;

import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.room.TriggerBasedInvalidationTracker;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import c4.k0;
import com.uptodown.activities.MyDownloads;
import d8.n0;
import e8.o;
import e8.r;
import e8.v;
import e8.y;
import java.util.Calendar;
import l7.m;
import p6.x;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements d7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f458a;

    public /* synthetic */ k(n0 n0Var) {
        this.f458a = 12;
    }

    @Override // d7.a
    public final Object invoke() {
        int i = this.f458a;
        x xVar = x.f8464a;
        switch (i) {
            case 0:
                return CreationExtras.Empty.INSTANCE;
            case 1:
                return x.f8464a;
            case 2:
                return x.f8464a;
            case 3:
                return x.f8464a;
            case 4:
                return x.f8464a;
            case 5:
                return Boolean.valueOf(TriggerBasedInvalidationTracker.onAllowRefresh$lambda$0());
            case 6:
                return x.f8464a;
            case 7:
                return FrameworkSQLiteDatabase.getThreadSessionMethod_delegate$lambda$7();
            case 8:
                return FrameworkSQLiteDatabase.beginTransactionMethod_delegate$lambda$8();
            case 9:
                int i6 = k0.N;
                return xVar;
            case 10:
                int i10 = MyDownloads.V;
                a5.b.h();
                return xVar;
            case 11:
                return Calendar.getInstance();
            case 12:
                b8.i iVar = b8.i.f1118k;
                b8.e[] eVarArr = new b8.e[0];
                if (m.z0("kotlin.Unit")) {
                    com.google.gson.internal.a.p("Blank serial names are prohibited");
                    return null;
                }
                if (iVar.equals(b8.i.h)) {
                    com.google.gson.internal.a.p("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
                    return null;
                }
                b8.a aVar = new b8.a("kotlin.Unit");
                return new b8.f("kotlin.Unit", iVar, aVar.f1099b.size(), q6.j.m0(eVarArr), aVar);
            case 13:
                return y.f4792b;
            case 14:
                return r.f4784b;
            case 15:
                return o.f4782b;
            case 16:
                return v.f4790b;
            case 17:
                return e8.f.f4770b;
            case 19:
                if (a5.b.d()) {
                    a5.b.h();
                    break;
                }
            case 18:
                return xVar;
            case 20:
                if (a5.b.d()) {
                    a5.b.h();
                }
                return xVar;
            default:
                int i11 = z3.c.f11932q;
                return xVar;
        }
    }

    public /* synthetic */ k(int i) {
        this.f458a = i;
    }
}
